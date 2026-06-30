package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f145760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f145761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10351x9a4a4f60 f145762f;

    public i8(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10351x9a4a4f60 activityC10351x9a4a4f60, boolean z17, int i17) {
        this.f145762f = activityC10351x9a4a4f60;
        this.f145760d = z17;
        this.f145761e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10351x9a4a4f60 activityC10351x9a4a4f60 = this.f145762f;
        android.content.Intent intent = new android.content.Intent(activityC10351x9a4a4f60, (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10361xc5a22f5.class);
        intent.setFlags(603979776);
        intent.putExtra("room_name", activityC10351x9a4a4f60.f145372d);
        intent.putExtra("upgrade_success", this.f145760d);
        intent.putExtra("left_quota", this.f145761e);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10351x9a4a4f60 activityC10351x9a4a4f602 = this.f145762f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC10351x9a4a4f602, arrayList.toArray(), "com/tencent/mm/chatroom/ui/RoomAlphaProcessUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC10351x9a4a4f602.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC10351x9a4a4f602, "com/tencent/mm/chatroom/ui/RoomAlphaProcessUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
