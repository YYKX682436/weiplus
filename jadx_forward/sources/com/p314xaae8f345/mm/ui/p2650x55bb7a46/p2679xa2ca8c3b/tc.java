package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes4.dex */
public class tc extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287107e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nc ncVar, int i17, r35.m3 m3Var, yb5.d dVar) {
        super(i17, m3Var);
        this.f287107e = dVar;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        if (m75730xb5887064() == null || !(m75730xb5887064() instanceof java.lang.String)) {
            return;
        }
        java.lang.String str = (java.lang.String) m75730xb5887064();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgPat", "click %s", str);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Contact_User", str);
        yb5.d dVar = this.f287107e;
        putExtra.putExtra("Contact_ChatRoomId", dVar.x());
        putExtra.putExtra("CONTACT_INFO_UI_SOURCE", 21);
        putExtra.putExtra("Contact_Scene", 14);
        j45.l.j(dVar.g(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", putExtra, null);
    }
}
