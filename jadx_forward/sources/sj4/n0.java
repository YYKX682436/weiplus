package sj4;

/* loaded from: classes8.dex */
public final class n0 extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public pj4.t1 f490409c;

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        pj4.j0 j0Var = this.f102607b;
        if (j0Var != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f436672d, "8")) {
            pj4.t1 t1Var = this.f490409c;
            java.lang.String str = t1Var != null ? t1Var.f436831d : null;
            if (!(str == null || r26.n0.N(str))) {
                android.content.Intent intent = new android.content.Intent();
                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(context));
                intent.putExtra("finder_username", str);
                ya2.e1 e1Var = ya2.e1.f542005a;
                if (!b17) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(20, 2, 32, intent);
                    if (context != null) {
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        e1Var.w(context, intent);
                    }
                } else if (context != null) {
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    e1Var.x(context, intent, 20, 2);
                }
                return true;
            }
        }
        return false;
    }

    @Override // bi4.o0
    public boolean j() {
        return false;
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        super.m(str, j0Var);
        if (j0Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f436672d, "8")) {
            return;
        }
        byte[] decode = android.util.Base64.decode(j0Var.f436675g, 0);
        pj4.t1 t1Var = new pj4.t1();
        t1Var.mo11468x92b714fd(decode);
        this.f490409c = t1Var;
    }

    @Override // bi4.o0
    public void n() {
    }

    @Override // bi4.o0
    public boolean p(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag("FinderTextStatusProfileService");
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
        }
        android.widget.ImageView imageView2 = imageView;
        imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        container.removeAllViews();
        container.addView(imageView2);
        pj4.t1 t1Var = this.f490409c;
        java.lang.String str = t1Var != null ? t1Var.f436832e : null;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f542035a;
        if (str == null) {
            str = "";
        }
        zy2.v8.c(lVar, imageView2, str, null, 4, null);
        return true;
    }
}
