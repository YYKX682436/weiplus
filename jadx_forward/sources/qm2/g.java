package qm2;

/* loaded from: classes3.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm2.k f446255a;

    public g(qm2.k kVar) {
        this.f446255a = kVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var;
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        java.util.LinkedList linkedList;
        r45.wc6 wc6Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLiveNetSpeedTestUIC", "CgiTestClientSpeed errType:" + fVar.f152148a + " errCode:" + fVar.f152149b);
        r45.p40 p40Var = (r45.p40) fVar.f152151d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        qm2.k kVar = this.f446255a;
        jz5.f0 f0Var2 = null;
        r5 = null;
        byte[] bArr = null;
        if (p40Var != null) {
            if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                kVar.getClass();
                r45.yc6 yc6Var = (r45.yc6) p40Var.m75936x14adae67(1);
                java.lang.String str = (yc6Var == null || (linkedList = yc6Var.f472499d) == null || (wc6Var = (r45.wc6) kz5.n0.a0(linkedList, 0)) == null) ? null : wc6Var.f470603d;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = str;
                r45.yc6 yc6Var2 = (r45.yc6) p40Var.m75936x14adae67(1);
                int i17 = yc6Var2 != null ? yc6Var2.f472501f : 0;
                r45.yc6 yc6Var3 = (r45.yc6) p40Var.m75936x14adae67(2);
                int i18 = yc6Var3 != null ? yc6Var3.f472501f : 0;
                r45.yc6 yc6Var4 = (r45.yc6) p40Var.m75936x14adae67(1);
                int i19 = yc6Var4 != null ? yc6Var4.f472503h : 0;
                r45.yc6 yc6Var5 = (r45.yc6) p40Var.m75936x14adae67(2);
                int i27 = yc6Var5 != null ? yc6Var5.f472503h : 0;
                r45.yc6 yc6Var6 = (r45.yc6) p40Var.m75936x14adae67(1);
                byte[] g17 = (yc6Var6 == null || (gVar2 = yc6Var6.f472502g) == null) ? null : gVar2.g();
                r45.yc6 yc6Var7 = (r45.yc6) p40Var.m75936x14adae67(2);
                if (yc6Var7 != null && (gVar = yc6Var7.f472502g) != null) {
                    bArr = gVar.g();
                }
                byte[] bArr2 = bArr;
                gm0.y n17 = gm0.j1.n();
                if (n17 != null && (r1Var = n17.f354821b) != null && (sVar = r1Var.f152297d) != null) {
                    sVar.P(str2, i17, i18, i19, i27, g17, bArr2, new qm2.j(kVar));
                }
            } else {
                qm2.k.O6(kVar, "CgiTestClientSpeed failed: " + fVar.f152148a + ", " + fVar.f152149b);
            }
            f0Var2 = f0Var;
        }
        if (f0Var2 == null) {
            qm2.k.O6(kVar, "Empty response from CgiTestClientSpeed");
        }
        return f0Var;
    }
}
