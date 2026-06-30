package ls0;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.k f402364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f402365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f402366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f402367g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f402368h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f402369i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ls0.k kVar, int i17, boolean z17, long j17, boolean z18, long j18) {
        super(0);
        this.f402364d = kVar;
        this.f402365e = i17;
        this.f402366f = z17;
        this.f402367g = j17;
        this.f402368h = z18;
        this.f402369i = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f402364d.f402401v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402364d.f402381b, "requestDraw textureId:" + this.f402365e);
            try {
                if (this.f402366f) {
                    long j17 = this.f402367g;
                    if (j17 != 0) {
                        android.opengl.GLES30.glWaitSync(j17, 0, -1L);
                        android.opengl.GLES30.glDeleteSync(this.f402367g);
                    }
                }
                if (this.f402368h) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b3 b3Var = qs0.a.f447740a;
                    synchronized (b3Var) {
                        synchronized (b3Var) {
                            while (!b3Var.f274005a) {
                                try {
                                    b3Var.wait();
                                } catch (java.lang.InterruptedException unused) {
                                }
                            }
                        }
                    }
                }
                ms0.c cVar = this.f402364d.f402380a;
                int i17 = this.f402365e;
                cVar.f412490m = i17;
                os0.a aVar = cVar.f412484g;
                if (aVar != null) {
                    aVar.r(i17);
                }
                this.f402364d.f402380a.p();
                ls0.k kVar = this.f402364d;
                if (kVar.f402386g != null) {
                    kVar.i(this.f402369i);
                    rs0.h hVar = this.f402364d.f402384e;
                    if (hVar != null) {
                        rs0.i.f480829a.x(hVar.f480825a, hVar.f480826b);
                    }
                }
                yz5.l lVar = this.f402364d.f402385f;
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f402364d.f402381b, e17, "", new java.lang.Object[0]);
                yz5.l lVar2 = this.f402364d.f402385f;
                if (lVar2 != null) {
                    lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f402364d.f402381b, "requestDraw not init now");
        }
        return jz5.f0.f384359a;
    }
}
