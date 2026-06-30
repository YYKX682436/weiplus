package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class o3 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f266843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266845c;

    public o3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.util.Map map, nw4.y2 y2Var) {
        this.f266845c = c1Var;
        this.f266843a = map;
        this.f266844b = y2Var;
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHandler", "float window permission granted");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        java.util.Map map = this.f266843a;
        map.put("ret", 0);
        this.f266845c.i5(this.f266844b, "requestOverlayPermission:ok", map);
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHandler", "onResultCancel ok:%b", java.lang.Boolean.valueOf(((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        java.util.Map map = this.f266843a;
        map.put("ret", -1);
        this.f266845c.i5(this.f266844b, "requestOverlayPermission:ok", map);
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHandler", "float window permission refused");
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        java.util.Map map = this.f266843a;
        map.put("ret", -1);
        this.f266845c.i5(this.f266844b, "requestOverlayPermission:ok", map);
    }
}
