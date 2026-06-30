package oa;

/* loaded from: classes15.dex */
public class e extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f425294a;

    public e(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff) {
        this.f425294a = c2718xca2902ff;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f425294a.m();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f425294a.m();
    }
}
