package i61;

/* loaded from: classes4.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public b(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.y yVar = new r45.y();
        yVar.f472173d = str;
        yVar.f472174e = str2;
        yVar.f472175f = i17;
        lVar.f152197a = yVar;
        lVar.f152198b = new r45.z();
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaapayurge";
        lVar.f152200d = 1644;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiAAPayUrge", "CgiAAPayUrge, billNo: %s, chatroom: %s, scene: %s", str, str2, java.lang.Integer.valueOf(i17));
    }
}
