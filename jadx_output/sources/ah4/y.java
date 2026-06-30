package ah4;

/* loaded from: classes13.dex */
public class y extends ah4.b {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f5032f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.talkroom.component.v2engine f5031e = new com.tencent.mm.plugin.talkroom.component.v2engine();

    static {
        lg0.p.a();
        ah4.y.class.getClassLoader();
        fp.d0.n("voipMain");
    }

    @Override // ah4.c
    public byte[] C1(int[] iArr, java.lang.String str) {
        return (byte[]) new ah4.v(this, 3000L, null, iArr, str).a(this.f5032f);
    }

    @Override // ah4.c
    public int E5(com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL iLiveConEngineCallback_AIDL, int i17, int i18, int i19, long j17, int[] iArr, int[] iArr2, int i27, java.lang.String[] strArr) {
        short[] sArr = new short[iArr2.length];
        for (int i28 = 0; i28 < iArr2.length; i28++) {
            sArr[i28] = (short) iArr2[i28];
        }
        return ((java.lang.Integer) new ah4.u(this, 3000L, -99999, strArr, iArr2, iLiveConEngineCallback_AIDL, i17, i18, i19, j17, i27).a(this.f5032f)).intValue();
    }

    @Override // ah4.c
    public int F8() {
        return ((java.lang.Integer) new ah4.q(this, 3000L, -99999).a(this.f5032f)).intValue();
    }

    @Override // ah4.c
    public ah4.k H4() {
        return (ah4.k) new ah4.x(this, 3000L, null).a(this.f5032f);
    }

    @Override // ah4.c
    public int I7() {
        return ((java.lang.Integer) new ah4.t(this, 30000L, -99999).a(this.f5032f)).intValue();
    }

    @Override // ah4.c
    public int Nh() {
        return ((java.lang.Integer) new ah4.s(this, 3000L, -99999).a(this.f5032f)).intValue();
    }

    @Override // ah4.c
    public ah4.n Pb(ah4.h hVar) {
        return (ah4.n) new ah4.w(this, 3000L, null, hVar).a(this.f5032f);
    }

    @Override // ah4.c
    public int yh(int i17) {
        return ((java.lang.Integer) new ah4.r(this, 3000L, -99999, i17).a(this.f5032f)).intValue();
    }
}
