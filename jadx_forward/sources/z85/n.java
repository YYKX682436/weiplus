package z85;

/* loaded from: classes4.dex */
public final class n extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f552343f = {l75.n0.m145250x3fdc6f77(jr.e.f382829r, "EmojiSuggestCacheInfo")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f552344g = "MicroMsg.EmojiSuggestCacheStorage";

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f552345d;

    /* renamed from: e, reason: collision with root package name */
    public final jt0.j f552346e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l75.k0 db6) {
        super(db6, jr.e.f382829r, "EmojiSuggestCacheInfo", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = jr.e.f382829r;
        this.f552345d = db6;
        this.f552346e = new jt0.j(100);
    }

    public final jr.e y0(java.lang.String desc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        jt0.j jVar = this.f552346e;
        jr.e eVar = (jr.e) jVar.get(desc);
        if (eVar != null) {
            return eVar;
        }
        jr.e eVar2 = new jr.e();
        eVar2.f69114x225aa2b6 = desc;
        super.get(eVar2, m145254xa242f8f3());
        byte[] bArr = eVar2.f69113xad49e234;
        if (bArr != null) {
            r2 = !(bArr.length == 0);
        }
        if (!r2) {
            eVar2 = null;
        }
        if (eVar2 != null) {
            jVar.put(eVar2.f69114x225aa2b6, eVar2);
        }
        return eVar2;
    }

    public final void z0(jr.e info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f552346e.put(info.f69114x225aa2b6, info);
        super.mo11260x413cb2b4(info);
    }
}
