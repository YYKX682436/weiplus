package k93;

/* loaded from: classes11.dex */
public class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements k93.c0 {
    public boolean A;
    public boolean B;
    public long C;
    public boolean D;
    public k93.x E;
    public boolean S1;
    public e0.w1 T1;
    public e0.x1 U1;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f387431m;

    /* renamed from: n, reason: collision with root package name */
    public k93.q f387432n;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 f387433o;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.d4 f387440v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f387441w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f387442x;

    /* renamed from: y, reason: collision with root package name */
    public k93.s f387443y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View.OnTouchListener f387444z;

    /* renamed from: d, reason: collision with root package name */
    public boolean f387425d = true;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f387426e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f387427f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f387428g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f387429h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f387430i = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public int f387434p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f387435q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f387436r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f387437s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f387438t = -1;

    /* renamed from: u, reason: collision with root package name */
    public java.util.HashMap f387439u = new java.util.HashMap();

    public j(android.content.Context context) {
        com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.d4();
        this.f387440v = d4Var;
        this.f387441w = false;
        this.S1 = false;
        this.f387442x = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f573901g90);
        this.f387444z = null;
        this.A = false;
        this.B = false;
        this.D = true;
        this.E = null;
        this.f387431m = context;
        d4Var.f66585x70ce48ca = -2000000;
        d4Var.f66584x284d1882 = true;
    }

    public static void x(k93.j jVar, java.lang.String str, java.lang.String str2) {
        jVar.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList P1 = b93.r.wi().P1(str);
        if (P1 != null && P1.size() > 0) {
            hashSet.addAll(P1);
        }
        java.lang.String r17 = c01.z1.r();
        if (hashSet.contains(r17)) {
            hashSet.remove(r17);
        }
        android.content.Context context = jVar.f387431m;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8.class);
        intent.putExtra("last_page_source_type", 1);
        intent.putExtra("list_type", 1);
        intent.putExtra("filter_type", "@all.contact.android");
        intent.putExtra("only_show_contact", true);
        if (context instanceof android.app.Activity) {
            intent.putExtra("key_label_click_source", ((android.app.Activity) context).getIntent().getIntExtra("key_label_click_source", 0));
        }
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 22);
        if (hashSet.size() > 0) {
            intent.putExtra("titile", str2 + "(" + hashSet.size() + ")");
        } else {
            intent.putExtra("titile", str2);
        }
        intent.putExtra("list_type", 1);
        intent.putExtra("already_select_contact", (java.lang.String[]) hashSet.toArray(new java.lang.String[0]));
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14480xb9cc8658));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "gotoSingleLebalContact", "(Ljava/lang/String;Ljava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public static k93.r y(java.util.List list, int i17) {
        java.lang.String r17 = c01.z1.r();
        java.util.HashSet hashSet = new java.util.HashSet();
        if (list != null) {
            hashSet.addAll(list);
        }
        hashSet.add("filehelper");
        hashSet.add(r17);
        java.util.ArrayList arrayList = new java.util.ArrayList(hashSet);
        gm0.j1.i();
        android.database.Cursor U = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(null, "", "@all.contact.without.chatroom.without.openim.without.chatbot", "", arrayList);
        if (U == null) {
            return new k93.r(0, java.util.Collections.emptyList(), false);
        }
        int count = U.getCount();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (count == 0) {
            U.close();
            return new k93.r(0, arrayList2, false);
        }
        boolean z17 = i17 > 0 && count > i17;
        if (!z17) {
            i17 = count;
        }
        for (int i18 = 0; i18 < i17 && U.moveToPosition(i18); i18++) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var.mo9015xbf5d97fd(U);
            arrayList2.add(z3Var.d1());
        }
        U.close();
        return new k93.r(count, arrayList2, z17);
    }

    public void B() {
        if (this.E != null) {
            android.content.Intent intent = new android.content.Intent(this.f387431m, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530.class);
            int i17 = this.f387434p;
            if (i17 == 1 || i17 == 3) {
                intent.putExtra("edit_mode_state", 1);
            } else {
                intent.putExtra("edit_mode_state", 0);
            }
            intent.putExtra("contact_has_choose_label_list", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f387427f, ","));
            if (this.f387434p == 3) {
                intent.putExtra("contact_search_label_need_toast_after_choose", false);
                intent.putExtra("contact_search_label_enable_choose_empty_label", false);
                intent.putExtra("contact_search_label_choose_duplicate", true);
                intent.putExtra("contact_search_label_show_member_count", true);
            }
            intent.putExtra("contact_search_label_forbid_select_label_id_list", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f387429h, ","));
            this.E.U(intent);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelAdapter", "gotoSearchPage: showSelectStatus:%d", java.lang.Integer.valueOf(this.f387434p));
        }
    }

    public void E() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelAdapter", "resetStatus: ");
        java.util.ArrayList arrayList = this.f387427f;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f387436r = 0;
        this.f387437s = -1;
    }

    @Override // k93.c0
    public void a() {
    }

    @Override // k93.c0
    public void g() {
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.ArrayList arrayList = this.f387426e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d4) this.f387426e.get(i17);
        if (d4Var != null && d4Var.f66585x70ce48ca == -1000000) {
            return 2;
        }
        if (d4Var != null && d4Var.f66585x70ce48ca == -2000000) {
            return 3;
        }
        if (d4Var != null && d4Var.f66585x70ce48ca == -3000000) {
            return 4;
        }
        if (d4Var != null && d4Var.f66585x70ce48ca == -5000000) {
            return 6;
        }
        java.util.HashMap hashMap = this.f387439u;
        return (hashMap == null || !hashMap.containsKey(java.lang.Integer.valueOf(d4Var.f66585x70ce48ca)) || ((java.lang.Integer) this.f387439u.get(java.lang.Integer.valueOf(d4Var.f66585x70ce48ca))).intValue() <= 0) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03e4  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r33, int r34) {
        /*
            Method dump skipped, instructions count: 1371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k93.j.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        if (i17 == 3) {
            android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569515d7, viewGroup, false);
            k93.t tVar = new k93.t(this, inflate);
            inflate.setTag(tVar);
            return tVar;
        }
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a2d, viewGroup, false);
            k93.u uVar = new k93.u(this, inflate2);
            inflate2.setTag(uVar);
            return uVar;
        }
        if (i17 == 0) {
            android.view.View inflate3 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a2c, viewGroup, false);
            f93.d5 d5Var = new f93.d5(inflate3);
            inflate3.setTag(d5Var);
            return d5Var;
        }
        if (i17 == 1) {
            android.view.View inflate4 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a2e, viewGroup, false);
            k93.w wVar = new k93.w(this, inflate4);
            inflate4.setTag(wVar);
            return wVar;
        }
        if (i17 == 4) {
            android.view.View inflate5 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a2f, viewGroup, false);
            k93.v vVar = new k93.v(this, inflate5);
            inflate5.setTag(vVar);
            return vVar;
        }
        if (i17 != 6) {
            return null;
        }
        android.view.View inflate6 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571186dx, viewGroup, false);
        e0.y1 y1Var = new e0.y1(this, inflate6);
        inflate6.setTag(y1Var);
        return y1Var;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.d4 z(int i17) {
        java.util.ArrayList arrayList = this.f387426e;
        if (arrayList == null || i17 > arrayList.size()) {
            return null;
        }
        return (com.p314xaae8f345.mm.p2621x8fb0427b.d4) this.f387426e.get(i17);
    }
}
