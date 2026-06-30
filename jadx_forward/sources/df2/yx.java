package df2;

/* loaded from: classes3.dex */
public final class yx implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.u12 f313431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f313432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ df2.cy f313433c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.v12 f313434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f313436f;

    public yx(r45.u12 u12Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, df2.cy cyVar, r45.v12 v12Var, java.lang.String str, android.content.Context context) {
        this.f313431a = u12Var;
        this.f313432b = h0Var;
        this.f313433c = cyVar;
        this.f313434d = v12Var;
        this.f313435e = str;
        this.f313436f = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        df2.cy cyVar = this.f313433c;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f313432b;
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.E, "3", null, 4, null);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f313431a.f468470q;
            boolean z18 = true;
            if (c19786x6a1e2862 != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) h0Var.f391656d;
                if (j0Var != null) {
                    j0Var.dismiss();
                }
                df2.nm nmVar = (df2.nm) cyVar.m56789x25fe639c(df2.nm.class);
                if (nmVar != null) {
                    nmVar.Z6(c19786x6a1e2862);
                    return;
                }
                return;
            }
            r45.v12 v12Var = this.f313434d;
            java.lang.String str2 = v12Var != null ? v12Var.f469330d : null;
            if (v12Var != null) {
                java.lang.String str3 = this.f313435e;
                if (!(str3 == null || str3.length() == 0)) {
                    if (str2 != null && str2.length() != 0) {
                        z18 = false;
                    }
                    if (!z18) {
                        df2.cy cyVar2 = this.f313433c;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(cyVar2, null, null, new df2.xx(this.f313436f, cyVar2, str2, this.f313432b, this.f313434d, null), 3, null);
                    }
                }
            }
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.y6((zy2.zb) c18, ml2.z4.E, "2", null, 4, null);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) h0Var.f391656d;
            if (j0Var2 != null) {
                j0Var2.dismiss();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cyVar.f311448m, "showAlertDialog click bOk:" + z17);
    }
}
