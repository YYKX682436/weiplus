package bg2;

/* loaded from: classes2.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.j0 f101659d;

    public h0(bg2.j0 j0Var) {
        this.f101659d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.o1 o1Var;
        int mo1894x7e414b06;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14312x717356dc c14312x717356dc;
        bg2.j0 j0Var = this.f101659d;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = j0Var.f498674d.f498680g;
        if (!(y0Var != null && p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) || (o1Var = j0Var.f101716h) == null || (mo1894x7e414b06 = o1Var.mo1894x7e414b06() - 1) < 0 || (c14312x717356dc = j0Var.f101714f) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(mo1894x7e414b06));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c14312x717356dc, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentUIController$renderRv$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        c14312x717356dc.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c14312x717356dc, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentUIController$renderRv$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
