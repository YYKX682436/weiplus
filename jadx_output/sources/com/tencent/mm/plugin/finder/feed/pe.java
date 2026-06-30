package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class pe extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f108714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f108715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(boolean z17, com.tencent.mm.plugin.finder.feed.af afVar) {
        super(1);
        this.f108714d = z17;
        this.f108715e = afVar;
    }

    public static final void a(com.tencent.mm.plugin.finder.feed.af afVar, java.lang.String str, boolean z17) {
        java.lang.String str2;
        java.lang.String string;
        java.util.HashMap hashMap = new java.util.HashMap();
        r45.m70 m70Var = afVar.T;
        java.lang.String str3 = "";
        if (m70Var == null || (str2 = m70Var.getString(0)) == null) {
            str2 = "";
        }
        hashMap.put("activityId", str2);
        hashMap.put("is_fast_share", "1");
        hashMap.put("share_type", "1");
        hashMap.put("share_wx_username", str);
        r45.m70 m70Var2 = afVar.T;
        if (m70Var2 != null && (string = m70Var2.getString(21)) != null) {
            str3 = string;
        }
        hashMap.put("resource_id", str3);
        hashMap.put("enter_sence", afVar.P);
        hashMap.put("share_content_type", z17 ? "2" : "1");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.Y1, hashMap, afVar.Z, afVar.f106266p0, null, null, false, 112, null);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.el4 el4Var;
        r45.el4 el4Var2;
        r45.el4 el4Var3;
        r45.el4 el4Var4;
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            boolean z17 = this.f108714d;
            java.lang.String str2 = null;
            r3 = null;
            android.graphics.Bitmap bitmap = null;
            str2 = null;
            com.tencent.mm.plugin.finder.feed.af afVar = this.f108715e;
            if (z17) {
                afVar.e7();
                java.lang.String str3 = afVar.V;
                if (str3 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    bitmap = com.tencent.mm.sdk.platformtools.x.w0(com.tencent.mm.sdk.platformtools.x.j0(str3, 140, 140, i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a)), com.tencent.mm.compatible.util.Exif.fromFile(str3).getOrientationInDegree() >= 0 ? r4 : 0);
                }
                ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).Ni(afVar.getActivity(), str, bitmap, afVar.getActivity().getString(com.tencent.mm.R.string.f490551ya), 3, new com.tencent.mm.plugin.finder.feed.le(str, afVar, z17)).show();
            } else {
                java.lang.String X6 = afVar.X6("1");
                com.tencent.mars.xlog.Log.i(afVar.f106255d, "#prepareQuickShareMenu finally share url = ".concat(X6));
                ot0.q qVar = new ot0.q();
                r45.m70 m70Var = afVar.T;
                qVar.f348654f = (m70Var == null || (el4Var4 = (r45.el4) m70Var.getCustom(25)) == null) ? null : el4Var4.getString(0);
                r45.m70 m70Var2 = afVar.T;
                qVar.f348658g = (m70Var2 == null || (el4Var3 = (r45.el4) m70Var2.getCustom(25)) == null) ? null : el4Var3.getString(1);
                qVar.f348662h = "view";
                qVar.f348666i = 5;
                qVar.f348674k = X6;
                r45.m70 m70Var3 = afVar.T;
                qVar.f348734z = (m70Var3 == null || (el4Var2 = (r45.el4) m70Var3.getCustom(25)) == null) ? null : el4Var2.getString(3);
                o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
                androidx.appcompat.app.AppCompatActivity activity = afVar.getActivity();
                r45.m70 m70Var4 = afVar.T;
                if (m70Var4 != null && (el4Var = (r45.el4) m70Var4.getCustom(25)) != null) {
                    str2 = el4Var.getString(0);
                }
                ((r35.k1) q1Var).Ri(activity, str, str2, new com.tencent.mm.plugin.finder.feed.me(str, qVar, afVar, z17), com.tencent.mm.plugin.finder.feed.ne.f108574a, com.tencent.mm.plugin.finder.feed.oe.f108638d);
            }
            com.tencent.mm.plugin.finder.feed.af.Q6(afVar);
        }
        return jz5.f0.f302826a;
    }
}
