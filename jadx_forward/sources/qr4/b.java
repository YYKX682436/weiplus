package qr4;

/* loaded from: classes9.dex */
public class b extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr4.h f447659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qr4.h hVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f447659c = hVar;
    }

    @Override // np5.g
    public boolean c(java.lang.Object... objArr) {
        qr4.h hVar = this.f447659c;
        hVar.f295334c.putParcelable("key_history_bankcard", vr4.f1.wi().Ai().f95531g);
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) hVar.f295334c.get("key_pay_info");
        this.f420367b.a(new ss4.b0(c19760x34448d56 == null ? null : c19760x34448d56.f273647m, 4), true);
        return false;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        qr4.h hVar = this.f447659c;
        hVar.o(this.f420366a, 0, hVar.f295334c);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
