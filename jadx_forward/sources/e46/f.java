package e46;

/* loaded from: classes16.dex */
public class f extends e46.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f330974a;

    /* renamed from: b, reason: collision with root package name */
    public final e46.j f330975b;

    /* renamed from: c, reason: collision with root package name */
    public final e46.c f330976c;

    /* renamed from: d, reason: collision with root package name */
    public final e46.c f330977d;

    /* renamed from: e, reason: collision with root package name */
    public int f330978e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f330979f;

    /* renamed from: g, reason: collision with root package name */
    public int f330980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e46.i f330981h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e46.i iVar, e46.j jVar, int[] iArr, int[] iArr2) {
        super(null);
        this.f330981h = iVar;
        this.f330979f = r46.d.f474035a;
        this.f330975b = jVar;
        this.f330976c = e46.i.a(iArr);
        this.f330977d = e46.i.a(iArr2);
    }

    @Override // e46.d
    public int a() {
        return this.f330980g - this.f330978e;
    }

    @Override // e46.d
    public boolean b() {
        return !this.f330974a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f3, code lost:
    
        return r1;
     */
    @Override // e46.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e46.f.c(byte[], int, int):int");
    }

    @Override // e46.d
    public e46.j d() {
        return this.f330974a ? e46.j.INITIAL : this.f330975b;
    }
}
