package y35;

/* loaded from: classes11.dex */
public class d extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static y35.j f540728o;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f540729d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f540730e;

    /* renamed from: f, reason: collision with root package name */
    public y35.z f540731f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f540732g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f540733h;

    /* renamed from: i, reason: collision with root package name */
    public y35.k f540734i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f540735m;

    /* renamed from: n, reason: collision with root package name */
    public int f540736n;

    public d(android.content.Context context, int i17) {
        super(context);
        this.f540735m = false;
        this.f540729d = context;
        this.f540736n = i17;
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(r0).f275414w != 6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(r0).f275414w != 6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        if (r8 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(y35.d r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y35.d.a(y35.d, java.lang.String):void");
    }

    /* renamed from: setFMessageArgs */
    public static void m176453xd75a02c0(y35.j jVar) {
        f540728o = jVar;
    }

    public void b(y35.r provider) {
        y35.z zVar = this.f540731f;
        zVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        java.lang.Object tag = getTag();
        jz5.g gVar = zVar.f540800c;
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(null);
        if (!provider.k()) {
            android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder", "bindData", "(Lcom/tencent/mm/pluginsdk/ui/preference/FMessageProvider;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder", "bindData", "(Lcom/tencent/mm/pluginsdk/ui/preference/FMessageProvider;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder", "bindData", "(Lcom/tencent/mm/pluginsdk/ui/preference/FMessageProvider;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder", "bindData", "(Lcom/tencent/mm/pluginsdk/ui/preference/FMessageProvider;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.ImageView) ((jz5.n) zVar.f540799b).mo141623x754a37bb()).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562681cz0);
        android.view.View view3 = (android.view.View) ((jz5.n) zVar.f540801d).mo141623x754a37bb();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder", "bindData", "(Lcom/tencent/mm/pluginsdk/ui/preference/FMessageProvider;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder", "bindData", "(Lcom/tencent/mm/pluginsdk/ui/preference/FMessageProvider;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.content.Context context = (android.content.Context) ((jz5.n) zVar.f540802e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "<get-context>(...)");
        java.lang.String str = provider.f540765a;
        r45.v60 j17 = provider.j();
        y35.u uVar = new y35.u(tag, this, zVar, provider);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
        if (activityC0065xcd7aa112 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activityC0065xcd7aa112), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new hr3.vf(str, j17, context, uVar, null), 2, null);
        } else {
            uVar.mo149xb9724478(null, null);
        }
    }

    public void c() {
        c01.d9.e().q(30, this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f540733h;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f540733h.dismiss();
    }

    public final void d() {
        android.view.View inflate = android.view.View.inflate(this.f540729d, com.p314xaae8f345.mm.R.C30864xbddafb2a.bb6, this);
        this.f540730e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.g_e);
        this.f540731f = new y35.z(inflate);
        e();
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.g_f);
        this.f540732g = button;
        button.setOnClickListener(new y35.g(this));
    }

    public void e() {
        if (f540728o == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageItemView", "initFMessageSayHiImgReport: args is null, skip report registration");
            return;
        }
        android.view.View view = this.f540731f.f540798a;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(view);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, "greet_img_friend_request");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "add_username", f540728o.f540752a);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(view, new ly1.a() { // from class: y35.d$$a
            @Override // ly1.a
            public final java.util.Map b(java.lang.String str) {
                y35.d dVar = y35.d.this;
                dVar.getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("greet_friend_request_index", java.lang.Integer.valueOf(dVar.f540736n));
                return hashMap;
            }
        });
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 40, 33926);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r19, int r20, java.lang.String r21, com.p314xaae8f345.mm.p944x882e457a.m1 r22) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y35.d.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    /* renamed from: setBtnVisibility */
    public void m176454xffaa9d4c(int i17) {
        android.widget.Button button = this.f540732g;
        if (button != null) {
            button.setVisibility(i17);
            y35.k kVar = this.f540734i;
            if (kVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.r0) kVar;
                if (this.f540732g.getVisibility() == 0) {
                    ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.g0(r0Var, r0Var.f235130b.f234954e.d1()));
                }
            }
        }
    }

    /* renamed from: setContentText */
    public void m176455x5909c384(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f540730e.setVisibility(8);
            return;
        }
        this.f540730e.setVisibility(0);
        android.widget.TextView textView = this.f540730e;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        if (str == null) {
            str = "";
        }
        float textSize = this.f540730e.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this.f540729d, str, textSize));
    }

    /* renamed from: setGotoSayHiCallBack */
    public void m176456x351d3dec(y35.k kVar) {
        this.f540734i = kVar;
    }

    /* renamed from: setItemPosition */
    public void m176457xe94342de(int i17) {
        this.f540736n = i17;
    }

    public d(android.content.Context context, boolean z17) {
        super(context);
        this.f540735m = false;
        this.f540736n = 0;
        this.f540729d = context;
        this.f540735m = z17;
        d();
    }
}
