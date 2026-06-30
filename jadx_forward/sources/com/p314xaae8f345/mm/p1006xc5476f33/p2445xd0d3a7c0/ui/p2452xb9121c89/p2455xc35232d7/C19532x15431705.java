package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView */
/* loaded from: classes12.dex */
public class C19532x15431705 extends android.widget.FrameLayout implements uz4.c, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f269825d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f269826e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f269827f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f269828g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f269829h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f269830i;

    /* renamed from: m, reason: collision with root package name */
    public int f269831m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f269832n;

    /* renamed from: o, reason: collision with root package name */
    public int f269833o;

    /* renamed from: p, reason: collision with root package name */
    public uz4.d f269834p;

    /* renamed from: q, reason: collision with root package name */
    public uz4.g f269835q;

    public C19532x15431705(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f269832n = "";
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c8e, (android.view.ViewGroup) this, true);
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 c19532x15431705) {
        if (!c19532x15431705.f269834p.g(c19532x15431705.f269832n, c19532x15431705.f269833o)) {
            dp.a.m125853x26a183b(c19532x15431705.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f572753ce1, 1).show();
            return;
        }
        c19532x15431705.f269826e.setKeepScreenOn(true);
        uz4.g gVar = c19532x15431705.f269835q;
        gVar.f513711a = false;
        gVar.mo50303x856b99f0(4096);
        gVar.b(gVar.f513716f.f269831m);
        gVar.f513711a = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 c19532x154317052 = gVar.f513716f;
        c19532x154317052.f269827f.setImageResource(com.p314xaae8f345.mm.R.raw.f81342xcd70a442);
        c19532x154317052.f269827f.setContentDescription(c19532x154317052.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
        gVar.mo50305x3d8a09a2(4096);
    }

    @Override // uz4.c
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteVoiceView", "onNotifyPausePlay !!");
        f();
    }

    @Override // uz4.c
    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteVoiceView", "onNotifyResumePlay !!");
    }

    @Override // uz4.c
    public void c() {
        uz4.g gVar = this.f269835q;
        gVar.f513711a = false;
        gVar.mo50303x856b99f0(4096);
        gVar.b(gVar.f513716f.f269831m);
        this.f269826e.setKeepScreenOn(false);
    }

    @Override // uz4.c
    public void d(java.lang.String str) {
        if (this.f269832n.equals(str)) {
            return;
        }
        uz4.g gVar = this.f269835q;
        gVar.f513711a = false;
        gVar.mo50303x856b99f0(4096);
        gVar.b(gVar.f513716f.f269831m);
        this.f269826e.setKeepScreenOn(false);
    }

    public final void f() {
        uz4.g gVar = this.f269835q;
        gVar.f513711a = true;
        gVar.mo50303x856b99f0(4096);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 c19532x15431705 = gVar.f513716f;
        c19532x15431705.f269827f.setImageResource(com.p314xaae8f345.mm.R.raw.f81341x5c0e6575);
        c19532x15431705.f269827f.setContentDescription(c19532x15431705.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572052xf) + c19532x15431705.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_i));
        this.f269826e.setKeepScreenOn(false);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteVoiceView", "on configuration changed, is paused ? %B", java.lang.Boolean.valueOf(this.f269835q.f513711a));
        uz4.g gVar = this.f269835q;
        if (gVar.f513711a) {
            gVar.mo50297x7c4d7ca2(new uz4.e(this), 128L);
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f269825d = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f569145p62);
        this.f269828g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569143p60);
        this.f269829h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569147p64);
        this.f269826e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569144p61);
        this.f269827f = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.p5z);
        this.f269830i = findViewById(com.p314xaae8f345.mm.R.id.p7e);
        this.f269835q = new uz4.g(this, null);
        this.f269827f.setOnClickListener(new uz4.f(this));
    }

    /* renamed from: setVoiceHelper */
    public void m74993x591869be(uz4.d dVar) {
        this.f269834p = dVar;
        dVar.b(this);
    }

    public C19532x15431705(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f269832n = "";
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c8e, (android.view.ViewGroup) this, true);
    }
}
