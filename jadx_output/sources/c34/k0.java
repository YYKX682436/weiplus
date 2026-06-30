package c34;

/* loaded from: classes9.dex */
public class k0 extends com.tencent.mm.sdk.event.n {
    public k0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.TVOperationEvent tVOperationEvent = (com.tencent.mm.autogen.events.TVOperationEvent) iEvent;
        am.jy jyVar = tVOperationEvent.f54878g;
        jyVar.getClass();
        j34.i b17 = j34.j.b(jyVar.f7106b);
        am.jy jyVar2 = tVOperationEvent.f54878g;
        am.ky kyVar = tVOperationEvent.f54879h;
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TVOperationListener", "error, xml[%s] can not parse", jyVar2.f7106b);
            kyVar.f7190a = false;
        } else {
            kyVar.f7191b = j34.j.c(jyVar2.f7105a, b17);
            kyVar.f7192c = c34.h0.Ai(b17.field_thumburl, "@B");
            kyVar.f7190a = true;
        }
        return false;
    }
}
