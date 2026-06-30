package com.p314xaae8f345.mm.ui.p2731xc84c5534;

/* loaded from: classes12.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2731xc84c5534.p f291265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2731xc84c5534.o f291266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.ui.p2731xc84c5534.p pVar, com.p314xaae8f345.mm.ui.p2731xc84c5534.o oVar) {
        super(0);
        this.f291265d = pVar;
        this.f291266e = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.ui.p2731xc84c5534.d0.f291160b;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.p pVar = this.f291265d;
        yz5.l lVar = (yz5.l) concurrentHashMap.get(pVar);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f291266e);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.FilePreviewReporter", "report type: " + pVar + " not found");
        }
        return f0Var2;
    }
}
