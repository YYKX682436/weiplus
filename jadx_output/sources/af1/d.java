package af1;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oe1.q1 f4464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f4465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(oe1.q1 q1Var, android.net.Uri uri) {
        super(1);
        this.f4464d = q1Var;
        this.f4465e = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [r9.k] */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r9.q qVar;
        r9.j G4;
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (af1.c.f4463b) {
            oe1.q1 q1Var = this.f4464d;
            r9.q createDataSource = (q1Var == null || (G4 = q1Var.G4()) == null) ? null : G4.createDataSource();
            if (createDataSource == null) {
                return null;
            }
            qVar = createDataSource;
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            cf1.a aVar = af1.z.f4516a;
            java.lang.String a17 = ye1.f0.a(context);
            r9.z zVar = new r9.z();
            qVar = new r9.q(context.getApplicationContext(), aVar, af1.c.f4463b ? new af1.a(a17, null, aVar, 8000, 8000, true, zVar) : new r9.s(a17, null, aVar, 8000, 8000, true, zVar));
        }
        return new ze1.a(qVar, this.f4465e, null, 4, null);
    }
}
