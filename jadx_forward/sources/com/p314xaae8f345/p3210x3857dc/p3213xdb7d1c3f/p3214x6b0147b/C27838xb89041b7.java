package com.p314xaae8f345.p3210x3857dc.p3213xdb7d1c3f.p3214x6b0147b;

/* renamed from: com.tencent.xweb.extension.video.VideoStatusLayout */
/* loaded from: classes13.dex */
public class C27838xb89041b7 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f301801d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.p3213xdb7d1c3f.p3214x6b0147b.C27837x3854e658 f301802e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f301803f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f301804g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f301805h;

    /* renamed from: i, reason: collision with root package name */
    public sx5.f f301806i;

    /* renamed from: m, reason: collision with root package name */
    public int f301807m;

    public C27838xb89041b7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f301807m = 1000;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.p3222x9cba06de.R.C27875xbddafb2a.f61381x17c57fb9, this);
        this.f301803f = (android.widget.TextView) findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61363xdb35174a);
        this.f301801d = (android.widget.ImageView) findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61329xdb7b91d5);
        this.f301802e = (com.p314xaae8f345.p3210x3857dc.p3213xdb7d1c3f.p3214x6b0147b.C27837x3854e658) findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61346x2643da27);
        this.f301804g = (android.widget.TextView) findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61361xbbea9d27);
        this.f301805h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61338x910eade4);
        this.f301806i = new sx5.f(this, null);
        setVisibility(8);
    }

    public void a() {
        setVisibility(0);
        removeCallbacks(this.f301806i);
        postDelayed(this.f301806i, this.f301807m);
    }

    /* renamed from: setBrightProgress */
    public void m120246xa8b67049(int i17) {
        this.f301802e.m120245x3ae760af(i17);
        this.f301802e.setVisibility(0);
        this.f301804g.setText(com.p314xaae8f345.p3222x9cba06de.R.C27876xcad56011.f61397xcd1ea098);
        this.f301805h.setVisibility(0);
        this.f301801d.setImageResource(com.p314xaae8f345.p3222x9cba06de.R.C27874xcebc809e.f61260xc5d1f3c0);
        this.f301803f.setVisibility(8);
    }

    /* renamed from: setDuration */
    public void m120247xffd6ec16(int i17) {
        this.f301807m = i17;
    }

    /* renamed from: setVideoTimeProgress */
    public void m120248x657c77f3(java.lang.String str) {
        this.f301803f.setText(str);
        this.f301803f.setVisibility(0);
        this.f301805h.setVisibility(8);
    }

    /* renamed from: setVolumeProgress */
    public void m120249xd3848869(int i17) {
        this.f301802e.m120245x3ae760af(i17);
        this.f301802e.setVisibility(0);
        this.f301804g.setText(com.p314xaae8f345.p3222x9cba06de.R.C27876xcad56011.f61414x1ca296e1);
        this.f301805h.setVisibility(0);
        this.f301801d.setImageResource(com.p314xaae8f345.p3222x9cba06de.R.C27874xcebc809e.f61277xf4e98317);
        this.f301803f.setVisibility(8);
    }
}
