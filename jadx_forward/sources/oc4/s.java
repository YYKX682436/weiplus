package oc4;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f425899a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f425900b;

    /* renamed from: c, reason: collision with root package name */
    public xc4.p f425901c;

    public s(boolean z17, boolean z18, xc4.p pVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z18 = (i17 & 2) != 0 ? false : z18;
        pVar = (i17 & 4) != 0 ? null : pVar;
        this.f425899a = z17;
        this.f425900b = z18;
        this.f425901c = pVar;
    }

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        boolean z17 = this.f425899a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return z17;
    }

    public final boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        boolean z17 = this.f425900b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return z17;
    }

    public final xc4.p c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        xc4.p pVar = this.f425901c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return pVar;
    }

    /* renamed from: equals */
    public boolean m151039xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
            return true;
        }
        if (!(obj instanceof oc4.s)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
            return false;
        }
        oc4.s sVar = (oc4.s) obj;
        if (this.f425899a != sVar.f425899a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
            return false;
        }
        if (this.f425900b != sVar.f425900b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425901c, sVar.f425901c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return b17;
    }

    /* renamed from: hashCode */
    public int m151040x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        int hashCode = ((java.lang.Boolean.hashCode(this.f425899a) * 31) + java.lang.Boolean.hashCode(this.f425900b)) * 31;
        xc4.p pVar = this.f425901c;
        int hashCode2 = hashCode + (pVar == null ? 0 : pVar.hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m151041x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        java.lang.String str = "SnsUnreadPair(expose=" + this.f425899a + ", indicator=" + this.f425900b + ", info=" + this.f425901c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return str;
    }
}
