package yr4;

/* loaded from: classes9.dex */
public class e extends yr4.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f546626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yr4.u uVar, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, np5.b0 b0Var) {
        super(uVar, abstractActivityC22902xe37969e, b0Var);
        this.f546626c = uVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        if (objArr.length > 0) {
            this.f420367b.d(zr4.a.d((at4.z0) objArr[0], (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) this.f546626c.f295334c.getParcelable("key_orders")), true);
        }
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ds4.g) {
            ds4.g gVar = (ds4.g) m1Var;
            if (i17 == 0 && i18 == 0) {
                boolean z17 = gVar.f39883x9cd69705;
                yr4.u uVar = this.f546626c;
                if (z17) {
                    uVar.f295334c.putParcelable("key_orders", gVar.f324459x);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = gVar.f295594s;
                if (c19088xa4b300c1 != null) {
                    uVar.f295334c.putParcelable("key_realname_guide_helper", c19088xa4b300c1);
                }
                android.os.Bundle bundle = uVar.f295334c;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
                uVar.o(abstractActivityC21394xb3d2c0cf, 0, bundle);
                abstractActivityC21394xb3d2c0cf.finish();
                return true;
            }
        }
        return false;
    }
}
