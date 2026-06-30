package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class vw extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yw f104816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f104817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dm.pd f104818c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f104820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f104821f;

    public vw(com.tencent.mm.plugin.finder.convert.yw ywVar, android.content.Context context, dm.pd pdVar, kotlin.jvm.internal.h0 h0Var, java.util.ArrayList arrayList, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout) {
        this.f104816a = ywVar;
        this.f104817b = context;
        this.f104818c = pdVar;
        this.f104819d = h0Var;
        this.f104820e = arrayList;
        this.f104821f = refreshLoadMoreLayout;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mm.plugin.finder.convert.kp kpVar = this.f104816a.f105066e;
        int i18 = kpVar.f103851a;
        int i19 = kpVar.f103852b;
        android.content.Context context = this.f104817b;
        java.lang.String e17 = xy2.c.e(context);
        long j17 = this.f104818c.field_svrMentionId;
        kotlin.jvm.internal.h0 h0Var = this.f104819d;
        new bq.a(i18, i19, e17, j17, (com.tencent.mm.protobuf.g) h0Var.f310123d).l().K(new com.tencent.mm.plugin.finder.convert.uw(h0Var, this.f104820e, this.f104821f, context));
    }
}
