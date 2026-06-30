package ro5;

/* loaded from: classes14.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f479672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f479673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zo5.e f479674f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f479675g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f479676h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(ro5.m1 m1Var, int i17, zo5.e eVar, int i18, int i19) {
        super(2);
        this.f479672d = m1Var;
        this.f479673e = i17;
        this.f479674f = eVar;
        this.f479675g = i18;
        this.f479676h = i19;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool;
        so5.y yVar;
        so5.t[] tVarArr;
        boolean z17;
        java.lang.Object m143895xf1229813;
        int intValue = ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).longValue();
        ro5.m1 m1Var = this.f479672d;
        if (m1Var.f479782k) {
            return java.lang.Boolean.TRUE;
        }
        xo5.n nVar = m1Var.f479775d;
        dp5.d dVar = nVar.f537327e.f545898n;
        if (dVar != null) {
            zo5.e eVar = this.f479674f;
            int i17 = this.f479673e;
            bool = java.lang.Boolean.valueOf(ro5.m1.a(m1Var, i17, dVar, new ro5.z0(m1Var, intValue, eVar, i17)));
        } else {
            bool = null;
        }
        m1Var.f479780i.a("local_render", bool != null ? bool.booleanValue() : false);
        int i18 = 0;
        while (true) {
            yVar = m1Var.f479793v;
            int i19 = yVar.f492462p;
            tVarArr = yVar.f492463q;
            if (i18 >= i19) {
                break;
            }
            java.nio.ByteBuffer byteBuffer = yVar.f492467u;
            byteBuffer.clear();
            int b17 = yVar.f492457h.b(yVar.f492466t, byteBuffer, i18);
            if (b17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ILinkVoIP.EncoderManager", "doQoSCheck: get params error " + b17);
                break;
            }
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                uo5.u a17 = uo5.u.f511273l.a(byteBuffer);
                if ((a17.f511286j & 128) != 0) {
                    byte b18 = a17.f511282f;
                    if (b18 == 4) {
                        yVar.f(true, i18, a17);
                    } else if (b18 == 8) {
                        yVar.f(false, i18, a17);
                    } else {
                        yVar.j(i18, a17);
                    }
                } else {
                    so5.t tVar = tVarArr[i18];
                    so5.q qVar = so5.q.f492439b;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar, qVar)) {
                        yVar.i(i18);
                        tVarArr[i18] = qVar;
                    }
                }
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ILinkVoIP.EncoderManager", m143898xd4a2fc34, "handle result", new java.lang.Object[0]);
            }
            i18++;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(tVarArr.length);
        int length = tVarArr.length;
        int i27 = 0;
        int i28 = 0;
        while (i27 < length) {
            int i29 = i28 + 1;
            arrayList.add(java.lang.Integer.valueOf((tVarArr[i27].f492441a && yVar.f492464r[i28].f492421c) ? (i28 << 16) | com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965 : -1));
            i27++;
            i28 = i29;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((java.lang.Number) next).intValue() >= 0) {
                arrayList2.add(next);
            }
        }
        dp5.d dVar2 = nVar.f537327e.f545898n;
        if (dVar2 != null) {
            int i37 = this.f479675g;
            int i38 = this.f479676h;
            if (arrayList2.isEmpty()) {
                z17 = true;
            } else {
                java.util.ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                boolean z18 = true;
                while (listIterator.hasPrevious()) {
                    int intValue2 = ((java.lang.Number) listIterator.previous()).intValue();
                    z18 = ro5.m1.a(m1Var, intValue2, dVar2, new ro5.y0(m1Var, intValue, i37, i38, intValue2)) && z18;
                }
                z17 = z18;
            }
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
