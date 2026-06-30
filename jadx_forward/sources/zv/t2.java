package zv;

/* loaded from: classes11.dex */
public final class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d f557644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5500xcde1614 f557645e;

    public t2(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5500xcde1614 c5500xcde1614) {
        this.f557644d = c10465x1b7ee7d;
        this.f557645e = c5500xcde1614;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23413x332f291 c23413x332f291 = this.f557644d.f146723e;
        if (c23413x332f291 != null) {
            java.lang.String liveId = this.f557645e.f135832g.f87975b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveId, "liveId");
            c23413x332f291.m86244xe370be53(liveId, zv.s2.f557635d);
        }
    }
}
