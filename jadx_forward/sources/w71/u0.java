package w71;

/* loaded from: classes11.dex */
public class u0 extends com.p314xaae8f345.p3118xeeebfacc.C26830xc629eb9c implements w71.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f524988d = {false};

    /* renamed from: e, reason: collision with root package name */
    public bw5.j20 f524989e = new bw5.j20();

    @Override // w71.t0
    public void Jg(bw5.j20 openParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openParams, "openParams");
        byte[] mo14344x5f01b1f6 = openParams.mo14344x5f01b1f6();
        long m105978x2737f10 = m105978x2737f10();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        p3380x6a61f93.p3386xf51b86f1.C30602x21b8172f.m170199x21b8a3c8(m105978x2737f10, mo14344x5f01b1f6);
    }

    @Override // w71.t0
    public bw5.j20 Pa() {
        synchronized (this) {
            if (this.f524988d[0]) {
                return this.f524989e;
            }
            bw5.j20 j20Var = (bw5.j20) w71.l.b(p3380x6a61f93.p3386xf51b86f1.C30602x21b8172f.m170197x21b38b6c(m105978x2737f10()), new bw5.j20());
            synchronized (this) {
                this.f524989e = j20Var;
                this.f524988d[0] = true;
            }
            return j20Var;
        }
    }

    @Override // w71.t0
    public bw5.g20 nb() {
        return (bw5.g20) w71.l.b(p3380x6a61f93.p3386xf51b86f1.C30602x21b8172f.m170201x21ba626f(m105978x2737f10()), new bw5.g20());
    }

    @Override // com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055
    /* renamed from: notifyFieldUpdated */
    public void mo105982x3f27f04a(int i17) {
        synchronized (this) {
            this.f524988d[i17] = false;
        }
    }

    @Override // w71.t0
    public java.lang.String r() {
        return p3380x6a61f93.p3386xf51b86f1.C30602x21b8172f.m170198x21b46ca4(m105978x2737f10());
    }
}
