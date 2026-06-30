package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ur extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.wr f104732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f104733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104734c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f104735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104736e;

    public ur(com.tencent.mm.plugin.finder.convert.wr wrVar, android.widget.LinearLayout linearLayout, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f104732a = wrVar;
        this.f104733b = linearLayout;
        this.f104734c = h0Var;
        this.f104735d = f0Var;
        this.f104736e = h0Var2;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.Object tag = this.f104733b.getTag();
        com.tencent.mm.plugin.finder.convert.wr wrVar = this.f104732a;
        wrVar.getClass();
        int intValue = (tag == null || !(tag instanceof java.lang.Integer)) ? -1 : ((java.lang.Number) tag).intValue();
        if (z17) {
            java.util.List list = (java.util.List) this.f104734c.f310123d;
            int i17 = 0;
            java.lang.String str = "";
            if (!(list == null || list.isEmpty())) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    int i18 = i17 + 1;
                    str = str + pm0.v.u(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId());
                    if (i17 < list.size() - 1) {
                        str = str + ';';
                    }
                    i17 = i18;
                }
            }
            com.tencent.mm.plugin.finder.report.y3.a(com.tencent.mm.plugin.finder.report.y3.f125472a, wrVar.f104898e, 1, c01.id.c(), intValue, this.f104735d.f310116d, (java.lang.String) this.f104736e.f310123d, null, str, 64, null);
        }
        com.tencent.mm.autogen.events.FinderShareGuideShowEvent finderShareGuideShowEvent = new com.tencent.mm.autogen.events.FinderShareGuideShowEvent();
        am.dd ddVar = finderShareGuideShowEvent.f54324g;
        ddVar.f6443a = intValue - 1;
        ddVar.f6444b = z17 ? 1 : 0;
        finderShareGuideShowEvent.e();
    }
}
