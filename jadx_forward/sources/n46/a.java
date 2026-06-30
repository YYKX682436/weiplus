package n46;

/* loaded from: classes13.dex */
public class a extends j46.a {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f416621v = 0;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f416622s;

    /* renamed from: t, reason: collision with root package name */
    public final int f416623t;

    /* renamed from: u, reason: collision with root package name */
    public long f416624u;

    public a(java.io.InputStream inputStream, int i17) {
        super(inputStream, java.nio.ByteOrder.LITTLE_ENDIAN);
        int a17 = (int) this.f379251f.a(8);
        int a18 = (int) this.f379251f.a(8);
        int a19 = (int) this.f379251f.a(8);
        if (a17 != 31 || a18 != 157 || a19 < 0) {
            throw new java.io.IOException("Input is not in .Z format");
        }
        boolean z17 = (a19 & 128) != 0;
        this.f416622s = z17;
        int i18 = a19 & 31;
        this.f416623t = i18;
        if (z17) {
            this.f379252g = 256;
        }
        if (i18 <= 0) {
            throw new java.lang.IllegalArgumentException("maxCodeSize is " + i18 + ", must be bigger than 0");
        }
        if (i17 > -1) {
            long j17 = ((1 << i18) * 6) >> 10;
            if (j17 > i17) {
                throw new z36.a(j17, i17);
            }
        }
        if (i18 <= 0) {
            throw new java.lang.IllegalArgumentException("maxCodeSize is " + i18 + ", must be bigger than 0");
        }
        int i19 = 1 << i18;
        this.f379257o = new int[i19];
        this.f379258p = new byte[i19];
        this.f379259q = new byte[i19];
        this.f379260r = i19;
        for (int i27 = 0; i27 < 256; i27++) {
            this.f379257o[i27] = -1;
            this.f379258p[i27] = (byte) i27;
        }
        this.f379256n = (this.f416622s ? 1 : 0) + 256;
    }

    public int b(int i17, byte b17) {
        int i18 = this.f379253h;
        int i19 = 1 << i18;
        int i27 = this.f379256n;
        if (i27 < i19) {
            this.f379257o[i27] = i17;
            this.f379258p[i27] = b17;
            this.f379256n = i27 + 1;
        } else {
            i27 = -1;
        }
        if (this.f379256n == i19 && i18 < this.f416623t) {
            c();
            this.f379253h++;
        }
        return i27;
    }

    public final void c() {
        long j17;
        long j18 = 8 - (this.f416624u % 8);
        if (j18 == 8) {
            j18 = 0;
            j17 = 0;
        } else {
            j17 = 0;
        }
        while (j17 < j18) {
            f();
            j17++;
        }
        r46.a aVar = this.f379251f;
        aVar.f474031f = 0L;
        aVar.f474032g = 0;
    }

    public int f() {
        int i17 = this.f379253h;
        if (i17 > 31) {
            throw new java.lang.IllegalArgumentException("Code size must not be bigger than 31");
        }
        int a17 = (int) this.f379251f.a(i17);
        if (a17 >= 0) {
            this.f416624u++;
        }
        return a17;
    }
}
