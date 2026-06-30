package z81;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f552226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h91.a f552227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z81.g f552228f;

    public e(z81.g gVar, org.json.JSONArray jSONArray, h91.a aVar) {
        this.f552228f = gVar;
        this.f552226d = jSONArray;
        this.f552227e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        z81.g gVar = this.f552228f;
        gVar.f552241r = true;
        if (gVar.f552231e == null) {
            gVar.f552231e = this.f552226d;
        } else {
            for (int i17 = 0; i17 < this.f552226d.length(); i17++) {
                this.f552228f.f552231e.put(this.f552226d.opt(i17));
            }
        }
        this.f552228f.f552230d = true;
        h91.a aVar = this.f552227e;
        if (aVar != null) {
            aVar.a(null);
        }
    }
}
