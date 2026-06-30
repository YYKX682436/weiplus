package ii5;

/* loaded from: classes15.dex */
public class j extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d f373196a;

    public j(com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d c22458x34f98a1d, ii5.d dVar) {
        this.f373196a = c22458x34f98a1d;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f373196a.m80824xd58aab3c();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f373196a.m80824xd58aab3c();
    }
}
