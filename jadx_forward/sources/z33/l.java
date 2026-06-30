package z33;

/* loaded from: classes8.dex */
public class l extends com.p314xaae8f345.mm.app.z2 implements com.p314xaae8f345.mm.app.t5 {
    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppBackground */
    public void mo510x3be51a90(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatroomProcListener", "appForegroundListener, onAppBackground(%s)", str);
        s33.n.f484064c = null;
        if (gm0.j1.a() && gm0.j1.b().f354787q) {
            gm0.j1.b();
            gm0.m.r();
        }
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppForeground */
    public void mo511x1952ea5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatroomProcListener", "appForegroundListener, onAppForeground(%s)", str);
        s33.n.f484064c = str;
        if (gm0.j1.a() && gm0.j1.b().f354787q) {
            gm0.j1.b();
            gm0.m.r();
        }
    }
}
