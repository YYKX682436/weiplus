package wb3;

/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public c(java.lang.String str, java.lang.String str2, int i17, int i18) {
        r45.t43 t43Var = new r45.t43();
        t43Var.f467666d = str;
        t43Var.f467667e = str2;
        t43Var.f467670h = i17;
        t43Var.f467671i = i18;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c01.z1.r(), true);
        if (n17 != null) {
            t43Var.f467668f = n17.x3();
            t43Var.f467669g = n17.v3();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = t43Var;
        lVar.f152198b = new r45.u43();
        lVar.f152200d = 4787;
        lVar.f152199c = "/cgi-bin/mmpay-bin/foreignhbreceive";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        a17.m47986x306cfea3(true);
        p(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiHKHbReceive", "nativeUrl: %s, sendId: %s", str, str2);
    }
}
