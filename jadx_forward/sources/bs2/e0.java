package bs2;

/* loaded from: classes2.dex */
public final class e0 {
    public e0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        r45.xs2 xs2Var = ctrlInfo.N;
        int m75939xb282bd08 = xs2Var.m75939xb282bd08(22);
        int m75939xb282bd082 = xs2Var.m75939xb282bd08(9);
        long m75942xfb822ef2 = xs2Var.m75942xfb822ef2(3);
        r45.bz2 bz2Var = (r45.bz2) xs2Var.m75936x14adae67(23);
        long j17 = bz2Var != null ? bz2Var.f452703g : 0L;
        boolean z17 = false;
        boolean z18 = xs2Var.m75939xb282bd08(28) == 1;
        if (!z18 && m75939xb282bd08 != 1 && m75939xb282bd082 == 4 && m75942xfb822ef2 != 0 && m75942xfb822ef2 != j17) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TabPreloadWorker", "isNeedPreloadRedDot: source=" + source + ", ret=" + z17 + ", disablePreload=" + z18 + ", refreshPrefetchStatus=" + m75939xb282bd08 + ", displayTabType=" + m75939xb282bd082 + ", objectId=" + pm0.v.u(m75942xfb822ef2) + ", bubbleFeedId=" + pm0.v.u(j17));
        return z17;
    }
}
