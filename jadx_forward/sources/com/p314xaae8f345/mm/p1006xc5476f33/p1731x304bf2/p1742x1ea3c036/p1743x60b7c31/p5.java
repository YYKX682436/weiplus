package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

@mk0.a
/* loaded from: classes.dex */
class p5 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private p5() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("chatVcSelectTab");
        java.lang.String string = bundle.getString("game_msg_ui_from_msgid");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_ENTRANCE_MSG_TAB_TYPE_INT_SYNC, java.lang.Integer.valueOf(i17));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_INTERACTIVE_MSG_ID_STRING_SYNC, string);
        rVar.a(new android.os.Bundle());
    }
}
