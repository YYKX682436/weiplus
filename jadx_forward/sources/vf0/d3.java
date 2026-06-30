package vf0;

/* loaded from: classes12.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f517673a;

    /* renamed from: b, reason: collision with root package name */
    public final int f517674b;

    /* renamed from: c, reason: collision with root package name */
    public dn.h f517675c;

    /* renamed from: d, reason: collision with root package name */
    public dn.h f517676d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f517677e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f517678f;

    public d3(boolean z17, int i17, dn.h hVar, dn.h hVar2, java.lang.String uploadThumbPath, boolean z18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        hVar = (i18 & 4) != 0 ? null : hVar;
        hVar2 = (i18 & 8) != 0 ? null : hVar2;
        uploadThumbPath = (i18 & 16) != 0 ? "" : uploadThumbPath;
        z18 = (i18 & 32) != 0 ? false : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uploadThumbPath, "uploadThumbPath");
        this.f517673a = z17;
        this.f517674b = i17;
        this.f517675c = hVar;
        this.f517676d = hVar2;
        this.f517677e = uploadThumbPath;
        this.f517678f = z18;
    }

    /* renamed from: equals */
    public boolean m171729xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf0.d3)) {
            return false;
        }
        vf0.d3 d3Var = (vf0.d3) obj;
        return this.f517673a == d3Var.f517673a && this.f517674b == d3Var.f517674b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517675c, d3Var.f517675c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517676d, d3Var.f517676d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517677e, d3Var.f517677e) && this.f517678f == d3Var.f517678f;
    }

    /* renamed from: hashCode */
    public int m171730x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f517673a) * 31) + java.lang.Integer.hashCode(this.f517674b)) * 31;
        dn.h hVar = this.f517675c;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        dn.h hVar2 = this.f517676d;
        return ((((hashCode2 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31) + this.f517677e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f517678f);
    }

    /* renamed from: toString */
    public java.lang.String m171731x9616526c() {
        return "VideoSendInnerCrossParams(needDeleteImportPath=" + this.f517673a + ", filecrc=" + this.f517674b + ", thumbVideoCdnTaskInfo=" + this.f517675c + ", originVideoCdnTaskInfo=" + this.f517676d + ", uploadThumbPath=" + this.f517677e + ", hasTempThumbFile=" + this.f517678f + ')';
    }
}
