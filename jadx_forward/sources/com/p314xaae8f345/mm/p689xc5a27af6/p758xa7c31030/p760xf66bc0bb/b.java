package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

/* loaded from: classes9.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.z f149208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.z zVar) {
        super(0);
        this.f149208d = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.z zVar = this.f149208d;
        java.util.LinkedList<com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.n> linkedList = zVar.f149260b;
        if (!(linkedList instanceof java.util.Collection) || !linkedList.isEmpty()) {
            for (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.n nVar : linkedList) {
                boolean R0 = nVar.R0();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "check " + zVar.f149259a + ": " + nVar.getClass() + ' ' + R0 + ' ');
                if (!R0) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        return java.lang.Boolean.valueOf(z17);
    }
}
