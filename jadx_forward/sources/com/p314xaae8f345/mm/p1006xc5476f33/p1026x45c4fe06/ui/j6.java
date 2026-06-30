package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class j6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93 f171337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93 activityC12657x2ef82e93, java.lang.String str) {
        super(0);
        this.f171337d = activityC12657x2ef82e93;
        this.f171338e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93 activityC12657x2ef82e93 = this.f171337d;
        if (!activityC12657x2ef82e93.isDestroyed() && !activityC12657x2ef82e93.isFinishing()) {
            xg1.j b17 = xg1.h.f535903a.b(activityC12657x2ef82e93.f170917n);
            android.content.Intent intent = b17 != null ? b17.f535909b : null;
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "attach[" + this.f171338e + "]: onProgressLoadSuccess and get a null intent");
            } else {
                android.content.ComponentName component = intent.getComponent();
                java.lang.String className = component != null ? component.getClassName() : null;
                if (className == null) {
                    className = "null";
                }
                activityC12657x2ef82e93.f170925v = className;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProgressLoadSuccess targetUiName:");
                sb6.append(activityC12657x2ef82e93.f170925v);
                sb6.append(", isForeground:");
                b06.d dVar = activityC12657x2ef82e93.f170916m;
                f06.v[] vVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93.A;
                sb6.append(((java.lang.Boolean) ((b06.b) dVar).b(activityC12657x2ef82e93, vVarArr[0])).booleanValue());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingUI", sb6.toString());
                if (((java.lang.Boolean) ((b06.b) dVar).b(activityC12657x2ef82e93, vVarArr[0])).booleanValue()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93 activityC12657x2ef82e932 = this.f171337d;
                    java.lang.Object clone = intent.clone();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(clone, "null cannot be cast to non-null type android.content.Intent");
                    android.content.Intent intent2 = (android.content.Intent) clone;
                    intent2.setFlags(intent2.getFlags() & (-268435457));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent2);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activityC12657x2ef82e932, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$attach$4", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC12657x2ef82e932.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activityC12657x2ef82e932, "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$attach$4", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    activityC12657x2ef82e93.f170918o = intent;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
