package p012xc85e97e9.p080xa1c8a596.p082xd1075a44;

/* loaded from: classes14.dex */
public class g implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f92647d = new android.graphics.Rect();

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f92648e = new android.graphics.Rect();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f92649f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p080xa1c8a596.p082xd1075a44.e f92650g;

    public g(boolean z17, p012xc85e97e9.p080xa1c8a596.p082xd1075a44.e eVar) {
        this.f92649f = z17;
        this.f92650g = eVar;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.a aVar = (p012xc85e97e9.p080xa1c8a596.p082xd1075a44.a) this.f92650g;
        aVar.getClass();
        android.graphics.Rect rect = this.f92647d;
        ((o3.l) obj).f(rect);
        aVar.getClass();
        android.graphics.Rect rect2 = this.f92648e;
        ((o3.l) obj2).f(rect2);
        int i17 = rect.top;
        int i18 = rect2.top;
        if (i17 < i18) {
            return -1;
        }
        if (i17 > i18) {
            return 1;
        }
        int i19 = rect.left;
        int i27 = rect2.left;
        boolean z17 = this.f92649f;
        if (i19 < i27) {
            return z17 ? 1 : -1;
        }
        if (i19 > i27) {
            return z17 ? -1 : 1;
        }
        int i28 = rect.bottom;
        int i29 = rect2.bottom;
        if (i28 < i29) {
            return -1;
        }
        if (i28 > i29) {
            return 1;
        }
        int i37 = rect.right;
        int i38 = rect2.right;
        if (i37 < i38) {
            return z17 ? 1 : -1;
        }
        if (i37 > i38) {
            return z17 ? -1 : 1;
        }
        return 0;
    }
}
