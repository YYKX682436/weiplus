package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class n1 extends androidx.appcompat.widget.b1 {

    /* renamed from: t, reason: collision with root package name */
    public final int f9658t;

    /* renamed from: u, reason: collision with root package name */
    public final int f9659u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.appcompat.widget.m1 f9660v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.MenuItem f9661w;

    public n1(android.content.Context context, boolean z17) {
        super(context, z17);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f9658t = 21;
            this.f9659u = 22;
        } else {
            this.f9658t = 22;
            this.f9659u = 21;
        }
    }

    @Override // androidx.appcompat.widget.b1, android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        o.o oVar;
        int i17;
        int pointToPosition;
        int i18;
        if (this.f9660v != null) {
            android.widget.ListAdapter adapter = getAdapter();
            if (adapter instanceof android.widget.HeaderViewListAdapter) {
                android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                i17 = headerViewListAdapter.getHeadersCount();
                oVar = (o.o) headerViewListAdapter.getWrappedAdapter();
            } else {
                oVar = (o.o) adapter;
                i17 = 0;
            }
            o.u item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i18 = pointToPosition - i17) < 0 || i18 >= oVar.getCount()) ? null : oVar.getItem(i18);
            android.view.MenuItem menuItem = this.f9661w;
            if (menuItem != item) {
                o.r rVar = oVar.f341773d;
                if (menuItem != null) {
                    this.f9660v.b(rVar, menuItem);
                }
                this.f9661w = item;
                if (item != null) {
                    this.f9660v.a(rVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i17 == this.f9658t) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i17 != this.f9659u) {
            return super.onKeyDown(i17, keyEvent);
        }
        setSelection(-1);
        ((o.o) getAdapter()).f341773d.c(false);
        return true;
    }

    public void setHoverListener(androidx.appcompat.widget.m1 m1Var) {
        this.f9660v = m1Var;
    }

    @Override // androidx.appcompat.widget.b1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable drawable) {
        super.setSelector(drawable);
    }
}
