package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f272573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f272574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f272575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272576g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, android.content.Intent intent, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.a0 a0Var, android.content.Context context, java.lang.String str) {
        super(0);
        this.f272573d = f4Var;
        this.f272574e = intent;
        this.f272575f = context;
        this.f272576g = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        this.f272573d.dismiss();
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        android.content.Intent intent = this.f272574e;
        if (intent != null) {
            java.lang.String str = this.f272576g;
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            android.content.Context context = this.f272575f;
            intent.putExtra("android.intent.extra.STREAM", com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.a(context, r6Var));
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obd));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/otherway/OpenByOtherAppHelper$getAppList$1$1$1$onClick$1$onFinish$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/otherway/OpenByOtherAppHelper$getAppList$1$1$1$onClick$1$onFinish$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenByOtherAppHelper", "launch chooser but intent is null");
        }
        return f0Var2;
    }
}
