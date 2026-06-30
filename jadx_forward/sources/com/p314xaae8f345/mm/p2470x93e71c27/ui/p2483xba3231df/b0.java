package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class b0 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f272459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f272461c;

    public b0(int i17, java.lang.String str, android.content.Intent intent) {
        this.f272459a = i17;
        this.f272460b = str;
        this.f272461c = intent;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.n0
    public void a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        jz5.f0 f0Var = null;
        java.lang.String str = null;
        if (!kz5.c0.i(3, 4, 2, 1).contains(java.lang.Integer.valueOf(this.f272459a))) {
            android.content.Intent intent = this.f272461c;
            if (intent != null) {
                android.content.Intent createChooser = android.content.Intent.createChooser(intent, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obd));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(createChooser);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/otherway/OpenByOtherAppHelper$getAppList$1$1$1", "onClick", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/otherway/OpenByOtherAppHelper$getAppList$1$1$1", "onClick", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenByOtherAppHelper", "launch chooser but intent is null");
                return;
            }
            return;
        }
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293313g = 2;
        e4Var.f293311e = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 c17 = e4Var.c();
        int i18 = this.f272459a;
        if (i18 == 1) {
            str = "jpg";
        } else if (i18 == 2) {
            str = "mp4";
        }
        zb0.f0 f0Var2 = (zb0.f0) i95.n0.c(zb0.f0.class);
        java.lang.String str2 = this.f272460b;
        ac0.a aVar = new ac0.a(str2, str);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.a0 a0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.a0(c17, this.f272461c, context);
        yb0.f0 f0Var3 = (yb0.f0) f0Var2;
        f0Var3.getClass();
        if (!(str2 == null || str2.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            ((ku5.t0) ku5.t0.f394148d).g(new yb0.e0(aVar, f0Var3, a0Var));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f0Var3.f542162d, "getShareFilePath invalid params: " + str2);
        a0Var.a(-1, "");
    }
}
