package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/privacy_permission/SettingActivityItemPersonalAd;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission.SettingActivityItemPersonalAd */
/* loaded from: classes4.dex */
public final class C17650xd16dc135 extends s24.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17650xd16dc135(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        if (r26.n0.B(r1, r2, false) != false) goto L9;
     */
    @Override // s24.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G7(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.String r0 = "intent"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            super.G7(r8, r9)
            gm0.m r0 = gm0.j1.b()
            gm0.j r0 = r0.d()
            gm0.j r1 = gm0.j.WeiXin
            java.lang.String r2 = "getExpt(...)"
            r3 = 1
            java.lang.Class<e42.e0> r4 = e42.e0.class
            r5 = 0
            if (r0 != r1) goto L33
            i95.m r0 = i95.n0.c(r4)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r1 = e42.d0.clicfg_cn_admanage_url_android
            h62.d r0 = (h62.d) r0
            java.lang.String r4 = "https://ads.privacy.qq.com/ads/wxoptout.html?media_source=101001"
            java.lang.String r0 = r0.Zi(r1, r4, r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            goto L87
        L33:
            i95.m r0 = i95.n0.c(r4)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r1 = e42.d0.clicfg_oversea_admanage_url_android
            h62.d r0 = (h62.d) r0
            java.lang.String r6 = ""
            java.lang.String r0 = r0.Zi(r1, r6, r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            i95.m r1 = i95.n0.c(r4)
            e42.e0 r1 = (e42.e0) r1
            e42.d0 r2 = e42.d0.clicfg_oversea_admanage_close_country_android
            h62.d r1 = (h62.d) r1
            java.lang.String r1 = r1.Zi(r2, r6, r3)
            gm0.b0 r2 = gm0.j1.u()
            com.tencent.mm.storage.n3 r2 = r2.c()
            r3 = 274436(0x43004, float:3.84567E-40)
            java.lang.String r2 = r2.u(r3, r6)
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r3 != 0) goto L86
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r3 = "toLowerCase(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            java.lang.String r2 = r2.toLowerCase()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            boolean r1 = r26.n0.B(r1, r2, r5)
            if (r1 == 0) goto L87
        L86:
            r0 = r6
        L87:
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r1 != 0) goto Lae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "lang="
            r1.<init>(r2)
            java.lang.String r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(r8)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String[] r8 = new java.lang.String[]{r8}
            java.lang.String r0 = com.p314xaae8f345.mm.ui.p2740x696c9db.qd.a(r0, r8)
            java.lang.String r8 = "safelyUrlConcatParam(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r8)
        Lae:
            java.lang.String r8 = "showShare"
            r9.putExtra(r8, r5)
            java.lang.String r8 = "rawUrl"
            r9.putExtra(r8, r0)
            java.lang.String r8 = "show_feedback"
            r9.putExtra(r8, r5)
            java.lang.String r8 = "show_bottom"
            r9.putExtra(r8, r5)
            java.lang.String r8 = "needRedirect"
            r9.putExtra(r8, r5)
            java.lang.String r8 = "neverGetA8Key"
            r9.putExtra(r8, r5)
            com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct r8 = new com.tencent.mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct
            r8.<init>()
            r0 = 54
            r8.f143055d = r0
            r8.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6.C17650xd16dc135.G7(android.content.Context, android.content.Intent):void");
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.tools.WebViewUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "webview";
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        return 0;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_PrivacyPermission_PersonalAd";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17528x9ac1c108.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6.C17649xf0d66dda.class);
    }

    @Override // s24.a, s24.f, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.f574610ix1;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17528x9ac1c108.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF243505p() {
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (r26.n0.B(r1, r2, false) != false) goto L9;
     */
    @Override // a24.i
    /* renamed from: q7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean getF243481p() {
        /*
            r7 = this;
            gm0.m r0 = gm0.j1.b()
            gm0.j r0 = r0.d()
            gm0.j r1 = gm0.j.WeiXin
            java.lang.String r2 = "getExpt(...)"
            java.lang.Class<e42.e0> r3 = e42.e0.class
            r4 = 0
            r5 = 1
            if (r0 != r1) goto L26
            i95.m r0 = i95.n0.c(r3)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r1 = e42.d0.clicfg_cn_admanage_url_android
            h62.d r0 = (h62.d) r0
            java.lang.String r3 = "https://ads.privacy.qq.com/ads/wxoptout.html?media_source=101001"
            java.lang.String r0 = r0.Zi(r1, r3, r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            goto L7a
        L26:
            i95.m r0 = i95.n0.c(r3)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r1 = e42.d0.clicfg_oversea_admanage_url_android
            h62.d r0 = (h62.d) r0
            java.lang.String r6 = ""
            java.lang.String r0 = r0.Zi(r1, r6, r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            i95.m r1 = i95.n0.c(r3)
            e42.e0 r1 = (e42.e0) r1
            e42.d0 r2 = e42.d0.clicfg_oversea_admanage_close_country_android
            h62.d r1 = (h62.d) r1
            java.lang.String r1 = r1.Zi(r2, r6, r5)
            gm0.b0 r2 = gm0.j1.u()
            com.tencent.mm.storage.n3 r2 = r2.c()
            r3 = 274436(0x43004, float:3.84567E-40)
            java.lang.String r2 = r2.u(r3, r6)
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r3 != 0) goto L79
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r3 = "toLowerCase(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            java.lang.String r2 = r2.toLowerCase()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            boolean r1 = r26.n0.B(r1, r2, r4)
            if (r1 == 0) goto L7a
        L79:
            r0 = r6
        L7a:
            int r1 = r0.length()
            if (r1 != 0) goto L82
            r1 = r5
            goto L83
        L82:
            r1 = r4
        L83:
            if (r1 != 0) goto L8e
            java.lang.String r1 = "http"
            boolean r0 = r26.i0.y(r0, r1, r4)
            if (r0 == 0) goto L8e
            r4 = r5
        L8e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6.C17650xd16dc135.getF243481p():boolean");
    }
}
