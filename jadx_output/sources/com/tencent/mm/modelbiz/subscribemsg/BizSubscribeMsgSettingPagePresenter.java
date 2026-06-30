package com.tencent.mm.modelbiz.subscribemsg;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/modelbiz/subscribemsg/BizSubscribeMsgSettingPagePresenter;", "Li31/a;", "<init>", "()V", "plugin-biz_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class BizSubscribeMsgSettingPagePresenter extends i31.a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f70856b;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData f70858d;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Activity f70863i;

    /* renamed from: c, reason: collision with root package name */
    public final e31.k f70857c = e31.n.f247087a.a("name_biz");

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f70859e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f70860f = true;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f70861g = "";

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.msgsubscription.report.SubscribeMsgReporter$SubscribeMsgSettingReportInfo f70862h = new com.tencent.mm.msgsubscription.report.SubscribeMsgReporter$SubscribeMsgSettingReportInfo();

    /* renamed from: j, reason: collision with root package name */
    public final u01.d f70864j = new u01.d(this);

    @Override // i31.c
    public void a(java.lang.String bizUsername, i31.b l17) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(l17, "l");
        android.app.Activity activity = this.f70863i;
        if (activity == null) {
            kotlin.jvm.internal.o.o(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            throw null;
        }
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = (com.tencent.mm.msgsubscription.SubscribeMsgRequestResult) activity.getIntent().getParcelableExtra("key_biz_data");
        this.f70861g = bizUsername;
        if (subscribeMsgRequestResult != null) {
            com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = new com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData(subscribeMsgRequestResult, false, 2, null);
            this.f70858d = subscribeMsgSettingData;
            this.f70856b = subscribeMsgSettingData.f71835e;
            i(subscribeMsgRequestResult.f71785h);
            com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData2 = this.f70858d;
            kotlin.jvm.internal.o.d(subscribeMsgSettingData2);
            ((m31.j) l17).a(subscribeMsgSettingData2);
            j(this.f70858d);
            j31.e.d(1, this.f70862h);
            return;
        }
        android.app.Activity activity2 = this.f70863i;
        if (activity2 == null) {
            kotlin.jvm.internal.o.o(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            throw null;
        }
        if (!activity2.getIntent().getBooleanExtra("key_need_load_from_remote", false)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizSubscribeMsgManagerUI", "getSubscribeMsgList ERROR");
            return;
        }
        e31.k kVar = this.f70857c;
        if (kVar != null) {
            ((g31.l) kVar).p(bizUsername, new u01.c(this, l17));
        }
    }

    @Override // i31.c
    public void b(boolean z17) {
        this.f70856b = z17;
    }

    @Override // i31.c
    public m31.f c(com.tencent.mm.ui.MMActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        return new m31.g0(activity, new u01.a(this, activity));
    }

    @Override // i31.a
    public void d(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f70863i = activity;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.msgsubscription.report.SubscribeMsgReporter$SubscribeMsgSettingReportInfo subscribeMsgReporter$SubscribeMsgSettingReportInfo = this.f70862h;
        subscribeMsgReporter$SubscribeMsgSettingReportInfo.f71841f = currentTimeMillis;
        android.content.Intent intent = activity.getIntent();
        subscribeMsgReporter$SubscribeMsgSettingReportInfo.f71839d = intent != null ? intent.getIntExtra("key_enter_scene", 0) : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    @Override // i31.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.app.Activity r11) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter.e(android.app.Activity):void");
    }

    @Override // i31.a
    public void f(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f70860f = activity.getIntent().getBooleanExtra("key_need_update", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // i31.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(android.app.Activity r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter.g(android.app.Activity):void");
    }

    public final java.util.List h(java.util.HashMap hashMap, java.util.List list) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next();
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) hashMap.get(subscribeMsgTmpItem.f71803f);
                boolean z17 = false;
                if (subscribeMsgTmpItem2 != null && (str = subscribeMsgTmpItem2.f71803f) != null && str.equals(subscribeMsgTmpItem.f71803f)) {
                    z17 = true;
                }
                if (!z17) {
                    arrayList.add(subscribeMsgTmpItem);
                } else if (subscribeMsgTmpItem2.f71807m != subscribeMsgTmpItem.f71807m) {
                    arrayList.add(subscribeMsgTmpItem);
                }
            }
        }
        return arrayList;
    }

    public final void i(java.util.List list) {
        java.util.HashMap hashMap = this.f70859e;
        hashMap.clear();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next();
                java.lang.String templateId = subscribeMsgTmpItem.f71803f;
                int i17 = subscribeMsgTmpItem.f71804g;
                int i18 = subscribeMsgTmpItem.f71805h;
                int i19 = subscribeMsgTmpItem.f71807m;
                boolean z17 = subscribeMsgTmpItem.f71808n;
                java.lang.String title = subscribeMsgTmpItem.f71802e;
                kotlin.jvm.internal.o.g(title, "title");
                kotlin.jvm.internal.o.g(templateId, "templateId");
                java.util.ArrayList keyWordList = subscribeMsgTmpItem.f71806i;
                kotlin.jvm.internal.o.g(keyWordList, "keyWordList");
                java.lang.String sceneDesc = subscribeMsgTmpItem.f71801d;
                kotlin.jvm.internal.o.g(sceneDesc, "sceneDesc");
                hashMap.put(templateId, new com.tencent.mm.msgsubscription.SubscribeMsgTmpItem(title, templateId, i17, i18, keyWordList, i19, z17, sceneDesc, "", false, -1, false, false, "", false, false, 0, 0, false, false, false));
            }
        }
    }

    public final void j(com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData) {
        if (subscribeMsgSettingData == null) {
            return;
        }
        java.lang.String str = this.f70861g;
        com.tencent.mm.msgsubscription.report.SubscribeMsgReporter$SubscribeMsgSettingReportInfo subscribeMsgReporter$SubscribeMsgSettingReportInfo = this.f70862h;
        subscribeMsgReporter$SubscribeMsgSettingReportInfo.getClass();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        subscribeMsgReporter$SubscribeMsgSettingReportInfo.f71840e = str;
        subscribeMsgReporter$SubscribeMsgSettingReportInfo.f71842g = subscribeMsgSettingData.f71835e;
        subscribeMsgReporter$SubscribeMsgSettingReportInfo.f71843h = subscribeMsgSettingData.f71836f.size();
        for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem : subscribeMsgSettingData.f71836f) {
            subscribeMsgReporter$SubscribeMsgSettingReportInfo.f71844i.add(subscribeMsgTmpItem.f71803f);
            subscribeMsgReporter$SubscribeMsgSettingReportInfo.f71845m.add(java.lang.Integer.valueOf(subscribeMsgTmpItem.f71804g));
            subscribeMsgReporter$SubscribeMsgSettingReportInfo.f71846n.add(subscribeMsgTmpItem.f71802e);
            subscribeMsgReporter$SubscribeMsgSettingReportInfo.f71847o.add(java.lang.Integer.valueOf(subscribeMsgTmpItem.f71807m));
        }
    }
}
