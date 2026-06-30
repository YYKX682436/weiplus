package j12;

/* loaded from: classes15.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f378689d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j12.f f378690e;

    public e(j12.f fVar, j12.d dVar) {
        this.f378690e = fVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i17 = this.f378689d;
        java.util.ArrayList arrayList = this.f378690e.f378691d;
        return i17 < (arrayList == null ? 0 : arrayList.size());
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.util.ArrayList arrayList;
        int i17 = this.f378689d;
        this.f378689d = i17 + 1;
        j12.f fVar = this.f378690e;
        java.util.ArrayList arrayList2 = fVar.f378691d;
        if (arrayList2 == null || arrayList2.size() <= i17 || i17 < 0 || (arrayList = fVar.f378691d) == null) {
            return null;
        }
        return (j12.i) arrayList.get(i17);
    }

    @Override // java.util.Iterator
    public void remove() {
    }
}
