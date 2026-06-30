package cw2;

/* loaded from: classes15.dex */
public final class w7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.wa f305623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f305624f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f305625g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, cw2.wa waVar, long j17, long j18) {
        super(0);
        this.f305622d = c15188xd8bd4bd;
        this.f305623e = waVar;
        this.f305624f = j17;
        this.f305625g = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cw2.i9 lifecycle = this.f305622d.getLifecycle();
        if (lifecycle != null) {
            cw2.fb.w(lifecycle, this.f305623e.f305630d, ((int) this.f305624f) / 1000, ((int) this.f305625g) / 1000, null, 8, null);
        }
        return jz5.f0.f384359a;
    }
}
