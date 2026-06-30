package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class i1 extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e f91139a;

    public i1(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e c0099x7ccac81e) {
        this.f91139a = c0099x7ccac81e;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e c0099x7ccac81e = this.f91139a;
        if (c0099x7ccac81e.mo2734x58a9c73b()) {
            c0099x7ccac81e.mo2735x35dafd();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f91139a.mo2732x63a3b28a();
    }
}
