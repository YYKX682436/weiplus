package nw4;

/* loaded from: classes.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f422417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422418e;

    public m2(nw4.n nVar, nw4.y2 y2Var) {
        this.f422418e = nVar;
        this.f422417d = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f422418e;
        nVar.getClass();
        nw4.y2 y2Var = this.f422417d;
        if (y2Var == null) {
            return;
        }
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("log", y2Var.f422552i);
        java.util.LinkedList linkedList = nVar.f422424e;
        if (D0) {
            linkedList.add(y2Var);
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            nw4.y2 y2Var2 = (nw4.y2) it.next();
            if (y2Var2 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(y2Var2.f422552i, y2Var.f422552i)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "addToMsgQueue fail, already has this function %s", y2Var.f422552i);
                return;
            }
        }
        linkedList.add(y2Var);
    }
}
