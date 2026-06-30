package j93;

/* loaded from: classes11.dex */
public final class n extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379974d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f379975e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 f379976f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f379977g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f379978h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f379979i;

    /* renamed from: m, reason: collision with root package name */
    public int f379980m;

    /* renamed from: n, reason: collision with root package name */
    public int f379981n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f379982o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f379983p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f379984q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f379985r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f379986s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f379987t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.Set f379988u;

    /* renamed from: v, reason: collision with root package name */
    public long f379989v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f379990w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f379991x;

    static {
        new j93.a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f379982o = jz5.h.b(new j93.k(activity));
        this.f379983p = new java.util.ArrayList();
        this.f379984q = new java.util.ArrayList();
        this.f379985r = new java.util.ArrayList();
        this.f379986s = new java.util.ArrayList();
        this.f379988u = new java.util.HashSet();
        this.f379990w = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }

    public final void O6(java.util.ArrayList arrayList, int i17) {
        this.f379981n = i17;
        if (arrayList != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "deal label result: " + arrayList);
            java.util.ArrayList arrayList2 = this.f379984q;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            this.f379986s.clear();
        }
        U6();
        yz5.a aVar = this.f379977g;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j93.n.P6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String Q6() {
        return (java.lang.String) ((jz5.n) this.f379982o).mo141623x754a37bb();
    }

    public final boolean R6() {
        return this.f379986s.size() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S6(java.lang.String r3, boolean r4, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 r5, yz5.a r6) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j93.n.S6(java.lang.String, boolean, com.tencent.mm.ui.base.FlowLayout, yz5.a):void");
    }

    public final void T6() {
        if (this.f379978h) {
            com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(this.f379974d);
            c93.b a17 = c93.a.a();
            java.util.ArrayList arrayList = this.f379984q;
            java.lang.String h17 = ((b93.b) a17).h(arrayList);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
                z07.f66693x91130dba = "";
                ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).mo11260x413cb2b4(z07);
            } else {
                z07.f66693x91130dba = h17;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
                    z07.f66694xdd77ad16 = this.f379974d;
                }
                ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).mo11260x413cb2b4(z07);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "saveStrangerLabel: " + arrayList);
        }
    }

    public final void U6() {
        android.widget.TextView textView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showRecommendByChatroom start, chatroom labels: ");
        java.util.ArrayList arrayList = this.f379983p;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", sb6.toString());
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = this.f379976f;
        if (c21475x81dbaa18 != null) {
            c21475x81dbaa18.removeAllViews();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!this.f379984q.contains((java.lang.String) obj)) {
                arrayList2.add(obj);
            }
        }
        java.util.List<java.lang.String> K0 = kz5.n0.K0(arrayList2, 3);
        if (this.f379976f != null) {
            int i17 = 0;
            for (java.lang.String str : K0) {
                android.view.View inflate = android.view.LayoutInflater.from(m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3q, (android.view.ViewGroup) null);
                if (inflate != null && (textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.vk7)) != null) {
                    textView.setText(str);
                    com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                    textView.setSingleLine();
                }
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa182 = this.f379976f;
                if (c21475x81dbaa182 != null) {
                    if (inflate != null) {
                        inflate.setOnClickListener(new j93.l(this, str, c21475x81dbaa182, inflate));
                    }
                    c21475x81dbaa182.addView(inflate);
                    i17++;
                }
            }
            if (i17 == 0) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa183 = this.f379976f;
                if (c21475x81dbaa183 != null) {
                    c21475x81dbaa183.setVisibility(8);
                }
                this.f379979i = true;
            } else if (!this.f379991x) {
                this.f379991x = true;
                pm0.v.K(null, new j93.j(i17, this));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "showRecommendByChatroom end, total shown labels: " + i17);
        }
    }

    public final void V6(int i17, android.content.Intent intent, boolean z17, java.util.ArrayList labels) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labels, "labels");
        intent.putExtra("Contact_ReportSessionId", Q6());
        if (z17) {
            intent.putStringArrayListExtra("label_str_list", labels);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "[startContactLabelUI]: jumpDirectly: " + labels);
            this.f379987t = true;
            this.f379979i = true;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = this.f379976f;
            if (c21475x81dbaa18 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "hide recommend labels for jumpDirectly");
                c21475x81dbaa18.setVisibility(8);
            }
        } else {
            java.util.ArrayList arrayList = this.f379984q;
            intent.putStringArrayListExtra("label_str_list", new java.util.ArrayList<>(arrayList));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "[startContactLabelUI]: " + arrayList);
        }
        intent.putExtra("label_username", this.f379974d);
        if (this.f379974d != null) {
            bh5.c cVar = new bh5.c();
            cVar.d(intent);
            cVar.f102455a.f102457a = m80379x76847179();
            cVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16170x2911e4dc.class.getName());
            cVar.h(i17);
        }
        pm0.v.K(null, new j93.m(this));
    }

    public final java.util.List W6(java.util.List list) {
        java.util.List arrayList = list == null ? new java.util.ArrayList() : kz5.n0.S0(list);
        java.util.ArrayList arrayList2 = this.f379985r;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        java.util.ArrayList arrayList3 = this.f379984q;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        java.util.ArrayList arrayList4 = this.f379986s;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList4) {
            if (!arrayList.contains((java.lang.String) obj)) {
                arrayList5.add(obj);
            }
        }
        arrayList4.clear();
        arrayList4.addAll(arrayList5);
        arrayList3.addAll(arrayList4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTv: ");
        sb6.append(this.f379978h ? "stranger" : "contact");
        sb6.append('=');
        sb6.append(arrayList);
        sb6.append(", save=");
        sb6.append(arrayList4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", sb6.toString());
        return arrayList3;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x015c A[LOOP:1: B:36:0x0158->B:38:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016e  */
    @Override // o13.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X2(p13.v r20) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j93.n.X2(p13.v):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = this.f379976f;
        if (!(c21475x81dbaa18 != null && c21475x81dbaa18.getVisibility() == 0) || this.f379987t || this.f379978h || (str = this.f379974d) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", "set in black list: ".concat(str));
        this.f379988u.add(str);
        java.util.Set blackList = this.f379988u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blackList, "blackList");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_Name_ShowOuterRecommendLabels").putStringSet("MMKV_Key_ShowOuterRecommendLabels", blackList);
    }
}
