package lx4;

/* loaded from: classes8.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f403657d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f403658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19353x4337a0ac f403659f;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19353x4337a0ac c19353x4337a0ac, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f403659f = c19353x4337a0ac;
        this.f403657d = context;
        this.f403658e = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f403658e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        lx4.g viewHolder = (lx4.g) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        hx4.x xVar = (hx4.x) kz5.n0.a0(this.f403658e, i17);
        if (xVar == null) {
            return;
        }
        if (xVar.f367235c == null) {
            new hx4.w(this.f403657d, xVar.f367236d, new lx4.c(xVar, this, i17)).execute(xVar.f367234b);
        }
        android.graphics.drawable.Drawable drawable = xVar.f367235c;
        android.widget.ImageView imageView = viewHolder.f403664e;
        imageView.setImageDrawable(drawable);
        imageView.setOnClickListener(new lx4.d(xVar, this.f403659f, i17));
        viewHolder.f403665f.setText(xVar.f367236d);
        viewHolder.f403663d.setContentDescription(xVar.f367236d);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f403657d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bnu, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new lx4.g(inflate);
    }
}
