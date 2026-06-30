package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f66714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f66715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f66716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f66717g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s40.t0 f66718h;

    public g2(com.tencent.mm.modelbase.f fVar, com.tencent.mm.feature.finder.live.v4 v4Var, long j17, int i17, s40.t0 t0Var) {
        this.f66714d = fVar;
        this.f66715e = v4Var;
        this.f66716f = j17;
        this.f66717g = i17;
        this.f66718h = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.lw1 lw1Var;
        r45.nw1 nw1Var;
        r45.nw1 nw1Var2;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.lang.Object obj;
        r45.d84 d84Var;
        com.tencent.mm.modelbase.f fVar = this.f66714d;
        int i17 = fVar.f70615a;
        long j17 = this.f66716f;
        if (i17 != 0 || fVar.f70616b != 0) {
            pm0.v.X(new com.tencent.mm.feature.finder.live.f2(this.f66718h, j17));
            return;
        }
        r45.nw1 nw1Var3 = (r45.nw1) ((r45.l71) fVar.f70618d).getCustom(1);
        int integer = nw1Var3 != null ? nw1Var3.getInteger(2) : 1;
        r45.l71 l71Var = (r45.l71) fVar.f70618d;
        com.tencent.mm.feature.finder.live.v4 v4Var = this.f66715e;
        if (l71Var != null && (d84Var = (r45.d84) l71Var.getCustom(9)) != null) {
            java.lang.String string = d84Var.getString(0);
            if (!(string == null || string.length() == 0)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(d84Var.getString(0));
                java.lang.String string2 = d84Var.getString(1);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string2 == null) {
                    string2 = "";
                }
                sb6.append(string2);
                v4Var.Ak(j17, sb6.toString());
            }
        }
        r45.l71 l71Var2 = (r45.l71) fVar.f70618d;
        if (l71Var2 == null || (list2 = l71Var2.getList(15)) == null) {
            lw1Var = null;
        } else {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.lw1) obj).getInteger(5) == 2) {
                        break;
                    }
                }
            }
            lw1Var = (r45.lw1) obj;
        }
        java.lang.String string3 = lw1Var != null ? lw1Var.getString(0) : null;
        if (!(string3 == null || string3.length() == 0)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(lw1Var != null ? lw1Var.getString(0) : null);
            java.lang.String string4 = lw1Var != null ? lw1Var.getString(1) : null;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb7.append(string4 != null ? string4 : "");
            v4Var.Ak(j17, sb7.toString());
        }
        pm0.v.X(new com.tencent.mm.feature.finder.live.e2(this.f66718h, this.f66716f, integer, this.f66714d));
        v4Var.f66986g.put(java.lang.Long.valueOf(j17), new jz5.o(java.lang.Integer.valueOf(integer), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), fVar.f70618d));
        v4Var.f66989m.put(new jz5.l(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f66717g)), java.lang.Integer.valueOf(((r45.l71) fVar.f70618d).getInteger(25)));
        r45.l71 l71Var3 = (r45.l71) fVar.f70618d;
        if (l71Var3 != null && (nw1Var2 = (r45.nw1) l71Var3.getCustom(1)) != null && (list = nw1Var2.getList(51)) != null) {
            v4Var.f66988i.put(java.lang.Long.valueOf(j17), list);
        }
        zy2.v.f477591b = ((r45.l71) fVar.f70618d).getInteger(3);
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3723d4).getValue()).r()).intValue() != 1 || (nw1Var = (r45.nw1) ((r45.l71) fVar.f70618d).getCustom(1)) == null) {
            return;
        }
        r45.co1 co1Var = new r45.co1();
        co1Var.set(0, 1);
        co1Var.set(1, "屏蔽测试\nBAN_TEST");
        nw1Var.set(43, co1Var);
    }
}
