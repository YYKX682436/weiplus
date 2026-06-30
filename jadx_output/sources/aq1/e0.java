package aq1;

/* loaded from: classes11.dex */
public class e0 implements vg3.a4 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f13041d;

    public e0(java.lang.String str) {
        this.f13041d = str;
    }

    @Override // vg3.a4
    public void j(r45.ll4 ll4Var, com.tencent.mm.storage.f9 f9Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<msgsource>");
        sb6.append("<strangerantispamticket ticket=\"" + this.f13041d + "\"></strangerantispamticket>");
        java.lang.String p17 = c01.ia.p();
        if (p17 == null) {
            p17 = "";
        }
        sb6.append(p17);
        java.lang.String str = (com.tencent.mm.sdk.platformtools.t8.K0(ll4Var.f379577i) || !ll4Var.f379577i.startsWith("<msgsource>")) ? "<msgsource></msgsource>" : ll4Var.f379577i;
        ll4Var.f379577i = str;
        ll4Var.f379577i = str.replace("<msgsource>", sb6.toString());
    }
}
