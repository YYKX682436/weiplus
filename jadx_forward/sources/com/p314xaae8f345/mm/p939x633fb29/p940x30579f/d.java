package com.p314xaae8f345.mm.p939x633fb29.p940x30579f;

/* loaded from: classes4.dex */
public class d implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f151909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p939x633fb29.p940x30579f.e f151910b;

    public d(com.p314xaae8f345.mm.p939x633fb29.p940x30579f.e eVar, km5.b bVar) {
        this.f151910b = eVar;
        this.f151909a = bVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        boolean z17 = i17 == 0 && i18 == 0 && ((r45.js5) fVar) != null;
        km5.b bVar = this.f151909a;
        com.p314xaae8f345.mm.p939x633fb29.p940x30579f.e eVar = this.f151910b;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MPGdprPolicyUtil", "onGetAuthCgiBack, business(%s), appId(%s), back(%d %d %s)", eVar.f151911a.f151903d, eVar.f151912b, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str);
            eVar.f151913c.a(0);
            bVar.a(java.lang.Boolean.FALSE);
            return;
        }
        r45.ig3 ig3Var = (r45.ig3) fVar;
        if (ig3Var.f458548d == null) {
            r45.ed7 ed7Var = new r45.ed7();
            ig3Var.f458548d = ed7Var;
            ed7Var.f454870d = -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPGdprPolicyUtil", "onGetAuthCgiBack, business(%s), appId(%s), back(%d %d)", eVar.f151911a.f151903d, eVar.f151912b, java.lang.Integer.valueOf(ig3Var.f458548d.f454870d), java.lang.Integer.valueOf(ig3Var.f458549e));
        if (ig3Var.f458548d.f454870d != 0) {
            eVar.f151913c.a(0);
            bVar.a(java.lang.Boolean.FALSE);
        } else if (ig3Var.f458549e <= 0) {
            bVar.c(java.lang.Boolean.TRUE);
        } else {
            eVar.f151913c.a(0);
            bVar.a(java.lang.Boolean.FALSE);
        }
    }
}
