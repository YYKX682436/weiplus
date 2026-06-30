package ky2;

/* loaded from: classes3.dex */
public final class g0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f395074d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f395075e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f395076f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f395077g;

    /* renamed from: h, reason: collision with root package name */
    public long f395078h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f395079i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f395080m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f395081n;

    public g0(android.view.ViewGroup root, gk2.e liveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f395074d = root;
        this.f395075e = liveData;
        this.f395076f = new java.util.ArrayList();
        this.f395079i = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f395076f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ky2.d0 holder = (ky2.d0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b1n, parent, false);
        android.view.ViewGroup viewGroup = this.f395074d;
        if (viewGroup.getContext().getResources().getConfiguration().orientation == 2) {
            android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = viewGroup.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = viewGroup.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new ky2.d0(this, inflate);
    }

    public final void x(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 3);
        r45.me2 me2Var = ((mm2.c1) this.f395075e.a(mm2.c1.class)).f410317b6;
        jSONObject.put("vote_id", me2Var != null ? me2Var.m75945x2fec8307(5) : null);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.E1, t17, 0L, null, null, null, null, null, 252, null);
        java.lang.Object obj = this.f395076f.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.l30 l30Var = (r45.l30) obj;
        l30Var.set(2, 1);
        l30Var.set(3, java.lang.Integer.valueOf(l30Var.m75939xb282bd08(3) + 1));
        this.f395078h++;
    }

    public final void y(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 4);
        r45.me2 me2Var = ((mm2.c1) this.f395075e.a(mm2.c1.class)).f410317b6;
        jSONObject.put("vote_id", me2Var != null ? me2Var.m75945x2fec8307(5) : null);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.E1, t17, 0L, null, null, null, null, null, 252, null);
        java.lang.Object obj = this.f395076f.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.l30 l30Var = (r45.l30) obj;
        l30Var.set(2, 0);
        if (l30Var.m75939xb282bd08(3) > 0) {
            l30Var.set(3, java.lang.Integer.valueOf(l30Var.m75939xb282bd08(3) - 1));
        }
        this.f395078h--;
    }

    public final void z(java.util.LinkedList respList, long j17, boolean z17, boolean z18, boolean z19) {
        boolean z27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respList, "respList");
        this.f395081n = z18;
        this.f395079i = z17;
        boolean z28 = this.f395078h != j17;
        this.f395078h = j17;
        java.util.ArrayList arrayList = this.f395076f;
        if (arrayList.size() != respList.size() || z19) {
            arrayList.clear();
            arrayList.addAll(respList);
            m8152xc67946d3(0, respList.size(), java.lang.Boolean.TRUE);
            return;
        }
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((r45.l30) arrayList.get(i17)).m75939xb282bd08(0) != ((r45.l30) respList.get(i17)).m75939xb282bd08(0)) {
                arrayList.clear();
                arrayList.addAll(respList);
                m8152xc67946d3(0, respList.size(), java.lang.Boolean.TRUE);
            } else {
                if (((r45.l30) arrayList.get(i17)).m75939xb282bd08(3) != ((r45.l30) respList.get(i17)).m75939xb282bd08(3) || z28) {
                    ((r45.l30) arrayList.get(i17)).set(3, java.lang.Integer.valueOf(((r45.l30) respList.get(i17)).m75939xb282bd08(3)));
                    z27 = true;
                } else {
                    z27 = false;
                }
                if (((r45.l30) arrayList.get(i17)).m75939xb282bd08(2) != ((r45.l30) respList.get(i17)).m75939xb282bd08(2)) {
                    ((r45.l30) arrayList.get(i17)).set(2, java.lang.Integer.valueOf(((r45.l30) respList.get(i17)).m75939xb282bd08(2)));
                    z27 = true;
                }
                if (z27) {
                    m8148xed6e4d18(i17, java.lang.Boolean.TRUE);
                }
            }
            i17 = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r16, int r17, java.util.List r18) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ky2.g0.mo8157xe5e2e48d(androidx.recyclerview.widget.k3, int, java.util.List):void");
    }
}
