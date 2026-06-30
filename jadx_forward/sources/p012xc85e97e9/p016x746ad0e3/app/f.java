package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes13.dex */
public class f implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.k f90635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.h f90636e;

    public f(p012xc85e97e9.p016x746ad0e3.app.h hVar, p012xc85e97e9.p016x746ad0e3.app.k kVar) {
        this.f90636e = hVar;
        this.f90635d = kVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        p012xc85e97e9.p016x746ad0e3.app.h hVar = this.f90636e;
        android.content.DialogInterface.OnClickListener onClickListener = hVar.f90676o;
        p012xc85e97e9.p016x746ad0e3.app.k kVar = this.f90635d;
        onClickListener.onClick(kVar.f90693b, i17);
        if (hVar.f90680s) {
            return;
        }
        kVar.f90693b.dismiss();
    }
}
