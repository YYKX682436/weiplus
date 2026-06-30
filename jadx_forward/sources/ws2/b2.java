package ws2;

/* loaded from: classes15.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 f530544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.wa f530545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f530546f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f530547g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9, cw2.wa waVar, long j17, long j18) {
        super(0);
        this.f530544d = c14932xfc4acec9;
        this.f530545e = waVar;
        this.f530546f = j17;
        this.f530547g = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cw2.fb lifecycle = this.f530544d.getLifecycle();
        if (lifecycle != null) {
            cw2.fb.w(lifecycle, this.f530545e.f305630d, ((int) this.f530546f) / 1000, ((int) this.f530547g) / 1000, null, 8, null);
        }
        return jz5.f0.f384359a;
    }
}
