package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class z extends n.m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.g0 f9263e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.g0 g0Var, android.view.Window.Callback callback) {
        super(callback);
        this.f9263e = g0Var;
    }

    @Override // n.m, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f9263e.m(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r6 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    @Override // n.m, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyShortcutEvent(r6)
            r1 = 1
            if (r0 != 0) goto L4f
            int r0 = r6.getKeyCode()
            androidx.appcompat.app.g0 r2 = r5.f9263e
            r2.s()
            androidx.appcompat.app.b r3 = r2.f9114i
            r4 = 0
            if (r3 == 0) goto L1d
            boolean r0 = r3.t(r0, r6)
            if (r0 == 0) goto L1d
        L1b:
            r6 = r1
            goto L4b
        L1d:
            androidx.appcompat.app.e0 r0 = r2.f9108J
            if (r0 == 0) goto L32
            int r3 = r6.getKeyCode()
            boolean r0 = r2.u(r0, r3, r6, r1)
            if (r0 == 0) goto L32
            androidx.appcompat.app.e0 r6 = r2.f9108J
            if (r6 == 0) goto L1b
            r6.f9097l = r1
            goto L1b
        L32:
            androidx.appcompat.app.e0 r0 = r2.f9108J
            if (r0 != 0) goto L4a
            androidx.appcompat.app.e0 r0 = r2.q(r4, r1)
            r2.v(r0, r6)
            int r3 = r6.getKeyCode()
            boolean r6 = r2.u(r0, r3, r6, r1)
            r0.f9096k = r4
            if (r6 == 0) goto L4a
            goto L1b
        L4a:
            r6 = r4
        L4b:
            if (r6 == 0) goto L4e
            goto L4f
        L4e:
            r1 = r4
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.z.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // n.m, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // n.m, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i17, android.view.Menu menu) {
        if (i17 != 0 || (menu instanceof o.r)) {
            return super.onCreatePanelMenu(i17, menu);
        }
        return false;
    }

    @Override // n.m, android.view.Window.Callback
    public boolean onMenuOpened(int i17, android.view.Menu menu) {
        super.onMenuOpened(i17, menu);
        androidx.appcompat.app.g0 g0Var = this.f9263e;
        if (i17 == 108) {
            g0Var.s();
            androidx.appcompat.app.b bVar = g0Var.f9114i;
            if (bVar != null) {
                bVar.i(true);
            }
        } else {
            g0Var.getClass();
        }
        return true;
    }

    @Override // n.m, android.view.Window.Callback
    public void onPanelClosed(int i17, android.view.Menu menu) {
        super.onPanelClosed(i17, menu);
        androidx.appcompat.app.g0 g0Var = this.f9263e;
        if (i17 == 108) {
            g0Var.s();
            androidx.appcompat.app.b bVar = g0Var.f9114i;
            if (bVar != null) {
                bVar.i(false);
                return;
            }
            return;
        }
        if (i17 != 0) {
            g0Var.getClass();
            return;
        }
        androidx.appcompat.app.e0 q17 = g0Var.q(i17, true);
        if (q17.f9098m) {
            g0Var.l(q17, false);
        }
    }

    @Override // n.m, android.view.Window.Callback
    public boolean onPreparePanel(int i17, android.view.View view, android.view.Menu menu) {
        o.r rVar = menu instanceof o.r ? (o.r) menu : null;
        if (i17 == 0 && rVar == null) {
            return false;
        }
        if (rVar != null) {
            rVar.D = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i17, view, menu);
        if (rVar != null) {
            rVar.D = false;
        }
        return onPreparePanel;
    }

    @Override // n.m, android.view.Window.Callback
    public void onProvideKeyboardShortcuts(java.util.List list, android.view.Menu menu, int i17) {
        o.r rVar = this.f9263e.q(0, true).f9093h;
        if (rVar != null) {
            super.onProvideKeyboardShortcuts(list, rVar, i17);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i17);
        }
    }

    @Override // n.m, android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return null;
    }

    @Override // n.m, android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i17) {
        androidx.appcompat.app.g0 g0Var = this.f9263e;
        g0Var.getClass();
        if (i17 != 0) {
            return super.onWindowStartingActionMode(callback, i17);
        }
        n.f fVar = new n.f(g0Var.f9109d, callback);
        n.b i18 = g0Var.i(fVar);
        if (i18 != null) {
            return fVar.e(i18);
        }
        return null;
    }
}
