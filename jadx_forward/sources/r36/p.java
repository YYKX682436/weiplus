package r36;

/* loaded from: classes16.dex */
public class p extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f450982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r36.z f450983f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r36.z zVar, java.lang.String str, java.lang.Object[] objArr, int i17, r36.b bVar) {
        super(str, objArr);
        this.f450983f = zVar;
        this.f450982e = i17;
    }

    @Override // m36.b
    public void a() {
        this.f450983f.f451013p.getClass();
        synchronized (this.f450983f) {
            this.f450983f.C.remove(java.lang.Integer.valueOf(this.f450982e));
        }
    }
}
