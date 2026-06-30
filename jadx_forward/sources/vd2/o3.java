package vd2;

/* loaded from: classes3.dex */
public final class o3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f517370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f517371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517372c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f517374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f517375f;

    public o3(long j17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str, java.lang.String str2, vd2.g5 g5Var, vd2.g5 g5Var2) {
        this.f517370a = j17;
        this.f517371b = c0Var;
        this.f517372c = str;
        this.f517373d = str2;
        this.f517374e = g5Var;
        this.f517375f = g5Var2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
        if (c19792x256d2725 == null) {
            return null;
        }
        long j17 = this.f517370a;
        vd2.t3.f517455b.put(java.lang.Long.valueOf(j17), new jz5.l(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), c19792x256d2725));
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0 && fVar.f152149b == 0) {
            if (this.f517371b.f391645d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1837L, 2L, 1L);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpLiveUI liveId: ");
            r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
            if (m76794xd0557130 != null) {
                j17 = m76794xd0557130.m75942xfb822ef2(0);
            }
            sb6.append(j17);
            sb6.append(", username:");
            java.lang.String m76836x6c03c64c = c19792x256d2725.m76836x6c03c64c();
            java.lang.String str = "";
            java.lang.String str2 = this.f517372c;
            if (m76836x6c03c64c == null) {
                m76836x6c03c64c = str2 == null ? "" : str2;
            }
            sb6.append(m76836x6c03c64c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtilApi", sb6.toString());
            java.lang.String str3 = this.f517373d;
            if (!(str3.length() > 0)) {
                str3 = null;
            }
            if (str3 != null) {
                java.lang.String m76836x6c03c64c2 = c19792x256d2725.m76836x6c03c64c();
                if (m76836x6c03c64c2 != null) {
                    str = m76836x6c03c64c2;
                } else if (str2 != null) {
                    str = str2;
                }
                p52.h.f433549a.f(str3, str);
            }
            vd2.g5 g5Var = this.f517374e;
            if (g5Var == null) {
                return null;
            }
            g5Var.a(null);
        } else {
            vd2.g5 g5Var2 = this.f517375f;
            if (g5Var2 == null) {
                return null;
            }
            g5Var2.a(java.lang.Integer.valueOf(fVar.f152149b));
        }
        return f0Var;
    }
}
