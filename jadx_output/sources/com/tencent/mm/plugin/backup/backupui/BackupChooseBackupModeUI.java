package com.tencent.mm.plugin.backup.backupui;

/* loaded from: classes5.dex */
public class BackupChooseBackupModeUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f92537f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.setting.ui.setting.b f92538e = new un1.f(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488171jb;
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.ach);
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ui();
        setMMTitle(com.tencent.mm.R.string.n4e);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.ugn)).setText(com.tencent.mm.R.string.o9t);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.ugm)).setText(com.tencent.mm.R.string.o9s);
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: un1.e$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI.f92537f;
                com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI.this.finish();
                return true;
            }
        });
        ((bt.a) ((com.tencent.mm.app.o2) i95.n0.c(com.tencent.mm.app.o2.class))).Ai();
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.roambackup.RepairerConfigEnableRoamBackup());
        com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_unify_enable_new_roam_backup is " + c17);
        final boolean z17 = c17 == 1;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.f92938f);
            com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
            roamBackupRecoverReport28098Struct.f60066d = 1L;
            roamBackupRecoverReport28098Struct.f60067e = 1L;
            roamBackupRecoverReport28098Struct.k();
        }
        findViewById(com.tencent.mm.R.id.abq).setOnClickListener(new android.view.View.OnClickListener() { // from class: un1.e$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI.f92537f;
                com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI backupChooseBackupModeUI = com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI.this;
                backupChooseBackupModeUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z18 = z17;
                arrayList.add(java.lang.Boolean.valueOf(z18));
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", backupChooseBackupModeUI, array);
                if (z18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.f92940h);
                    com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct2 = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
                    roamBackupRecoverReport28098Struct2.f60066d = 1L;
                    roamBackupRecoverReport28098Struct2.f60067e = 3L;
                    roamBackupRecoverReport28098Struct2.k();
                }
                if (qn1.c.n(backupChooseBackupModeUI, com.tencent.mm.R.string.ack)) {
                    yj0.a.h(backupChooseBackupModeUI, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                } else {
                    ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Vi(backupChooseBackupModeUI);
                    yj0.a.h(backupChooseBackupModeUI, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
        });
        findViewById(com.tencent.mm.R.id.abr).setOnClickListener(new android.view.View.OnClickListener() { // from class: un1.e$$c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI.f92537f;
                com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI backupChooseBackupModeUI = com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI.this;
                backupChooseBackupModeUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z18 = z17;
                arrayList.add(java.lang.Boolean.valueOf(z18));
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", backupChooseBackupModeUI, array);
                if (z18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.f92939g);
                    com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct2 = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
                    roamBackupRecoverReport28098Struct2.f60066d = 1L;
                    roamBackupRecoverReport28098Struct2.f60067e = 2L;
                    roamBackupRecoverReport28098Struct2.k();
                }
                ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ui();
                ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).cj(backupChooseBackupModeUI, mv.a.f331469e);
                yj0.a.h(backupChooseBackupModeUI, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        java.lang.String b17 = u24.n.b();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.v3s);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("setting_sessionid", b17);
        hashMap.put("ui_version", 2);
        hashMap.put("view_id", "settings_clean_all_msg");
        hashMap.put("page_name_kv", "SettingGroup_Main_ChatRecordManage");
        hashMap.put("view_name_kv", "settings_clean_all_msg");
        hashMap.put("setting_level", 2);
        hashMap.put("cell_source_type", 2);
        hashMap.put("setting_from_source", java.lang.Integer.valueOf(getIntent().getIntExtra("setting_from_source", 2)));
        hashMap.put("switch_status_current", textView.getText());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(textView);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(textView, "settings_clean_all_msg");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(textView, hashMap);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(textView, 40, 33328);
        findViewById(com.tencent.mm.R.id.v3s).setOnClickListener(new android.view.View.OnClickListener() { // from class: un1.e$$d
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI.f92537f;
                com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI backupChooseBackupModeUI = com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI.this;
                backupChooseBackupModeUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", backupChooseBackupModeUI, array);
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupChooseBackupModeUI", "Clean all messages do confirm.");
                android.content.Intent className = new android.content.Intent().setClassName(backupChooseBackupModeUI, "com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI");
                className.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                androidx.appcompat.app.AppCompatActivity context = backupChooseBackupModeUI.getContext();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(className);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "lambda$onCreate$3", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "lambda$onCreate$3", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                yj0.a.h(backupChooseBackupModeUI, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (z17) {
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.rcq)).setText(com.tencent.mm.R.string.m76);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((bt.a) ((com.tencent.mm.app.o2) i95.n0.c(com.tencent.mm.app.o2.class))).wi();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.setting.ui.setting.g.f161052a.d(this.f92538e);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.setting.ui.setting.g.f161052a.c(this.f92538e);
    }
}
