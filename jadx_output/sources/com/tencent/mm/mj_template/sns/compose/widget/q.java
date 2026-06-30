package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.p f70174a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f70175b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f70176c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f70177d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f70178e;

    /* renamed from: f, reason: collision with root package name */
    public final int f70179f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f70180g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f70181h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f70182i;

    /* renamed from: j, reason: collision with root package name */
    public final z.h0 f70183j;

    public q(yz5.p contentCompose, yz5.a targetHeightPxOnOpenGetter, yz5.a targetHeightPxOnCloseGetter, yz5.a availableScreenHeightPxGetter, boolean z17, int i17, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, z.h0 customEasing) {
        kotlin.jvm.internal.o.g(contentCompose, "contentCompose");
        kotlin.jvm.internal.o.g(targetHeightPxOnOpenGetter, "targetHeightPxOnOpenGetter");
        kotlin.jvm.internal.o.g(targetHeightPxOnCloseGetter, "targetHeightPxOnCloseGetter");
        kotlin.jvm.internal.o.g(availableScreenHeightPxGetter, "availableScreenHeightPxGetter");
        kotlin.jvm.internal.o.g(customEasing, "customEasing");
        this.f70174a = contentCompose;
        this.f70175b = targetHeightPxOnOpenGetter;
        this.f70176c = targetHeightPxOnCloseGetter;
        this.f70177d = availableScreenHeightPxGetter;
        this.f70178e = z17;
        this.f70179f = i17;
        this.f70180g = lVar;
        this.f70181h = lVar2;
        this.f70182i = lVar3;
        this.f70183j = customEasing;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.mj_template.sns.compose.widget.q)) {
            return false;
        }
        com.tencent.mm.mj_template.sns.compose.widget.q qVar = (com.tencent.mm.mj_template.sns.compose.widget.q) obj;
        return kotlin.jvm.internal.o.b(this.f70174a, qVar.f70174a) && kotlin.jvm.internal.o.b(this.f70175b, qVar.f70175b) && kotlin.jvm.internal.o.b(this.f70176c, qVar.f70176c) && kotlin.jvm.internal.o.b(this.f70177d, qVar.f70177d) && this.f70178e == qVar.f70178e && this.f70179f == qVar.f70179f && kotlin.jvm.internal.o.b(this.f70180g, qVar.f70180g) && kotlin.jvm.internal.o.b(this.f70181h, qVar.f70181h) && kotlin.jvm.internal.o.b(this.f70182i, qVar.f70182i) && kotlin.jvm.internal.o.b(this.f70183j, qVar.f70183j);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f70174a.hashCode() * 31) + this.f70175b.hashCode()) * 31) + this.f70176c.hashCode()) * 31) + this.f70177d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f70178e)) * 31) + java.lang.Integer.hashCode(this.f70179f)) * 31;
        yz5.l lVar = this.f70180g;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        yz5.l lVar2 = this.f70181h;
        int hashCode3 = (hashCode2 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        yz5.l lVar3 = this.f70182i;
        return ((hashCode3 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31) + this.f70183j.hashCode();
    }

    public java.lang.String toString() {
        return "ArgumentsForAnimationValueBottomSheetContent(contentCompose=" + this.f70174a + ", targetHeightPxOnOpenGetter=" + this.f70175b + ", targetHeightPxOnCloseGetter=" + this.f70176c + ", availableScreenHeightPxGetter=" + this.f70177d + ", isVisible=" + this.f70178e + ", animDuration=" + this.f70179f + ", animStartCallback=" + this.f70180g + ", animFinishCallback=" + this.f70181h + ", onRemainHeightUpdate=" + this.f70182i + ", customEasing=" + this.f70183j + ')';
    }

    public /* synthetic */ q(yz5.p pVar, yz5.a aVar, yz5.a aVar2, yz5.a aVar3, boolean z17, int i17, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, z.h0 h0Var, int i18, kotlin.jvm.internal.i iVar) {
        this(pVar, aVar, aVar2, aVar3, z17, (i18 & 32) != 0 ? 300 : i17, lVar, lVar2, lVar3, (i18 & 512) != 0 ? z.j0.f468705b : h0Var);
    }
}
