package e06;

/* loaded from: classes5.dex */
public final class j extends kz5.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f327745d;

    /* renamed from: e, reason: collision with root package name */
    public final int f327746e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f327747f;

    /* renamed from: g, reason: collision with root package name */
    public int f327748g;

    public j(int i17, int i18, int i19) {
        this.f327745d = i19;
        this.f327746e = i18;
        boolean z17 = true;
        if (i19 <= 0 ? i17 < i18 : i17 > i18) {
            z17 = false;
        }
        this.f327747f = z17;
        this.f327748g = z17 ? i17 : i18;
    }

    @Override // kz5.x0
    public int b() {
        int i17 = this.f327748g;
        if (i17 != this.f327746e) {
            this.f327748g = this.f327745d + i17;
        } else {
            if (!this.f327747f) {
                throw new java.util.NoSuchElementException();
            }
            this.f327747f = false;
        }
        return i17;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f327747f;
    }
}
