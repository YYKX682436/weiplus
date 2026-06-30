package hb5;

/* loaded from: classes11.dex */
public class u implements s01.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 f361792a;

    public u(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 activityC21585x4f340ac4) {
        this.f361792a = activityC21585x4f340ac4;
    }

    @Override // s01.l
    public void a(s01.k kVar) {
        if (kVar == null || kVar.f483424c == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatFavUI", "bizChatExtension bizChat change");
        r01.q3.Ui().z0(kVar.f483423b);
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 activityC21585x4f340ac4 = this.f361792a;
        if (activityC21585x4f340ac4.f279454m) {
            activityC21585x4f340ac4.f279450f.q();
        }
    }
}
