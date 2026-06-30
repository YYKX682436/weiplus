package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes13.dex */
public class w extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 f91265a;

    public w(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 c0077x141f33d1) {
        this.f91265a = c0077x141f33d1;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        super.onChanged();
        this.f91265a.f90880d.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        super.onInvalidated();
        this.f91265a.f90880d.notifyDataSetInvalidated();
    }
}
