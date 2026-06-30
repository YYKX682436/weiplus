package pk2;

/* loaded from: classes3.dex */
public final class m2 extends qk2.h implements qk2.c {

    /* renamed from: h, reason: collision with root package name */
    public final int f437519h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f437520i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f437521j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437519h = helper.V;
        this.f437520i = true;
        this.f437521j = "startlive.more.newmusic";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) this.f445960a.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
        if (r5Var != null) {
            r5Var.f7();
        }
    }

    @Override // qk2.f
    public boolean h() {
        return this.f437520i;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437521j;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f445960a;
        boolean b76 = ((mm2.e1) o9Var.f437607b.a(mm2.e1.class)).b7();
        boolean z17 = zl2.r4.f555483a.L(o9Var.f437607b) || ((mm2.m6) o9Var.f437607b.a(mm2.m6.class)).f410781p;
        if (this.f445961b != 1 || b76 || !z17) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) o9Var.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
        return !(r5Var != null ? r5Var.b7(6) : false);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        pk2.o9 o9Var2 = this.f445960a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) o9Var2.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
        jz5.l g76 = r5Var != null ? r5Var.g7(o9Var.f437611d, false) : null;
        if (g76 != null) {
            s(menu, this.f437519h, (java.lang.CharSequence) g76.f384366d, ((java.lang.Number) g76.f384367e).intValue());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5 r5Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) o9Var2.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class);
        if (r5Var2 != null) {
            r5Var2.m7();
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f437519h;
    }
}
