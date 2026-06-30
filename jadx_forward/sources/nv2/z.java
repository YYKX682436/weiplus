package nv2;

/* loaded from: classes10.dex */
public final class z implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.a0 f422172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv2.o1 f422173b;

    public z(nv2.a0 a0Var, nv2.o1 o1Var) {
        this.f422172a = a0Var;
        this.f422173b = o1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FollowActionTask", "FollowAction callback " + fVar.f152148a + ' ' + fVar.f152149b + ' ' + fVar.f152150c);
        int i17 = fVar.f152148a;
        nv2.o1 o1Var = this.f422173b;
        nv2.a0 a0Var = this.f422172a;
        if (i17 == 0 && fVar.f152149b == 0) {
            nv2.d0.f422003e.e(a0Var);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be();
            am.zd zdVar = c5560x6f070be.f135879g;
            zdVar.f90084a = a0Var.f421965d;
            zdVar.f90085b = a0Var.f421966e;
            r45.qt2 qt2Var = a0Var.f421969h;
            zdVar.f90087d = qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0;
            zdVar.f90088e = qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0;
            zdVar.f90086c = true;
            c5560x6f070be.e();
            o1Var.a(fp0.u.f346823f, false);
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (i17 == 4) {
                nv2.d0.f422003e.e(a0Var);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be();
                am.zd zdVar2 = c5560x6f070be2.f135879g;
                zdVar2.f90084a = a0Var.f421965d;
                zdVar2.f90085b = a0Var.f421966e;
                r45.qt2 qt2Var2 = a0Var.f421969h;
                zdVar2.f90087d = qt2Var2 != null ? qt2Var2.m75939xb282bd08(7) : 0;
                zdVar2.f90088e = qt2Var2 != null ? qt2Var2.m75939xb282bd08(5) : 0;
                zdVar2.f90086c = false;
                c5560x6f070be2.e();
                if (fVar.f152149b == -4010) {
                    pm0.v.X(nv2.y.f422168d);
                }
                o1Var.a(fp0.u.f346824g, false);
            } else {
                o1Var.a(fp0.u.f346824g, true);
            }
            if (fVar.f152149b == -4048) {
                db5.t7.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, fVar.f152150c);
            }
        }
        return jz5.f0.f384359a;
    }
}
