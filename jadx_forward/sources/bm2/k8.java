package bm2;

/* loaded from: classes10.dex */
public final class k8 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements bm2.x8 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f103579d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f103580e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f103581f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f103582g;

    /* renamed from: h, reason: collision with root package name */
    public final int f103583h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f103584i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f103585m;

    /* renamed from: n, reason: collision with root package name */
    public int f103586n;

    public k8(gk2.e liveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f103579d = liveData;
        this.f103580e = "finder_live_sing_song_play.pag";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f103581f = linkedList;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f103582g = true;
        this.f103583h = 8;
        zl2.q4.f555466a.R("FinderLiveAnchorSingSongListAdapter");
        linkedList.addAll(((mm2.m6) liveData.a(mm2.m6.class)).f410774f.b());
    }

    @Override // bm2.x8
    public void b(boolean z17) {
        yz5.l lVar;
        java.util.LinkedList linkedList = this.f103581f;
        linkedList.clear();
        gk2.e eVar = this.f103579d;
        linkedList.addAll(((mm2.m6) eVar.a(mm2.m6.class)).f410774f.b());
        mm2.j7 j7Var = (mm2.j7) ((mm2.m6) eVar.a(mm2.m6.class)).f410777i.mo3195x754a37bb();
        java.lang.String str = j7Var != null ? j7Var.f410716a : null;
        if (!(str == null || str.length() == 0)) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((dk2.yg) obj).f315926a, str) && (lVar = this.f103585m) != null) {
                    lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
                }
                i17 = i18;
            }
            ((mm2.m6) eVar.a(mm2.m6.class)).f410777i.mo7808x76db6cb1(null);
        }
        dk2.yg ygVar = (dk2.yg) kz5.n0.Z(linkedList);
        if (ygVar != null && ygVar.f315928c == 4) {
            ((dk2.yg) linkedList.getFirst()).getClass();
            this.f103586n = 1;
        } else {
            this.f103586n = 0;
        }
        if (z17) {
            m8146xced61ae5();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103581f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((dk2.yg) this.f103581f.get(i17)).f315928c;
    }

    @Override // bm2.x8
    public void m() {
        this.f103581f.clear();
        m8146xced61ae5();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bm2.i8 holder = (bm2.i8) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.LinkedList linkedList = this.f103581f;
        java.lang.Object obj = linkedList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        dk2.yg ygVar = (dk2.yg) obj;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = ygVar.f315926a;
        android.widget.TextView textView = holder.f103519f;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        long j17 = ygVar.f315927b;
        android.widget.TextView textView2 = holder.f103521h;
        if (j17 > 0) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String valueOf = java.lang.String.valueOf(ygVar.f315927b);
            float textSize2 = textView2.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, valueOf, textSize2));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) dk2.ef.f314944z.get("15_white");
        if (bitmap != null) {
            holder.f103522i.setImageBitmap(bitmap);
        }
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str2 = ygVar.f315933h;
        android.widget.TextView textView3 = holder.f103520g;
        float textSize3 = textView3.getTextSize();
        ((ke0.e) xVar3).getClass();
        textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context3, str2, textSize3));
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = holder.f103517d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22789xd23e9a9b, "<get-singSongIcon>(...)");
        int i18 = ygVar.f315928c;
        boolean z17 = this.f103582g;
        if (i18 != 4) {
            if (z17) {
                c22789xd23e9a9b.n();
            }
            c22789xd23e9a9b.setVisibility(8);
        } else if (z17) {
            c22789xd23e9a9b.setVisibility(0);
            if (!c22789xd23e9a9b.f()) {
                c22789xd23e9a9b.g();
            }
        } else {
            c22789xd23e9a9b.setVisibility(8);
        }
        int i19 = ygVar.f315928c;
        android.widget.TextView textView4 = holder.f103518e;
        if (i19 != 2) {
            textView4.setText(java.lang.String.valueOf((i17 + 1) - this.f103586n));
        }
        if (ygVar.f315928c == 4) {
            c22789xd23e9a9b.setVisibility(0);
            textView4.setVisibility(8);
            textView.setTextColor(holder.f3639x46306858.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            textView3.setTextColor(holder.f3639x46306858.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77748x91fa628d));
        } else {
            c22789xd23e9a9b.setVisibility(8);
            textView4.setVisibility(0);
            textView.setTextColor(holder.f3639x46306858.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            textView3.setTextColor(holder.f3639x46306858.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta));
        }
        java.lang.CharSequence text = textView3.getText();
        if (text == null || text.length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
        }
        holder.f3639x46306858.setOnClickListener(new bm2.j8(this, ygVar));
        int i27 = this.f103583h;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = holder.f103523m;
        if (i17 < i27 || i17 != linkedList.size() - 1) {
            c1073x7e08a787.setVisibility(8);
        } else {
            c1073x7e08a787.setVisibility(0);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.b1h, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new bm2.i8(this, inflate);
    }
}
