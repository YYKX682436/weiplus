package fh4;

/* loaded from: classes3.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b f344244d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b activityC18551xd77e8c9b) {
        this.f344244d = activityC18551xd77e8c9b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f344244d.onBackPressed();
        yj0.a.h(this, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
