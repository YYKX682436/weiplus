package mm2;

/* loaded from: classes3.dex */
public final class u0 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public r45.i60 f410976f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f410977g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f410978h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f410979i;

    /* renamed from: m, reason: collision with root package name */
    public int f410980m;

    /* renamed from: n, reason: collision with root package name */
    public r45.o92 f410981n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f410982o;

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f410983p;

    /* renamed from: q, reason: collision with root package name */
    public long f410984q;

    /* renamed from: r, reason: collision with root package name */
    public r45.n92 f410985r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f410986s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f410979i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f410982o = new java.util.ArrayList();
    }

    public static final void N6(mm2.u0 u0Var, yz5.q qVar) {
        java.util.LinkedList m75941xfb821914;
        java.lang.Integer num;
        java.util.LinkedList m75941xfb8219142;
        java.lang.String str;
        r45.o92 o92Var;
        java.util.LinkedList m75941xfb8219143;
        java.lang.String str2;
        java.util.LinkedList m75941xfb8219144;
        java.util.LinkedList m75941xfb8219145;
        java.util.LinkedList m75941xfb8219146;
        r45.o92 o92Var2 = u0Var.f410981n;
        int size = (o92Var2 == null || (m75941xfb8219146 = o92Var2.m75941xfb821914(0)) == null) ? 0 : m75941xfb8219146.size();
        r45.o92 o92Var3 = u0Var.f410981n;
        int size2 = (o92Var3 == null || (m75941xfb8219145 = o92Var3.m75941xfb821914(3)) == null) ? 0 : m75941xfb8219145.size();
        r45.o92 o92Var4 = u0Var.f410981n;
        int min = java.lang.Math.min(size, java.lang.Math.min(size2, (o92Var4 == null || (m75941xfb8219144 = o92Var4.m75941xfb821914(4)) == null) ? 0 : m75941xfb8219144.size()));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        for (int i17 = 0; i17 < min; i17++) {
            r45.o92 o92Var5 = u0Var.f410981n;
            if (o92Var5 != null && (m75941xfb821914 = o92Var5.m75941xfb821914(3)) != null && (num = (java.lang.Integer) m75941xfb821914.get(i17)) != null) {
                int intValue = num.intValue();
                r45.o92 o92Var6 = u0Var.f410981n;
                if (o92Var6 != null && (m75941xfb8219142 = o92Var6.m75941xfb821914(0)) != null && (str = (java.lang.String) m75941xfb8219142.get(i17)) != null && (o92Var = u0Var.f410981n) != null && (m75941xfb8219143 = o92Var.m75941xfb821914(4)) != null && (str2 = (java.lang.String) m75941xfb8219143.get(i17)) != null && !((java.lang.Boolean) qVar.mo147xb9724478(java.lang.Integer.valueOf(intValue), str, str2)).booleanValue()) {
                    linkedList.add(str);
                    linkedList2.add(java.lang.Integer.valueOf(intValue));
                    linkedList3.add(str2);
                }
            }
        }
        r45.o92 o92Var7 = new r45.o92();
        o92Var7.set(0, linkedList);
        o92Var7.set(3, linkedList2);
        o92Var7.set(4, linkedList3);
        r45.o92 o92Var8 = u0Var.f410981n;
        o92Var7.set(1, java.lang.Integer.valueOf(o92Var8 != null ? o92Var8.m75939xb282bd08(1) : 0));
        r45.o92 o92Var9 = u0Var.f410981n;
        o92Var7.set(2, o92Var9 != null ? o92Var9.m75945x2fec8307(2) : null);
        u0Var.T6(o92Var7, false);
    }

    public final void O6(int i17, java.lang.String wording, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCommentSlice", "onUserPostFastComment, type:" + i17 + ", wording:" + wording + ", id:" + str);
        if (i17 == 4) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f410983p;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f410983p = null;
            pm0.v.X(new mm2.p0(this));
            return;
        }
        if (i17 == 5) {
            if (str != null) {
                pm0.v.X(new mm2.r0(this, str));
                this.f410986s = wording;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P6(r45.o92 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.u0.P6(r45.o92, boolean):void");
    }

    public final void Q6(boolean z17) {
        this.f410977g = z17;
    }

    public final void R6(r45.i60 i60Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setHintWording: hintword: ");
        sb6.append(i60Var != null ? i60Var.m75945x2fec8307(0) : null);
        sb6.append(" changed_hint_word: ");
        sb6.append(i60Var != null ? i60Var.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCommentSlice", sb6.toString());
        this.f410976f = i60Var;
    }

    public final void S6(r45.n92 n92Var) {
        this.f410985r = n92Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("new fastCommentCfg: ");
        sb6.append(n92Var != null ? java.lang.Integer.valueOf(n92Var.m75939xb282bd08(0)) : null);
        sb6.append(", ");
        sb6.append(n92Var != null ? java.lang.Integer.valueOf(n92Var.m75939xb282bd08(1)) : null);
        sb6.append(", ");
        sb6.append(n92Var != null ? java.lang.Boolean.valueOf(n92Var.m75933x41a8a7f2(2)) : null);
        sb6.append(", ");
        sb6.append(n92Var != null ? java.lang.Boolean.valueOf(n92Var.m75933x41a8a7f2(3)) : null);
        sb6.append(", ");
        sb6.append(n92Var != null ? java.lang.Integer.valueOf(n92Var.m75939xb282bd08(4)) : null);
        sb6.append(", ");
        sb6.append(n92Var != null ? java.lang.Integer.valueOf(n92Var.m75939xb282bd08(5)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCommentSlice", sb6.toString());
    }

    public final void T6(r45.o92 o92Var, boolean z17) {
        pm0.v.X(new mm2.s0(this, o92Var));
        r45.n92 n92Var = this.f410985r;
        int m75939xb282bd08 = n92Var != null ? n92Var.m75939xb282bd08(4) : 0;
        if (!z17 || m75939xb282bd08 <= 0) {
            return;
        }
        this.f410983p = p3325xe03a0797.p3326xc267989b.l.d(this.f410496d.f354008i, null, null, new mm2.t0(m75939xb282bd08, this, null), 3, null);
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        this.f410981n = null;
        this.f410985r = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f410983p;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f410983p = null;
        this.f410984q = 0L;
        this.f410980m = 0;
    }
}
