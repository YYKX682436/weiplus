package x6;

/* loaded from: classes13.dex */
public final class f implements x6.a {
    @Override // x6.a
    public int a(java.lang.Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // x6.a
    public int b() {
        return 1;
    }

    @Override // x6.a
    /* renamed from: getTag */
    public java.lang.String mo175052xb5887064() {
        return "ByteArrayPool";
    }

    @Override // x6.a
    /* renamed from: newArray */
    public java.lang.Object mo175053x5070dc99(int i17) {
        return new byte[i17];
    }
}
