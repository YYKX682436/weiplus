package as2;

/* loaded from: classes2.dex */
public final class k extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f95014e = new java.util.HashMap();

    public final boolean N6(long j17, int i17, int i18) {
        java.lang.Long l17;
        java.lang.String O6 = O6(j17, i17, i18);
        java.util.HashMap hashMap = this.f95014e;
        boolean containsKey = hashMap.containsKey(O6);
        if (containsKey && (l17 = (java.lang.Long) hashMap.get(O6)) != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - l17.longValue();
            if (l17.longValue() <= 0 || currentTimeMillis >= 300000) {
                hashMap.remove(O6);
                return false;
            }
        }
        return containsKey;
    }

    public final java.lang.String O6(long j17, int i17, int i18) {
        java.lang.String str = java.lang.String.valueOf(j17) + java.lang.String.valueOf(i17) + java.lang.String.valueOf(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        return str;
    }

    public final boolean P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209411p9).mo141623x754a37bb()).r()).intValue() == 1;
    }

    public final void Q6(long j17, java.lang.String nonceId, int i17, r45.qt2 qt2Var, boolean z17, java.lang.String str, as2.h hVar, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        if (z17) {
            new db2.n4(j17, str == null ? "" : str, nonceId, i17, qt2Var).l().h(new as2.j(this, j17, nonceId, i17, z17, qt2Var, hVar, i18));
        } else {
            R6(j17, nonceId, 0L, "", i17, z17, qt2Var, hVar, i18);
        }
    }

    public final void R6(long j17, java.lang.String str, long j18, java.lang.String str2, int i17, boolean z17, r45.qt2 qt2Var, as2.h hVar, int i18) {
        new db2.g4(j17, str, i17, 2, "", true, null, null, 0L, null, false, false, "", qt2Var, i18, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536842176, null).l().h(new as2.i(this, j17, i17, j18, z17, i18, hVar));
    }

    public final void S6(long j17, int i17, long j18, boolean z17, int i18) {
        java.lang.String O6 = z17 ? O6(j18, i17, i18) : O6(j17, i17, i18);
        java.util.HashMap hashMap = this.f95014e;
        if (hashMap.containsKey(O6)) {
            hashMap.remove(O6);
        }
    }
}
