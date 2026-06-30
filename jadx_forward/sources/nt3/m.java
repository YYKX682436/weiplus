package nt3;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f421330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(nt3.a0 a0Var) {
        super(0);
        this.f421330d = a0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runAudioMix, mixType:");
        nt3.a0 a0Var = this.f421330d;
        int i17 = a0Var.f421245c;
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = a0Var.f421255m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (i17 == 1) {
            ls0.b1.d(a0Var.f421263u, null, 0L, 0L, 6, null);
            a0Var.g(false);
        } else if (kz5.c0.i(2, 3).contains(java.lang.Integer.valueOf(i17))) {
            try {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                ds0.d0 d0Var = new ds0.d0(i17, a0Var.f421251i, 1, new nt3.y(a0Var));
                a0Var.f421262t = d0Var;
                hs0.a aVar = a0Var.f421264v;
                ls0.b1 b1Var = a0Var.f421263u;
                d0Var.j(null, aVar, b1Var.f402333a, b1Var.f402334b);
                hs0.a aVar2 = a0Var.f421264v;
                android.media.MediaFormat mediaFormat = aVar2 != null ? aVar2.f366085f : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mediaFormat);
                if (!mediaFormat.containsKey(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63)) {
                    mediaFormat.setInteger(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37662xd14eba63, a0Var.f421250h);
                }
                mediaFormat.setInteger("channel-count", 1);
                ds0.d0 d0Var2 = a0Var.f421262t;
                if (d0Var2 != null) {
                    d0Var2.k(mediaFormat);
                }
                ds0.d0 d0Var3 = a0Var.f421262t;
                if (d0Var3 != null) {
                    d0Var3.m(new nt3.z(a0Var, elapsedRealtime));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "mix audio error: " + e17.getMessage(), new java.lang.Object[0]);
                a0Var.g(false);
            }
        } else if (i17 == 0) {
            a0Var.g(false);
        }
        return jz5.f0.f384359a;
    }
}
