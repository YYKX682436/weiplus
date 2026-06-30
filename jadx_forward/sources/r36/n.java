package r36;

/* loaded from: classes16.dex */
public class n extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f450975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r36.z f450976f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r36.z zVar, java.lang.String str, java.lang.Object[] objArr, int i17, java.util.List list, boolean z17) {
        super(str, objArr);
        this.f450976f = zVar;
        this.f450975e = i17;
    }

    @Override // m36.b
    public void a() {
        this.f450976f.f451013p.getClass();
        try {
            this.f450976f.A.k(this.f450975e, r36.b.CANCEL);
            synchronized (this.f450976f) {
                this.f450976f.C.remove(java.lang.Integer.valueOf(this.f450975e));
            }
        } catch (java.io.IOException unused) {
        }
    }
}
