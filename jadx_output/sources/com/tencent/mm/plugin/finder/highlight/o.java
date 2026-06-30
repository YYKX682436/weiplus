package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public final class o implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.highlight.p f111453a;

    public o(com.tencent.mm.plugin.finder.highlight.p pVar) {
        this.f111453a = pVar;
    }

    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 rvData) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(rvData, "rvData");
        com.tencent.mm.plugin.finder.highlight.p pVar = this.f111453a;
        pVar.getClass();
        int i17 = 0;
        for (java.lang.Object obj : rvData.f293156i) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            in5.c cVar = ((in5.x0) obj).f293158a;
            if (cVar instanceof com.tencent.mm.plugin.finder.highlight.d) {
                pVar.a(((com.tencent.mm.plugin.finder.highlight.d) cVar).f111427d, "view_exp");
            }
            i17 = i18;
        }
    }
}
