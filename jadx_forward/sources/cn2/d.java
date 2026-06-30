package cn2;

/* loaded from: classes3.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(cn2.d dVar, java.lang.String str) {
        dVar.getClass();
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = cn2.k.f125087j;
            int m77804x35e001 = r2Var.m77804x35e001();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var2 = cn2.k.f125088k;
            int m77804x35e0012 = r2Var2.m77804x35e001();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnimConfig", str + " flashLight cache Size:" + m77804x35e001 + ",floatCover cache Size:" + m77804x35e0012 + '!');
            if (m77804x35e001 > 0) {
                r2Var.d(-1);
            }
            if (m77804x35e0012 > 0) {
                r2Var2.d(-1);
            }
            dVar.b(null);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "AnimConfig-memoryTrim");
        }
    }

    public final void b(cn2.k kVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveAnimConfig from ");
        cn2.k kVar2 = cn2.k.f125089l;
        sb6.append(kVar2 != null ? kVar2.f125090a : null);
        sb6.append(" to ");
        sb6.append(kVar != null ? kVar.f125090a : null);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnimConfig", sb6.toString());
        cn2.k.f125089l = kVar;
    }
}
