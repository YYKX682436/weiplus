package w71;

/* loaded from: classes7.dex */
public final class p1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f524967d = new byte[0];

    public p1() {
        this.f76492x92037252 = new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public int op(int i17, java.lang.Object... objs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objs, "objs");
        if (i17 != 1) {
            return super.op(i17, java.util.Arrays.copyOf(objs, objs.length));
        }
        r45.ie ieVar = this.f76492x92037252;
        return (ieVar != null ? 0 + b36.f.i(1, ieVar.mo75928xcd1e8d8()) : 0) + this.f524967d.length;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.f524967d = bArr;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toByteArray */
    public byte[] mo14344x5f01b1f6() {
        int i17;
        mo75964xab491916();
        byte[] bArr = new byte[mo75928xcd1e8d8()];
        g36.f fVar = new g36.f(bArr);
        r45.ie ieVar = this.f76492x92037252;
        if (ieVar != null) {
            fVar.i(1, ieVar.mo75928xcd1e8d8());
            this.f76492x92037252.mo75956x3d5d1f78(fVar);
            i17 = b36.f.i(1, this.f76492x92037252.mo75928xcd1e8d8());
        } else {
            i17 = 0;
        }
        byte[] bArr2 = this.f524967d;
        java.lang.System.arraycopy(bArr2, 0, bArr, i17, bArr2.length);
        return bArr;
    }
}
