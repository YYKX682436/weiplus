package j23;

/* loaded from: classes12.dex */
public final class y extends t13.b {

    /* renamed from: h, reason: collision with root package name */
    public java.util.HashSet f378825h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f378826i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378827m;

    /* renamed from: n, reason: collision with root package name */
    public long f378828n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f378829o;

    /* renamed from: p, reason: collision with root package name */
    public long f378830p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f378831q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f378832r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f378833s;

    /* renamed from: t, reason: collision with root package name */
    public int f378834t;

    /* renamed from: u, reason: collision with root package name */
    public int f378835u;

    /* renamed from: v, reason: collision with root package name */
    public e23.b1 f378836v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.l f378837w;

    /* JADX WARN: Multi-variable type inference failed */
    public y(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        j75.f m67437x4bd5310;
        this.f378825h = new java.util.HashSet();
        this.f378829o = true;
        this.f378832r = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f378833s = "";
        this.f378834t = 3;
        if ((context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) && (m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) context).m67437x4bd5310()) != null) {
            m67437x4bd5310.z3((p012xc85e97e9.p093xedfae76a.y) context, new j23.v(this, context, jVar));
        }
        this.f378835u = Integer.MAX_VALUE;
    }

    @Override // t13.k
    public u13.g b(int i17) {
        if (i17 != this.f378835u) {
            return null;
        }
        e23.b1 b1Var = new e23.b1(18, i17);
        java.lang.String str = this.f378827m;
        if (str == null) {
            str = "";
        }
        int i18 = 0;
        b1Var.f505295e = p13.r.b(str, false);
        this.f378836v = b1Var;
        java.util.LinkedList linkedList = this.f378831q;
        if (linkedList != null) {
            java.lang.String sugTitle = this.f378833s;
            int i19 = this.f378834t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sugTitle, "sugTitle");
            b1Var.f328318s = sugTitle;
            b1Var.f328317r = i19;
            java.util.LinkedList linkedList2 = b1Var.f328316q;
            linkedList2.clear();
            for (java.lang.Object obj : linkedList) {
                int i27 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.jo0 jo0Var = new r45.jo0();
                jo0Var.f459521f = o13.p.f423784d;
                jo0Var.f459520e = i18;
                jo0Var.f459519d = (r45.di6) obj;
                linkedList2.add(jo0Var);
                i18 = i27;
            }
        }
        yz5.l lVar = this.f378837w;
        if (lVar != null) {
            lVar.mo146xb9724478(b1Var);
        }
        return b1Var;
    }

    @Override // t13.k
    public void c() {
        this.f378835u = Integer.MAX_VALUE;
        this.f378825h.clear();
        this.f378825h = new java.util.HashSet();
        this.f378829o = true;
        this.f378827m = null;
        this.f378828n = 0L;
        this.f378830p = 0L;
        this.f378836v = null;
        this.f378837w = null;
    }

    @Override // t13.k
    /* renamed from: cancelSearch */
    public void mo63601x92b73cc2() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f378826i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // t13.k
    public long d() {
        return this.f378830p;
    }

    @Override // t13.k
    public int e() {
        int i17;
        e23.b1 b1Var = this.f378836v;
        if (b1Var != null) {
            i17 = b1Var.f328316q.size();
            if (i17 > 3) {
                i17 = 3;
            }
        } else {
            i17 = 0;
        }
        if (i17 == 0) {
            java.util.LinkedList linkedList = this.f378831q;
            if (!(linkedList == null || linkedList.isEmpty())) {
                java.util.LinkedList linkedList2 = this.f378831q;
                if (linkedList2 != null) {
                    return linkedList2.size();
                }
                return 0;
            }
        }
        return i17;
    }

    @Override // t13.k
    public void f(java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet, long j17) {
        mo63601x92b73cc2();
        this.f378827m = str;
        this.f378828n = j17;
        if (hashSet != null) {
            this.f378825h.addAll(hashSet);
        }
        this.f378832r.set(false);
        this.f378831q = null;
        this.f378833s = "";
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        this.f378826i = c20976x6ba6452a != null ? v65.i.b(c20976x6ba6452a, null, new j23.x(this, j17, str, null), 1, null) : null;
    }

    @Override // t13.k
    public java.util.LinkedList g() {
        return new java.util.LinkedList();
    }

    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 256;
    }

    @Override // t13.k
    public java.util.List h(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p13.e eVar = new p13.e();
        long c17 = c01.id.c();
        eVar.f432612g = "SOSItemRelevant:" + this.f378827m;
        eVar.f432607b = this.f378835u;
        eVar.f432606a = 0;
        eVar.f432608c = 0;
        long j18 = c17 - j17;
        eVar.f432611f = j18;
        eVar.f432610e = j18;
        eVar.f432616k = c17;
        eVar.f432609d = 1;
        arrayList.add(eVar);
        return arrayList;
    }

    @Override // t13.k
    public int j(int i17) {
        if (this.f378829o) {
            this.f378835u = Integer.MAX_VALUE;
            return i17;
        }
        this.f378835u = i17;
        return i17 + 1;
    }
}
