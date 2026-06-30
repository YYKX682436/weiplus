package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f69860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f69861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.e5 f69862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.MJTemplateInfo f69863g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f69864h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(yz5.l lVar, yz5.l lVar2, com.tencent.mm.mj_template.sns.compose.widget.e5 e5Var, com.tencent.maas.model.MJTemplateInfo mJTemplateInfo, n0.v2 v2Var) {
        super(1);
        this.f69860d = lVar;
        this.f69861e = lVar2;
        this.f69862f = e5Var;
        this.f69863g = mJTemplateInfo;
        this.f69864h = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17;
        s1.z it = (s1.z) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f69864h.setValue(java.lang.Boolean.valueOf(((java.lang.Boolean) this.f69860d.invoke(java.lang.Float.valueOf(d1.e.d(s1.a0.d(it))))).booleanValue()));
        this.f69861e.invoke(this.f69862f);
        this.f69863g.getDisplayName();
        d1.e.d(s1.a0.d(it));
        s1.z i07 = ((u1.c1) it).i0();
        if (i07 != null) {
            j17 = ((u1.c1) i07).s0(it, d1.e.f225623b);
        } else {
            j17 = d1.e.f225623b;
        }
        d1.e.d(j17);
        return jz5.f0.f302826a;
    }
}
