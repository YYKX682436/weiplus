package p012xc85e97e9.p016x746ad0e3.app;

/* renamed from: androidx.appcompat.app.AppCompatActivity */
/* loaded from: classes14.dex */
public class ActivityC0065xcd7aa112 extends p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f implements p012xc85e97e9.p016x746ad0e3.app.n, z2.a2 {

    /* renamed from: mDelegate */
    private p012xc85e97e9.p016x746ad0e3.app.o f91x55d38512;

    /* renamed from: mResources */
    private android.content.res.Resources f92x4840838;

    /* renamed from: mThemeId */
    private int f93x4da5e397 = 0;

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = (p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb();
        g0Var.p();
        ((android.view.ViewGroup) g0Var.f90659x.findViewById(android.R.id.content)).addView(view, layoutParams);
        g0Var.f90644f.onContentChanged();
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (getWindow().hasFeature(0)) {
            if (mo2533x106ab264 == null || !mo2533x106ab264.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (keyCode == 82 && mo2533x106ab264 != null && mo2533x106ab264.u(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public android.view.View findViewById(int i17) {
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = (p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb();
        g0Var.p();
        return g0Var.f90643e.findViewById(i17);
    }

    /* renamed from: getDelegate */
    public p012xc85e97e9.p016x746ad0e3.app.o m2531xacb01afb() {
        if (this.f91x55d38512 == null) {
            this.f91x55d38512 = new p012xc85e97e9.p016x746ad0e3.app.g0(this, getWindow(), this);
        }
        return this.f91x55d38512;
    }

    /* renamed from: getDrawerToggleDelegate */
    public p012xc85e97e9.p016x746ad0e3.app.c m2532x620f0c0() {
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = (p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb();
        g0Var.getClass();
        return new p012xc85e97e9.p016x746ad0e3.app.v(g0Var);
    }

    @Override // android.app.Activity
    public android.view.MenuInflater getMenuInflater() {
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = (p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb();
        if (g0Var.f90648m == null) {
            g0Var.s();
            p012xc85e97e9.p016x746ad0e3.app.b bVar = g0Var.f90647i;
            g0Var.f90648m = new n.j(bVar != null ? bVar.m() : g0Var.f90642d);
        }
        return g0Var.f90648m;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        android.content.res.Resources resources = this.f92x4840838;
        if (resources == null) {
            int i17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f3.f91118a;
        }
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: getSupportActionBar */
    public p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264() {
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = (p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb();
        g0Var.s();
        return g0Var.f90647i;
    }

    @Override // z2.a2
    /* renamed from: getSupportParentActivityIntent */
    public android.content.Intent mo2534x7099db0e() {
        return z2.c0.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m2531xacb01afb().c();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = (p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb();
        if (g0Var.C && g0Var.f90658w) {
            g0Var.s();
            p012xc85e97e9.p016x746ad0e3.app.b bVar = g0Var.f90647i;
            if (bVar != null) {
                bVar.r(configuration);
            }
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0 f17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.f();
        android.content.Context context = g0Var.f90642d;
        synchronized (f17) {
            x.f fVar = (x.f) f17.f91132c.get(context);
            if (fVar != null) {
                fVar.m174730x5a5b64d();
            }
        }
        g0Var.a();
        if (this.f92x4840838 != null) {
            this.f92x4840838.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m2539xf6b650b();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.o m2531xacb01afb = m2531xacb01afb();
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = (p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(g0Var.f90642d);
        if (from.getFactory() == null) {
            from.setFactory2(g0Var);
        } else {
            boolean z17 = from.getFactory2() instanceof p012xc85e97e9.p016x746ad0e3.app.g0;
        }
        m2531xacb01afb.e(bundle);
        if (m2531xacb01afb.a() && this.f93x4da5e397 != 0) {
            onApplyThemeResource(getTheme(), this.f93x4da5e397, false);
        }
        super.onCreate(bundle);
    }

    /* renamed from: onCreateSupportNavigateUpTaskStack */
    public void m2535x50ed6943(z2.b2 b2Var) {
        b2Var.getClass();
        android.content.Intent mo2534x7099db0e = mo2534x7099db0e();
        if (mo2534x7099db0e == null) {
            mo2534x7099db0e = z2.c0.a(this);
        }
        if (mo2534x7099db0e != null) {
            android.content.ComponentName component = mo2534x7099db0e.getComponent();
            android.content.Context context = b2Var.f550954e;
            if (component == null) {
                component = mo2534x7099db0e.resolveActivity(context.getPackageManager());
            }
            java.util.ArrayList arrayList = b2Var.f550953d;
            int size = arrayList.size();
            try {
                for (android.content.Intent b17 = z2.c0.b(context, component); b17 != null; b17 = z2.c0.b(context, b17.getComponent())) {
                    arrayList.add(size, b17);
                }
                arrayList.add(mo2534x7099db0e);
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                throw new java.lang.IllegalArgumentException(e17);
            }
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        android.content.BroadcastReceiver broadcastReceiver;
        super.onDestroy();
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = (p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb();
        if (g0Var.Q) {
            g0Var.f90643e.getDecorView().removeCallbacks(g0Var.S);
        }
        g0Var.L = true;
        p012xc85e97e9.p016x746ad0e3.app.b bVar = g0Var.f90647i;
        if (bVar != null) {
            bVar.s();
        }
        p012xc85e97e9.p016x746ad0e3.app.b0 b0Var = g0Var.P;
        if (b0Var == null || (broadcastReceiver = b0Var.f90612c) == null) {
            return;
        }
        b0Var.f90614e.f90642d.unregisterReceiver(broadcastReceiver);
        b0Var.f90612c = null;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        android.view.Window window;
        if ((android.os.Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || android.view.KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || android.view.KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i17, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i17, menuItem)) {
            return true;
        }
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (menuItem.getItemId() != 16908332 || mo2533x106ab264 == null || (mo2533x106ab264.k() & 4) == 0) {
            return false;
        }
        return m2540x38b7e8fc();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i17, android.view.Menu menu) {
        return super.onMenuOpened(i17, menu);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i17, android.view.Menu menu) {
        super.onPanelClosed(i17, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
        ((p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb()).p();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = (p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb();
        g0Var.s();
        p012xc85e97e9.p016x746ad0e3.app.b bVar = g0Var.f90647i;
        if (bVar != null) {
            bVar.J(true);
        }
    }

    /* renamed from: onPrepareSupportNavigateUpTaskStack */
    public void m2536x353a170(z2.b2 b2Var) {
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int i17 = ((p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb()).M;
        if (i17 != -100) {
            bundle.putInt("appcompat:local_night_mode", i17);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        ((p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb()).a();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        android.content.BroadcastReceiver broadcastReceiver;
        super.onStop();
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = (p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb();
        g0Var.s();
        p012xc85e97e9.p016x746ad0e3.app.b bVar = g0Var.f90647i;
        if (bVar != null) {
            bVar.J(false);
        }
        p012xc85e97e9.p016x746ad0e3.app.b0 b0Var = g0Var.P;
        if (b0Var == null || (broadcastReceiver = b0Var.f90612c) == null) {
            return;
        }
        b0Var.f90614e.f90642d.unregisterReceiver(broadcastReceiver);
        b0Var.f90612c = null;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.n
    /* renamed from: onSupportActionModeFinished */
    public void mo2537x9f91d9b(n.b bVar) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.n
    /* renamed from: onSupportActionModeStarted */
    public void mo2538x4261a38(n.b bVar) {
    }

    @java.lang.Deprecated
    /* renamed from: onSupportContentChanged */
    public void m2539xf6b650b() {
    }

    /* renamed from: onSupportNavigateUp */
    public boolean m2540x38b7e8fc() {
        android.content.Intent mo2534x7099db0e = mo2534x7099db0e();
        if (mo2534x7099db0e == null) {
            return false;
        }
        if (!m2551x57730c51(mo2534x7099db0e)) {
            m2549xa1d14cf6(mo2534x7099db0e);
            return true;
        }
        z2.b2 b2Var = new z2.b2(this);
        m2535x50ed6943(b2Var);
        m2536x353a170(b2Var);
        java.util.ArrayList arrayList = b2Var.f550953d;
        if (arrayList.isEmpty()) {
            throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        android.content.Intent[] intentArr = (android.content.Intent[]) arrayList.toArray(new android.content.Intent[0]);
        intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
        if (!b3.l.m9721xeb5f49ef(b2Var.f550954e, intentArr, null)) {
            android.content.Intent intent = new android.content.Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            android.content.Context context = b2Var.f550954e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "androidx/core/app/TaskStackBuilder", "startActivities", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "androidx/core/app/TaskStackBuilder", "startActivities", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        try {
            int i17 = z2.h.f550981a;
            z2.a.a(this);
            return true;
        } catch (java.lang.IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(java.lang.CharSequence charSequence, int i17) {
        super.onTitleChanged(charSequence, i17);
        m2531xacb01afb().h(charSequence);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.n
    /* renamed from: onWindowStartingSupportActionMode */
    public n.b mo2541xd129edd9(n.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (getWindow().hasFeature(0)) {
            if (mo2533x106ab264 == null || !mo2533x106ab264.v()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void setContentView(int i17) {
        m2531xacb01afb().g(i17);
    }

    /* renamed from: setSupportActionBar */
    public void m2542xb4674770(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b) {
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = (p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb();
        android.view.Window.Callback callback = g0Var.f90644f;
        if (callback instanceof android.app.Activity) {
            g0Var.s();
            p012xc85e97e9.p016x746ad0e3.app.b bVar = g0Var.f90647i;
            if (bVar instanceof p012xc85e97e9.p016x746ad0e3.app.y0) {
                throw new java.lang.IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            g0Var.f90648m = null;
            if (bVar != null) {
                bVar.s();
            }
            android.view.Window.Callback callback2 = g0Var.f90645g;
            android.view.Window window = g0Var.f90643e;
            if (c0102x1f44235b != null) {
                p012xc85e97e9.p016x746ad0e3.app.q0 q0Var = new p012xc85e97e9.p016x746ad0e3.app.q0(c0102x1f44235b, ((android.app.Activity) callback).getTitle(), callback2);
                g0Var.f90647i = q0Var;
                window.setCallback(q0Var.f90739c);
            } else {
                g0Var.f90647i = null;
                window.setCallback(callback2);
            }
            g0Var.c();
        }
    }

    @java.lang.Deprecated
    /* renamed from: setSupportProgress */
    public void m2543xb940d25a(int i17) {
    }

    @java.lang.Deprecated
    /* renamed from: setSupportProgressBarIndeterminate */
    public void m2544xaf339e2(boolean z17) {
    }

    @java.lang.Deprecated
    /* renamed from: setSupportProgressBarIndeterminateVisibility */
    public void m2545x7f6e0694(boolean z17) {
    }

    @java.lang.Deprecated
    /* renamed from: setSupportProgressBarVisibility */
    public void m2546x46947f4b(boolean z17) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i17) {
        super.setTheme(i17);
        this.f93x4da5e397 = i17;
    }

    /* renamed from: startSupportActionMode */
    public n.b m2547x242ed1e6(n.a aVar) {
        return m2531xacb01afb().i(aVar);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f
    /* renamed from: supportInvalidateOptionsMenu */
    public void mo2548x55429c53() {
        m2531xacb01afb().c();
    }

    /* renamed from: supportNavigateUpTo */
    public void m2549xa1d14cf6(android.content.Intent intent) {
        z2.b0.b(this, intent);
    }

    /* renamed from: supportRequestWindowFeature */
    public boolean mo2550x7c2abd06(int i17) {
        return m2531xacb01afb().f(i17);
    }

    /* renamed from: supportShouldUpRecreateTask */
    public boolean m2551x57730c51(android.content.Intent intent) {
        return z2.b0.c(this, intent);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void setContentView(android.view.View view) {
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = (p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb();
        g0Var.p();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) g0Var.f90659x.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        g0Var.f90644f.onContentChanged();
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = (p012xc85e97e9.p016x746ad0e3.app.g0) m2531xacb01afb();
        g0Var.p();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) g0Var.f90659x.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        g0Var.f90644f.onContentChanged();
    }
}
