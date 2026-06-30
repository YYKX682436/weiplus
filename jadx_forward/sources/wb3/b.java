package wb3;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4) {
        r45.q43 q43Var = new r45.q43();
        q43Var.f465201d = str;
        q43Var.f465202e = str2;
        q43Var.f465203f = str3;
        q43Var.f465207m = i17;
        q43Var.f465208n = i18;
        q43Var.f465206i = str4;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c01.z1.r(), true);
        if (n17 != null) {
            q43Var.f465204g = n17.x3();
            q43Var.f465205h = n17.v3();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = q43Var;
        lVar.f152198b = new r45.r43();
        lVar.f152200d = 4583;
        lVar.f152199c = "/cgi-bin/mmpay-bin/foreignhbopen";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        a17.m47986x306cfea3(true);
        p(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiHKHbOpen", "nativeUrl: %s, sendId: %s, username: %s", str, str2, str3);
    }
}
