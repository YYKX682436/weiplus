package ix3;

/* loaded from: classes.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f377113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.y0 f377114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(ix3.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377114e = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ix3.v0 v0Var = new ix3.v0(this.f377114e, interfaceC29045xdcb5ca57);
        v0Var.f377113d = obj;
        return v0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ix3.v0 v0Var = (ix3.v0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        v0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.l lVar;
        r45.dp5 dp5Var;
        java.util.LinkedList m75941xfb821914;
        r45.dp5 dp5Var2;
        ix3.y0 y0Var;
        java.util.HashMap hashMap;
        java.util.Iterator it;
        java.lang.Object obj2;
        java.util.HashMap hashMap2;
        java.lang.Class cls;
        q55.g gVar;
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        s55.a aVar2 = com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2525x20a6f421.C20121x501eb805.f273743a;
        ((java.util.ArrayList) com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2525x20a6f421.C20121x501eb805.f273744b).clear();
        ((java.util.ArrayList) com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2525x20a6f421.C20121x501eb805.f273745c).clear();
        java.util.Set set = ix3.y0.f377144d;
        ((java.util.Map) ((jz5.n) ix3.y0.f377146f).mo141623x754a37bb()).forEach(ix3.s0.f377083a);
        r45.dp5 dp5Var3 = new r45.dp5();
        ix3.y0 y0Var2 = this.f377114e;
        byte[] byteArrayExtra = y0Var2.m158359x1e885992().getByteArrayExtra("key_config_item_list");
        int i17 = 1;
        if (byteArrayExtra == null || dp5Var3.m75932x347fbd55(byteArrayExtra) == null) {
            y0Var2.getClass();
            r45.dp5 dp5Var4 = new r45.dp5();
            java.util.HashMap hashMap3 = new java.util.HashMap();
            java.util.Iterator it6 = ((ew3.a) ((ew3.c) ((jz5.n) ew3.e.f338597a).mo141623x754a37bb())).a("defaultType").iterator();
            while (it6.hasNext()) {
                java.lang.Class cls2 = (java.lang.Class) it6.next();
                java.lang.Object newInstance = cls2.getConstructors()[0].newInstance(new java.lang.Object[0]);
                if (newInstance instanceof q55.g) {
                    q55.g gVar2 = (q55.g) newInstance;
                    r45.dp5 dp5Var5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar2.e(), cls2) ? dp5Var4 : new r45.dp5();
                    dp5Var5.set(0, gVar2.b());
                    dp5Var5.set(i17, gVar2.c());
                    dp5Var5.set(2, java.lang.Integer.valueOf(i17));
                    dp5Var5.set(7, java.lang.Integer.valueOf(gVar2.g()));
                    dp5Var5.set(11, java.lang.Integer.valueOf(gVar2.d()));
                    if (newInstance instanceof com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20922xe427d5b3) {
                        java.util.LinkedList m75941xfb8219142 = dp5Var5.m75941xfb821914(5);
                        com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20922xe427d5b3 c20922xe427d5b3 = (com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20922xe427d5b3) newInstance;
                        c20922xe427d5b3.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        r45.dp5 dp5Var6 = new r45.dp5();
                        dp5Var6.set(0, "RepairerGroup_OldMedia");
                        dp5Var6.set(i17, "视频拍摄编辑");
                        dp5Var6.set(2, java.lang.Integer.valueOf(i17));
                        java.util.LinkedList m75941xfb8219143 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var7 = new r45.dp5();
                        dp5Var7.set(0, "RepairerGroup_OldCamera");
                        dp5Var7.set(1, "相机配置");
                        dp5Var7.set(2, 1);
                        java.util.LinkedList m75941xfb8219144 = dp5Var7.m75941xfb821914(5);
                        r45.dp5 dp5Var8 = new r45.dp5();
                        it = it6;
                        dp5Var8.set(0, "RepairerConfig_Camera_Component_Int");
                        dp5Var8.set(1, "Camera组件选择");
                        y0Var = y0Var2;
                        dp5Var8.set(2, 3);
                        java.util.LinkedList m75941xfb8219145 = dp5Var8.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219145, "getValues(...)");
                        dp5Var2 = dp5Var4;
                        hashMap2 = hashMap3;
                        cls = cls2;
                        kz5.h0.w(m75941xfb8219145, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb8219146 = dp5Var8.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219146, "getValueAlias(...)");
                        gVar = gVar2;
                        r45.dp5 dp5Var9 = dp5Var5;
                        kz5.h0.w(m75941xfb8219146, new java.lang.String[]{"默认", "现网版本", "CameraKit"});
                        m75941xfb8219144.add(dp5Var8);
                        java.util.LinkedList m75941xfb8219147 = dp5Var7.m75941xfb821914(5);
                        r45.dp5 dp5Var10 = new r45.dp5();
                        dp5Var10.set(0, "RepairerConfig_Camera_Debug_Int");
                        dp5Var10.set(1, "CameraKit debug开关");
                        dp5Var10.set(2, 3);
                        java.util.LinkedList m75941xfb8219148 = dp5Var10.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219148, "getValues(...)");
                        kz5.h0.w(m75941xfb8219148, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList m75941xfb8219149 = dp5Var10.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219149, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb8219149, new java.lang.String[]{"关闭", "打开"});
                        m75941xfb8219147.add(dp5Var10);
                        java.util.LinkedList m75941xfb82191410 = dp5Var7.m75941xfb821914(5);
                        r45.dp5 dp5Var11 = new r45.dp5();
                        dp5Var11.set(0, "RepairerConfig_Camera_Instance_Int");
                        dp5Var11.set(1, "CameraKit相机实例");
                        dp5Var11.set(2, 3);
                        java.util.LinkedList m75941xfb82191411 = dp5Var11.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191411, "getValues(...)");
                        kz5.h0.w(m75941xfb82191411, new java.lang.String[]{"0", "1", "2", "3"});
                        java.util.LinkedList m75941xfb82191412 = dp5Var11.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191412, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191412, new java.lang.String[]{"默认", "camera1", "camera2", "camerax"});
                        m75941xfb82191410.add(dp5Var11);
                        java.util.LinkedList m75941xfb82191413 = dp5Var7.m75941xfb821914(5);
                        r45.dp5 dp5Var12 = new r45.dp5();
                        dp5Var12.set(0, "RepairerConfig_Camera1_Preview_Int");
                        dp5Var12.set(1, "camera1预览方式");
                        dp5Var12.set(2, 3);
                        java.util.LinkedList m75941xfb82191414 = dp5Var12.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191414, "getValues(...)");
                        kz5.h0.w(m75941xfb82191414, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb82191415 = dp5Var12.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191415, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191415, new java.lang.String[]{"后台配置", "纹理", "buffer"});
                        m75941xfb82191413.add(dp5Var12);
                        java.util.LinkedList m75941xfb82191416 = dp5Var7.m75941xfb821914(5);
                        r45.dp5 dp5Var13 = new r45.dp5();
                        dp5Var13.set(0, "RepairerConfig_Camerax_Picture_Int");
                        dp5Var13.set(1, "camerax拍照方式");
                        dp5Var13.set(2, 3);
                        java.util.LinkedList m75941xfb82191417 = dp5Var13.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191417, "getValues(...)");
                        kz5.h0.w(m75941xfb82191417, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb82191418 = dp5Var13.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191418, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191418, new java.lang.String[]{"后台配置", "readPixel", "ImageCapture"});
                        m75941xfb82191416.add(dp5Var13);
                        java.util.LinkedList m75941xfb82191419 = dp5Var7.m75941xfb821914(5);
                        r45.dp5 dp5Var14 = new r45.dp5();
                        dp5Var14.set(0, "RepairerConfig_Camera_Performance_Int");
                        dp5Var14.set(1, "camera渲染glFinish");
                        dp5Var14.set(2, 3);
                        java.util.LinkedList m75941xfb82191420 = dp5Var14.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191420, "getValues(...)");
                        kz5.h0.w(m75941xfb82191420, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb82191421 = dp5Var14.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191421, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191421, new java.lang.String[]{"默认", "关", "开"});
                        m75941xfb82191419.add(dp5Var14);
                        java.util.LinkedList m75941xfb82191422 = dp5Var7.m75941xfb821914(5);
                        r45.dp5 dp5Var15 = new r45.dp5();
                        dp5Var15.set(0, "RepairerConfig_Camerax_Extension_Int");
                        dp5Var15.set(1, "camerax能力配置");
                        dp5Var15.set(2, 3);
                        java.util.LinkedList m75941xfb82191423 = dp5Var15.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191423, "getValues(...)");
                        kz5.h0.w(m75941xfb82191423, new java.lang.String[]{"0", "1", "2", "3", "4", "5"});
                        java.util.LinkedList m75941xfb82191424 = dp5Var15.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191424, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191424, new java.lang.String[]{"None", "背景虚化", "HDR", "夜景", "美颜", "自动"});
                        m75941xfb82191422.add(dp5Var15);
                        java.util.LinkedList m75941xfb82191425 = dp5Var7.m75941xfb821914(5);
                        r45.dp5 dp5Var16 = new r45.dp5();
                        dp5Var16.set(0, "RepairerConfig_Camera_CameraKitIsUseImproveILayout_Int");
                        dp5Var16.set(1, "新版拍摄页面");
                        dp5Var16.set(2, 3);
                        java.util.LinkedList m75941xfb82191426 = dp5Var16.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191426, "getValues(...)");
                        kz5.h0.w(m75941xfb82191426, new java.lang.String[]{"0", "1", "2", "3", "4", "5"});
                        java.util.LinkedList m75941xfb82191427 = dp5Var16.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191427, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191427, new java.lang.String[]{"x实验", "新功能页面", "屏蔽方案页面", "专业拍摄界面(flash)", "专业拍摄界面(torch)", "关闭"});
                        m75941xfb82191425.add(dp5Var16);
                        java.util.LinkedList m75941xfb82191428 = dp5Var7.m75941xfb821914(5);
                        r45.dp5 dp5Var17 = new r45.dp5();
                        dp5Var17.set(0, "RepairerConfig_Camera_CameraKitImproveInstance_Int");
                        dp5Var17.set(1, "新版拍摄页面使用相机实例");
                        dp5Var17.set(2, 3);
                        java.util.LinkedList m75941xfb82191429 = dp5Var17.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191429, "getValues(...)");
                        kz5.h0.w(m75941xfb82191429, new java.lang.String[]{"0", "1", "2", "3"});
                        java.util.LinkedList m75941xfb82191430 = dp5Var17.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191430, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191430, new java.lang.String[]{"x实验", "camera1", "camera2（未实现）", "cameraX"});
                        m75941xfb82191428.add(dp5Var17);
                        m75941xfb8219143.add(dp5Var7);
                        java.util.LinkedList m75941xfb82191431 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var18 = new r45.dp5();
                        dp5Var18.set(0, "RepairerConfig_MediaParallel_SaveVideo_Int");
                        dp5Var18.set(1, "长视频转码视频强制保存相册");
                        dp5Var18.set(2, 3);
                        java.util.LinkedList m75941xfb82191432 = dp5Var18.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191432, "getValues(...)");
                        kz5.h0.w(m75941xfb82191432, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList m75941xfb82191433 = dp5Var18.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191433, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191433, new java.lang.String[]{"关闭", "打开"});
                        m75941xfb82191431.add(dp5Var18);
                        java.util.LinkedList m75941xfb82191434 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var19 = new r45.dp5();
                        dp5Var19.set(0, "RepairerConfig_MediaParallel_NotSupport_Int");
                        dp5Var19.set(1, "视频号转码并行段数");
                        dp5Var19.set(2, 3);
                        java.util.LinkedList m75941xfb82191435 = dp5Var19.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191435, "getValues(...)");
                        kz5.h0.w(m75941xfb82191435, new java.lang.String[]{"-1", "0", "1", "2", "3", "4", "99"});
                        m75941xfb82191434.add(dp5Var19);
                        java.util.LinkedList m75941xfb82191436 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var20 = new r45.dp5();
                        dp5Var20.set(0, "RepairerConfig_Media_CaptureSoft_Int");
                        dp5Var20.set(1, "c2c/sns拍摄开启使用软编(0:Default/1:开启/2:关闭)");
                        dp5Var20.set(2, 3);
                        java.util.LinkedList m75941xfb82191437 = dp5Var20.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191437, "getValues(...)");
                        kz5.h0.w(m75941xfb82191437, new java.lang.String[]{"0", "1", "2"});
                        m75941xfb82191436.add(dp5Var20);
                        java.util.LinkedList m75941xfb82191438 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var21 = new r45.dp5();
                        dp5Var21.set(0, "RepairerConfig_Media_PlayDolbyVideo_Int");
                        dp5Var21.set(1, "c2c视频播放支持dolby");
                        dp5Var21.set(2, 3);
                        java.util.LinkedList m75941xfb82191439 = dp5Var21.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191439, "getValues(...)");
                        kz5.h0.w(m75941xfb82191439, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList m75941xfb82191440 = dp5Var21.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191440, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191440, new java.lang.String[]{"关闭", "打开"});
                        m75941xfb82191438.add(dp5Var21);
                        java.util.LinkedList m75941xfb82191441 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var22 = new r45.dp5();
                        dp5Var22.set(0, "RepairerConfig_Media_CompositionUseLut_Int");
                        dp5Var22.set(1, "c2c hdr视频转码使用lut");
                        dp5Var22.set(2, 3);
                        java.util.LinkedList m75941xfb82191442 = dp5Var22.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191442, "getValues(...)");
                        kz5.h0.w(m75941xfb82191442, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList m75941xfb82191443 = dp5Var22.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191443, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191443, new java.lang.String[]{"关闭", "打开"});
                        m75941xfb82191441.add(dp5Var22);
                        java.util.LinkedList m75941xfb82191444 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var23 = new r45.dp5();
                        dp5Var23.set(0, "RepairerConfig_Media_CaptureCpuCrop_Int");
                        dp5Var23.set(1, "c2c/sns拍摄开启使用CpuCrop(0:Default/1:开启/2:关闭)");
                        dp5Var23.set(2, 3);
                        java.util.LinkedList m75941xfb82191445 = dp5Var23.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191445, "getValues(...)");
                        kz5.h0.w(m75941xfb82191445, new java.lang.String[]{"0", "1", "2"});
                        m75941xfb82191444.add(dp5Var23);
                        java.util.LinkedList m75941xfb82191446 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var24 = new r45.dp5();
                        dp5Var24.set(0, "RepairerConfig_Media_C2CGallerySelectLimit_Int");
                        dp5Var24.set(1, "c2c 相册选择数量限制");
                        dp5Var24.set(2, 3);
                        java.util.LinkedList m75941xfb82191447 = dp5Var24.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191447, "getValues(...)");
                        kz5.h0.w(m75941xfb82191447, new java.lang.String[]{"9", "12", "15", "18", "99"});
                        m75941xfb82191446.add(dp5Var24);
                        java.util.LinkedList m75941xfb82191448 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var25 = new r45.dp5();
                        dp5Var25.set(0, "RepairerConfig_Media_CaptureHevc_Int");
                        dp5Var25.set(1, "c2c/sns拍摄开启hevc(0:Default/1:软编/2:硬编)");
                        dp5Var25.set(2, 3);
                        java.util.LinkedList m75941xfb82191449 = dp5Var25.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191449, "getValues(...)");
                        kz5.h0.w(m75941xfb82191449, new java.lang.String[]{"0", "1", "2"});
                        m75941xfb82191448.add(dp5Var25);
                        java.util.LinkedList m75941xfb82191450 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var26 = new r45.dp5();
                        dp5Var26.set(0, "RepairerConfig_Media_RemuxHevc_Int");
                        dp5Var26.set(1, "c2c/sns重编码开启hevc(不包括c2c相册选视频)(0:Default/1:软编/2:硬编)");
                        dp5Var26.set(2, 3);
                        java.util.LinkedList m75941xfb82191451 = dp5Var26.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191451, "getValues(...)");
                        kz5.h0.w(m75941xfb82191451, new java.lang.String[]{"0", "1", "2"});
                        m75941xfb82191450.add(dp5Var26);
                        java.util.LinkedList m75941xfb82191452 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var27 = new r45.dp5();
                        dp5Var27.set(0, "RepairerConfig_Media_ImportVideoBRRatio_Float");
                        dp5Var27.set(1, "软编压缩HEVC视频码率比例参数");
                        dp5Var27.set(2, 3);
                        java.util.LinkedList m75941xfb82191453 = dp5Var27.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191453, "getValues(...)");
                        kz5.h0.w(m75941xfb82191453, new java.lang.String[]{"0.7", "0.8", "0.9", "1.0", "1.1", "1.2", "1.3", "1.4", "1.5", "1.7", "1.9", "2.0"});
                        m75941xfb82191452.add(dp5Var27);
                        java.util.LinkedList m75941xfb82191454 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var28 = new r45.dp5();
                        dp5Var28.set(0, "RepairerConfig_Media_ImportVideoHEVC_ABR_Int");
                        dp5Var28.set(1, "c2c相册选视频HEVC软编使用恒定码率模式");
                        dp5Var28.set(2, 3);
                        java.util.LinkedList m75941xfb82191455 = dp5Var28.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191455, "getValues(...)");
                        kz5.h0.w(m75941xfb82191455, new java.lang.String[]{"0", "5", "11", "16", "17"});
                        m75941xfb82191454.add(dp5Var28);
                        java.util.LinkedList m75941xfb82191456 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var29 = new r45.dp5();
                        dp5Var29.set(0, "RepairerConfig_Media_ImportVideoHEVC_CRF_Int");
                        dp5Var29.set(1, "c2c相册选视频HEVC软编使用恒定质量模式");
                        dp5Var29.set(2, 3);
                        java.util.LinkedList m75941xfb82191457 = dp5Var29.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191457, "getValues(...)");
                        kz5.h0.w(m75941xfb82191457, new java.lang.String[]{"0", "12", "13", "14", "15"});
                        m75941xfb82191456.add(dp5Var29);
                        java.util.LinkedList m75941xfb82191458 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var30 = new r45.dp5();
                        dp5Var30.set(0, "RepairerConfig_Media_ImportVideoHEVCCRFRatio_Float");
                        dp5Var30.set(1, "软编压缩HEVC视频恒定质量模式CRF调整参数");
                        dp5Var30.set(2, 3);
                        java.util.LinkedList m75941xfb82191459 = dp5Var30.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191459, "getValues(...)");
                        kz5.h0.w(m75941xfb82191459, new java.lang.String[]{"0", "-1", "-2", "-3", "-4", "1", "2", "3", "4"});
                        m75941xfb82191458.add(dp5Var30);
                        java.util.LinkedList m75941xfb82191460 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var31 = new r45.dp5();
                        dp5Var31.set(0, "RepairerConfig_Media_ImportConstBRRatioMode_Float");
                        dp5Var31.set(1, "存量视频--压缩非原视频是否使用恒定比例码率模式");
                        dp5Var31.set(2, 3);
                        dp5Var31.set(8, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2286xa0294fa3);
                        java.util.LinkedList m75941xfb82191461 = dp5Var31.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191461, "getValues(...)");
                        kz5.h0.w(m75941xfb82191461, new java.lang.String[]{"0", "0.5", "0.6", "0.7", "0.8", "0.9", "1"});
                        m75941xfb82191460.add(dp5Var31);
                        java.util.LinkedList m75941xfb82191462 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var32 = new r45.dp5();
                        dp5Var32.set(0, "RepairerConfig_Media_ImportVideoRemuxHevc_Int");
                        dp5Var32.set(1, "c2c相册选视频开启hevc(0:Default/1:软编)");
                        dp5Var32.set(2, 3);
                        java.util.LinkedList m75941xfb82191463 = dp5Var32.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191463, "getValues(...)");
                        kz5.h0.w(m75941xfb82191463, new java.lang.String[]{"0", "1", "2"});
                        m75941xfb82191462.add(dp5Var32);
                        java.util.LinkedList m75941xfb82191464 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var33 = new r45.dp5();
                        dp5Var33.set(0, "RepairerConfig_Media_ImportVideoUseComposition_Int");
                        dp5Var33.set(1, "c2c相册选视频发送使用video_composition转码");
                        dp5Var33.set(2, 3);
                        java.util.LinkedList m75941xfb82191465 = dp5Var33.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191465, "getValues(...)");
                        kz5.h0.w(m75941xfb82191465, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb82191466 = dp5Var33.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191466, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191466, new java.lang.String[]{"默认", "打开", "关闭"});
                        m75941xfb82191464.add(dp5Var33);
                        java.util.LinkedList m75941xfb82191467 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var34 = new r45.dp5();
                        dp5Var34.set(0, "RepairerConfig_Media_AvcEncodeHard_Int");
                        dp5Var34.set(1, "c2c相册选视频发送264使用硬编转码");
                        dp5Var34.set(2, 3);
                        java.util.LinkedList m75941xfb82191468 = dp5Var34.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191468, "getValues(...)");
                        kz5.h0.w(m75941xfb82191468, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb82191469 = dp5Var34.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191469, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191469, new java.lang.String[]{"默认", "打开", "关闭"});
                        m75941xfb82191467.add(dp5Var34);
                        java.util.LinkedList m75941xfb82191470 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var35 = new r45.dp5();
                        dp5Var35.set(0, "RepairerConfig_Media_CaptureCropCameraTexture_Int");
                        dp5Var35.set(1, "拍摄视频直接裁剪camera纹理");
                        dp5Var35.set(2, 3);
                        java.util.LinkedList m75941xfb82191471 = dp5Var35.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191471, "getValues(...)");
                        kz5.h0.w(m75941xfb82191471, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb82191472 = dp5Var35.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191472, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191472, new java.lang.String[]{"默认", "打开", "关闭"});
                        m75941xfb82191470.add(dp5Var35);
                        java.util.LinkedList m75941xfb82191473 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var36 = new r45.dp5();
                        dp5Var36.set(0, "RepairerConfig_Media_CleanFile_Int");
                        dp5Var36.set(1, "视频缓存文件清理时间周期");
                        dp5Var36.set(2, 3);
                        java.util.LinkedList m75941xfb82191474 = dp5Var36.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191474, "getValues(...)");
                        kz5.h0.w(m75941xfb82191474, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList m75941xfb82191475 = dp5Var36.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191475, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191475, new java.lang.String[]{"默认14天", "每次都检查"});
                        m75941xfb82191473.add(dp5Var36);
                        java.util.LinkedList m75941xfb82191476 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var37 = new r45.dp5();
                        dp5Var37.set(0, "RepairerConfig_Media_AppbrandUseMMrecord_Int");
                        dp5Var37.set(1, "小程序使用新拍摄器");
                        dp5Var37.set(2, 3);
                        java.util.LinkedList m75941xfb82191477 = dp5Var37.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191477, "getValues(...)");
                        kz5.h0.w(m75941xfb82191477, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList m75941xfb82191478 = dp5Var37.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191478, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191478, new java.lang.String[]{"否", "是"});
                        m75941xfb82191476.add(dp5Var37);
                        java.util.LinkedList m75941xfb82191479 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var38 = new r45.dp5();
                        dp5Var38.set(0, "RepairerConfig_Media_C2CRecordUseVideoComposition_Int");
                        dp5Var38.set(1, "c2c拍摄视频使用VideoComposition");
                        dp5Var38.set(2, 3);
                        java.util.LinkedList m75941xfb82191480 = dp5Var38.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191480, "getValues(...)");
                        kz5.h0.w(m75941xfb82191480, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb82191481 = dp5Var38.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191481, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191481, new java.lang.String[]{"默认", "关闭", "打开"});
                        m75941xfb82191479.add(dp5Var38);
                        java.util.LinkedList m75941xfb82191482 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var39 = new r45.dp5();
                        dp5Var39.set(0, "RepairerConfig_Media_SnsRecordUseVideoComposition_Int");
                        dp5Var39.set(1, "sns拍摄视频使用VideoComposition");
                        dp5Var39.set(2, 3);
                        java.util.LinkedList m75941xfb82191483 = dp5Var39.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191483, "getValues(...)");
                        kz5.h0.w(m75941xfb82191483, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb82191484 = dp5Var39.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191484, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191484, new java.lang.String[]{"默认", "打开", "关闭"});
                        m75941xfb82191482.add(dp5Var39);
                        java.util.LinkedList m75941xfb82191485 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var40 = new r45.dp5();
                        dp5Var40.set(0, "RepairerConfig_Media_SnsAlbumUseVideoComposition_Int");
                        dp5Var40.set(1, "sns相册选择视频编辑使用VideoComposition");
                        dp5Var40.set(2, 3);
                        java.util.LinkedList m75941xfb82191486 = dp5Var40.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191486, "getValues(...)");
                        kz5.h0.w(m75941xfb82191486, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb82191487 = dp5Var40.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191487, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191487, new java.lang.String[]{"默认", "打开", "关闭"});
                        m75941xfb82191485.add(dp5Var40);
                        java.util.LinkedList m75941xfb82191488 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var41 = new r45.dp5();
                        dp5Var41.set(0, "RepairerConfig_Media_SnsRecordBackgroundRemux_Int");
                        dp5Var41.set(1, "sns拍摄视频使用后台合成");
                        dp5Var41.set(2, 3);
                        java.util.LinkedList m75941xfb82191489 = dp5Var41.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191489, "getValues(...)");
                        kz5.h0.w(m75941xfb82191489, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb82191490 = dp5Var41.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191490, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191490, new java.lang.String[]{"默认", "打开", "关闭"});
                        m75941xfb82191488.add(dp5Var41);
                        java.util.LinkedList m75941xfb82191491 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var42 = new r45.dp5();
                        dp5Var42.set(0, "RepairerConfig_Media_SnsAlbumBackgroundRemux_Int");
                        dp5Var42.set(1, "sns相册选择视频使用后台合成");
                        dp5Var42.set(2, 3);
                        java.util.LinkedList m75941xfb82191492 = dp5Var42.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191492, "getValues(...)");
                        kz5.h0.w(m75941xfb82191492, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb82191493 = dp5Var42.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191493, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191493, new java.lang.String[]{"默认", "打开", "关闭"});
                        m75941xfb82191491.add(dp5Var42);
                        java.util.LinkedList m75941xfb82191494 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var43 = new r45.dp5();
                        dp5Var43.set(0, "RepairerConfig_Media_SnsBackgroundRemuxError_Int");
                        dp5Var43.set(1, "sns后台合成hardcode失败");
                        dp5Var43.set(2, 3);
                        java.util.LinkedList m75941xfb82191495 = dp5Var43.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191495, "getValues(...)");
                        kz5.h0.w(m75941xfb82191495, new java.lang.String[]{"0", "1"});
                        java.util.LinkedList m75941xfb82191496 = dp5Var43.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191496, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191496, new java.lang.String[]{"关闭", "打开"});
                        m75941xfb82191494.add(dp5Var43);
                        java.util.LinkedList m75941xfb82191497 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var44 = new r45.dp5();
                        dp5Var44.set(0, "RepairerConfig_Media_SNSVC_Int");
                        dp5Var44.set(1, "朋友圈使用composition编辑");
                        dp5Var44.set(2, 3);
                        java.util.LinkedList m75941xfb82191498 = dp5Var44.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191498, "getValues(...)");
                        kz5.h0.w(m75941xfb82191498, new java.lang.String[]{"-1", "0", "1"});
                        java.util.LinkedList m75941xfb82191499 = dp5Var44.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb82191499, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb82191499, new java.lang.String[]{"默认", "否", "是"});
                        m75941xfb82191497.add(dp5Var44);
                        java.util.LinkedList m75941xfb821914100 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var45 = new r45.dp5();
                        dp5Var45.set(0, "RepairerConfig_Media_C2CVideoReTransmitUseLink_Int");
                        dp5Var45.set(1, "聊天视频主动转发使用link");
                        dp5Var45.set(2, 3);
                        java.util.LinkedList m75941xfb821914101 = dp5Var45.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914101, "getValues(...)");
                        kz5.h0.w(m75941xfb821914101, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb821914102 = dp5Var45.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914102, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb821914102, new java.lang.String[]{"默认", "打开", "关闭"});
                        m75941xfb821914100.add(dp5Var45);
                        java.util.LinkedList m75941xfb821914103 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var46 = new r45.dp5();
                        dp5Var46.set(0, "RepairerConfig_Media_VideoSoftEncodeFixedResolution_Int");
                        dp5Var46.set(1, "composition编辑软编导出对齐9:16");
                        dp5Var46.set(2, 3);
                        java.util.LinkedList m75941xfb821914104 = dp5Var46.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914104, "getValues(...)");
                        kz5.h0.w(m75941xfb821914104, new java.lang.String[]{"0", "2", "4", "6", "8", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0, "-1"});
                        java.util.LinkedList m75941xfb821914105 = dp5Var46.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914105, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb821914105, new java.lang.String[]{"默认", "2", "4", "6", "8", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0, "关闭"});
                        m75941xfb821914103.add(dp5Var46);
                        java.util.LinkedList m75941xfb821914106 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var47 = new r45.dp5();
                        dp5Var47.set(0, "RepairerConfig_Media_VideoEncodeForceSoftOrHard_Int");
                        dp5Var47.set(1, "composition视频编辑强制使用软/硬编");
                        dp5Var47.set(2, 3);
                        java.util.LinkedList m75941xfb821914107 = dp5Var47.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914107, "getValues(...)");
                        kz5.h0.w(m75941xfb821914107, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb821914108 = dp5Var47.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914108, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb821914108, new java.lang.String[]{"默认", "软编", "硬编"});
                        m75941xfb821914106.add(dp5Var47);
                        java.util.LinkedList m75941xfb821914109 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var48 = new r45.dp5();
                        dp5Var48.set(0, "RepairerConfig_Media_MediaAudioUseMaasClassifier_Int");
                        dp5Var48.set(1, "编辑器音乐面板推荐列表使用Maas");
                        dp5Var48.set(2, 3);
                        java.util.LinkedList m75941xfb821914110 = dp5Var48.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914110, "getValues(...)");
                        kz5.h0.w(m75941xfb821914110, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb821914111 = dp5Var48.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914111, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb821914111, new java.lang.String[]{"X实验", "开启", "关闭"});
                        m75941xfb821914109.add(dp5Var48);
                        java.util.LinkedList m75941xfb821914112 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var49 = new r45.dp5();
                        dp5Var49.set(0, "RepairerConfig_Media_PhotoImproveEdit_Int");
                        dp5Var49.set(1, "图片编辑器升级入口");
                        dp5Var49.set(2, 3);
                        java.util.LinkedList m75941xfb821914113 = dp5Var49.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914113, "getValues(...)");
                        kz5.h0.w(m75941xfb821914113, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb821914114 = dp5Var49.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914114, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb821914114, new java.lang.String[]{"X实验", "开启", "关闭"});
                        m75941xfb821914112.add(dp5Var49);
                        java.util.LinkedList m75941xfb821914115 = dp5Var6.m75941xfb821914(5);
                        r45.dp5 dp5Var50 = new r45.dp5();
                        dp5Var50.set(0, "RepairerConfig_Media_MediaAudioPanelV2UI_Int");
                        dp5Var50.set(1, "视频号编辑器音乐面板V2");
                        dp5Var50.set(2, 3);
                        java.util.LinkedList m75941xfb821914116 = dp5Var50.m75941xfb821914(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914116, "getValues(...)");
                        kz5.h0.w(m75941xfb821914116, new java.lang.String[]{"0", "1", "2"});
                        java.util.LinkedList m75941xfb821914117 = dp5Var50.m75941xfb821914(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914117, "getValueAlias(...)");
                        kz5.h0.w(m75941xfb821914117, new java.lang.String[]{"X实验", "开启", "关闭"});
                        m75941xfb821914115.add(dp5Var50);
                        arrayList.add(dp5Var6);
                        arrayList.add(c20922xe427d5b3.h());
                        m75941xfb8219142.addAll(arrayList);
                        dp5Var5 = dp5Var9;
                        obj2 = newInstance;
                    } else {
                        dp5Var2 = dp5Var4;
                        y0Var = y0Var2;
                        hashMap2 = hashMap3;
                        it = it6;
                        cls = cls2;
                        obj2 = newInstance;
                        gVar = gVar2;
                        if (obj2 instanceof com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20909xe427c8e3) {
                            dp5Var5.m75941xfb821914(5).addAll(((com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20909xe427c8e3) obj2).h());
                        }
                    }
                    hashMap = hashMap2;
                    cls2 = cls;
                    hashMap.put(cls2, new jz5.l(gVar.e(), dp5Var5));
                } else {
                    dp5Var2 = dp5Var4;
                    y0Var = y0Var2;
                    hashMap = hashMap3;
                    it = it6;
                    obj2 = newInstance;
                }
                if (obj2 instanceof q55.a) {
                    r45.dp5 dp5Var51 = new r45.dp5();
                    q55.a aVar3 = (q55.a) obj2;
                    dp5Var51.set(0, aVar3.b());
                    dp5Var51.set(1, aVar3.c());
                    dp5Var51.set(2, 4);
                    dp5Var51.set(10, cls2.getName());
                    dp5Var51.set(7, 0);
                    dp5Var51.set(11, Integer.MAX_VALUE);
                    hashMap.put(cls2, new jz5.l(aVar3.e(), dp5Var51));
                }
                if (obj2 instanceof q55.c) {
                    r45.dp5 dp5Var52 = new r45.dp5();
                    q55.c cVar = (q55.c) obj2;
                    dp5Var52.set(0, cVar.b());
                    dp5Var52.set(1, cVar.c());
                    dp5Var52.set(2, 2);
                    dp5Var52.m75941xfb821914(3).add(cVar.h());
                    dp5Var52.m75941xfb821914(3).add(java.lang.String.valueOf(cVar.i()));
                    dp5Var52.set(7, java.lang.Integer.valueOf(cVar.g()));
                    dp5Var52.set(11, Integer.MAX_VALUE);
                    hashMap.put(cls2, new jz5.l(cVar.e(), dp5Var52));
                }
                if (obj2 instanceof q55.e) {
                    r45.dp5 dp5Var53 = new r45.dp5();
                    q55.e eVar = (q55.e) obj2;
                    dp5Var53.set(0, eVar.l());
                    dp5Var53.set(1, eVar.c());
                    dp5Var53.set(2, 3);
                    dp5Var53.set(7, java.lang.Integer.valueOf(eVar.g()));
                    dp5Var53.set(11, java.lang.Integer.valueOf(eVar.d()));
                    dp5Var53.set(4, java.lang.Integer.valueOf(eVar.m()));
                    dp5Var53.set(12, eVar.f());
                    if (obj2 instanceof q55.d) {
                        q55.d dVar = (q55.d) obj2;
                        dp5Var53.m75941xfb821914(3).addAll(dVar.o());
                        dp5Var53.m75941xfb821914(6).addAll(dVar.n());
                    }
                    java.lang.String h17 = eVar.h();
                    switch (h17.hashCode()) {
                        case -1808118735:
                            if (h17.equals("String") && !(eVar.i() instanceof java.lang.String)) {
                                break;
                            }
                            break;
                        case 73679:
                            if (h17.equals("Int") && !(eVar.i() instanceof java.lang.Integer)) {
                                break;
                            }
                            break;
                        case 2374300:
                            if (h17.equals("Long") && !(eVar.i() instanceof java.lang.Long)) {
                                break;
                            }
                            break;
                        case 67973692:
                            if (h17.equals("Float") && !(eVar.i() instanceof java.lang.Float)) {
                                break;
                            }
                            break;
                    }
                    dp5Var53.set(8, eVar.i().toString());
                    hashMap.put(cls2, new jz5.l(eVar.e(), dp5Var53));
                    java.util.HashMap hashMap4 = ix3.y0.f377145e;
                    java.lang.String m75945x2fec8307 = dp5Var53.m75945x2fec8307(0);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    hashMap4.put(m75945x2fec8307, obj2);
                }
                hashMap3 = hashMap;
                it6 = it;
                y0Var2 = y0Var;
                dp5Var4 = dp5Var2;
                i17 = 1;
            }
            r45.dp5 dp5Var54 = dp5Var4;
            ix3.y0 y0Var3 = y0Var2;
            java.util.HashMap hashMap5 = hashMap3;
            for (java.util.Map.Entry entry : hashMap5.entrySet()) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getKey(), com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20891xa0cff4de.class) && (lVar = (jz5.l) hashMap5.get((java.lang.Class) ((jz5.l) entry.getValue()).f384366d)) != null && (dp5Var = (r45.dp5) lVar.f384367e) != null && (m75941xfb821914 = dp5Var.m75941xfb821914(5)) != null) {
                    m75941xfb821914.add(((jz5.l) entry.getValue()).f384367e);
                }
            }
            dp5Var3 = dp5Var54;
            java.util.LinkedList m75941xfb821914118 = dp5Var3.m75941xfb821914(5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914118, "getSubItemList(...)");
            y0Var2 = y0Var3;
            y0Var2.V6(m75941xfb821914118);
        }
        java.lang.String T6 = y0Var2.T6(dp5Var3);
        if ((!r26.n0.N(T6)) && (O6 = y0Var2.O6()) != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(O6, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new ix3.u0(y0Var2, T6, null), 2, null);
        }
        if (!gm0.j1.a()) {
            y0Var2.U6(dp5Var3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = y0Var2.P6();
        if (P6 != null && (m67437x4bd5310 = P6.m67437x4bd5310()) != null) {
            m67437x4bd5310.B3(new hx3.a(dp5Var3));
        }
        return jz5.f0.f384359a;
    }
}
