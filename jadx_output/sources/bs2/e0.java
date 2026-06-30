package bs2;

/* loaded from: classes2.dex */
public final class e0 {
    public e0(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo, java.lang.String source) {
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        kotlin.jvm.internal.o.g(source, "source");
        r45.xs2 xs2Var = ctrlInfo.N;
        int integer = xs2Var.getInteger(22);
        int integer2 = xs2Var.getInteger(9);
        long j17 = xs2Var.getLong(3);
        r45.bz2 bz2Var = (r45.bz2) xs2Var.getCustom(23);
        long j18 = bz2Var != null ? bz2Var.f371170g : 0L;
        boolean z17 = false;
        boolean z18 = xs2Var.getInteger(28) == 1;
        if (!z18 && integer != 1 && integer2 == 4 && j17 != 0 && j17 != j18) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("Finder.TabPreloadWorker", "isNeedPreloadRedDot: source=" + source + ", ret=" + z17 + ", disablePreload=" + z18 + ", refreshPrefetchStatus=" + integer + ", displayTabType=" + integer2 + ", objectId=" + pm0.v.u(j17) + ", bubbleFeedId=" + pm0.v.u(j18));
        return z17;
    }
}
