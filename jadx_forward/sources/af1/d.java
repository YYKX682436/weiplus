package af1;

/* loaded from: classes7.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oe1.q1 f85997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f85998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(oe1.q1 q1Var, android.net.Uri uri) {
        super(1);
        this.f85997d = q1Var;
        this.f85998e = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [r9.k] */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r9.q qVar;
        r9.j G4;
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (af1.c.f85996b) {
            oe1.q1 q1Var = this.f85997d;
            r9.q mo10288xb8a7ce81 = (q1Var == null || (G4 = q1Var.G4()) == null) ? null : G4.mo10288xb8a7ce81();
            if (mo10288xb8a7ce81 == null) {
                return null;
            }
            qVar = mo10288xb8a7ce81;
        } else {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            cf1.a aVar = af1.z.f86049a;
            java.lang.String a17 = ye1.f0.a(context);
            r9.z zVar = new r9.z();
            qVar = new r9.q(context.getApplicationContext(), aVar, af1.c.f85996b ? new af1.a(a17, null, aVar, 8000, 8000, true, zVar) : new r9.s(a17, null, aVar, 8000, 8000, true, zVar));
        }
        return new ze1.a(qVar, this.f85998e, null, 4, null);
    }
}
