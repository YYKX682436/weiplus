package bg2;

/* loaded from: classes2.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.j0 f20126d;

    public h0(bg2.j0 j0Var) {
        this.f20126d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.o1 o1Var;
        int itemCount;
        com.tencent.mm.plugin.finder.live.view.FinderLiveFeedExptCommentRecyclerView finderLiveFeedExptCommentRecyclerView;
        bg2.j0 j0Var = this.f20126d;
        kotlinx.coroutines.y0 y0Var = j0Var.f417141d.f417147g;
        if (!(y0Var != null && kotlinx.coroutines.z0.h(y0Var)) || (o1Var = j0Var.f20183h) == null || (itemCount = o1Var.getItemCount() - 1) < 0 || (finderLiveFeedExptCommentRecyclerView = j0Var.f20181f) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(itemCount));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(finderLiveFeedExptCommentRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentUIController$renderRv$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        finderLiveFeedExptCommentRecyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(finderLiveFeedExptCommentRecyclerView, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentUIController$renderRv$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
