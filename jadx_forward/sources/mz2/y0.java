package mz2;

/* loaded from: classes9.dex */
public class y0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz2.d1 f414742d;

    public y0(mz2.d1 d1Var) {
        this.f414742d = d1Var;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (1 != message.what) {
            return false;
        }
        java.lang.String string = message.getData().getString("rsaKey");
        if (android.text.TextUtils.isEmpty(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HwFingerprintOpenDelegate", "handleMessage msg.what=" + message.what + " rsaKey is null");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mz2.x0(this));
        }
        this.f414742d.f414636c.m83099x5406100e(new oz2.e(string), false);
        return true;
    }
}
