package e95;

/* loaded from: classes11.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public e95.h f331971a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f331972b;

    public o(e95.h hVar, int i17, boolean z17) {
        this.f331971a = hVar;
        this.f331972b = z17;
        hVar.u(true);
        this.f331971a.Y(new e95.n(this));
        if (i17 != 0) {
            this.f331971a.u1(i17);
        }
        if (z17) {
            return;
        }
        a();
    }

    public int a() {
        return this.f331971a.getCount();
    }
}
