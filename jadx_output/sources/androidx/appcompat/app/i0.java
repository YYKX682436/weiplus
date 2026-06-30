package androidx.appcompat.app;

/* loaded from: classes14.dex */
public class i0 extends android.app.Dialog implements androidx.appcompat.app.n {

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.app.o f9152d;

    /* renamed from: e, reason: collision with root package name */
    public final n3.s f9153e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i0(android.content.Context r4, int r5) {
        /*
            r3 = this;
            if (r5 != 0) goto L14
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r1 = 2130969038(0x7f0401ce, float:1.7546747E38)
            r2 = 1
            r0.resolveAttribute(r1, r5, r2)
            int r5 = r5.resourceId
        L14:
            r3.<init>(r4, r5)
            androidx.appcompat.app.h0 r4 = new androidx.appcompat.app.h0
            r4.<init>(r3)
            r3.f9153e = r4
            androidx.appcompat.app.o r4 = r3.z()
            r5 = 0
            r4.e(r5)
            androidx.appcompat.app.o r4 = r3.z()
            r4.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.i0.<init>(android.content.Context, int):void");
    }

    public void A() {
        cancel();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean C(int i17) {
        return z().f(i17);
    }

    public android.content.Context H() {
        return getContext();
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) z();
        g0Var.p();
        ((android.view.ViewGroup) g0Var.f9126x.findViewById(android.R.id.content)).addView(view, layoutParams);
        g0Var.f9111f.onContentChanged();
    }

    public void b(android.os.Bundle bundle) {
        cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return n3.t.b(this.f9153e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public android.view.View findViewById(int i17) {
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) z();
        g0Var.p();
        return g0Var.f9110e.findViewById(i17);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        z().c();
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) z();
        android.view.LayoutInflater from = android.view.LayoutInflater.from(g0Var.f9109d);
        if (from.getFactory() == null) {
            from.setFactory2(g0Var);
        } else {
            boolean z17 = from.getFactory2() instanceof androidx.appcompat.app.g0;
        }
        super.onCreate(bundle);
        z().e(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        android.content.BroadcastReceiver broadcastReceiver;
        super.onStop();
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) z();
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

    @Override // androidx.appcompat.app.n
    public n.b onWindowStartingSupportActionMode(n.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i17) {
        z().g(i17);
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        z().h(charSequence);
    }

    public androidx.appcompat.app.o z() {
        if (this.f9152d == null) {
            this.f9152d = new androidx.appcompat.app.g0(getContext(), getWindow(), this);
        }
        return this.f9152d;
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view) {
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) z();
        g0Var.p();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) g0Var.f9126x.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        g0Var.f9111f.onContentChanged();
    }

    @Override // android.app.Dialog
    public void setTitle(int i17) {
        super.setTitle(i17);
        z().h(getContext().getString(i17));
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        androidx.appcompat.app.g0 g0Var = (androidx.appcompat.app.g0) z();
        g0Var.p();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) g0Var.f9126x.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        g0Var.f9111f.onContentChanged();
    }
}
