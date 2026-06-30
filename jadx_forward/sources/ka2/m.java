package ka2;

/* loaded from: classes10.dex */
public final class m extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf {
    public final /* synthetic */ java.util.ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 f387572J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4, in5.s sVar) {
        super(sVar, arrayList, false);
        this.I = arrayList;
        this.f387572J = activityC13659x4f0951e4;
    }

    @Override // in5.n0, com.p314xaae8f345.mm.ui.p2730xe821e364.AbstractC22470xf90b5f7b, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        boolean z17;
        r45.hd1 hd1Var;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        super.mo8157xe5e2e48d(holder, i17, payloads);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.qvk);
        if (imageView != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4 = this.f387572J;
            if (activityC13659x4f0951e4.f183326t) {
                ha2.a aVar = activityC13659x4f0951e4.f183327u;
                z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b((aVar == null || (hd1Var = aVar.f361324d) == null) ? null : hd1Var.m75945x2fec8307(0), ((ha2.a) this.I.get(i17)).f361324d.m75945x2fec8307(0));
            } else {
                z17 = activityC13659x4f0951e4.f183328v == i17;
            }
            imageView.setVisibility(z17 ? 0 : 8);
        }
    }
}
