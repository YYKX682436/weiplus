package bl1;

/* loaded from: classes3.dex */
public final class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f103221d;

    /* renamed from: e, reason: collision with root package name */
    public int f103222e = 0;

    public b(android.view.ViewGroup viewGroup) {
        this.f103221d = viewGroup;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f103222e < this.f103221d.getChildCount();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f103222e;
        this.f103222e = i17 + 1;
        return this.f103221d.getChildAt(i17);
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f103221d.removeViewAt(this.f103222e - 1);
    }
}
