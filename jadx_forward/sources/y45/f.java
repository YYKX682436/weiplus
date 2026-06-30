package y45;

/* loaded from: classes12.dex */
public abstract class f extends d55.r {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f540900c;

    public f(java.lang.String str) {
        super(str);
        this.f540900c = str;
    }

    public final void b(android.content.Context context) {
        java.util.List list = this.f308144a;
        if (((java.util.ArrayList) list).size() == 0) {
            return;
        }
        java.util.Set set = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.f274426i;
        java.lang.String str = this.f540900c;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = "".equals(str) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L() : com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(str);
        L.getClass();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            d55.o oVar = (d55.o) it.next();
            oVar.f308135c = L;
            oVar.a(L);
            java.lang.String mo123521x730bcac6 = oVar.mo123521x730bcac6();
            java.lang.StringBuilder sb6 = this.f308145b;
            sb6.append(mo123521x730bcac6);
            sb6.append(";\n");
        }
    }
}
