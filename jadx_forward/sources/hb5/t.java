package hb5;

/* loaded from: classes11.dex */
public class t implements s01.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 f361791d;

    public t(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 activityC21585x4f340ac4) {
        this.f361791d = activityC21585x4f340ac4;
    }

    @Override // s01.f
    public void a(s01.e eVar) {
        s01.b bVar;
        if (eVar == null || (bVar = eVar.f483395b) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 activityC21585x4f340ac4 = this.f361791d;
        if (activityC21585x4f340ac4.f279452h.equals(bVar.f69065x75756b18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatFavUI", "bizChatExtension bizChatConv change");
            if (activityC21585x4f340ac4.f279454m) {
                activityC21585x4f340ac4.f279450f.q();
            }
        }
    }
}
