package vl5;

/* loaded from: classes15.dex */
public class g extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vl5.h f519458a;

    public g(vl5.h hVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395) {
        this.f519458a = hVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f519458a.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f519458a.notifyDataSetInvalidated();
    }
}
