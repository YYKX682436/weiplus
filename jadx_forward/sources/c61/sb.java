package c61;

/* loaded from: classes8.dex */
public final class sb implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.tb f120830d;

    public sb(c61.tb tbVar) {
        this.f120830d = tbVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public final void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        c61.tb tbVar = this.f120830d;
        tbVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSettingSwitchPlugin", "onMethodCall: " + call.f71610xbfc5d0e1);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(call.f71610xbfc5d0e1, "getUseSeparateSendButton")) {
            result.mo65719xbc9fa82f();
            return;
        }
        tbVar.getClass();
        try {
            java.lang.Object l17 = gm0.j1.u().c().l(66832, java.lang.Boolean.FALSE);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
            z17 = ((java.lang.Boolean) l17).booleanValue();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FlutterSettingSwitchPlugin", e17, "getUseSeparateSendButton failed", new java.lang.Object[0]);
            z17 = false;
        }
        result.mo65720x90b54003(java.lang.Boolean.valueOf(!z17));
    }
}
