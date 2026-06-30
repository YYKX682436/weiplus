package sr4;

/* loaded from: classes9.dex */
public class a extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f493397c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr4.b f493398d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sr4.b bVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f493398d = bVar;
        this.f493397c = null;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        if (i17 != 1) {
            return null;
        }
        return this.f420366a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575070kn3);
    }

    @Override // np5.g
    public boolean c(java.lang.Object... objArr) {
        sr4.b bVar = this.f493398d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) bVar.f295334c.getParcelable("key_bankcard");
        if (c19091x9511676c == null || c19091x9511676c.f69220xb7753620 != 1) {
            bVar.f295334c.putInt("key_process_result_code", 1);
            return false;
        }
        bVar.f493399d = c19091x9511676c.f69225xed6d60f6;
        this.f420367b.d(new tr4.d(c19091x9511676c.f69223x58802fcb, c19091x9511676c.f69225xed6d60f6, bVar.f295334c.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1) == 2), true);
        bVar.f295334c.putBoolean("key_is_expired_bankcard", true);
        return true;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        sr4.b bVar = this.f493398d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) bVar.f295334c.getParcelable("key_bankcard");
        java.lang.String str = (java.lang.String) objArr[0];
        this.f493397c = (java.lang.String) objArr[1];
        java.lang.String string = bVar.f295334c.getString("key_support_quick_bind");
        if (c19091x9511676c == null) {
            bVar.f295334c.putInt("key_process_result_code", 1);
            return false;
        }
        bVar.f493399d = c19091x9511676c.f69225xed6d60f6;
        this.f420367b.d(new tr4.d(c19091x9511676c.f69223x58802fcb, c19091x9511676c.f69225xed6d60f6, str, bVar.f295334c.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1) == 2, string), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof tr4.d) {
            sr4.b bVar = this.f493398d;
            if (i17 == 0 && i18 == 0) {
                bVar.f295334c.putInt("key_process_result_code", -1);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
                if (bVar.t(abstractActivityC21394xb3d2c0cf, null)) {
                    this.f420367b.d(new ss4.e0(this.f493397c, 14), true);
                } else {
                    bVar.o(abstractActivityC21394xb3d2c0cf, 0, null);
                    if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) {
                        ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf).mo65144xd0a01007(0);
                    }
                    abstractActivityC21394xb3d2c0cf.finish();
                }
                return true;
            }
            bVar.f295334c.putInt("key_process_result_code", 1);
        }
        return false;
    }
}
