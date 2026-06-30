package g04;

/* loaded from: classes15.dex */
public class d implements gx5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f348985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g04.i f348987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15 f348988d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15 c17351x2827be15, long j17, java.lang.String str, g04.i iVar) {
        this.f348988d = c17351x2827be15;
        this.f348985a = j17;
        this.f348986b = str;
        this.f348987c = iVar;
    }

    public void a(g04.k kVar) {
        java.lang.String b17;
        r45.tu5 a17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        kd0.t2 t2Var = (kd0.t2) i95.n0.c(kd0.t2.class);
        kd0.a aVar = kd0.a.f388130g;
        java.lang.String sessionId = this.f348985a + "";
        ((jd0.f2) t2Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        if (cz3.e.f306560a.c()) {
            java.lang.String str = this.f348986b;
            if (!(str == null || str.length() == 0)) {
                java.lang.String str2 = (java.lang.String) cz3.e.f306563d.remove(str);
                if (!(str2 == null || str2.length() == 0) && (a17 = cz3.e.a((b17 = cz3.e.b(aVar, str)))) != null) {
                    java.util.LinkedList crashList = a17.f468348d;
                    if (crashList != null) {
                        crashList.size();
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(crashList, "crashList");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : crashList) {
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.uu5) obj).f469185e, str2)) {
                            arrayList.add(obj);
                        }
                    }
                    crashList.clear();
                    crashList.addAll(arrayList);
                    arrayList.size();
                    if (crashList.isEmpty()) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 v3Var = cz3.e.f306562c;
                        if (v3Var != null && (o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) v3Var.i()) != null) {
                            o4Var.remove(b17);
                        }
                        ((lt0.f) cz3.e.f306564e).mo141381xc84af884(b17);
                    } else {
                        cz3.e.e(b17, a17);
                    }
                }
            }
        }
        g04.i iVar = this.f348987c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15 c17351x2827be15 = this.f348988d;
        if (kVar != null && iVar != null) {
            c17351x2827be15.f241551f.put(iVar.f348997a, kVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15.a(c17351x2827be15, iVar, new g04.l(kVar));
    }
}
