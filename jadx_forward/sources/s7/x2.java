package s7;

/* loaded from: classes16.dex */
public class x2 implements s7.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f485424a = new android.graphics.Path();

    /* renamed from: b, reason: collision with root package name */
    public float f485425b;

    /* renamed from: c, reason: collision with root package name */
    public float f485426c;

    public x2(s7.a1 a1Var) {
        if (a1Var == null) {
            return;
        }
        a1Var.h(this);
    }

    @Override // s7.b1
    public void a(float f17, float f18) {
        this.f485424a.moveTo(f17, f18);
        this.f485425b = f17;
        this.f485426c = f18;
    }

    @Override // s7.b1
    public void b(float f17, float f18) {
        this.f485424a.lineTo(f17, f18);
        this.f485425b = f17;
        this.f485426c = f18;
    }

    @Override // s7.b1
    public void c(float f17, float f18, float f19, float f27) {
        this.f485424a.quadTo(f17, f18, f19, f27);
        this.f485425b = f19;
        this.f485426c = f27;
    }

    @Override // s7.b1
    /* renamed from: close */
    public void mo163950x5a5ddf8() {
        this.f485424a.close();
    }

    @Override // s7.b1
    public void d(float f17, float f18, float f19, float f27, float f28, float f29) {
        this.f485424a.cubicTo(f17, f18, f19, f27, f28, f29);
        this.f485425b = f28;
        this.f485426c = f29;
    }

    @Override // s7.b1
    public void e(float f17, float f18, float f19, boolean z17, boolean z18, float f27, float f28) {
        s7.f3.a(this.f485425b, this.f485426c, f17, f18, f19, z17, z18, f27, f28, this);
        this.f485425b = f27;
        this.f485426c = f28;
    }
}
