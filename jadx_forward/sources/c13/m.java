package c13;

/* loaded from: classes.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f119421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z17) {
        super(1);
        this.f119421d = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        boolean m143903xa8fbbff4 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(value);
        boolean z17 = this.f119421d;
        if (m143903xa8fbbff4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipService", "callback onModeChanged: " + z17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterVoipService", "callback onModeChanged: " + z17 + " error " + p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(value));
        }
        return jz5.f0.f384359a;
    }
}
