package ux0;

/* loaded from: classes14.dex */
public final class c implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4036x2fdcc50d {

    /* renamed from: a, reason: collision with root package name */
    public final is0.c f513318a;

    /* renamed from: b, reason: collision with root package name */
    public long f513319b;

    /* renamed from: c, reason: collision with root package name */
    public long f513320c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f513321d;

    /* renamed from: e, reason: collision with root package name */
    public ux0.f f513322e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f513323f;

    public c(is0.c textureObj, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureObj, "textureObj");
        this.f513318a = textureObj;
        this.f513319b = j17;
        this.f513323f = new java.lang.Object();
    }

    public final void a() {
        synchronized (this.f513323f) {
            while (this.f513321d && this.f513322e == null) {
                this.f513323f.wait();
            }
            ux0.f fVar = this.f513322e;
            if (fVar != null) {
                long j17 = fVar.f513328a;
                if (j17 != 0 && android.opengl.GLES30.glIsSync(j17)) {
                    android.opengl.GLES30.glWaitSync(j17, 0, -1L);
                }
                long j18 = fVar.f513328a;
                if (j18 != 0 && android.opengl.GLES30.glIsSync(j18)) {
                    android.opengl.GLES30.glDeleteSync(j18);
                }
                this.f513321d = true;
                this.f513322e = null;
            }
        }
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2
    /* renamed from: accessibility */
    public int mo32464xf34bc14e() {
        return 0;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4036x2fdcc50d
    /* renamed from: getFenceSyncObj */
    public long mo32904x752d2161() {
        return this.f513320c;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2
    /* renamed from: getFrameCWAngle */
    public int mo32467xdcde8d28() {
        return 0;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2
    /* renamed from: getHeight */
    public int mo32468x1c4fb41d() {
        return this.f513318a.f375934n;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4036x2fdcc50d
    /* renamed from: getTextureName */
    public int mo32905x3a030510() {
        return this.f513318a.f375928e;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4034x40fb94d
    /* renamed from: getTimestamp */
    public long mo32473x2b69a60() {
        return this.f513319b;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2
    /* renamed from: getWidth */
    public int mo32474x755bd410() {
        return this.f513318a.f375933m;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2
    /* renamed from: isMirrored */
    public boolean mo32475x87092be8() {
        return false;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4037x150215d2
    /* renamed from: release */
    public void mo32476x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CamSessionTextureVideoFrame", "release");
        synchronized (this.f513323f) {
            this.f513321d = false;
            this.f513323f.notifyAll();
        }
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.p462x5d2a96d.InterfaceC4036x2fdcc50d
    /* renamed from: release */
    public void mo32906x41012807(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CamSessionTextureVideoFrame", "release with syncObj " + j17);
        synchronized (this.f513323f) {
            ux0.f fVar = this.f513322e;
            if (fVar != null) {
                long j18 = fVar.f513328a;
                if (j18 != 0 && android.opengl.GLES30.glIsSync(j18)) {
                    android.opengl.GLES30.glDeleteSync(j18);
                }
                this.f513322e = null;
            }
            this.f513322e = new ux0.f(j17);
            this.f513323f.notifyAll();
        }
    }
}
