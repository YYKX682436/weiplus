package g33;

/* loaded from: classes10.dex */
public class a extends ck5.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349707a;

    /* renamed from: b, reason: collision with root package name */
    public long f349708b = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.f56078x428b3be8;

    public a(java.lang.String str) {
        this.f349707a = str;
    }

    public int a() {
        int i17;
        java.lang.String str = this.f349707a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoBoundaryCheck", "dz[check video but path is null or nil]");
        }
        boolean m40075x3170ff = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        boolean a17 = d61.c.a(str);
        if (a17) {
            i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69244xe35aebcb(this.f349707a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q1.f33748x366c91de, 500, m40075x3170ff ? 10485760 : (int) this.f349708b, m40075x3170ff ? 60000.0d : this.f349708b, 1000000);
        } else {
            i17 = ((int) com.p314xaae8f345.mm.vfs.w6.k(str)) > (m40075x3170ff ? 10485760 : 26214400) ? -1 : 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoBoundaryCheck", "check should remuxing, ret %d, isMp4 %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(a17));
        switch (i17) {
            case -6:
            case -5:
            case -4:
            case -3:
            case -2:
                return 1;
            case -1:
                return 2;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 0;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoBoundaryCheck", "unknown check type %d", java.lang.Integer.valueOf(i17));
                return 1;
        }
    }
}
