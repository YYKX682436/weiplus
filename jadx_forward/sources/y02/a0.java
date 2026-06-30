package y02;

/* loaded from: classes9.dex */
public class a0 extends com.p314xaae8f345.p3118xeeebfacc.C26830xc629eb9c implements y02.z {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f540125d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.k8 f540126e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f540127f;

    /* renamed from: g, reason: collision with root package name */
    public long f540128g;

    /* renamed from: h, reason: collision with root package name */
    public y02.b0 f540129h;

    public a0() {
        boolean[] zArr = new boolean[6];
        for (int i17 = 0; i17 < 6; i17++) {
            zArr[i17] = false;
        }
        this.f540125d = zArr;
        this.f540126e = bw5.k8.m12302xcee59d22()[0];
        this.f540127f = "";
    }

    public bw5.k8 a() {
        synchronized (this) {
            if (this.f540125d[0]) {
                return this.f540126e;
            }
            bw5.k8 a17 = bw5.k8.a(p3380x6a61f93.p3387xf51c6630.C30619x21b24a1c.m170314x21b93f70(m105978x2737f10()));
            synchronized (this) {
                this.f540126e = a17;
                this.f540125d[0] = true;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            return a17;
        }
    }

    public long d() {
        synchronized (this) {
            if (this.f540125d[2]) {
                return this.f540128g;
            }
            long m170303x21b0554f = p3380x6a61f93.p3387xf51c6630.C30619x21b24a1c.m170303x21b0554f(m105978x2737f10());
            synchronized (this) {
                this.f540128g = m170303x21b0554f;
                this.f540125d[2] = true;
            }
            return m170303x21b0554f;
        }
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055
    /* renamed from: notifyFieldUpdated */
    public void mo105982x3f27f04a(int i17) {
        synchronized (this) {
            this.f540125d[i17] = false;
        }
    }
}
