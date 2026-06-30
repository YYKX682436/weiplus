package sj3;

/* loaded from: classes.dex */
public final class n0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f490178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f490179e;

    public n0(android.widget.ImageView imageView, android.widget.TextView textView) {
        this.f490178d = imageView;
        this.f490179e = textView;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "cameraEnable state: " + bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        android.widget.ImageView imageView = this.f490178d;
        imageView.setEnabled(booleanValue);
        imageView.setAlpha(bool.booleanValue() ? 1.0f : 0.3f);
        this.f490179e.setAlpha(bool.booleanValue() ? 1.0f : 0.3f);
    }
}
