package s11;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f483638d;

    /* renamed from: e, reason: collision with root package name */
    public final n11.c f483639e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f483640f;

    /* renamed from: g, reason: collision with root package name */
    public final n11.b f483641g;

    /* renamed from: h, reason: collision with root package name */
    public final o11.g f483642h;

    /* renamed from: i, reason: collision with root package name */
    public final p11.k f483643i;

    /* renamed from: m, reason: collision with root package name */
    public final p11.l f483644m;

    /* renamed from: n, reason: collision with root package name */
    public final p11.h f483645n;

    /* renamed from: o, reason: collision with root package name */
    public final o11.d f483646o;

    /* renamed from: p, reason: collision with root package name */
    public final p11.c f483647p;

    /* renamed from: q, reason: collision with root package name */
    public final p11.o f483648q;

    /* renamed from: r, reason: collision with root package name */
    public final p11.b f483649r;

    /* renamed from: s, reason: collision with root package name */
    public final p11.m f483650s;

    /* renamed from: t, reason: collision with root package name */
    public final p11.p f483651t;

    /* renamed from: u, reason: collision with root package name */
    public final p11.a f483652u;

    /* renamed from: v, reason: collision with root package name */
    public final p11.i f483653v;

    public b(java.lang.String str, n11.c cVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, o11.g gVar, p11.k kVar, p11.l lVar, n11.b bVar, p11.h hVar, p11.f fVar, p11.e eVar, p11.n nVar) {
        this.f483638d = str;
        this.f483639e = cVar;
        this.f483640f = n3Var;
        this.f483641g = bVar;
        this.f483645n = hVar;
        o11.d dVar = bVar.f415584a;
        this.f483646o = dVar;
        if (gVar == null) {
            this.f483642h = dVar.f423600e;
        } else {
            this.f483642h = gVar;
        }
        if (kVar == null) {
            this.f483643i = kVar;
        } else {
            this.f483643i = kVar;
        }
        if (lVar == null) {
            this.f483644m = dVar.f423605j;
        } else {
            this.f483644m = lVar;
        }
        o11.g gVar2 = this.f483642h;
        p11.c cVar2 = gVar2.f423661z;
        if (cVar2 != null) {
            this.f483647p = cVar2;
        } else {
            this.f483647p = dVar.f423603h;
        }
        this.f483652u = gVar2.A;
        this.f483653v = gVar2.B;
        this.f483648q = dVar.f423601f;
        this.f483649r = dVar.f423602g;
        this.f483650s = dVar.f423606k;
        this.f483651t = dVar.f423609n;
    }

    public final void a(byte[] bArr) {
        o11.g gVar = this.f483642h;
        boolean z17 = gVar.f423638c;
        java.lang.String str = this.f483638d;
        p11.b bVar = this.f483649r;
        if (z17) {
            ((com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.a) bVar).d(str, bArr, gVar);
        }
        if (gVar.f423637b) {
            ((com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.a) bVar).d(str, bArr, gVar);
        }
    }

    public java.lang.String b(java.lang.String str) {
        o11.g gVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (gVar = this.f483642h) == null) {
            return null;
        }
        if (gVar.f423657v) {
            str = str + "round" + gVar.f423658w;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f423655t)) {
            str = str + gVar.f423655t;
        }
        return str + "size" + gVar.f423644i + gVar.f423645j;
    }

    public final android.graphics.Bitmap c(q11.b bVar, android.graphics.Bitmap bitmap) {
        p11.h hVar = this.f483645n;
        if (hVar != null && bVar != null) {
            bVar.f441067d = bitmap;
            android.graphics.Bitmap c17 = hVar.c(this.f483638d, this.f483639e.a(), bVar);
            if (c17 != null && !c17.isRecycled()) {
                return c17;
            }
        }
        return bitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x00b9, code lost:
    
        ((r35.w) r2).b(r15, r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 24, insn: 0x01c2: MOVE (r18 I:??[OBJECT, ARRAY]) = (r24 I:??[OBJECT, ARRAY]), block:B:324:0x01c0 */
    /* JADX WARN: Not initialized variable reg: 24, insn: 0x01f6: MOVE (r18 I:??[OBJECT, ARRAY]) = (r24 I:??[OBJECT, ARRAY]), block:B:383:0x01f4 */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x01c4: MOVE (r3 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]), block:B:324:0x01c0 */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00d9 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #1 {all -> 0x00e1, blocks: (B:301:0x009d, B:253:0x00a7, B:271:0x00b9, B:275:0x00c4, B:278:0x00d9, B:298:0x00cd), top: B:300:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0618 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v14, types: [p11.a] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s11.b.run():void");
    }
}
