package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ih implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285716a;

    public ih(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105) {
        this.f285716a = c21908xb66fd105;
    }

    @Override // e31.i
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemDyeingTemplate", "onSubscribeMsgNotifyStateChange onError");
        yb5.d dVar = this.f285716a.f284708s;
        if (dVar != null) {
            dVar.J();
        }
    }

    @Override // e31.i
    public void b(java.lang.String str, e31.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "onSubscribeMsgNotifyStateChange onFinish isSubscribed: %b, switchOpen: %b, isAcceptWithNotify: %b", java.lang.Boolean.valueOf(jVar.f328608a), java.lang.Boolean.valueOf(jVar.f328609b), java.lang.Boolean.valueOf(jVar.f328615h));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f285716a;
        c21908xb66fd105.G.f328615h = jVar.f328615h;
        yb5.d dVar = c21908xb66fd105.f284708s;
        if (dVar != null) {
            dVar.J();
            db5.t7.m123882x26a183b(c21908xb66fd105.f284708s.g(), jVar.f328615h ? com.p314xaae8f345.mm.R.C30867xcad56011.peh : com.p314xaae8f345.mm.R.C30867xcad56011.pei, 0).show();
        }
    }
}
