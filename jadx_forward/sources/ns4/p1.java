package ns4;

/* loaded from: classes.dex */
public final class p1 implements js4.h {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f421149a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f421150b;

    /* renamed from: c, reason: collision with root package name */
    public js4.g f421151c;

    public p1(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 2, 0, true, z17);
        this.f421149a = z2Var;
        z2Var.y(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9_));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = this.f421149a;
        if (z2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
            throw null;
        }
        z2Var2.F = new ns4.n1(this);
        z2Var2.l(new ns4.o1(this));
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bpq, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f421150b = inflate;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.pku);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.View view = this.f421150b;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.pjx);
        android.view.View view2 = this.f421150b;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.pkv);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        java.lang.String r17 = c01.z1.r();
        java.lang.String l17 = c01.z1.l();
        l17 = l17.length() == 0 ? c01.z1.b() : l17;
        l17 = l17 == null || l17.length() == 0 ? r17 : l17;
        if (!(r17 == null || r17.length() == 0) && gm0.j1.a()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, r17, null);
        }
        textView2.setText(l17);
        if (z17) {
            android.view.View view3 = this.f421150b;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
                throw null;
            }
            view3.findViewById(com.p314xaae8f345.mm.R.id.pkt).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ci9);
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var3 = this.f421149a;
        if (z2Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
            throw null;
        }
        android.view.View view4 = this.f421150b;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        z2Var3.j(view4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var4 = this.f421149a;
        if (z2Var4 != null) {
            z2Var4.C();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
            throw null;
        }
    }
}
