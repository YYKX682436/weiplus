package r45;

/* loaded from: classes7.dex */
public class fe extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f455782d;

    public fe(byte[] bArr) {
        this.f455782d = bArr;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public int op(int i17, java.lang.Object... objArr) {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toByteArray */
    public byte[] mo14344x5f01b1f6() {
        mo75964xab491916();
        int mo75928xcd1e8d8 = this.f76494x2de60e5e.mo75928xcd1e8d8();
        int i17 = b36.f.i(1, mo75928xcd1e8d8);
        byte[] bArr = new byte[i17];
        g36.f fVar = new g36.f(bArr);
        fVar.i(1, mo75928xcd1e8d8);
        this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
        byte[] bArr2 = this.f455782d;
        byte[] bArr3 = new byte[bArr2.length + i17];
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, i17);
        java.lang.System.arraycopy(bArr2, 0, bArr3, i17, bArr2.length);
        return bArr3;
    }
}
