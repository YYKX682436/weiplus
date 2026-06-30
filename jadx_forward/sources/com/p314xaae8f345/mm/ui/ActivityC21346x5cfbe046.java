package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI */
/* loaded from: classes9.dex */
public class ActivityC21346x5cfbe046 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f278112m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f278113d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.f1 f278114e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f278115f;

    /* renamed from: g, reason: collision with root package name */
    public android.database.DataSetObserver f278116g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f278117h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f278118i = new com.p314xaae8f345.mm.ui.ActivityC21346x5cfbe046.AnonymousClass1(com.p314xaae8f345.mm.app.a0.f134821d);

    /* renamed from: com.tencent.mm.ui.AppBrandNotifySettingsUI$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5165x4ba90390> {
        public AnonymousClass1(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = -1390647424;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5165x4ba90390 c5165x4ba90390) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5165x4ba90390 c5165x4ba903902 = c5165x4ba90390;
            com.p314xaae8f345.mm.ui.ActivityC21346x5cfbe046 activityC21346x5cfbe046 = com.p314xaae8f345.mm.ui.ActivityC21346x5cfbe046.this;
            if (activityC21346x5cfbe046.f278114e == null) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNotifySettingsUI", "change notify preferent status by event");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6 f6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class);
            for (int i17 = 0; i17 < activityC21346x5cfbe046.f278114e.getCount(); i17++) {
                com.p314xaae8f345.mm.ui.a1 a1Var = (com.p314xaae8f345.mm.ui.a1) activityC21346x5cfbe046.f278114e.f289941e.get(i17);
                if (a1Var != null) {
                    k91.v5 Bi = ((k91.g4) f6Var).Bi(a1Var.f278645a);
                    if (Bi == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandNotifySettingsUI", "can't find local record, username:%s", a1Var.f278645a);
                    } else {
                        java.lang.String str = Bi.f68904x28d45f97;
                        if (str == null) {
                            str = "";
                        }
                        if (str.equals(c5165x4ba903902.f135515g.f89682a)) {
                            a1Var.f278648d = c5165x4ba903902.f135515g.f89683b;
                        }
                    }
                }
            }
            activityC21346x5cfbe046.runOnUiThread(new com.p314xaae8f345.mm.ui.s0(this));
            return true;
        }
    }

    public static void T6(com.p314xaae8f345.mm.ui.ActivityC21346x5cfbe046 activityC21346x5cfbe046, java.util.LinkedList linkedList) {
        activityC21346x5cfbe046.getClass();
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNotifySettingsUI", "saveNotifyMessageResult, configList is null or empty");
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.le7 le7Var = (r45.le7) it.next();
            if (le7Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandNotifySettingsUI", "scene end, item is null");
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6187xa3de110b c6187xa3de110b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6187xa3de110b();
                java.lang.String str = le7Var.f460931d;
                am.rz rzVar = c6187xa3de110b.f136445g;
                rzVar.f89386a = str;
                rzVar.f89387b = le7Var.f460932e == 0;
                c6187xa3de110b.e();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569676ic;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f278117h = intent.getStringExtra("report_session_id");
        java.lang.String stringExtra = intent.getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572381b11);
        } else {
            mo54450xbf7c1df6(stringExtra);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.t0(this));
        this.f278113d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.i3y);
        com.p314xaae8f345.mm.ui.f1 f1Var = new com.p314xaae8f345.mm.ui.f1(getLayoutInflater());
        this.f278114e = f1Var;
        this.f278113d.setAdapter((android.widget.ListAdapter) f1Var);
        this.f278115f = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.u0(this));
        com.p314xaae8f345.mm.ui.v0 v0Var = new com.p314xaae8f345.mm.ui.v0(this);
        this.f278116g = v0Var;
        this.f278114e.registerDataSetObserver(v0Var);
        gm0.j1.b().h();
        ((k01.a) ((k01.n0) i95.n0.c(k01.n0.class))).getClass();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ys3();
        lVar.f152198b = new r45.zs3();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp/getwxamsgconfig";
        lVar.f152200d = 357;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.z2.e(lVar.a(), new com.p314xaae8f345.mm.ui.y0(this), true, this);
        this.f278118i.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6 f6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f278114e.f289942f;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.a1 a1Var = (com.p314xaae8f345.mm.ui.a1) it.next();
                r45.le7 le7Var = new r45.le7();
                k91.v5 Bi = ((k91.g4) f6Var).Bi(a1Var.f278645a);
                if (Bi == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNotifySettingsUI", "get attribute fail, username: %s", a1Var.f278645a);
                } else {
                    java.lang.String str = Bi.f68904x28d45f97;
                    boolean z17 = a1Var.f278648d;
                    le7Var.f460931d = str;
                    le7Var.f460932e = z17 ? 1 : 0;
                    linkedList.add(le7Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19724, 1, 5, 0, 0, 0, null, 0, 0, 0, str, null, null, null, 0, null, null, 0, null, null, this.f278117h);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            r45.h36 h36Var = new r45.h36();
            h36Var.f457341d = linkedList;
            h36Var.f457342e = 1;
            com.p314xaae8f345.mm.p944x882e457a.z2.d(((k01.a) ((k01.n0) i95.n0.c(k01.n0.class))).wi(h36Var), new com.p314xaae8f345.mm.ui.w0(this, linkedList), true);
        }
        this.f278114e.unregisterDataSetObserver(this.f278116g);
        this.f278118i.mo48814x2efc64();
        super.onDestroy();
    }
}
