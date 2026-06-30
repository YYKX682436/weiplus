package sr2;

/* loaded from: classes10.dex */
public final class y3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 f493352d;

    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6) {
        this.f493352d = c14609xb4d6eef6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.b01 b01Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6 c14609xb4d6eef6 = this.f493352d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 k17 = c14609xb4d6eef6.k7().k();
        if (k17 == null) {
            return;
        }
        java.lang.String i18 = c14609xb4d6eef6.k7().i();
        java.lang.String l17 = c14609xb4d6eef6.k7().l();
        int g17 = c14609xb4d6eef6.k7().g();
        byte[] byteArray = c14609xb4d6eef6.k7().f482949c.getByteArray("VIDEO_COVER_INFO_WRAP");
        r45.b01 b01Var2 = null;
        if (byteArray != null) {
            r45.b01 b01Var3 = new r45.b01();
            b01Var3.mo11468x92b714fd(byteArray);
            b01Var = b01Var3;
        } else {
            b01Var = null;
        }
        java.lang.String n17 = c14609xb4d6eef6.k7().n();
        int intExtra = c14609xb4d6eef6.k7().f482945a.getIntExtra("VIDEO_SHARE_COVER_STYLE", 0);
        byte[] byteArrayExtra = c14609xb4d6eef6.k7().f482945a.getByteArrayExtra("VIDEO_SHARE_COVER_INFO_WRAP");
        if (byteArrayExtra != null) {
            b01Var2 = new r45.b01();
            b01Var2.mo11468x92b714fd(byteArrayExtra);
        }
        c14609xb4d6eef6.O7("");
        pf5.e.m158343xd39de650(c14609xb4d6eef6, null, null, new sr2.r3(c14609xb4d6eef6, k17, i18, l17, b01Var, g17, n17, b01Var2, intExtra, null), 3, null);
    }
}
