package cw4;

/* loaded from: classes8.dex */
public final class i0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw4.m0 f305761d;

    public i0(cw4.m0 m0Var) {
        this.f305761d = m0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        cw4.o oVar;
        cw4.a0 a0Var = (cw4.a0) obj;
        cw4.m0 m0Var = this.f305761d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m0Var.f305772e, "get liveTransTextRes");
        if (a0Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = a0Var.f305726a;
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str = m0Var.f305772e;
                if (!hasNext) {
                    break;
                }
                cw4.z zVar = (cw4.z) it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f305841c) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f305839a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "node.transText == nil or hashCode == nil , node.orgText = " + zVar.f305840b);
                } else {
                    arrayList.add(kz5.c1.k(new jz5.l("transText", zVar.f305841c), new jz5.l("hashCode", zVar.f305839a)));
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f305841c) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f305840b) && (oVar = m0Var.f305778n) != null) {
                    java.lang.String str2 = zVar.f305840b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    java.lang.String str3 = zVar.f305841c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                    ((cw4.f1) oVar).f305751a.f263277g.put(str2, str3);
                }
            }
            java.lang.String mo15068x9616526c = new cl0.e(arrayList).mo15068x9616526c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15068x9616526c, "toString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "jsonData is ".concat(mo15068x9616526c));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((cw4.z) arrayList2.get(0)).f305842d)) {
                m0Var.f305773f = java.lang.String.valueOf(((cw4.z) arrayList2.get(0)).f305842d);
            }
            m0Var.e(mo15068x9616526c);
        }
    }
}
