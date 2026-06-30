package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class n1 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1 {

    /* renamed from: t, reason: collision with root package name */
    public final int f91191t;

    /* renamed from: u, reason: collision with root package name */
    public final int f91192u;

    /* renamed from: v, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m1 f91193v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.MenuItem f91194w;

    public n1(android.content.Context context, boolean z17) {
        super(context, z17);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f91191t = 21;
            this.f91192u = 22;
        } else {
            this.f91191t = 22;
            this.f91192u = 21;
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1, android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        o.o oVar;
        int i17;
        int pointToPosition;
        int i18;
        if (this.f91193v != null) {
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
            android.view.MenuItem menuItem = this.f91194w;
            if (menuItem != item) {
                o.r rVar = oVar.f423306d;
                if (menuItem != null) {
                    this.f91193v.b(rVar, menuItem);
                }
                this.f91194w = item;
                if (item != null) {
                    this.f91193v.a(rVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.C0071x6fd65eb5 c0071x6fd65eb5 = (p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.C0071x6fd65eb5) getSelectedView();
        if (c0071x6fd65eb5 != null && i17 == this.f91191t) {
            if (c0071x6fd65eb5.isEnabled() && c0071x6fd65eb5.mo2574xc2025ad3().hasSubMenu()) {
                performItemClick(c0071x6fd65eb5, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (c0071x6fd65eb5 == null || i17 != this.f91192u) {
            return super.onKeyDown(i17, keyEvent);
        }
        setSelection(-1);
        ((o.o) getAdapter()).f423306d.c(false);
        return true;
    }

    /* renamed from: setHoverListener */
    public void m2868xe86c18ce(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m1 m1Var) {
        this.f91193v = m1Var;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable drawable) {
        super.setSelector(drawable);
    }
}
