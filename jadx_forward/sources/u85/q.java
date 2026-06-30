package u85;

/* loaded from: classes10.dex */
public final class q extends u85.o {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f507255h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f507256i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f507257m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f507258n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1 info) {
        super(info);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f507255h = "MicroMsg.StickerUrlTask";
        this.f507256i = info.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        u85.i iVar = u85.i.f507240a;
        java.lang.String str = u85.i.f507243d;
        sb6.append(str);
        sb6.append("preview/");
        this.f507257m = sb6.toString();
        this.f507258n = str + "preview.zip";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // fp0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u85.q.a():void");
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f507256i;
    }

    @Override // u85.o
    public void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f507255h, "onResult: " + z17 + ", " + this.f507252f.f275228m);
        super.e(z17);
    }
}
