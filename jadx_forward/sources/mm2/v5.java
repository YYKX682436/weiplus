package mm2;

/* loaded from: classes3.dex */
public final class v5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f411016f;

    /* renamed from: g, reason: collision with root package name */
    public float f411017g;

    /* renamed from: h, reason: collision with root package name */
    public float f411018h;

    /* renamed from: i, reason: collision with root package name */
    public r45.f82 f411019i;

    /* renamed from: m, reason: collision with root package name */
    public km2.j f411020m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f411021n;

    /* renamed from: o, reason: collision with root package name */
    public long f411022o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f411016f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f411021n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
    }

    public final void N6(r45.f82 f82Var) {
        java.lang.String str;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restrictConsume defaultQuotas: ");
        java.lang.String str2 = null;
        if (f82Var == null || (m75941xfb8219142 = f82Var.m75941xfb821914(1)) == null) {
            str = null;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            int i17 = 0;
            for (java.lang.Object obj : m75941xfb8219142) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.uw4 uw4Var = (r45.uw4) obj;
                sb7.append("index: " + i17 + " threshold: " + uw4Var.m75942xfb822ef2(0) + " needFace: " + uw4Var.m75933x41a8a7f2(1) + " ;");
                i17 = i18;
            }
            str = sb7.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        }
        sb6.append(str);
        sb6.append(" \nhistoryQuotas: ");
        if (f82Var != null && (m75941xfb821914 = f82Var.m75941xfb821914(4)) != null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            int i19 = 0;
            for (java.lang.Object obj2 : m75941xfb821914) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sb8.append("index: " + i19 + " history_quota_amount: " + ((r45.hl1) obj2).m75942xfb822ef2(0) + " ;");
                i19 = i27;
            }
            str2 = sb8.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "toString(...)");
        }
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRestrictConsumeSlice", sb6.toString());
        this.f411019i = f82Var;
    }

    public final void O6(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRestrictConsumeSlice", "updateConsumeBalanceCNY giftCNY: " + f17 + " curConsumeBalanceCNY: " + this.f411017g + " curHistoryConsumeBalanceCNY: " + this.f411018h);
        float f18 = this.f411017g + f17;
        this.f411017g = f18;
        this.f411017g = ((float) a06.d.b(f18 * ((float) 10))) / 10.0f;
        this.f411018h = this.f411018h + f17;
        this.f411018h = a06.d.b(r0 * r3) / 10.0f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRestrictConsumeSlice", "updateConsumeBalanceCNY result curConsumeBalanceCNY: " + this.f411017g + " curHistoryConsumeBalanceCNY: " + this.f411018h);
    }
}
