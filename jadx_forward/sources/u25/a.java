package u25;

/* loaded from: classes8.dex */
public abstract class a implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public int f505665d = 0;

    public abstract com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 a(java.lang.String str);

    public abstract l75.s0 b();

    public void c() {
        l75.s0 b17;
        if (this.f505665d == 0 && (b17 = b()) != null) {
            b17.add(this);
        }
        this.f505665d++;
    }

    public void d() {
        l75.s0 b17;
        int i17 = this.f505665d;
        if (i17 == 0) {
            return;
        }
        int i18 = i17 - 1;
        this.f505665d = i18;
        if (i18 != 0 || (b17 = b()) == null) {
            return;
        }
        b17.mo49775xc84af884(this);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5698x856dce83 c5698x856dce83 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5698x856dce83();
        c5698x856dce83.f136022g.f88884a = a(str);
        c5698x856dce83.e();
    }
}
