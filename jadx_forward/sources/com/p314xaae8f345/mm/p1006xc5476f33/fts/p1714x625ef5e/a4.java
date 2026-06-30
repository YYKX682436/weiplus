package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes5.dex */
public class a4 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f218986n;

    /* renamed from: o, reason: collision with root package name */
    public final int f218987o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c4 f218988p;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c4 c4Var, int i17, java.lang.String str) {
        this.f218988p = c4Var;
        this.f218987o = i17;
        this.f218986n = str;
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.c4 c4Var = this.f218988p;
        if (c4Var.f219017f == null) {
            c4Var.f219017f = com.p314xaae8f345.mm.vfs.w6.M("/sdcard/test_insert_msg_words.txt").split(",");
        }
        if (c4Var.f219018g == null) {
            c4Var.f219018g = new java.util.ArrayList();
            java.lang.String str = this.f218986n;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                android.database.Cursor r17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().r();
                while (r17.moveToNext()) {
                    c4Var.f219018g.add(r17.getString(0));
                }
                r17.close();
            } else {
                c4Var.f219018g.add(str);
            }
        }
        if (c4Var.f219017f != null) {
            int i17 = 0;
            while (true) {
                int i18 = this.f218987o;
                if (i17 >= i18) {
                    break;
                }
                java.lang.String[] strArr = c4Var.f219017f;
                java.util.Random random = new java.util.Random();
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                for (int i19 = 0; i19 < 300; i19++) {
                    stringBuffer.append(strArr[random.nextInt(strArr.length - 1)]);
                }
                java.lang.String stringBuffer2 = stringBuffer.toString();
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.m124850x7650bebc(1);
                f9Var.j1(1);
                f9Var.r1(4);
                f9Var.d1(stringBuffer2);
                java.util.List list = c4Var.f219018g;
                f9Var.u1((java.lang.String) (list.size() > 1 ? list.get(new java.util.Random().nextInt(list.size() - 1)) : list.get(0)));
                f9Var.e1(java.lang.System.currentTimeMillis() - 250327040);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSSearchTestLogic", "InsertMsgInfoTask %d %d %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(stringBuffer2.length()), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                i17++;
            }
        }
        return true;
    }
}
