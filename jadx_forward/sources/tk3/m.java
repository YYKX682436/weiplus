package tk3;

/* loaded from: classes8.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.t f501463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f501464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(tk3.t tVar, int i17) {
        super(0);
        this.f501463d = tVar;
        this.f501464e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e;
        tk3.t tVar = this.f501463d;
        if (tVar.p()) {
            boolean z17 = tVar.f501483e;
            if (z17) {
                tk3.d dVar = tVar.f501482d;
                if (dVar != null && (c16608xd141945e = dVar.f501446a) != null) {
                    c16608xd141945e.m67190x2e48800e(z17);
                }
                tVar.f501483e = false;
            }
            tk3.d dVar2 = tVar.f501482d;
            if (dVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e2 = dVar2.f501446a;
                if (c16608xd141945e2 != null && c16608xd141945e2.getVisibility() == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e3 = dVar2.f501446a;
                    java.lang.Boolean valueOf = c16608xd141945e3 != null ? java.lang.Boolean.valueOf(c16608xd141945e3.f232088z) : null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "detachFromWindow, hide floatBallView, needTranslateAnimation: %b", valueOf);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e4 = dVar2.f501446a;
                        if (c16608xd141945e4 != null) {
                            c16608xd141945e4.q(new tk3.a(dVar2));
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1899x822d9a5b.C16608xd141945e c16608xd141945e5 = dVar2.f501446a;
                        if (c16608xd141945e5 != null) {
                            c16608xd141945e5.p(false, false, null);
                        }
                        dVar2.a();
                    }
                } else {
                    dVar2.a();
                }
            }
            tVar.f501482d = null;
            tVar.s(0L);
            java.util.Map map = nk3.e.f419570a;
            ((java.util.LinkedHashMap) map).clear();
            map.put("suspended_ball_source", java.lang.Integer.valueOf(nk3.e.f419573d));
            map.put("suspended_ball_close_type", java.lang.Integer.valueOf(this.f501464e));
            map.put("suspended_ball_sid", nk3.e.f419571b);
            map.put("suspended_ball_startms", java.lang.Long.valueOf(nk3.e.f419572c));
            map.put("suspended_ball_endms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("close_suspended_ball", map, 33488);
        }
        return jz5.f0.f384359a;
    }
}
