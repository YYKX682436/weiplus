package av5;

/* loaded from: classes16.dex */
public class a0 implements cv5.a {

    /* renamed from: a, reason: collision with root package name */
    public int f14353a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ av5.b0 f14354b;

    public a0(av5.b0 b0Var) {
        this.f14354b = b0Var;
    }

    @Override // cv5.a
    public byte readByte() {
        byte[] bArr = this.f14354b.f14356e;
        int i17 = this.f14353a;
        this.f14353a = i17 + 1;
        return bArr[i17];
    }
}
