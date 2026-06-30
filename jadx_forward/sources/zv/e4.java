package zv;

/* loaded from: classes10.dex */
public final class e4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f557493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d f557494b;

    public e4(yz5.l lVar, com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d) {
        this.f557493a = lVar;
        this.f557494b = c10465x1b7ee7d;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
        int i17 = fVar.f152148a;
        yz5.l lVar = this.f557493a;
        if (i17 != 0 || fVar.f152149b != 0 || c19792x256d2725 == null || c19792x256d2725.m76794xd0557130() == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23444x3050181a(null, null, null, null, -1L, null, 47, null))));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f557494b.f146722d, "[requestFinderLiveStats] error " + fVar.f152148a + ", " + fVar.f152149b + '}');
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.Long valueOf = java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11());
            r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m76794xd0557130);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0));
            java.lang.String m76836x6c03c64c = c19792x256d2725.m76836x6c03c64c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725.m76794xd0557130());
            java.lang.Long valueOf3 = java.lang.Long.valueOf(r2.m75939xb282bd08(1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725.m76794xd0557130());
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23444x3050181a(valueOf, valueOf2, m76836x6c03c64c, valueOf3, java.lang.Long.valueOf(r0.m75939xb282bd08(2)), null, 32, null))));
        }
        return jz5.f0.f384359a;
    }
}
