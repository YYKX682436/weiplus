package cj5;

/* loaded from: classes.dex */
public final class l4 extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        wi5.n0 n0Var = new wi5.n0();
        n0Var.f527854q = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("message_fold_config2").o("fold_button_status_int_sync", 65536) != 65536;
        n0Var.f527855r = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536) == 131072;
        m158359x1e885992().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("titile");
        if (stringExtra == null) {
            stringExtra = "";
        }
        n0Var.f527846f = stringExtra;
        android.content.Intent m158359x1e885992 = m158359x1e885992();
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        n0Var.f527847g = m158359x1e885992.getIntExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288313a);
        n0Var.f527848h = m158359x1e885992().getIntExtra("list_type", -1);
        n0Var.f527850m = m158359x1e885992().getIntExtra("min_limit_num", 0);
        n0Var.f527849i = m158359x1e885992().getIntExtra("max_limit_num", -1);
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("label_source");
        n0Var.f527845e = stringExtra2 != null ? stringExtra2 : "";
        java.lang.String stringExtra3 = m158359x1e885992().getStringExtra("already_select_contact");
        if (stringExtra3 != null) {
            java.lang.String str = r26.n0.N(stringExtra3) ^ true ? stringExtra3 : null;
            if (str != null) {
                for (java.lang.String str2 : r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null)) {
                    n0Var.f527852o.add(str2);
                    n0Var.f527863z.put(str2, java.lang.Long.valueOf(c01.id.c()));
                }
            }
        }
        java.lang.String stringExtra4 = m158359x1e885992().getStringExtra("block_contact");
        java.util.HashSet hashSet = n0Var.f527853p;
        if (stringExtra4 != null) {
            hashSet.addAll(r26.n0.f0(stringExtra4, new java.lang.String[]{","}, false, 0, 6, null));
        }
        java.lang.String stringExtra5 = m158359x1e885992().getStringExtra("always_select_contact");
        if (stringExtra5 != null) {
            n0Var.f527851n.addAll(r26.n0.f0(stringExtra5, new java.lang.String[]{","}, false, 0, 6, null));
        }
        java.lang.String stringExtra6 = m158359x1e885992().getStringExtra("always_exclude_select_contact");
        if (stringExtra6 != null) {
            java.lang.String str3 = true ^ r26.n0.N(stringExtra6) ? stringExtra6 : null;
            if (str3 != null) {
                n0Var.Q.addAll(r26.n0.f0(str3, new java.lang.String[]{","}, false, 0, 6, null));
            }
        }
        n0Var.G = m158359x1e885992().getBooleanExtra("ForwardParams_ForwardByUIC", false);
        n0Var.H = m158359x1e885992().getIntExtra("Select_Conv_Type", 3);
        java.lang.String stringExtra7 = m158359x1e885992().getStringExtra("Select_block_List");
        if (stringExtra7 != null) {
            hashSet.addAll(r26.n0.f0(stringExtra7, new java.lang.String[]{","}, false, 0, 6, null));
        }
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        java.util.Collection Ui = n1Var != null ? ((vh0.f3) n1Var).Ui() : null;
        if (Ui == null) {
            Ui = kz5.p0.f395529d;
        }
        hashSet.addAll(Ui);
        n0Var.R = m158359x1e885992().getBooleanExtra("kFromCombineMultiTab", false);
        return n0Var;
    }
}
