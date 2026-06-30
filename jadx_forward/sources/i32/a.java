package i32;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f369646d;

    /* renamed from: e, reason: collision with root package name */
    public final int f369647e;

    /* renamed from: f, reason: collision with root package name */
    public final int f369648f;

    /* renamed from: g, reason: collision with root package name */
    public final int f369649g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f369650h;

    public a(int i17, long j17, int i18, int i19, byte[] bArr) {
        this.f369646d = -1L;
        this.f369647e = -1;
        this.f369648f = -1;
        this.f369650h = null;
        this.f369646d = j17;
        this.f369647e = i18;
        this.f369648f = i19;
        this.f369650h = bArr;
        this.f369649g = i17;
    }

    public void a() {
        int i17;
        int i18;
        long j17 = this.f369646d;
        if (j17 == -1 || (i17 = this.f369647e) == -1 || (i18 = this.f369648f) == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestProcessThread", "invalid arguments, do nothing");
            return;
        }
        switch (i18) {
            case 10001:
                u32.h1.c().b(new w32.e(this.f369649g, j17, i17, i18, this.f369650h));
                return;
            case 10002:
                i32.s a17 = i32.s.a();
                long j18 = this.f369646d;
                int i19 = this.f369647e;
                int i27 = this.f369648f;
                byte[] bArr = this.f369650h;
                a17.getClass();
                a17.f369674e.mo50291x733c63a2(1, this.f369649g, 0, new i32.g(j18, i19, i27, bArr)).sendToTarget();
                return;
            case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6 /* 10003 */:
                u32.h1.c().b(new w32.f(this.f369649g, j17, i17, i18, this.f369650h));
                return;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestProcessThread", "unknown cmdId = %d, do nothing", java.lang.Integer.valueOf(i18));
                return;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
    }
}
