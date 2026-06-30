package pk2;

/* loaded from: classes3.dex */
public final class s1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f437760h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f437761i;

    /* renamed from: j, reason: collision with root package name */
    public final int f437762j;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f437763r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437760h = "anchorlive.bottom.tools.link";
        this.f437761i = true;
        this.f437763r = true;
        this.f437762j = helper.O;
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        o9Var.j(qo0.b.I2, null);
        bf2.c.b(bf2.c.f101131a, o9Var.f437607b, 2, 0, null, 0, 28, null);
        ll2.e.b(ll2.e.f400666a, this.f437760h, false, false, 6, null);
        if (D()) {
            df2.dd ddVar = df2.od.f312485w;
            pk2.o9 o9Var2 = this.f445960a;
            gk2.e eVar = o9Var2.f437607b;
            df2.od odVar = (df2.od) o9Var2.e(df2.od.class);
            ddVar.a(eVar, 2, 7, odVar != null ? odVar.f312491r : null, 15);
        }
    }

    public final boolean D() {
        df2.od odVar = (df2.od) this.f445960a.e(df2.od.class);
        return odVar != null && odVar.c7(r45.d62.FINDER_LIVE_QUEST_COMM_TARGET_TYPE_CREATE_NOTICE_COUNT);
    }

    @Override // qk2.f
    public boolean h() {
        return this.f437761i;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437760h;
    }

    @Override // qk2.f
    public boolean o() {
        zl2.q4 q4Var = zl2.q4.f555466a;
        pk2.o9 o9Var = this.f445960a;
        boolean D = q4Var.D(o9Var.f437607b);
        boolean z17 = this.f445961b == 0;
        if (!D) {
            return false;
        }
        if (z17) {
            return true;
        }
        return !(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5) o9Var.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r5.class)) != null ? r0.b7(7) : false);
    }

    @Override // qk2.f
    public boolean r() {
        return this.f437763r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (((r0 == null || (r0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0)) ? false : true) == true) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    @Override // qk2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(pk2.o9 r19, db5.g4 r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.s1.v(pk2.o9, db5.g4):void");
    }

    @Override // qk2.h
    public int y() {
        return this.f437762j;
    }
}
