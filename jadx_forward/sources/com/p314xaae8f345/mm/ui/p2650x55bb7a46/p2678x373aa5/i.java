package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.animation.ValueAnimator f284489a;

    /* renamed from: b, reason: collision with root package name */
    public final long f284490b;

    /* renamed from: c, reason: collision with root package name */
    public int f284491c;

    public i(android.animation.ValueAnimator animator, long j17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 4) != 0 ? -1 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f284489a = animator;
        this.f284490b = j17;
        this.f284491c = i17;
    }

    /* renamed from: equals */
    public boolean m79900xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i iVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284489a, iVar.f284489a) && this.f284490b == iVar.f284490b && this.f284491c == iVar.f284491c;
    }

    /* renamed from: hashCode */
    public int m79901x8cdac1b() {
        return (((this.f284489a.hashCode() * 31) + java.lang.Long.hashCode(this.f284490b)) * 31) + java.lang.Integer.hashCode(this.f284491c);
    }

    /* renamed from: toString */
    public java.lang.String m79902x9616526c() {
        return "LoadingSpanController(animator=" + this.f284489a + ", msgId=" + this.f284490b + ", lastStart=" + this.f284491c + ')';
    }
}
