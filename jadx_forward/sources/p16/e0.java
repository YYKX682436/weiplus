package p16;

/* loaded from: classes16.dex */
public class e0 implements p16.e {

    /* renamed from: d, reason: collision with root package name */
    public int f432805d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f432806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p16.f0 f432807f;

    public e0(p16.f0 f0Var, p16.d0 d0Var) {
        this.f432807f = f0Var;
        this.f432806e = f0Var.mo157707x35e001();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f432805d < this.f432806e;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        return java.lang.Byte.valueOf(mo157702x54deae9b());
    }

    @Override // p16.e
    /* renamed from: nextByte */
    public byte mo157702x54deae9b() {
        try {
            byte[] bArr = this.f432807f.f432814e;
            int i17 = this.f432805d;
            this.f432805d = i17 + 1;
            return bArr[i17];
        } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
            throw new java.util.NoSuchElementException(e17.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
