package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class qi extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ti f190359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ti tiVar, java.lang.String str) {
        super(1);
        this.f190359d = tiVar;
        this.f190360e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.xn1 it = (r45.xn1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ti tiVar = this.f190359d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar = tiVar.f190594d;
        if (hpVar != null) {
            java.lang.String str = this.f190360e;
            if (str == null) {
                str = "";
            }
            android.app.Activity context = tiVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            hpVar.x0(it, (r16 & 2) != 0 ? "" : str, 5, (r16 & 8) != 0 ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6(), false, (r16 & 32) != 0 ? "" : null);
        }
        return jz5.f0.f384359a;
    }
}
