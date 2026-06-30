package si0;

/* loaded from: classes4.dex */
public final class v0 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24864xad0d9fab {

    /* renamed from: d, reason: collision with root package name */
    public si0.s1 f489737d;

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24864xad0d9fab.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24864xad0d9fab.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24864xad0d9fab.Companion.m92065x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24864xad0d9fab.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24864xad0d9fab.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24864xad0d9fab.Companion.m92065x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f489737d = null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24864xad0d9fab
    /* renamed from: onSelectSnsVisibilityCallback */
    public void mo92063x33b93814(byte[] bArr) {
        si0.s1 s1Var;
        java.util.ArrayList arrayList;
        if (bArr == null || (s1Var = this.f489737d) == null) {
            return;
        }
        bw5.nk0 mo11468x92b714fd = new bw5.nk0().mo11468x92b714fd(bArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo11468x92b714fd, "parseFrom(...)");
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17977xba306441.F;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17977xba306441 c17977xba306441 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17979x5633401) s1Var).f247937a;
        c17977xba306441.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$init$0", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        c17977xba306441.A = mo11468x92b714fd;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y0 y0Var = c17977xba306441.E;
        if (y0Var != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.f249050x1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd activityC18133x39856dcd = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18136xce452ef6) y0Var).f249079a;
            activityC18133x39856dcd.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$setRangeWidgetRangeChangeCallback$2", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            cj0.a aVar = cj0.a.f123386a;
            aVar.l("MicroMsg.SnsUploadUI", mo11468x92b714fd);
            bw5.qk0 type = mo11468x92b714fd.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
            int ordinal = type.ordinal();
            int i18 = 1;
            if (ordinal == 1) {
                i18 = 0;
            } else if (ordinal != 2) {
                i18 = 3;
                if (ordinal == 3) {
                    i18 = 2;
                }
            }
            activityC18133x39856dcd.getIntent().putExtra("Ktag_range_index", i18);
            activityC18133x39856dcd.getIntent().putStringArrayListExtra("label_id", activityC18133x39856dcd.f249076z);
            activityC18133x39856dcd.getIntent().putExtra("Kother_user_name_list", activityC18133x39856dcd.f249072x);
            activityC18133x39856dcd.getIntent().putExtra("Klabel_name_list", activityC18133x39856dcd.f249070v);
            android.content.Intent intent = activityC18133x39856dcd.getIntent();
            bw5.qk0 b17 = mo11468x92b714fd.b();
            bw5.qk0 qk0Var = bw5.qk0.SNS_VISIBILITY_VISIBLE;
            intent.putStringArrayListExtra("label_id", b17 == qk0Var ? aVar.h(mo11468x92b714fd) : aVar.c(mo11468x92b714fd));
            activityC18133x39856dcd.getIntent().putStringArrayListExtra("KExclude_label_list", mo11468x92b714fd.b() == qk0Var ? aVar.c(mo11468x92b714fd) : aVar.h(mo11468x92b714fd));
            if (mo11468x92b714fd.b() == qk0Var) {
                arrayList = new java.util.ArrayList();
                java.util.Iterator it = mo11468x92b714fd.f112245e.iterator();
                while (it.hasNext()) {
                    bw5.pk0 pk0Var = (bw5.pk0) it.next();
                    arrayList.add(pk0Var.f113244g[2] ? pk0Var.f113242e : "");
                }
            } else {
                arrayList = new java.util.ArrayList();
                java.util.Iterator it6 = mo11468x92b714fd.f112251n.iterator();
                while (it6.hasNext()) {
                    bw5.pk0 pk0Var2 = (bw5.pk0) it6.next();
                    arrayList.add(pk0Var2.f113244g[2] ? pk0Var2.f113242e : "");
                }
            }
            activityC18133x39856dcd.getIntent().putExtra("Klabel_name_list", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ","));
            activityC18133x39856dcd.getIntent().putStringArrayListExtra("KExclude_user_list", aVar.d(mo11468x92b714fd));
            activityC18133x39856dcd.getIntent().putExtra("Kother_user_name_list", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(mo11468x92b714fd.b() == qk0Var ? aVar.f(mo11468x92b714fd) : aVar.a(mo11468x92b714fd), ","));
            activityC18133x39856dcd.getIntent().putStringArrayListExtra("KInteract_user_list", aVar.i(mo11468x92b714fd));
            activityC18133x39856dcd.o7(activityC18133x39856dcd.getIntent());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$setRangeWidgetRangeChangeCallback$2", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$init$0", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
    }
}
