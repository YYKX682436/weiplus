package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class l10 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f216545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f216546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10 f216547f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l10(db5.g4 g4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10 t10Var) {
        super(1);
        this.f216545d = g4Var;
        this.f216546e = abstractC14490x69736cb5;
        this.f216547f = t10Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.o it = (jz5.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ((java.util.ArrayList) this.f216545d.f309877d).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f216546e;
        boolean m59203x7541886a = abstractC14490x69736cb5.getFeedObject().m59203x7541886a(103);
        if (!abstractC14490x69736cb5.getFeedObject().m59335xcab26cf9()) {
            if (m59203x7541886a) {
                this.f216545d.j(103, (java.lang.CharSequence) it.f384375e, com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, m59203x7541886a);
            } else {
                this.f216545d.j(103, this.f216547f.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573608f54), com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, m59203x7541886a);
            }
        }
        return jz5.f0.f384359a;
    }
}
