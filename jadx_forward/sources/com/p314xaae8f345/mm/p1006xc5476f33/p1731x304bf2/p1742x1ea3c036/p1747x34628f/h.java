package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.i f221430d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.i iVar) {
        this.f221430d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.i iVar = this.f221430d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.j jVar = iVar.f221439c.f221452s2;
        if (jVar != null) {
            java.lang.String str = iVar.f221437a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427 activityC16010xe7956427 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.k1) jVar).f222819a;
            if (str.equalsIgnoreCase(activityC16010xe7956427.f222731n)) {
                java.lang.String format = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__isGameIndexPreload__= %s; })()", java.lang.Boolean.valueOf(g53.e.b()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebTabUI", "gamelog.setInjectJsPreloadDataCallback.tabKey:%s, jsStr_1:%s", str, format);
                activityC16010xe7956427.f221030g.o(format, null);
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, null, g53.l.class, activityC16010xe7956427.f222736s);
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k kVar = iVar.f221439c.f221445l2;
        objArr[0] = java.lang.Integer.valueOf(kVar != null ? kVar.b() : 0);
        java.lang.String format2 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameTabHeight__= %d; })()", objArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "tabKey:%s, jsStr_1:%s", iVar.f221437a, format2);
        iVar.f221438b.o(format2, null);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k kVar2 = iVar.f221439c.f221445l2;
        objArr2[0] = kVar2 != null ? kVar2.e() : "";
        java.lang.String format3 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameTabInfo__= %s; })()", objArr2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "tabKey:%s, jsStr_2:%s", iVar.f221437a, format3);
        iVar.f221438b.o(format3, null);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k kVar3 = iVar.f221439c.f221445l2;
        objArr3[0] = java.lang.Integer.valueOf(kVar3 != null ? kVar3.h() : 0);
        java.lang.String format4 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__chatPageStyle__= %s; })()", objArr3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "getChatPageStyle, jsStr_3:%s", format4);
        iVar.f221438b.o(format4, null);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k kVar4 = iVar.f221439c.f221445l2;
        objArr4[0] = java.lang.Boolean.valueOf(kVar4 != null ? kVar4.c() : false);
        java.lang.String format5 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__forceHideTab__= %s; })()", objArr4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "isForceHideTab: jsStr_4:%s", format5);
        iVar.f221438b.o(format5, null);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k kVar5 = iVar.f221439c.f221445l2;
        objArr5[0] = java.lang.Boolean.valueOf(kVar5 != null ? kVar5.f() : false);
        java.lang.String format6 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__hasEntranceInfo__= %s; })()", objArr5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "hasEntranceInfo : jsStr_5:%s", format6);
        iVar.f221438b.o(format6, null);
        java.lang.String format7 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__report_session_id__=\"%s\"; })()", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.b().getString("session_id"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "getSessionId, jsStr_6:%s", format7);
        iVar.f221438b.o(format7, null);
        java.lang.String format8 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameStatusBarHeight__= %d; })()", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bl.h(iVar.f221439c.f488143d)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "gameStatusBarHeight, jsStr_6:%s", format8);
        iVar.f221438b.o(format8, null);
        java.lang.String format9 = java.lang.String.format("javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameNavigationBarHeight__= %d; })()", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bl.c(iVar.f221439c.f488143d)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "gameNavigationBarHeight, jsStr_6:%s", format9);
        iVar.f221438b.o(format9, null);
        java.lang.String Q = iVar.f221439c.Q();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Q)) {
            java.lang.String format10 = java.lang.String.format("javascript:(function(){ window.__wxWebEnv= { getEnv: function(){ return %s; } }; })()", org.json.JSONObject.quote(Q));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "_wxWebEnv, :%s", org.json.JSONObject.quote(Q));
            iVar.f221438b.o(format10, null);
        }
        iVar.f221439c.X(iVar.f221437a, 2);
    }
}
