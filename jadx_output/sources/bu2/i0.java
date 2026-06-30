package bu2;

/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final bu2.a[] f24533a;

    public i0(bu2.a[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        this.f24533a = array;
    }

    public final bu2.a a(int i17) {
        bu2.a aVar;
        bu2.a[] aVarArr = this.f24533a;
        int length = aVarArr.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArr[i18];
            if (aVar.f24491a == i17) {
                break;
            }
            i18++;
        }
        return aVar == null ? new bu2.a(10000, "default_v3", new r45.i31(), false, 8, null) : aVar;
    }
}
