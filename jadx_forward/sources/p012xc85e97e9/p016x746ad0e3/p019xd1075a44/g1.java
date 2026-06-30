package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class g1 implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e f91120d;

    public g1(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e c0099x7ccac81e) {
        this.f91120d = c0099x7ccac81e;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1 b1Var;
        if (i17 == -1 || (b1Var = this.f91120d.f90952f) == null) {
            return;
        }
        b1Var.m2863xbfc13616(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
    }
}
