package k91;

/* loaded from: classes7.dex */
public class o0 extends c01.i8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k91.p0 f387234a;

    public o0(k91.p0 p0Var) {
        this.f387234a = p0Var;
    }

    @Override // c01.i8
    public java.lang.String a() {
        return "MicroMsg.AppBrandNewContactFixVersionStateTransfer";
    }

    @Override // c01.i8
    public boolean b(int i17) {
        return i17 >= 637863936 && i17 <= 637863988;
    }

    @Override // c01.i8
    public void c(int i17) {
        if (b(i17)) {
            try {
                this.f387234a.getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi() == null) {
                    return;
                }
                x51.k0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ri();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij();
                Ri.A("WxaAttributesTable", java.lang.String.format(java.util.Locale.US, "update %s set %s='' where %s is null or %s=''", "WxaAttributesTable", "syncVersion", "versionInfo", "versionInfo"));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandNewContactFixVersionStateTransfer", "doFix e = %s", e17);
            }
        }
    }
}
