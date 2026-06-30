package r62;

/* loaded from: classes12.dex */
public class b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r62.d f474538d;

    public b(r62.d dVar) {
        this.f474538d = dVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        c01.d9.e().q(106, this);
        r62.d dVar = this.f474538d;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RedirectToChattingByPhoneHelper", "hy: err net.errType: %d, errCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            r62.d.a(dVar, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: searched data.");
        r45.iw5 H = ((tg3.r1) m1Var).H();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: contact count: %d", java.lang.Integer.valueOf(H.D));
        if (H.D <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: only one result is retrieved. start to chatting directly");
            dVar.f(H);
            return;
        }
        java.util.LinkedList linkedList = H.E;
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: no result is retrieved. start to search UI");
            r62.d.a(dVar, H);
        }
        if (linkedList.size() <= 1) {
            dVar.e((r45.gw5) linkedList.getFirst());
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("add_more_friend_search_scene", 3);
            intent.putExtra("result", H.mo14344x5f01b1f6());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: more than one contact is resolved. starting to ContactSearchResultUI");
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.n(intent, dVar.f474544b);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RedirectToChattingByPhoneHelper", e17, "", new java.lang.Object[0]);
        }
    }
}
