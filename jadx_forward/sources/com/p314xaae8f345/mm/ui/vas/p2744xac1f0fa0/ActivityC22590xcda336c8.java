package com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/vas/launcher/VASLauncher;", "Lcom/tencent/mm/ui/MMFragmentActivity;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.vas.launcher.VASLauncher */
/* loaded from: classes14.dex */
public class ActivityC22590xcda336c8 extends com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f292678f = 0;

    /* renamed from: d, reason: collision with root package name */
    public xk5.b f292679d = new xk5.b(0, 0, 0, 0, null, false, false, null, null, null, 1023, null);

    /* renamed from: e, reason: collision with root package name */
    public boolean f292680e;

    public final com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 S6() {
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = mo7595x9cdc264().m7675x1626d96d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7675x1626d96d, "getFragments(...)");
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : m7675x1626d96d) {
            if (componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) {
                com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) componentCallbacksC1101xa17d4670;
                if (!lk5.s.c(c22584xf7d97e83.A)) {
                    return c22584xf7d97e83;
                }
            }
        }
        return null;
    }

    public final android.view.View T6() {
        try {
            return findViewById(com.p314xaae8f345.mm.R.id.hyv);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VAS.VASLauncher", th6, "find view err", new java.lang.Object[0]);
            return null;
        }
    }

    public final boolean U6() {
        android.view.View T6 = T6();
        return T6 != null && T6.getVisibility() == 0;
    }

    public final boolean V6() {
        android.view.View T6 = T6();
        boolean z17 = false;
        if (T6 != null && T6.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return W6();
    }

    public boolean W6() {
        return false;
    }

    public void X6() {
        vj5.n c17 = vj5.n.c(this);
        if (c17 != null) {
            c17.a();
        }
        if (c17 != null) {
            c17.e();
        }
    }

    public void Y6() {
    }

    public void Z6() {
    }

    public void a7() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        boolean z17;
        if (!V6()) {
            super.onBackPressed();
            return;
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 S6 = S6();
        boolean z18 = false;
        if (S6 != null) {
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = S6.f292654p;
            if (abstractActivityC22579xbed01a37 != null) {
                abstractActivityC22579xbed01a37.onBackPressed();
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                z18 = true;
            }
        }
        if (z18) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 S6 = S6();
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = S6 != null ? S6.f292654p : null;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.onConfigurationChanged(newConfig);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!V6()) {
            return super.onKeyDown(i17, event);
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 S6 = S6();
        boolean z17 = false;
        if (S6 != null) {
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = S6.f292654p;
            if (abstractActivityC22579xbed01a37 != null && abstractActivityC22579xbed01a37.onKeyDown(i17, event)) {
                z17 = true;
            }
        }
        if (z17) {
            return true;
        }
        return super.onKeyDown(i17, event);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if (intent != null) {
            intent.getFlags();
        }
        if (V6()) {
            int flags = intent != null ? intent.getFlags() : 0;
            if (!(intent != null ? intent.getBooleanExtra("KEY_IGNORE_CLEAR_TOP_IN_VAS", false) : false) && (flags & 67108864) != 0) {
                java.util.Objects.toString(intent);
                try {
                    if (U6()) {
                        while (mo7595x9cdc264().m7670x180b2948() > 0) {
                            mo7595x9cdc264().m7705x96eafb01();
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VAS.VASLauncher", th6, "handleVASOnNewIntent err", new java.lang.Object[0]);
                }
            }
        }
        super.onNewIntent(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        java.lang.String str;
        android.content.ComponentName component;
        if (!V6()) {
            super.startActivityForResult(intent, i17, bundle);
            return;
        }
        android.view.View T6 = T6();
        if (T6 == null) {
            super.startActivityForResult(intent, i17, bundle);
            return;
        }
        if (!(intent != null && lk5.s.d(intent, 2))) {
            super.startActivityForResult(intent, i17, bundle);
            return;
        }
        if (T6.getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VAS.VASLauncher", "startActivityForResult blocked, VAS container already visible");
            return;
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.f39357x18545862.b(intent, this, true);
        java.util.Iterator it = com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8.m80388x72e6bc6d(this, false, 1, null).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo14640xb30cf874(intent, i17, bundle);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(T6, arrayList.toArray(), "com/tencent/mm/ui/vas/launcher/VASLauncher", "startActivityForResult", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        T6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(T6, "com/tencent/mm/ui/vas/launcher/VASLauncher", "startActivityForResult", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        T6.setOnClickListener(qk5.b.f445984d);
        if (intent == null || (component = intent.getComponent()) == null || (str = component.getClassName()) == null) {
            str = "";
        }
        java.lang.Class<?> cls = java.lang.Class.forName(str);
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 a17 = lk5.q0.a(cls, intent, false, true, true, null, 32, null);
        android.content.Intent intent2 = a17.A;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent2, "<this>");
        java.lang.Object a18 = ok5.d.a(intent2, "KEY_VAS_START_ENTER_ANIM");
        sk5.j jVar = a18 instanceof sk5.j ? (sk5.j) a18 : null;
        if (jVar != null) {
            a17.B = jVar;
        }
        a17.m7582xf54bcc03(null, i17);
        android.view.Window window = getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
        this.f292679d = xk5.c.b(window, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VAS.VASLauncher", "startActivityForResult lastWindowStyle:" + this.f292679d);
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        m7630xb2c12e75.l(com.p314xaae8f345.mm.R.C30854x2dc211.f559452f7, com.p314xaae8f345.mm.R.C30854x2dc211.f559453f8, com.p314xaae8f345.mm.R.C30854x2dc211.f559454f9, com.p314xaae8f345.mm.R.C30854x2dc211.f_);
        m7630xb2c12e75.h(com.p314xaae8f345.mm.R.id.hys, a17, null, 1);
        m7630xb2c12e75.c(cls.getName());
        m7630xb2c12e75.f92892p = true;
        m7630xb2c12e75.e();
        al5.a3.d(this);
        new java.lang.ref.WeakReference(a17);
        rk5.b bVar = rk5.b.f478674d;
        bVar.D5(this, intent);
        bVar.H(this);
        Z6();
        this.f292680e = true;
    }
}
