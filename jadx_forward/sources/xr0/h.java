package xr0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final xr0.i f537701a;

    /* renamed from: b, reason: collision with root package name */
    public final xr0.c f537702b;

    /* renamed from: c, reason: collision with root package name */
    public final xr0.g f537703c;

    /* renamed from: d, reason: collision with root package name */
    public final xr0.b f537704d;

    public h(xr0.i iVar, xr0.c cVar, xr0.g gVar, xr0.b bVar) {
        this.f537701a = iVar;
        this.f537702b = cVar;
        this.f537703c = gVar;
        this.f537704d = bVar;
    }

    /* renamed from: equals */
    public boolean m175793xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.h)) {
            return false;
        }
        xr0.h hVar = (xr0.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537701a, hVar.f537701a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537702b, hVar.f537702b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537703c, hVar.f537703c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537704d, hVar.f537704d);
    }

    /* renamed from: hashCode */
    public int m175794x8cdac1b() {
        xr0.i iVar = this.f537701a;
        int m175797x8cdac1b = (iVar == null ? 0 : iVar.m175797x8cdac1b()) * 31;
        xr0.c cVar = this.f537702b;
        int m175785x8cdac1b = (m175797x8cdac1b + (cVar == null ? 0 : cVar.m175785x8cdac1b())) * 31;
        xr0.g gVar = this.f537703c;
        int m175791x8cdac1b = (m175785x8cdac1b + (gVar == null ? 0 : gVar.m175791x8cdac1b())) * 31;
        xr0.b bVar = this.f537704d;
        return m175791x8cdac1b + (bVar != null ? bVar.m175782x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m175795x9616526c() {
        return "CameraKitSetting(uiSetting=" + this.f537701a + ", commonSetting=" + this.f537702b + ", reportSetting=" + this.f537703c + ", abilitySetting=" + this.f537704d + ')';
    }

    public /* synthetic */ h(xr0.i iVar, xr0.c cVar, xr0.g gVar, xr0.b bVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar2) {
        this((i17 & 1) != 0 ? null : iVar, (i17 & 2) != 0 ? null : cVar, (i17 & 4) != 0 ? null : gVar, (i17 & 8) != 0 ? null : bVar);
    }
}
