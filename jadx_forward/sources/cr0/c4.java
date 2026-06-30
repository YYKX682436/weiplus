package cr0;

/* loaded from: classes12.dex */
public final class c4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f303135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(long j17, int i17) {
        super(1);
        this.f303135d = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long j17 = this.f303135d;
        long j18 = j17 - 600000;
        long j19 = ((com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10873xa9ee8cad) obj).f150229i;
        return java.lang.Boolean.valueOf(j18 <= j19 && j19 <= j17);
    }
}
