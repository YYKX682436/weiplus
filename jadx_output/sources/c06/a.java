package c06;

/* loaded from: classes12.dex */
public abstract class a extends c06.e {
    @Override // c06.e
    public int a(int i17) {
        return ((-i17) >> 31) & (i().nextInt() >>> (32 - i17));
    }

    @Override // c06.e
    public float b() {
        return i().nextFloat();
    }

    @Override // c06.e
    public int c() {
        return i().nextInt();
    }

    @Override // c06.e
    public int d(int i17) {
        return i().nextInt(i17);
    }

    @Override // c06.e
    public long f() {
        return i().nextLong();
    }

    public abstract java.util.Random i();
}
