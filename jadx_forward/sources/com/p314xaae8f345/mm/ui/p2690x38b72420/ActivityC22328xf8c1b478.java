package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.SelectContactsFromRangeUI */
/* loaded from: classes10.dex */
public class ActivityC22328xf8c1b478 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public com.p314xaae8f345.mm.ui.p2690x38b72420.sa C;
    public com.p314xaae8f345.mm.ui.p2690x38b72420.ta D;
    public int E;
    public java.lang.String F;
    public java.lang.String[] G;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.p2470x93e71c27.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            this.C.t(str);
            if (((java.util.LinkedList) this.C.f288715r).size() > 0) {
                mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1) + "(" + ((java.util.LinkedList) this.C.f288715r).size() + ")");
                m78500x43e00957(1, true);
            } else {
                mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
                m78500x43e00957(1, false);
            }
            if (b7() instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.ta) {
                Y6();
                mo48674x36654fab();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        return this.C;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return this.D;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        return getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571467fx);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    /* renamed from: getActivity */
    public android.app.Activity mo8774x19263085() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        int headerViewsCount = i17 - this.f287979d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactsFromRangeUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = b7().getItem(headerViewsCount);
        if (item == null || !(item instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            return;
        }
        if (this.E == 16 || !((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) item).B.y2()) {
            java.lang.String d17 = ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) item).B.d1();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactsFromRangeUI", "ClickUser=%s", d17);
            this.C.t(d17);
            if (((java.util.LinkedList) this.C.f288715r).size() > 0) {
                mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1) + "(" + ((java.util.LinkedList) this.C.f288715r).size() + ")");
                m78500x43e00957(1, true);
            } else {
                mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
                m78500x43e00957(1, false);
            }
            if (b7() instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.ta) {
                Y6();
                mo48674x36654fab();
            }
            this.f287983h.d(d17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        this.E = getIntent().getIntExtra("list_type", 0);
        this.F = getIntent().getStringExtra("filter_type");
        this.G = getIntent().getStringArrayExtra("already_select_contact");
        com.p314xaae8f345.mm.ui.p2690x38b72420.sa saVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.sa(this, this, getIntent().getIntExtra("max_limit_num", 30));
        this.C = saVar;
        saVar.f288611f = true;
        this.D = new com.p314xaae8f345.mm.ui.p2690x38b72420.ta(this, this, this.C);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2690x38b72420.pa(this));
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.ui.p2690x38b72420.qa(this), null, this.E == 16 ? com.p314xaae8f345.mm.ui.fb.RED : com.p314xaae8f345.mm.ui.fb.GREEN);
        m78500x43e00957(1, false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.C.k();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactsFromRangeUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.mo808xfb85f7b0());
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return (dVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) && this.E != 16 && ((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a) dVar).B.y2();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        if (!(dVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u)) {
            return false;
        }
        return ((java.util.LinkedList) this.C.f288715r).contains(((com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u) dVar).f288352z);
    }
}
