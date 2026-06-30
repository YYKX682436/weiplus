package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f235674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f235675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.i0 f235676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f235677g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.i0 i0Var, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25) {
        super(1);
        this.f235674d = h0Var;
        this.f235675e = h0Var2;
        this.f235676f = i0Var;
        this.f235677g = c22849x81a93d25;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List data = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) this.f235674d.f391656d;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f235675e.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        ((java.util.ArrayList) this.f235676f.f235605s).addAll(data);
        ((java.util.ArrayList) this.f235676f.f235604r).addAll(data);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.i0 i0Var = this.f235676f;
        if (i0Var.f235607u) {
            int intValue = ((java.lang.Number) ((jz5.n) i0Var.f393019q).mo141623x754a37bb()).intValue();
            this.f235676f.getClass();
            if (intValue == 42 && (!data.isEmpty())) {
                sa5.d.e(this.f235677g, i65.a.h(this.f235676f.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.v(this.f235676f, this.f235677g));
        return jz5.f0.f384359a;
    }
}
