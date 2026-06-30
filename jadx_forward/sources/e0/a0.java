package e0;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.d f327023a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f327024b;

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c f327025c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f327026d;

    public a0(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.d list, java.util.List headerIndexes, e06.k nearestItemsRange) {
        java.util.Map map;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerIndexes, "headerIndexes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nearestItemsRange, "nearestItemsRange");
        this.f327023a = list;
        this.f327024b = headerIndexes;
        int i17 = nearestItemsRange.f327742d;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.b0 b0Var = (p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.b0) list;
        int min = java.lang.Math.min(nearestItemsRange.f327743e, b0Var.f91926c - 1);
        if (min < i17) {
            map = kz5.q0.f395534d;
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            int a17 = p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.e.a(list, i17);
            while (i17 <= min) {
                p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c cVar = (p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c) ((java.util.ArrayList) b0Var.f91925b).get(a17);
                yz5.l lVar = ((e0.m) cVar.f91929c).f327177a;
                int i18 = cVar.f91928b;
                int i19 = cVar.f91927a;
                if (lVar != null) {
                    int i27 = i17 - i19;
                    if (i27 == i18) {
                        a17++;
                    } else {
                        hashMap.put(lVar.mo146xb9724478(java.lang.Integer.valueOf(i27)), java.lang.Integer.valueOf(i17));
                        i17++;
                    }
                } else {
                    a17++;
                    i17 = i19 + i18;
                }
            }
            map = hashMap;
        }
        this.f327026d = map;
    }

    public final void a(e0.g scope, int i17, n0.o oVar, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1922528915);
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c b17 = b(i17);
        ((e0.m) b17.f91929c).f327179c.C(scope, java.lang.Integer.valueOf(i17 - b17.f91927a), y0Var, java.lang.Integer.valueOf(i18 & 14));
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new e0.z(this, scope, i17, i18);
    }

    public final p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c b(int i17) {
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c cVar = this.f327025c;
        if (cVar != null) {
            int i18 = cVar.f91928b;
            int i19 = cVar.f91927a;
            if (i17 < i18 + i19 && i19 <= i17) {
                return cVar;
            }
        }
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.d dVar = this.f327023a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c cVar2 = (p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c) ((java.util.ArrayList) ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.b0) dVar).f91925b).get(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.e.a(dVar, i17));
        this.f327025c = cVar2;
        return cVar2;
    }
}
