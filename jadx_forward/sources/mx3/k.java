package mx3;

/* loaded from: classes3.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f414121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f414122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i17, android.app.Activity activity) {
        super(0);
        this.f414121d = i17;
        this.f414122e = activity;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wx3.a.a(1L, "", 0L);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ringtone_channel", this.f414121d);
        intent.setClass(this.f414122e, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17230x7ab03486.class);
        android.app.Activity activity = this.f414122e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion$enterRingtoneHistoryUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion$enterRingtoneHistoryUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}
