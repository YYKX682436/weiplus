package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class h3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f183751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f183752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx2.q f183753f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83, android.view.ViewGroup viewGroup, gx2.q qVar) {
        super(2);
        this.f183751d = c22584xf7d97e83;
        this.f183752e = viewGroup;
        this.f183753f = qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        gx2.q layout = (gx2.q) obj;
        gx2.r action = (gx2.r) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        gx2.r rVar = gx2.r.f358909e;
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = this.f183751d;
        if (action == rVar && c22584xf7d97e83 != null && (abstractActivityC22579xbed01a37 = c22584xf7d97e83.f292654p) != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a(abstractActivityC22579xbed01a37).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).f205647q == 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a(abstractActivityC22579xbed01a37).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).f205647q = 3;
            }
        }
        this.f183752e.removeView(this.f183753f);
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372 = c22584xf7d97e83.f292654p;
        if (abstractActivityC22579xbed01a372 != null) {
            abstractActivityC22579xbed01a372.finish();
        }
        return jz5.f0.f384359a;
    }
}
