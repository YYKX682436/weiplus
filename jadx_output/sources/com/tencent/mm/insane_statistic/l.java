package com.tencent.mm.insane_statistic;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f68301a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f68302b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f68303c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68304d;

    /* renamed from: e, reason: collision with root package name */
    public m11.b0 f68305e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f68306f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f68308h;

    /* renamed from: j, reason: collision with root package name */
    public dn.h f68310j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f68311k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f68312l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f68313m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f68314n;

    /* renamed from: g, reason: collision with root package name */
    public boolean f68307g = false;

    /* renamed from: i, reason: collision with root package name */
    public int f68309i = 0;

    public l(long j17, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.modelbase.o oVar, boolean z17, int i17, java.lang.String str) {
        this.f68302b = null;
        this.f68311k = false;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f68313m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(a0Var) { // from class: com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd$1
            {
                this.__eventId = 812146647;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent r13) {
                /*
                    Method dump skipped, instructions count: 449
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f68314n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent>(a0Var) { // from class: com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd$2
            {
                this.__eventId = 1700407223;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent2 = recogQBarOfImageFileFailedEvent;
                com.tencent.mm.insane_statistic.l lVar = com.tencent.mm.insane_statistic.l.this;
                if (com.tencent.mm.sdk.platformtools.t8.N0(lVar.f68308h, recogQBarOfImageFileFailedEvent2.f54660g.f6278a) || !recogQBarOfImageFileFailedEvent2.f54660g.f6278a.equals(lVar.f68308h)) {
                    return false;
                }
                if (lVar.f68311k) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OnNetSceneUploadMsgImgEnd", "androidSystemShareFixed(13717), imgLocalId:%d, scene.hash:%d, %s", java.lang.Long.valueOf(lVar.f68301a), java.lang.Integer.valueOf(lVar.hashCode()), lVar.f68306f);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(13717, lVar.f68306f);
                }
                lVar.f68313m.dead();
                lVar.f68314n.dead();
                com.tencent.mm.insane_statistic.l.a(lVar, null);
                return false;
            }
        };
        this.f68301a = j17;
        this.f68302b = f9Var;
        this.f68303c = oVar;
        this.f68304d = i17;
        this.f68311k = z17;
        this.f68312l = str;
    }

    public static void a(com.tencent.mm.insane_statistic.l lVar, java.lang.String str) {
        lVar.getClass();
        wi3.o oVar = new wi3.o();
        com.tencent.mm.storage.f9 f9Var = lVar.f68302b;
        oVar.f446235d = f9Var.I0();
        oVar.f446236e = 1;
        int i17 = lVar.f68304d;
        if (i17 == 1 || i17 == 2) {
            oVar.f446237f = 3;
        } else if (i17 != 4) {
            oVar.f446237f = 2;
        } else {
            oVar.f446237f = 1;
        }
        oVar.f446239h = f9Var.Q0();
        dn.h hVar = lVar.f68310j;
        oVar.f446241m = hVar == null ? "" : hVar.field_fileId;
        oVar.f446242n = hVar == null ? "" : hVar.field_aesKey;
        oVar.f446243o = hVar != null ? hVar.field_filemd5 : "";
        oVar.f446244p = f9Var.getCreateTime();
        oVar.f446245q = 0;
        oVar.f446246r = 0;
        oVar.f446253y = str;
        oVar.A = lVar.f68312l;
        ((da0.e) ((ea0.f) i95.n0.c(ea0.f.class))).wi(oVar, com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? 2 : 1, f9Var.getCreateTime(), lVar.f68308h);
    }
}
