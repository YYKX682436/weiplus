package dv5;

/* loaded from: classes16.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final fv5.b f325568a = new fv5.b();

    /* renamed from: b, reason: collision with root package name */
    public int f325569b = 0;

    public final int a() {
        int i17 = this.f325569b;
        fv5.b bVar = this.f325568a;
        int d17 = bVar.d(i17);
        return d17 < 0 ? this.f325569b : bVar.f348555e[d17];
    }
}
