package jr0;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f382855d;

    public b(jr0.c cVar, org.json.JSONObject jSONObject) {
        this.f382855d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AnrReportListener", "[happen] %s", this.f382855d.toString());
    }
}
