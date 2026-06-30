package rk2;

/* loaded from: classes3.dex */
public final class m implements gc2.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f477996a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f477997b;

    /* renamed from: c, reason: collision with root package name */
    public float f477998c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk2.q f477999d;

    public m(rk2.q qVar) {
        this.f477999d = qVar;
    }

    @Override // gc2.c
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamWidget", "selectItemView onPageSelected position:" + i17);
        rk2.q qVar = this.f477999d;
        qVar.f478009g = false;
        qVar.getClass();
    }

    @Override // gc2.c
    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        rk2.q qVar = this.f477999d;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            qVar.f478012j = true;
            return;
        }
        this.f477996a = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14258x2652fdcb c14258x2652fdcb = qVar.f478007e;
        int w17 = c14258x2652fdcb != null ? c14258x2652fdcb.w() : -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14258x2652fdcb c14258x2652fdcb2 = qVar.f478007e;
        int y17 = c14258x2652fdcb2 != null ? c14258x2652fdcb2.y() : -1;
        if (qVar.f478009g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamWidget", "firstVisiblePos:" + w17 + " lastVisiblePos:" + y17 + " lastPlayPos: " + qVar.f478008f);
            if (w17 != y17 || w17 == (i18 = qVar.f478008f)) {
                return;
            }
            rk2.q.b(qVar, i18);
        }
    }

    @Override // gc2.c
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, float f17, int i18) {
        java.lang.Boolean bool;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        rk2.q qVar = this.f477999d;
        if (i18 != 0) {
            boolean z17 = false;
            if (this.f477996a || java.lang.Math.abs(this.f477998c - f17) > 0.5f) {
                this.f477997b = f17 > 0.5f;
                this.f477996a = false;
            }
            this.f477998c = f17;
            boolean z18 = this.f477997b;
            if (z18) {
                f17 = 1 - f17;
            }
            int size = qVar.f478015m + (qVar.f478005c.size() * 1000);
            int c17 = qVar.c(z18 ? size - 1 : size + 1);
            java.lang.Float valueOf = java.lang.Float.valueOf(f17 * 2.0f);
            java.lang.Boolean bool2 = null;
            if (!(valueOf.floatValue() <= 1.0f)) {
                valueOf = null;
            }
            float floatValue = 1.0f - (valueOf != null ? valueOf.floatValue() : 1.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz zzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz) qVar.f478003a;
            zzVar.getClass();
            ((mm2.h7) zzVar.P0(mm2.h7.class)).f410655q.mo7808x76db6cb1(java.lang.Float.valueOf(floatValue));
            int c18 = qVar.c(size);
            rk2.b bVar = qVar.f478006d;
            uk2.b x17 = bVar.x(c18);
            if (x17 != null) {
                r45.ka4 ka4Var = x17.f510055b.f460806d;
                bool = java.lang.Boolean.valueOf(ka4Var != null && ka4Var.V >= ka4Var.W);
            } else {
                bool = null;
            }
            uk2.b x18 = bVar.x(c17);
            if (x18 != null) {
                r45.ka4 ka4Var2 = x18.f510055b.f460806d;
                if (ka4Var2 != null && ka4Var2.V >= ka4Var2.W) {
                    z17 = true;
                }
                bool2 = java.lang.Boolean.valueOf(z17);
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2) && !zzVar.x0()) {
                ((mm2.h7) zzVar.P0(mm2.h7.class)).f410654p.mo7808x76db6cb1(java.lang.Float.valueOf(floatValue));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14258x2652fdcb c14258x2652fdcb = qVar.f478007e;
        int w17 = c14258x2652fdcb.w();
        int y17 = c14258x2652fdcb.y();
        if (w17 != y17 && qVar.f478012j) {
            int i19 = qVar.f478010h;
            if (w17 < i19) {
                int i27 = qVar.f478011i;
                if (y17 < i27) {
                    rk2.q.b(qVar, i27);
                }
                qVar.f478008f = w17;
                rk2.q.a(qVar, w17);
            } else if (y17 > qVar.f478011i) {
                if (w17 > i19) {
                    rk2.q.b(qVar, i19);
                }
                qVar.f478008f = y17;
                rk2.q.a(qVar, y17);
            }
        }
        qVar.f478010h = w17;
        qVar.f478011i = y17;
    }
}
