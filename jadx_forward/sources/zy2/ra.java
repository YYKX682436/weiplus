package zy2;

/* loaded from: classes2.dex */
public interface ra extends pf5.c {
    static ec2.d e2(zy2.ra raVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeedEventSubscriber");
        }
        if ((i18 & 1) != 0) {
            i17 = -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) raVar;
        return nyVar.n7() ? i17 == -1 ? nyVar.c7(nyVar.f216905d) : nyVar.c7(i17) : nyVar.H;
    }

    static /* synthetic */ fc2.c n1(zy2.ra raVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeedEventDispatcher");
        }
        if ((i18 & 1) != 0) {
            i17 = -1;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) raVar).Y6(i17);
    }
}
