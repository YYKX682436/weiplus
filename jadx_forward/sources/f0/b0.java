package f0;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.d f339540a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f339541b;

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c f339542c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f339543d;

    public b0(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.d intervals, boolean z17, e06.k nearestItemsRange) {
        java.util.Map map;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intervals, "intervals");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nearestItemsRange, "nearestItemsRange");
        this.f339540a = intervals;
        this.f339541b = z17;
        int i17 = nearestItemsRange.f327742d;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.b0 b0Var = (p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.b0) intervals;
        int min = java.lang.Math.min(nearestItemsRange.f327743e, b0Var.f91926c - 1);
        if (min < i17) {
            map = kz5.q0.f395534d;
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            int a17 = p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.e.a(intervals, i17);
            while (i17 <= min) {
                p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c cVar = (p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c) ((java.util.ArrayList) b0Var.f91925b).get(a17);
                yz5.l lVar = ((f0.j) cVar.f91929c).f339652a;
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
        this.f339543d = map;
    }

    public final void a(int i17, n0.o oVar, int i18) {
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-405085610);
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c b17 = b(i17);
        ((f0.j) b17.f91929c).f339655d.C(f0.y.f339805a, java.lang.Integer.valueOf(i17 - b17.f91927a), y0Var, 6);
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new f0.a0(this, i17, i18);
    }

    public final p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c b(int i17) {
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c cVar = this.f339542c;
        if (cVar != null) {
            int i18 = cVar.f91928b;
            int i19 = cVar.f91927a;
            if (i17 < i18 + i19 && i19 <= i17) {
                return cVar;
            }
        }
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.d dVar = this.f339540a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c cVar2 = (p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c) ((java.util.ArrayList) ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.b0) dVar).f91925b).get(p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.e.a(dVar, i17));
        this.f339542c = cVar2;
        return cVar2;
    }
}
