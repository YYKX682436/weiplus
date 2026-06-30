package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ce implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f106470d;

    public ce(com.tencent.mm.plugin.finder.feed.af afVar) {
        this.f106470d = afVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        com.tencent.mm.plugin.finder.feed.af afVar = this.f106470d;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.tencent.mm.plugin.finder.feed.af.R6(afVar, true);
            com.tencent.mm.plugin.finder.feed.af.Q6(afVar);
            return;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            com.tencent.mm.plugin.finder.feed.af.S6(afVar, true);
            com.tencent.mm.plugin.finder.feed.af.Q6(afVar);
            return;
        }
        if (valueOf != null && valueOf.intValue() == 2) {
            com.tencent.mm.plugin.finder.feed.af.R6(afVar, false);
            com.tencent.mm.plugin.finder.feed.af.Q6(afVar);
        } else if (valueOf == null || valueOf.intValue() != 3) {
            com.tencent.mm.plugin.finder.feed.af.Q6(afVar);
        } else {
            com.tencent.mm.plugin.finder.feed.af.S6(afVar, false);
            com.tencent.mm.plugin.finder.feed.af.Q6(afVar);
        }
    }
}
