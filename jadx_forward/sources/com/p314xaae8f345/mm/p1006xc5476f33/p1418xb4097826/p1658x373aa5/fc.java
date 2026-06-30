package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class fc {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f213626a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gc f213627b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.xn1 f213628c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f213629d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f213630e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f213631f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f213632g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f213633h;

    /* renamed from: i, reason: collision with root package name */
    public final int f213634i;

    public fc(android.view.View anchorView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gc uiParams, r45.xn1 xn1Var, boolean z17, boolean z18, boolean z19, java.lang.String boxId, java.lang.String likeComment, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        uiParams = (i18 & 2) != 0 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gc((android.graphics.Point) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214317d).mo141623x754a37bb(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.hc.f213763d) : uiParams;
        z18 = (i18 & 16) != 0 ? false : z18;
        z19 = (i18 & 32) != 0 ? false : z19;
        boxId = (i18 & 64) != 0 ? "" : boxId;
        likeComment = (i18 & 128) != 0 ? "" : likeComment;
        i17 = (i18 & 256) != 0 ? 1 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorView, "anchorView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxId, "boxId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeComment, "likeComment");
        this.f213626a = anchorView;
        this.f213627b = uiParams;
        this.f213628c = xn1Var;
        this.f213629d = z17;
        this.f213630e = z18;
        this.f213631f = z19;
        this.f213632g = boxId;
        this.f213633h = likeComment;
        this.f213634i = i17;
    }

    /* renamed from: equals */
    public boolean m62682xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fc fcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fc) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f213626a, fcVar.f213626a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f213627b, fcVar.f213627b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f213628c, fcVar.f213628c) && this.f213629d == fcVar.f213629d && this.f213630e == fcVar.f213630e && this.f213631f == fcVar.f213631f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f213632g, fcVar.f213632g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f213633h, fcVar.f213633h) && this.f213634i == fcVar.f213634i;
    }

    /* renamed from: hashCode */
    public int m62683x8cdac1b() {
        int hashCode = ((this.f213626a.hashCode() * 31) + this.f213627b.m62692x8cdac1b()) * 31;
        r45.xn1 xn1Var = this.f213628c;
        return ((((((((((((hashCode + (xn1Var == null ? 0 : xn1Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f213629d)) * 31) + java.lang.Boolean.hashCode(this.f213630e)) * 31) + java.lang.Boolean.hashCode(this.f213631f)) * 31) + this.f213632g.hashCode()) * 31) + this.f213633h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f213634i);
    }

    /* renamed from: toString */
    public java.lang.String m62684x9616526c() {
        return "PopupMenuConfig(anchorView=" + this.f213626a + ", uiParams=" + this.f213627b + ", contact=" + this.f213628c + ", isAssistant=" + this.f213629d + ", enableCustomMenuColor=" + this.f213630e + ", isBox=" + this.f213631f + ", boxId=" + this.f213632g + ", likeComment=" + this.f213633h + ", source=" + this.f213634i + ')';
    }
}
