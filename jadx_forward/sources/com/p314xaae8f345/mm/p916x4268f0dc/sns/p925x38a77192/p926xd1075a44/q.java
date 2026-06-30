package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.p f151707a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f151708b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f151709c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f151710d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f151711e;

    /* renamed from: f, reason: collision with root package name */
    public final int f151712f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f151713g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f151714h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f151715i;

    /* renamed from: j, reason: collision with root package name */
    public final z.h0 f151716j;

    public q(yz5.p contentCompose, yz5.a targetHeightPxOnOpenGetter, yz5.a targetHeightPxOnCloseGetter, yz5.a availableScreenHeightPxGetter, boolean z17, int i17, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, z.h0 customEasing) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentCompose, "contentCompose");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetHeightPxOnOpenGetter, "targetHeightPxOnOpenGetter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetHeightPxOnCloseGetter, "targetHeightPxOnCloseGetter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(availableScreenHeightPxGetter, "availableScreenHeightPxGetter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customEasing, "customEasing");
        this.f151707a = contentCompose;
        this.f151708b = targetHeightPxOnOpenGetter;
        this.f151709c = targetHeightPxOnCloseGetter;
        this.f151710d = availableScreenHeightPxGetter;
        this.f151711e = z17;
        this.f151712f = i17;
        this.f151713g = lVar;
        this.f151714h = lVar2;
        this.f151715i = lVar3;
        this.f151716j = customEasing;
    }

    /* renamed from: equals */
    public boolean m47523xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.q)) {
            return false;
        }
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.q qVar = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151707a, qVar.f151707a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151708b, qVar.f151708b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151709c, qVar.f151709c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151710d, qVar.f151710d) && this.f151711e == qVar.f151711e && this.f151712f == qVar.f151712f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151713g, qVar.f151713g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151714h, qVar.f151714h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151715i, qVar.f151715i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151716j, qVar.f151716j);
    }

    /* renamed from: hashCode */
    public int m47524x8cdac1b() {
        int hashCode = ((((((((((this.f151707a.hashCode() * 31) + this.f151708b.hashCode()) * 31) + this.f151709c.hashCode()) * 31) + this.f151710d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f151711e)) * 31) + java.lang.Integer.hashCode(this.f151712f)) * 31;
        yz5.l lVar = this.f151713g;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        yz5.l lVar2 = this.f151714h;
        int hashCode3 = (hashCode2 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        yz5.l lVar3 = this.f151715i;
        return ((hashCode3 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31) + this.f151716j.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m47525x9616526c() {
        return "ArgumentsForAnimationValueBottomSheetContent(contentCompose=" + this.f151707a + ", targetHeightPxOnOpenGetter=" + this.f151708b + ", targetHeightPxOnCloseGetter=" + this.f151709c + ", availableScreenHeightPxGetter=" + this.f151710d + ", isVisible=" + this.f151711e + ", animDuration=" + this.f151712f + ", animStartCallback=" + this.f151713g + ", animFinishCallback=" + this.f151714h + ", onRemainHeightUpdate=" + this.f151715i + ", customEasing=" + this.f151716j + ')';
    }

    public /* synthetic */ q(yz5.p pVar, yz5.a aVar, yz5.a aVar2, yz5.a aVar3, boolean z17, int i17, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, z.h0 h0Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(pVar, aVar, aVar2, aVar3, z17, (i18 & 32) != 0 ? 300 : i17, lVar, lVar2, lVar3, (i18 & 512) != 0 ? z.j0.f550238b : h0Var);
    }
}
