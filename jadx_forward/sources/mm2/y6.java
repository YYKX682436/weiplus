package mm2;

/* loaded from: classes3.dex */
public final class y6 {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f411110a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f411111b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f411112c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f411113d;

    /* renamed from: e, reason: collision with root package name */
    public int f411114e;

    /* renamed from: f, reason: collision with root package name */
    public int f411115f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f411116g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f411117h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f411118i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f411119j;

    /* renamed from: k, reason: collision with root package name */
    public r45.hn1 f411120k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Boolean f411121l;

    /* renamed from: m, reason: collision with root package name */
    public int f411122m;

    /* renamed from: n, reason: collision with root package name */
    public r45.re2 f411123n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f411124o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f411125p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f411126q;

    public y6(gk2.e liveContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f411110a = liveContext;
        this.f411111b = "Finder.LiveWhiteSlice";
        this.f411116g = new java.util.ArrayList();
        this.f411117h = new java.util.ArrayList();
        this.f411118i = new java.util.ArrayList();
        this.f411121l = java.lang.Boolean.FALSE;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        this.f411122m = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r10) {
        /*
            r9 = this;
            r0 = 1
            boolean r1 = pm0.v.z(r10, r0)
            if (r1 == 0) goto L16
            java.util.List r1 = r9.f411113d
            if (r1 == 0) goto L10
            int r1 = r1.size()
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 > 0) goto L16
            r1 = r10 & (-2)
            goto L17
        L16:
            r1 = r10
        L17:
            r2 = 2
            boolean r3 = pm0.v.z(r10, r2)
            java.util.ArrayList r4 = r9.f411116g
            if (r3 == 0) goto L28
            int r3 = r4.size()
            if (r3 > 0) goto L28
            r1 = r10 & (-3)
        L28:
            r3 = 4
            boolean r5 = pm0.v.z(r10, r3)
            java.util.ArrayList r6 = r9.f411117h
            if (r5 == 0) goto L39
            int r5 = r6.size()
            if (r5 > 0) goto L39
            r1 = r10 & (-5)
        L39:
            r5 = 32
            boolean r7 = pm0.v.z(r10, r5)
            java.util.ArrayList r8 = r9.f411118i
            if (r7 == 0) goto L4b
            int r7 = r8.size()
            if (r7 > 0) goto L4b
            r1 = r10 & (-33)
        L4b:
            boolean r0 = pm0.v.z(r10, r0)
            if (r0 != 0) goto L58
            java.util.List r0 = r9.f411113d
            if (r0 == 0) goto L58
            r0.clear()
        L58:
            boolean r0 = pm0.v.z(r10, r2)
            if (r0 != 0) goto L61
            r4.clear()
        L61:
            boolean r0 = pm0.v.z(r10, r3)
            if (r0 != 0) goto L6a
            r6.clear()
        L6a:
            boolean r0 = pm0.v.z(r10, r5)
            if (r0 != 0) goto L73
            r8.clear()
        L73:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "checkVisibilityMode oriMode:"
            r0.<init>(r2)
            r0.append(r10)
            java.lang.String r10 = " finalMode:"
            r0.append(r10)
            r0.append(r1)
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = r9.f411111b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.y6.a(int):int");
    }

    public final void b() {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.util.LinkedList m75941xfb8219143;
        if (this.f411114e == 0) {
            this.f411116g.clear();
            this.f411117h.clear();
            this.f411118i.clear();
            java.util.List list = this.f411113d;
            if (list != null) {
                list.clear();
            }
            r45.re2 re2Var = this.f411123n;
            if (re2Var != null && (m75941xfb8219143 = re2Var.m75941xfb821914(0)) != null) {
                m75941xfb8219143.clear();
            }
            r45.re2 re2Var2 = this.f411123n;
            if (re2Var2 != null && (m75941xfb8219142 = re2Var2.m75941xfb821914(2)) != null) {
                m75941xfb8219142.clear();
            }
            r45.re2 re2Var3 = this.f411123n;
            if (re2Var3 == null || (m75941xfb821914 = re2Var3.m75941xfb821914(3)) == null) {
                return;
            }
            m75941xfb821914.clear();
        }
    }

    public final void c(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.util.List list = this.f411112c;
        intent.putExtra("KEY_PARAMS_WHITE_LIST", list instanceof java.io.Serializable ? (java.io.Serializable) list : null);
        java.util.List list2 = this.f411113d;
        intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", list2 instanceof java.io.Serializable ? (java.io.Serializable) list2 : null);
        intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_ROOM", this.f411116g);
        intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_USER", this.f411117h);
        intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LABEL_LIST", this.f411118i);
        r45.hn1 hn1Var = this.f411120k;
        intent.putExtra("KEY_PARAMS_LIVE_CHARGE", hn1Var != null ? hn1Var.mo14344x5f01b1f6() : null);
        r45.re2 re2Var = this.f411123n;
        intent.putExtra("KEY_PARAMS_LIVE_PART_WHITE_LIST", re2Var != null ? re2Var.mo14344x5f01b1f6() : null);
        intent.putExtra("KEY_PARAMS_VISIBILITY_MODE", this.f411114e);
        intent.putExtra("KEY_PARAMS_IS_TEST_LIVE", this.f411115f == 1);
        java.util.LinkedList linkedList = ((mm2.c1) this.f411110a.a(mm2.c1.class)).f410336f4.f390582a;
        if (true ^ linkedList.isEmpty()) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            arrayList.addAll(linkedList);
            intent.putStringArrayListExtra("KEY_PARAMS_LUCKY_MONEY_LIST", arrayList);
        }
    }

    public final boolean d() {
        return this.f411120k != null;
    }

    public final boolean e() {
        if (f() || pm0.v.z(this.f411114e, 64) || !this.f411117h.isEmpty() || !this.f411116g.isEmpty() || !this.f411118i.isEmpty()) {
            return false;
        }
        java.util.List list = this.f411113d;
        return list == null || list.isEmpty();
    }

    public final boolean f() {
        return this.f411115f == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    public final void g(android.content.Intent intent) {
        r45.hn1 hn1Var;
        byte[] byteArrayExtra;
        byte[] byteArrayExtra2;
        r45.re2 re2Var = null;
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("KEY_PARAMS_CHOOSE_WHITE_LIST") : null;
        this.f411113d = p3321xbce91901.jvm.p3324x21ffc6bd.m0.g(serializableExtra) ? (java.util.List) serializableExtra : null;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_ROOM") : null;
        if (stringArrayListExtra != null) {
            java.util.ArrayList arrayList = this.f411116g;
            arrayList.clear();
            arrayList.addAll(stringArrayListExtra);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent != null ? intent.getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_USER") : null;
        if (stringArrayListExtra2 != null) {
            java.util.ArrayList arrayList2 = this.f411117h;
            arrayList2.clear();
            arrayList2.addAll(stringArrayListExtra2);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent != null ? intent.getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LABEL_LIST") : null;
        if (stringArrayListExtra3 != null) {
            java.util.ArrayList arrayList3 = this.f411118i;
            arrayList3.clear();
            arrayList3.addAll(stringArrayListExtra3);
        }
        if (intent == null || (byteArrayExtra2 = intent.getByteArrayExtra("KEY_PARAMS_LIVE_CHARGE")) == null) {
            hn1Var = null;
        } else {
            hn1Var = new r45.hn1();
            hn1Var.mo11468x92b714fd(byteArrayExtra2);
        }
        i(hn1Var);
        this.f411121l = intent != null ? java.lang.Boolean.valueOf(intent.getBooleanExtra("KEY_PARAMS_LIVE_CHARGE_VIP_FREE", false)) : null;
        this.f411122m = intent != null ? intent.getIntExtra("KEY_PARAMS_LIVE_CHARGE_FREE_FLAG", 0) : 0;
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_LIVE_PART_WHITE_LIST")) != null) {
            re2Var = new r45.re2();
            re2Var.mo11468x92b714fd(byteArrayExtra);
        }
        j(re2Var);
        int intExtra = intent != null ? intent.getIntExtra("KEY_PARAMS_VISIBILITY_MODE", 0) : 0;
        this.f411114e = a(intExtra);
        this.f411115f = intent != null ? intent.getBooleanExtra("KEY_PARAMS_IS_TEST_LIVE", false) : 0;
        b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411111b, "anchorChooseMode:" + intExtra);
    }

    public final void h(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411111b, "set isBussinessVisitor:" + z17 + ",ori value:" + this.f411119j);
        this.f411119j = z17;
    }

    public final void i(r45.hn1 hn1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveChargePost:");
        cm2.a aVar = cm2.a.f124861a;
        sb6.append(aVar.k(hn1Var));
        sb6.append(",ori value:");
        sb6.append(aVar.k(this.f411120k));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411111b, sb6.toString());
        this.f411120k = hn1Var;
    }

    public final void j(r45.re2 re2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("partWhiteList:");
        cm2.a aVar = cm2.a.f124861a;
        sb6.append(aVar.q(re2Var));
        sb6.append(",ori value:");
        sb6.append(aVar.q(this.f411123n));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411111b, sb6.toString());
        this.f411123n = re2Var;
    }
}
