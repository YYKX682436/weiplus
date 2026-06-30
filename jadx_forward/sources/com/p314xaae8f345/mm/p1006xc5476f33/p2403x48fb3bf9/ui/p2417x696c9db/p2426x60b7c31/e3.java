package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f266601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f266602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f266604h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266605i;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, int i17, double d17, double d18, java.lang.String str, int i18) {
        this.f266605i = c1Var;
        this.f266600d = i17;
        this.f266601e = d17;
        this.f266602f = d18;
        this.f266603g = str;
        this.f266604h = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.g8 c76;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var;
        nw4.y2 y2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266605i;
        android.content.Context context = c1Var.f266508d;
        int i17 = this.f266604h;
        if (context != null && (context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
            android.content.Context context2 = c1Var.f266508d;
            double d17 = this.f266601e;
            double d18 = this.f266602f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d3 d3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d3(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.u8 u8Var = c1Var.D;
            u8Var.getClass();
            if (context2 != null && (context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) && !((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).isFinishing()) {
                u8Var.f266976d = i17;
                z17 = true;
                u8Var.f266977e = true;
                u8Var.f266978f = this.f266600d;
                u8Var.f266979g = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q8(d17, d18, null);
                u8Var.f266980h = this.f266603g;
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context2);
                u8Var.f266981i = weakReference;
                u8Var.f266982m = d3Var;
                android.content.Context context3 = (android.content.Context) weakReference.get();
                if (context3 != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClassName(context3, "com.tencent.mm.pluginsdk.ui.tools.AppChooserUI");
                    java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(5);
                    arrayList.add(jt.w.TencentMap.h());
                    arrayList.add(jt.w.GoogleMap.h());
                    arrayList.add(jt.w.SogouMap.h());
                    arrayList.add(jt.w.BaiduMap.h());
                    arrayList.add(jt.w.AutonaviMap.h());
                    intent.putStringArrayListExtra("targetwhitelist", arrayList);
                    android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(java.lang.String.format("geo:%f,%f", java.lang.Double.valueOf(u8Var.f266979g.f266901a), java.lang.Double.valueOf(u8Var.f266979g.f266902b))));
                    intent.putExtra("targetintent", intent2);
                    android.os.Bundle bundle = new android.os.Bundle(2);
                    bundle.putInt("key_map_app", u8Var.f266978f);
                    bundle.putParcelable("key_target_intent", intent2);
                    intent.putExtra("key_recommend_params", bundle);
                    intent.putExtra("type", 2);
                    intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575223lb0));
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context3).m78546x70d84175((com.p314xaae8f345.mm.ui.da) u8Var, intent, 33);
                }
                if (!z17 || (z0Var = (c76 = c1Var.c7(i17)).f266674b) == null || (y2Var = c76.f266673a) == null) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.L3(this.f266605i, z0Var, y2Var, "openMapNavigateMenu:fail", null, true, true);
                return;
            }
        }
        z17 = false;
        if (z17) {
        }
    }
}
