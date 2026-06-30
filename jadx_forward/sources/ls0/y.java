package ls0;

/* loaded from: classes10.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f402491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ls0.r0 r0Var) {
        super(0);
        this.f402491d = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runAudioMix, mixType:");
        ls0.r0 r0Var = this.f402491d;
        int i17 = r0Var.f402424c;
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = r0Var.f402449t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        hs0.a aVar = r0Var.f402419J;
        if (aVar != null) {
            aVar.f();
        }
        if (i17 == 1) {
            ls0.b1.d(r0Var.H, r0Var.f402419J, 0L, 0L, 6, null);
            r0Var.g(false);
        } else if (kz5.c0.i(2, 3).contains(java.lang.Integer.valueOf(i17))) {
            try {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                ds0.d0 d0Var = new ds0.d0(i17, r0Var.f402436i, r0Var.f402438j, new ls0.o0(r0Var));
                r0Var.E = d0Var;
                hs0.a aVar2 = r0Var.f402419J;
                hs0.a aVar3 = r0Var.I;
                ls0.b1 b1Var = r0Var.H;
                d0Var.j(aVar2, aVar3, b1Var.f402333a, b1Var.f402334b);
                hs0.a aVar4 = r0Var.I;
                android.media.MediaFormat mediaFormat = aVar4 != null ? aVar4.f366085f : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mediaFormat);
                if (!mediaFormat.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63)) {
                    mediaFormat.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, r0Var.f402434h);
                }
                mediaFormat.setInteger("channel-count", r0Var.f402438j);
                ds0.d0 d0Var2 = r0Var.E;
                if (d0Var2 != null) {
                    d0Var2.k(mediaFormat);
                }
                ds0.d0 d0Var3 = r0Var.E;
                if (d0Var3 != null) {
                    d0Var3.m(new ls0.p0(r0Var, elapsedRealtime));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "mix audio error: " + e17.getMessage(), new java.lang.Object[0]);
                r0Var.g(false);
            }
        } else if (i17 == 0) {
            r0Var.g(false);
        }
        return jz5.f0.f384359a;
    }
}
