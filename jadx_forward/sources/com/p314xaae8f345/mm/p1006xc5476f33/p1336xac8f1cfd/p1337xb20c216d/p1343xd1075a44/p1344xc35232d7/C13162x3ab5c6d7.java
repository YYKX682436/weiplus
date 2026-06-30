package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7;

/* renamed from: com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView */
/* loaded from: classes12.dex */
public class C13162x3ab5c6d7 extends android.widget.FrameLayout implements rx1.c, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f178182d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f178183e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f178184f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f178185g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f178186h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f178187i;

    /* renamed from: m, reason: collision with root package name */
    public int f178188m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f178189n;

    /* renamed from: o, reason: collision with root package name */
    public int f178190o;

    /* renamed from: p, reason: collision with root package name */
    public rx1.d f178191p;

    /* renamed from: q, reason: collision with root package name */
    public rx1.g f178192q;

    public C13162x3ab5c6d7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f178189n = "";
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a5x, (android.view.ViewGroup) this, true);
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 c13162x3ab5c6d7) {
        if (!c13162x3ab5c6d7.f178191p.d(c13162x3ab5c6d7.f178189n, c13162x3ab5c6d7.f178190o)) {
            dp.a.m125853x26a183b(c13162x3ab5c6d7.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572753ce1, 1).show();
            return;
        }
        c13162x3ab5c6d7.f178183e.setKeepScreenOn(true);
        rx1.g gVar = c13162x3ab5c6d7.f178192q;
        gVar.f482490a = false;
        gVar.mo50303x856b99f0(4096);
        gVar.b(gVar.f482495f.f178188m);
        gVar.f482490a = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 c13162x3ab5c6d72 = gVar.f482495f;
        c13162x3ab5c6d72.f178184f.setImageResource(com.p314xaae8f345.mm.R.raw.f81342xcd70a442);
        c13162x3ab5c6d72.f178184f.setContentDescription(c13162x3ab5c6d72.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
        gVar.mo50305x3d8a09a2(4096);
    }

    @Override // rx1.c
    public void a() {
    }

    @Override // rx1.c
    public void b(java.lang.String str) {
    }

    @Override // rx1.c
    public void c() {
        rx1.g gVar = this.f178192q;
        gVar.f482490a = false;
        gVar.mo50303x856b99f0(4096);
        gVar.b(gVar.f482495f.f178188m);
        this.f178183e.setKeepScreenOn(false);
    }

    @Override // rx1.c
    public void d(java.lang.String str) {
        if (this.f178189n.equals(str)) {
            return;
        }
        rx1.g gVar = this.f178192q;
        gVar.f482490a = false;
        gVar.mo50303x856b99f0(4096);
        gVar.b(gVar.f482495f.f178188m);
        this.f178183e.setKeepScreenOn(false);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteVoiceView", "on configuration changed, is paused ? %B", java.lang.Boolean.valueOf(this.f178192q.f482490a));
        rx1.g gVar = this.f178192q;
        if (gVar.f482490a) {
            gVar.mo50297x7c4d7ca2(new rx1.e(this), 128L);
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f178182d = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f569145p62);
        this.f178185g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569143p60);
        this.f178186h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569147p64);
        this.f178183e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569144p61);
        this.f178184f = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.p5z);
        this.f178187i = findViewById(com.p314xaae8f345.mm.R.id.p7e);
        this.f178192q = new rx1.g(this, null);
        this.f178184f.setOnClickListener(new rx1.f(this));
    }

    /* renamed from: setVoiceHelper */
    public void m54605x591869be(rx1.d dVar) {
        this.f178191p = dVar;
        java.util.List list = dVar.f482487p;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (this == ((rx1.c) it.next())) {
                return;
            }
        }
        ((java.util.LinkedList) list).add(this);
    }

    public C13162x3ab5c6d7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f178189n = "";
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a5x, (android.view.ViewGroup) this, true);
    }
}
