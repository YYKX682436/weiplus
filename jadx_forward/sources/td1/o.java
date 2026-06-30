package td1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltd1/o;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiOperateRecentUsageList$Companion$Parameter;", "Lcom/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiOperateRecentUsageList$Companion$Result;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class o implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12224xfdf1bf9e c12224xfdf1bf9e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12224xfdf1bf9e) obj;
        if (c12224xfdf1bf9e == null || rVar == null) {
            return;
        }
        int ordinal = c12224xfdf1bf9e.f164447d.ordinal();
        java.lang.String str = c12224xfdf1bf9e.f164448e;
        int i17 = c12224xfdf1bf9e.f164450g;
        if (ordinal == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("REMOVE_FROM_RECENT_USAGE_LIST  appId=");
            java.lang.String str2 = c12224xfdf1bf9e.f164449f;
            sb6.append(str2);
            sb6.append("  versionType=");
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.operateRecentUsageList", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o6.a(str, str2, i17, null);
            rVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848.f164451g);
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.operateRecentUsageList", "REMOVE_FROM_MY_COLLECTION username=" + str + "  versionType=" + i17);
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class)).D0(str, i17, true)) {
                rVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848.f164451g);
                return;
            } else {
                rVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848.f164452h);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.operateRecentUsageList", "ADD_TO_MY_COLLECTION   username=" + str + "  versionType=" + i17);
        int m07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class)).m0(str, i17, true);
        if (m07 == -3) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848(false, td1.l.f499144h, "action be blocked"));
            return;
        }
        if (m07 == -2) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848(false, td1.l.f499143g, "star app's count reached maximum limit"));
            return;
        }
        if (m07 == -1) {
            rVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848.f164452h);
        } else if (m07 != 0) {
            rVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848.f164452h);
        } else {
            rVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848.f164451g);
        }
    }
}
