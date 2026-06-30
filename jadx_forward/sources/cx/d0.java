package cx;

/* loaded from: classes7.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx.f0 f305926e;

    public d0(java.lang.String str, cx.f0 f0Var) {
        this.f305925d = str;
        this.f305926e = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jc3.j0 j0Var;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305925d, "brandServiceBoxClick")) {
            int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a;
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            java.lang.String valueOf = java.lang.String.valueOf(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16455x3f8428aa enumC16455x3f8428aa = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16455x3f8428aa.f37610xc8814b8;
            iVar.Sc("MagicAdBrandServiceEnterByClick", 1, valueOf, enumC16455x3f8428aa.getValue());
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicAdBrandServiceCardNum", ((java.util.LinkedList) ((vw.b) ((rv.p2) i95.n0.c(rv.p2.class))).wi(1)).size(), java.lang.String.valueOf(i17), enumC16455x3f8428aa.getValue());
            i95.m c17 = i95.n0.c(je3.i.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            je3.i iVar2 = (je3.i) c17;
            cx.w0 w0Var = this.f305926e.f305955e;
            je3.i.x2(iVar2, "MagicAdBrandServiceStatusOnClick", (w0Var == null || (j0Var = w0Var.f364528g) == null) ? 0 : ((rc3.w0) j0Var).f475632t, java.lang.String.valueOf(i17), 0.0f, 8, null);
        }
    }
}
