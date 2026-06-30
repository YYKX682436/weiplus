package s7;

/* loaded from: classes16.dex */
public class a3 extends s7.d3 {

    /* renamed from: a, reason: collision with root package name */
    public float f485120a;

    /* renamed from: b, reason: collision with root package name */
    public final float f485121b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Path f485122c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s7.f3 f485123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(s7.f3 f3Var, float f17, float f18, android.graphics.Path path) {
        super(f3Var, null);
        this.f485123d = f3Var;
        this.f485120a = f17;
        this.f485121b = f18;
        this.f485122c = path;
    }

    @Override // s7.d3
    public boolean a(s7.l2 l2Var) {
        if (!(l2Var instanceof s7.m2)) {
            return true;
        }
        java.lang.String.format("Using <textPath> elements in a clip path is not supported.", new java.lang.Object[0]);
        return false;
    }

    @Override // s7.d3
    public void b(java.lang.String str) {
        s7.f3 f3Var = this.f485123d;
        if (f3Var.W()) {
            android.graphics.Path path = new android.graphics.Path();
            f3Var.f485190d.f485130d.getTextPath(str, 0, str.length(), this.f485120a, this.f485121b, path);
            this.f485122c.addPath(path);
        }
        this.f485120a += f3Var.f485190d.f485130d.measureText(str);
    }
}
