package e06;

/* loaded from: classes13.dex */
public final class b extends kz5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f327734d;

    /* renamed from: e, reason: collision with root package name */
    public final int f327735e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f327736f;

    /* renamed from: g, reason: collision with root package name */
    public int f327737g;

    public b(char c17, char c18, int i17) {
        this.f327734d = i17;
        this.f327735e = c18;
        boolean z17 = true;
        if (i17 <= 0 ? p3321xbce91901.jvm.p3324x21ffc6bd.o.i(c17, c18) < 0 : p3321xbce91901.jvm.p3324x21ffc6bd.o.i(c17, c18) > 0) {
            z17 = false;
        }
        this.f327736f = z17;
        this.f327737g = z17 ? c17 : c18;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f327736f;
    }
}
