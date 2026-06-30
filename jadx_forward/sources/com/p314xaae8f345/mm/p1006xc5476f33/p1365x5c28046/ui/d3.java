package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes11.dex */
public class d3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13317xbf909954 f179462d;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13317xbf909954 c13317xbf909954) {
        this.f179462d = c13317xbf909954;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13317xbf909954 c13317xbf909954 = this.f179462d;
        if (c13317xbf909954.mo7430x19263085() != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sortRet", -1);
            c13317xbf909954.mo7430x19263085().setResult(0, intent);
        }
        c13317xbf909954.mo78641xb4098c93();
        return true;
    }
}
