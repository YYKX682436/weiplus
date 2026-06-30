package sj3;

/* loaded from: classes4.dex */
public final class g0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b f490050d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b) {
        this.f490050d = c16586x7058535b;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "cameraEnable state: " + bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        this.f490050d.m67075xea2556c6(bool.booleanValue());
    }
}
