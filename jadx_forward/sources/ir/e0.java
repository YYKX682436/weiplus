package ir;

/* loaded from: classes15.dex */
public final class e0 extends ir.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f375364b;

    public e0(int i17) {
        super(8);
        this.f375364b = i17;
    }

    @Override // ir.u0
    public boolean a(java.lang.Object obj) {
        if (mo139714xb2c87fbf(obj) && (obj instanceof ir.e0)) {
            if (this.f375364b == ((ir.e0) obj).f375364b) {
                return true;
            }
        }
        return false;
    }
}
