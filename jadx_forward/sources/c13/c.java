package c13;

/* loaded from: classes.dex */
public final class c implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f119405d;

    public c(java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f119405d = msg;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        boolean m143903xa8fbbff4 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(value);
        java.lang.String str = this.f119405d;
        if (m143903xa8fbbff4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipService", str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterVoipService", str + " error " + p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(value));
        }
        return jz5.f0.f384359a;
    }
}
