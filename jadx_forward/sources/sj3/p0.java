package sj3;

/* loaded from: classes4.dex */
public final class p0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f490209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f490210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f490211f;

    public p0(android.widget.ImageView imageView, android.widget.TextView textView, sj3.a1 a1Var) {
        this.f490209d = imageView;
        this.f490210e = textView;
        this.f490211f = a1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "camera btn state: " + bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        sj3.a1 a1Var = this.f490211f;
        android.widget.TextView textView = this.f490210e;
        android.widget.ImageView imageView = this.f490209d;
        if (booleanValue) {
            imageView.setSelected(true);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574117h15);
            imageView.setContentDescription(a1Var.f489926d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574117h15));
        } else {
            imageView.setSelected(false);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574116h14);
            imageView.setContentDescription(a1Var.f489926d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574116h14));
        }
    }
}
