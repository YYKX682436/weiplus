package y02;

/* loaded from: classes9.dex */
public class e0 extends com.p314xaae8f345.p3118xeeebfacc.C26830xc629eb9c implements y02.d0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f540132h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f540133d;

    /* renamed from: e, reason: collision with root package name */
    public y02.z f540134e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.h8 f540135f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f540136g;

    public e0() {
        boolean[] zArr = new boolean[3];
        for (int i17 = 0; i17 < 3; i17++) {
            zArr[i17] = false;
        }
        this.f540133d = zArr;
        this.f540135f = new bw5.h8();
    }

    public y02.z a() {
        synchronized (this) {
            if (this.f540133d[0]) {
                return this.f540134e;
            }
            com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 m170295x21ba9a31 = p3380x6a61f93.p3387xf51c6630.C30617x21b1bcc3.m170295x21ba9a31(m105978x2737f10());
            synchronized (this) {
                this.f540134e = (y02.z) m170295x21ba9a31;
                this.f540133d[0] = true;
            }
            return (y02.z) m170295x21ba9a31;
        }
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055
    /* renamed from: notifyFieldUpdated */
    public void mo105982x3f27f04a(int i17) {
        synchronized (this) {
            this.f540133d[i17] = false;
        }
    }
}
