package pa5;

/* loaded from: classes3.dex */
public final class c implements u3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f434626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f434627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f434628c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u3.p f434629d;

    public c(android.graphics.Matrix matrix, android.graphics.Matrix matrix2, yz5.p pVar, u3.p pVar2) {
        this.f434626a = matrix;
        this.f434627b = matrix2;
        this.f434628c = pVar;
        this.f434629d = pVar2;
    }

    @Override // u3.p
    public final void a(u3.s sVar, boolean z17, float f17, float f18) {
        android.graphics.Matrix matrix = this.f434627b;
        android.graphics.Matrix matrix2 = this.f434626a;
        matrix2.set(matrix);
        yz5.p pVar = this.f434628c;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Float.valueOf(1.0f), matrix2);
        }
        this.f434629d.a(sVar, z17, f17, f18);
    }
}
