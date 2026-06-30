package o;

/* loaded from: classes15.dex */
public class a implements g3.b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f423204d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f423205e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Intent f423206f;

    /* renamed from: g, reason: collision with root package name */
    public char f423207g;

    /* renamed from: i, reason: collision with root package name */
    public char f423209i;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f423211n;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f423212o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence f423213p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence f423214q;

    /* renamed from: h, reason: collision with root package name */
    public int f423208h = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f423210m = 4096;

    /* renamed from: r, reason: collision with root package name */
    public android.content.res.ColorStateList f423215r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f423216s = null;

    /* renamed from: t, reason: collision with root package name */
    public boolean f423217t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f423218u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f423219v = 16;

    public a(android.content.Context context, int i17, int i18, int i19, int i27, java.lang.CharSequence charSequence) {
        this.f423212o = context;
        this.f423204d = charSequence;
    }

    @Override // g3.b
    public g3.b a(n3.f fVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // g3.b
    public n3.f b() {
        return null;
    }

    public final void c() {
        android.graphics.drawable.Drawable drawable = this.f423211n;
        if (drawable != null) {
            if (this.f423217t || this.f423218u) {
                this.f423211n = drawable;
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.f423211n = mutate;
                if (this.f423217t) {
                    f3.b.h(mutate, this.f423215r);
                }
                if (this.f423218u) {
                    f3.b.i(this.f423211n, this.f423216s);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
        return null;
    }

    @Override // g3.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f423210m;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f423209i;
    }

    @Override // g3.b, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
        return this.f423213p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        return this.f423211n;
    }

    @Override // g3.b, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
        return this.f423215r;
    }

    @Override // g3.b, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.f423216s;
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return this.f423206f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return android.R.id.home;
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // g3.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f423208h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f423207g;
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
        return this.f423204d;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.f423205e;
        return charSequence != null ? charSequence : this.f423204d;
    }

    @Override // g3.b, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
        return this.f423214q;
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
        return (this.f423219v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f423219v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f423219v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f423219v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View view) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c17) {
        this.f423209i = java.lang.Character.toLowerCase(c17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z17) {
        this.f423219v = (z17 ? 1 : 0) | (this.f423219v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z17) {
        this.f423219v = (z17 ? 2 : 0) | (this.f423219v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.f423213p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z17) {
        this.f423219v = (z17 ? 16 : 0) | (this.f423219v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.f423211n = drawable;
        c();
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f423215r = colorStateList;
        this.f423217t = true;
        c();
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f423216s = mode;
        this.f423218u = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        this.f423206f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c17) {
        this.f423207g = c17;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c17, char c18) {
        this.f423207g = c17;
        this.f423209i = java.lang.Character.toLowerCase(c18);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i17) {
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int i17) {
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f423204d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.f423205e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.f423214q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z17) {
        this.f423219v = (this.f423219v & 8) | (z17 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c17, int i17) {
        this.f423209i = java.lang.Character.toLowerCase(c17);
        this.f423210m = android.view.KeyEvent.normalizeMetaState(i17);
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public g3.b setContentDescription(java.lang.CharSequence charSequence) {
        this.f423213p = charSequence;
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c17, int i17) {
        this.f423207g = c17;
        this.f423208h = android.view.KeyEvent.normalizeMetaState(i17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i17) {
        this.f423204d = this.f423212o.getResources().getString(i17);
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public g3.b setTooltipText(java.lang.CharSequence charSequence) {
        this.f423214q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i17) {
        this.f423211n = b3.l.m9707x4a96be14(this.f423212o, i17);
        c();
        return this;
    }

    @Override // g3.b, android.view.MenuItem
    public android.view.MenuItem setShortcut(char c17, char c18, int i17, int i18) {
        this.f423207g = c17;
        this.f423208h = android.view.KeyEvent.normalizeMetaState(i17);
        this.f423209i = java.lang.Character.toLowerCase(c18);
        this.f423210m = android.view.KeyEvent.normalizeMetaState(i18);
        return this;
    }
}
