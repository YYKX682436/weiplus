package nt4;

/* loaded from: classes9.dex */
public final class i implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f421360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f421361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421362c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f421363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421364e;

    public i(android.app.Activity activity, android.app.Dialog dialog, java.lang.String str, java.util.Map map, java.lang.String str2) {
        this.f421360a = activity;
        this.f421361b = dialog;
        this.f421362c = str;
        this.f421363d = map;
        this.f421364e = str2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.w0 w0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveJumpHandler", "on qryusrfunddetail finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        android.app.Activity activity = this.f421360a;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return null;
        }
        android.app.Dialog dialog = this.f421361b;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.zg5 zg5Var = (r45.zg5) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveJumpHandler", "on qryusrfunddetail finsih, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(zg5Var.f473542d), zg5Var.f473543e);
            if (zg5Var.f473542d == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c(zg5Var.f473569z1);
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                java.util.LinkedList<r45.if0> linkedList = zg5Var.f473555q;
                if (linkedList != null) {
                    if (!(linkedList.size() > 0)) {
                        linkedList = null;
                    }
                    if (linkedList != null) {
                        for (r45.if0 if0Var : linkedList) {
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(if0Var.f458514d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(if0Var.f458516f)) {
                                java.lang.String format = java.lang.String.format("%s||%s", java.util.Arrays.copyOf(new java.lang.Object[]{if0Var.f458514d, if0Var.f458516f}, 2));
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                                arrayList.add(format);
                            }
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0 z0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0) new em5.i().a(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z0.class);
                java.lang.String str = this.f421362c;
                java.util.Map map = this.f421363d;
                long E1 = (str == null || !r26.n0.D(str, "amount", false, 2, null)) ? 0L : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(map != null ? (java.lang.String) map.get("amount") : null);
                if (z0Var != null && (w0Var = z0Var.f259292f) != null) {
                    ((km5.q) km5.u.g(java.lang.Integer.valueOf(zg5Var.C), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(map != null ? (java.lang.String) map.get("entry_scene") : null, 0)), java.lang.Long.valueOf(E1))).n(w0Var);
                }
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.class);
                intent.putExtra("lqt_save_fund_code", zg5Var.f473556r);
                intent.putExtra("lqt_save_fetch_mode", 1);
                intent.putExtra("lqt_is_show_protocol", zg5Var.f473551o == 1);
                intent.putExtra("lqt_is_agree_protocol", zg5Var.f473552p == 1);
                intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
                intent.putExtra("lqt_profile_wording", zg5Var.f473568z);
                intent.putExtra("lqt_account_type", zg5Var.C);
                intent.putExtra("lqt_fund_spid", zg5Var.D);
                intent.putExtra("operate_id", this.f421364e);
                if (str != null && r26.n0.B(str, "entry_scene", false)) {
                    intent.putExtra("entrance_type", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(map != null ? (java.lang.String) map.get("entry_scene") : null, 0));
                }
                if (str != null && r26.n0.B(str, "amount", false)) {
                    double d17 = E1 / 100.0d;
                    intent.putExtra("fill_money", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(d17));
                    intent.putExtra("limit_cashier_amount", d17);
                    intent.putExtra("outer_trans_money", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(d17));
                }
                if (!((h45.q) i95.n0.c(h45.q.class)).mo24819x8648fb0d(activity, intent, nt4.h.f421359a)) {
                    android.app.Activity activity2 = this.f421360a;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_index/model/LqtSaveJumpHandler$jumpToLqtSaveOriginal$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(activity2, "com/tencent/mm/plugin/wallet_index/model/LqtSaveJumpHandler$jumpToLqtSaveOriginal$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }
        activity.finish();
        return null;
    }
}
