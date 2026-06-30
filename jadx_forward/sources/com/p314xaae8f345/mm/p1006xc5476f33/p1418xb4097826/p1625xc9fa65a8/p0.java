package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes8.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ix0 f207340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14944x7f25a182 f207341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kh2 f207342f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r45.ix0 ix0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14944x7f25a182 activityC14944x7f25a182, r45.kh2 kh2Var) {
        super(0);
        this.f207340d = ix0Var;
        this.f207341e = activityC14944x7f25a182;
        this.f207342f = kh2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.kh2 kh2Var;
        java.lang.Object obj;
        r45.ix0 ix0Var = this.f207340d;
        if (ix0Var.m75939xb282bd08(1) == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14944x7f25a182 activityC14944x7f25a182 = this.f207341e;
            java.util.Iterator it = activityC14944x7f25a182.f207073x.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                kh2Var = this.f207342f;
                if (!hasNext) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (r26.i0.q(((r45.q21) obj).m75945x2fec8307(2), kh2Var.m75945x2fec8307(4), false, 2, null)) {
                    break;
                }
            }
            r45.q21 q21Var = (r45.q21) obj;
            if (q21Var != null) {
                activityC14944x7f25a182.f207073x.remove(q21Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i0 i0Var = activityC14944x7f25a182.f207074y;
                if (i0Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                i0Var.m8146xced61ae5();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5449x7a125bbe c5449x7a125bbe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5449x7a125bbe();
                java.lang.String m75945x2fec8307 = kh2Var.m75945x2fec8307(4);
                am.ma maVar = c5449x7a125bbe.f135789g;
                maVar.f88864a = m75945x2fec8307;
                maVar.f88865b = ix0Var.m75939xb282bd08(1);
                c5449x7a125bbe.e();
            }
        }
        return jz5.f0.f384359a;
    }
}
