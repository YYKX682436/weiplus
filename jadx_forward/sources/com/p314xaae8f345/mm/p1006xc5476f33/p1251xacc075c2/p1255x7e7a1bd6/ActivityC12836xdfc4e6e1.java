package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/backupui/PCChooseConversationUI;", "Lcom/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.backupui.PCChooseConversationUI */
/* loaded from: classes12.dex */
public final class ActivityC12836xdfc4e6e1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de
    public void Z6() {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec c19769x48b92ec = new com.p314xaae8f345.mm.p2493x1bc889d6.C19769x48b92ec();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        nn1.a aVar = this.f174041e;
        aVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.HashSet hashSet = aVar.f420170e;
        if (hashSet.size() > 0) {
            c19769x48b92ec.f38866x6ac9171 = 0L;
            c19767x257d7f.f38864x6ac9171 = 0;
            aVar.a();
            for (int i17 = 0; i17 < aVar.getCount(); i17++) {
                if (hashSet.contains(java.lang.Integer.valueOf(i17))) {
                    kn1.i iVar = (kn1.i) aVar.a().get(i17);
                    linkedList.add(iVar);
                    c19769x48b92ec.f38866x6ac9171 += iVar.f391161g;
                    c19767x257d7f.f38864x6ac9171 = (int) (c19767x257d7f.f38864x6ac9171 + iVar.f391162h);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveChooseAdapter", "finishSelected usernameSize:%d, convSize:%d, convMsgCount:%d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Long.valueOf(c19769x48b92ec.f38866x6ac9171), java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171));
        }
        qn1.c.i().l().f(kn1.k.t(linkedList));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseConversationUI", "initView OnMenuItemClickListener startbackup choose records finish, selectedConversation size[%d], timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f174054u), java.lang.Long.valueOf(this.f174056w), java.lang.Long.valueOf(this.f174057x), java.lang.Integer.valueOf(this.f174055v));
        xn1.h m17 = qn1.c.i().m();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "getMoveChooseServer(...)");
        m17.j(linkedList);
        if (j7().f446501h) {
            qn1.d j76 = j7();
            qn1.d j77 = j7();
            if (!j77.g()) {
                xn1.c.a("Type", 5);
                xn1.b.f536987a.a(5, 1, j77.f446502i);
            }
            j76.e(j77.g() ? 12 : 2);
            qn1.c.i().e().f391142a = 12;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            qn1.c.i().l().b(linkedList.size());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(400L, 8L, 1L, false);
            g0Var.d(13735, 10, java.lang.Integer.valueOf(j7().f446507n));
            int i18 = this.f174054u;
            if (i18 == 1 && this.f174055v == 1) {
                g0Var.mo68477x336bdfd8(400L, 32L, 1L, false);
                g0Var.mo68477x336bdfd8(400L, 35L, 1L, false);
                g0Var.d(13735, 13, java.lang.Integer.valueOf(j7().f446507n));
            } else if (i18 == 1) {
                g0Var.mo68477x336bdfd8(400L, 32L, 1L, false);
                g0Var.d(13735, 11, java.lang.Integer.valueOf(j7().f446507n));
            } else if (this.f174055v == 1) {
                g0Var.mo68477x336bdfd8(400L, 35L, 1L, false);
                g0Var.d(13735, 12, java.lang.Integer.valueOf(j7().f446507n));
            }
        } else {
            qn1.c.i().e().f391142a = 12;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.mm.p957x53236a1b.g1.J("weixin", 17);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de
    public xn1.d b7() {
        xn1.h m17 = qn1.c.i().m();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "getMoveChooseServer(...)");
        return m17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de
    public kn1.l c7() {
        qn1.c0 l17 = qn1.c.i().l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "getBackupPcServer(...)");
        return l17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (getIntent().getBooleanExtra("KEY_IS_BACKUP", false)) {
            this.G = true;
        }
        super.mo43517x10010bd5();
    }

    public final qn1.d j7() {
        qn1.d j17 = qn1.c.i().j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getBackupPcProcessMgr(...)");
        return j17;
    }
}
