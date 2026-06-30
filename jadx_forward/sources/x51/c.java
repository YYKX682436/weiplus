package x51;

/* loaded from: classes5.dex */
public class c extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (gm0.j1.a()) {
            fp.j jVar = new fp.j();
            java.util.HashSet hashSet = x51.e.f533522a;
            int size = hashSet.size();
            boolean parseBoolean = java.lang.Boolean.parseBoolean(message.obj.toString());
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((y61.f) it.next()).a(parseBoolean);
            }
            x51.e.f533522a.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddrBookSyncHelper", "callBackHandler setSize:%d time:%d", java.lang.Integer.valueOf(size), java.lang.Long.valueOf(jVar.a()));
        }
    }
}
