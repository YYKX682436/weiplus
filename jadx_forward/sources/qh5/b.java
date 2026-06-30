package qh5;

/* loaded from: classes15.dex */
public class b implements p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2715xbf8d97c1.p2716xe821e364.C22444xef10c0ac f444984d;

    public b(com.p314xaae8f345.mm.ui.p2715xbf8d97c1.p2716xe821e364.C22444xef10c0ac c22444xef10c0ac) {
        this.f444984d = c22444xef10c0ac;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/matrix/recyclerview/JsonRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/matrix/recyclerview/JsonRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction() & motionEvent.getActionMasked();
        com.p314xaae8f345.mm.ui.p2715xbf8d97c1.p2716xe821e364.C22444xef10c0ac c22444xef10c0ac = this.f444984d;
        if (action == 0) {
            c22444xef10c0ac.f290649b2 = 1;
        } else if (action == 1) {
            c22444xef10c0ac.f290649b2 = 0;
        } else if (action != 2) {
            if (action == 5) {
                c22444xef10c0ac.f290650c2 = com.p314xaae8f345.mm.ui.p2715xbf8d97c1.p2716xe821e364.C22444xef10c0ac.g1(c22444xef10c0ac, motionEvent);
                c22444xef10c0ac.f290649b2++;
            } else if (action == 6) {
                c22444xef10c0ac.f290649b2--;
            }
        } else if (c22444xef10c0ac.f290649b2 >= 2) {
            float g17 = com.p314xaae8f345.mm.ui.p2715xbf8d97c1.p2716xe821e364.C22444xef10c0ac.g1(c22444xef10c0ac, motionEvent);
            if (java.lang.Math.abs(g17 - c22444xef10c0ac.f290650c2) > 0.5f) {
                c22444xef10c0ac.m80782x3abfd950(qh5.a.f444983d * (g17 / c22444xef10c0ac.f290650c2));
                c22444xef10c0ac.f290650c2 = g17;
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public void c(boolean z17) {
    }
}
