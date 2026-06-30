package r36;

/* loaded from: classes16.dex */
public class m extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f450971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r36.z f450972f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r36.z zVar, java.lang.String str, java.lang.Object[] objArr, int i17, java.util.List list) {
        super(str, objArr);
        this.f450972f = zVar;
        this.f450971e = i17;
    }

    @Override // m36.b
    public void a() {
        this.f450972f.f451013p.getClass();
        try {
            this.f450972f.A.k(this.f450971e, r36.b.CANCEL);
            synchronized (this.f450972f) {
                this.f450972f.C.remove(java.lang.Integer.valueOf(this.f450971e));
            }
        } catch (java.io.IOException unused) {
        }
    }
}
