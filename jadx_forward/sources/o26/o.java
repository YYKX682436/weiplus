package o26;

/* loaded from: classes16.dex */
public class o extends o26.p {

    /* renamed from: e, reason: collision with root package name */
    public final int f424139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o26.q f424140f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(o26.q qVar) {
        super(null);
        int i17;
        this.f424140f = qVar;
        i17 = ((java.util.AbstractList) qVar).modCount;
        this.f424139e = i17;
    }

    @Override // o26.p
    public void a() {
        int i17;
        int i18;
        o26.q qVar = this.f424140f;
        i17 = ((java.util.AbstractList) qVar).modCount;
        int i19 = this.f424139e;
        if (i17 == i19) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ModCount: ");
        i18 = ((java.util.AbstractList) qVar).modCount;
        sb6.append(i18);
        sb6.append("; expected: ");
        sb6.append(i19);
        throw new java.util.ConcurrentModificationException(sb6.toString());
    }

    @Override // java.util.Iterator
    public void remove() {
        a();
        this.f424140f.clear();
    }
}
