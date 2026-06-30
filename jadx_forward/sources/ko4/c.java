package ko4;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f391572a;

    /* renamed from: b, reason: collision with root package name */
    public int f391573b;

    /* renamed from: c, reason: collision with root package name */
    public final ko4.b[] f391574c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f391575d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f391576e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f391577f;

    /* renamed from: g, reason: collision with root package name */
    public int f391578g;

    /* renamed from: h, reason: collision with root package name */
    public int f391579h;

    /* renamed from: i, reason: collision with root package name */
    public int f391580i;

    /* renamed from: j, reason: collision with root package name */
    public int f391581j;

    public c(int i17, int i18, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f391572a = i17;
        this.f391573b = i18;
        ko4.b[] bVarArr = new ko4.b[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            bVarArr[i19] = null;
        }
        this.f391574c = bVarArr;
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f391575d = reentrantLock;
        this.f391576e = reentrantLock.newCondition();
        this.f391577f = reentrantLock.newCondition();
        if (this.f391572a != 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Invalid count " + this.f391572a);
    }

    public final int a(long j17) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f391575d;
        reentrantLock.lock();
        try {
            if (this.f391579h == this.f391580i && j17 > 0 && !this.f391576e.await(j17, java.util.concurrent.TimeUnit.MICROSECONDS)) {
                reentrantLock.unlock();
                return -1;
            }
            int i17 = this.f391580i;
            this.f391580i = i17 + 1;
            return i17 % this.f391572a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int b(long j17) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f391575d;
        reentrantLock.lock();
        try {
            int i17 = this.f391578g - this.f391581j;
            int i18 = this.f391572a;
            if (i17 >= i18 && j17 > 0 && !this.f391577f.await(j17, java.util.concurrent.TimeUnit.MICROSECONDS)) {
                reentrantLock.unlock();
                return -1;
            }
            int i19 = this.f391578g;
            this.f391578g = i19 + 1;
            return i19 % i18;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ko4.b c(int i17) {
        ko4.b[] bVarArr = this.f391574c;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f391575d;
        reentrantLock.lock();
        try {
            ko4.b bVar = bVarArr[i17];
            if (bVar == null) {
                android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                java.nio.ByteBuffer order = java.nio.ByteBuffer.allocateDirect(this.f391573b).order(java.nio.ByteOrder.nativeOrder());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(order, "order(...)");
                bVar = new ko4.b(bufferInfo, order);
                bVarArr[i17] = bVar;
            }
            return bVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f391575d;
        reentrantLock.lock();
        try {
            this.f391581j++;
            this.f391577f.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: toString */
    public java.lang.String m143890x9616526c() {
        return "[" + this.f391581j + ", " + this.f391580i + "; " + this.f391579h + ", " + this.f391578g + "] " + (this.f391578g - this.f391581j);
    }
}
