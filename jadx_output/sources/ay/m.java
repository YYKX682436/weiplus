package ay;

/* loaded from: classes14.dex */
public final class m implements androidx.lifecycle.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final jy.m f15171a;

    /* renamed from: b, reason: collision with root package name */
    public final xx.y f15172b;

    public m(jy.m screenInfo, xx.y dataReporter) {
        kotlin.jvm.internal.o.g(screenInfo, "screenInfo");
        kotlin.jvm.internal.o.g(dataReporter, "dataReporter");
        this.f15171a = screenInfo;
        this.f15172b = dataReporter;
    }

    @Override // androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        return new ay.l(this.f15171a, this.f15172b);
    }
}
