package f43;

/* loaded from: classes4.dex */
public class d implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p1737x30012e.C15867x7cd2cd13 f341073d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p1737x30012e.C15867x7cd2cd13 c15867x7cd2cd13, int i17) {
        this.f341073d = c15867x7cd2cd13;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/flow/FlowView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p1737x30012e.C15867x7cd2cd13.f220644r;
        this.f341073d.getClass();
        yj0.a.i(false, this, "com/tencent/mm/plugin/game/chatroom/view/flow/FlowView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
