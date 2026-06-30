package qr4;

/* loaded from: classes9.dex */
public class g extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr4.h f447664c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qr4.h hVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f447664c = hVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        return this.f420366a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kzs);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f420367b.d(new es4.j((at4.z0) objArr[0], (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) this.f447664c.f295334c.getParcelable("key_orders")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof es4.j)) {
            return false;
        }
        es4.j jVar = (es4.j) m1Var;
        boolean z17 = jVar.f39883x9cd69705;
        qr4.h hVar = this.f447664c;
        if (z17) {
            hVar.f295334c.putParcelable("key_orders", jVar.f337958x);
        }
        hVar.o(this.f420366a, 0, hVar.f295334c);
        return true;
    }
}
