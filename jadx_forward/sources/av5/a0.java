package av5;

/* loaded from: classes16.dex */
public class a0 implements cv5.a {

    /* renamed from: a, reason: collision with root package name */
    public int f95886a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ av5.b0 f95887b;

    public a0(av5.b0 b0Var) {
        this.f95887b = b0Var;
    }

    @Override // cv5.a
    /* renamed from: readByte */
    public byte mo9119xcc4273be() {
        byte[] bArr = this.f95887b.f95889e;
        int i17 = this.f95886a;
        this.f95886a = i17 + 1;
        return bArr[i17];
    }
}
