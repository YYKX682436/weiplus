package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class tb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.yb f205764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.yb ybVar) {
        super(1);
        this.f205764d = ybVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t6 response = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        if (!response.getHasMore()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.yb ybVar = this.f205764d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ybVar.f205921i, "[fetchEndCallback] totalSize=" + ybVar.O6().m56393xfb854877());
            ybVar.m58758x96811f7a().E(true);
        }
        return jz5.f0.f384359a;
    }
}
