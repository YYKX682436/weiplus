package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5;

/* renamed from: com.tencent.mm.plugin.flash.view.FaceNumberLayout */
/* loaded from: classes14.dex */
public class C15540x683732f0 extends android.widget.LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int f218801h;

    /* renamed from: d, reason: collision with root package name */
    public int f218802d;

    /* renamed from: e, reason: collision with root package name */
    public int f218803e;

    /* renamed from: f, reason: collision with root package name */
    public wu5.c f218804f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f218805g;

    static {
        java.lang.String str = rz2.g.f483335a;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_face_flash_read_number_interval, 1000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerConfig", "getFaceReadNumberTimeInterval %d", java.lang.Integer.valueOf(Ni));
        f218801h = Ni;
    }

    public C15540x683732f0(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumberView", "release");
        wu5.c cVar = this.f218804f;
        if (cVar != null && !cVar.isDone() && !this.f218804f.isCancelled()) {
            this.f218804f.cancel(false);
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15541x39aaabeb c15541x39aaabeb = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15541x39aaabeb) getChildAt(i17);
            c15541x39aaabeb.getClass();
            c15541x39aaabeb.post(new yz2.c(c15541x39aaabeb));
        }
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumberView", "startShowNumber");
        wu5.c cVar = this.f218804f;
        if (cVar != null && !cVar.isDone() && !this.f218804f.isCancelled()) {
            this.f218804f.cancel(false);
        }
        this.f218804f = ((ku5.t0) ku5.t0.f394148d).B(this.f218805g);
    }

    /* renamed from: setNumbers */
    public void m63492x3a011788(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerNumberView", "setNumbers %s", str);
        this.f218803e = str.length();
        this.f218802d = getChildCount();
        setWeightSum(this.f218803e);
        for (int i17 = 0; i17 < this.f218803e; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15541x39aaabeb c15541x39aaabeb = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15541x39aaabeb(getContext(), null);
            c15541x39aaabeb.m63493x1aa5324b(java.lang.String.valueOf(str.charAt(i17)));
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            layoutParams.gravity = 1;
            addView(c15541x39aaabeb, layoutParams);
        }
    }

    public C15540x683732f0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f218802d = 0;
        this.f218803e = 0;
        this.f218805g = new yz2.b(this);
    }
}
