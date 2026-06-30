package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f284495a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f284496b;

    /* renamed from: c, reason: collision with root package name */
    public final int f284497c;

    /* renamed from: d, reason: collision with root package name */
    public final int f284498d;

    /* renamed from: e, reason: collision with root package name */
    public final android.animation.ValueAnimator f284499e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f284500f;

    /* renamed from: g, reason: collision with root package name */
    public final float f284501g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f284502h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f284503i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f284504j;

    /* renamed from: k, reason: collision with root package name */
    public final float f284505k;

    public j(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 newHolder, android.view.View newView, int i17, int i18, android.animation.ValueAnimator animator, android.graphics.Rect rect, float f17, java.lang.Integer num, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newHolder, "newHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newView, "newView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f284495a = newHolder;
        this.f284496b = newView;
        this.f284497c = i17;
        this.f284498d = i18;
        this.f284499e = animator;
        this.f284500f = rect;
        this.f284501g = f17;
        this.f284502h = num;
        this.f284503i = k3Var;
        this.f284504j = view;
        this.f284505k = f18;
    }

    /* renamed from: equals */
    public boolean m79903xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j jVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284495a, jVar.f284495a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284496b, jVar.f284496b) && this.f284497c == jVar.f284497c && this.f284498d == jVar.f284498d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284499e, jVar.f284499e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284500f, jVar.f284500f) && java.lang.Float.compare(this.f284501g, jVar.f284501g) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284502h, jVar.f284502h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284503i, jVar.f284503i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284504j, jVar.f284504j) && java.lang.Float.compare(this.f284505k, jVar.f284505k) == 0;
    }

    /* renamed from: hashCode */
    public int m79904x8cdac1b() {
        int hashCode = ((((((((this.f284495a.hashCode() * 31) + this.f284496b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f284497c)) * 31) + java.lang.Integer.hashCode(this.f284498d)) * 31) + this.f284499e.hashCode()) * 31;
        android.graphics.Rect rect = this.f284500f;
        int hashCode2 = (((hashCode + (rect == null ? 0 : rect.hashCode())) * 31) + java.lang.Float.hashCode(this.f284501g)) * 31;
        java.lang.Integer num = this.f284502h;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f284503i;
        int hashCode4 = (hashCode3 + (k3Var == null ? 0 : k3Var.hashCode())) * 31;
        android.view.View view = this.f284504j;
        return ((hashCode4 + (view != null ? view.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.f284505k);
    }

    /* renamed from: toString */
    public java.lang.String m79905x9616526c() {
        return "RunningAnim(newHolder=" + this.f284495a + ", newView=" + this.f284496b + ", originalWidth=" + this.f284497c + ", originalHeight=" + this.f284498d + ", animator=" + this.f284499e + ", originalClip=" + this.f284500f + ", originalNewAlpha=" + this.f284501g + ", baseTextColor=" + this.f284502h + ", oldHolder=" + this.f284503i + ", oldView=" + this.f284504j + ", oldViewAlpha=" + this.f284505k + ')';
    }
}
