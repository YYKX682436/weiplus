package com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/modelbiz/subscribemsg/BizSubscribeMsgSettingPagePresenter;", "Li31/a;", "<init>", "()V", "plugin-biz_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.modelbiz.subscribemsg.BizSubscribeMsgSettingPagePresenter */
/* loaded from: classes9.dex */
public final class C11117x314d89f3 extends i31.a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f152389b;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 f152391d;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Activity f152396i;

    /* renamed from: c, reason: collision with root package name */
    public final e31.k f152390c = e31.n.f328620a.a("name_biz");

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f152392e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f152393f = true;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f152394g = "";

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p965xc41bc71e.p967xc84c5534.C11163x161e898f f152395h = new com.p314xaae8f345.mm.p965xc41bc71e.p967xc84c5534.C11163x161e898f();

    /* renamed from: j, reason: collision with root package name */
    public final u01.d f152397j = new u01.d(this);

    @Override // i31.c
    public void a(java.lang.String bizUsername, i31.b l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l17, "l");
        android.app.Activity activity = this.f152396i;
        if (activity == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            throw null;
        }
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = (com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5) activity.getIntent().getParcelableExtra("key_biz_data");
        this.f152394g = bizUsername;
        if (c11158xe7d16ed5 != null) {
            com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3 = new com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3(c11158xe7d16ed5, false, 2, null);
            this.f152391d = c11162xe78737a3;
            this.f152389b = c11162xe78737a3.f153368e;
            i(c11158xe7d16ed5.f153318h);
            com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a32 = this.f152391d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11162xe78737a32);
            ((m31.j) l17).a(c11162xe78737a32);
            j(this.f152391d);
            j31.e.d(1, this.f152395h);
            return;
        }
        android.app.Activity activity2 = this.f152396i;
        if (activity2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            throw null;
        }
        if (!activity2.getIntent().getBooleanExtra("key_need_load_from_remote", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSubscribeMsgManagerUI", "getSubscribeMsgList ERROR");
            return;
        }
        e31.k kVar = this.f152390c;
        if (kVar != null) {
            ((g31.l) kVar).p(bizUsername, new u01.c(this, l17));
        }
    }

    @Override // i31.c
    public void b(boolean z17) {
        this.f152389b = z17;
    }

    @Override // i31.c
    public m31.f c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return new m31.g0(activity, new u01.a(this, activity));
    }

    @Override // i31.a
    public void d(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f152396i = activity;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p965xc41bc71e.p967xc84c5534.C11163x161e898f c11163x161e898f = this.f152395h;
        c11163x161e898f.f153374f = currentTimeMillis;
        android.content.Intent intent = activity.getIntent();
        c11163x161e898f.f153372d = intent != null ? intent.getIntExtra("key_enter_scene", 0) : 0;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3.e(android.app.Activity):void");
    }

    @Override // i31.a
    public void f(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f152393f = activity.getIntent().getBooleanExtra("key_need_update", true);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3.g(android.app.Activity):void");
    }

    public final java.util.List h(java.util.HashMap hashMap, java.util.List list) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next();
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) hashMap.get(c11159x8f55e6d3.f153336f);
                boolean z17 = false;
                if (c11159x8f55e6d32 != null && (str = c11159x8f55e6d32.f153336f) != null && str.equals(c11159x8f55e6d3.f153336f)) {
                    z17 = true;
                }
                if (!z17) {
                    arrayList.add(c11159x8f55e6d3);
                } else if (c11159x8f55e6d32.f153340m != c11159x8f55e6d3.f153340m) {
                    arrayList.add(c11159x8f55e6d3);
                }
            }
        }
        return arrayList;
    }

    public final void i(java.util.List list) {
        java.util.HashMap hashMap = this.f152392e;
        hashMap.clear();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next();
                java.lang.String templateId = c11159x8f55e6d3.f153336f;
                int i17 = c11159x8f55e6d3.f153337g;
                int i18 = c11159x8f55e6d3.f153338h;
                int i19 = c11159x8f55e6d3.f153340m;
                boolean z17 = c11159x8f55e6d3.f153341n;
                java.lang.String title = c11159x8f55e6d3.f153335e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
                java.util.ArrayList keyWordList = c11159x8f55e6d3.f153339i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyWordList, "keyWordList");
                java.lang.String sceneDesc = c11159x8f55e6d3.f153334d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneDesc, "sceneDesc");
                hashMap.put(templateId, new com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3(title, templateId, i17, i18, keyWordList, i19, z17, sceneDesc, "", false, -1, false, false, "", false, false, 0, 0, false, false, false));
            }
        }
    }

    public final void j(com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3) {
        if (c11162xe78737a3 == null) {
            return;
        }
        java.lang.String str = this.f152394g;
        com.p314xaae8f345.mm.p965xc41bc71e.p967xc84c5534.C11163x161e898f c11163x161e898f = this.f152395h;
        c11163x161e898f.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        c11163x161e898f.f153373e = str;
        c11163x161e898f.f153375g = c11162xe78737a3.f153368e;
        c11163x161e898f.f153376h = c11162xe78737a3.f153369f.size();
        for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 : c11162xe78737a3.f153369f) {
            c11163x161e898f.f153377i.add(c11159x8f55e6d3.f153336f);
            c11163x161e898f.f153378m.add(java.lang.Integer.valueOf(c11159x8f55e6d3.f153337g));
            c11163x161e898f.f153379n.add(c11159x8f55e6d3.f153335e);
            c11163x161e898f.f153380o.add(java.lang.Integer.valueOf(c11159x8f55e6d3.f153340m));
        }
    }
}
