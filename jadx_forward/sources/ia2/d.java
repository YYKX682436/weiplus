package ia2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public d(java.lang.Object obj) {
        super(1, obj, ia2.e.class, "handleRecentForwardMenuItemClick", "handleRecentForwardMenuItemClick(Ljava/lang/String;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        ia2.e eVar = (ia2.e) this.f72685xcfcbe9ef;
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BasicPOIMoreActionSheet", "handleRecentForwardMenuItemClick: " + str);
        if (str != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", str);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hashMap.put("view_id", "forward_recent_user_in_menu_in_poi_page");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, hashMap, 27051);
            eVar.a("forward_recent_more_poi");
        }
        return jz5.f0.f384359a;
    }
}
