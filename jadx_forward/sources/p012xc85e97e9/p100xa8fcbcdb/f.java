package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class f implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p100xa8fcbcdb.C1139x5803440c f93344d;

    public f(p012xc85e97e9.p100xa8fcbcdb.C1139x5803440c c1139x5803440c) {
        this.f93344d = c1139x5803440c;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 >= 0) {
            p012xc85e97e9.p100xa8fcbcdb.C1139x5803440c c1139x5803440c = this.f93344d;
            java.lang.String charSequence = c1139x5803440c.Y[i17].toString();
            if (charSequence.equals(c1139x5803440c.Z) || !c1139x5803440c.d(charSequence)) {
                return;
            }
            c1139x5803440c.N(charSequence);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
    }
}
