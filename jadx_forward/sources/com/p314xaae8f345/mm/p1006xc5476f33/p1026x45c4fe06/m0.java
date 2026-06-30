package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f167212a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f167213b;

    /* renamed from: c, reason: collision with root package name */
    public final int f167214c;

    /* renamed from: d, reason: collision with root package name */
    public final int f167215d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.CharSequence f167216e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.CharSequence f167217f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f167218g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f167219h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 f167220i;

    public m0(java.lang.String title, java.lang.String pagFileName, int i17, int i18, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 p3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagFileName, "pagFileName");
        this.f167212a = title;
        this.f167213b = pagFileName;
        this.f167214c = i17;
        this.f167215d = i18;
        this.f167216e = charSequence;
        this.f167217f = charSequence2;
        this.f167218g = charSequence3;
        this.f167219h = z17;
        this.f167220i = p3Var;
    }

    /* renamed from: equals */
    public boolean m51931xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f167212a, m0Var.f167212a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f167213b, m0Var.f167213b) && this.f167214c == m0Var.f167214c && this.f167215d == m0Var.f167215d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f167216e, m0Var.f167216e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f167217f, m0Var.f167217f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f167218g, m0Var.f167218g) && this.f167219h == m0Var.f167219h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f167220i, m0Var.f167220i);
    }

    /* renamed from: hashCode */
    public int m51932x8cdac1b() {
        int hashCode = ((((((this.f167212a.hashCode() * 31) + this.f167213b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f167214c)) * 31) + java.lang.Integer.hashCode(this.f167215d)) * 31;
        java.lang.CharSequence charSequence = this.f167216e;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        java.lang.CharSequence charSequence2 = this.f167217f;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        java.lang.CharSequence charSequence3 = this.f167218g;
        int hashCode4 = (((hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f167219h)) * 31;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 p3Var = this.f167220i;
        return hashCode4 + (p3Var != null ? p3Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m51933x9616526c() {
        return "GuideInfo(title=" + this.f167212a + ", pagFileName=" + this.f167213b + ", repeatCount=" + this.f167214c + ", btnType=" + this.f167215d + ", singleBtnText=" + ((java.lang.Object) this.f167216e) + ", leftBtnText=" + ((java.lang.Object) this.f167217f) + ", rightBtnText=" + ((java.lang.Object) this.f167218g) + ", cancelable=" + this.f167219h + ", rightBtnCallBack=" + this.f167220i + ')';
    }
}
