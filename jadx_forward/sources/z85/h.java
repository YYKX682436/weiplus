package z85;

/* loaded from: classes7.dex */
public final class h extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f552332f = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3.f275425w, "EmojiIPSetInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f552333d;

    /* renamed from: e, reason: collision with root package name */
    public final jt0.j f552334e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3.f275425w, "EmojiIPSetInfo", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        z85.g gVar = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3.f275424v;
        this.f552333d = db6;
        this.f552334e = new jt0.j(100);
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 y0(java.lang.String str) {
        if (str == null) {
            return null;
        }
        jt0.j jVar = this.f552334e;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 c21052x34cf13a3 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3) jVar.get(str);
        if (c21052x34cf13a3 != null) {
            return c21052x34cf13a3;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 c21052x34cf13a32 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3();
        c21052x34cf13a32.f68543x4b6e619a = str;
        super.get(c21052x34cf13a32, m145254xa242f8f3());
        java.lang.String str2 = c21052x34cf13a32.f68545x29dd02d3;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 c21052x34cf13a33 = str2 == null || str2.length() == 0 ? null : c21052x34cf13a32;
        if (c21052x34cf13a33 != null) {
            jVar.put(c21052x34cf13a33.f68543x4b6e619a, c21052x34cf13a33);
        }
        return c21052x34cf13a33;
    }

    public final void z0(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f552334e.put(info.f68543x4b6e619a, info);
        super.mo11260x413cb2b4(info);
    }
}
