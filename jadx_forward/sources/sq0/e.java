package sq0;

/* loaded from: classes4.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f492866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f492867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f492868f;

    public e(int i17, java.lang.String str, java.lang.String str2) {
        this.f492866d = i17;
        this.f492867e = str;
        this.f492868f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f492866d;
        if (i17 <= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicSclPlaceHolderService.SCL", "updateHeight, ignore too small");
            return;
        }
        gq0.x xVar = (gq0.x) i95.n0.c(gq0.x.class);
        java.lang.String str = this.f492867e;
        java.lang.String c17 = vq0.b.c(str);
        uq0.h hVar = (uq0.h) xVar;
        hVar.getClass();
        java.lang.String frameSetId = this.f492868f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        boolean z17 = false;
        if (i17 != 0) {
            jz5.g gVar = hVar.f511733d;
            uq0.e y07 = ((uq0.f) ((jz5.n) gVar).mo141623x754a37bb()).y0(c17, frameSetId);
            if ((y07 == null ? 0 : y07.f65901x1c542321) != i17) {
                uq0.e eVar = new uq0.e();
                eVar.f65900x6ebe57f9 = c17;
                eVar.f65902xf11f4305 = vq0.a.b(frameSetId);
                java.lang.String q07 = r26.n0.q0(frameSetId, "-", frameSetId);
                eVar.f65903x828b13a1 = r26.n0.s0(q07, "_", q07);
                eVar.f65901x1c542321 = i17;
                hVar.f511734e.put(c17.concat(frameSetId), eVar);
                uq0.f fVar = (uq0.f) ((jz5.n) gVar).mo141623x754a37bb();
                fVar.getClass();
                z17 = fVar.y0(c17, frameSetId) != null ? fVar.mo9952xce0038c9(eVar, "bizName", "frameSetName", "frameSetRootPath") : fVar.mo880xb970c2b9(eVar);
            }
        }
        if (z17) {
            java.lang.String wi6 = ((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).wi(str, frameSetId);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MagicSclPlaceHolderService.SCL", "updateHeight, height changed, delete local cover " + wi6 + ", ret: " + com.p314xaae8f345.mm.vfs.w6.h(wi6) + ", dpHeight: " + i17);
        }
    }
}
