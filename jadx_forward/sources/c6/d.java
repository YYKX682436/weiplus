package c6;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.o f120318a;

    /* renamed from: b, reason: collision with root package name */
    public final d6.h f120319b;

    /* renamed from: c, reason: collision with root package name */
    public final d6.g f120320c;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p0 f120321d;

    /* renamed from: e, reason: collision with root package name */
    public final g6.e f120322e;

    /* renamed from: f, reason: collision with root package name */
    public final d6.d f120323f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Bitmap.Config f120324g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f120325h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Boolean f120326i;

    /* renamed from: j, reason: collision with root package name */
    public final c6.b f120327j;

    /* renamed from: k, reason: collision with root package name */
    public final c6.b f120328k;

    /* renamed from: l, reason: collision with root package name */
    public final c6.b f120329l;

    public d(p012xc85e97e9.p093xedfae76a.o oVar, d6.h hVar, d6.g gVar, p3325xe03a0797.p3326xc267989b.p0 p0Var, g6.e eVar, d6.d dVar, android.graphics.Bitmap.Config config, java.lang.Boolean bool, java.lang.Boolean bool2, c6.b bVar, c6.b bVar2, c6.b bVar3) {
        this.f120318a = oVar;
        this.f120319b = hVar;
        this.f120320c = gVar;
        this.f120321d = p0Var;
        this.f120322e = eVar;
        this.f120323f = dVar;
        this.f120324g = config;
        this.f120325h = bool;
        this.f120326i = bool2;
        this.f120327j = bVar;
        this.f120328k = bVar2;
        this.f120329l = bVar3;
    }

    /* renamed from: equals */
    public boolean m14199xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c6.d) {
            c6.d dVar = (c6.d) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120318a, dVar.f120318a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120319b, dVar.f120319b) && this.f120320c == dVar.f120320c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120321d, dVar.f120321d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120322e, dVar.f120322e) && this.f120323f == dVar.f120323f && this.f120324g == dVar.f120324g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120325h, dVar.f120325h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120326i, dVar.f120326i) && this.f120327j == dVar.f120327j && this.f120328k == dVar.f120328k && this.f120329l == dVar.f120329l) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m14200x8cdac1b() {
        p012xc85e97e9.p093xedfae76a.o oVar = this.f120318a;
        int hashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        d6.h hVar = this.f120319b;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        d6.g gVar = this.f120320c;
        int hashCode3 = (hashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = this.f120321d;
        int hashCode4 = (hashCode3 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        g6.e eVar = this.f120322e;
        int hashCode5 = (hashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d6.d dVar = this.f120323f;
        int hashCode6 = (hashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        android.graphics.Bitmap.Config config = this.f120324g;
        int hashCode7 = (hashCode6 + (config == null ? 0 : config.hashCode())) * 31;
        java.lang.Boolean bool = this.f120325h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Boolean bool2 = this.f120326i;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        c6.b bVar = this.f120327j;
        int hashCode10 = (hashCode9 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c6.b bVar2 = this.f120328k;
        int hashCode11 = (hashCode10 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        c6.b bVar3 = this.f120329l;
        return hashCode11 + (bVar3 != null ? bVar3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m14201x9616526c() {
        return "DefinedRequestOptions(lifecycle=" + this.f120318a + ", sizeResolver=" + this.f120319b + ", scale=" + this.f120320c + ", dispatcher=" + this.f120321d + ", transition=" + this.f120322e + ", precision=" + this.f120323f + ", bitmapConfig=" + this.f120324g + ", allowHardware=" + this.f120325h + ", allowRgb565=" + this.f120326i + ", memoryCachePolicy=" + this.f120327j + ", diskCachePolicy=" + this.f120328k + ", networkCachePolicy=" + this.f120329l + ')';
    }
}
