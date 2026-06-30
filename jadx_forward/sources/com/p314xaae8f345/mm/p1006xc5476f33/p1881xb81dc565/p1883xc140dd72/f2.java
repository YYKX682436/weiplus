package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes8.dex */
public class f2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g2 f231110a;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g2 g2Var) {
        this.f231110a = g2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "on cgiSendCloudIlinkRequest result: %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.v27 v27Var = (r45.v27) oVar.f152244b.f152233a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g2 g2Var = this.f231110a;
        if (v27Var == null || (gVar = v27Var.f469367d) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m120020x4e33fe9(null, 0, -1, g2Var.f231122d.f465252d);
        } else {
            byte[] bArr = gVar.f273689a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.f231118c.m120020x4e33fe9(bArr, bArr.length, i18, g2Var.f231122d.f465252d);
        }
    }
}
