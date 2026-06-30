package sj3;

/* loaded from: classes4.dex */
public final class q0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f490233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f490234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f490235f;

    public q0(android.widget.ImageView imageView, android.widget.TextView textView, sj3.a1 a1Var) {
        this.f490233d = imageView;
        this.f490234e = textView;
        this.f490235f = a1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "mic btn state: " + bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        sj3.a1 a1Var = this.f490235f;
        android.widget.TextView textView = this.f490234e;
        android.widget.ImageView imageView = this.f490233d;
        if (booleanValue) {
            imageView.setSelected(true);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h2b);
            imageView.setContentDescription(a1Var.f489926d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2b));
        } else {
            imageView.setSelected(false);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h2a);
            imageView.setContentDescription(a1Var.f489926d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2a));
        }
    }
}
