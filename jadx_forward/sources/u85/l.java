package u85;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu85/l;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-sticker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class l implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle data = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCStickerTask", "invoke: ");
        com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1 c21046x5cf452f1 = (com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1) data.getParcelable("load_info");
        android.os.Bundle bundle = new android.os.Bundle();
        if (c21046x5cf452f1 == null) {
            bundle.putBoolean("task_result", false);
            if (rVar != null) {
                rVar.a(bundle);
                return;
            }
            return;
        }
        u85.i iVar = u85.i.f507240a;
        u85.k kVar = new u85.k(bundle, rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerFileManager", "loadFromRemote: " + c21046x5cf452f1.a());
        u85.o qVar = c21046x5cf452f1.f275222d == 1 ? new u85.q(c21046x5cf452f1) : new u85.e(c21046x5cf452f1);
        java.util.LinkedList linkedList = qVar.f507253g;
        if (!linkedList.contains(kVar)) {
            linkedList.add(kVar);
        }
        u85.i.f507247h.put(c21046x5cf452f1.a(), qVar);
        u85.i.f507246g.a(qVar);
    }
}
