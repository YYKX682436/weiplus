package xh0;

/* loaded from: classes11.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final p75.d f536016a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f536017b = new java.util.HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh0.b f536018c;

    public d(xh0.b bVar, p75.d dVar, xh0.c cVar) {
        this.f536018c = bVar;
        this.f536016a = dVar;
        ((java.util.HashMap) xh0.b.f536006r).put(dVar.f434158a, this);
    }

    public synchronized java.lang.Object a(java.lang.String str) {
        boolean z17;
        java.lang.Object obj;
        if (((java.util.HashMap) this.f536017b).containsKey(str)) {
            z17 = true;
        } else {
            b(str);
            z17 = false;
        }
        obj = ((java.util.HashMap) this.f536017b).get(str);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotConfigStorage", "[+] get '%s' from db cache, username: %s, value: %s", this.f536016a.f434158a, str, obj);
        }
        return obj;
    }

    public void b(java.lang.String str) {
        p75.n0 n0Var = dm.w1.f322251q;
        p75.d dVar = this.f536016a;
        p75.i0 h17 = n0Var.h(dVar);
        h17.f434190d = dm.w1.f322252r.j(str);
        dm.w1 w1Var = (dm.w1) h17.a().o(this.f536018c.f536007d, dm.w1.class);
        if (w1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatBotConfigStorage", "[-] fail to load '%s' from db.");
            return;
        }
        java.lang.Object obj = w1Var.t0().get(dVar.f434158a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotConfigStorage", "[+] get '%s' from db, username: %s, value: %s", dVar.f434158a, str, obj);
        ((java.util.HashMap) this.f536017b).put(str, obj);
    }
}
