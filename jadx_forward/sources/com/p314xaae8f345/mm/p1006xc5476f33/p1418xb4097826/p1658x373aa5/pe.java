package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class pe {

    /* renamed from: a, reason: collision with root package name */
    public final android.text.SpannableString f214360a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f214361b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc f214362c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f214363d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f214364e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f214365f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f214366g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f214367h;

    /* renamed from: i, reason: collision with root package name */
    public final int f214368i;

    /* renamed from: j, reason: collision with root package name */
    public final int f214369j;

    public pe(android.text.SpannableString nickname, java.lang.String timeString, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc, boolean z17, boolean z18, java.util.List list, boolean z19, java.util.List list2, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeString, "timeString");
        this.f214360a = nickname;
        this.f214361b = timeString;
        this.f214362c = c19780xceb4c4dc;
        this.f214363d = z17;
        this.f214364e = z18;
        this.f214365f = list;
        this.f214366g = z19;
        this.f214367h = list2;
        this.f214368i = i17;
        this.f214369j = i18;
    }

    /* renamed from: equals */
    public boolean m62861xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pe)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pe peVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pe) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f214360a, peVar.f214360a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f214361b, peVar.f214361b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f214362c, peVar.f214362c) && this.f214363d == peVar.f214363d && this.f214364e == peVar.f214364e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f214365f, peVar.f214365f) && this.f214366g == peVar.f214366g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f214367h, peVar.f214367h) && this.f214368i == peVar.f214368i && this.f214369j == peVar.f214369j;
    }

    /* renamed from: hashCode */
    public int m62862x8cdac1b() {
        int hashCode = ((this.f214360a.hashCode() * 31) + this.f214361b.hashCode()) * 31;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = this.f214362c;
        int hashCode2 = (((((hashCode + (c19780xceb4c4dc == null ? 0 : c19780xceb4c4dc.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f214363d)) * 31) + java.lang.Boolean.hashCode(this.f214364e)) * 31;
        java.util.List list = this.f214365f;
        int hashCode3 = (((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f214366g)) * 31;
        java.util.List list2 = this.f214367h;
        return ((((hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f214368i)) * 31) + java.lang.Integer.hashCode(this.f214369j);
    }

    /* renamed from: toString */
    public java.lang.String m62863x9616526c() {
        return "FinderMentionTitleData(nickname=" + ((java.lang.Object) this.f214360a) + ", timeString=" + this.f214361b + ", authInfo=" + this.f214362c + ", showFinderLogo=" + this.f214363d + ", showFollowBtn=" + this.f214364e + ", interactionLabels=" + this.f214365f + ", isOverlap=" + this.f214366g + ", aggregatedContactList=" + this.f214367h + ", aggregatedCount=" + this.f214368i + ", mentionType=" + this.f214369j + ')';
    }
}
