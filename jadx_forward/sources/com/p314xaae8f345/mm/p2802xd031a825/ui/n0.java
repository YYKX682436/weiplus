package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes8.dex */
public class n0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f295743d;

    public n0(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        this.f295743d = abstractActivityC22902xe37969e;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f295743d;
        abstractActivityC22902xe37969e.f39906x53855852 = 4;
        if (!abstractActivityC22902xe37969e.mo73847x7d641a7d()) {
            abstractActivityC22902xe37969e.finish();
            return true;
        }
        abstractActivityC22902xe37969e.mo48674x36654fab();
        abstractActivityC22902xe37969e.showDialog(1000);
        return true;
    }
}
