package s7;

/* loaded from: classes16.dex */
public class e3 extends s7.d3 {

    /* renamed from: a, reason: collision with root package name */
    public float f485174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s7.f3 f485175b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(s7.f3 f3Var, s7.u2 u2Var) {
        super(f3Var, null);
        this.f485175b = f3Var;
        this.f485174a = 0.0f;
    }

    @Override // s7.d3
    public void b(java.lang.String str) {
        this.f485174a += this.f485175b.f485190d.f485130d.measureText(str);
    }
}
