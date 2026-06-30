package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI */
/* loaded from: classes11.dex */
public class ActivityC17417xe2e7cffd extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f241902g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.b f241903h;

    public ActivityC17417xe2e7cffd() {
        new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef
    public int V6() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576470c5;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iq6);
        this.f241902g = m79336x8b97809d();
        if (gm0.j1.u().c().q(89, 0) != 2) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241902g).w("settings_recovery");
        }
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ui();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241902g).h("settings_bak_chat");
        if (h17 != null) {
            h17.J(com.p314xaae8f345.mm.R.C30867xcad56011.f574567oh4);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w9(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (gm0.j1.b().m()) {
            mo43517x10010bd5();
        } else {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g.f242585a;
        if (this.f241903h == null) {
            this.f241903h = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e(this.f241902g, "settings_bak_chat");
        }
        gVar.d(this.f241903h);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        str.getClass();
        boolean z17 = true;
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1776646462:
                if (str.equals("settings_chatting_bg")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1565531065:
                if (str.equals("settings_bak_chat")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1550690765:
                if (str.equals("settings_reset")) {
                    c17 = 2;
                    break;
                }
                break;
            case -1439483675:
                if (str.equals("settings_voice_play_mode")) {
                    c17 = 3;
                    break;
                }
                break;
            case -409015247:
                if (str.equals("settings_recovery")) {
                    c17 = 4;
                    break;
                }
                break;
            case 624882802:
                if (str.equals("settings_enter_button_send")) {
                    c17 = 5;
                    break;
                }
                break;
            case 1789437336:
                if (str.equals("settings_emoji_manager")) {
                    c17 = 6;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17416xb325f68b.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goTosetChattingBackground", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goTosetChattingBackground", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                break;
            case 1:
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241902g).notifyDataSetChanged();
                android.content.Intent className = new android.content.Intent().setClassName(mo55332x76847179(), "com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(className);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goToBackup", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goToBackup", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                break;
            case 2:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsChattingUI", "Clean all messages do confirm.");
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
                android.content.Intent className2 = new android.content.Intent().setClassName(this, "com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(className2);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(mo55332x768471792, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goTosetReset", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mo55332x768471792.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(mo55332x768471792, "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goTosetReset", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                break;
            case 3:
                gm0.j1.u().c().w(26, java.lang.Boolean.valueOf(!((java.lang.Boolean) gm0.j1.u().c().l(26, java.lang.Boolean.FALSE)).booleanValue()));
                break;
            case 4:
                android.content.Intent className3 = new android.content.Intent().setClassName(mo55332x76847179(), "com.tencent.mm.plugin.dbbackup.DBRecoveryUI");
                className3.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = mo55332x76847179();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(className3);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(mo55332x768471793, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goToRecovery", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mo55332x768471793.startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(mo55332x768471793, "com/tencent/mm/plugin/setting/ui/setting/SettingsChattingUI", "goToRecovery", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                break;
            case 5:
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241902g).h("settings_enter_button_send");
                if (c21541x1c1b08fe != null) {
                    gm0.j1.u().c().w(66832, java.lang.Boolean.valueOf(!c21541x1c1b08fe.N()));
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, java.lang.Boolean.valueOf(c21541x1c1b08fe.N()));
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("independent_send_msg_setting_btn", "view_clk", hashMap, 30529);
                    break;
                }
                break;
            case 6:
                android.content.Intent intent2 = new android.content.Intent();
                if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoticon_new_personal_center_andr, false)) {
                    intent2.putExtra(java.lang.String.valueOf(10931), 2);
                    j45.l.j(mo55332x76847179(), "emoji", ".ui.EmojiMineUI", intent2, null);
                    break;
                } else {
                    intent2.putExtra(java.lang.String.valueOf(10931), 3);
                    j45.l.j(mo55332x76847179(), "emoji", ".ui.EmoticonNewPersonCenterManagerActivity", intent2, null);
                    break;
                }
            default:
                z17 = false;
                break;
        }
        W6(this.f241902g, c21560x1fce98fb.f279313q);
        return z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241902g).h("settings_voice_play_mode");
        if (c21541x1c1b08fe != null) {
            c21541x1c1b08fe.O(((java.lang.Boolean) gm0.j1.u().c().l(26, java.lang.Boolean.FALSE)).booleanValue());
            c21541x1c1b08fe.f279318v = false;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241902g).h("settings_enter_button_send");
        if (c21541x1c1b08fe2 != null) {
            boolean z17 = !((java.lang.Boolean) gm0.j1.u().c().l(66832, java.lang.Boolean.FALSE)).booleanValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsChattingUI", "onResume enterButtonSend:%s", java.lang.Boolean.valueOf(z17));
            c21541x1c1b08fe2.O(z17);
            c21541x1c1b08fe2.f279318v = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g.f242585a;
        if (this.f241903h == null) {
            this.f241903h = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e(this.f241902g, "settings_bak_chat");
        }
        gVar.c(this.f241903h);
        W6(this.f241902g, "settings_voice_play_mode");
        W6(this.f241902g, "settings_enter_button_send");
        W6(this.f241902g, "settings_bak_chat");
        W6(this.f241902g, "settings_chatting_bg");
        W6(this.f241902g, "settings_emoji_manager");
        W6(this.f241902g, "settings_reset");
        W6(this.f241902g, "settings_recovery");
    }
}
