package com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/group/RepairerGroupPay;", "Lq55/g;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.repairer.group.RepairerGroupPay */
/* loaded from: classes.dex */
public final class C20909xe427c8e3 extends q55.g {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerGroup_Pay";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "支付";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20891xa0cff4de.class;
    }

    public final java.util.List h() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.dp5 dp5Var = new r45.dp5();
        dp5Var.set(0, "RepairerGroup_OldPay");
        dp5Var.set(1, "微信支付调试");
        dp5Var.set(2, 1);
        java.util.LinkedList m75941xfb821914 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var2 = new r45.dp5();
        dp5Var2.set(0, "RepairerConfig_Pay_KindaConfigEnable_Int");
        dp5Var2.set(1, "跨平台本地开关（0：默认、1：开启、2：关闭）");
        dp5Var2.set(2, 3);
        java.util.LinkedList m75941xfb8219142 = dp5Var2.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getValues(...)");
        kz5.h0.w(m75941xfb8219142, new java.lang.String[]{"0", "1", "2"});
        m75941xfb821914.add(dp5Var2);
        java.util.LinkedList m75941xfb8219143 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var3 = new r45.dp5();
        dp5Var3.set(0, "RepairerConfig_Pay_993TEST_Int");
        dp5Var3.set(1, "993支付-国密（0：默认、1：开启、2：关闭）");
        dp5Var3.set(2, 3);
        java.util.LinkedList m75941xfb8219144 = dp5Var3.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getValues(...)");
        kz5.h0.w(m75941xfb8219144, new java.lang.String[]{"0", "1", "2"});
        m75941xfb8219143.add(dp5Var3);
        java.util.LinkedList m75941xfb8219145 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var4 = new r45.dp5();
        dp5Var4.set(0, "RepairerGroup_PayLuckyMoney");
        dp5Var4.set(1, "红包调试");
        dp5Var4.set(2, 1);
        java.util.LinkedList m75941xfb8219146 = dp5Var4.m75941xfb821914(5);
        r45.dp5 dp5Var5 = new r45.dp5();
        dp5Var5.set(0, "RepairerConfig_Pay_LuckyMoneyEnvelopeFirstGuide_Int");
        dp5Var5.set(1, "红包封面教育动画（0：默认、1：开启、2：关闭）");
        dp5Var5.set(2, 3);
        java.util.LinkedList m75941xfb8219147 = dp5Var5.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219147, "getValues(...)");
        kz5.h0.w(m75941xfb8219147, new java.lang.String[]{"0", "1", "2"});
        m75941xfb8219146.add(dp5Var5);
        java.util.LinkedList m75941xfb8219148 = dp5Var4.m75941xfb821914(5);
        r45.dp5 dp5Var6 = new r45.dp5();
        dp5Var6.set(0, "RepairerConfig_Pay_LuckyMoneyEnvelopePreviewVideo_Int");
        dp5Var6.set(1, "红包封面自动预览视频（0：默认、1：开启、2：关闭）");
        dp5Var6.set(2, 3);
        java.util.LinkedList m75941xfb8219149 = dp5Var6.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219149, "getValues(...)");
        kz5.h0.w(m75941xfb8219149, new java.lang.String[]{"0", "1", "2"});
        m75941xfb8219148.add(dp5Var6);
        m75941xfb8219145.add(dp5Var4);
        java.util.LinkedList m75941xfb82191410 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var7 = new r45.dp5();
        dp5Var7.set(0, "RepairerConfig_Pay_YSFDebugEnv_Int");
        dp5Var7.set(1, "ysf调试环境（0：正式、1：测试）");
        dp5Var7.set(2, 3);
        java.util.LinkedList m75941xfb82191411 = dp5Var7.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191411, "getValues(...)");
        kz5.h0.w(m75941xfb82191411, new java.lang.String[]{"0", "1"});
        m75941xfb82191410.add(dp5Var7);
        java.util.LinkedList m75941xfb82191412 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var8 = new r45.dp5();
        dp5Var8.set(0, "RepairerConfig_Pay_UseBiometricPrompt_Int");
        dp5Var8.set(1, "强制使用BiometricPrompt（0：默认、1：使用、2：不使用）");
        dp5Var8.set(2, 3);
        java.util.LinkedList m75941xfb82191413 = dp5Var8.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191413, "getValues(...)");
        kz5.h0.w(m75941xfb82191413, new java.lang.String[]{"0", "1", "2"});
        m75941xfb82191412.add(dp5Var8);
        java.util.LinkedList m75941xfb82191414 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var9 = new r45.dp5();
        dp5Var9.set(0, "RepairerConfig_Pay_KindaHotReload_Int");
        dp5Var9.set(1, "kinda hot reload（0：关闭、1：开启）");
        dp5Var9.set(2, 3);
        java.util.LinkedList m75941xfb82191415 = dp5Var9.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191415, "getValues(...)");
        kz5.h0.w(m75941xfb82191415, new java.lang.String[]{"0", "1"});
        m75941xfb82191414.add(dp5Var9);
        java.util.LinkedList m75941xfb82191416 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var10 = new r45.dp5();
        dp5Var10.set(0, "RepairerActivity_PayDebugUI");
        dp5Var10.set(1, "支付调试页面");
        dp5Var10.set(2, 2);
        dp5Var10.m75941xfb821914(3).add("com.tencent.mm.plugin.repairer.ui.RepairerPayDebugUI");
        m75941xfb82191416.add(dp5Var10);
        java.util.LinkedList m75941xfb82191417 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var11 = new r45.dp5();
        dp5Var11.set(0, "RepairerConfig_Pay_HoneyPayCross_Int");
        dp5Var11.set(1, "亲属卡跨平台（0：默认、1：开启、2：关闭）");
        dp5Var11.set(2, 3);
        java.util.LinkedList m75941xfb82191418 = dp5Var11.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191418, "getValues(...)");
        kz5.h0.w(m75941xfb82191418, new java.lang.String[]{"0", "1", "2"});
        m75941xfb82191417.add(dp5Var11);
        java.util.LinkedList m75941xfb82191419 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var12 = new r45.dp5();
        dp5Var12.set(0, "RepairerConfig_Pay_FaceCheckCross_Int");
        dp5Var12.set(1, "人脸跨平台（0：默认、1：开启、2：关闭）");
        dp5Var12.set(2, 3);
        java.util.LinkedList m75941xfb82191420 = dp5Var12.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191420, "getValues(...)");
        kz5.h0.w(m75941xfb82191420, new java.lang.String[]{"0", "1", "2"});
        m75941xfb82191419.add(dp5Var12);
        java.util.LinkedList m75941xfb82191421 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var13 = new r45.dp5();
        dp5Var13.set(0, "RepairerConfig_Pay_UnionTransfer_Int");
        dp5Var13.set(1, "强制打开互通转账（0：不强制打开、1：强制打开）");
        dp5Var13.set(2, 3);
        java.util.LinkedList m75941xfb82191422 = dp5Var13.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191422, "getValues(...)");
        kz5.h0.w(m75941xfb82191422, new java.lang.String[]{"0", "1"});
        m75941xfb82191421.add(dp5Var13);
        arrayList.add(dp5Var);
        r45.dp5 dp5Var14 = new r45.dp5();
        dp5Var14.set(0, "RepairerActivity_PaySetEnvId");
        dp5Var14.set(1, "设置测试环境ID");
        dp5Var14.set(2, 2);
        dp5Var14.m75941xfb821914(3).add("com.tencent.mm.plugin.paytest.ui.PayTestEnvInfoSettingUI");
        arrayList.add(dp5Var14);
        r45.dp5 dp5Var15 = new r45.dp5();
        dp5Var15.set(0, "RepairerActivity_SetH5Proxy");
        dp5Var15.set(1, "开启测试H5代理");
        dp5Var15.set(2, 2);
        dp5Var15.m75941xfb821914(3).add("com.tencent.mm.plugin.paytest.ui.SetH5ProxySettingUI");
        arrayList.add(dp5Var15);
        return arrayList;
    }
}
