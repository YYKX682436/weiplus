package fc;

/* loaded from: classes16.dex */
public final class j extends fc.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc.k f342448e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fc.k kVar) {
        super(kVar);
        this.f342448e = kVar;
    }

    @Override // fc.h
    public final boolean d(java.lang.Object obj) {
        return this.f342448e.containsValue(obj);
    }

    @Override // fc.h
    public final boolean e(java.lang.Object obj) {
        java.lang.Object obj2;
        fc.k kVar = this.f342448e;
        java.lang.Object[] objArr = kVar.f342449p;
        java.lang.Object[] objArr2 = kVar.f342461i;
        int length = objArr.length;
        boolean z17 = false;
        while (true) {
            int i17 = length - 1;
            if (length <= 0) {
                return z17;
            }
            java.lang.Object obj3 = objArr2[i17];
            if ((obj3 != null && obj3 != fc.s.f342459n && obj == objArr[i17]) || ((obj2 = objArr[i17]) != null && obj2.equals(obj))) {
                kVar.l(i17);
                z17 = true;
            }
            length = i17;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new fc.i(this, this.f342448e);
    }
}
