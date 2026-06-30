package r21;

@j95.b
/* loaded from: classes11.dex */
public class w extends i95.w {
    public static com.p314xaae8f345.mm.p2621x8fb0427b.q7 Ai() {
        gm0.j1.b().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.o7 wi6 = wi();
        com.p314xaae8f345.mm.p2621x8fb0427b.q7 q7Var = (com.p314xaae8f345.mm.p2621x8fb0427b.q7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ui();
        q7Var.add(wi6, gm0.j1.e().a());
        return q7Var;
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.u8 Bi() {
        gm0.j1.b().c();
        return (com.p314xaae8f345.mm.p2621x8fb0427b.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi();
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.qa Di() {
        gm0.j1.b().c();
        return (com.p314xaae8f345.mm.p2621x8fb0427b.qa) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).ij();
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.o7 wi() {
        gm0.j1.b().c();
        return (com.p314xaae8f345.mm.p2621x8fb0427b.o7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ri();
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        int W0 = wi().W0();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c01.d9.b().p().l(340225, null), 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVerify", "timeInterval = " + currentTimeMillis);
        if (currentTimeMillis <= 259200000 || W0 <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.o7 wi6 = wi();
        wi6.getClass();
        android.database.Cursor f17 = wi6.f276736d.f(java.lang.String.format("select %s from %s where isNew = 1 ORDER BY lastModifiedTime DESC limit %d", "contentNickname", "fmessage_conversation", 2), null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            arrayList.add(f17.getString(f17.getColumnIndex("contentNickname")));
        }
        f17.close();
        int size = arrayList.size();
        if (size > 0) {
            java.lang.String str = (java.lang.String) arrayList.get(0);
            for (int i17 = 1; i17 < size; i17++) {
                str = str + ", " + ((java.lang.String) arrayList.get(i17));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVerify", "title = " + str);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5765xb189a8e0 c5765xb189a8e0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5765xb189a8e0();
            am.ul ulVar = c5765xb189a8e0.f136082g;
            ulVar.f89636a = null;
            ulVar.f89637b = str;
            ulVar.f89638c = 0;
            c5765xb189a8e0.e();
            c01.d9.b().p().w(340225, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).g();
    }
}
