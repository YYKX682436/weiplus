package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public class z extends n.m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.g0 f90796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p012xc85e97e9.p016x746ad0e3.app.g0 g0Var, android.view.Window.Callback callback) {
        super(callback);
        this.f90796e = g0Var;
    }

    @Override // n.m, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f90796e.m(keyEvent) || super.dispatchKeyEvent(keyEvent);
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
            androidx.appcompat.app.g0 r2 = r5.f90796e
            r2.s()
            androidx.appcompat.app.b r3 = r2.f90647i
            r4 = 0
            if (r3 == 0) goto L1d
            boolean r0 = r3.t(r0, r6)
            if (r0 == 0) goto L1d
        L1b:
            r6 = r1
            goto L4b
        L1d:
            androidx.appcompat.app.e0 r0 = r2.f90641J
            if (r0 == 0) goto L32
            int r3 = r6.getKeyCode()
            boolean r0 = r2.u(r0, r3, r6, r1)
            if (r0 == 0) goto L32
            androidx.appcompat.app.e0 r6 = r2.f90641J
            if (r6 == 0) goto L1b
            r6.f90630l = r1
            goto L1b
        L32:
            androidx.appcompat.app.e0 r0 = r2.f90641J
            if (r0 != 0) goto L4a
            androidx.appcompat.app.e0 r0 = r2.q(r4, r1)
            r2.v(r0, r6)
            int r3 = r6.getKeyCode()
            boolean r6 = r2.u(r0, r3, r6, r1)
            r0.f90629k = r4
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.app.z.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
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
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = this.f90796e;
        if (i17 == 108) {
            g0Var.s();
            p012xc85e97e9.p016x746ad0e3.app.b bVar = g0Var.f90647i;
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
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = this.f90796e;
        if (i17 == 108) {
            g0Var.s();
            p012xc85e97e9.p016x746ad0e3.app.b bVar = g0Var.f90647i;
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
        p012xc85e97e9.p016x746ad0e3.app.e0 q17 = g0Var.q(i17, true);
        if (q17.f90631m) {
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
        o.r rVar = this.f90796e.q(0, true).f90626h;
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
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = this.f90796e;
        g0Var.getClass();
        if (i17 != 0) {
            return super.onWindowStartingActionMode(callback, i17);
        }
        n.f fVar = new n.f(g0Var.f90642d, callback);
        n.b i18 = g0Var.i(fVar);
        if (i18 != null) {
            return fVar.e(i18);
        }
        return null;
    }
}
