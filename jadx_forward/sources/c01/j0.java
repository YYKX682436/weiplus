package c01;

@j95.b
/* loaded from: classes11.dex */
public class j0 extends i95.w implements qk.o6 {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.LruCache f118800d = new android.util.LruCache(3);

    public void Ai(android.content.Intent intent, r45.iw5 iw5Var, int i17) {
        java.lang.String g17 = x51.j1.g(iw5Var.f458889d);
        intent.putExtra("Contact_User", g17);
        intent.putExtra("Contact_Nick", x51.j1.g(iw5Var.f458890e));
        intent.putExtra("Contact_PyInitial", x51.j1.g(iw5Var.f458891f));
        intent.putExtra("Contact_QuanPin", x51.j1.g(iw5Var.f458892g));
        intent.putExtra("Contact_Alias", iw5Var.f458902t);
        intent.putExtra("Contact_Sex", iw5Var.f458893h);
        intent.putExtra("Contact_VUser_Info", iw5Var.f458900r);
        intent.putExtra("Contact_VUser_Info_Flag", iw5Var.f458899q);
        intent.putExtra("Contact_KWeibo_flag", iw5Var.f458904v);
        intent.putExtra("Contact_KWeibo", iw5Var.f458901s);
        intent.putExtra("Contact_KWeiboNick", iw5Var.f458903u);
        intent.putExtra("Contact_Scene", i17);
        intent.putExtra("Contact_KHideExpose", true);
        intent.putExtra("Contact_RegionCode", com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(iw5Var.A, iw5Var.f458895m, iw5Var.f458896n));
        intent.putExtra("Contact_Signature", iw5Var.f458897o);
        intent.putExtra("Contact_BrandList", iw5Var.B);
        intent.putExtra("Contact_KSnsIFlag", iw5Var.f458908z.f452961d);
        intent.putExtra("Contact_KSnsBgId", iw5Var.f458908z.f452963f);
        intent.putExtra("Contact_KSnsBgUrl", iw5Var.f458908z.f452962e);
        intent.putExtra("Contact_BIZ_KF_WORKER_ID", iw5Var.f458888J);
        intent.putExtra("AntispamTicket", iw5Var.I);
        intent.putExtra("Contact_BIZ_PopupInfoMsg", iw5Var.L);
        intent.putExtra("Contact_Ext_Flag", iw5Var.P);
        r45.va0 va0Var = iw5Var.C;
        if (va0Var != null && va0Var.f469555e != null) {
            try {
                intent.putExtra("biz_type", new cl0.g(iw5Var.C.f469555e).mo15080xc3ca103c("ServiceType", 0));
            } catch (cl0.f e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizInfoLogicImp", "CustomizedInfo.ExternalInfo parse json failed [%s]", e17.getMessage());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfoLogicImp", "[tomys] anti, content: %s", iw5Var.I);
        qk.o oVar = new qk.o();
        oVar.f66748xdec927b = g17;
        oVar.f66736x6bad7fc0 = iw5Var.B;
        oVar.f66743xed139019 = iw5Var.f458888J;
        r45.va0 va0Var2 = iw5Var.C;
        if (va0Var2 != null) {
            oVar.f66733x6baace8e = va0Var2.f469554d;
            oVar.f66735x6bac33d0 = va0Var2.f469556f;
            oVar.f66740x26b3182a = va0Var2.f469555e;
            oVar.f66731x4b3625c7 = null;
            oVar.f66734xea1bd3d4 = va0Var2.f469557g;
        }
        if (r01.q3.cj().mo11260x413cb2b4(oVar)) {
            return;
        }
        r01.q3.cj().mo880xb970c2b9(oVar);
    }

    public void wi(android.content.Intent intent, r45.gw5 gw5Var, int i17) {
        java.lang.String g17 = x51.j1.g(gw5Var.f457094d);
        intent.putExtra("Contact_User", g17);
        intent.putExtra("Contact_Nick", x51.j1.g(gw5Var.f457095e));
        intent.putExtra("Contact_PyInitial", x51.j1.g(gw5Var.f457096f));
        intent.putExtra("Contact_QuanPin", x51.j1.g(gw5Var.f457097g));
        intent.putExtra("Contact_Alias", gw5Var.f457107t);
        intent.putExtra("Contact_Sex", gw5Var.f457098h);
        intent.putExtra("Contact_VUser_Info", gw5Var.f457105r);
        intent.putExtra("Contact_VUser_Info_Flag", gw5Var.f457104q);
        intent.putExtra("Contact_KWeibo_flag", gw5Var.f457109v);
        intent.putExtra("Contact_KWeibo", gw5Var.f457106s);
        intent.putExtra("Contact_KWeiboNick", gw5Var.f457108u);
        intent.putExtra("Contact_Scene", i17);
        intent.putExtra("Contact_KHideExpose", true);
        intent.putExtra("Contact_RegionCode", com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(gw5Var.A, gw5Var.f457100m, gw5Var.f457101n));
        intent.putExtra("Contact_Signature", gw5Var.f457102o);
        intent.putExtra("Contact_BrandList", gw5Var.B);
        intent.putExtra("Contact_KSnsIFlag", gw5Var.f457113z.f452961d);
        intent.putExtra("Contact_KSnsBgId", gw5Var.f457113z.f452963f);
        intent.putExtra("Contact_KSnsBgUrl", gw5Var.f457113z.f452962e);
        intent.putExtra("AntispamTicket", gw5Var.F);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfoLogicImp", "[tomys] anti, content: %s", gw5Var.F);
        qk.o oVar = new qk.o();
        oVar.f66748xdec927b = g17;
        oVar.f66736x6bad7fc0 = gw5Var.B;
        r45.va0 va0Var = gw5Var.C;
        if (va0Var != null) {
            oVar.f66733x6baace8e = va0Var.f469554d;
            oVar.f66735x6bac33d0 = va0Var.f469556f;
            oVar.f66740x26b3182a = va0Var.f469555e;
            oVar.f66731x4b3625c7 = null;
            oVar.f66734xea1bd3d4 = va0Var.f469557g;
        }
        if (r01.q3.cj().mo11260x413cb2b4(oVar)) {
            return;
        }
        r01.q3.cj().mo880xb970c2b9(oVar);
    }
}
