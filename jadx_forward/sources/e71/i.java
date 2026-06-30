package e71;

/* loaded from: classes4.dex */
public class i extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f331412e = {l75.n0.m145250x3fdc6f77(e71.h.D, "SafeDeviceInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f331413d;

    public i(l75.k0 k0Var) {
        super(k0Var, e71.h.D, "SafeDeviceInfo", null);
        this.f331413d = k0Var;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        return super.mo880xb970c2b9((e71.h) f0Var);
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo11260x413cb2b4(l75.f0 f0Var) {
        return super.mo11260x413cb2b4((e71.h) f0Var);
    }

    public java.util.List y0() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (mo78086x7444f759() > 0) {
            android.database.Cursor mo78085xb5882a6b = super.mo78085xb5882a6b();
            while (mo78085xb5882a6b.moveToNext()) {
                e71.h hVar = new e71.h();
                hVar.mo9015xbf5d97fd(mo78085xb5882a6b);
                linkedList.add(hVar);
            }
            mo78085xb5882a6b.close();
        }
        return linkedList;
    }
}
