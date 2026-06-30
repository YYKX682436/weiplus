package xt1;

/* loaded from: classes15.dex */
public class k extends dm.r1 {
    public static final l75.e0 K1 = dm.r1.m125439x3593deb(xt1.k.class);
    public java.lang.String A1;
    public r45.pt C1;
    public r45.ju D1;
    public boolean I1;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f538042y1;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f538043z1;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f538040p1 = "";

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f538041x1 = "";
    public boolean B1 = false;
    public java.util.List E1 = null;
    public java.util.List F1 = null;
    public int G1 = 0;
    public int H1 = 0;
    public java.util.List J1 = null;

    @Override // dm.r1, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return K1;
    }

    public r45.pt t0() {
        r45.pt ptVar = this.C1;
        if (ptVar != null) {
            return ptVar;
        }
        try {
            r45.pt ptVar2 = (r45.pt) new r45.pt().mo11468x92b714fd(this.f68120xce7ed661);
            this.C1 = ptVar2;
            return ptVar2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardMsgInfo", "getCardButton fail, ex = %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardMsgInfo", e17, "", new java.lang.Object[0]);
            return new r45.pt();
        }
    }

    public r45.ju u0() {
        r45.ju juVar = this.D1;
        if (juVar != null) {
            return juVar;
        }
        try {
            r45.ju juVar2 = (r45.ju) new r45.ju().mo11468x92b714fd(this.f68133xffdfbcbd);
            this.D1 = juVar2;
            return juVar2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardMsgInfo", "getOperationRegion fail, ex = %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardMsgInfo", e17, "", new java.lang.Object[0]);
            return new r45.ju();
        }
    }
}
