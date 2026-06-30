package tb1;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 f498438d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610) {
        this.f498438d = c12042x78b65610;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = this.f498438d;
        if (c12042x78b65610.f161708n.equals("auto")) {
            c12042x78b65610.F.m66792x175c5771(3);
            return;
        }
        if (c12042x78b65610.f161708n.equals("torch")) {
            c12042x78b65610.F.m66792x175c5771(1);
            return;
        }
        if (!c12042x78b65610.f161708n.equals("on")) {
            if (c12042x78b65610.f161708n.equals("torch")) {
                c12042x78b65610.F.m66792x175c5771(1);
                return;
            } else {
                c12042x78b65610.F.m66792x175c5771(2);
                return;
            }
        }
        int i17 = c12042x78b65610.f161700J;
        if (i17 == 2 || i17 == 4 || !c12042x78b65610.f161708n.equals("on")) {
            c12042x78b65610.F.m66792x175c5771(1);
        } else {
            c12042x78b65610.F.m66792x175c5771(2);
        }
    }
}
