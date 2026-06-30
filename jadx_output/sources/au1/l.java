package au1;

/* loaded from: classes8.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final au1.l f14062a = new au1.l();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetCardEntranceStyle", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.ac3 ac3Var = (r45.ac3) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetCardEntranceStyle", "retCode: %s", java.lang.Integer.valueOf(ac3Var.f369915d));
            if (ac3Var.f369915d == 0) {
                boolean z17 = ac3Var.f369917f;
                com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetCardEntranceStyle", "new version: %s, new version style: %s, trade area: %s, is_card_home_page_v2: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(ac3Var.f369918g), java.lang.Integer.valueOf(ac3Var.f369919h), java.lang.Boolean.valueOf(ac3Var.f369921m));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_SWITCH_INT_SYNC, java.lang.Integer.valueOf(z17 ? 1 : 0));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_SHOW_SORT_INT_SYNC, java.lang.Integer.valueOf(ac3Var.f369918g));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_TRADE_AREA_INT_SYNC, java.lang.Integer.valueOf(ac3Var.f369919h));
                ac3Var.f369921m = true;
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_SWITCH_V2_BOOLEAN_SYNC, java.lang.Boolean.valueOf(ac3Var.f369921m));
                r45.iu iuVar = ac3Var.f369920i;
                if (iuVar != null) {
                    byte[] byteArray = iuVar.toByteArray();
                    kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_TRADE_AREA_INFO_STRING_SYNC, new java.lang.String(byteArray, r26.c.f368867c));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
