package com.p314xaae8f345.mm.p793x2f25ba7b;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f149834a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f149835b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f149836c;

    /* renamed from: d, reason: collision with root package name */
    public final int f149837d;

    /* renamed from: e, reason: collision with root package name */
    public m11.b0 f149838e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f149839f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f149841h;

    /* renamed from: j, reason: collision with root package name */
    public dn.h f149843j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f149844k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f149845l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f149846m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f149847n;

    /* renamed from: g, reason: collision with root package name */
    public boolean f149840g = false;

    /* renamed from: i, reason: collision with root package name */
    public int f149842i = 0;

    public l(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p944x882e457a.o oVar, boolean z17, int i17, java.lang.String str) {
        this.f149835b = null;
        this.f149844k = false;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f149846m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(a0Var) { // from class: com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd$1
            {
                this.f39173x3fe91575 = 812146647;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 r13) {
                /*
                    Method dump skipped, instructions count: 449
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p793x2f25ba7b.C10740x6c2f1a61.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f149847n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7>(a0Var) { // from class: com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd$2
            {
                this.f39173x3fe91575 = 1700407223;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c72 = c5885x60bd3c7;
                com.p314xaae8f345.mm.p793x2f25ba7b.l lVar = com.p314xaae8f345.mm.p793x2f25ba7b.l.this;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(lVar.f149841h, c5885x60bd3c72.f136193g.f87811a) || !c5885x60bd3c72.f136193g.f87811a.equals(lVar.f149841h)) {
                    return false;
                }
                if (lVar.f149844k) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnNetSceneUploadMsgImgEnd", "androidSystemShareFixed(13717), imgLocalId:%d, scene.hash:%d, %s", java.lang.Long.valueOf(lVar.f149834a), java.lang.Integer.valueOf(lVar.hashCode()), lVar.f149839f);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(13717, lVar.f149839f);
                }
                lVar.f149846m.mo48814x2efc64();
                lVar.f149847n.mo48814x2efc64();
                com.p314xaae8f345.mm.p793x2f25ba7b.l.a(lVar, null);
                return false;
            }
        };
        this.f149834a = j17;
        this.f149835b = f9Var;
        this.f149836c = oVar;
        this.f149837d = i17;
        this.f149844k = z17;
        this.f149845l = str;
    }

    public static void a(com.p314xaae8f345.mm.p793x2f25ba7b.l lVar, java.lang.String str) {
        lVar.getClass();
        wi3.o oVar = new wi3.o();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = lVar.f149835b;
        oVar.f527768d = f9Var.I0();
        oVar.f527769e = 1;
        int i17 = lVar.f149837d;
        if (i17 == 1 || i17 == 2) {
            oVar.f527770f = 3;
        } else if (i17 != 4) {
            oVar.f527770f = 2;
        } else {
            oVar.f527770f = 1;
        }
        oVar.f527772h = f9Var.Q0();
        dn.h hVar = lVar.f149843j;
        oVar.f527774m = hVar == null ? "" : hVar.f69522xf9dbbe9c;
        oVar.f527775n = hVar == null ? "" : hVar.f69502xf11df5f5;
        oVar.f527776o = hVar != null ? hVar.f69526x419c9c3d : "";
        oVar.f527777p = f9Var.mo78012x3fdd41df();
        oVar.f527778q = 0;
        oVar.f527779r = 0;
        oVar.f527786y = str;
        oVar.A = lVar.f149845l;
        ((da0.e) ((ea0.f) i95.n0.c(ea0.f.class))).wi(oVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) ? 2 : 1, f9Var.mo78012x3fdd41df(), lVar.f149841h);
    }
}
