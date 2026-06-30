package lo0;

/* loaded from: classes14.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f401483a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401484b;

    /* renamed from: c, reason: collision with root package name */
    public final int f401485c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f401486d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f401487e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f401488f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f401489g;

    /* renamed from: h, reason: collision with root package name */
    public final lo0.b f401490h;

    /* renamed from: i, reason: collision with root package name */
    public final lo0.f f401491i;

    /* renamed from: j, reason: collision with root package name */
    public final int f401492j;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        if (r26.i0.y(r14, r8, false) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(org.json.JSONObject r13, java.lang.String r14, java.util.Map r15) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lo0.a0.<init>(org.json.JSONObject, java.lang.String, java.util.Map):void");
    }

    public a0() {
        this.f401483a = "off";
        this.f401484b = "停用";
        this.f401485c = android.graphics.Color.parseColor("#61D2D2D2");
        kz5.p0 p0Var = kz5.p0.f395529d;
        this.f401486d = p0Var;
        this.f401487e = p0Var;
        this.f401488f = p0Var;
        this.f401492j = 0;
        this.f401489g = false;
        this.f401490h = null;
        this.f401491i = new lo0.f("beauty-suite-off", p0Var);
    }

    public a0(lo0.a0 suiteToClone, java.util.Map badges) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suiteToClone, "suiteToClone");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(badges, "badges");
        this.f401483a = suiteToClone.f401483a;
        this.f401484b = suiteToClone.f401484b;
        this.f401485c = suiteToClone.f401485c;
        java.util.List<lo0.m> list = suiteToClone.f401486d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (lo0.m mVar : list) {
            mVar.getClass();
            arrayList.add(new lo0.m(mVar, badges));
        }
        this.f401486d = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList2, ((lo0.m) it.next()).f401580c);
        }
        this.f401487e = arrayList2;
        java.util.Map d17 = d75.b.d(arrayList2, lo0.y.f401625d);
        java.util.List<lo0.j> list2 = suiteToClone.f401488f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        for (lo0.j jVar : list2) {
            jVar.getClass();
            arrayList3.add(new lo0.j(jVar, d17));
        }
        this.f401488f = arrayList3;
        this.f401492j = suiteToClone.f401492j;
        this.f401489g = suiteToClone.f401489g;
        lo0.b bVar = suiteToClone.f401490h;
        this.f401490h = bVar != null ? (lo0.b) badges.get(bVar.f401493a) : null;
        java.util.List list3 = this.f401487e;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it6 = list3.iterator();
        while (it6.hasNext()) {
            lo0.b bVar2 = ((lo0.k) it6.next()).f401564n;
            if (bVar2 != null) {
                arrayList4.add(bVar2);
            }
        }
        this.f401491i = new lo0.f(suiteToClone.f401491i.f401518a, arrayList4);
    }
}
