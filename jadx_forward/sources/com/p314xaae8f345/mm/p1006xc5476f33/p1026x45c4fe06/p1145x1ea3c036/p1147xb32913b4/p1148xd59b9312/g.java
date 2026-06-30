package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312;

/* loaded from: classes7.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f167117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f167118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f167119f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        super(0);
        this.f167117d = context;
        this.f167118e = c11809xbc286be4;
        this.f167119f = c12559xbdae8559;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t7.a() || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t7.g();
        android.content.Context context = this.f167117d;
        android.content.Intent intent = new android.content.Intent();
        java.lang.Class cls = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12655x58b8b887.class : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d.class;
        android.content.Context context2 = this.f167117d;
        intent.setClass(context2, cls);
        boolean z18 = context2 instanceof android.app.Activity;
        if (!z18) {
            intent.addFlags(268435456);
        }
        intent.putExtra("key_launch_app_client_version", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h);
        intent.putExtra("key_appbrand_init_config", this.f167118e);
        intent.putExtra("key_appbrand_stat_object", this.f167119f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalLaunchInterceptor$shouldInterceptLaunch$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalLaunchInterceptor$shouldInterceptLaunch$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        android.app.Activity activity = z18 ? (android.app.Activity) context2 : null;
        if (activity != null) {
            activity.overridePendingTransition(0, 0);
        }
        return jz5.f0.f384359a;
    }
}
