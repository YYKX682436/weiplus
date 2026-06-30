package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j f284468a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f284469b;

    /* renamed from: c, reason: collision with root package name */
    public final int f284470c;

    /* renamed from: d, reason: collision with root package name */
    public final float f284471d;

    public g(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j anim, android.graphics.Rect rect, int i17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        this.f284468a = anim;
        this.f284469b = rect;
        this.f284470c = i17;
        this.f284471d = f17;
    }

    /* renamed from: equals */
    public boolean m79897xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.g)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.g gVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284468a, gVar.f284468a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284469b, gVar.f284469b) && this.f284470c == gVar.f284470c && java.lang.Float.compare(this.f284471d, gVar.f284471d) == 0;
    }

    /* renamed from: hashCode */
    public int m79898x8cdac1b() {
        int m79904x8cdac1b = this.f284468a.m79904x8cdac1b() * 31;
        android.graphics.Rect rect = this.f284469b;
        return ((((m79904x8cdac1b + (rect == null ? 0 : rect.hashCode())) * 31) + java.lang.Integer.hashCode(this.f284470c)) * 31) + java.lang.Float.hashCode(this.f284471d);
    }

    /* renamed from: toString */
    public java.lang.String m79899x9616526c() {
        return "CancelledAnimInfo(anim=" + this.f284468a + ", clipAtCancel=" + this.f284469b + ", layoutWidthAtCancel=" + this.f284470c + ", textColorProgressAtCancel=" + this.f284471d + ')';
    }
}
