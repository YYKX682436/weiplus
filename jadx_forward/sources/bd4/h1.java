package bd4;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f100886a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f100887b;

    public h1(java.lang.String left, java.lang.String right) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(left, "left");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(right, "right");
        this.f100886a = left;
        this.f100887b = right;
    }

    /* renamed from: equals */
    public boolean m10196xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
            return true;
        }
        if (!(obj instanceof bd4.h1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
            return false;
        }
        bd4.h1 h1Var = (bd4.h1) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f100886a, h1Var.f100886a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f100887b, h1Var.f100887b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
        return b17;
    }

    /* renamed from: hashCode */
    public int m10197x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
        int hashCode = (this.f100886a.hashCode() * 31) + this.f100887b.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m10198x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
        java.lang.String str = "PunctuationPair(left=" + this.f100886a + ", right=" + this.f100887b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
        return str;
    }
}
