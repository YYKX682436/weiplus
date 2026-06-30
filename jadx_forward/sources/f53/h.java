package f53;

/* loaded from: classes15.dex */
public class h implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f53.n f341186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 f341187b;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 c15901xbfc4864, f53.n nVar) {
        this.f341187b = c15901xbfc4864;
        this.f341186a = nVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtSomeoneView", "do GetRemindUserListResponse errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        f53.n nVar = this.f341186a;
        if (i17 != 0 || i18 != 0 || oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AtSomeoneView", "cgi request fail");
            if (nVar != null) {
                nVar.getClass();
                return;
            }
            return;
        }
        o33.b bVar = (o33.b) oVar.f152244b.f152233a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.C15901xbfc4864 c15901xbfc4864 = this.f341187b;
        ((java.util.LinkedList) c15901xbfc4864.f221512l2).addAll(bVar.f424259d);
        ((java.util.LinkedList) c15901xbfc4864.f221513m2).addAll(bVar.f424260e);
        if (bVar.f424262g) {
            c15901xbfc4864.f221515o2.putByteArray("context", bVar.f424261f.g());
            c15901xbfc4864.m1(nVar);
        } else {
            c15901xbfc4864.o1(c15901xbfc4864.f221512l2, c15901xbfc4864.f221513m2);
            if (nVar != null) {
                ((f53.c) nVar).a(true);
            }
        }
    }
}
