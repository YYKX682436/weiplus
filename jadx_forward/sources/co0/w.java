package co0;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co0.y f125274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(co0.y yVar) {
        super(0);
        this.f125274d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        co0.y yVar = this.f125274d;
        if (yVar.f125277b == co0.u.f125271e) {
            yVar.f125277b = co0.u.f125272f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorPauseStateManager", "executeRealPause");
            co0.v vVar = yVar.f125276a;
            if (vVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "onExecuteRealPause");
                mn0.c cVar = mn0.c.f411236f;
                mn0.y yVar2 = ((mn0.j) vVar).f411294a;
                yVar2.H(false, cVar);
                yVar2.E();
                yVar2.p().mo94537x66343656(false);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("VisitorPauseStateManager", "timeout callback: ignore, currentState=" + yVar.f125277b);
        }
        return jz5.f0.f384359a;
    }
}
