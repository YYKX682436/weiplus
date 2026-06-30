package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* renamed from: com.tencent.mm.plugin.record.ui.FavRecordDetailUI */
/* loaded from: classes12.dex */
public class ActivityC16963xe302cdf1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695 {
    public static final /* synthetic */ int C = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 A;

    /* renamed from: x, reason: collision with root package name */
    public o72.r2 f236793x;

    /* renamed from: v, reason: collision with root package name */
    public long f236791v = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f236792w = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f236794y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f236795z = false;
    public final l75.q0 B = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 a7() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.c(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public java.lang.String b7() {
        java.util.LinkedList linkedList = this.f236793x.f67640x5ab01132.f452497f;
        if (linkedList.size() > 0) {
            return ((r45.gp0) linkedList.getLast()).M1;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public java.lang.String c7() {
        java.util.LinkedList linkedList = this.f236793x.f67640x5ab01132.f452497f;
        if (linkedList.size() > 0) {
            return ((r45.gp0) linkedList.getFirst()).M1;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public java.lang.String d7() {
        o72.r2 r2Var = this.f236793x;
        if (14 == r2Var.f67657x2262335f && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2Var.f67640x5ab01132.f452505q)) {
            return this.f236793x.f67640x5ab01132.f452505q;
        }
        r45.jq0 jq0Var = this.f236793x.f67640x5ab01132.f452495d;
        if (jq0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jq0Var.f459575o)) {
            return bt3.g2.v(this.f236793x.f67642xd3939c3a);
        }
        java.lang.String e17 = c01.a2.e(jq0Var.f459575o);
        if (c01.z1.r().equals(jq0Var.f459569f)) {
            java.lang.String v17 = bt3.g2.v(jq0Var.f459571h);
            if (!(v17 != null ? v17 : "").equals(jq0Var.f459571h)) {
                e17 = e17 + " - " + v17;
            }
        } else {
            java.lang.String v18 = bt3.g2.v(jq0Var.f459569f);
            if (!(v18 != null ? v18 : "").equals(jq0Var.f459569f)) {
                return e17 + " - " + v18;
            }
        }
        return e17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public void e7() {
        this.f236791v = getIntent().getLongExtra("key_detail_info_id", -1L);
        this.f236792w = getIntent().getBooleanExtra("show_share", true);
        o72.r2 a17 = bt3.z0.a(this.f236791v);
        this.f236793x = a17;
        if (a17 == null) {
            k82.c.f386420a.e(this.f236791v, 3);
            finish();
            return;
        }
        Y6(a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b();
        o72.r2 r2Var = this.f236793x;
        bVar.f236883c = r2Var;
        bVar.f236875a = r2Var.f67640x5ab01132.f452497f;
        bVar.f236876b = new bt3.g3();
        java.util.List list = bVar.f236875a;
        if (list != null) {
            if (list.size() != 0) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.f236794y = true;
                        break;
                    } else if (((r45.gp0) it.next()).X1 != 0) {
                        this.f236794y = false;
                        break;
                    }
                }
            } else {
                this.f236794y = false;
            }
        } else {
            this.f236794y = false;
        }
        super.e7();
        this.f236800n.h(bVar);
        this.A = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2(this, this.f236800n, bVar);
        java.util.List list2 = bVar.f236875a;
        if (list2 != null) {
            s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p(this, list2), "calc_fav_record_info");
        }
        this.f236800n.f236943s = this.A;
        ((l75.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).add(this.B);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f) this.f236800n).f236919x);
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.i(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public void f7(int i17, int i18, android.content.Intent intent) {
        if (4097 == i17 && -1 == i18) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            am.z9 z9Var = c5432x35bb364f.f135776g;
            z9Var.f90061a = 32;
            z9Var.f90065e = this.f236791v;
            c5432x35bb364f.e();
            if (c5432x35bb364f.f135777h.f87675i) {
                db5.e1.T(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571238e));
                return;
            }
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            am.z9 z9Var2 = c5432x35bb364f2.f135776g;
            z9Var2.f90061a = 13;
            z9Var2.f90068h = mo55332x76847179();
            z9Var2.f90071k = stringExtra;
            z9Var2.f90072l = stringExtra2;
            z9Var2.f90065e = this.f236791v;
            z9Var2.f90070j = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.o(this, Q);
            c5432x35bb364f2.e();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public void h7() {
        if (this.f236792w) {
            m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.jzq, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.n(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((l75.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).mo49775xc84af884(this.B);
        if (this.f236800n != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f) this.f236800n).f236919x);
        }
        this.f236795z = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 l2Var = this.A;
        if (l2Var != null) {
            l2Var.e();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 l2Var = this.A;
        if (l2Var != null) {
            l2Var.f236978d = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        o72.r2 a17;
        r45.bq0 bq0Var;
        boolean z17;
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b) ((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f) this.f236800n).f236941q;
        o72.r2 r2Var = bVar.f236883c;
        if (r2Var == null || (a17 = bt3.z0.a(r2Var.f67645x88be67a1)) == null || (bq0Var = a17.f67640x5ab01132) == null) {
            return;
        }
        java.util.LinkedList linkedList = bq0Var.f452497f;
        java.util.Iterator it = bVar.f236875a.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (!linkedList.contains((r45.gp0) it.next())) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b bVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b();
            bVar2.f236883c = a17;
            bVar2.f236875a = a17.f67640x5ab01132.f452497f;
            this.f236800n.h(bVar2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
