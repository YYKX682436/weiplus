package bm2;

/* loaded from: classes.dex */
public final class z4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.b5 f22481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f22482e;

    public z4(bm2.b5 b5Var, java.util.LinkedList linkedList) {
        this.f22481d = b5Var;
        this.f22482e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.b5 b5Var = this.f22481d;
        int size = ((java.util.ArrayList) b5Var.f21797h.f131488d).size();
        if (size > 1) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 1; i17 < size; i17++) {
                java.lang.Object obj = ((java.util.ArrayList) b5Var.f21797h.f131488d).get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                for (android.view.View view : (java.lang.Iterable) obj) {
                    b5Var.f21797h.removeView(view);
                    linkedList.add(view);
                }
            }
            b5Var.f21797h.setOnClickListener(new bm2.y4(b5Var, this.f22482e, linkedList));
            com.tencent.mm.plugin.finder.view.FinderTagFlowLayout finderTagFlowLayout = b5Var.f21797h;
            ((android.widget.TextView) finderTagFlowLayout.getChildAt(finderTagFlowLayout.getChildCount() - 1).findViewById(com.tencent.mm.R.id.fkg)).setText("...");
        }
    }
}
