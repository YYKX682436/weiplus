package s11;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f483633d;

    /* renamed from: e, reason: collision with root package name */
    public final o11.g f483634e;

    /* renamed from: f, reason: collision with root package name */
    public final p11.d f483635f;

    /* renamed from: g, reason: collision with root package name */
    public final p11.c f483636g;

    /* renamed from: h, reason: collision with root package name */
    public final p11.b f483637h;

    public a(java.lang.String str, o11.g gVar, n11.b bVar, p11.d dVar) {
        this.f483633d = str;
        o11.d dVar2 = bVar.f415584a;
        if (gVar == null) {
            this.f483634e = dVar2.f423600e;
        } else {
            this.f483634e = gVar;
        }
        this.f483635f = dVar;
        p11.c cVar = this.f483634e.f423661z;
        if (cVar != null) {
            this.f483636g = cVar;
        } else {
            this.f483636g = dVar2.f423603h;
        }
        this.f483637h = dVar2.f423602g;
    }

    @Override // java.lang.Runnable
    public void run() {
        p11.c cVar = this.f483636g;
        java.lang.String str = this.f483633d;
        q11.b b17 = cVar.b(str);
        p11.d dVar = this.f483635f;
        o11.g gVar = this.f483634e;
        if (b17 == null) {
            if (dVar != null) {
                dVar.a(false, gVar.D);
                return;
            }
            return;
        }
        byte[] bArr = b17.f441066c;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x.I(bArr, 10, 10, null) == null) {
            gVar.getClass();
        } else if (((com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.a) this.f483637h).d(str, bArr, gVar)) {
            if (dVar != null) {
                dVar.a(true, gVar.D);
                return;
            }
            return;
        }
        if (dVar != null) {
            dVar.a(false, gVar.D);
        }
    }
}
