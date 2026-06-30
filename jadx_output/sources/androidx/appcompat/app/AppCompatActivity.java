package androidx.appcompat.app;

/* loaded from: classes14.dex */
public class AppCompatActivity extends androidx.fragment.app.FragmentActivity implements androidx.appcompat.app.n, z2.a2 {
    private androidx.appcompat.app.o mDelegate;
    private android.content.res.Resources mResources;
    private int mThemeId = 0;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) getDelegate();
        g0Var.p();
        ((android.view.ViewGroup) g0Var.f9126x.findViewById(android.R.id.content)).addView(view, layoutParams);
        g0Var.f9111f.onContentChanged();
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.u(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public android.view.View findViewById(int i17) {
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) getDelegate();
        g0Var.p();
        return g0Var.f9110e.findViewById(i17);
    }

    public androidx.appcompat.app.o getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = new androidx.appcompat.app.g0(this, getWindow(), this);
        }
        return this.mDelegate;
    }

    public androidx.appcompat.app.c getDrawerToggleDelegate() {
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) getDelegate();
        g0Var.getClass();
        return new androidx.appcompat.app.v(g0Var);
    }

    @Override // android.app.Activity
    public android.view.MenuInflater getMenuInflater() {
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) getDelegate();
        if (g0Var.f9115m == null) {
            g0Var.s();
            androidx.appcompat.app.b bVar = g0Var.f9114i;
            g0Var.f9115m = new n.j(bVar != null ? bVar.m() : g0Var.f9109d);
        }
        return g0Var.f9115m;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        android.content.res.Resources resources = this.mResources;
        if (resources == null) {
            int i17 = androidx.appcompat.widget.f3.f9585a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public androidx.appcompat.app.b getSupportActionBar() {
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) getDelegate();
        g0Var.s();
        return g0Var.f9114i;
    }

    @Override // z2.a2
    public android.content.Intent getSupportParentActivityIntent() {
        return z2.c0.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().c();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) getDelegate();
        if (g0Var.C && g0Var.f9125w) {
            g0Var.s();
            androidx.appcompat.app.b bVar = g0Var.f9114i;
            if (bVar != null) {
                bVar.r(configuration);
            }
        }
        androidx.appcompat.widget.h0 f17 = androidx.appcompat.widget.h0.f();
        android.content.Context context = g0Var.f9109d;
        synchronized (f17) {
            x.f fVar = (x.f) f17.f9599c.get(context);
            if (fVar != null) {
                fVar.clear();
            }
        }
        g0Var.a();
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.o delegate = getDelegate();
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) delegate;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(g0Var.f9109d);
        if (from.getFactory() == null) {
            from.setFactory2(g0Var);
        } else {
            boolean z17 = from.getFactory2() instanceof androidx.appcompat.app.g0;
        }
        delegate.e(bundle);
        if (delegate.a() && this.mThemeId != 0) {
            onApplyThemeResource(getTheme(), this.mThemeId, false);
        }
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(z2.b2 b2Var) {
        b2Var.getClass();
        android.content.Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = z2.c0.a(this);
        }
        if (supportParentActivityIntent != null) {
            android.content.ComponentName component = supportParentActivityIntent.getComponent();
            android.content.Context context = b2Var.f469421e;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(context.getPackageManager());
            }
            java.util.ArrayList arrayList = b2Var.f469420d;
            int size = arrayList.size();
            try {
                for (android.content.Intent b17 = z2.c0.b(context, component); b17 != null; b17 = z2.c0.b(context, b17.getComponent())) {
                    arrayList.add(size, b17);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                throw new java.lang.IllegalArgumentException(e17);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.content.BroadcastReceiver broadcastReceiver;
        super.onDestroy();
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) getDelegate();
        if (g0Var.Q) {
            g0Var.f9110e.getDecorView().removeCallbacks(g0Var.S);
        }
        g0Var.L = true;
        androidx.appcompat.app.b bVar = g0Var.f9114i;
        if (bVar != null) {
            bVar.s();
        }
        androidx.appcompat.app.b0 b0Var = g0Var.P;
        if (b0Var == null || (broadcastReceiver = b0Var.f9079c) == null) {
            return;
        }
        b0Var.f9081e.f9109d.unregisterReceiver(broadcastReceiver);
        b0Var.f9079c = null;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        android.view.Window window;
        if ((android.os.Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || android.view.KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || android.view.KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i17, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i17, menuItem)) {
            return true;
        }
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.k() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i17, android.view.Menu menu) {
        return super.onMenuOpened(i17, menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i17, android.view.Menu menu) {
        super.onPanelClosed(i17, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
        ((androidx.appcompat.app.g0) getDelegate()).p();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) getDelegate();
        g0Var.s();
        androidx.appcompat.app.b bVar = g0Var.f9114i;
        if (bVar != null) {
            bVar.J(true);
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(z2.b2 b2Var) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int i17 = ((androidx.appcompat.app.g0) getDelegate()).M;
        if (i17 != -100) {
            bundle.putInt("appcompat:local_night_mode", i17);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        ((androidx.appcompat.app.g0) getDelegate()).a();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        android.content.BroadcastReceiver broadcastReceiver;
        super.onStop();
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) getDelegate();
        g0Var.s();
        androidx.appcompat.app.b bVar = g0Var.f9114i;
        if (bVar != null) {
            bVar.J(false);
        }
        androidx.appcompat.app.b0 b0Var = g0Var.P;
        if (b0Var == null || (broadcastReceiver = b0Var.f9079c) == null) {
            return;
        }
        b0Var.f9081e.f9109d.unregisterReceiver(broadcastReceiver);
        b0Var.f9079c = null;
    }

    @Override // androidx.appcompat.app.n
    public void onSupportActionModeFinished(n.b bVar) {
    }

    @Override // androidx.appcompat.app.n
    public void onSupportActionModeStarted(n.b bVar) {
    }

    @java.lang.Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        android.content.Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        z2.b2 b2Var = new z2.b2(this);
        onCreateSupportNavigateUpTaskStack(b2Var);
        onPrepareSupportNavigateUpTaskStack(b2Var);
        java.util.ArrayList arrayList = b2Var.f469420d;
        if (arrayList.isEmpty()) {
            throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        android.content.Intent[] intentArr = (android.content.Intent[]) arrayList.toArray(new android.content.Intent[0]);
        intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
        if (!b3.l.startActivities(b2Var.f469421e, intentArr, null)) {
            android.content.Intent intent = new android.content.Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            android.content.Context context = b2Var.f469421e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "androidx/core/app/TaskStackBuilder", "startActivities", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "androidx/core/app/TaskStackBuilder", "startActivities", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        try {
            int i17 = z2.h.f469448a;
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
        getDelegate().h(charSequence);
    }

    @Override // androidx.appcompat.app.n
    public n.b onWindowStartingSupportActionMode(n.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.v()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i17) {
        getDelegate().g(i17);
    }

    public void setSupportActionBar(androidx.appcompat.widget.Toolbar toolbar) {
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) getDelegate();
        android.view.Window.Callback callback = g0Var.f9111f;
        if (callback instanceof android.app.Activity) {
            g0Var.s();
            androidx.appcompat.app.b bVar = g0Var.f9114i;
            if (bVar instanceof androidx.appcompat.app.y0) {
                throw new java.lang.IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            g0Var.f9115m = null;
            if (bVar != null) {
                bVar.s();
            }
            android.view.Window.Callback callback2 = g0Var.f9112g;
            android.view.Window window = g0Var.f9110e;
            if (toolbar != null) {
                androidx.appcompat.app.q0 q0Var = new androidx.appcompat.app.q0(toolbar, ((android.app.Activity) callback).getTitle(), callback2);
                g0Var.f9114i = q0Var;
                window.setCallback(q0Var.f9206c);
            } else {
                g0Var.f9114i = null;
                window.setCallback(callback2);
            }
            g0Var.c();
        }
    }

    @java.lang.Deprecated
    public void setSupportProgress(int i17) {
    }

    @java.lang.Deprecated
    public void setSupportProgressBarIndeterminate(boolean z17) {
    }

    @java.lang.Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z17) {
    }

    @java.lang.Deprecated
    public void setSupportProgressBarVisibility(boolean z17) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i17) {
        super.setTheme(i17);
        this.mThemeId = i17;
    }

    public n.b startSupportActionMode(n.a aVar) {
        return getDelegate().i(aVar);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().c();
    }

    public void supportNavigateUpTo(android.content.Intent intent) {
        z2.b0.b(this, intent);
    }

    public boolean supportRequestWindowFeature(int i17) {
        return getDelegate().f(i17);
    }

    public boolean supportShouldUpRecreateTask(android.content.Intent intent) {
        return z2.b0.c(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view) {
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) getDelegate();
        g0Var.p();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) g0Var.f9126x.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        g0Var.f9111f.onContentChanged();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) getDelegate();
        g0Var.p();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) g0Var.f9126x.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        g0Var.f9111f.onContentChanged();
    }
}
