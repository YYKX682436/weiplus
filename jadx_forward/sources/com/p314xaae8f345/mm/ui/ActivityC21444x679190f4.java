package com.p314xaae8f345.mm.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/TipUseDuplicateGroupUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.TipUseDuplicateGroupUI */
/* loaded from: classes.dex */
public final class ActivityC21444x679190f4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570863el1;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6(getIntent().getStringExtra("titile"));
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.ui.oj(this), com.p314xaae8f345.mm.R.raw.f81445xd56bca2);
        final java.util.List stringArrayListExtra = getIntent().getStringArrayListExtra("list_attr");
        final java.util.List list = kz5.p0.f395529d;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = list;
        }
        java.util.List stringArrayListExtra2 = getIntent().getStringArrayListExtra("chatroommemberlist");
        if (stringArrayListExtra2 != null) {
            list = stringArrayListExtra2;
        }
        final java.lang.String stringExtra = getIntent().getStringExtra("create_group_session_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TipUseDuplicateGroupUI", "groups: " + stringArrayListExtra.size() + " memberList: " + list.size() + " sessionId: " + stringExtra);
        pm0.v.K(null, new com.p314xaae8f345.mm.ui.pj(stringArrayListExtra, list, stringExtra));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.t8u);
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this, 1, false));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(stringArrayListExtra, 10));
        int i17 = 0;
        for (java.lang.Object obj : stringArrayListExtra) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            arrayList2.add(new com.p314xaae8f345.mm.ui.hj(str, i17, stringArrayListExtra.size()));
            i17 = i18;
        }
        arrayList.addAll(arrayList2);
        c22849x81a93d25.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.ui.TipUseDuplicateGroupUI$onCreate$adapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                com.p314xaae8f345.mm.ui.nj njVar = new com.p314xaae8f345.mm.ui.nj();
                njVar.f290960e = new com.p314xaae8f345.mm.ui.uj(com.p314xaae8f345.mm.ui.ActivityC21444x679190f4.this, stringExtra, stringArrayListExtra, list);
                return njVar;
            }
        }, arrayList, false));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.t1b);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new com.p314xaae8f345.mm.ui.rj(list, arrayList, stringExtra, this));
        }
        j75.f m67437x4bd5310 = m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.L2(this, new com.p314xaae8f345.mm.ui.sj(this));
        }
    }
}
