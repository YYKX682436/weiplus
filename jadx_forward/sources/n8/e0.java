package n8;

/* loaded from: classes15.dex */
public final class e0 implements n8.f {

    /* renamed from: d, reason: collision with root package name */
    public n8.d0 f417043d;

    /* renamed from: g, reason: collision with root package name */
    public java.nio.ByteBuffer f417046g;

    /* renamed from: h, reason: collision with root package name */
    public java.nio.ShortBuffer f417047h;

    /* renamed from: i, reason: collision with root package name */
    public java.nio.ByteBuffer f417048i;

    /* renamed from: j, reason: collision with root package name */
    public long f417049j;

    /* renamed from: k, reason: collision with root package name */
    public long f417050k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f417051l;

    /* renamed from: e, reason: collision with root package name */
    public float f417044e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f417045f = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f417041b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f417042c = -1;

    public e0() {
        java.nio.ByteBuffer byteBuffer = n8.f.f417052a;
        this.f417046g = byteBuffer;
        this.f417047h = byteBuffer.asShortBuffer();
        this.f417048i = byteBuffer;
    }

    @Override // n8.f
    public boolean a() {
        return java.lang.Math.abs(this.f417044e - 1.0f) >= 0.01f || java.lang.Math.abs(this.f417045f - 1.0f) >= 0.01f;
    }

    @Override // n8.f
    public void b(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            java.nio.ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f417049j += remaining;
            n8.d0 d0Var = this.f417043d;
            d0Var.getClass();
            int remaining2 = asShortBuffer.remaining();
            int i17 = d0Var.f417018b;
            int i18 = remaining2 / i17;
            int i19 = i18 * i17 * 2;
            int i27 = d0Var.f417033q + i18;
            int i28 = d0Var.f417023g;
            if (i27 > i28) {
                int i29 = i28 + (i28 / 2) + i18;
                d0Var.f417023g = i29;
                d0Var.f417024h = java.util.Arrays.copyOf(d0Var.f417024h, i29 * i17);
            }
            asShortBuffer.get(d0Var.f417024h, d0Var.f417033q * i17, i19 / 2);
            d0Var.f417033q += i18;
            d0Var.e();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i37 = this.f417043d.f417034r * this.f417041b * 2;
        if (i37 > 0) {
            if (this.f417046g.capacity() < i37) {
                java.nio.ByteBuffer order = java.nio.ByteBuffer.allocateDirect(i37).order(java.nio.ByteOrder.nativeOrder());
                this.f417046g = order;
                this.f417047h = order.asShortBuffer();
            } else {
                this.f417046g.clear();
                this.f417047h.clear();
            }
            n8.d0 d0Var2 = this.f417043d;
            java.nio.ShortBuffer shortBuffer = this.f417047h;
            d0Var2.getClass();
            int remaining3 = shortBuffer.remaining();
            int i38 = d0Var2.f417018b;
            int min = java.lang.Math.min(remaining3 / i38, d0Var2.f417034r);
            int i39 = min * i38;
            shortBuffer.put(d0Var2.f417026j, 0, i39);
            int i47 = d0Var2.f417034r - min;
            d0Var2.f417034r = i47;
            short[] sArr = d0Var2.f417026j;
            java.lang.System.arraycopy(sArr, i39, sArr, 0, i47 * i38);
            this.f417050k += i37;
            this.f417046g.limit(i37);
            this.f417048i = this.f417046g;
        }
    }

    @Override // n8.f
    public int c() {
        return this.f417041b;
    }

    @Override // n8.f
    public int d() {
        return 2;
    }

    @Override // n8.f
    public void e() {
        n8.d0 d0Var = this.f417043d;
        int i17 = d0Var.f417033q;
        float f17 = d0Var.f417031o;
        float f18 = d0Var.f417032p;
        int i18 = d0Var.f417034r + ((int) ((((i17 / (f17 / f18)) + d0Var.f417035s) / f18) + 0.5f));
        int i19 = d0Var.f417021e * 2;
        int i27 = i19 + i17;
        int i28 = i17 + i27;
        int i29 = d0Var.f417023g;
        int i37 = d0Var.f417018b;
        if (i28 > i29) {
            int i38 = i29 + (i29 / 2) + i27;
            d0Var.f417023g = i38;
            d0Var.f417024h = java.util.Arrays.copyOf(d0Var.f417024h, i38 * i37);
        }
        for (int i39 = 0; i39 < i19 * i37; i39++) {
            d0Var.f417024h[(i37 * i17) + i39] = 0;
        }
        d0Var.f417033q += i19;
        d0Var.e();
        if (d0Var.f417034r > i18) {
            d0Var.f417034r = i18;
        }
        d0Var.f417033q = 0;
        d0Var.f417036t = 0;
        d0Var.f417035s = 0;
        this.f417051l = true;
    }

    @Override // n8.f
    public java.nio.ByteBuffer f() {
        java.nio.ByteBuffer byteBuffer = this.f417048i;
        this.f417048i = n8.f.f417052a;
        return byteBuffer;
    }

    @Override // n8.f
    /* renamed from: flush */
    public void mo149201x5d03b04() {
        n8.d0 d0Var = new n8.d0(this.f417042c, this.f417041b);
        this.f417043d = d0Var;
        d0Var.f417031o = this.f417044e;
        d0Var.f417032p = this.f417045f;
        this.f417048i = n8.f.f417052a;
        this.f417049j = 0L;
        this.f417050k = 0L;
        this.f417051l = false;
    }

    @Override // n8.f
    public boolean g(int i17, int i18, int i19) {
        if (i19 != 2) {
            throw new n8.e(i17, i18, i19);
        }
        if (this.f417042c == i17 && this.f417041b == i18) {
            return false;
        }
        this.f417042c = i17;
        this.f417041b = i18;
        return true;
    }

    @Override // n8.f
    public boolean h() {
        n8.d0 d0Var;
        return this.f417051l && ((d0Var = this.f417043d) == null || d0Var.f417034r == 0);
    }

    @Override // n8.f
    /* renamed from: reset */
    public void mo149202x6761d4f() {
        this.f417043d = null;
        java.nio.ByteBuffer byteBuffer = n8.f.f417052a;
        this.f417046g = byteBuffer;
        this.f417047h = byteBuffer.asShortBuffer();
        this.f417048i = byteBuffer;
        this.f417041b = -1;
        this.f417042c = -1;
        this.f417049j = 0L;
        this.f417050k = 0L;
        this.f417051l = false;
    }
}
