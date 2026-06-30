package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public class o1 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b f283585d;

    public o1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b) {
        this.f283585d = abstractC21611x7536149b;
    }

    @Override // yb5.n
    public void a() {
        java.lang.String m170462x21b90353;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f283585d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseChattingUIFragment", "[onEnterBegin] activity:%s isPreLoaded:%b", abstractC21611x7536149b.f279684e, java.lang.Boolean.valueOf(abstractC21611x7536149b.f279688i));
        yb5.d dVar = abstractC21611x7536149b.f279685f;
        dVar.f542247i = true;
        dVar.P(true);
        dVar.f542261w = false;
        dVar.V(false);
        abstractC21611x7536149b.f279686g.z();
        abstractC21611x7536149b.f279691o = 0L;
        java.lang.String str = "";
        if (((sq.e) i95.n0.c(sq.e.class)) != null) {
            int i17 = y02.g1.f540138d;
            y02.e1 e1Var = (y02.e1) p3380x6a61f93.p3387xf51c6630.C30638x21ba7336.m170455x21b0d463();
            if (e1Var != null && (m170462x21b90353 = p3380x6a61f93.p3387xf51c6630.C30638x21ba7336.m170462x21b90353(((y02.g1) e1Var).m105978x2737f10())) != null) {
                str = m170462x21b90353;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsUserStateMgrService", "genCliUniqueId: ".concat(str));
        }
        b00.k0.f98235a = str;
    }
}
