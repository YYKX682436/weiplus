package db2;

/* loaded from: classes10.dex */
public final class m0 extends az2.j {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f309599v = 0;

    /* renamed from: t, reason: collision with root package name */
    public final nv2.a0 f309600t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f309601u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m0(nv2.a0 r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.m0.<init>(nv2.a0, boolean):void");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.t31 resp = (r45.t31) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.String str2 = this.f309601u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        int i19 = 0;
        nv2.a0 a0Var = this.f309600t;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) resp.m75936x14adae67(1);
            if (c19782x23db1cfa != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "newContact.followFlag: " + java.lang.Integer.valueOf(c19782x23db1cfa.m76170x756826b3()));
                ya2.h.f542017a.i(a0Var.f421965d, c19782x23db1cfa.m76170x756826b3());
                return;
            }
            ya2.g gVar = ya2.h.f542017a;
            java.lang.String str3 = a0Var.f421965d;
            if (a0Var.f421966e == 1) {
                i19 = ya2.b2.Q2;
            } else {
                l75.e0 e0Var = ya2.b2.O2;
            }
            gVar.i(str3, i19);
            return;
        }
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hz2.d.f367846a.h(i17, i18, str);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
        long j17 = a0Var.f421967f;
        am.ia iaVar = c5445x963cab3.f135785g;
        iaVar.f88451a = j17;
        iaVar.f88452b = 1;
        c5445x963cab3.e();
        ya2.g gVar2 = ya2.h.f542017a;
        if (a0Var.f421966e == 1) {
            l75.e0 e0Var2 = ya2.b2.O2;
        } else {
            i19 = ya2.b2.Q2;
        }
        gVar2.i(a0Var.f421965d, i19);
    }
}
