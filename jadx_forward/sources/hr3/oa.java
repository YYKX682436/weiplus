package hr3;

/* loaded from: classes11.dex */
public class oa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f365390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f365391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr3.va f365392f;

    public oa(hr3.va vaVar, boolean z17, boolean z18) {
        this.f365392f = vaVar;
        this.f365390d = z17;
        this.f365391e = z18;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f365392f.f365642e.K1, 1, false);
        k0Var.f293414s = new hr3.ma(this);
        k0Var.f293405n = new hr3.na(this);
        k0Var.v();
        return true;
    }
}
