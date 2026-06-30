package bl1;

/* loaded from: classes3.dex */
public final class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f21688d;

    /* renamed from: e, reason: collision with root package name */
    public int f21689e = 0;

    public b(android.view.ViewGroup viewGroup) {
        this.f21688d = viewGroup;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f21689e < this.f21688d.getChildCount();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f21689e;
        this.f21689e = i17 + 1;
        return this.f21688d.getChildAt(i17);
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f21688d.removeViewAt(this.f21689e - 1);
    }
}
