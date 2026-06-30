package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class tz implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz f196034d;

    public tz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz zzVar) {
        this.f196034d = zzVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.ok1 ok1Var = (r45.ok1) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz zzVar = this.f196034d;
        mm2.h7 h7Var = (mm2.h7) zzVar.P0(mm2.h7.class);
        java.lang.String N6 = h7Var.N6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPlugin", "multiStreamDelete is curStreamId: curStreamIddelete success: " + pm0.v.d0(h7Var.f410650i, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sz(ok1Var)));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(N6, ok1Var.m75945x2fec8307(2))) {
            android.view.ViewGroup viewGroup = zzVar.f446856d;
            db5.t7.m123883x26a183b(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573236dz2), 0).show();
            ((mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class)).f410649h = 0;
        }
        if (((mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class)).f410649h == h7Var.f410650i.size()) {
            mm2.h7 h7Var2 = (mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class);
            h7Var2.f410649h--;
        }
        if (((mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class)).f410649h < 0) {
            ((mm2.h7) h7Var.m147920xbba4bfc0(mm2.h7.class)).f410649h = 0;
        }
        zzVar.y1(h7Var.f410650i);
    }
}
