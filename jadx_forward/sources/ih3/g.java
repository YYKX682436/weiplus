package ih3;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tg3.j1 f373115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ih3.e f373116f;

    public g(ih3.e eVar, java.lang.String str, tg3.j1 j1Var) {
        this.f373116f = eVar;
        this.f373114d = str;
        this.f373115e = j1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f373114d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysMsgTemplateImp", "hy: removing Received listener: %s", str);
        ih3.e eVar = this.f373116f;
        java.util.HashSet hashSet = (java.util.HashSet) ((java.util.HashMap) eVar.f373101f).get(str);
        if (hashSet == null) {
            return;
        }
        hashSet.remove(this.f373115e);
        if (hashSet.size() == 0) {
            ((java.util.HashMap) eVar.f373101f).remove(str);
        } else {
            ((java.util.HashMap) eVar.f373101f).put(str, hashSet);
        }
    }
}
