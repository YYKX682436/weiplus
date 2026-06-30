package ei3;

/* loaded from: classes10.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.g f334522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei3.b f334523e;

    public a(ei3.b bVar, ei3.g gVar) {
        this.f334523e = bVar;
        this.f334522d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.d dVar = this.f334523e.f334527a;
        dVar.getClass();
        ei3.g gVar = this.f334522d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMgr", "receive buf bufIndex: %d receiveIndex: %d", java.lang.Integer.valueOf(gVar.f334579c), java.lang.Integer.valueOf(dVar.f334561c));
        int i17 = dVar.f334561c;
        if (i17 != gVar.f334579c) {
            dVar.f334562d.add(gVar);
            dVar.a();
        } else {
            dVar.f334561c = i17 + 1;
            ((ei3.a1) dVar.f334564f).a(gVar.f334578b);
            dVar.a();
        }
    }
}
