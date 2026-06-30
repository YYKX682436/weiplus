package s41;

/* loaded from: classes6.dex */
public class e implements n65.e {

    /* renamed from: d, reason: collision with root package name */
    public final r41.a[] f484456d = {null};

    @Override // n65.e
    public n65.f get() {
        r41.a[] aVarArr = this.f484456d;
        r41.a aVar = aVarArr[0];
        if (aVar != null) {
            return aVar;
        }
        synchronized (aVarArr) {
            r41.a[] aVarArr2 = this.f484456d;
            r41.a aVar2 = aVarArr2[0];
            if (aVar2 != null) {
                return aVar2;
            }
            r41.a aVar3 = new r41.a();
            aVarArr2[0] = aVar3;
            return aVar3;
        }
    }
}
