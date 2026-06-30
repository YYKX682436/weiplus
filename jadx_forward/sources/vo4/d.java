package vo4;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.i f520155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vo4.i iVar) {
        super(0);
        this.f520155d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vo4.r rVar = this.f520155d.f520167e;
        p05.l4 l4Var = rVar.f520207c;
        if (l4Var != null) {
            l4Var.o();
        }
        rVar.c(false);
        rVar.f520209e.clear();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VLogRelease release clearCache, ");
        vo4.s sVar = rVar.f520210f;
        is0.c[] cVarArr = sVar.f520216a;
        sb6.append(cVarArr.length);
        sb6.append(", ");
        is0.c[] cVarArr2 = sVar.f520217b;
        sb6.append(cVarArr2.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptTexCache", sb6.toString());
        for (is0.c cVar : cVarArr) {
            if (cVar != null) {
                cVar.close();
            }
        }
        for (is0.c cVar2 : cVarArr2) {
            if (cVar2 != null) {
                cVar2.close();
            }
        }
        return jz5.f0.f384359a;
    }
}
