package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* renamed from: com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout */
/* loaded from: classes8.dex */
public class C18776x88d79fc3 extends android.widget.RelativeLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f256936m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f256937d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f256938e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f256939f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f256940g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f256941h;

    /* renamed from: i, reason: collision with root package name */
    public rn4.d f256942i;

    public C18776x88d79fc3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f256937d = null;
        this.f256938e = null;
        this.f256939f = null;
        this.f256940g = null;
        this.f256941h = null;
        this.f256942i = null;
        b();
    }

    public void a() {
        this.f256940g.animate().translationY(com.p314xaae8f345.mm.ui.bl.b(getContext()).y).setDuration(200L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.i(this)).start();
    }

    public final void b() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c7w, this);
        this.f256940g = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.k_u);
        this.f256937d = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.k_t);
        this.f256938e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.k_x);
        this.f256939f = findViewById(com.p314xaae8f345.mm.R.id.k_s);
        this.f256941h = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.k_w);
        this.f256942i = new rn4.d();
        this.f256941h.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext()));
        this.f256941h.mo7960x6cab2c8d(this.f256942i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("VoiceInputLanguageSupportType", 1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
            arrayList.add(new rn4.b(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_2), 1));
            if ((b17 & 2) != 0) {
                arrayList.add(new rn4.b(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_0), 2));
            }
            if ((b17 & 4) != 0) {
                arrayList.add(new rn4.b(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_1), 4));
            }
            if ((b17 & 8) != 0) {
                arrayList.add(new rn4.b(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_3), 8));
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("en")) {
            arrayList.add(new rn4.b(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_1), 4));
            arrayList.add(new rn4.b(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_2), 1));
            if ((b17 & 2) != 0) {
                arrayList.add(new rn4.b(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_0), 2));
            }
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f256942i.f479501d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        this.f256942i.m8146xced61ae5();
        this.f256940g.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(getContext()).y);
        this.f256939f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.f(this));
        this.f256937d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.g(this));
        this.f256938e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.h(this));
    }

    /* renamed from: setSelectLanguageListener */
    public void m72349x8350f84a(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.j jVar) {
    }

    /* renamed from: setSelectedLang */
    public void m72350x2ea4c0ab(int i17) {
        rn4.d dVar = this.f256942i;
        if (dVar != null) {
            dVar.f479502e = i17;
            dVar.m8146xced61ae5();
        }
    }

    public C18776x88d79fc3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f256937d = null;
        this.f256938e = null;
        this.f256939f = null;
        this.f256940g = null;
        this.f256941h = null;
        this.f256942i = null;
        b();
    }
}
