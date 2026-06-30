package qk;

/* loaded from: classes7.dex */
public final class s9 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f445861d;

    public s9(byte[] rawData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawData, "rawData");
        this.f445861d = rawData;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public int op(int i17, java.lang.Object... objs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objs, "objs");
        if (i17 != 1) {
            return super.op(i17, java.util.Arrays.copyOf(objs, objs.length));
        }
        r45.he heVar = this.f76494x2de60e5e;
        return (heVar != null ? 0 + b36.f.i(1, heVar.mo75928xcd1e8d8()) : 0) + this.f445861d.length;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toByteArray */
    public byte[] mo14344x5f01b1f6() {
        int i17;
        mo75964xab491916();
        byte[] bArr = new byte[mo75928xcd1e8d8()];
        g36.f fVar = new g36.f(bArr);
        r45.he heVar = this.f76494x2de60e5e;
        if (heVar != null) {
            fVar.i(1, heVar.mo75928xcd1e8d8());
            this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            i17 = b36.f.i(1, this.f76494x2de60e5e.mo75928xcd1e8d8());
        } else {
            i17 = 0;
        }
        byte[] bArr2 = this.f445861d;
        java.lang.System.arraycopy(bArr2, 0, bArr, i17, bArr2.length);
        return bArr;
    }
}
