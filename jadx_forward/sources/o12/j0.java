package o12;

/* loaded from: classes10.dex */
public final class j0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13261x57992c3a f423692d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13261x57992c3a c13261x57992c3a) {
        this.f423692d = c13261x57992c3a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f423692d.F.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        o12.i0 holder = (o12.i0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13261x57992c3a c13261x57992c3a = this.f423692d;
        o12.h0 h0Var = (o12.h0) c13261x57992c3a.F.get(i17);
        if (h0Var.f423688b == null) {
            o12.f0 callback = c13261x57992c3a.getCallback();
            long j17 = h0Var.f423687a;
            if (callback != null) {
                java.util.List c17 = kz5.b0.c(java.lang.Long.valueOf(j17));
                p12.w wVar = ((p12.v) callback).f432586a;
                rm5.k kVar = wVar.f432587g;
                if (kVar != null) {
                    ((rm5.h) kVar).a(c17, new p12.u(wVar));
                }
            }
            c13261x57992c3a.G.add(java.lang.Long.valueOf(j17));
        }
        holder.f423690d.setImageBitmap(h0Var.f423688b);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.widget.ImageView imageView = new android.widget.ImageView(parent.getContext());
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13261x57992c3a c13261x57992c3a = this.f423692d;
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(c13261x57992c3a.getThumbSize(), c13261x57992c3a.getThumbSize()));
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        return new o12.i0(imageView);
    }
}
