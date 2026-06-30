package so2;

/* loaded from: classes.dex */
public final class l3 implements so2.j5, in5.o0 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.yw2 f492001d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f492002e;

    /* renamed from: f, reason: collision with root package name */
    public final android.text.SpannableString f492003f;

    /* renamed from: g, reason: collision with root package name */
    public final int f492004g;

    public l3(r45.yw2 divider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(divider, "divider");
        this.f492001d = divider;
        this.f492002e = jz5.h.b(new so2.k3(this));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String m75945x2fec8307 = divider.m75945x2fec8307(1);
        ((ke0.e) xVar).getClass();
        this.f492003f = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec8307);
        this.f492004g = divider.m75939xb282bd08(2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof so2.l3)) {
            return -1;
        }
        r45.yw2 yw2Var = ((so2.l3) obj).f492001d;
        long m75942xfb822ef2 = yw2Var.m75942xfb822ef2(3);
        r45.yw2 yw2Var2 = this.f492001d;
        if (m75942xfb822ef2 != yw2Var2.m75942xfb822ef2(3) || yw2Var.m75939xb282bd08(2) != yw2Var2.m75939xb282bd08(2) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yw2Var.m75945x2fec8307(1), yw2Var2.m75945x2fec8307(1))) {
            return -1;
        }
        r45.eo eoVar = (r45.eo) yw2Var.m75936x14adae67(8);
        java.lang.String m75945x2fec8307 = eoVar != null ? eoVar.m75945x2fec8307(0) : null;
        r45.eo eoVar2 = (r45.eo) yw2Var2.m75936x14adae67(8);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, eoVar2 != null ? eoVar2.m75945x2fec8307(0) : null)) {
            return -1;
        }
        r45.eo eoVar3 = (r45.eo) yw2Var.m75936x14adae67(8);
        java.lang.Integer valueOf = eoVar3 != null ? java.lang.Integer.valueOf(eoVar3.m75939xb282bd08(1)) : null;
        r45.eo eoVar4 = (r45.eo) yw2Var2.m75936x14adae67(8);
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, eoVar4 != null ? java.lang.Integer.valueOf(eoVar4.m75939xb282bd08(1)) : null) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return ((java.lang.Number) ((jz5.n) this.f492002e).mo141623x754a37bb()).longValue();
    }

    @Override // in5.c
    public int h() {
        return 2023;
    }

    /* renamed from: toString */
    public java.lang.String m164914x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ItemId=");
        sb6.append(mo2128x1ed62e84());
        sb6.append(",ItemType=2023 tipStyle=");
        sb6.append(this.f492004g);
        sb6.append(" tip=");
        sb6.append((java.lang.Object) this.f492003f);
        sb6.append(",wording=");
        r45.yw2 yw2Var = this.f492001d;
        sb6.append(yw2Var.m75945x2fec8307(1));
        sb6.append(",bubble=");
        r45.eo eoVar = (r45.eo) yw2Var.m75936x14adae67(8);
        sb6.append(eoVar != null ? eoVar.m75945x2fec8307(0) : null);
        sb6.append('(');
        r45.eo eoVar2 = (r45.eo) yw2Var.m75936x14adae67(8);
        sb6.append(eoVar2 != null ? java.lang.Integer.valueOf(eoVar2.m75939xb282bd08(1)) : null);
        sb6.append("s)");
        return sb6.toString();
    }
}
