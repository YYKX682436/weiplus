package eu0;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final eu0.l f338250a = new eu0.l();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.app.s2 f338251b;

    public final void a() {
        android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
        android.content.Intent intent = new android.content.Intent(ll6, (java.lang.Class<?>) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e.class);
        if (ll6 instanceof android.app.Activity) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "openPreviewPage: context is an activity, no need to add FLAG_ACTIVITY_NEW_TASK");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "openPreviewPage: context is not an activity, adding FLAG_ACTIVITY_NEW_TASK");
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(ll6, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/composing_creation/ComposingCreationLiteAppStore", "openPreviewPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ll6.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(ll6, "com/tencent/mm/mj_publisher/finder/composing_creation/ComposingCreationLiteAppStore", "openPreviewPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
