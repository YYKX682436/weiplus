package ll;

/* loaded from: classes13.dex */
public abstract class j {
    public static ll.p a(ol.h hVar, ql.c cVar, int i17, boolean z17) {
        ll.d hVar2 = i17 != 2 ? i17 != 3 ? (cVar == null || !cVar.b().f415394z) ? new ll.h(hVar, cVar) : new ll.g(hVar, cVar) : new ll.i(hVar, cVar) : new ll.f(hVar, cVar);
        hVar2.f400629q = hVar2.f400614b.b().f415373e;
        hVar2.f400622j.set(false);
        hVar2.f400623k.set(false);
        if (hVar2.f400614b != null) {
            hVar2.f400614b.a();
        }
        hVar2.p(1);
        if (z17) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderBase", "preload", null);
            hVar2.f400620h.set(true);
            hVar2.p(10);
        }
        return hVar2;
    }
}
