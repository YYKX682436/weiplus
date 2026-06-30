package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BackupRangeManagerUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.Calendar f92784t;

    /* renamed from: d, reason: collision with root package name */
    public long f92785d = -1;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo f92786e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo f92787f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f92788g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f92789h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f92790i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f92791m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f92792n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f92793o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f92794p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f92795q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f92796r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f92797s;

    static {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION, 0, 21);
        f92784t = calendar;
    }

    public static final void T6(com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI) {
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = backupRangeManagerUI.f92787f;
        if (backupRangeInfo == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        if (backupRangeInfo.f92730d != po1.b.f357290e) {
            backupRangeInfo.f92731e.clear();
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo2 = backupRangeManagerUI.f92787f;
            if (backupRangeInfo2 == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            backupRangeInfo2.f92732f.clear();
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = backupRangeManagerUI.f92794p;
        if (mMSwitchBtn == null) {
            kotlin.jvm.internal.o.o("timeMenuSwt");
            throw null;
        }
        if (!mMSwitchBtn.f211363x) {
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo3 = backupRangeManagerUI.f92787f;
            if (backupRangeInfo3 == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            backupRangeInfo3.f92733g = 0L;
            backupRangeInfo3.f92734h = 0L;
        }
        zo1.n nVar = new zo1.n(backupRangeManagerUI);
        long j17 = backupRangeManagerUI.f92785d;
        if (j17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupRangeManagerUI", "skip update range list, pkgId=-1");
            nVar.invoke(java.lang.Boolean.FALSE);
            return;
        }
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        com.tencent.wechat.aff.affroam.g k17 = r0Var.k(j17);
        if (k17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BackupRangeManagerUI", "Fail to get pkgInfo");
            nVar.invoke(java.lang.Boolean.FALSE);
            return;
        }
        java.lang.String string = backupRangeManagerUI.getString(com.tencent.mm.R.string.mvy);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(backupRangeManagerUI, string, false, 3, null);
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo4 = backupRangeManagerUI.f92787f;
        if (backupRangeInfo4 == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        com.tencent.wechat.aff.affroam.i b17 = backupRangeInfo4.b();
        int i17 = k17.f215835m;
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo5 = backupRangeManagerUI.f92787f;
        if (backupRangeInfo5 == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        if (backupRangeInfo5.f92734h > 0) {
            i17 &= -2;
        }
        com.tencent.wechat.aff.affroam.g gVar = new com.tencent.wechat.aff.affroam.g();
        gVar.parseFrom(k17.getData());
        gVar.f215834i = b17;
        gVar.f215835m = i17;
        r0Var.s(gVar, new zo1.r(f17, nVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void U6(com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI.U6(com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI, boolean):void");
    }

    public final void V6() {
        boolean z17;
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = this.f92786e;
        if (backupRangeInfo == null) {
            kotlin.jvm.internal.o.o("originalRange");
            throw null;
        }
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo2 = this.f92787f;
        if (backupRangeInfo2 == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        boolean z18 = !kotlin.jvm.internal.o.b(backupRangeInfo, backupRangeInfo2);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f92794p;
        if (mMSwitchBtn == null) {
            kotlin.jvm.internal.o.o("timeMenuSwt");
            throw null;
        }
        if (mMSwitchBtn.f211363x) {
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo3 = this.f92787f;
            if (backupRangeInfo3 == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            if (backupRangeInfo3.f92733g <= 0) {
                z17 = false;
                enableOptionMenu(!z18 && z17);
            }
        }
        z17 = true;
        enableOptionMenu(!z18 && z17);
    }

    public final void W6() {
        finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477729q, com.tencent.mm.R.anim.f477855dd);
    }

    public final void X6() {
        java.lang.String str;
        java.lang.String string;
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = this.f92787f;
        if (backupRangeInfo == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        int ordinal = backupRangeInfo.f92730d.ordinal();
        if (ordinal == 0) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f92788g;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("allConvCheckedWiv");
                throw null;
            }
            weImageView.setVisibility(0);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f92789h;
            if (weImageView2 == null) {
                kotlin.jvm.internal.o.o("specificConvCheckedWiv");
                throw null;
            }
            weImageView2.setVisibility(4);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f92790i;
            if (weImageView3 == null) {
                kotlin.jvm.internal.o.o("allButFoldConvCheckedWiv");
                throw null;
            }
            weImageView3.setVisibility(4);
            android.widget.LinearLayout linearLayout = this.f92792n;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("specificConvSubMenu");
                throw null;
            }
            if (linearLayout.getVisibility() == 0) {
                android.widget.LinearLayout linearLayout2 = this.f92792n;
                if (linearLayout2 == null) {
                    kotlin.jvm.internal.o.o("specificConvSubMenu");
                    throw null;
                }
                linearLayout2.setVisibility(8);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f92791m;
                if (weImageView4 == null) {
                    kotlin.jvm.internal.o.o("specificIndicatorIv");
                    throw null;
                }
                weImageView4.setImageResource(com.tencent.mm.R.raw.arrow_down);
            }
        } else if (ordinal == 1) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = this.f92788g;
            if (weImageView5 == null) {
                kotlin.jvm.internal.o.o("allConvCheckedWiv");
                throw null;
            }
            weImageView5.setVisibility(4);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = this.f92789h;
            if (weImageView6 == null) {
                kotlin.jvm.internal.o.o("specificConvCheckedWiv");
                throw null;
            }
            weImageView6.setVisibility(0);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView7 = this.f92790i;
            if (weImageView7 == null) {
                kotlin.jvm.internal.o.o("allButFoldConvCheckedWiv");
                throw null;
            }
            weImageView7.setVisibility(4);
            android.widget.LinearLayout linearLayout3 = this.f92792n;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.o.o("specificConvSubMenu");
                throw null;
            }
            if (linearLayout3.getVisibility() == 0) {
                oo1.g gVar = oo1.g.f347143a;
                com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo2 = this.f92787f;
                if (backupRangeInfo2 == null) {
                    kotlin.jvm.internal.o.o("rangeInfo");
                    throw null;
                }
                java.util.List K0 = kz5.n0.K0(backupRangeInfo2.f92731e, 50);
                boolean isEmpty = K0.isEmpty();
                java.util.Collection collection = kz5.p0.f313996d;
                if (!isEmpty) {
                    java.util.Collection i17 = ((b93.b) c93.a.a()).i(kz5.n0.g0(K0, ",", null, null, 0, null, null, 62, null));
                    if (i17 != null) {
                        collection = i17;
                    }
                }
                java.lang.String g07 = kz5.n0.g0(collection, ",", null, null, 0, null, null, 62, null);
                com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo3 = this.f92787f;
                if (backupRangeInfo3 == null) {
                    kotlin.jvm.internal.o.o("rangeInfo");
                    throw null;
                }
                java.lang.String g08 = kz5.n0.g0(gVar.b(this, kz5.n0.K0(backupRangeInfo3.f92732f, 50)), ",", null, null, 0, null, null, 62, null);
                android.widget.LinearLayout linearLayout4 = this.f92792n;
                if (linearLayout4 == null) {
                    kotlin.jvm.internal.o.o("specificConvSubMenu");
                    throw null;
                }
                android.widget.TextView textView = (android.widget.TextView) linearLayout4.findViewById(com.tencent.mm.R.id.s2x);
                if (g07.length() > 0) {
                    textView.setText(g07);
                } else {
                    textView.setText(com.tencent.mm.R.string.mz9);
                }
                android.widget.LinearLayout linearLayout5 = this.f92792n;
                if (linearLayout5 == null) {
                    kotlin.jvm.internal.o.o("specificConvSubMenu");
                    throw null;
                }
                android.widget.TextView textView2 = (android.widget.TextView) linearLayout5.findViewById(com.tencent.mm.R.id.s2t);
                if (g08.length() > 0) {
                    textView2.setText(g08);
                } else {
                    textView2.setText(com.tencent.mm.R.string.f492872mz5);
                }
            }
        } else if (ordinal == 2) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView8 = this.f92788g;
            if (weImageView8 == null) {
                kotlin.jvm.internal.o.o("allConvCheckedWiv");
                throw null;
            }
            weImageView8.setVisibility(4);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView9 = this.f92789h;
            if (weImageView9 == null) {
                kotlin.jvm.internal.o.o("specificConvCheckedWiv");
                throw null;
            }
            weImageView9.setVisibility(4);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView10 = this.f92790i;
            if (weImageView10 == null) {
                kotlin.jvm.internal.o.o("allButFoldConvCheckedWiv");
                throw null;
            }
            weImageView10.setVisibility(0);
            android.widget.LinearLayout linearLayout6 = this.f92792n;
            if (linearLayout6 == null) {
                kotlin.jvm.internal.o.o("specificConvSubMenu");
                throw null;
            }
            if (linearLayout6.getVisibility() == 0) {
                android.widget.LinearLayout linearLayout7 = this.f92792n;
                if (linearLayout7 == null) {
                    kotlin.jvm.internal.o.o("specificConvSubMenu");
                    throw null;
                }
                linearLayout7.setVisibility(8);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView11 = this.f92791m;
                if (weImageView11 == null) {
                    kotlin.jvm.internal.o.o("specificIndicatorIv");
                    throw null;
                }
                weImageView11.setImageResource(com.tencent.mm.R.raw.arrow_down);
            }
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f92794p;
        if (mMSwitchBtn == null) {
            kotlin.jvm.internal.o.o("timeMenuSwt");
            throw null;
        }
        if (mMSwitchBtn.f211363x) {
            android.widget.LinearLayout linearLayout8 = this.f92793o;
            if (linearLayout8 == null) {
                kotlin.jvm.internal.o.o("timeSubMenu");
                throw null;
            }
            linearLayout8.setVisibility(0);
            android.widget.TextView textView3 = this.f92795q;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("startTimeTv");
                throw null;
            }
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo4 = this.f92787f;
            if (backupRangeInfo4 == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            if (backupRangeInfo4.f92733g > 0) {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo5 = this.f92787f;
                if (backupRangeInfo5 == null) {
                    kotlin.jvm.internal.o.o("rangeInfo");
                    throw null;
                }
                calendar.setTimeInMillis(backupRangeInfo5.f92733g);
                str = getString(com.tencent.mm.R.string.a7h, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5)));
            } else {
                str = "";
            }
            textView3.setText(str);
            android.widget.TextView textView4 = this.f92796r;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("endTimeTv");
                throw null;
            }
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo6 = this.f92787f;
            if (backupRangeInfo6 == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            if (backupRangeInfo6.f92734h > 0) {
                java.util.Calendar calendar2 = java.util.Calendar.getInstance();
                com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo7 = this.f92787f;
                if (backupRangeInfo7 == null) {
                    kotlin.jvm.internal.o.o("rangeInfo");
                    throw null;
                }
                calendar2.setTimeInMillis(backupRangeInfo7.f92734h);
                string = getString(com.tencent.mm.R.string.a7h, java.lang.Integer.valueOf(calendar2.get(1)), java.lang.Integer.valueOf(calendar2.get(2) + 1), java.lang.Integer.valueOf(calendar2.get(5)));
            } else {
                string = getString(com.tencent.mm.R.string.mz_);
            }
            textView4.setText(string);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dwa;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == 0 || intent == null) {
            return;
        }
        if (i17 == 126) {
            java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("Select_Contact");
            if (stringArrayExtra == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BackupRangeManagerUI", "Fail to get selected contact list");
                return;
            }
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = this.f92787f;
            if (backupRangeInfo == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            backupRangeInfo.f92732f.clear();
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo2 = this.f92787f;
            if (backupRangeInfo2 != null) {
                kz5.h0.w(backupRangeInfo2.f92732f, stringArrayExtra);
                return;
            } else {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
        }
        if (i17 != 127) {
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
        if (stringArrayListExtra == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BackupRangeManagerUI", "fail to get selected label list");
            return;
        }
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo3 = this.f92787f;
        if (backupRangeInfo3 == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        backupRangeInfo3.f92731e.clear();
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo4 = this.f92787f;
        if (backupRangeInfo4 == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(stringArrayListExtra, 10));
        for (java.lang.String str : stringArrayListExtra) {
            kotlin.jvm.internal.o.d(str);
            arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
        }
        backupRangeInfo4.f92731e.addAll(arrayList);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = this.f92786e;
        if (backupRangeInfo == null) {
            kotlin.jvm.internal.o.o("originalRange");
            throw null;
        }
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo2 = this.f92787f;
        if (backupRangeInfo2 == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        if (kotlin.jvm.internal.o.b(backupRangeInfo, backupRangeInfo2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupRangeManagerUI", "Content not changed, skip showing dialog.");
            W6();
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(getString(com.tencent.mm.R.string.myu));
        u1Var.j(getString(com.tencent.mm.R.string.bgk));
        u1Var.n(getString(com.tencent.mm.R.string.bgl));
        u1Var.a(true);
        u1Var.b(new zo1.b(this));
        u1Var.q(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean booleanExtra;
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo;
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.mxy);
        setBackBtnVisible(false);
        getController().x0(getString(com.tencent.mm.R.string.mvh), new java.lang.Runnable() { // from class: zo1.e
            @Override // java.lang.Runnable
            public final void run() {
                java.util.Calendar calendar = com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI.f92784t;
                com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI.this.W6();
            }
        });
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.s2s);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f92788g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f486700s33);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f92789h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.s2q);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f92790i = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f486697s30);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f92791m = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f486699s32);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f92792n = (android.widget.LinearLayout) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f486703s36);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f92794p = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.s37);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById7;
        this.f92793o = linearLayout;
        android.view.View findViewById8 = linearLayout.findViewById(com.tencent.mm.R.id.f486702s35);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f92795q = (android.widget.TextView) findViewById8;
        android.widget.LinearLayout linearLayout2 = this.f92793o;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("timeSubMenu");
            throw null;
        }
        android.view.View findViewById9 = linearLayout2.findViewById(com.tencent.mm.R.id.s2w);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f92796r = (android.widget.TextView) findViewById9;
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.s2r)).setOnClickListener(new zo1.f(this));
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f486698s31)).setOnClickListener(new zo1.g(this));
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.s2p)).setOnClickListener(new zo1.h(this));
        android.widget.LinearLayout linearLayout3 = this.f92792n;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.o.o("specificConvSubMenu");
            throw null;
        }
        ((android.widget.LinearLayout) linearLayout3.findViewById(com.tencent.mm.R.id.s2z)).setOnClickListener(new zo1.i(this));
        android.widget.LinearLayout linearLayout4 = this.f92792n;
        if (linearLayout4 == null) {
            kotlin.jvm.internal.o.o("specificConvSubMenu");
            throw null;
        }
        ((android.widget.LinearLayout) linearLayout4.findViewById(com.tencent.mm.R.id.s2y)).setOnClickListener(new zo1.j(this));
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f92794p;
        if (mMSwitchBtn == null) {
            kotlin.jvm.internal.o.o("timeMenuSwt");
            throw null;
        }
        mMSwitchBtn.setSwitchListener(new zo1.l(this));
        setResult(0);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.mwh), new zo1.m(this), null, com.tencent.mm.ui.fb.GREEN);
        long longExtra = getIntent().getLongExtra("packageId", -1L);
        this.f92785d = longExtra;
        if (longExtra != -1) {
            com.tencent.wechat.aff.affroam.g k17 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.k(longExtra);
            if (k17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupRangeManagerUI", "[onCreate] Fail to get package info by pkgId=" + this.f92785d);
                W6();
                return;
            }
            booleanExtra = (k17.f215835m & 1) != 0;
            com.tencent.mm.plugin.backup.roambackup.a2.a(com.tencent.mm.plugin.backup.roambackup.a2.f92567a, com.tencent.mm.plugin.backup.roambackup.y1.f92949q, k17, null, null, null, null, 60, null);
            po1.a aVar = com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo.CREATOR;
            com.tencent.wechat.aff.affroam.i iVar = k17.f215834i;
            kotlin.jvm.internal.o.f(iVar, "getBackupRange(...)");
            backupRangeInfo = aVar.a(iVar);
        } else {
            booleanExtra = getIntent().getBooleanExtra("autoBackupEnable", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.f92949q);
            com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
            roamBackupRecoverReport28098Struct.f60066d = 3L;
            roamBackupRecoverReport28098Struct.f60067e = 1L;
            roamBackupRecoverReport28098Struct.k();
            java.lang.Object parcelableExtra = getIntent().getParcelableExtra("convParcelRange");
            if (parcelableExtra == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupRangeManagerUI", "[onCreate] create new range");
                parcelableExtra = new com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo(null, null, null, 0L, 0L, 31, null);
            }
            backupRangeInfo = (com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo) parcelableExtra;
        }
        this.f92786e = backupRangeInfo;
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo2 = new com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo(backupRangeInfo.f92730d, new java.util.ArrayList(backupRangeInfo.f92731e), new java.util.ArrayList(backupRangeInfo.f92732f), backupRangeInfo.f92733g, backupRangeInfo.f92734h);
        this.f92787f = backupRangeInfo2;
        if (backupRangeInfo2.f92733g > 0 || backupRangeInfo2.f92734h > 0) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = this.f92794p;
            if (mMSwitchBtn2 == null) {
                kotlin.jvm.internal.o.o("timeMenuSwt");
                throw null;
            }
            mMSwitchBtn2.setCheck(true);
            android.widget.LinearLayout linearLayout5 = this.f92793o;
            if (linearLayout5 == null) {
                kotlin.jvm.internal.o.o("timeSubMenu");
                throw null;
            }
            linearLayout5.setVisibility(0);
        }
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo3 = this.f92786e;
        if (backupRangeInfo3 == null) {
            kotlin.jvm.internal.o.o("originalRange");
            throw null;
        }
        this.f92797s = backupRangeInfo3.f92733g > 0;
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo4 = this.f92787f;
        if (backupRangeInfo4 == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        if (backupRangeInfo4.f92730d == po1.b.f357290e) {
            android.widget.LinearLayout linearLayout6 = this.f92792n;
            if (linearLayout6 == null) {
                kotlin.jvm.internal.o.o("specificConvSubMenu");
                throw null;
            }
            linearLayout6.setVisibility(0);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f92791m;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("specificIndicatorIv");
                throw null;
            }
            weImageView.setImageResource(com.tencent.mm.R.raw.arrow_up);
        } else {
            android.widget.LinearLayout linearLayout7 = this.f92792n;
            if (linearLayout7 == null) {
                kotlin.jvm.internal.o.o("specificConvSubMenu");
                throw null;
            }
            linearLayout7.setVisibility(8);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f92791m;
            if (weImageView2 == null) {
                kotlin.jvm.internal.o.o("specificIndicatorIv");
                throw null;
            }
            weImageView2.setImageResource(com.tencent.mm.R.raw.arrow_down);
        }
        android.widget.LinearLayout linearLayout8 = this.f92793o;
        if (linearLayout8 == null) {
            kotlin.jvm.internal.o.o("timeSubMenu");
            throw null;
        }
        ((android.widget.LinearLayout) linearLayout8.findViewById(com.tencent.mm.R.id.f486701s34)).setOnClickListener(new zo1.c(this));
        android.widget.LinearLayout linearLayout9 = this.f92793o;
        if (linearLayout9 == null) {
            kotlin.jvm.internal.o.o("timeSubMenu");
            throw null;
        }
        android.widget.LinearLayout linearLayout10 = (android.widget.LinearLayout) linearLayout9.findViewById(com.tencent.mm.R.id.s2v);
        if (!booleanExtra) {
            linearLayout10.setOnClickListener(new zo1.d(this));
            return;
        }
        linearLayout10.setAlpha(0.5f);
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo5 = this.f92787f;
        if (backupRangeInfo5 == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        backupRangeInfo5.f92734h = 0L;
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.s2u)).setVisibility(0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
        V6();
    }
}
