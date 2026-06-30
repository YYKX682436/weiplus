package db5;

/* loaded from: classes15.dex */
public class k3 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 f309953a;

    public k3(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c9) {
        this.f309953a = c21500x7be515c9;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c9 = this.f309953a;
        c21500x7be515c9.f278969o = true;
        c21500x7be515c9.invalidate();
        c21500x7be515c9.requestLayout();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        int i17 = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9.E;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c9 = this.f309953a;
        c21500x7be515c9.b();
        c21500x7be515c9.removeAllViewsInLayout();
        c21500x7be515c9.requestLayout();
        c21500x7be515c9.invalidate();
        c21500x7be515c9.requestLayout();
    }
}
