package com.tencent.mm.plugin.component.editor.widget.voiceview;

/* loaded from: classes12.dex */
public class VoiceView extends android.widget.FrameLayout implements rx1.c, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f96649d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f96650e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f96651f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f96652g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f96653h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f96654i;

    /* renamed from: m, reason: collision with root package name */
    public int f96655m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f96656n;

    /* renamed from: o, reason: collision with root package name */
    public int f96657o;

    /* renamed from: p, reason: collision with root package name */
    public rx1.d f96658p;

    /* renamed from: q, reason: collision with root package name */
    public rx1.g f96659q;

    public VoiceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96656n = "";
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a5x, (android.view.ViewGroup) this, true);
    }

    public static void e(com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView voiceView) {
        if (!voiceView.f96658p.d(voiceView.f96656n, voiceView.f96657o)) {
            dp.a.makeText(voiceView.getContext(), com.tencent.mm.R.string.f491220ce1, 1).show();
            return;
        }
        voiceView.f96650e.setKeepScreenOn(true);
        rx1.g gVar = voiceView.f96659q;
        gVar.f400957a = false;
        gVar.removeMessages(4096);
        gVar.b(gVar.f400962f.f96655m);
        gVar.f400957a = false;
        com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView voiceView2 = gVar.f400962f;
        voiceView2.f96651f.setImageResource(com.tencent.mm.R.raw.voicepost_pauseicon);
        voiceView2.f96651f.setContentDescription(voiceView2.getContext().getResources().getString(com.tencent.mm.R.string.f490511x5));
        gVar.sendEmptyMessage(4096);
    }

    @Override // rx1.c
    public void a() {
    }

    @Override // rx1.c
    public void b(java.lang.String str) {
    }

    @Override // rx1.c
    public void c() {
        rx1.g gVar = this.f96659q;
        gVar.f400957a = false;
        gVar.removeMessages(4096);
        gVar.b(gVar.f400962f.f96655m);
        this.f96650e.setKeepScreenOn(false);
    }

    @Override // rx1.c
    public void d(java.lang.String str) {
        if (this.f96656n.equals(str)) {
            return;
        }
        rx1.g gVar = this.f96659q;
        gVar.f400957a = false;
        gVar.removeMessages(4096);
        gVar.b(gVar.f400962f.f96655m);
        this.f96650e.setKeepScreenOn(false);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteVoiceView", "on configuration changed, is paused ? %B", java.lang.Boolean.valueOf(this.f96659q.f400957a));
        rx1.g gVar = this.f96659q;
        if (gVar.f400957a) {
            gVar.postDelayed(new rx1.e(this), 128L);
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f96649d = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f487612p62);
        this.f96652g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487610p60);
        this.f96653h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487614p64);
        this.f96650e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487611p61);
        this.f96651f = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.p5z);
        this.f96654i = findViewById(com.tencent.mm.R.id.p7e);
        this.f96659q = new rx1.g(this, null);
        this.f96651f.setOnClickListener(new rx1.f(this));
    }

    public void setVoiceHelper(rx1.d dVar) {
        this.f96658p = dVar;
        java.util.List list = dVar.f400954p;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (this == ((rx1.c) it.next())) {
                return;
            }
        }
        ((java.util.LinkedList) list).add(this);
    }

    public VoiceView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f96656n = "";
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a5x, (android.view.ViewGroup) this, true);
    }
}
