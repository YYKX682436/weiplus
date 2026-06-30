package wo4;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.g f529775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f529776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 f529777f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(wo4.g gVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var) {
        super(2);
        this.f529775d = gVar;
        this.f529776e = i17;
        this.f529777f = p0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        byte[] bArr = (byte[]) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1) this.f529777f;
        wo4.g gVar = this.f529775d;
        gVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFrameDecode: ");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        sb6.append(", pts:");
        sb6.append(longValue);
        sb6.append(", index:");
        sb6.append(this.f529776e);
        sb6.append(", materialStart:");
        sb6.append(p1Var.f257241a);
        sb6.append(", materialEnd:");
        sb6.append(p1Var.f257242b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", sb6.toString());
        long j17 = gVar.E;
        if (j17 > 0) {
            long j18 = longValue - j17;
            if (j18 > 0) {
                long j19 = j18 / 1000;
                gVar.D = j19;
                if (j19 <= 0) {
                    gVar.D = 23L;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "onFrameDecode, currentAudioFrameInterval:" + gVar.D);
        gVar.f529798y.mo50293x3498a0(new wo4.f(longValue, p1Var, gVar, bArr));
        gVar.E = longValue;
        return jz5.f0.f384359a;
    }
}
