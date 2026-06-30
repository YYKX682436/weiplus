package vl5;

/* loaded from: classes15.dex */
public class f extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 f519457a;

    public f(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395) {
        this.f519457a = c22722xd3be5395;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.f519457a;
        if (c22722xd3be5395.f294048z == 4) {
            c22722xd3be5395.g();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.f519457a;
        if (c22722xd3be5395.f294048z == 4) {
            c22722xd3be5395.g();
        }
    }
}
