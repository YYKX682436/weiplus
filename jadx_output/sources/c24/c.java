package c24;

/* loaded from: classes.dex */
public final class c extends xm3.a implements c24.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f38070d;

    /* renamed from: e, reason: collision with root package name */
    public final wd0.x1 f38071e;

    /* renamed from: f, reason: collision with root package name */
    public final c24.d f38072f;

    public c(int i17, wd0.x1 settingResult, androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(settingResult, "settingResult");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f38070d = i17;
        this.f38071e = settingResult;
        this.f38072f = new c24.d(activity, settingResult);
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        c24.c other = (c24.c) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(v(), other.v());
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        c24.c other = (c24.c) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f38070d, other.f38070d);
    }

    @Override // c24.a
    public a24.i j() {
        return this.f38072f;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        wd0.x1 x1Var = this.f38071e;
        sb6.append(x1Var.f444781d);
        sb6.append('_');
        sb6.append(x1Var.f444783f.name());
        return sb6.toString();
    }
}
