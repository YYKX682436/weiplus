package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class op extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f190204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f190205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr f190206f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op(db5.g4 g4Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar) {
        super(1);
        this.f190204d = g4Var;
        this.f190205e = k0Var;
        this.f190206f = krVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i4 actionMenuInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i4) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionMenuInfo, "actionMenuInfo");
        if (!actionMenuInfo.f183795l && this.f190204d.findItem(208) == null) {
            this.f190204d.j(208, actionMenuInfo.f183791h, com.p314xaae8f345.mm.R.raw.f78702x8b717bba, 0, actionMenuInfo.f183787d);
            hc2.f1.C(this.f190205e, this.f190206f.f188763d);
        }
        return jz5.f0.f384359a;
    }
}
