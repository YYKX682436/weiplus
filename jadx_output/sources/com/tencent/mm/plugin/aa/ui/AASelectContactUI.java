package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes11.dex */
public class AASelectContactUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public static final /* synthetic */ int V = 0;
    public int C;
    public java.lang.String D;
    public java.lang.String E;
    public java.util.ArrayList F;
    public java.util.ArrayList G;
    public java.util.HashSet H;
    public java.util.HashSet I;

    /* renamed from: J, reason: collision with root package name */
    public long f72471J;
    public android.widget.CheckBox K;
    public android.view.View L;
    public java.util.List M;
    public java.util.List N;
    public int P;
    public int Q;
    public int R;
    public java.util.ArrayList S = new java.util.ArrayList();
    public java.util.ArrayList T = new java.util.ArrayList();
    public java.util.HashMap U = new java.util.HashMap();

    public static java.util.List w7(com.tencent.mm.plugin.aa.ui.AASelectContactUI aASelectContactUI) {
        aASelectContactUI.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = aASelectContactUI.y7(aASelectContactUI.z7()).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (aASelectContactUI.I.contains(str)) {
                linkedList.add(str);
            }
        }
        return linkedList;
    }

    public static void x7(com.tencent.mm.plugin.aa.ui.AASelectContactUI aASelectContactUI, java.util.List list) {
        java.util.HashSet hashSet = aASelectContactUI.I;
        if (hashSet != null) {
            hashSet.clear();
        } else {
            aASelectContactUI.I = new java.util.HashSet();
        }
        aASelectContactUI.I.addAll(list);
        aASelectContactUI.K.setChecked(true);
        aASelectContactUI.b7().notifyDataSetChanged();
    }

    public final boolean A7() {
        return this.R == 1;
    }

    public final boolean B7() {
        return A7() && this.P == 3 && this.Q == 4;
    }

    public final void C7() {
        if (this.I.size() > 0) {
            enableOptionMenu(1, true);
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.f489726z, java.lang.Integer.valueOf(this.I.size())));
        } else {
            enableOptionMenu(1, false);
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490507x1));
        }
        if (this.I.size() == 1 && this.I.contains(c01.z1.r())) {
            enableOptionMenu(1, false);
        } else if (this.I.size() == 0) {
            enableOptionMenu(1, false);
        } else {
            enableOptionMenu(1, true);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            this.I.remove(str);
            b7().notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public java.lang.String W5(com.tencent.mm.ui.contact.item.d dVar) {
        if (!A7() || dVar.f206850s == null || this.U.size() <= 0) {
            return null;
        }
        return h61.o.j(60, (java.lang.String) this.U.get(dVar.f206850s));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        java.util.ArrayList arrayList;
        if (this.C == 6) {
            return new com.tencent.mm.plugin.aa.ui.t1(this, this.G);
        }
        java.lang.String str = this.D;
        java.util.ArrayList z76 = z7();
        if (A7()) {
            arrayList = new java.util.ArrayList();
            arrayList.addAll(this.T);
        } else {
            arrayList = new java.util.ArrayList();
        }
        return new com.tencent.mm.plugin.aa.ui.u1(this, str, z76, arrayList, B7());
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        java.util.ArrayList arrayList;
        if (this.C == 6) {
            return new com.tencent.mm.plugin.aa.ui.v1(this, this.G);
        }
        java.lang.String str = this.D;
        java.util.ArrayList z76 = z7();
        if (A7()) {
            arrayList = new java.util.ArrayList();
            arrayList.addAll(this.T);
        } else {
            arrayList = new java.util.ArrayList();
        }
        return new com.tencent.mm.plugin.aa.ui.w1(this, str, z76, arrayList, B7());
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return this.E;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487874ab;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h7(android.widget.AdapterView r4, android.view.View r5, int r6, long r7) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.aa.ui.AASelectContactUI.h7(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.plugin.aa.ui.o1(this), null, com.tencent.mm.ui.fb.GREEN);
        C7();
        this.f206450h.setOnContactDeselectListener(this);
        setBackBtn(new com.tencent.mm.plugin.aa.ui.r1(this));
        if (c01.e2.R(this.D)) {
            android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f487877ae, (android.view.ViewGroup) null);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.b_);
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = -2;
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setMinimumHeight(i65.a.b(getContext(), 44));
            linearLayout.setPadding(i65.a.b(getContext(), 16), i65.a.b(getContext(), 15), 0, i65.a.b(getContext(), 8));
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f482321ba);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/AASelectContactUI", "addOpenIMTipsHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/aa/ui/AASelectContactUI", "addOpenIMTipsHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f206446d.addHeaderView(inflate, null, false);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        this.C = getIntent().getIntExtra("enter_scene", 1);
        this.G = getIntent().getStringArrayListExtra("third_party_usernamelist");
        this.E = getIntent().getStringExtra("titile");
        this.f72471J = getIntent().getLongExtra("max_select_num", 20L);
        getIntent().getIntExtra("select_type", 1);
        this.D = getIntent().getStringExtra("chatroomName");
        this.P = getIntent().getIntExtra("enter_mode", 2);
        this.Q = getIntent().getIntExtra("enter_sub_mode", 4);
        this.R = getIntent().getIntExtra("group_solitatire_flag", 0);
        if (A7()) {
            this.S = getIntent().getStringArrayListExtra("group_solitatire_username_list");
            this.T = getIntent().getStringArrayListExtra("group_solitatire_desc_list");
            this.U = new java.util.HashMap();
            java.util.ArrayList arrayList = this.T;
            if (arrayList != null && arrayList.size() > 0 && this.T.size() == this.S.size()) {
                for (int i17 = 0; i17 <= this.S.size() - 1; i17++) {
                    this.U.put((java.lang.String) this.S.get(i17), (java.lang.String) this.T.get(i17));
                }
            }
        }
        if (!com.tencent.mm.storage.z3.R4(this.D)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AASelectContactUI", "is single chat");
        }
        this.I = new java.util.HashSet();
        this.H = new java.util.HashSet();
        this.F = new java.util.ArrayList();
        this.N = new java.util.ArrayList();
        this.M = new java.util.ArrayList();
        if (c01.e2.R(this.D)) {
            java.util.ArrayList z76 = z7();
            if (z76.size() > 0) {
                java.util.Iterator it = z76.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (com.tencent.mm.storage.z3.m4(str)) {
                        ((java.util.ArrayList) this.N).add(str);
                    } else {
                        ((java.util.ArrayList) this.M).add(str);
                    }
                }
            }
        }
        java.lang.String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.H.addAll(java.util.Arrays.asList(stringExtra.split(",")));
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("already_select_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(","));
            if (A7()) {
                this.I.addAll(y7(P1));
            } else {
                this.I.addAll(P1);
            }
            C7();
        }
        this.F.addAll(this.I);
        this.K = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.oen);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.oeo);
        this.L = findViewById;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.aa.ui.m1(this));
        int size = this.C == 6 ? this.G.size() : !c01.e2.R(this.D) ? y7(z7()).size() : ((java.util.ArrayList) this.M).size();
        if (this.I.size() == 0 || this.I.size() != size) {
            this.K.setChecked(false);
        } else {
            this.K.setChecked(true);
        }
        this.K.setOnCheckedChangeListener(new com.tencent.mm.plugin.aa.ui.n1(this));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.H.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")));
        }
        getContentView().post(new com.tencent.mm.plugin.aa.ui.s1(this));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return this.H.contains(str);
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(h61.b.class);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return this.I.contains(str);
    }

    public java.util.ArrayList y7(java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (A7()) {
            arrayList2.addAll(h61.o.k(arrayList, this.D, B7(), true));
        } else {
            arrayList2.addAll(z7());
        }
        return arrayList2;
    }

    public final java.util.ArrayList z7() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (A7()) {
            arrayList.addAll(this.S);
        } else {
            arrayList.addAll(h61.o.i(this.D));
        }
        return arrayList;
    }
}
