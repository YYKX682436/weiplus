package ph3;

/* loaded from: classes14.dex */
public class j implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph3.k f435955d;

    public j(ph3.k kVar) {
        this.f435955d = kVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        ph3.k kVar = this.f435955d;
        switch (i17) {
            case 1:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayer", "%s call prepared ", kVar.m());
                ph3.d dVar = kVar.f435962g;
                if (dVar == null) {
                    return false;
                }
                dVar.mo75864x58d5b73c();
                return false;
            case 2:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayer", "%s call completion ", kVar.m());
                ph3.d dVar2 = kVar.f435962g;
                if (dVar2 == null) {
                    return false;
                }
                dVar2.mo75862xa6db431b();
                return false;
            case 3:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayer", "%s call seek completion ", kVar.m());
                ph3.d dVar3 = kVar.f435962g;
                if (dVar3 == null) {
                    return false;
                }
                dVar3.mo75865xe1fdf750();
                return false;
            case 4:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayer", "%s call video size changed size [%d, %d] degrees[%d]", kVar.m(), java.lang.Integer.valueOf(message.arg1), java.lang.Integer.valueOf(message.arg2), java.lang.Integer.valueOf(((java.lang.Integer) message.obj).intValue()));
                ph3.d dVar4 = kVar.f435962g;
                if (dVar4 == null) {
                    return false;
                }
                dVar4.a(message.arg1, message.arg2, ((java.lang.Integer) message.obj).intValue());
                return false;
            case 5:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoPlayer", "%s call play error [%d, %d]", kVar.m(), java.lang.Integer.valueOf(message.arg1), java.lang.Integer.valueOf(message.arg2));
                ph3.d dVar5 = kVar.f435962g;
                if (dVar5 == null) {
                    return false;
                }
                dVar5.mo75863xaf8aa769(message.arg1, message.arg2);
                return false;
            case 6:
                try {
                    ph3.k.j(kVar);
                    return false;
                } catch (java.lang.Exception unused) {
                    return false;
                }
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoPlayer", "%s it has no idea for msg %d ", kVar.m(), java.lang.Integer.valueOf(i17));
                return false;
        }
    }
}
