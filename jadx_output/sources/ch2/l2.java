package ch2;

/* loaded from: classes10.dex */
public final class l2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41400d;

    public l2(ch2.o2 o2Var) {
        this.f41400d = o2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        r45.ha4 ha4Var;
        r45.ga4 ga4Var;
        ch2.o2 o2Var = this.f41400d;
        if ((!o2Var.i7().b7() || o2Var.q7().f346307n == null || (o2Var.B && o2Var.C && o2Var.P != com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger)) ? false : true) {
            ah2.b k76 = this.f41400d.k7();
            if (k76 != null) {
                ((dh2.x) k76).f();
            }
            om2.i iVar = this.f41400d.q7().f346307n;
            if (iVar != null) {
                ch2.o2 o2Var2 = this.f41400d;
                r45.w84 w84Var = new r45.w84();
                synchronized (iVar.f346324d) {
                    ha4Var = new r45.ha4();
                    byte[] byteArray = iVar.f346324d.toByteArray();
                    if (byteArray != null) {
                        try {
                            ha4Var.parseFrom(byteArray);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                        }
                    }
                }
                w84Var.f388964d = ha4Var;
                synchronized (iVar.f346325e) {
                    ga4Var = new r45.ga4();
                    byte[] byteArray2 = iVar.f346325e.toByteArray();
                    if (byteArray2 != null) {
                        try {
                            ga4Var.parseFrom(byteArray2);
                        } catch (java.lang.Exception e18) {
                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                        }
                    }
                }
                w84Var.f388965e = ga4Var;
                r45.x84 x84Var = new r45.x84();
                x84Var.f389866e = o2Var2.A;
                x84Var.f389867f = iVar.f346322b;
                x84Var.f389868g = o2Var2.h7().m8();
                java.lang.String str = o2Var2.q7().f346306m;
                if (str == null) {
                    str = "";
                }
                x84Var.f389869h = str;
                x84Var.f389870i = iVar.f346323c;
                x84Var.f389865d.add(w84Var);
                x84Var.f389871m = iVar.f346326f;
                x84Var.f389872n = o2Var2.n7().P6();
                o2Var2.t7(x84Var);
                if (o2Var2.G) {
                    o2Var2.H.add(w84Var);
                } else {
                    o2Var2.G = true;
                    com.tencent.mm.plugin.finder.live.util.y.d(o2Var2, null, null, new ch2.v1(1000 / vn0.b.f438174a.c().f455432e, o2Var2, null), 3, null);
                }
            }
        }
        return true;
    }
}
