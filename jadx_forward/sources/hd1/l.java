package hd1;

/* loaded from: classes7.dex */
public final class l {
    public l(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final hd1.w a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        java.util.Map map = hd1.w.f361969d;
        hd1.w wVar = (hd1.w) ((java.util.concurrent.ConcurrentHashMap) map).get(component.mo48798x74292566());
        if (wVar != null) {
            return wVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k3 k3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k3(component);
        hd1.l lVar = hd1.w.f361968c;
        hd1.j jVar = hd1.w.f361970e;
        java.lang.String mo48798x74292566 = component.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        ((hd1.k) jVar).getClass();
        hd1.w wVar2 = new hd1.w(mo48798x74292566, new hd1.h(mo48798x74292566, k3Var));
        java.lang.String mo48798x742925662 = component.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x742925662, "getAppId(...)");
        ((java.util.concurrent.ConcurrentHashMap) map).put(mo48798x742925662, wVar2);
        return wVar2;
    }

    public final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        hd1.b bVar = (hd1.b) a(component).f361972b;
        if (bVar.f361921d.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AbsNFCDiscoverable", "isNFCUsing, isDiscovering, using");
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bVar.f361920c, "<get-connectedTech>(...)");
        if (!r4.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AbsNFCDiscoverable", "isNFCUsing, connected, using");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AbsNFCDiscoverable", "isNFCUsing, not using");
        return false;
    }
}
