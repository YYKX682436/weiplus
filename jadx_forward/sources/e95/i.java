package e95;

/* loaded from: classes11.dex */
public class i extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e95.j f331953a;

    public i(e95.j jVar) {
        this.f331953a = jVar;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        ((com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38) this.f331953a).f57710x32c6a7 = -1;
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        ((com.p314xaae8f345.p3121x37984a.AbstractC26864x27eb9a38) this.f331953a).f57710x32c6a7 = -1;
    }
}
