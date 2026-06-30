package bs2;

/* loaded from: classes2.dex */
public final class l implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore f23878d;

    public l(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore) {
        this.f23878d = finderStreamTabPreloadCore;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        if (z9Var.f105327a && (jbVar = z9Var.f105329c) != null) {
            this.f23878d.W6(jbVar, true);
        }
    }
}
