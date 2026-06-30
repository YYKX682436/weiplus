package com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/group/RepairerGroupSns;", "Lq55/g;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.repairer.group.RepairerGroupSns */
/* loaded from: classes.dex */
public final class C20922xe427d5b3 extends q55.g {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerGroup_Sns";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "朋友圈";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20891xa0cff4de.class;
    }

    public final r45.dp5 h() {
        r45.dp5 dp5Var = new r45.dp5();
        dp5Var.set(0, "RepairerGroup_OldMaas");
        dp5Var.set(1, "Maas Config");
        dp5Var.set(2, 1);
        for (java.util.Map.Entry entry : kz5.c1.k(new jz5.l("RepairerConfig_Maas_ShowMainEntry_Int", "发表主入口"), new jz5.l("RepairerConfig_Maas_ShowEventEntry_Int", "活动发表入口"), new jz5.l("RepairerConfig_Maas_ShowCreationSameEntry_Int", "剪同款入口"), new jz5.l("RepairerConfig_Maas_ShowFeedCreationSameEntry_Int", "feed 剪同款入口"), new jz5.l("RepairerConfig_Maas_32BitEntry_Int", "是否打开 32 位入口"), new jz5.l("RepairerConfig_Maas_DisableAiAnalysis_Int", "是否关闭 AI 分析"), new jz5.l("RepairerConfig_Maas_DisableVideoTranscodeOpt_Int", "是否开启导入视频优化转码"), new jz5.l("RepairerConfig_Maas_SnsShowPostMainEntry_Int", "是否开启朋友圈发表入口"), new jz5.l("RepairerConfig_Maas_SnsShowCreateSameEntry_Int", "是否开启朋友圈剪同款入口"), new jz5.l("RepairerConfig_Maas_SnsSpringStrategy_Int", "使用秒剪推荐"), new jz5.l("RepairerConfig_Maas_SnsSpringOfflineStrategy_Int", "朋友圈春节离线策略"), new jz5.l("RepairerConfig_Maas_CleanLegacyRes_Int", "是否清理 maas 过期资源")).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            java.util.LinkedList m75941xfb821914 = dp5Var.m75941xfb821914(5);
            r45.dp5 dp5Var2 = new r45.dp5();
            dp5Var2.set(0, str);
            dp5Var2.set(1, str2);
            dp5Var2.set(2, 3);
            java.util.LinkedList m75941xfb8219142 = dp5Var2.m75941xfb821914(3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getValues(...)");
            kz5.h0.w(m75941xfb8219142, new java.lang.String[]{"-1", "0", "1"});
            java.util.LinkedList m75941xfb8219143 = dp5Var2.m75941xfb821914(6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getValueAlias(...)");
            kz5.h0.w(m75941xfb8219143, new java.lang.String[]{"默认", "关闭", "打开"});
            m75941xfb821914.add(dp5Var2);
        }
        java.util.LinkedList m75941xfb8219144 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var3 = new r45.dp5();
        dp5Var3.set(0, "RepairerConfig_Maas_MinApiLevel_Int");
        dp5Var3.set(1, "最小支持API Level");
        dp5Var3.set(2, 3);
        java.util.LinkedList m75941xfb8219145 = dp5Var3.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219145, "getValues(...)");
        kz5.h0.w(m75941xfb8219145, new java.lang.String[]{"21", "22", "23", "24", "25", "26"});
        java.util.LinkedList m75941xfb8219146 = dp5Var3.m75941xfb821914(6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219146, "getValueAlias(...)");
        kz5.h0.w(m75941xfb8219146, new java.lang.String[]{"21", "22", "23", "24", "25", "26"});
        m75941xfb8219144.add(dp5Var3);
        java.util.LinkedList m75941xfb8219147 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var4 = new r45.dp5();
        dp5Var4.set(0, "RepairerConfig_Maas_SnsExportVideoBitrate_Int");
        dp5Var4.set(1, "朋友圈秒剪模板视频导出码率");
        dp5Var4.set(2, 3);
        java.util.LinkedList m75941xfb8219148 = dp5Var4.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219148, "getValues(...)");
        kz5.h0.w(m75941xfb8219148, new java.lang.String[]{"0", "1000000", "2000000", "4000000", "6000000", "8000000", "10000000"});
        java.util.LinkedList m75941xfb8219149 = dp5Var4.m75941xfb821914(6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219149, "getValueAlias(...)");
        kz5.h0.w(m75941xfb8219149, new java.lang.String[]{"默认", "1M", "2M", "4M", "6M", "8M", "10M"});
        m75941xfb8219147.add(dp5Var4);
        java.util.LinkedList m75941xfb82191410 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var5 = new r45.dp5();
        dp5Var5.set(0, "RepairerConfig_Maas_SnsExportVideoDimension_Int");
        dp5Var5.set(1, "朋友圈秒剪模板视频导出分辨率");
        dp5Var5.set(2, 3);
        java.util.LinkedList m75941xfb82191411 = dp5Var5.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191411, "getValues(...)");
        kz5.h0.w(m75941xfb82191411, new java.lang.String[]{"0", "540", "720", "1080"});
        java.util.LinkedList m75941xfb82191412 = dp5Var5.m75941xfb821914(6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191412, "getValueAlias(...)");
        kz5.h0.w(m75941xfb82191412, new java.lang.String[]{"默认", "540p", "720p", "1080p"});
        m75941xfb82191410.add(dp5Var5);
        java.util.LinkedList m75941xfb82191413 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var6 = new r45.dp5();
        dp5Var6.set(0, "RepairerConfig_Maas_PreprocTimeoutLimit_Int");
        dp5Var6.set(1, "preproc 超时时间");
        dp5Var6.set(2, 3);
        java.util.LinkedList m75941xfb82191414 = dp5Var6.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191414, "getValues(...)");
        kz5.h0.w(m75941xfb82191414, new java.lang.String[]{"1", "5", "20", "25", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62846x68d3fef, "40"});
        java.util.LinkedList m75941xfb82191415 = dp5Var6.m75941xfb821914(6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191415, "getValueAlias(...)");
        kz5.h0.w(m75941xfb82191415, new java.lang.String[]{"1", "5", "20", "25", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62846x68d3fef, "40"});
        m75941xfb82191413.add(dp5Var6);
        java.util.LinkedList m75941xfb82191416 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var7 = new r45.dp5();
        dp5Var7.set(0, "RepairerConfig_Maas_FinderFallBack_Int");
        dp5Var7.set(1, "视频号推荐回退策略");
        dp5Var7.set(2, 3);
        dp5Var7.m75941xfb821914(3).addAll(kz5.c0.i("0", "1", "2"));
        dp5Var7.m75941xfb821914(6).addAll(kz5.c0.i("无", "推荐网络出错", "不走推荐"));
        m75941xfb82191416.add(dp5Var7);
        java.util.LinkedList m75941xfb82191417 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var8 = new r45.dp5();
        dp5Var8.set(0, "RepairerConfig_Maas_SnsH265ExportCodecType_Int");
        dp5Var8.set(1, "朋友圈 h265 编码方式");
        dp5Var8.set(2, 3);
        dp5Var8.m75941xfb821914(3).addAll(kz5.c0.i("1", "2", "3"));
        dp5Var8.m75941xfb821914(6).addAll(kz5.c0.i("默认", "硬编", "软编"));
        m75941xfb82191417.add(dp5Var8);
        java.util.LinkedList m75941xfb82191418 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var9 = new r45.dp5();
        dp5Var9.set(0, "RepairerConfig_Maas_LoadSoFromSdCard_Int");
        dp5Var9.set(1, "从 sd 卡加载 so");
        dp5Var9.set(2, 3);
        dp5Var9.m75941xfb821914(3).addAll(kz5.c0.i("0", "1"));
        dp5Var9.m75941xfb821914(6).addAll(kz5.c0.i("默认", "打开"));
        m75941xfb82191418.add(dp5Var9);
        java.lang.String str3 = "getValueAlias(...)";
        java.lang.String str4 = "-1";
        for (java.util.Map.Entry entry2 : kz5.c1.k(new jz5.l("RepairerConfig_Maas_RecordTemplateEnable_Int", "拍摄模板发表入口"), new jz5.l("RepairerConfig_Maas_RecordTemplateFollow_Int", "拍摄feed跟拍入口"), new jz5.l("RepairerConfig_Maas_RecordTemplateTransfer_Int", "拍摄转发跟拍入口"), new jz5.l("RepairerConfig_Maas_RecordTemplateEvent_Int", "活动跟拍入口"), new jz5.l("RepairerConfig_Maas_SnsSpringOfflineStrategy_Int", "朋友圈春节离线策略"), new jz5.l("RepairerConfig_Maas_SnsSpringStrategy_Int", "朋友圈春节策略"), new jz5.l("RepairerConfig_Maas_SnsH265Export_Int", "sns h265 export"), new jz5.l("RepairerConfig_Maas_SnsMusicSearch_Int", "朋友圈音乐搜索"), new jz5.l("RepairerConfig_Maas_PreloadEnable_Int", "开启预加载"), new jz5.l("RepairerConfig_Maas_DirectSearchEnable_Int", "音乐搜索直接搜索")).entrySet()) {
            java.lang.String str5 = (java.lang.String) entry2.getKey();
            java.lang.String str6 = (java.lang.String) entry2.getValue();
            java.util.LinkedList m75941xfb82191419 = dp5Var.m75941xfb821914(5);
            r45.dp5 dp5Var10 = new r45.dp5();
            dp5Var10.set(0, str5);
            dp5Var10.set(1, str6);
            dp5Var10.set(2, 3);
            java.util.LinkedList m75941xfb82191420 = dp5Var10.m75941xfb821914(3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191420, "getValues(...)");
            java.lang.String str7 = str4;
            kz5.h0.w(m75941xfb82191420, new java.lang.String[]{str7, "0", "1"});
            java.util.LinkedList m75941xfb82191421 = dp5Var10.m75941xfb821914(6);
            java.lang.String str8 = str3;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191421, str8);
            kz5.h0.w(m75941xfb82191421, new java.lang.String[]{"默认", "关闭", "打开"});
            m75941xfb82191419.add(dp5Var10);
            str4 = str7;
            str3 = str8;
        }
        java.util.LinkedList m75941xfb82191422 = dp5Var.m75941xfb821914(5);
        r45.dp5 dp5Var11 = new r45.dp5();
        dp5Var11.set(0, "RepairerConfig_Maas_MinApiLevel_Int");
        dp5Var11.set(1, "MassMinApiLevel");
        dp5Var11.set(2, 3);
        java.util.LinkedList m75941xfb82191423 = dp5Var11.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191423, "getValues(...)");
        kz5.h0.w(m75941xfb82191423, new java.lang.String[]{"21", "22", "23", "24", "25", "26"});
        java.util.LinkedList m75941xfb82191424 = dp5Var11.m75941xfb821914(6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191424, str3);
        kz5.h0.w(m75941xfb82191424, new java.lang.String[]{"21", "22", "23", "24", "25", "26"});
        m75941xfb82191422.add(dp5Var11);
        return dp5Var;
    }
}
