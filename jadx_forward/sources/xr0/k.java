package xr0;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public volatile xr0.j f537708a;

    /* renamed from: b, reason: collision with root package name */
    public volatile xr0.j f537709b;

    /* renamed from: c, reason: collision with root package name */
    public volatile xr0.j f537710c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f537711d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f537712e;

    public k(xr0.j surfaceSize, xr0.j cameraSize, xr0.j outputSize, int i17, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        surfaceSize = (i18 & 1) != 0 ? new xr0.j(0, 0) : surfaceSize;
        cameraSize = (i18 & 2) != 0 ? new xr0.j(0, 0) : cameraSize;
        outputSize = (i18 & 4) != 0 ? new xr0.j(0, 0) : outputSize;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        z17 = (i18 & 16) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceSize, "surfaceSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraSize, "cameraSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputSize, "outputSize");
        this.f537708a = surfaceSize;
        this.f537709b = cameraSize;
        this.f537710c = outputSize;
        this.f537711d = i17;
        this.f537712e = z17;
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitModel", "updateOutputSize before >> origin >> " + this);
        xr0.j jVar = this.f537708a;
        boolean z17 = false;
        if (jVar.f537706a > 0 && jVar.f537707b > 0) {
            xr0.j jVar2 = this.f537709b;
            if (jVar2.f537706a > 0 && jVar2.f537707b > 0) {
                z17 = true;
            }
            if (z17) {
                if (this.f537711d == 90 || this.f537711d == 270) {
                    if (1 / this.f537709b.a() > this.f537708a.a()) {
                        this.f537710c.f537706a = this.f537709b.f537707b;
                        this.f537710c.f537707b = (int) (this.f537710c.f537706a * this.f537708a.a());
                    } else {
                        this.f537710c.f537707b = this.f537709b.f537706a;
                        this.f537710c.f537706a = (int) (this.f537710c.f537707b / this.f537708a.a());
                    }
                } else if (this.f537709b.a() > this.f537708a.a()) {
                    this.f537710c.f537706a = this.f537709b.f537706a;
                    this.f537710c.f537707b = (int) (this.f537710c.f537706a * this.f537708a.a());
                } else {
                    this.f537710c.f537707b = this.f537709b.f537707b;
                    this.f537710c.f537706a = (int) (this.f537710c.f537707b / this.f537708a.a());
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitModel", "updateOutputSize after >>  " + this);
    }

    public final boolean b(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitModel", "updateSurfaceSize >> param: " + i17 + ' ' + i18 + " origin >> " + this);
        if (this.f537708a.f537706a == i17 && this.f537708a.f537707b == i18) {
            return false;
        }
        this.f537708a.f537706a = i17;
        this.f537708a.f537707b = i18;
        a();
        return true;
    }

    /* renamed from: equals */
    public boolean m175802xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.k)) {
            return false;
        }
        xr0.k kVar = (xr0.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537708a, kVar.f537708a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537709b, kVar.f537709b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537710c, kVar.f537710c) && this.f537711d == kVar.f537711d && this.f537712e == kVar.f537712e;
    }

    /* renamed from: hashCode */
    public int m175803x8cdac1b() {
        return (((((((this.f537708a.m175800x8cdac1b() * 31) + this.f537709b.m175800x8cdac1b()) * 31) + this.f537710c.m175800x8cdac1b()) * 31) + java.lang.Integer.hashCode(this.f537711d)) * 31) + java.lang.Boolean.hashCode(this.f537712e);
    }

    /* renamed from: toString */
    public java.lang.String m175804x9616526c() {
        return "surfaceSize: " + this.f537708a + " cameraSize: " + this.f537709b + " outputSize: " + this.f537710c + " preview: " + this.f537711d + " mirror: " + this.f537712e;
    }
}
