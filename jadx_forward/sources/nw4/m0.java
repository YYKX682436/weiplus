package nw4;

/* loaded from: classes.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422413e;

    public m0(nw4.n nVar, java.lang.String str) {
        this.f422413e = nVar;
        this.f422412d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.y2 y2Var = new nw4.y2();
        java.util.HashMap hashMap = new java.util.HashMap();
        y2Var.f422323a = hashMap;
        hashMap.put(dm.i4.f66875xa013b0d5, this.f422412d);
        y2Var.f422547d = new org.json.JSONObject();
        y2Var.f422545b = "call";
        y2Var.f422546c = "";
        y2Var.f422552i = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589;
        nw4.n nVar = this.f422413e;
        nVar.f422424e.add(y2Var);
        nVar.l();
    }
}
