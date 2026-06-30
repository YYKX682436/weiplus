package c01;

@j95.b
/* loaded from: classes11.dex */
public class j0 extends i95.w implements qk.o6 {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.LruCache f37267d = new android.util.LruCache(3);

    public void Ai(android.content.Intent intent, r45.iw5 iw5Var, int i17) {
        java.lang.String g17 = x51.j1.g(iw5Var.f377356d);
        intent.putExtra("Contact_User", g17);
        intent.putExtra("Contact_Nick", x51.j1.g(iw5Var.f377357e));
        intent.putExtra("Contact_PyInitial", x51.j1.g(iw5Var.f377358f));
        intent.putExtra("Contact_QuanPin", x51.j1.g(iw5Var.f377359g));
        intent.putExtra("Contact_Alias", iw5Var.f377369t);
        intent.putExtra("Contact_Sex", iw5Var.f377360h);
        intent.putExtra("Contact_VUser_Info", iw5Var.f377367r);
        intent.putExtra("Contact_VUser_Info_Flag", iw5Var.f377366q);
        intent.putExtra("Contact_KWeibo_flag", iw5Var.f377371v);
        intent.putExtra("Contact_KWeibo", iw5Var.f377368s);
        intent.putExtra("Contact_KWeiboNick", iw5Var.f377370u);
        intent.putExtra("Contact_Scene", i17);
        intent.putExtra("Contact_KHideExpose", true);
        intent.putExtra("Contact_RegionCode", com.tencent.mm.storage.ha.q(iw5Var.A, iw5Var.f377362m, iw5Var.f377363n));
        intent.putExtra("Contact_Signature", iw5Var.f377364o);
        intent.putExtra("Contact_BrandList", iw5Var.B);
        intent.putExtra("Contact_KSnsIFlag", iw5Var.f377375z.f371428d);
        intent.putExtra("Contact_KSnsBgId", iw5Var.f377375z.f371430f);
        intent.putExtra("Contact_KSnsBgUrl", iw5Var.f377375z.f371429e);
        intent.putExtra("Contact_BIZ_KF_WORKER_ID", iw5Var.f377355J);
        intent.putExtra("AntispamTicket", iw5Var.I);
        intent.putExtra("Contact_BIZ_PopupInfoMsg", iw5Var.L);
        intent.putExtra("Contact_Ext_Flag", iw5Var.P);
        r45.va0 va0Var = iw5Var.C;
        if (va0Var != null && va0Var.f388022e != null) {
            try {
                intent.putExtra("biz_type", new cl0.g(iw5Var.C.f388022e).optInt("ServiceType", 0));
            } catch (cl0.f e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BizInfoLogicImp", "CustomizedInfo.ExternalInfo parse json failed [%s]", e17.getMessage());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoLogicImp", "[tomys] anti, content: %s", iw5Var.I);
        qk.o oVar = new qk.o();
        oVar.field_username = g17;
        oVar.field_brandList = iw5Var.B;
        oVar.field_kfWorkerId = iw5Var.f377355J;
        r45.va0 va0Var2 = iw5Var.C;
        if (va0Var2 != null) {
            oVar.field_brandFlag = va0Var2.f388021d;
            oVar.field_brandInfo = va0Var2.f388023f;
            oVar.field_extInfo = va0Var2.f388022e;
            oVar.field_attrSyncVersion = null;
            oVar.field_brandIconURL = va0Var2.f388024g;
        }
        if (r01.q3.cj().replace(oVar)) {
            return;
        }
        r01.q3.cj().insert(oVar);
    }

    public void wi(android.content.Intent intent, r45.gw5 gw5Var, int i17) {
        java.lang.String g17 = x51.j1.g(gw5Var.f375561d);
        intent.putExtra("Contact_User", g17);
        intent.putExtra("Contact_Nick", x51.j1.g(gw5Var.f375562e));
        intent.putExtra("Contact_PyInitial", x51.j1.g(gw5Var.f375563f));
        intent.putExtra("Contact_QuanPin", x51.j1.g(gw5Var.f375564g));
        intent.putExtra("Contact_Alias", gw5Var.f375574t);
        intent.putExtra("Contact_Sex", gw5Var.f375565h);
        intent.putExtra("Contact_VUser_Info", gw5Var.f375572r);
        intent.putExtra("Contact_VUser_Info_Flag", gw5Var.f375571q);
        intent.putExtra("Contact_KWeibo_flag", gw5Var.f375576v);
        intent.putExtra("Contact_KWeibo", gw5Var.f375573s);
        intent.putExtra("Contact_KWeiboNick", gw5Var.f375575u);
        intent.putExtra("Contact_Scene", i17);
        intent.putExtra("Contact_KHideExpose", true);
        intent.putExtra("Contact_RegionCode", com.tencent.mm.storage.ha.q(gw5Var.A, gw5Var.f375567m, gw5Var.f375568n));
        intent.putExtra("Contact_Signature", gw5Var.f375569o);
        intent.putExtra("Contact_BrandList", gw5Var.B);
        intent.putExtra("Contact_KSnsIFlag", gw5Var.f375580z.f371428d);
        intent.putExtra("Contact_KSnsBgId", gw5Var.f375580z.f371430f);
        intent.putExtra("Contact_KSnsBgUrl", gw5Var.f375580z.f371429e);
        intent.putExtra("AntispamTicket", gw5Var.F);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoLogicImp", "[tomys] anti, content: %s", gw5Var.F);
        qk.o oVar = new qk.o();
        oVar.field_username = g17;
        oVar.field_brandList = gw5Var.B;
        r45.va0 va0Var = gw5Var.C;
        if (va0Var != null) {
            oVar.field_brandFlag = va0Var.f388021d;
            oVar.field_brandInfo = va0Var.f388023f;
            oVar.field_extInfo = va0Var.f388022e;
            oVar.field_attrSyncVersion = null;
            oVar.field_brandIconURL = va0Var.f388024g;
        }
        if (r01.q3.cj().replace(oVar)) {
            return;
        }
        r01.q3.cj().insert(oVar);
    }
}
