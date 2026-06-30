package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveSelectRoomForLuckMoneyUI;", "Lcom/tencent/mm/ui/contact/MMBaseSelectContactUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveSelectRoomForLuckMoneyUI */
/* loaded from: classes10.dex */
public final class ActivityC14033xa41f223 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public static final /* synthetic */ int F = 0;
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 C;
    public final java.util.HashSet D = new java.util.HashSet();
    public int E;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(this.D).remove(str);
            b7().notifyDataSetChanged();
            x7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        bm2.o7 o7Var = new bm2.o7(this, null, true, false);
        o7Var.f288611f = true;
        return o7Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return new bm2.p7(this, null, true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public int[] d7() {
        return new int[]{131075};
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        java.lang.String string = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ecg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ayw;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a aVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        int headerViewsCount = i17 - this.f287979d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSelectRoomForLuckMoneyUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b7().getItem(headerViewsCount);
        if (item == null || !(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) || (z3Var = (aVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) item).B) == null || z3Var.F0() == 1) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = aVar.B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z3Var2);
        java.lang.String d17 = z3Var2.d1();
        if (d17 == null) {
            d17 = "";
        }
        Y6();
        java.util.HashSet hashSet = this.D;
        if (hashSet.contains(d17)) {
            hashSet.remove(d17);
            this.f287983h.d(d17);
        } else if (hashSet.size() < this.E) {
            hashSet.add(d17);
            this.f287983h.d(d17);
        }
        Y6();
        this.f287981f.notifyDataSetChanged();
        x7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        this.E = getIntent().getIntExtra("KEY_LUCKY_MONEY_CHAT_ROOM_MAX_COUNT", 0);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME");
        java.util.HashSet hashSet = this.D;
        hashSet.clear();
        if (stringArrayListExtra != null) {
            for (java.lang.String str : stringArrayListExtra) {
                if (!(str == null || str.length() == 0)) {
                    hashSet.add(str);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveSelectRoomForLuckMoneyUI", "initData maxRoomCount:" + this.E + ",selectUserSet size:" + hashSet.size());
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.eh7), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.qc(this), null, com.p314xaae8f345.mm.ui.fb.FINDER_LIVE);
        x7();
        this.C = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030) findViewById(com.p314xaae8f345.mm.R.id.cek);
        this.f287983h.e(new java.util.ArrayList(this.D));
        if (m78517x1162058e() != null) {
            mo54449x3f86539a(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ecf));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = this.C;
        if (c19642xb279030 != null) {
            c19642xb279030.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.rc(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        if (dVar == null || !dVar.d() || dVar.f288383s == null) {
            return false;
        }
        java.util.HashSet hashSet = this.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : hashSet) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0((java.lang.String) obj, dVar.f288383s)) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty();
    }

    public final void x7() {
        java.util.HashSet hashSet = this.D;
        if (hashSet == null || hashSet.isEmpty()) {
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.eh7));
        } else {
            mo60878xf6b21fea(1, mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eh8, java.lang.Integer.valueOf(hashSet.size())));
        }
    }
}
