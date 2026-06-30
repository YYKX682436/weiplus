package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ol extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f195297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar) {
        super(0);
        this.f195297d = hmVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vg2.m mVar = this.f195297d.N1;
        if (mVar != null) {
            ce2.i value = (ce2.i) dk2.u7.f315718e.get(mVar.I.f67814x2c488eb6);
            r45.mb v07 = value != null ? value.v0() : null;
            if (!(v07 == null)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
                mVar.I = value;
                mVar.g0(value);
                if (v07.m75939xb282bd08(0) == 2) {
                    android.content.Context context = mVar.f199716e;
                    db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oq8));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
