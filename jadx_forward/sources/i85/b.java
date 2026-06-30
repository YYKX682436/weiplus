package i85;

/* loaded from: classes12.dex */
public final class b implements d85.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i85.c f371196a;

    public b(i85.c cVar) {
        this.f371196a = cVar;
    }

    @Override // d85.m1
    public jz5.l a(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        boolean z17;
        java.lang.String name;
        boolean z18;
        android.content.ClipboardManager clipboardManager;
        i85.c cVar = this.f371196a;
        boolean z19 = false;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.a(), "phone") && method != null) {
            java.lang.String name2 = method.getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "getName(...)");
            if (r26.i0.y(name2, "requestCellInfoUpdate", false) && android.os.Build.VERSION.SDK_INT == 29) {
                return new jz5.l(java.lang.Boolean.FALSE, null);
            }
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.a(), "clipboard") && method != null) {
            java.util.List i17 = kz5.c0.i("getPrimaryClip", "getPrimaryClipDescription");
            if (!i17.isEmpty()) {
                java.util.Iterator it = i17.iterator();
                while (it.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(method.getName(), (java.lang.String) it.next())) {
                        z18 = true;
                        break;
                    }
                }
            }
            z18 = false;
            if (z18 && (clipboardManager = (android.content.ClipboardManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(android.content.ClipboardManager.class)) != null && !clipboardManager.hasPrimaryClip()) {
                return new jz5.l(java.lang.Boolean.FALSE, null);
            }
        }
        g85.c cVar2 = (g85.c) g85.d.f351088a.get(method != null ? method.getName() : null);
        jz5.l mo131090x6ac9171 = cVar2 != null ? cVar2.mo131090x6ac9171() : null;
        if (mo131090x6ac9171 != null) {
            boolean z27 = (method == null || (name = method.getName()) == null || !name.equals("getConnectionInfo")) ? false : true;
            java.lang.Object obj2 = mo131090x6ac9171.f384367e;
            if (z27 && (obj2 instanceof android.net.wifi.WifiInfo)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onServiceMethodIntercept] methodName = ");
                java.lang.String name3 = method != null ? method.getName() : null;
                if (name3 == null) {
                    name3 = "";
                }
                sb6.append(name3);
                sb6.append(", return cache: ");
                sb6.append(obj2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BaseHookSysServiceProcessor", sb6.toString());
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onServiceMethodIntercept] methodName = ");
                java.lang.String name4 = method != null ? method.getName() : null;
                if (name4 == null) {
                    name4 = "";
                }
                sb7.append(name4);
                sb7.append(", return cache:");
                if (obj2 == null) {
                    obj2 = "null";
                }
                sb7.append(obj2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BaseHookSysServiceProcessor", sb7.toString());
            }
            if (((java.lang.Boolean) mo131090x6ac9171.f384366d).booleanValue()) {
                z17 = false;
            } else {
                if (method != null) {
                    method.getName();
                }
                z17 = true;
            }
            j85.g gVar = j85.g.f379784a;
            java.lang.String serviceName = cVar.a();
            java.lang.String name5 = method != null ? method.getName() : null;
            java.lang.String str = name5 != null ? name5 : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceName, "serviceName");
            pm0.v.M(j85.g.f379785b, false, new j85.d(serviceName, str, z17), 2, null);
        }
        if (mo131090x6ac9171 != null && !((java.lang.Boolean) mo131090x6ac9171.f384366d).booleanValue()) {
            return mo131090x6ac9171;
        }
        if (method != null) {
            k85.t tVar = k85.t.f386972a;
            java.lang.String name6 = method.getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name6, "getName(...)");
            if (k85.t.b(tVar, name6, null, 2, null)) {
                z19 = true;
            }
        }
        if (!z19) {
            return new jz5.l(java.lang.Boolean.TRUE, null);
        }
        try {
            return new jz5.l(java.lang.Boolean.FALSE, method.getReturnType().newInstance());
        } catch (java.lang.Exception unused) {
            return new jz5.l(java.lang.Boolean.FALSE, null);
        }
    }

    @Override // d85.m1
    public void b(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f371196a.a(), "phone") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f371196a.a(), "clipboard")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c || com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() > 1) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onServiceMethodInvoke] methodName = ");
            sb6.append(this.f371196a.a());
            sb6.append('#');
            sb6.append(method != null ? method.getName() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kenneth-methodCall", sb6.toString());
            ((ku5.t0) ku5.t0.f394148d).g(new i85.a(new java.lang.Throwable(), this.f371196a, method));
            return;
        }
        if (method != null) {
            method.getName();
        }
        java.util.List list = g85.e.f351089a;
        java.lang.String name = method != null ? method.getName() : null;
        if (name == null) {
            name = "";
        }
        if (g85.e.f351089a.contains(name)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TraceMethodConfig", "sensitive method:".concat(name), new java.lang.Object[0]);
        }
    }

    @Override // d85.m1
    public void c(java.lang.reflect.Method method, java.lang.Object obj) {
        java.lang.String name = method != null ? method.getName() : null;
        if (name == null || obj == null) {
            return;
        }
        java.util.HashMap hashMap = g85.d.f351088a;
        g85.c cVar = (g85.c) g85.d.f351088a.get(name);
        if (cVar != null) {
            cVar.a(obj);
        }
    }
}
