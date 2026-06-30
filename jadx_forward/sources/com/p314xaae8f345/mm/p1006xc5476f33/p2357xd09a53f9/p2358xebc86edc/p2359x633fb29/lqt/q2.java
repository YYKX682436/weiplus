package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class q2 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ff5 f259241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f259242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.w2 f259243c;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.w2 w2Var, r45.ff5 ff5Var, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        this.f259243c = w2Var;
        this.f259241a = ff5Var;
        this.f259242b = c19091x9511676c;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
    /* renamed from: call */
    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        if (abstractC3411xcfaed72e == null || !abstractC3411xcfaed72e.mo27551x2fec8307("result").equals("ok")) {
            return;
        }
        boolean mo27542xfb7da360 = abstractC3411xcfaed72e.mo27542xfb7da360("use_joint_channel");
        java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307(ya.b.f77506xba41a63c);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.w2 w2Var = this.f259243c;
        w2Var.f259267d = mo27551x2fec8307;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) w2Var.f259276m).get(this.f259241a.f455815f);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            w2Var.f259266c = str;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = w2Var.f259265b;
        if (abstractActivityC22902xe37969e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb) abstractActivityC22902xe37969e).f259607x1 = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb) abstractActivityC22902xe37969e).j7();
        }
        w2Var.b(this.f259242b.f69225xed6d60f6, mo27542xfb7da360 ? 1 : 0);
    }
}
