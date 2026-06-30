package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f192251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 f192252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f192253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f192254g;

    public x3(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 activityC13958x14958e88, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, boolean z17) {
        this.f192251d = i17;
        this.f192252e = activityC13958x14958e88;
        this.f192253f = f0Var;
        this.f192254g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f192253f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 activityC13958x14958e88 = this.f192252e;
        int i17 = this.f192251d;
        if (i17 != 0) {
            ym5.s3 s3Var = new ym5.s3(1);
            s3Var.f545054f = activityC13958x14958e88.f190800y != 0;
            int i18 = f0Var.f391649d;
            s3Var.f545055g = i18 - i17 <= 0;
            s3Var.f545056h = i18 - i17;
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = activityC13958x14958e88.E;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc00.mo56054xc12c74c0(s3Var);
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = activityC13958x14958e88.E;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc002.N(f0Var.f391649d);
        }
        if (this.f192254g) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC13958x14958e88.F;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$onCgiBack$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$onCgiBack$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
