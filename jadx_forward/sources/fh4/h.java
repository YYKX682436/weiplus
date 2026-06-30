package fh4;

/* loaded from: classes3.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 f344230d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b activityC18551xd77e8c9b, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var) {
        this.f344230d = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f344230d.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
