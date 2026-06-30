package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class a implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p100xa8fcbcdb.C1137x1c1b08fe f93324a;

    public a(p012xc85e97e9.p100xa8fcbcdb.C1137x1c1b08fe c1137x1c1b08fe) {
        this.f93324a = c1137x1c1b08fe;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        p012xc85e97e9.p100xa8fcbcdb.C1137x1c1b08fe c1137x1c1b08fe = this.f93324a;
        if (c1137x1c1b08fe.d(valueOf)) {
            c1137x1c1b08fe.M(z17);
        } else {
            compoundButton.setChecked(!z17);
        }
    }
}
