package db5;

/* loaded from: classes8.dex */
public class h4 implements android.view.MenuItem {
    public java.lang.String A;
    public android.content.Intent B;
    public final android.content.Context C;

    /* renamed from: d, reason: collision with root package name */
    public boolean f309896d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f309897e;

    /* renamed from: g, reason: collision with root package name */
    public final int f309899g;

    /* renamed from: h, reason: collision with root package name */
    public final int f309900h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f309901i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f309902m;

    /* renamed from: n, reason: collision with root package name */
    public int f309903n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.CharSequence f309904o;

    /* renamed from: p, reason: collision with root package name */
    public android.text.TextUtils.TruncateAt f309905p;

    /* renamed from: r, reason: collision with root package name */
    public int f309907r;

    /* renamed from: t, reason: collision with root package name */
    public int f309909t;

    /* renamed from: u, reason: collision with root package name */
    public int f309910u;

    /* renamed from: v, reason: collision with root package name */
    public int f309911v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.drawable.Drawable f309912w;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ContextMenu.ContextMenuInfo f309914y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.MenuItem.OnMenuItemClickListener f309915z;

    /* renamed from: f, reason: collision with root package name */
    public boolean f309898f = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence f309906q = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f309908s = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f309913x = true;
    public boolean D = false;
    public boolean E = false;
    public java.lang.Boolean F = java.lang.Boolean.FALSE;
    public android.graphics.drawable.Drawable G = null;
    public boolean H = false;
    public db5.m4 I = null;

    /* renamed from: J, reason: collision with root package name */
    public db5.v4 f309895J = null;
    public db5.u4 K = null;

    public h4(android.content.Context context, int i17, int i18) {
        this.C = context;
        this.f309899g = i17;
        this.f309900h = i18;
        this.f309911v = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
    }

    public boolean c() {
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f309915z;
        if (onMenuItemClickListener != null) {
            return onMenuItemClickListener.onMenuItemClick(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    public android.view.MenuItem d(int i17, int i18) {
        this.f309910u = i17;
        this.f309911v = i18;
        db5.m4 m4Var = this.I;
        if (m4Var != null) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j1) m4Var).a(this);
        }
        return this;
    }

    public android.view.MenuItem e(android.graphics.drawable.Drawable drawable, int i17) {
        this.f309912w = drawable;
        this.f309911v = i17;
        db5.m4 m4Var = this.I;
        if (m4Var != null) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j1) m4Var).a(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return (char) 0;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f309900h;
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        android.content.Context context;
        android.graphics.drawable.Drawable drawable = this.f309912w;
        if (drawable != null) {
            return drawable;
        }
        if (this.f309910u == 0 || (context = this.C) == null) {
            return null;
        }
        return context.getResources().getDrawable(this.f309910u);
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f309899g;
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f309914y;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return (char) 0;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
        android.content.Context context;
        java.lang.CharSequence charSequence = this.f309901i;
        if (charSequence != null) {
            return charSequence;
        }
        int i17 = this.f309909t;
        if (i17 == 0 || (context = this.C) == null) {
            return null;
        }
        return context.getString(i17);
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        return null;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return true;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return true;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int i17) {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.f309912w = drawable;
        db5.m4 m4Var = this.I;
        if (m4Var != null) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j1) m4Var).a(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        this.B = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f309915z = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c17, char c18) {
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i17) {
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int i17) {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f309901i = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View view) {
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i17) {
        this.f309909t = i17;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i17) {
        this.f309910u = i17;
        db5.m4 m4Var = this.I;
        if (m4Var != null) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j1) m4Var).a(this);
        }
        return this;
    }
}
