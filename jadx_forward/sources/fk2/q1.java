package fk2;

/* loaded from: classes3.dex */
public final class q1 extends we2.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(we2.a commentItemDependency) {
        super(commentItemDependency);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.d(context, holder, msg, i17);
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = holder.f103460e;
        android.text.TextPaint m84162x74f59ea8 = c22624x85d69039.m84162x74f59ea8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m84162x74f59ea8, "getPaint(...)");
        java.lang.String k17 = msg.k();
        if (k17 == null) {
            k17 = "";
        }
        java.lang.String obj = c61.yb.nf(ybVar, context, m84162x74f59ea8, k17, 0, 8, null).toString();
        dk2.a8 a8Var = msg instanceof dk2.a8 ? (dk2.a8) msg : null;
        java.lang.Object D = a8Var != null ? a8Var.D() : null;
        r45.yi1 yi1Var = D instanceof r45.yi1 ? (r45.yi1) D : null;
        if (yi1Var != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = obj + ' ' + yi1Var.m75945x2fec8307(1);
            ((ke0.e) xVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
            f0Var.b(this.f526778f, obj, 0, 33);
            c22624x85d69039.b(f0Var);
            android.view.ViewParent parent = c22624x85d69039.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
            relativeLayout.setPadding(((java.lang.Number) ((jz5.n) we2.o.f526770j).mo141623x754a37bb()).intValue(), relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
        }
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new dk2.a8(msg);
    }

    @Override // we2.o
    public int n() {
        return 20122;
    }
}
