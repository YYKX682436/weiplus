package ls0;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.k f402350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f402351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f402352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f402353g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f402354h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ls0.k kVar, boolean z17, long j17, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        super(0);
        this.f402350d = kVar;
        this.f402351e = z17;
        this.f402352f = j17;
        this.f402353g = bitmap;
        this.f402354h = bitmap2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (!this.f402350d.f402401v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f402350d.f402381b, "requestDraw not init now");
        } else if (!this.f402351e || this.f402350d.f402388i) {
            try {
                java.lang.String str = this.f402350d.f402381b;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                android.os.SystemClock.elapsedRealtime();
                ms0.c cVar = this.f402350d.f402380a;
                if (cVar instanceof ms0.d) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.media.render.MixRenderer");
                    ((ms0.d) cVar).v(this.f402353g, this.f402354h);
                }
                java.lang.String str2 = this.f402350d.f402381b;
                android.os.SystemClock.elapsedRealtime();
                android.os.SystemClock.elapsedRealtime();
                ls0.k kVar = this.f402350d;
                if (kVar.f402386g != null) {
                    kVar.i(this.f402352f);
                    rs0.h hVar = this.f402350d.f402384e;
                    if (hVar != null) {
                        rs0.i.f480829a.x(hVar.f480825a, hVar.f480826b);
                    }
                    java.lang.String str3 = this.f402350d.f402381b;
                    android.os.SystemClock.elapsedRealtime();
                }
                yz5.l lVar = this.f402350d.f402385f;
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f402350d.f402381b, e17, "", new java.lang.Object[0]);
                yz5.l lVar2 = this.f402350d.f402385f;
                if (lVar2 != null) {
                    lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402350d.f402381b, "waitFistFrameAvailable and not firstFrameAvailable now, ignore");
            yz5.l lVar3 = this.f402350d.f402385f;
            if (lVar3 != null) {
                lVar3.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        }
        return jz5.f0.f384359a;
    }
}
