package v11;

/* loaded from: classes11.dex */
public final class t implements q31.p {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f513995d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f513996e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f513997f;

    /* renamed from: g, reason: collision with root package name */
    public final v11.e0 f513998g;

    /* renamed from: h, reason: collision with root package name */
    public final v11.h f513999h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f514000i;

    /* renamed from: m, reason: collision with root package name */
    public final long f514001m;

    public t(java.util.List blocks, boolean z17, java.lang.String rawContent, v11.e0 e0Var, v11.h hVar, yz5.l lVar, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blocks, "blocks");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawContent, "rawContent");
        this.f513995d = blocks;
        this.f513996e = z17;
        this.f513997f = rawContent;
        this.f513998g = e0Var;
        this.f513999h = hVar;
        this.f514000i = lVar;
        this.f514001m = j17;
    }

    /* renamed from: clone */
    public java.lang.Object m170948x5a5dd5d() {
        return super.clone();
    }

    /* renamed from: equals */
    public boolean m170949xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.t)) {
            return false;
        }
        v11.t tVar = (v11.t) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513995d, tVar.f513995d) && this.f513996e == tVar.f513996e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513997f, tVar.f513997f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513998g, tVar.f513998g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513999h, tVar.f513999h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514000i, tVar.f514000i) && this.f514001m == tVar.f514001m;
    }

    /* renamed from: hashCode */
    public int m170950x8cdac1b() {
        int hashCode = ((((this.f513995d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f513996e)) * 31) + this.f513997f.hashCode()) * 31;
        v11.e0 e0Var = this.f513998g;
        int m170882x8cdac1b = (hashCode + (e0Var == null ? 0 : e0Var.m170882x8cdac1b())) * 31;
        v11.h hVar = this.f513999h;
        int m170894x8cdac1b = (m170882x8cdac1b + (hVar == null ? 0 : hVar.m170894x8cdac1b())) * 31;
        yz5.l lVar = this.f514000i;
        return ((m170894x8cdac1b + (lVar != null ? lVar.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f514001m);
    }

    /* renamed from: toString */
    public java.lang.String m170951x9616526c() {
        return "MarkdownViewModel(blocks=" + this.f513995d + ", isStreaming=" + this.f513996e + ", rawContent=" + this.f513997f + ", renderConfig=" + this.f513998g + ", interactOptions=" + this.f513999h + ", onDoubleTap=" + this.f514000i + ", msgSvrId=" + this.f514001m + ')';
    }

    public /* synthetic */ t(java.util.List list, boolean z17, java.lang.String str, v11.e0 e0Var, v11.h hVar, yz5.l lVar, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f395529d : list, (i17 & 2) != 0 ? false : z17, (i17 & 4) != 0 ? "" : str, (i17 & 8) != 0 ? null : e0Var, (i17 & 16) != 0 ? null : hVar, (i17 & 32) == 0 ? lVar : null, (i17 & 64) != 0 ? 0L : j17);
    }
}
