package zo1;

/* loaded from: classes5.dex */
public final class m4 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e f556226d;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e) {
        this.f556226d = activityC12873xf94c39e;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar2 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj2;
        qo1.j1 j1Var = qo1.j1.f447056a;
        qo1.j0 d17 = j1Var.d(gVar.f297362d);
        qo1.j0 d18 = j1Var.d(gVar2.f297362d);
        long mo160576x8082fb99 = d17.mo160576x8082fb99();
        long mo160576x8082fb992 = d18.mo160576x8082fb99();
        if (mo160576x8082fb99 > 0 && mo160576x8082fb992 > 0) {
            boolean z17 = d17 instanceof qo1.f0;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 o0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
            boolean z18 = false;
            boolean z19 = z17 && ((qo1.f0) d17).f447009b == o0Var;
            if ((d18 instanceof qo1.f0) && ((qo1.f0) d18).f447009b == o0Var) {
                z18 = true;
            }
            if (!z19 || z18) {
                if (z19 || !z18) {
                    return java.lang.Long.signum(mo160576x8082fb992 - mo160576x8082fb99);
                }
                return -1;
            }
        } else {
            if (mo160576x8082fb99 > 0) {
                return -1;
            }
            if (mo160576x8082fb992 <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e = this.f556226d;
                boolean contains = ((java.util.ArrayList) activityC12873xf94c39e.f174401g).contains(java.lang.Long.valueOf(gVar.f297362d));
                boolean contains2 = ((java.util.ArrayList) activityC12873xf94c39e.f174401g).contains(java.lang.Long.valueOf(gVar2.f297362d));
                if (contains && contains2) {
                    return java.lang.Long.signum(gVar2.f297362d - gVar.f297362d);
                }
                if (contains) {
                    return -1;
                }
                if (!contains2) {
                    int i17 = gVar.f297370o.f297372e;
                    int i18 = gVar2.f297370o.f297372e;
                    return i17 != i18 ? i18 - i17 : java.lang.Long.signum(gVar2.f297362d - gVar.f297362d);
                }
            }
        }
        return 1;
    }
}
