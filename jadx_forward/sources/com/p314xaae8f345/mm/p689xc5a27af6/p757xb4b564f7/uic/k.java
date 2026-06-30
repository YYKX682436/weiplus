package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n f148876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n nVar) {
        super(1);
        this.f148876d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        hb0.a state = (hb0.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        boolean z17 = state.f361546f;
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n nVar = this.f148876d;
        nVar.f148886e = z17;
        nVar.f148885d = state.f361549i;
        nVar.f148889h = state.f361545e;
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof eb0.a)) {
            eb0.a aVar = (eb0.a) dVar;
            nVar.f148888g = aVar.f332232d;
            nVar.f148887f = aVar.f332233e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5 = aVar.f332231c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 = aVar.f332230b;
            if (z17) {
                com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.j jVar = new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.j(nVar, aVar);
                if (c12474x8b872a21.f167792h) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = nVar.m158354x19263085();
                    java.lang.String unstatedWording = c12473xe2bfc4b5.f167787i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(unstatedWording, "unstatedWording");
                    java.lang.String format = java.lang.String.format(unstatedWording, java.util.Arrays.copyOf(new java.lang.Object[]{c12474x8b872a21.f167793i}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    db5.e1.E(m158354x19263085, format, "", nVar.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), false, new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.i(jVar));
                } else {
                    jVar.mo152xb9724478();
                }
            } else {
                com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n.T6(nVar, c12474x8b872a21, c12473xe2bfc4b5);
            }
        }
        return jz5.f0.f384359a;
    }
}
