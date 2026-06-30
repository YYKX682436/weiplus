package b32;

/* loaded from: classes10.dex */
public final class m implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e f99176d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e) {
        this.f99176d = c13397xbda8fd8e;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e = this.f99176d;
        java.lang.String str = c13397xbda8fd8e.f180226d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCompletion cost ");
        long startTick = c13397xbda8fd8e.getStartTick();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - startTick);
        sb6.append("ms");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        c13397xbda8fd8e.m54933xdcd6badd(android.os.SystemClock.elapsedRealtime());
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 c13390xb12545d7 = c13397xbda8fd8e.f180230h;
        if (c13390xb12545d7 != null) {
            c13390xb12545d7.f180163s = true;
            ph3.k kVar = c13390xb12545d7.f180159o;
            if (kVar != null) {
                kVar.o((int) 0.0d, true);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e = this.f99176d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 c13390xb12545d7 = c13397xbda8fd8e.f180230h;
        if (c13390xb12545d7 != null) {
            c13390xb12545d7.m54882xf046ee2a(new b32.l(c13397xbda8fd8e));
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c13397xbda8fd8e.m54933xdcd6badd(android.os.SystemClock.elapsedRealtime());
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 c13390xb12545d72 = c13397xbda8fd8e.f180230h;
        if (c13390xb12545d72 != null) {
            c13390xb12545d72.m54889x68ac462();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
