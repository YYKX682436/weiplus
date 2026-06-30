package r42;

/* loaded from: classes15.dex */
public abstract class c {
    public static java.util.List a(r45.rh0 rh0Var) {
        if (rh0Var == null) {
            return null;
        }
        java.util.LinkedList linkedList = rh0Var.f466396d;
        if (linkedList.size() <= 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.qh0 qh0Var = (r45.qh0) it.next();
            r42.a aVar = new r42.a();
            aVar.f451043s = qh0Var.f465521e;
            aVar.f451044t = qh0Var.f465522f;
            aVar.f451042r = qh0Var.f465520d;
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public static java.util.Map b(r45.yh0 yh0Var) {
        if (yh0Var == null) {
            return null;
        }
        java.util.LinkedList linkedList = yh0Var.f472609d;
        if (linkedList.size() <= 0) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.xh0 xh0Var = (r45.xh0) it.next();
            if (!u46.l.e(xh0Var.f471625d)) {
                s42.b bVar = new s42.b();
                bVar.f484464a = xh0Var.f471625d;
                bVar.f484465b = xh0Var.f471626e;
                bVar.f484466c = xh0Var.f471627f;
                bVar.f484467d = xh0Var.f471628g;
                bVar.f484469f = xh0Var.f471630i;
                bVar.f484473j = xh0Var.f471637s;
                bVar.f484470g = xh0Var.f471635q;
                bVar.f484471h = xh0Var.f471634p;
                bVar.f484472i = xh0Var.f471631m;
                bVar.f484474k = xh0Var.f471632n;
                bVar.f484475l = xh0Var.f471638t;
                bVar.f484477n = xh0Var.f471636r;
                bVar.f484468e = new java.util.ArrayList();
                java.util.Iterator it6 = xh0Var.f471629h.iterator();
                while (it6.hasNext()) {
                    r45.sh0 sh0Var = (r45.sh0) it6.next();
                    s42.a aVar = new s42.a();
                    aVar.f484461a = sh0Var.f467244d;
                    aVar.f484463c = sh0Var.f467246f;
                    aVar.f484462b = sh0Var.f467245e;
                    bVar.f484468e.add(aVar);
                }
                hashMap.put(bVar.f484464a, bVar);
            }
        }
        return hashMap;
    }

    public static java.util.Map c(r45.ai0 ai0Var) {
        if (ai0Var == null) {
            return null;
        }
        java.util.LinkedList linkedList = ai0Var.f451551d;
        if (linkedList.size() <= 0) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.zh0 zh0Var = (r45.zh0) it.next();
            if (!u46.l.e(zh0Var.f473587d)) {
                s42.c cVar = new s42.c();
                java.lang.String str = zh0Var.f473587d;
                cVar.f484478a = str;
                cVar.f484479b = zh0Var.f473588e;
                cVar.f484480c = zh0Var.f473589f;
                cVar.f484481d = zh0Var.f473594n;
                cVar.f484485h = zh0Var.f473592i;
                cVar.f484482e = zh0Var.f473590g;
                cVar.f484483f = zh0Var.f473593m;
                cVar.f484484g = zh0Var.f473591h;
                hashMap.put(str, cVar);
            }
        }
        return hashMap;
    }
}
