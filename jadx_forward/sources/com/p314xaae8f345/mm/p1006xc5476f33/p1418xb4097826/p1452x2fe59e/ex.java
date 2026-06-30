package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ex extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f188205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f188206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f188207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(db5.g4 g4Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar) {
        super(1);
        this.f188205d = g4Var;
        this.f188206e = k0Var;
        this.f188207f = pzVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i4 actionMenuInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i4) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionMenuInfo, "actionMenuInfo");
        if (!actionMenuInfo.f183795l && this.f188205d.findItem(208) == null) {
            this.f188205d.j(208, actionMenuInfo.f183791h, com.p314xaae8f345.mm.R.raw.f78702x8b717bba, 0, actionMenuInfo.f183787d);
            hc2.f1.C(this.f188206e, this.f188207f.f190288g);
        }
        return jz5.f0.f384359a;
    }
}
