package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class e9 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f205194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f205195c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f205196d;

    public e9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, boolean z17) {
        this.f205193a = obVar;
        this.f205194b = c19786x6a1e2862;
        this.f205195c = c0Var;
        this.f205196d = z17;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205193a;
            long longExtra = obVar.m158359x1e885992().getLongExtra("finder_from_feed_id", 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t2 t2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t2.f206896a;
            android.app.Activity m80379x76847179 = obVar.m80379x76847179();
            java.lang.String m58741x6c03c64c = obVar.m58741x6c03c64c();
            java.lang.String m76523x98b23862 = this.f205194b.m76523x98b23862();
            if (m76523x98b23862 == null) {
                m76523x98b23862 = "";
            }
            t2Var.c(m80379x76847179, m58741x6c03c64c, false, m76523x98b23862, this.f205195c.f391645d, longExtra, this.f205196d);
        }
    }
}
