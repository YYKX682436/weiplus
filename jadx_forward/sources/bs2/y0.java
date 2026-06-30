package bs2;

/* loaded from: classes2.dex */
public final class y0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f105512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105513b;

    public y0(bs2.n1 n1Var, java.lang.String str) {
        this.f105512a = n1Var;
        this.f105513b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        bs2.n1 n1Var = this.f105512a;
        if (i17 == 0 && fVar.f152149b == 0 && fVar.f152151d != null) {
            java.lang.String str = n1Var.f105442c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadRedDotFeed: preload successfully. source=");
            sb6.append(this.f105513b);
            sb6.append(", tabType=");
            int i18 = n1Var.f105440a;
            sb6.append(i18);
            sb6.append(", feedId=");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            sb6.append(pm0.v.u(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            if (c19792x256d27252 != null) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(c19792x256d27252, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).bl(i18), null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209516v7).mo141623x754a37bb()).r()).intValue() == 1) {
                n1Var.d("GetRedDotFeed");
            }
        }
        n1Var.f105461v.f105375a = false;
        return jz5.f0.f384359a;
    }
}
