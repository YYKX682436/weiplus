package ns4;

/* loaded from: classes8.dex */
public final class n3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f421132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b, java.lang.String str) {
        super(0);
        this.f421132d = activityC19068x49d5e62b;
        this.f421133e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean Jj = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Jj("wxalite4868fef42257e6693a564693bd119376");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b = this.f421132d;
        if (Jj) {
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj("wxalite4868fef42257e6693a564693bd119376") == null) {
                if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).vj() == null) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().h(null);
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj("wxalite4868fef42257e6693a564693bd119376", null);
                Jj = false;
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("appId", "wxalite4868fef42257e6693a564693bd119376");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinRechargeView", "open liteapp:wxalite4868fef42257e6693a564693bd119376,page:");
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(activityC19068x49d5e62b.mo55332x76847179(), bundle, true, false, null);
            }
        }
        if (!Jj) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", this.f421133e);
            intent.putExtra("showShare", false);
            intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC19068x49d5e62b.mo55332x76847179(), intent);
        }
        return jz5.f0.f384359a;
    }
}
