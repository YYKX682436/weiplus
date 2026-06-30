package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4;

/* loaded from: classes7.dex */
public class o0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f167651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p0 f167652b;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p0 p0Var, km5.b bVar) {
        this.f167652b = p0Var;
        this.f167651a = bVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p pVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCgiServiceWC", "syncPipeline cgi[%s] errType[%d] errCode[%d] errMsg[%s]", this.f167652b.f167658b, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        boolean z17 = fVar instanceof r45.ny3;
        km5.b bVar = this.f167651a;
        if (!z17) {
            bVar.a(new java.lang.Exception(java.lang.String.format(java.util.Locale.ENGLISH, "Invalid ResponseProtoBuf, %d %d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str)));
            return;
        }
        boolean a17 = th1.a.a(i17, i18, fVar);
        com.p314xaae8f345.mm.p944x882e457a.n nVar = oVar.f152244b;
        if (a17) {
            bVar.c(nVar.f152233a);
            return;
        }
        switch (i17) {
            case 0:
            case 4:
                pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.o.SERVER, i18, str, nVar.f152233a);
                break;
            case 1:
            case 2:
            case 7:
            case 8:
                pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.o.NETWORK, i18, str, null);
                break;
            case 3:
            default:
                pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.o.SEND, i18, str, null);
                break;
            case 5:
                pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.o.DECODE, i18, str, null);
                break;
            case 6:
                pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.o.ENCODE, i18, str, null);
                break;
        }
        bVar.a(pVar);
    }
}
