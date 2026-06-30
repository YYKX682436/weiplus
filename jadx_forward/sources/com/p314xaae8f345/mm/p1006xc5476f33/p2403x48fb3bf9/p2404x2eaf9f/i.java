package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 f263380d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var) {
        super(0);
        this.f263380d = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String mo120156xb5887639;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = this.f263380d;
        if (r0Var.B0.contains(java.lang.Integer.valueOf(r0Var.f263484r0))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0Var.T(), "WebView-Trace PageLoadFull has commit status return");
        } else {
            java.lang.String str = r0Var.D;
            if (str == null || r26.n0.N(str)) {
                mo120156xb5887639 = r0Var.f263449a.mo120156xb5887639();
                if (mo120156xb5887639 == null) {
                    mo120156xb5887639 = "";
                }
            } else {
                mo120156xb5887639 = r0Var.D;
            }
            r0Var.P0(mo120156xb5887639);
            nw4.n g07 = r0Var.g0();
            if (g07 != null && (linkedList = g07.f422424e) != null) {
                linkedList.clear();
            }
            r0Var.X0(mo120156xb5887639);
        }
        return jz5.f0.f384359a;
    }
}
