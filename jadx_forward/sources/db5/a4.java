package db5;

/* loaded from: classes15.dex */
public class a4 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e f309810a;

    public a4(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e, db5.w3 w3Var) {
        this.f309810a = c21505x98c24a7e;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21505x98c24a7e c21505x98c24a7e = this.f309810a;
        if (c21505x98c24a7e.f279010g.isShowing()) {
            c21505x98c24a7e.d();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f309810a.a();
    }
}
