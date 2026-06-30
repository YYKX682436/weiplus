package mx3;

/* loaded from: classes5.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f414123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f414124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414125f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vx3.i f414126g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f414127h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f414128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17, int i18, java.lang.String str, vx3.i iVar, android.app.Activity activity, boolean z17) {
        super(0);
        this.f414123d = i17;
        this.f414124e = i18;
        this.f414125f = str;
        this.f414126g = iVar;
        this.f414127h = activity;
        this.f414128i = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ringtone_caller", this.f414123d);
        intent.putExtra("ringtone_channel", this.f414124e);
        intent.putExtra("exclusvie_name", this.f414125f);
        vx3.i iVar = this.f414126g;
        intent.putExtra("ringtone_select_ringtone", iVar != null ? iVar.n() : null);
        intent.setClass(this.f414127h, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17235xecd31272.class);
        if (this.f414128i) {
            intent.addFlags(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432);
            android.app.Activity activity = this.f414127h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion$enterRingtoneSelectUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion$enterRingtoneSelectUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.app.Activity activity2 = this.f414127h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(5);
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.k(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion$enterRingtoneSelectUI$1", "invoke", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        return jz5.f0.f384359a;
    }
}
