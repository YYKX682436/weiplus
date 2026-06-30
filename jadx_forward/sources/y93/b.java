package y93;

/* loaded from: classes.dex */
public class b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mf0.y f541868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y93.c f541869e;

    public b(y93.c cVar, mf0.y yVar) {
        this.f541869e = cVar;
        this.f541868d = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        this.f541868d.getClass();
        d17.q(2830, this);
        y93.c cVar = this.f541869e;
        if (i17 != 0 || i18 != 0) {
            cVar.f224976f.a("goUserProfile failed");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiOpenProfileWithOpenId", "goUserProfile failed, NetSceneTopStoryGetUsername errType:%s, errCode:%s, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        java.lang.String str2 = ((r45.xq3) ((sm4.d) ((mf0.y) m1Var)).f491467e.f152244b.f152233a).f471865d;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str2);
        intent.putExtra("Contact_Scene", 3);
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        cVar.f224976f.d(false);
    }
}
