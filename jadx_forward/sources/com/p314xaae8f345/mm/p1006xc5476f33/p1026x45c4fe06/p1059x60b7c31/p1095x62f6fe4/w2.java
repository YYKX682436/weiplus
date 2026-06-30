package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public class w2 implements p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x2 f163644d;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x2 x2Var) {
        this.f163644d = x2Var;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        return oz5.m.f431862d;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public void mo48700xdecd0e93(java.lang.Object obj) {
        java.util.HashSet hashSet;
        boolean z17 = obj instanceof qc0.m1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x2 x2Var = this.f163644d;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d3 d3Var = x2Var.f163659d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65 c12161x45420d65 = d3Var.f163293e;
            c12161x45420d65.f163165d = 0;
            d3Var.m50420x7b736e5c(c12161x45420d65);
            return;
        }
        qc0.m1 m1Var = (qc0.m1) obj;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_new_sight_media_opt_code", m1Var.f442945c);
        intent.putExtra("key_new_sight_image_path", m1Var.a() != null ? m1Var.a().f442929b : null);
        x2Var.f163659d.mo9729x757c998b(4, m1Var.f442944b, intent);
        hashSet = x2Var.f163659d.f163302q;
        hashSet.add(java.lang.Integer.valueOf(m1Var.f442943a));
    }
}
