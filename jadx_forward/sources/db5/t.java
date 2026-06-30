package db5;

/* loaded from: classes15.dex */
public class t extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21477xd5dd28c7 f310047a;

    public t(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21477xd5dd28c7 c21477xd5dd28c7) {
        this.f310047a = c21477xd5dd28c7;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21477xd5dd28c7 c21477xd5dd28c7;
        synchronized (this.f310047a) {
            c21477xd5dd28c7 = this.f310047a;
            c21477xd5dd28c7.f278806s = true;
        }
        c21477xd5dd28c7.invalidate();
        this.f310047a.requestLayout();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        int i17 = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21477xd5dd28c7.f278793v;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21477xd5dd28c7 c21477xd5dd28c7 = this.f310047a;
        synchronized (c21477xd5dd28c7) {
            c21477xd5dd28c7.c();
            c21477xd5dd28c7.removeAllViewsInLayout();
            c21477xd5dd28c7.requestLayout();
        }
        c21477xd5dd28c7.invalidate();
        c21477xd5dd28c7.requestLayout();
    }
}
