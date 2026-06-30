package c13;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f119414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17) {
        super(1);
        this.f119414d = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean m143903xa8fbbff4 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(((p3321xbce91901.C29043x91b2b43d) obj).getValue());
        int i17 = this.f119414d;
        if (m143903xa8fbbff4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipService", "callback onConnected(" + i17 + ')');
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterVoipService", "callback onConnected(" + i17 + ") error");
        }
        return jz5.f0.f384359a;
    }
}
