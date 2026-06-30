package bg2;

/* loaded from: classes2.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d0 f20587d;

    public w(bg2.d0 d0Var) {
        this.f20587d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg2.d0 d0Var = this.f20587d;
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView Z6 = d0Var.Z6();
        if (Z6 != null) {
            ag2.d dVar = d0Var.f20000g;
            int itemCount = (dVar != null ? dVar.getItemCount() : 0) - 1;
            if (itemCount < 0) {
                itemCount = 0;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(itemCount));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(Z6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentListController$dealWithMsgList$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            Z6.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(Z6, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentListController$dealWithMsgList$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
