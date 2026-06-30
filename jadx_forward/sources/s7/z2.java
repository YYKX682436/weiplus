package s7;

/* loaded from: classes16.dex */
public class z2 extends s7.d3 {

    /* renamed from: a, reason: collision with root package name */
    public float f485446a;

    /* renamed from: b, reason: collision with root package name */
    public float f485447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s7.f3 f485448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(s7.f3 f3Var, float f17, float f18) {
        super(f3Var, null);
        this.f485448c = f3Var;
        this.f485446a = f17;
        this.f485447b = f18;
    }

    @Override // s7.d3
    public void b(java.lang.String str) {
        s7.f3 f3Var = this.f485448c;
        if (f3Var.W()) {
            s7.b3 b3Var = f3Var.f485190d;
            if (b3Var.f485128b) {
                f3Var.f485187a.drawText(str, this.f485446a, this.f485447b, b3Var.f485130d);
            }
            s7.b3 b3Var2 = f3Var.f485190d;
            if (b3Var2.f485129c) {
                f3Var.f485187a.drawText(str, this.f485446a, this.f485447b, b3Var2.f485131e);
            }
        }
        this.f485446a += f3Var.f485190d.f485130d.measureText(str);
    }
}
