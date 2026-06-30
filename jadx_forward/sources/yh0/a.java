package yh0;

/* loaded from: classes8.dex */
public final class a implements i35.f {
    @Override // i35.f
    public void K0(java.lang.String username, int i17, r45.g25 g25Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(username)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelContactExtension", "[+] onDeleteContact: yuanbao username:" + username + ", notify to server now.");
            ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ni(username);
        }
    }
}
