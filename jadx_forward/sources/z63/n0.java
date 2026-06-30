package z63;

/* loaded from: classes5.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab f551966d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab) {
        this.f551966d = activityC16081x2d23fdab;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab.U;
        com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab = this.f551966d;
        activityC16081x2d23fdab.d7();
        android.view.View view2 = activityC16081x2d23fdab.f223766v;
        if ((view2 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) && (view2.getParent() instanceof android.widget.RelativeLayout)) {
            ((android.widget.RelativeLayout) activityC16081x2d23fdab.f223766v.getParent()).setTag(1);
        }
        z63.g gVar = new z63.g(activityC16081x2d23fdab);
        gVar.f551944g = new z63.m0(this, gVar);
        activityC16081x2d23fdab.R = gVar;
        gVar.a();
        activityC16081x2d23fdab.Y6(4);
        yj0.a.h(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireEditUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
