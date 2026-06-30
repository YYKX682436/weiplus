package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class l0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p100xa8fcbcdb.C1154xb544bb1 f93368a;

    public l0(p012xc85e97e9.p100xa8fcbcdb.C1154xb544bb1 c1154xb544bb1) {
        this.f93368a = c1154xb544bb1;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        p012xc85e97e9.p100xa8fcbcdb.C1154xb544bb1 c1154xb544bb1 = this.f93368a;
        if (c1154xb544bb1.d(valueOf)) {
            c1154xb544bb1.M(z17);
        } else {
            compoundButton.setChecked(!z17);
        }
    }
}
