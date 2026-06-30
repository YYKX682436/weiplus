package o;

/* loaded from: classes15.dex */
public abstract class z extends o.e implements android.view.MenuItem {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.reflect.Method f423362g;

    public z(android.content.Context context, g3.b bVar) {
        super(context, bVar);
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((g3.b) this.f423247d).collapseActionView();
    }

    public abstract o.v d(android.view.ActionProvider actionProvider);

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((g3.b) this.f423247d).expandActionView();
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        n3.f b17 = ((g3.b) this.f423247d).b();
        if (b17 instanceof o.v) {
            return ((o.v) b17).f423357b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
        android.view.View actionView = ((g3.b) this.f423247d).getActionView();
        return actionView instanceof o.w ? (android.view.View) ((o.w) actionView).f423359d : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return ((g3.b) this.f423247d).getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((g3.b) this.f423247d).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
        return ((g3.b) this.f423247d).getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((g3.b) this.f423247d).getGroupId();
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        return ((g3.b) this.f423247d).getIcon();
    }

    @Override // android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
        return ((g3.b) this.f423247d).getIconTintList();
    }

    @Override // android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return ((g3.b) this.f423247d).getIconTintMode();
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return ((g3.b) this.f423247d).getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((g3.b) this.f423247d).getItemId();
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((g3.b) this.f423247d).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return ((g3.b) this.f423247d).getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((g3.b) this.f423247d).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((g3.b) this.f423247d).getOrder();
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
        return ((g3.b) this.f423247d).getSubMenu();
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
        return ((g3.b) this.f423247d).getTitle();
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        return ((g3.b) this.f423247d).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
        return ((g3.b) this.f423247d).getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((g3.b) this.f423247d).hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((g3.b) this.f423247d).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((g3.b) this.f423247d).isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((g3.b) this.f423247d).isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((g3.b) this.f423247d).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((g3.b) this.f423247d).isVisible();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        ((g3.b) this.f423247d).a(actionProvider != null ? d(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new o.w(view);
        }
        ((g3.b) this.f423247d).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c17) {
        ((g3.b) this.f423247d).setAlphabeticShortcut(c17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z17) {
        ((g3.b) this.f423247d).setCheckable(z17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z17) {
        ((g3.b) this.f423247d).setChecked(z17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        ((g3.b) this.f423247d).setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z17) {
        ((g3.b) this.f423247d).setEnabled(z17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        ((g3.b) this.f423247d).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        ((g3.b) this.f423247d).setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        ((g3.b) this.f423247d).setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        ((g3.b) this.f423247d).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c17) {
        ((g3.b) this.f423247d).setNumericShortcut(c17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        ((g3.b) this.f423247d).setOnActionExpandListener(onActionExpandListener != null ? new o.x(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((g3.b) this.f423247d).setOnMenuItemClickListener(onMenuItemClickListener != null ? new o.y(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c17, char c18) {
        ((g3.b) this.f423247d).setShortcut(c17, c18);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i17) {
        ((g3.b) this.f423247d).setShowAsAction(i17);
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int i17) {
        ((g3.b) this.f423247d).setShowAsActionFlags(i17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        ((g3.b) this.f423247d).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        ((g3.b) this.f423247d).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        ((g3.b) this.f423247d).setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z17) {
        return ((g3.b) this.f423247d).setVisible(z17);
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c17, int i17) {
        ((g3.b) this.f423247d).setAlphabeticShortcut(c17, i17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i17) {
        ((g3.b) this.f423247d).setIcon(i17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c17, int i17) {
        ((g3.b) this.f423247d).setNumericShortcut(c17, i17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c17, char c18, int i17, int i18) {
        ((g3.b) this.f423247d).setShortcut(c17, c18, i17, i18);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i17) {
        ((g3.b) this.f423247d).setTitle(i17);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int i17) {
        java.lang.Object obj = this.f423247d;
        ((g3.b) obj).setActionView(i17);
        android.view.View actionView = ((g3.b) obj).getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            ((g3.b) obj).setActionView(new o.w(actionView));
        }
        return this;
    }
}
