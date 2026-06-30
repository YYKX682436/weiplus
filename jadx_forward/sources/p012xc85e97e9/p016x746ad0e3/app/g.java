package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes13.dex */
public class g implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.C0064x14e5ed4a f90638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.k f90639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.h f90640f;

    public g(p012xc85e97e9.p016x746ad0e3.app.h hVar, p012xc85e97e9.p016x746ad0e3.app.C0064x14e5ed4a c0064x14e5ed4a, p012xc85e97e9.p016x746ad0e3.app.k kVar) {
        this.f90640f = hVar;
        this.f90638d = c0064x14e5ed4a;
        this.f90639e = kVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        p012xc85e97e9.p016x746ad0e3.app.h hVar = this.f90640f;
        boolean[] zArr = hVar.f90678q;
        p012xc85e97e9.p016x746ad0e3.app.C0064x14e5ed4a c0064x14e5ed4a = this.f90638d;
        if (zArr != null) {
            zArr[i17] = c0064x14e5ed4a.isItemChecked(i17);
        }
        hVar.f90682u.onClick(this.f90639e.f90693b, i17, c0064x14e5ed4a.isItemChecked(i17));
    }
}
