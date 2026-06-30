package hn;

/* loaded from: classes4.dex */
public final class n implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vg3.i3 f363892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f363893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363894c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg3.h3 f363895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f363896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn.s f363897f;

    public n(vg3.i3 i3Var, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, android.content.Context context, vg3.h3 h3Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, hn.s sVar) {
        this.f363892a = i3Var;
        this.f363893b = activityC21401x6ce6f73f;
        this.f363894c = context;
        this.f363895d = h3Var;
        this.f363896e = h0Var;
        this.f363897f = sVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        r45.j8 j8Var;
        java.lang.String str2;
        r45.ie mo11484xe92ab0a8;
        r45.du5 du5Var;
        r45.j8 j8Var2;
        r45.j8 j8Var3;
        java.lang.String str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomOpenService", "GetCheckAppBindResp: errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
        pm0.v.X(new hn.k(this.f363896e));
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152244b.f152233a : null;
        r45.mz mzVar = fVar instanceof r45.mz ? (r45.mz) fVar : null;
        boolean z17 = true;
        if (i17 != 0 || i18 != 0 || mzVar == null) {
            java.lang.String str4 = (mzVar == null || (j8Var3 = mzVar.f462471f) == null) ? null : j8Var3.f459166d;
            if (str4 != null && str4.length() != 0) {
                z17 = false;
            }
            java.lang.String string = z17 ? this.f363894c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572357ay2) : (mzVar == null || (j8Var = mzVar.f462471f) == null) ? null : j8Var.f459166d;
            if (mzVar == null || (j8Var2 = mzVar.f462471f) == null || (str2 = j8Var2.f459167e) == null) {
                str2 = (mzVar == null || (mo11484xe92ab0a8 = mzVar.mo11484xe92ab0a8()) == null || (du5Var = mo11484xe92ab0a8.f458493e) == null) ? null : du5Var.f454289d;
                if (str2 == null) {
                    str2 = string;
                }
            }
            vg3.h3 h3Var = this.f363895d;
            if (h3Var != null) {
                h3Var.a(false, str2, null);
            }
            ((ku5.t0) ku5.t0.f394148d).B(new hn.m(this.f363893b, string, str2));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRoomOpenService", "GetCheckAppBindResp Success");
        vg3.i3 i3Var = this.f363892a;
        i3Var.f518250i = mzVar.f462469d;
        r45.oh ohVar = mzVar.f462470e;
        if (ohVar == null || (str3 = ohVar.f463786e) == null) {
            str3 = "";
        }
        i3Var.f518249h = str3;
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f363893b;
        vg3.i3 i3Var2 = this.f363892a;
        intent.setClassName(activityC21401x6ce6f73f, "com.tencent.mm.ui.contact.GroupCardSelectUI");
        intent.putExtra("group_select_type", true);
        intent.putExtra("group_select_only_need_self_owner", true);
        intent.putExtra("group_select_need_result", true);
        intent.putExtra("group_select_show_create_new_group", true);
        intent.putExtra("group_select_should_intercept", true);
        intent.putExtra("key_bind_param", i3Var2);
        this.f363893b.m78750xc5512edd(new hn.l(this.f363892a, this.f363897f, this.f363894c, this.f363895d));
        this.f363893b.startActivityForResult(intent, 15001);
    }
}
