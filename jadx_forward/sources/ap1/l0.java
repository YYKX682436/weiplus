package ap1;

/* loaded from: classes5.dex */
public final class l0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.o0 f94230d;

    public l0(ap1.o0 o0Var) {
        this.f94230d = o0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.List list = this.f94230d.f94244e;
        if (list != null) {
            return list.size();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectedList");
        throw null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ap1.j0 holder = (ap1.j0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ap1.o0 o0Var = this.f94230d;
        java.util.List list = o0Var.f94244e;
        if (list == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectedList");
            throw null;
        }
        java.lang.String str = (java.lang.String) list.get(i17);
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.view.View view = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.ImageView");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai((android.widget.ImageView) view, str, null);
        holder.f3639x46306858.setOnClickListener(new ap1.k0(o0Var, str));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.widget.ImageView imageView = new android.widget.ImageView(parent.getContext());
        int dimension = (int) parent.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        int dimension2 = (int) parent.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(dimension, dimension);
        layoutParams.setMarginStart(dimension2);
        imageView.setLayoutParams(layoutParams);
        ap1.j0 j0Var = new ap1.j0(imageView);
        imageView.setTag(j0Var);
        return j0Var;
    }
}
