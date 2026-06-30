package com.p314xaae8f345.mm.p2829xfa87f9de;

/* renamed from: com.tencent.mm.xwebutil.XWebAudioPlayerProgress */
/* loaded from: classes13.dex */
public class C22987x97ad1828 extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.p2829xfa87f9de.y {

    /* renamed from: d, reason: collision with root package name */
    public long f296341d;

    /* renamed from: e, reason: collision with root package name */
    public long f296342e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f296343f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f296344g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f296345h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2829xfa87f9de.C22988x4db43e47 f296346i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2829xfa87f9de.x f296347m;

    /* renamed from: n, reason: collision with root package name */
    public wu5.c f296348n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f296349o;

    public C22987x97ad1828(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f296341d = 0L;
        this.f296342e = 0L;
        this.f296343f = null;
        this.f296344g = null;
        this.f296345h = null;
        this.f296346i = null;
        this.f296347m = null;
        this.f296348n = null;
        this.f296349o = new com.p314xaae8f345.mm.p2829xfa87f9de.u(this);
        b(context);
    }

    public java.lang.String a(long j17) {
        boolean z17;
        if (j17 < 0) {
            j17 = 0;
        }
        long j18 = j17 / 1000;
        long j19 = j18 % 60;
        long j27 = (j18 / 60) % 60;
        long j28 = j18 / 3600;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (j28 > 0) {
            sb6.append(j28);
            sb6.append(":");
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17 && j27 < 10) {
            sb6.append(0);
        }
        sb6.append(j27);
        sb6.append(":");
        if (j19 < 10) {
            sb6.append("0");
        }
        sb6.append(j19);
        return sb6.toString();
    }

    public final void b(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d_y, this);
        this.f296343f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.psy);
        this.f296344g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.psz);
        this.f296345h = findViewById(com.p314xaae8f345.mm.R.id.psw);
        com.p314xaae8f345.mm.p2829xfa87f9de.C22988x4db43e47 c22988x4db43e47 = (com.p314xaae8f345.mm.p2829xfa87f9de.C22988x4db43e47) findViewById(com.p314xaae8f345.mm.R.id.psx);
        this.f296346i = c22988x4db43e47;
        c22988x4db43e47.m83870x695f968a(this);
        this.f296343f.setText(a(this.f296341d));
        this.f296344g.setText(a(this.f296342e));
        this.f296345h.post(new com.p314xaae8f345.mm.p2829xfa87f9de.s(this));
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f296345h.post(new com.p314xaae8f345.mm.p2829xfa87f9de.v(this));
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f296346i.m83869xa137c614() == 0) {
            this.f296345h.post(new com.p314xaae8f345.mm.p2829xfa87f9de.w(this));
        }
    }

    /* renamed from: setProgressCallback */
    public void m83867x61e5c614(com.p314xaae8f345.mm.p2829xfa87f9de.x xVar) {
        this.f296347m = xVar;
    }

    /* renamed from: setTotalTime */
    public void m83868x395891ef(long j17) {
        if (j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerProgress", "setTotalTime invalid totalTime = " + j17);
            this.f296342e = 0L;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerProgress", "setTotalTime totalTime = " + j17);
            this.f296342e = j17;
        }
        this.f296344g.setText(a(this.f296342e));
    }

    public C22987x97ad1828(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f296341d = 0L;
        this.f296342e = 0L;
        this.f296343f = null;
        this.f296344g = null;
        this.f296345h = null;
        this.f296346i = null;
        this.f296347m = null;
        this.f296348n = null;
        this.f296349o = new com.p314xaae8f345.mm.p2829xfa87f9de.u(this);
        b(context);
    }
}
