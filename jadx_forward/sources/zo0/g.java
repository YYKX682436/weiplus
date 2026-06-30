package zo0;

/* loaded from: classes10.dex */
public abstract class g {
    public final void a(ip0.a url, ep0.h fileNameCreator, fp0.c loader, zo0.c callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileNameCreator, "fileNameCreator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        zo0.f fVar = new zo0.f(loader, this, url, fileNameCreator, callback);
        fp0.o oVar = (fp0.o) loader;
        if (oVar.f346804c == null) {
            gp0.g gVar = (gp0.g) oVar.f346802a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pool heavy poolSize ");
            gp0.h hVar = gVar.f355707c;
            sb6.append(hVar.f355711a);
            sb6.append(" priority ");
            int i17 = hVar.f355711a;
            sb6.append(i17);
            sb6.append(" name: ");
            java.lang.String str = gVar.f355709e;
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f355710f, sb6.toString());
            oVar.f346804c = new gp0.c(str, i17, i17, new kp0.a());
        }
        fp0.a aVar = oVar.f346804c;
        if (aVar != null) {
            ((gp0.c) aVar).execute(fVar);
        }
    }

    public abstract void b(ip0.a aVar, ep0.h hVar, zo0.b bVar);
}
