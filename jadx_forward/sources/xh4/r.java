package xh4;

/* loaded from: classes.dex */
public final class r extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f536161a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p3325xe03a0797.p3326xc267989b.q qVar, android.os.Looper looper) {
        super(looper);
        this.f536161a = qVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.handleMessage(msg);
        android.os.Bundle data = msg.getData();
        int i17 = data.getInt("key_authentication_type");
        int i18 = data.getInt("key_authentication_result_code");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkSysPwd] handleMessage " + i17 + ' ' + i18);
        xh4.k kVar = xh4.k.f536141d;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f536161a;
        if (i18 == 100) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkSysPwd] Succeeded");
            if (((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kVar));
                return;
            }
            return;
        }
        xh4.k kVar2 = xh4.k.f536142e;
        if (i18 == 101) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkSysPwd] Failed");
            if (((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kVar2));
                return;
            }
            return;
        }
        xh4.k kVar3 = xh4.k.f536141d;
        if (i18 == 102) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkSysPwd] Error ignore");
            return;
        }
        xh4.k kVar4 = xh4.k.f536141d;
        if (i18 == 103) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkSysPwd] Help ignore");
        }
    }
}
