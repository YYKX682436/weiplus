package cj5;

/* loaded from: classes.dex */
public final class l4 extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        wi5.n0 n0Var = new wi5.n0();
        n0Var.f446321q = com.tencent.mm.sdk.platformtools.o4.M("message_fold_config2").o("fold_button_status_int_sync", 65536) != 65536;
        n0Var.f446322r = com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536) == 131072;
        getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        java.lang.String stringExtra = getIntent().getStringExtra("titile");
        if (stringExtra == null) {
            stringExtra = "";
        }
        n0Var.f446313f = stringExtra;
        android.content.Intent intent = getIntent();
        com.tencent.mm.ui.contact.i5.e();
        n0Var.f446314g = intent.getIntExtra("list_attr", com.tencent.mm.ui.contact.i5.f206780a);
        n0Var.f446315h = getIntent().getIntExtra("list_type", -1);
        n0Var.f446317m = getIntent().getIntExtra("min_limit_num", 0);
        n0Var.f446316i = getIntent().getIntExtra("max_limit_num", -1);
        java.lang.String stringExtra2 = getIntent().getStringExtra("label_source");
        n0Var.f446312e = stringExtra2 != null ? stringExtra2 : "";
        java.lang.String stringExtra3 = getIntent().getStringExtra("already_select_contact");
        if (stringExtra3 != null) {
            java.lang.String str = r26.n0.N(stringExtra3) ^ true ? stringExtra3 : null;
            if (str != null) {
                for (java.lang.String str2 : r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null)) {
                    n0Var.f446319o.add(str2);
                    n0Var.f446330z.put(str2, java.lang.Long.valueOf(c01.id.c()));
                }
            }
        }
        java.lang.String stringExtra4 = getIntent().getStringExtra("block_contact");
        java.util.HashSet hashSet = n0Var.f446320p;
        if (stringExtra4 != null) {
            hashSet.addAll(r26.n0.f0(stringExtra4, new java.lang.String[]{","}, false, 0, 6, null));
        }
        java.lang.String stringExtra5 = getIntent().getStringExtra("always_select_contact");
        if (stringExtra5 != null) {
            n0Var.f446318n.addAll(r26.n0.f0(stringExtra5, new java.lang.String[]{","}, false, 0, 6, null));
        }
        java.lang.String stringExtra6 = getIntent().getStringExtra("always_exclude_select_contact");
        if (stringExtra6 != null) {
            java.lang.String str3 = true ^ r26.n0.N(stringExtra6) ? stringExtra6 : null;
            if (str3 != null) {
                n0Var.Q.addAll(r26.n0.f0(str3, new java.lang.String[]{","}, false, 0, 6, null));
            }
        }
        n0Var.G = getIntent().getBooleanExtra("ForwardParams_ForwardByUIC", false);
        n0Var.H = getIntent().getIntExtra("Select_Conv_Type", 3);
        java.lang.String stringExtra7 = getIntent().getStringExtra("Select_block_List");
        if (stringExtra7 != null) {
            hashSet.addAll(r26.n0.f0(stringExtra7, new java.lang.String[]{","}, false, 0, 6, null));
        }
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        java.util.Collection Ui = n1Var != null ? ((vh0.f3) n1Var).Ui() : null;
        if (Ui == null) {
            Ui = kz5.p0.f313996d;
        }
        hashSet.addAll(Ui);
        n0Var.R = getIntent().getBooleanExtra("kFromCombineMultiTab", false);
        return n0Var;
    }
}
