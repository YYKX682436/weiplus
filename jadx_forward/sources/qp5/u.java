package qp5;

/* loaded from: classes9.dex */
public class u implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o f447384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qp5.v f447385b;

    public u(qp5.v vVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar) {
        this.f447385b = vVar;
        this.f447384a = oVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n
    /* renamed from: onResult */
    public void mo26477x57429edc(boolean z17, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = this.f447384a;
        oVar.b();
        if (z17) {
            java.lang.String a17 = oVar.a();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                return;
            }
            java.lang.String[] split = a17.split("-");
            if (split.length < 2) {
                return;
            }
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[0], 0);
            int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(split[1], 0) - 1;
            qp5.v vVar = this.f447385b;
            vVar.f447386d = D12;
            int i27 = vVar.f447386d;
            if (D1 >= 0 || vVar.f447386d >= 0) {
                java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("00");
                if (c01.z1.I()) {
                    vVar.f447388f.setTag(decimalFormat.format(vVar.f447386d + 1) + D1);
                } else {
                    vVar.f447388f.setTag(decimalFormat.format(D1).substring(2) + decimalFormat.format(vVar.f447386d + 1));
                }
                vVar.f447388f.m83213x765074af(decimalFormat.format(vVar.f447386d + 1) + decimalFormat.format(D1).substring(2));
            } else {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = vVar.f447387e;
                db5.e1.s(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kli), null);
            }
            if (vVar.f447388f.m83175x3bf408ec() != null) {
                vVar.f447388f.m83175x3bf408ec().mo9068x194c4a1(vVar.f447388f.n());
            }
        }
    }
}
