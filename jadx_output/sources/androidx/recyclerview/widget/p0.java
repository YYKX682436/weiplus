package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class p0 implements androidx.recyclerview.widget.s2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12185a;

    /* renamed from: b, reason: collision with root package name */
    public int f12186b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f12187c;

    /* renamed from: d, reason: collision with root package name */
    public int f12188d;

    public void a(int i17, int i18) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i18 < 0) {
            throw new java.lang.IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i19 = this.f12188d * 2;
        int[] iArr = this.f12187c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f12187c = iArr2;
            java.util.Arrays.fill(iArr2, -1);
        } else if (i19 >= iArr.length) {
            int[] iArr3 = new int[i19 * 2];
            this.f12187c = iArr3;
            java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f12187c;
        iArr4[i19] = i17;
        iArr4[i19 + 1] = i18;
        this.f12188d++;
    }

    public void b(androidx.recyclerview.widget.RecyclerView recyclerView, boolean z17) {
        this.f12188d = 0;
        int[] iArr = this.f12187c;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.f11902s;
        if (recyclerView.f11901r == null || layoutManager == null || !layoutManager.isItemPrefetchEnabled()) {
            return;
        }
        if (!z17) {
            if (!(!recyclerView.f11913z || recyclerView.I || recyclerView.f11890g.g())) {
                layoutManager.collectAdjacentPrefetchPositions(this.f12185a, this.f12186b, recyclerView.F1, this);
            }
        } else if (!recyclerView.f11890g.g()) {
            layoutManager.collectInitialPrefetchPositions(recyclerView.f11901r.getItemCount(), this);
        }
        int i17 = this.f12188d;
        if (i17 > layoutManager.mPrefetchMaxCountObserved) {
            layoutManager.mPrefetchMaxCountObserved = i17;
            layoutManager.mPrefetchMaxObservedInInitialPrefetch = z17;
            recyclerView.f11888e.o();
        }
    }
}
