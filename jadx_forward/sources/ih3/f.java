package ih3;

/* loaded from: classes4.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tg3.j1 f373112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ih3.e f373113f;

    public f(ih3.e eVar, java.lang.String str, tg3.j1 j1Var) {
        this.f373113f = eVar;
        this.f373111d = str;
        this.f373112e = j1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f373111d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysMsgTemplateImp", "hy: adding Received listener: %s", str);
        ih3.e eVar = this.f373113f;
        java.util.HashSet hashSet = (java.util.HashSet) ((java.util.HashMap) eVar.f373101f).get(str);
        if (hashSet == null) {
            hashSet = new java.util.HashSet();
        }
        tg3.j1 j1Var = this.f373112e;
        if (!hashSet.contains(j1Var)) {
            hashSet.add(j1Var);
        }
        ((java.util.HashMap) eVar.f373101f).put(str, hashSet);
    }
}
