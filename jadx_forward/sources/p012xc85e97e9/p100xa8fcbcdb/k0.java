package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class k0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p100xa8fcbcdb.C1153x350a234f f93366a;

    public k0(p012xc85e97e9.p100xa8fcbcdb.C1153x350a234f c1153x350a234f) {
        this.f93366a = c1153x350a234f;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        p012xc85e97e9.p100xa8fcbcdb.C1153x350a234f c1153x350a234f = this.f93366a;
        if (c1153x350a234f.d(valueOf)) {
            c1153x350a234f.M(z17);
        } else {
            compoundButton.setChecked(!z17);
        }
    }
}
