package s7;

/* loaded from: classes16.dex */
public class y2 extends s7.z2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Path f485436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s7.f3 f485437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(s7.f3 f3Var, android.graphics.Path path, float f17, float f18) {
        super(f3Var, f17, f18);
        this.f485437e = f3Var;
        this.f485436d = path;
    }

    @Override // s7.z2, s7.d3
    public void b(java.lang.String str) {
        s7.f3 f3Var = this.f485437e;
        if (f3Var.W()) {
            s7.b3 b3Var = f3Var.f485190d;
            if (b3Var.f485128b) {
                f3Var.f485187a.drawTextOnPath(str, this.f485436d, this.f485446a, this.f485447b, b3Var.f485130d);
            }
            s7.b3 b3Var2 = f3Var.f485190d;
            if (b3Var2.f485129c) {
                f3Var.f485187a.drawTextOnPath(str, this.f485436d, this.f485446a, this.f485447b, b3Var2.f485131e);
            }
        }
        this.f485446a += f3Var.f485190d.f485130d.measureText(str);
    }
}
