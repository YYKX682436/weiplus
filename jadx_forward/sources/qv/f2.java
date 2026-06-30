package qv;

/* loaded from: classes5.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk.f f448390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr.g f448391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(sk.f fVar, vr.g gVar) {
        super(1);
        this.f448390d = fVar;
        this.f448391e = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u4 u4Var = null;
        sk.f fVar = this.f448390d;
        if (booleanValue) {
            if (fVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.yd ydVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.yd) fVar;
                vr.g bizEmoticonContext = this.f448391e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizEmoticonContext, "bizEmoticonContext");
                nw4.k kVar = ydVar.f268223a;
                android.content.Context context = kVar.f422393a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context : null;
                if (viewOnCreateContextMenuListenerC19337x37f3384d != null && (e3Var = viewOnCreateContextMenuListenerC19337x37f3384d.L1) != null) {
                    u4Var = e3Var.Z0;
                }
                if (u4Var != null) {
                    u4Var.f268458a = bizEmoticonContext;
                }
                pm0.v.X(new vr.a(bizEmoticonContext, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.xd(kVar, ydVar.f268224b)));
            }
        } else if (fVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.yd ydVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.yd) fVar;
            nw4.g gVar = ydVar2.f268223a.f422396d;
            nw4.y2 y2Var = ydVar2.f268224b;
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        }
        return jz5.f0.f384359a;
    }
}
