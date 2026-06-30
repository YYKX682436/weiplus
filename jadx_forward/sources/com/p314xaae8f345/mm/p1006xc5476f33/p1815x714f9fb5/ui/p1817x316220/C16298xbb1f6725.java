package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.TrackPoint */
/* loaded from: classes15.dex */
public class C16298xbb1f6725 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f226245d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f226246e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f226247f;

    /* renamed from: g, reason: collision with root package name */
    public double f226248g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f226249h;

    /* renamed from: i, reason: collision with root package name */
    public final double f226250i;

    /* renamed from: m, reason: collision with root package name */
    public final double f226251m;

    /* renamed from: n, reason: collision with root package name */
    public final double f226252n;

    /* renamed from: o, reason: collision with root package name */
    public final double f226253o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 f226254p;

    public C16298xbb1f6725(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f226248g = 0.0d;
        this.f226250i = -1.0d;
        this.f226251m = -1.0d;
        this.f226252n = -1.0d;
        this.f226253o = -1.0d;
        this.f226245d = context;
        b(0);
    }

    public void a() {
        this.f226246e.setVisibility(4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 c16319x94a0c128 = this.f226254p;
        if (c16319x94a0c128 != null) {
            c16319x94a0c128.m66007x89c24a19(this.f226246e);
        }
    }

    public final void b(int i17) {
        android.content.Context context = this.f226245d;
        this.f226246e = (android.widget.FrameLayout) android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d2_, null);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f226247f = imageView;
        if (i17 > 0) {
            imageView.setImageResource(i17);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cja);
        }
        this.f226247f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3);
        this.f226247f.setFocusable(true);
        this.f226247f.setFocusableInTouchMode(true);
    }

    /* renamed from: getHeading */
    public double m65963x6d34b9cc() {
        return this.f226248g;
    }

    /* renamed from: getLatOffest */
    public double m65964x6d8d3d80() {
        return this.f226250i - this.f226252n;
    }

    /* renamed from: getLongOffset */
    public double m65965xbee80225() {
        return this.f226251m - this.f226253o;
    }

    /* renamed from: setAvatar */
    public void m65966x47f185b(java.lang.String str) {
        if (str.equals(this.f226249h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackPoint", "skip this set avatar");
            return;
        }
        this.f226249h = str;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni((android.widget.ImageView) this.f226246e.findViewById(com.p314xaae8f345.mm.R.id.f564574v0), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 c16319x94a0c128 = this.f226254p;
        if (c16319x94a0c128 != null) {
            c16319x94a0c128.m66009xf5f903a8(this.f226246e);
        }
    }

    /* renamed from: setHeading */
    public void m65967xe0a60740(double d17) {
        this.f226248g = d17;
    }

    /* renamed from: setOnAvatarOnClickListener */
    public void m65968x23b704c3(android.view.View.OnClickListener onClickListener) {
    }

    /* renamed from: setOnLocationOnClickListener */
    public void m65969xb4a07727(android.view.View.OnClickListener onClickListener) {
    }

    public C16298xbb1f6725(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 c16319x94a0c128) {
        super(context);
        this.f226248g = 0.0d;
        this.f226250i = -1.0d;
        this.f226251m = -1.0d;
        this.f226252n = -1.0d;
        this.f226253o = -1.0d;
        this.f226245d = context;
        this.f226254p = c16319x94a0c128;
        b(0);
    }

    public C16298xbb1f6725(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 c16319x94a0c128, int i17) {
        super(context);
        this.f226248g = 0.0d;
        this.f226250i = -1.0d;
        this.f226251m = -1.0d;
        this.f226252n = -1.0d;
        this.f226253o = -1.0d;
        this.f226245d = context;
        this.f226254p = c16319x94a0c128;
        b(i17);
    }
}
