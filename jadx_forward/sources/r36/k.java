package r36;

/* loaded from: classes16.dex */
public class k extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f450966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f450967f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r36.z f450968g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r36.z zVar, java.lang.String str, java.lang.Object[] objArr, int i17, long j17) {
        super(str, objArr);
        this.f450968g = zVar;
        this.f450966e = i17;
        this.f450967f = j17;
    }

    @Override // m36.b
    public void a() {
        r36.z zVar = this.f450968g;
        try {
            zVar.A.l(this.f450966e, this.f450967f);
        } catch (java.io.IOException unused) {
            zVar.b();
        }
    }
}
