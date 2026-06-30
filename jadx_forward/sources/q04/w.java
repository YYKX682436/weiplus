package q04;

/* loaded from: classes12.dex */
public final class w implements u04.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q04.y f440940a;

    public w(q04.y yVar) {
        this.f440940a = yVar;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecRecoveryDataService", "timerNotifierDetachListener onTimerFinish");
        q04.y yVar = this.f440940a;
        boolean isEmpty = yVar.f440943d.isEmpty();
        u04.f fVar = yVar.f440944e;
        if (isEmpty) {
            fVar.f505014b.removeCallbacks(fVar.f505015c);
            return;
        }
        for (java.util.Map.Entry entry : yVar.f440943d.entrySet()) {
            yVar.Di((java.lang.String) entry.getKey(), ((q04.t) entry.getValue()).f440936b, ((q04.t) entry.getValue()).f440937c.a());
        }
        fVar.a();
    }
}
