package r36;

/* loaded from: classes16.dex */
public class j extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f450959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r36.b f450960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r36.z f450961g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r36.z zVar, java.lang.String str, java.lang.Object[] objArr, int i17, r36.b bVar) {
        super(str, objArr);
        this.f450961g = zVar;
        this.f450959e = i17;
        this.f450960f = bVar;
    }

    @Override // m36.b
    public void a() {
        r36.z zVar = this.f450961g;
        try {
            zVar.A.k(this.f450959e, this.f450960f);
        } catch (java.io.IOException unused) {
            zVar.b();
        }
    }
}
