package gl5;

/* loaded from: classes15.dex */
public class c0 extends android.view.ActionMode.Callback2 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f354451c;

    /* renamed from: d, reason: collision with root package name */
    public final int f354452d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f354454f;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f354449a = new android.graphics.Path();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f354450b = new android.graphics.RectF();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f354453e = new java.util.HashMap();

    public c0(gl5.e0 e0Var, int i17) {
        this.f354454f = e0Var;
        boolean z17 = i17 == 0 || (e0Var.f354499x && i17 == 2);
        this.f354451c = z17;
        if (z17) {
            gl5.b0 p17 = e0Var.p();
            if (p17.f354436d == null) {
                e0Var.w(false);
                p17.d();
                p17.c();
            }
            this.f354452d = java.lang.Math.max(e0Var.G.getMinimumHeight(), e0Var.H.getMinimumHeight());
            return;
        }
        gl5.w k17 = e0Var.k();
        if (k17 == null) {
            this.f354452d = 0;
        } else {
            k17.b();
            this.f354452d = e0Var.I.getMinimumHeight();
        }
    }

    public final void a(android.view.Menu menu) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.f354454f.U;
        boolean z17 = (!viewTreeObserverOnPreDrawListenerC22668xe0605023.z() || (viewTreeObserverOnPreDrawListenerC22668xe0605023.H instanceof android.text.method.PasswordTransformationMethod) || (viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c() == 0 && viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625() == viewTreeObserverOnPreDrawListenerC22668xe0605023.A.length())) ? false : true;
        boolean z18 = menu.findItem(android.R.id.selectAll) != null;
        if (z17 && !z18) {
            menu.add(0, android.R.id.selectAll, 8, android.R.string.selectAll).setShowAsAction(1);
        } else {
            if (z17 || !z18) {
                return;
            }
            menu.removeItem(android.R.id.selectAll);
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        gl5.e0 e0Var = this.f354454f;
        gl5.e1 o17 = e0Var.o();
        menuItem.getItemId();
        menuItem.getTitle().toString();
        o17.getClass();
        android.view.ActionMode.Callback callback = this.f354451c ? e0Var.K : e0Var.L;
        if (callback != null && callback.onActionItemClicked(actionMode, menuItem)) {
            return true;
        }
        if (menuItem.getGroupId() != 16908353) {
            return e0Var.U.c0(menuItem.getItemId());
        }
        if (!(menuItem.getGroupId() == 16908353)) {
            throw new java.lang.IllegalArgumentException();
        }
        e0Var.o().getClass();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        ((java.util.HashMap) this.f354453e).clear();
        actionMode.setTitle((java.lang.CharSequence) null);
        actionMode.setSubtitle((java.lang.CharSequence) null);
        actionMode.setTitleOptionalHint(true);
        gl5.e0 e0Var = this.f354454f;
        if (e0Var.U.x()) {
            menu.add(0, android.R.id.cut, 4, android.R.string.cut).setAlphabeticShortcut('x').setShowAsAction(2);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
        if (viewTreeObserverOnPreDrawListenerC22668xe0605023.w()) {
            menu.add(0, android.R.id.copy, 5, android.R.string.copy).setAlphabeticShortcut('c').setShowAsAction(2);
        }
        if (viewTreeObserverOnPreDrawListenerC22668xe0605023.y()) {
            menu.add(0, android.R.id.paste, 6, android.R.string.paste).setAlphabeticShortcut('v').setShowAsAction(2);
        }
        a(menu);
        boolean z17 = this.f354451c;
        android.view.ActionMode.Callback callback = z17 ? e0Var.K : e0Var.L;
        if (callback != null && !callback.onCreateActionMode(actionMode, menu)) {
            android.text.Selection.setSelection((android.text.Spannable) viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3(), viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625());
            return false;
        }
        if (z17 && !viewTreeObserverOnPreDrawListenerC22668xe0605023.hasTransientState()) {
            viewTreeObserverOnPreDrawListenerC22668xe0605023.setHasTransientState(true);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(android.view.ActionMode actionMode) {
        gl5.e0 e0Var = this.f354454f;
        e0Var.o().getClass();
        e0Var.f354478c = null;
        android.view.ActionMode.Callback callback = this.f354451c ? e0Var.K : e0Var.L;
        if (callback != null) {
            callback.onDestroyActionMode(actionMode);
        }
        if (!e0Var.A) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
            android.text.Selection.setSelection((android.text.Spannable) viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3(), viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625());
        }
        gl5.b0 b0Var = e0Var.f354477b;
        if (b0Var != null) {
            b0Var.c();
        }
        ((java.util.HashMap) this.f354453e).clear();
        e0Var.C = false;
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(android.view.ActionMode actionMode, android.view.View view, android.graphics.Rect rect) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cmEdit.Editor", "onGetContentRect mode:" + actionMode + ",view:" + view + ",outRect:" + rect);
        gl5.e0 e0Var = this.f354454f;
        if (view.equals(e0Var.U)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
            if (viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20() != null) {
                int m81687x6f2c472c = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c();
                int m81686xffd93625 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625();
                android.graphics.RectF rectF = this.f354450b;
                int i17 = this.f354452d;
                if (m81687x6f2c472c != m81686xffd93625) {
                    android.graphics.Path path = this.f354449a;
                    path.reset();
                    viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20().getSelectionPath(viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c(), viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625(), path);
                    path.computeBounds(rectF, true);
                    rectF.bottom += i17;
                } else {
                    android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
                    int lineForOffset = m81661x22f21e20.getLineForOffset(viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c());
                    float c17 = e0Var.c(null, m81661x22f21e20.getPrimaryHorizontal(viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c()));
                    rectF.set(c17, m81661x22f21e20.getLineTop(lineForOffset), c17, m81661x22f21e20.getLineBottom(lineForOffset) + i17);
                }
                float m81628xdc9a71d7 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81628xdc9a71d7() - viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX();
                float y07 = viewTreeObserverOnPreDrawListenerC22668xe0605023.y0();
                rect.set((int) java.lang.Math.floor(rectF.left + m81628xdc9a71d7), (int) java.lang.Math.floor(rectF.top + y07), (int) java.lang.Math.ceil(rectF.right + m81628xdc9a71d7), (int) java.lang.Math.ceil(rectF.bottom + y07));
                return;
            }
        }
        super.onGetContentRect(actionMode, view, rect);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        a(menu);
        boolean z17 = this.f354451c;
        gl5.e0 e0Var = this.f354454f;
        android.view.ActionMode.Callback callback = z17 ? e0Var.K : e0Var.L;
        if (callback != null) {
            return callback.onPrepareActionMode(actionMode, menu);
        }
        return true;
    }
}
