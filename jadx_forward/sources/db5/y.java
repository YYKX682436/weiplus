package db5;

/* loaded from: classes15.dex */
public class y extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3 f310108a;

    public y(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3 c21478xd3361da3) {
        this.f310108a = c21478xd3361da3;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3 c21478xd3361da3 = this.f310108a;
        c21478xd3361da3.f278814i = true;
        c21478xd3361da3.k();
        c21478xd3361da3.invalidate();
        c21478xd3361da3.requestLayout();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3 c21478xd3361da3 = this.f310108a;
        c21478xd3361da3.getClass();
        c21478xd3361da3.k();
        c21478xd3361da3.f();
        c21478xd3361da3.removeAllViewsInLayout();
        c21478xd3361da3.requestLayout();
        c21478xd3361da3.invalidate();
        c21478xd3361da3.requestLayout();
    }
}
