package p36;

/* loaded from: classes16.dex */
public final class a implements l36.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final l36.y f433249a;

    public a(l36.y yVar) {
        this.f433249a = yVar;
    }

    @Override // l36.m0
    public l36.a1 a(l36.l0 l0Var) {
        boolean z17;
        p36.i iVar = (p36.i) l0Var;
        l36.w0 w0Var = iVar.f433260f;
        w0Var.getClass();
        l36.v0 v0Var = new l36.v0(w0Var);
        w0Var.getClass();
        java.lang.String a17 = w0Var.a("Host");
        l36.k0 k0Var = w0Var.f397214a;
        if (a17 == null) {
            v0Var.f397199c.e("Host", m36.e.k(k0Var, false));
        }
        if (w0Var.a("Connection") == null) {
            v0Var.f397199c.e("Connection", "Keep-Alive");
        }
        if (w0Var.a("Accept-Encoding") == null && w0Var.a("Range") == null) {
            v0Var.f397199c.e("Accept-Encoding", "gzip");
            z17 = true;
        } else {
            z17 = false;
        }
        l36.y yVar = this.f433249a;
        ((l36.x) yVar).getClass();
        java.util.List emptyList = java.util.Collections.emptyList();
        if (!emptyList.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int size = emptyList.size();
            for (int i17 = 0; i17 < size; i17++) {
                if (i17 > 0) {
                    sb6.append("; ");
                }
                l36.w wVar = (l36.w) emptyList.get(i17);
                sb6.append(wVar.f397205a);
                sb6.append('=');
                sb6.append(wVar.f397206b);
            }
            v0Var.f397199c.e("Cookie", sb6.toString());
        }
        if (w0Var.a("User-Agent") == null) {
            v0Var.f397199c.e("User-Agent", "okhttp/3.12.13");
        }
        l36.a1 a18 = iVar.a(v0Var.a(), iVar.f433256b, iVar.f433257c, iVar.f433258d);
        p36.g.d(yVar, k0Var, a18.f396993i);
        l36.z0 z0Var = new l36.z0(a18);
        z0Var.f397224a = w0Var;
        if (z17 && "gzip".equalsIgnoreCase(a18.b("Content-Encoding")) && p36.g.b(a18)) {
            x36.s sVar = new x36.s(a18.f396994m.c());
            l36.h0 e17 = a18.f396993i.e();
            e17.d("Content-Encoding");
            e17.d("Content-Length");
            java.util.ArrayList arrayList = (java.util.ArrayList) e17.f397035a;
            java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
            l36.h0 h0Var = new l36.h0();
            java.util.Collections.addAll(h0Var.f397035a, strArr);
            z0Var.f397229f = h0Var;
            z0Var.f397230g = new p36.j(a18.b("Content-Type"), -1L, x36.v.b(sVar));
        }
        return z0Var.a();
    }
}
