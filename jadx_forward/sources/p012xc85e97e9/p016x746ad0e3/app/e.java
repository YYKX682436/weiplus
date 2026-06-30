package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes13.dex */
public class e extends android.widget.ArrayAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.C0064x14e5ed4a f90617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.h f90618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.h hVar, android.content.Context context, int i17, int i18, java.lang.CharSequence[] charSequenceArr, p012xc85e97e9.p016x746ad0e3.app.C0064x14e5ed4a c0064x14e5ed4a) {
        super(context, i17, i18, charSequenceArr);
        this.f90618e = hVar;
        this.f90617d = c0064x14e5ed4a;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2 = super.getView(i17, view, viewGroup);
        boolean[] zArr = this.f90618e.f90678q;
        if (zArr != null && zArr[i17]) {
            this.f90617d.setItemChecked(i17, true);
        }
        return view2;
    }
}
