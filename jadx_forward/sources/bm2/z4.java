package bm2;

/* loaded from: classes.dex */
public final class z4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.b5 f104014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f104015e;

    public z4(bm2.b5 b5Var, java.util.LinkedList linkedList) {
        this.f104014d = b5Var;
        this.f104015e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.b5 b5Var = this.f104014d;
        int size = ((java.util.ArrayList) b5Var.f103330h.f213021d).size();
        if (size > 1) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 1; i17 < size; i17++) {
                java.lang.Object obj = ((java.util.ArrayList) b5Var.f103330h.f213021d).get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                for (android.view.View view : (java.lang.Iterable) obj) {
                    b5Var.f103330h.removeView(view);
                    linkedList.add(view);
                }
            }
            b5Var.f103330h.setOnClickListener(new bm2.y4(b5Var, this.f104015e, linkedList));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15351x41e69e8c c15351x41e69e8c = b5Var.f103330h;
            ((android.widget.TextView) c15351x41e69e8c.getChildAt(c15351x41e69e8c.getChildCount() - 1).findViewById(com.p314xaae8f345.mm.R.id.fkg)).setText("...");
        }
    }
}
