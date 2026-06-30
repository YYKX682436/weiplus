package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.j.class)
/* loaded from: classes9.dex */
public final class p0 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e, sb5.j {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f281192e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f281193f = new java.util.LinkedHashMap();

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        ((java.util.LinkedHashMap) this.f281192e).clear();
        ((java.util.LinkedHashMap) this.f281193f).clear();
    }

    public rd5.d m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        if (this.f280113d.g() instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) ((java.util.LinkedHashMap) this.f281192e).get(this.f280113d.x());
            rd5.d dVar = concurrentHashMap != null ? (rd5.d) concurrentHashMap.get(kz5.n0.g0(kz5.c0.i(java.lang.String.valueOf(msgInfo.Q0()), java.lang.String.valueOf(msgInfo.m124847x74d37ac6()), java.lang.String.valueOf(msgInfo.T1())), "||", null, null, 0, null, null, 62, null)) : null;
            if (dVar != null && rd5.e.a(dVar.f475787d.f526833b, msgInfo)) {
                return dVar;
            }
        }
        java.lang.Object m78011x5a5dd5d = msgInfo.m78011x5a5dd5d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m78011x5a5dd5d, "null cannot be cast to non-null type com.tencent.mm.storage.MsgInfo");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) m78011x5a5dd5d;
        yb5.d mChattingContext = this.f280113d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mChattingContext, "mChattingContext");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dr a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xr.a(mChattingContext);
        yb5.d mChattingContext2 = this.f280113d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mChattingContext2, "mChattingContext");
        java.lang.Object d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wr) a17).d(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wr) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xr.a(mChattingContext2)).c(msgInfo));
        if (d17 instanceof we5.b) {
            yb5.d mChattingContext3 = this.f280113d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mChattingContext3, "mChattingContext");
            return ((we5.b) d17).b(new we5.a(mChattingContext3, f9Var));
        }
        yb5.d mChattingContext4 = this.f280113d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mChattingContext4, "mChattingContext");
        return new rd5.d(new we5.a(mChattingContext4, f9Var));
    }
}
