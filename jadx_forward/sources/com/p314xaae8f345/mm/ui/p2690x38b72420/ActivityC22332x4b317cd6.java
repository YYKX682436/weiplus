package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.SnsLabelContactListUI */
/* loaded from: classes4.dex */
public class ActivityC22332x4b317cd6 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f288094d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.mb f288095e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f288096f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public int f288097g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f288098h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f288099i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22332x4b317cd6.ReturnSnsObjectDetailEventListener f288100m;

    /* renamed from: com.tencent.mm.ui.contact.SnsLabelContactListUI$ReturnSnsObjectDetailEventListener */
    /* loaded from: classes4.dex */
    public class ReturnSnsObjectDetailEventListener extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5943x201a82e2> {
        public ReturnSnsObjectDetailEventListener() {
            super(com.p314xaae8f345.mm.app.a0.f134821d);
            this.f39173x3fe91575 = -1656522510;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5943x201a82e2 c5943x201a82e2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5943x201a82e2 c5943x201a82e22 = c5943x201a82e2;
            if (!(c5943x201a82e22 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5943x201a82e2)) {
                return false;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = c5943x201a82e22.f136244g.f87718a;
            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22332x4b317cd6 activityC22332x4b317cd6 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22332x4b317cd6.this;
            activityC22332x4b317cd6.f288099i = c19806x4c372b7;
            if (c19806x4c372b7 != null) {
                activityC22332x4b317cd6.T6();
                activityC22332x4b317cd6.mo43517x10010bd5();
            } else {
                activityC22332x4b317cd6.mo43517x10010bd5();
                db5.e1.t(activityC22332x4b317cd6, activityC22332x4b317cd6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574746jb4), "", new com.p314xaae8f345.mm.ui.p2690x38b72420.nb(this));
            }
            return true;
        }
    }

    public final void T6() {
        int i17 = this.f288099i.f38967x15579d0d;
        if ((i17 & 1) == 0) {
            return;
        }
        int i18 = i17 & 2;
        java.util.ArrayList arrayList = this.f288096f;
        if (i18 > 0) {
            this.f288098h = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574743jb1);
            java.util.Iterator<r45.du5> it = this.f288099i.f38960xc6d7bd1d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f454289d);
            }
            return;
        }
        if ((i17 & 4) > 0) {
            this.f288098h = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574744jb2);
            java.util.Iterator<r45.du5> it6 = this.f288099i.f38975x1f0e1eca.iterator();
            while (it6.hasNext()) {
                arrayList.add(it6.next().f454289d);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569518db;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(this.f288098h);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.imk);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/contact/SnsLabelContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/contact/SnsLabelContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f288094d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f564268mf);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565755df4)).setVisibility(8);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f564281mx);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/contact/SnsLabelContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/ui/contact/SnsLabelContactListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f288094d.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        ((android.view.View) this.f288094d.getParent()).setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2690x38b72420.kb(this));
        mo74408xb0dfae51(false);
        java.util.ArrayList arrayList3 = this.f288096f;
        if (arrayList3 == null || arrayList3.size() == 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.mb mbVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.mb(this, arrayList3);
        this.f288095e = mbVar;
        this.f288094d.setAdapter((android.widget.ListAdapter) mbVar);
        this.f288094d.setVisibility(0);
        this.f288094d.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.lb(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList<r45.du5> linkedList;
        java.util.LinkedList<r45.du5> linkedList2;
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22332x4b317cd6.ReturnSnsObjectDetailEventListener returnSnsObjectDetailEventListener = new com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22332x4b317cd6.ReturnSnsObjectDetailEventListener();
        this.f288100m = returnSnsObjectDetailEventListener;
        returnSnsObjectDetailEventListener.mo48813x58998cd();
        int intExtra = getIntent().getIntExtra("sns_label_sns_info", -1);
        this.f288097g = intExtra;
        if (intExtra == -1) {
            finish();
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5618x529c81c8 c5618x529c81c8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5618x529c81c8();
        c5618x529c81c8.f135943g.f88780a = this.f288097g;
        c5618x529c81c8.e();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = c5618x529c81c8.f135944h.f88880a;
        this.f288099i = c19806x4c372b7;
        if (c19806x4c372b7 != null) {
            if (c19806x4c372b7.f38967x15579d0d != 3 || (linkedList2 = c19806x4c372b7.f38960xc6d7bd1d) == null || linkedList2.size() <= 0) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = this.f288099i;
                if (c19806x4c372b72.f38967x15579d0d != 5 || (linkedList = c19806x4c372b72.f38975x1f0e1eca) == null || linkedList.size() <= 0) {
                    return;
                }
            }
            T6();
            mo43517x10010bd5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f288100m.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.ui.p2690x38b72420.mb mbVar = this.f288095e;
        if (mbVar != null) {
            mbVar.notifyDataSetChanged();
        }
    }
}
