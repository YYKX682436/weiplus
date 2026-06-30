package so2;

/* loaded from: classes2.dex */
public class q2 extends so2.u1 {

    /* renamed from: p, reason: collision with root package name */
    public static final so2.p2 f492079p = new so2.p2(null);

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f492080i;

    /* renamed from: m, reason: collision with root package name */
    public final int f492081m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f492082n;

    /* renamed from: o, reason: collision with root package name */
    public int f492083o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderItem, int i17) {
        super(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(finderItem, i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        this.f492080i = finderItem;
        this.f492081m = i17;
        this.f492082n = getFeedObject().getFeedObject();
        getUdfKv().put("page_type", "profile_live_replay");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        so2.q2 q2Var = obj instanceof so2.q2 ? (so2.q2) obj : null;
        return (q2Var == null || q2Var.mo2128x1ed62e84() <= 0 || q2Var.mo2128x1ed62e84() != mo2128x1ed62e84()) ? -1 : 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5, in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return getFeedObject().f66939xc8a07680 == 0 ? getFeedObject().m59260x51f8f5b0() : getFeedObject().f66939xc8a07680;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5, in5.c
    public int h() {
        return o2();
    }

    public final long m2() {
        return this.f492082n.m76784x5db1b11();
    }

    public final java.lang.String n2() {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = this.f492082n.m76802x2dd01666();
        r45.mb4 i17 = (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) ? null : bu2.z.i(c19788xd7cfd73e);
        if (i17 == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17.m75945x2fec8307(1));
        java.lang.String m75945x2fec8307 = i17.m75945x2fec8307(19);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        sb6.append(m75945x2fec8307);
        java.lang.String sb7 = sb6.toString();
        return sb7 == null ? "" : sb7;
    }

    public final int o2() {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        r45.mb4 mb4Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = this.f492082n.m76802x2dd01666();
        if (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (mb4Var = (r45.mb4) kz5.n0.Z(bu2.z.h(m76962x74cd162e))) == null) {
            return 0;
        }
        return mb4Var.m75939xb282bd08(2);
    }

    public final int p2() {
        r45.nw1 m76794xd0557130 = this.f492082n.m76794xd0557130();
        if (m76794xd0557130 != null) {
            return m76794xd0557130.m75939xb282bd08(31);
        }
        return 0;
    }

    public final boolean q2() {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).gk(this.f492082n.m76794xd0557130());
    }

    public final boolean r2() {
        boolean s27 = s2();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f492082n;
        if (s27) {
            r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
            if (m76794xd0557130 == null || m76794xd0557130.m75939xb282bd08(31) != 5) {
                return false;
            }
        } else if (c19792x256d2725.m76815x4f546659() != 1) {
            return false;
        }
        return true;
    }

    public final boolean s2() {
        return o2() == 9;
    }

    public final boolean t2() {
        ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f492082n;
        return ((vd2.d5) i0Var).bj(c19792x256d2725.m76836x6c03c64c(), c19792x256d2725.m76794xd0557130());
    }

    public /* synthetic */ q2(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(c19792x256d2725, (i18 & 2) != 0 ? 0 : i17);
    }
}
