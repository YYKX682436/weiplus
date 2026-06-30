package eo5;

/* loaded from: classes.dex */
public final class a extends h.b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f337126a;

    @Override // h.b
    public android.content.Intent a(android.content.Context context, java.lang.Object obj) {
        java.util.List input = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        java.lang.String str = this.f337126a;
        if (!(str == null || str.length() == 0)) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16580xee897bd1.class);
            intent.putExtra("titile", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h0z));
            intent.putExtra("chatroomName", this.f337126a);
            intent.putExtra("always_select_contact", kz5.n0.g0(input, ",", null, null, 0, null, null, 62, null));
            intent.putExtra("key_need_gallery", false);
            return intent;
        }
        ((qd0.q0) ((rd0.e1) i95.n0.c(rd0.e1.class))).getClass();
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        intent2.putExtra("titile", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ond));
        intent2.putExtra("list_type", 0);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent2.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288316d, 256, 512));
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(input, ",");
        if (c17 != null) {
            intent2.putExtra("always_select_contact", c17);
        }
        intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 7);
        intent2.putExtra("menu_mode", 1);
        intent2.putExtra("recommend_chatroom", true);
        intent2.putExtra("too_many_member_tip_string", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lfn));
        intent2.putExtra("too_many_member_tip_ok_string", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e));
        intent2.putExtra("max_limit_num", 14 - input.size());
        intent2.putExtra("block_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J1(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.c(), ","));
        pf5.j0.a(intent2, cj5.d1.class);
        pf5.j0.a(intent2, aj5.a0.class);
        pf5.j0.a(intent2, aj5.g1.class);
        pf5.j0.a(intent2, aj5.i.class);
        pf5.j0.a(intent2, cj5.u3.class);
        pf5.j0.a(intent2, cj5.k4.class);
        pf5.j0.a(intent2, cj5.s.class);
        pf5.j0.a(intent2, cj5.h3.class);
        pf5.j0.a(intent2, cj5.n3.class);
        pf5.j0.a(intent2, cj5.w2.class);
        pf5.j0.a(intent2, cj5.l2.class);
        pf5.j0.a(intent2, eo5.e.class);
        return intent2;
    }

    @Override // h.b
    public java.lang.Object c(int i17, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        java.lang.String str;
        java.lang.String str2 = this.f337126a;
        if (str2 == null || str2.length() == 0) {
            stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("Select_Contact") : null;
        } else {
            if (intent == null || (str = intent.getStringExtra("Select_Contact")) == null) {
                str = "";
            }
            java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
            stringArrayListExtra = new java.util.ArrayList<>();
            for (java.lang.String str3 : strArr) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    stringArrayListExtra.add(str3);
                }
            }
        }
        return (i17 != -1 || stringArrayListExtra == null) ? kz5.p0.f395529d : stringArrayListExtra;
    }
}
