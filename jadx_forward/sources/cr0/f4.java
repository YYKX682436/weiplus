package cr0;

/* loaded from: classes12.dex */
public final class f4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f303159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f303160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(long j17, long j18) {
        super(1);
        this.f303159d = j17;
        this.f303160e = j18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long j17 = ((com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10873xa9ee8cad) obj).f150229i;
        return java.lang.Boolean.valueOf(this.f303159d <= j17 && j17 <= this.f303160e);
    }
}
