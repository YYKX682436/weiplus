package lb3;

/* loaded from: classes4.dex */
public class c extends lb3.b {
    public c(java.lang.String str, java.lang.String str2, byte[] bArr) {
        r45.a25 a25Var = new r45.a25();
        a25Var.f451201d = str;
        a25Var.f451202e = str2;
        a25Var.f451203f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        this.f399287b = a25Var;
    }

    @Override // lb3.b
    public r45.js5 b() {
        return new r45.b25();
    }

    @Override // lb3.b
    public int c() {
        return 2701;
    }

    @Override // lb3.b
    public java.lang.String d() {
        return "/cgi-bin/mmbiz-bin/wxahb/openwxaapphb";
    }

    @Override // lb3.b
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiOpenWxaHB", "CgiOpenWxaHB.onCgiEnd ");
    }

    @Override // lb3.b
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiOpenWxaHB", "CgiOpenWxaHB.onCgiStart ");
    }
}
