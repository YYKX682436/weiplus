package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/ImproveShieldCameraKitPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout;", "", "visible", "Ljz5/f0;", "setPluginViewVisible", "setPluginVisibility", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveShieldCameraKitPluginLayout */
/* loaded from: classes10.dex */
public final class C17019x139faded extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17019x139faded(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e
    public java.lang.Object C(jz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int i17 = ju3.z0.f383576a[((bs0.g) lVar.f384366d).ordinal()];
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 != 1) {
            java.lang.Object C = super.C(lVar, interfaceC29045xdcb5ca57);
            return C == pz5.a.f440719d ? C : f0Var;
        }
        android.os.Bundle bundle = (android.os.Bundle) lVar.f384367e;
        boolean z17 = bundle != null ? bundle.getBoolean("camera_boolean") : false;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new ju3.a1(this, z17, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : f0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e
    public void F() {
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = getConfigProvider();
        int i17 = -1;
        int i18 = configProvider != null ? configProvider.F : -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider2 = getConfigProvider();
        int i19 = (configProvider2 == null || (bundle3 = configProvider2.M) == null) ? -1 : bundle3.getInt("key_sub_scene", -1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider3 = getConfigProvider();
        boolean z17 = ((configProvider3 == null || (bundle2 = configProvider3.M) == null) ? 2 : bundle2.getInt("key_camera_select", 2)) == 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider4 = getConfigProvider();
        if (configProvider4 != null && (bundle = configProvider4.M) != null) {
            i17 = bundle.getInt("key_camera_instance", -1);
        }
        int i27 = i17;
        bs0.j cameraUsage = getCameraUsage();
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        cameraUsage.f0(context, new xr0.h(new xr0.i(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)), new xr0.c(i27, 0, 0, null, null, z17, 30, null), new xr0.g(i18, i19), new xr0.b(false, false, false, false, false, 24, null)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6
    public void J() {
        m67975xd72b7a67().add(getHintPlugin());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17023x788598b, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void m(it3.y navigator, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigator, "navigator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.g7z)).setVisibility(4);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        super.mo10988x3b13c504();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6355x3a30521 c6355x3a30521 = nu3.f.f421744b;
        if (c6355x3a30521 == null) {
            return;
        }
        c6355x3a30521.f137058u = 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6
    /* renamed from: setPluginViewVisible */
    public void mo68019x34e55898(int i17) {
        getClosePlugin().mo9067x901b6914(i17);
        getCameraSwitchPlugin().mo9067x901b6914(i17);
        yt3.b recordPlugin = getRecordPlugin();
        if (recordPlugin != null) {
            recordPlugin.mo9067x901b6914(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6
    /* renamed from: setPluginVisibility */
    public void mo68020x21f58727(int i17) {
        if (i17 == 0) {
            android.view.View m68011x76530f60 = m68011x76530f60();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m68011x76530f60, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveShieldCameraKitPluginLayout", "setPluginVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m68011x76530f60.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m68011x76530f60, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveShieldCameraKitPluginLayout", "setPluginVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
