package com.tencent.mm.plugin.backup.backupui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/backupui/PCChooseConversationUI;", "Lcom/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class PCChooseConversationUI extends com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI {
    @Override // com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI
    public void Z6() {
        com.tencent.mm.pointers.PLong pLong = new com.tencent.mm.pointers.PLong();
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        nn1.a aVar = this.f92508e;
        aVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.HashSet hashSet = aVar.f338637e;
        if (hashSet.size() > 0) {
            pLong.value = 0L;
            pInt.value = 0;
            aVar.a();
            for (int i17 = 0; i17 < aVar.getCount(); i17++) {
                if (hashSet.contains(java.lang.Integer.valueOf(i17))) {
                    kn1.i iVar = (kn1.i) aVar.a().get(i17);
                    linkedList.add(iVar);
                    pLong.value += iVar.f309628g;
                    pInt.value = (int) (pInt.value + iVar.f309629h);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveChooseAdapter", "finishSelected usernameSize:%d, convSize:%d, convMsgCount:%d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Long.valueOf(pLong.value), java.lang.Integer.valueOf(pInt.value));
        }
        qn1.c.i().l().f(kn1.k.t(linkedList));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseConversationUI", "initView OnMenuItemClickListener startbackup choose records finish, selectedConversation size[%d], timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f92521u), java.lang.Long.valueOf(this.f92523w), java.lang.Long.valueOf(this.f92524x), java.lang.Integer.valueOf(this.f92522v));
        xn1.h m17 = qn1.c.i().m();
        kotlin.jvm.internal.o.f(m17, "getMoveChooseServer(...)");
        m17.j(linkedList);
        if (j7().f364968h) {
            qn1.d j76 = j7();
            qn1.d j77 = j7();
            if (!j77.g()) {
                xn1.c.a("Type", 5);
                xn1.b.f455454a.a(5, 1, j77.f364969i);
            }
            j76.e(j77.g() ? 12 : 2);
            qn1.c.i().e().f309609a = 12;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            qn1.c.i().l().b(linkedList.size());
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(400L, 8L, 1L, false);
            g0Var.d(13735, 10, java.lang.Integer.valueOf(j7().f364974n));
            int i18 = this.f92521u;
            if (i18 == 1 && this.f92522v == 1) {
                g0Var.idkeyStat(400L, 32L, 1L, false);
                g0Var.idkeyStat(400L, 35L, 1L, false);
                g0Var.d(13735, 13, java.lang.Integer.valueOf(j7().f364974n));
            } else if (i18 == 1) {
                g0Var.idkeyStat(400L, 32L, 1L, false);
                g0Var.d(13735, 11, java.lang.Integer.valueOf(j7().f364974n));
            } else if (this.f92522v == 1) {
                g0Var.idkeyStat(400L, 35L, 1L, false);
                g0Var.d(13735, 12, java.lang.Integer.valueOf(j7().f364974n));
            }
        } else {
            qn1.c.i().e().f309609a = 12;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.modelsimple.g1.J("weixin", 17);
        }
        finish();
    }

    @Override // com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI
    public xn1.d b7() {
        xn1.h m17 = qn1.c.i().m();
        kotlin.jvm.internal.o.f(m17, "getMoveChooseServer(...)");
        return m17;
    }

    @Override // com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI
    public kn1.l c7() {
        qn1.c0 l17 = qn1.c.i().l();
        kotlin.jvm.internal.o.f(l17, "getBackupPcServer(...)");
        return l17;
    }

    @Override // com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        if (getIntent().getBooleanExtra("KEY_IS_BACKUP", false)) {
            this.G = true;
        }
        super.initView();
    }

    public final qn1.d j7() {
        qn1.d j17 = qn1.c.i().j();
        kotlin.jvm.internal.o.f(j17, "getBackupPcProcessMgr(...)");
        return j17;
    }
}
