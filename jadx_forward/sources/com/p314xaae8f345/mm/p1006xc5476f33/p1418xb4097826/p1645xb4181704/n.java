package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f211845e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var, android.content.Context context) {
        super(0);
        this.f211844d = o0Var;
        this.f211845e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Dialog dialog = this.f211844d.F;
        if (dialog != null) {
            dialog.dismiss();
        }
        db5.t7.m123882x26a183b(this.f211845e, com.p314xaae8f345.mm.R.C30867xcad56011.eyf, 0).show();
        return jz5.f0.f384359a;
    }
}
