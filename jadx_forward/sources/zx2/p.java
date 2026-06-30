package zx2;

/* loaded from: classes15.dex */
public class p extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 f558595a;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79) {
        this.f558595a = c15436x4c00d79;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f558595a.k();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f558595a.k();
    }
}
