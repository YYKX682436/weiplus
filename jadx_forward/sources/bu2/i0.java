package bu2;

/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final bu2.a[] f106066a;

    public i0(bu2.a[] array) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        this.f106066a = array;
    }

    public final bu2.a a(int i17) {
        bu2.a aVar;
        bu2.a[] aVarArr = this.f106066a;
        int length = aVarArr.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArr[i18];
            if (aVar.f106024a == i17) {
                break;
            }
            i18++;
        }
        return aVar == null ? new bu2.a(10000, "default_v3", new r45.i31(), false, 8, null) : aVar;
    }
}
