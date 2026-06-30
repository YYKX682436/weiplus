package fk2;

/* loaded from: classes3.dex */
public final class e1 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final android.text.style.ForegroundColorSpan f344897m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(we2.a commentItemDependency) {
        super(commentItemDependency);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
        this.f344897m = new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta));
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var;
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
        java.lang.String obj = c61.yb.nf(ybVar, context, m84162x74f59ea8, k17 == null ? "" : k17, 0, 8, null).toString();
        i95.m c18 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        c61.yb ybVar2 = (c61.yb) c18;
        android.text.TextPaint m84162x74f59ea82 = c22624x85d69039.m84162x74f59ea8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m84162x74f59ea82, "getPaint(...)");
        java.lang.String y17 = msg.y();
        java.lang.String obj2 = c61.yb.nf(ybVar2, context, m84162x74f59ea82, y17 == null ? "" : y17, 0, 8, null).toString();
        dk2.a8 a8Var = msg instanceof dk2.a8 ? (dk2.a8) msg : null;
        java.lang.Object D = a8Var != null ? a8Var.D() : null;
        r45.ej1 ej1Var = D instanceof r45.ej1 ? (r45.ej1) D : null;
        if (ej1Var != null) {
            int m75939xb282bd08 = ej1Var.m75939xb282bd08(3);
            android.text.style.ForegroundColorSpan foregroundColorSpan = this.f526778f;
            if (m75939xb282bd08 == 0) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str = obj + ' ' + ej1Var.m75945x2fec8307(1);
                ((ke0.e) xVar).getClass();
                f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
                f0Var.b(foregroundColorSpan, obj, 0, 33);
            } else if (m75939xb282bd08 != 1) {
                f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0();
            } else {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str2 = obj + ' ' + ej1Var.m75945x2fec8307(1) + ' ' + obj2;
                ((ke0.e) xVar2).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var2 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
                f0Var2.b(foregroundColorSpan, obj, 0, 33);
                int length = obj.length();
                java.lang.String m75945x2fec8307 = ej1Var.m75945x2fec8307(1);
                f0Var2.b(this.f344897m, obj2, length + (m75945x2fec8307 != null ? m75945x2fec8307.length() : 0) + 2, 33);
                f0Var = f0Var2;
            }
            c22624x85d69039.b(f0Var);
        }
        android.view.ViewParent parent = c22624x85d69039.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
        relativeLayout.setPadding(((java.lang.Number) ((jz5.n) we2.o.f526770j).mo141623x754a37bb()).intValue(), relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new dk2.a8(msg);
    }

    @Override // we2.o
    public int n() {
        return 20125;
    }
}
