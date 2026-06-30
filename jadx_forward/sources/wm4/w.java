package wm4;

/* loaded from: classes.dex */
public class w implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm4.d f528847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f528848e;

    public w(sm4.d dVar, android.content.Context context) {
        this.f528847d = dVar;
        this.f528848e = context;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        this.f528847d.getClass();
        d17.q(2830, this);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryUILogic", "goUserProfile failed, NetSceneTopStoryGetUsername errType:%s, errCode:%s, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        java.lang.String str2 = ((r45.xq3) ((sm4.d) m1Var).f491467e.f152244b.f152233a).f471865d;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str2);
        intent.putExtra("Contact_Scene", 3);
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        j45.l.j(this.f528848e, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }
}
