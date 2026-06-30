package lo0;

/* loaded from: classes14.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f401568a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f401569b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f401570c;

    /* renamed from: d, reason: collision with root package name */
    public final int f401571d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f401572e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f401573f;

    /* renamed from: g, reason: collision with root package name */
    public final lo0.b f401574g;

    /* renamed from: h, reason: collision with root package name */
    public final lo0.f f401575h;

    /* renamed from: i, reason: collision with root package name */
    public final int f401576i;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        if (r26.i0.y(r2, r13, false) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k0(org.json.JSONObject r18, java.lang.String r19, java.util.Map r20, lo0.r0 r21) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lo0.k0.<init>(org.json.JSONObject, java.lang.String, java.util.Map, lo0.r0):void");
    }

    public k0() {
        this.f401568a = "original";
        this.f401569b = false;
        this.f401570c = "原片";
        this.f401571d = android.graphics.Color.parseColor("#61D2D2D2");
        this.f401572e = "";
        kz5.p0 p0Var = kz5.p0.f395529d;
        this.f401573f = p0Var;
        this.f401574g = null;
        this.f401575h = new lo0.f("makeup-details-original", p0Var);
        this.f401576i = 0;
    }

    public k0(lo0.k0 k0Var, java.util.Map badges) {
        this.f401568a = k0Var.f401568a;
        this.f401569b = k0Var.f401569b;
        this.f401570c = k0Var.f401570c;
        this.f401571d = k0Var.f401571d;
        this.f401572e = k0Var.f401572e;
        java.util.List<lo0.h0> list = k0Var.f401573f;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (lo0.h0 h0Var : list) {
            h0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(badges, "badges");
            arrayList.add(new lo0.h0(h0Var, badges));
        }
        this.f401573f = arrayList;
        lo0.b bVar = k0Var.f401574g;
        this.f401574g = bVar != null ? (lo0.b) badges.get(bVar.f401493a) : null;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lo0.b bVar2 = ((lo0.h0) it.next()).f401538i;
            if (bVar2 != null) {
                arrayList2.add(bVar2);
            }
        }
        this.f401575h = new lo0.f(k0Var.f401575h.f401518a, arrayList2);
        this.f401576i = k0Var.f401576i;
    }
}
