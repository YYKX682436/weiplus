package bg2;

/* loaded from: classes2.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d0 f102120d;

    public w(bg2.d0 d0Var) {
        this.f102120d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg2.d0 d0Var = this.f102120d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 Z6 = d0Var.Z6();
        if (Z6 != null) {
            ag2.d dVar = d0Var.f101533g;
            int mo1894x7e414b06 = (dVar != null ? dVar.mo1894x7e414b06() : 0) - 1;
            if (mo1894x7e414b06 < 0) {
                mo1894x7e414b06 = 0;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(mo1894x7e414b06));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(Z6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentListController$dealWithMsgList$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            Z6.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(Z6, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentListController$dealWithMsgList$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
