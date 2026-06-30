package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6;

/* renamed from: com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI */
/* loaded from: classes5.dex */
public class ActivityC12835xc2087912 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f174070f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b f174071e = new un1.f(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569704jb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ach);
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ui();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.n4e);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ugn)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.o9t);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ugm)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.o9s);
        mo54448x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: un1.e$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912.f174070f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912.this.finish();
                return true;
            }
        });
        ((bt.a) ((com.p314xaae8f345.mm.app.o2) i95.n0.c(com.p314xaae8f345.mm.app.o2.class))).Ai();
        int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2565xa17a322b.C20648x10ecb94a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackupExpt", "Exp value of clicfg_unify_enable_new_roam_backup is " + c17);
        final boolean z17 = c17 == 1;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174471f);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
            c6839x89375b51.f141599d = 1L;
            c6839x89375b51.f141600e = 1L;
            c6839x89375b51.k();
        }
        findViewById(com.p314xaae8f345.mm.R.id.abq).setOnClickListener(new android.view.View.OnClickListener() { // from class: un1.e$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912.f174070f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912 activityC12835xc2087912 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912.this;
                activityC12835xc2087912.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z18 = z17;
                arrayList.add(java.lang.Boolean.valueOf(z18));
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC12835xc2087912, array);
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174473h);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b512 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
                    c6839x89375b512.f141599d = 1L;
                    c6839x89375b512.f141600e = 3L;
                    c6839x89375b512.k();
                }
                if (qn1.c.n(activityC12835xc2087912, com.p314xaae8f345.mm.R.C30867xcad56011.ack)) {
                    yj0.a.h(activityC12835xc2087912, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) ((mv.y) i95.n0.c(mv.y.class))).Vi(activityC12835xc2087912);
                    yj0.a.h(activityC12835xc2087912, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
        });
        findViewById(com.p314xaae8f345.mm.R.id.abr).setOnClickListener(new android.view.View.OnClickListener() { // from class: un1.e$$c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912.f174070f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912 activityC12835xc2087912 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912.this;
                activityC12835xc2087912.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z18 = z17;
                arrayList.add(java.lang.Boolean.valueOf(z18));
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC12835xc2087912, array);
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174472g);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b512 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
                    c6839x89375b512.f141599d = 1L;
                    c6839x89375b512.f141600e = 2L;
                    c6839x89375b512.k();
                }
                ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ui();
                ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).cj(activityC12835xc2087912, mv.a.f413002e);
                yj0.a.h(activityC12835xc2087912, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        java.lang.String b17 = u24.n.b();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.v3s);
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
        findViewById(com.p314xaae8f345.mm.R.id.v3s).setOnClickListener(new android.view.View.OnClickListener() { // from class: un1.e$$d
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912.f174070f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912 activityC12835xc2087912 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12835xc2087912.this;
                activityC12835xc2087912.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC12835xc2087912, array);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupChooseBackupModeUI", "Clean all messages do confirm.");
                android.content.Intent className = new android.content.Intent().setClassName(activityC12835xc2087912, "com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI");
                className.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC12835xc2087912.mo55332x76847179();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(className);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(mo55332x76847179, arrayList2.toArray(), "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "lambda$onCreate$3", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mo55332x76847179.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "lambda$onCreate$3", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                yj0.a.h(activityC12835xc2087912, "com/tencent/mm/plugin/backup/backupui/BackupChooseBackupModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (z17) {
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.rcq)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.m76);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((bt.a) ((com.p314xaae8f345.mm.app.o2) i95.n0.c(com.p314xaae8f345.mm.app.o2.class))).wi();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g.f242585a.d(this.f174071e);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g.f242585a.c(this.f174071e);
    }
}
