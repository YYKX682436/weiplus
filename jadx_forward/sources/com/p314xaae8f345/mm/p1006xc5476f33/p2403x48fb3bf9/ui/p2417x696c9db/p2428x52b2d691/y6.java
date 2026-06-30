package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class y6 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f268212a;

    public y6(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f268212a = rVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "onCallback#failCallback, errCode: " + num);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f268212a;
        if (rVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(num.intValue()));
        }
    }
}
