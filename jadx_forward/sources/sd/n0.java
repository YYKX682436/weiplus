package sd;

/* loaded from: classes8.dex */
public class n0 implements pf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.o0 f488160a;

    public n0(sd.o0 o0Var) {
        this.f488160a = o0Var;
    }

    public boolean a(java.lang.String str) {
        java.util.Iterator it = this.f488160a.f488170p.f443766a.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(pair.first);
            java.util.regex.Pattern pattern = (java.util.regex.Pattern) pair.second;
            if (pattern != null && pattern.matcher(str).matches()) {
                throw null;
            }
        }
        return false;
    }

    public void b(java.lang.String str) {
        sd.o0 o0Var = this.f488160a;
        o0Var.f488171q = str;
        ((od.n) o0Var.f488167m.f426052d).f426057a.a();
        sd.p0 p0Var = o0Var.f488165h;
        if (p0Var != null) {
            od.l lVar = o0Var.f488167m;
            lVar.f426049a.mo32260x738236e6(p0Var.a(), null);
            o0Var.f488165h.b(str);
        }
    }

    public android.webkit.WebResourceResponse c(java.lang.String str) {
        android.webkit.WebResourceResponse e17;
        d(str);
        sd.o0 o0Var = this.f488160a;
        sd.p0 p0Var = o0Var.f488165h;
        return (p0Var == null || (e17 = p0Var.e(str)) == null) ? o0Var.f488169o.b(str) : e17;
    }

    public final void d(java.lang.String str) {
        java.lang.String path;
        sd.o0 o0Var = this.f488160a;
        if (o0Var.f488173s) {
            return;
        }
        if ((str == null || str.length() == 0 || (path = android.net.Uri.parse(str).getPath()) == null || !path.trim().endsWith("html")) ? false : true) {
            return;
        }
        o0Var.i();
    }
}
