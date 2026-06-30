package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wr implements iy2.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f196524a;

    public wr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar) {
        this.f196524a = etVar;
    }

    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "[onVoiceStart] start=" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f196524a;
        if (z17) {
            etVar.f193998z1 = true;
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((ml2.r0) c17).ak(2, 12, null);
        }
        float f17 = z17 ? 0.3f : 1.0f;
        android.view.View view = etVar.f193991x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "access$getInputParent$p(...)");
        com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4848xc6d43eff.m42328x90544e91(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vr(etVar, f17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = etVar.N;
        android.view.ViewGroup viewGroup = mgVar != null ? mgVar.f446856d : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setAlpha(f17);
    }
}
