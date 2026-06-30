package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class q2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 f211898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f211899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var, android.content.Context context) {
        super(0);
        this.f211898d = q3Var;
        this.f211899e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Dialog dialog = this.f211898d.D;
        if (dialog != null) {
            dialog.dismiss();
        }
        db5.t7.m123882x26a183b(this.f211899e, com.p314xaae8f345.mm.R.C30867xcad56011.eyf, 0).show();
        return jz5.f0.f384359a;
    }
}
