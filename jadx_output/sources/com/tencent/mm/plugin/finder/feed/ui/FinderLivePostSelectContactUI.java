package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePostSelectContactUI;", "Lcom/tencent/mm/ui/contact/MMBaseSelectContactUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FinderLivePostSelectContactUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public static final /* synthetic */ int T = 0;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f109402J;
    public boolean K;
    public boolean Q;
    public int S;
    public final java.util.ArrayList C = new java.util.ArrayList();
    public final java.util.ArrayList D = new java.util.ArrayList();
    public final java.util.ArrayList E = new java.util.ArrayList();
    public final java.util.ArrayList F = new java.util.ArrayList();
    public final java.util.ArrayList G = new java.util.ArrayList();
    public final java.util.ArrayList H = new java.util.ArrayList();
    public final java.util.ArrayList L = new java.util.ArrayList();
    public final java.util.ArrayList M = new java.util.ArrayList();
    public final java.util.ArrayList N = new java.util.ArrayList();
    public final java.util.ArrayList P = new java.util.ArrayList();
    public final java.util.ArrayList R = new java.util.ArrayList();

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            java.util.ArrayList arrayList = this.G;
            kz5.h0.B(arrayList, new com.tencent.mm.plugin.finder.feed.ui.ub(str));
            java.util.ArrayList arrayList2 = this.E;
            kz5.h0.B(arrayList2, new com.tencent.mm.plugin.finder.feed.ui.vb(str));
            java.util.ArrayList arrayList3 = this.C;
            kz5.h0.B(arrayList3, new com.tencent.mm.plugin.finder.feed.ui.wb(str));
            b7().notifyDataSetChanged();
            x7();
            w7();
            com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "select_contact_step2-2,onSelectChange selectRoom:" + arrayList2 + ", selectUser:" + arrayList + ", selectAllContact:" + arrayList3);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.M);
        arrayList.addAll(this.N);
        return new bm2.o5(this, null, true, false, this.P, arrayList, this.Q, this.R);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return new bm2.s5(this, null, true);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        return new int[]{131075, 131072};
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        java.lang.String string = getString(com.tencent.mm.R.string.ekg);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.avs;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.contact.item.a aVar;
        com.tencent.mm.storage.z3 z3Var;
        int headerViewsCount = i17 - this.f206446d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mm.ui.contact.item.d item = b7().getItem(headerViewsCount);
        if (item == null || !(item instanceof com.tencent.mm.ui.contact.item.a) || (z3Var = (aVar = (com.tencent.mm.ui.contact.item.a) item).B) == null || z3Var.F0() == 1) {
            return;
        }
        boolean z17 = this.P.contains(item.f206850s);
        java.util.ArrayList arrayList = this.L;
        if (z17) {
            if (arrayList.contains(aVar.f206850s)) {
                db5.t7.i(this, getString(com.tencent.mm.R.string.ehb), com.tencent.mm.R.raw.icons_filled_error);
                return;
            }
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this);
            e4Var.f211776c = getString(com.tencent.mm.R.string.ouy);
            e4Var.c();
            return;
        }
        if (p5(item)) {
            if (arrayList.contains(aVar.f206850s)) {
                db5.t7.i(this, getString(com.tencent.mm.R.string.ehb), com.tencent.mm.R.raw.icons_filled_error);
                return;
            }
            return;
        }
        com.tencent.mm.storage.z3 z3Var2 = aVar.B;
        boolean R4 = com.tencent.mm.storage.z3.R4(z3Var2.d1());
        java.util.ArrayList arrayList2 = this.C;
        java.util.ArrayList arrayList3 = this.F;
        java.util.ArrayList arrayList4 = this.E;
        java.util.ArrayList arrayList5 = this.G;
        if (R4) {
            java.lang.String d17 = z3Var2.d1();
            if (d17 == null) {
                d17 = "";
            }
            z3Var2.P0();
            Y6();
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
            if (multiSelectContactView != null) {
                multiSelectContactView.d(d17);
            }
            if (arrayList4.contains(d17)) {
                arrayList4.remove(d17);
                pm0.v.b0(arrayList3, new com.tencent.mm.plugin.finder.feed.ui.xb(d17));
                com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "remove room:" + ((java.lang.Object) z3Var2.J2) + ',' + arrayList4);
            } else {
                arrayList4.add(d17);
                r45.ky5 ky5Var = new r45.ky5();
                ky5Var.set(0, d17);
                java.lang.String d18 = z3Var2.d1();
                if (!(d18 == null || d18.length() == 0)) {
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String d19 = z3Var2.d1();
                    ((sg3.a) v0Var).getClass();
                    ky5Var.set(1, c01.a2.c(z3Var2, d19));
                }
                arrayList3.add(ky5Var);
                com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "add room:" + ((java.lang.Object) z3Var2.J2) + ',' + arrayList4);
            }
            com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "before select room,selectAllContact:" + arrayList2);
            if (arrayList2.contains(d17)) {
                arrayList2.remove(d17);
            } else {
                arrayList2.add(d17);
            }
            com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "after select room,selectAllContact:" + arrayList2);
            com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "select_contact_step2-1,onSelectRoom selectRoom:" + arrayList4 + ", selectUser:" + arrayList5 + ", selectAllContact:" + arrayList2);
            x7();
        } else {
            java.lang.String d110 = z3Var2.d1();
            if (d110 == null) {
                d110 = "";
            }
            Y6();
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView2 = this.f206450h;
            if (multiSelectContactView2 != null) {
                multiSelectContactView2.d(d110);
            }
            if (arrayList5.contains(d110)) {
                arrayList5.remove(d110);
                pm0.v.b0(arrayList3, new com.tencent.mm.plugin.finder.feed.ui.ac(d110));
                com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "remove room:" + ((java.lang.Object) z3Var2.J2) + ',' + arrayList5);
            } else {
                arrayList5.add(d110);
                r45.ky5 ky5Var2 = new r45.ky5();
                ky5Var2.set(0, d110);
                java.lang.String d111 = z3Var2.d1();
                if (!(d111 == null || d111.length() == 0)) {
                    tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String d112 = z3Var2.d1();
                    ((sg3.a) v0Var2).getClass();
                    ky5Var2.set(1, c01.a2.c(z3Var2, d112));
                }
                arrayList3.add(ky5Var2);
                com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "add room:" + ((java.lang.Object) z3Var2.J2) + ',' + arrayList4);
            }
            com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "before select room,selectAllContact:" + arrayList2);
            if (arrayList2.contains(d110)) {
                arrayList2.remove(d110);
            } else {
                arrayList2.add(d110);
            }
            com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "after select user, selectAllContact:" + arrayList2);
            com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "select_contact_step2-1,onSelectRoom selectRoom:" + arrayList4 + ", selectUser:" + arrayList5 + ", selectAllContact:" + arrayList2);
            x7();
        }
        this.f206448f.notifyDataSetChanged();
        x7();
        w7();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.v2r);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.mkd);
        if (findViewById2 != null) {
            findViewById2.post(new com.tencent.mm.plugin.finder.feed.ui.rb(findViewById2, this));
        }
        if (findViewById != null) {
            findViewById.post(new com.tencent.mm.plugin.finder.feed.ui.tb(findViewById, this));
        }
        android.view.View view = this.f206456q;
        if (view != null) {
            view.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [kz5.p0] */
    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        this.I = getIntent().getIntExtra("KEY_PARAMS_MAX_USER_COUNT", 0);
        this.f109402J = getIntent().getBooleanExtra("KEY_PARAMS_WHITE_LIST_HIDE_SELECT_FROM_CONTACT_BOOK", false);
        this.K = getIntent().getBooleanExtra("KEY_PARAMS_SELECT_WHITE_LIST_DISABLE_SEARCH", false);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_PARAMS_WHITE_LIST");
        java.util.ArrayList arrayList = this.G;
        java.util.ArrayList arrayList2 = this.E;
        java.util.ArrayList arrayList3 = this.C;
        if (byteArrayExtra != null) {
            r45.re2 re2Var = new r45.re2();
            re2Var.parseFrom(byteArrayExtra);
            arrayList3.addAll(re2Var.getList(2));
            this.D.addAll(re2Var.getList(2));
            arrayList2.addAll(re2Var.getList(0));
            arrayList.addAll(re2Var.getList(1));
        }
        java.util.ArrayList arrayList4 = this.L;
        arrayList4.clear();
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_PARAMS_LUCKY_MONEY_LIST");
        ?? r37 = kz5.p0.f313996d;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = r37;
        }
        arrayList4.addAll(stringArrayListExtra);
        java.util.ArrayList arrayList5 = this.M;
        arrayList5.clear();
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("KEY_PARAMS_CHOSEN_WHITE_LIST");
        if (stringArrayListExtra2 == null) {
            stringArrayListExtra2 = r37;
        }
        arrayList5.addAll(stringArrayListExtra2);
        java.util.ArrayList arrayList6 = this.N;
        arrayList6.clear();
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = getIntent().getStringArrayListExtra("KEY_PARAMS_CHOSEN_USER_LIST");
        if (stringArrayListExtra3 == null) {
            stringArrayListExtra3 = r37;
        }
        arrayList6.addAll(stringArrayListExtra3);
        java.util.ArrayList arrayList7 = this.P;
        arrayList7.clear();
        java.util.ArrayList<java.lang.String> stringArrayListExtra4 = getIntent().getStringArrayListExtra("KEY_PARAMS_FORBID_CHOSEN_WHITE_LIST");
        if (stringArrayListExtra4 == null) {
            stringArrayListExtra4 = r37;
        }
        arrayList7.addAll(stringArrayListExtra4);
        java.util.ArrayList arrayList8 = this.R;
        arrayList8.clear();
        if (getIntent().hasExtra("KEY_PARAMS_ALLOW_SELECT_WHITE_LIST")) {
            this.Q = true;
            java.util.ArrayList<java.lang.String> stringArrayListExtra5 = getIntent().getStringArrayListExtra("KEY_PARAMS_ALLOW_SELECT_WHITE_LIST");
            java.util.ArrayList<java.lang.String> arrayList9 = r37;
            if (stringArrayListExtra5 != null) {
                arrayList9 = stringArrayListExtra5;
            }
            arrayList8.addAll(arrayList9);
        }
        com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "select_contact_step1,init selectRoom:" + arrayList2 + ", selectUser:" + arrayList + ", selectAllContact:" + arrayList3 + ", luckyMoneyAlwaysSelectList:" + kz5.n0.g0(arrayList4, ",", null, null, 0, null, null, 62, null) + ", forbidChosenContactList:" + kz5.n0.g0(arrayList7, ",", null, null, 0, null, null, 62, null) + ", useCustomContactData:" + this.Q + ", allowSelectContactList:" + kz5.n0.g0(arrayList8, ",", null, null, 0, null, null, 62, null) + ", outerChosenRoomList:" + kz5.n0.g0(arrayList5, ",", null, null, 0, null, null, 62, null) + ", outerChosenUserList:" + kz5.n0.g0(arrayList6, ",", null, null, 0, null, null, 62, null));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean k7() {
        return !this.K;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 2) {
            java.util.List O1 = com.tencent.mm.sdk.platformtools.t8.O1(intent != null ? intent.getStringExtra("Select_Contact") : null, ",");
            if (O1 != null) {
                java.util.LinkedList linkedList = new java.util.LinkedList(O1);
                com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "select user:" + linkedList);
                if (linkedList.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "select user empty, return");
                    return;
                }
                java.util.ArrayList arrayList = this.G;
                kz5.h0.B(arrayList, new com.tencent.mm.plugin.finder.feed.ui.yb(linkedList));
                arrayList.addAll(linkedList);
                com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "before select user, userList:" + linkedList);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("before select user,selectAllContact:");
                java.util.ArrayList arrayList2 = this.C;
                sb6.append(arrayList2);
                com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", sb6.toString());
                kz5.h0.B(arrayList2, new com.tencent.mm.plugin.finder.feed.ui.zb(this));
                arrayList2.addAll(arrayList);
                com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "after select user,selectAllContact:" + arrayList2);
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
                if (multiSelectContactView != null) {
                    multiSelectContactView.e(arrayList2);
                }
                com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "select_contact_step3,onSelectChange selectRoom:" + this.E + ", selectUser:" + arrayList + ", selectAllContact:" + arrayList2);
                x7();
                this.f206448f.notifyDataSetChanged();
            }
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.nwk), new com.tencent.mm.plugin.finder.feed.ui.pb(this), null, com.tencent.mm.ui.fb.FINDER_LIVE);
        x7();
        setBackBtnVisible(false);
        getController().x0(getString(com.tencent.mm.R.string.nwd), new com.tencent.mm.plugin.finder.feed.ui.qb(this));
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
        if (multiSelectContactView != null) {
            multiSelectContactView.e(this.C);
        }
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView2 = this.f206450h;
        if (multiSelectContactView2 != null) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            arrayList.addAll(this.M);
            arrayList.addAll(this.N);
            multiSelectContactView2.setForBidDelContactList(arrayList);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        return ((dVar != null && this.P.contains(dVar.f206850s)) || dVar == null || (!this.L.contains(dVar.f206850s) && !this.M.contains(dVar.f206850s) && !this.N.contains(dVar.f206850s))) ? false : true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d item) {
        kotlin.jvm.internal.o.g(item, "item");
        if (this.P.contains(item.f206850s)) {
            return false;
        }
        if (item.d() && item.f206850s != null) {
            java.util.ArrayList arrayList = this.C;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (com.tencent.mm.sdk.platformtools.t8.D0((java.lang.String) next, item.f206850s)) {
                    arrayList2.add(next);
                }
            }
            if (!arrayList2.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void w7() {
        if (this.f206456q == null) {
            return;
        }
        findViewById(com.tencent.mm.R.id.v2r);
        com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "before init view holderView height:" + this.f206456q.getLayoutParams().height);
        android.view.ViewGroup.LayoutParams layoutParams = this.f206456q.getLayoutParams();
        int i17 = this.S;
        java.util.ArrayList arrayList = this.C;
        layoutParams.height = i17 + (arrayList == null || arrayList.isEmpty() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479719dc) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479728dk));
        com.tencent.mars.xlog.Log.i("FinderLivePostSelectContactUI", "after init view holderView height:" + this.f206456q.getLayoutParams().height);
        this.f206456q.requestLayout();
    }

    public final void x7() {
        java.util.ArrayList arrayList = this.C;
        int size = arrayList.size();
        enableOptionMenu(1, this.D.size() != arrayList.size() ? true : !arrayList.containsAll(r2));
        if (size > 0) {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.nwj, java.lang.Integer.valueOf(size)));
        } else {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.nwk));
        }
    }
}
