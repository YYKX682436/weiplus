package cn2;

/* loaded from: classes3.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(cn2.d dVar, java.lang.String str) {
        dVar.getClass();
        try {
            com.tencent.mm.sdk.platformtools.r2 r2Var = cn2.k.f43554j;
            int size = r2Var.size();
            com.tencent.mm.sdk.platformtools.r2 r2Var2 = cn2.k.f43555k;
            int size2 = r2Var2.size();
            com.tencent.mars.xlog.Log.i("AnimConfig", str + " flashLight cache Size:" + size + ",floatCover cache Size:" + size2 + '!');
            if (size > 0) {
                r2Var.d(-1);
            }
            if (size2 > 0) {
                r2Var2.d(-1);
            }
            dVar.b(null);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "AnimConfig-memoryTrim");
        }
    }

    public final void b(cn2.k kVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveAnimConfig from ");
        cn2.k kVar2 = cn2.k.f43556l;
        sb6.append(kVar2 != null ? kVar2.f43557a : null);
        sb6.append(" to ");
        sb6.append(kVar != null ? kVar.f43557a : null);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("AnimConfig", sb6.toString());
        cn2.k.f43556l = kVar;
    }
}
