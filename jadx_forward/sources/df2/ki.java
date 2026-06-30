package df2;

/* loaded from: classes3.dex */
public final class ki extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wi f312115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(df2.wi wiVar, java.lang.String str) {
        super(0);
        this.f312115d = wiVar;
        this.f312116e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        boolean w17;
        r45.z53 z53Var;
        java.lang.String str2;
        java.lang.String str3;
        r45.z53 z53Var2;
        r45.z53 z53Var3;
        r45.z53 z53Var4;
        r45.z53 z53Var5;
        java.lang.String m75945x2fec8307;
        r45.z53 z53Var6;
        r45.z53 z53Var7;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpGame ");
        df2.wi wiVar = this.f312115d;
        r45.n73 c76 = wiVar.c7();
        sb6.append((c76 == null || (z53Var7 = (r45.z53) c76.m75936x14adae67(1)) == null) ? null : z53Var7.m75945x2fec8307(4));
        sb6.append(", ");
        r45.n73 c77 = wiVar.c7();
        sb6.append((c77 == null || (z53Var6 = (r45.z53) c77.m75936x14adae67(1)) == null) ? null : z53Var6.m75945x2fec8307(0));
        sb6.append(", ");
        java.lang.String str4 = this.f312116e;
        sb6.append(str4);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str5 = wiVar.f313223m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, sb7);
        java.lang.String t17 = r26.i0.t(r26.i0.t(str4, "=", "%3d", false), "&", "%26", false);
        java.lang.String concat = "JUNMFORM_Pandora_WeChatLive_ShiPinHao_".concat(t17);
        r45.xl6 e76 = wiVar.e7();
        if (e76 != null && (m75945x2fec8307 = e76.m75945x2fec8307(4)) != null) {
            concat = "JUNMFORM_Pandora_WeChatLive_ShiPinHao_AuthCode_" + m75945x2fec8307 + "_Start_" + t17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "jumpGame buff:" + concat);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699();
        c11272xd6622699.f33061xb2206a6f = concat;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11272xd6622699);
        c11286x34a5504.f33127xc9f07109 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a;
        c11286x34a5504.f33125x9b39409a = concat;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        r45.n73 c78 = wiVar.c7();
        if (c78 == null || (z53Var5 = (r45.z53) c78.m75936x14adae67(1)) == null || (str = z53Var5.m75945x2fec8307(0)) == null) {
            str = "";
        }
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m i17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.i(str, Integer.MAX_VALUE);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("jumpGame, openId:");
        sb8.append(i17 != null ? i17.f67384x996f3ea : null);
        sb8.append(", appInfo:");
        sb8.append(i17 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, sb8.toString());
        df2.si siVar = new df2.si(wiVar);
        r45.xl6 e77 = wiVar.e7();
        if ((e77 != null && e77.m75939xb282bd08(2) == 1) || wiVar.f313224n) {
            java.lang.String str6 = i17.f67386xa1e9e82c;
            java.lang.String str7 = str6 == null ? "" : str6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "jumpGame without openId, pkg:".concat(str7));
            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
            android.content.Context O6 = wiVar.O6();
            r45.n73 c79 = wiVar.c7();
            java.lang.String m75945x2fec83072 = (c79 == null || (z53Var = (r45.z53) c79.m75936x14adae67(1)) == null) ? null : z53Var.m75945x2fec8307(0);
            android.os.Bundle bundle = new android.os.Bundle();
            ((kt.c) i0Var2).getClass();
            w17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.w(O6, str7, c11286x34a5504, m75945x2fec83072, "", 2, siVar, bundle);
        } else {
            lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
            android.content.Context O62 = wiVar.O6();
            r45.n73 c710 = wiVar.c7();
            w17 = ((kt.c) i0Var3).fj(O62, (c710 == null || (z53Var4 = (r45.z53) c710.m75936x14adae67(1)) == null) ? null : z53Var4.m75945x2fec8307(0), c11286x34a5504, 2, siVar, new android.os.Bundle());
        }
        if (!w17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str5, "launchAppByWeChat failed, request and toast");
            lt.i0 i0Var4 = (lt.i0) i95.n0.c(lt.i0.class);
            r45.n73 c711 = wiVar.c7();
            if (c711 == null || (z53Var3 = (r45.z53) c711.m75936x14adae67(1)) == null || (str2 = z53Var3.m75945x2fec8307(0)) == null) {
                str2 = "";
            }
            r45.n73 c712 = wiVar.c7();
            if (c712 == null || (z53Var2 = (r45.z53) c712.m75936x14adae67(1)) == null || (str3 = z53Var2.m75945x2fec8307(4)) == null) {
                str3 = "";
            }
            ((kt.c) i0Var4).Ri(str2, str3, null);
            db5.t7.m123882x26a183b(wiVar.O6(), com.p314xaae8f345.mm.R.C30867xcad56011.dgq, 0).show();
        }
        return jz5.f0.f384359a;
    }
}
