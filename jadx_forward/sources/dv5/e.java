package dv5;

/* loaded from: classes16.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final dv5.e f325573a;

    public e(dv5.e eVar) {
        this.f325573a = eVar;
    }

    public void a(int i17, int i18, java.lang.Object obj, int i19, int i27) {
        dv5.e eVar = this.f325573a;
        if (eVar != null) {
            eVar.a(i17, i18, obj, i19, i27);
        }
    }

    public abstract void b(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38, int i39, int i47);

    public abstract void c(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38, int i39);

    public abstract void d(int i17, int i18, int i19, int i27, int i28, int[] iArr);

    public abstract void e(int i17, int i18, int i19, int i27, int i28, int i29, int i37);

    public abstract void f(int i17, int i18, int i19, int i27, int i28, long j17, int i29);

    public void g(int i17, int i18, int i19, int[] iArr) {
        dv5.e eVar = this.f325573a;
        if (eVar != null) {
            eVar.g(i17, i18, i19, iArr);
        }
    }

    public abstract void h(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37);

    public void i(int i17, int i18, int[] iArr, int[] iArr2) {
        dv5.e eVar = this.f325573a;
        if (eVar != null) {
            eVar.i(i17, i18, iArr, iArr2);
        }
    }

    public abstract void j(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38);

    public abstract void k(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37);

    public abstract void l(int i17, int i18, int i19, int i27, int i28, long j17);
}
