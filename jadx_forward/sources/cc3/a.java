package cc3;

/* loaded from: classes2.dex */
public class a extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f122013q;

    public a(java.lang.String str, boolean z17, java.lang.String str2) {
        r45.um3 um3Var = new r45.um3();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = um3Var;
        lVar.f152198b = new r45.vm3();
        lVar.f152200d = 3634;
        lVar.f152199c = "/cgi-bin/micromsg-bin/getredpacketstory";
        lVar.f152211o = 1;
        um3Var.f469014d = str;
        um3Var.f469015e = str2;
        if (!z17) {
            lVar.f152205i = 5000;
        }
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        a17.m47986x306cfea3(z17);
        p(a17);
        this.f122013q = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiRedPacketStoryInfo", "packet id: %s", str);
    }
}
