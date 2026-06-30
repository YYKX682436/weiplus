package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class sp extends ni2.y2 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vp f201357h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vp vpVar, java.lang.String str, qo0.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.tp tpVar) {
        super(str, context, cVar, lVar, tpVar);
        this.f201357h = vpVar;
    }

    @Override // ni2.y2
    public void a(android.os.Bundle bundle) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appendRequestParams city: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vp vpVar = this.f201357h;
        r45.ze2 ze2Var = vpVar.L;
        sb6.append(ze2Var != null ? ze2Var.m75945x2fec8307(2) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f419044a, sb6.toString());
        android.widget.CheckBox checkBox = vpVar.R;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        if (checkBox.isChecked()) {
            r45.vy1 vy1Var = new r45.vy1();
            r45.ze2 ze2Var2 = vpVar.L;
            if (ze2Var2 == null || (str = ze2Var2.m75945x2fec8307(2)) == null) {
                str = "";
            }
            vy1Var.set(0, str);
            bundle.putByteArray("PARAM_FINDER_LIVE_LINK_MIC_LBS_LOCATION", vy1Var.mo14344x5f01b1f6());
        }
    }
}
