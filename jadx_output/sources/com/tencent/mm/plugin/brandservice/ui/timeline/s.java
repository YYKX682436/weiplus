package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public final class s implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f94503d;

    public s(java.util.List list) {
        this.f94503d = list;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = 0;
        for (java.lang.Object obj : this.f94503d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            g4Var.t(i17, ((com.tencent.mm.plugin.brandservice.ui.timeline.a) obj).f94095a, false);
            i17 = i18;
        }
    }
}
