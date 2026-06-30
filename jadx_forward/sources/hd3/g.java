package hd3;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hd3.i f362088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362089f;

    public g(java.lang.String str, hd3.i iVar, java.lang.String str2) {
        this.f362087d = str;
        this.f362088e = iVar;
        this.f362089f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [jz5.f0] */
    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.vfs.x1 x1Var;
        java.lang.Object obj;
        java.lang.String str = this.f362087d;
        lc3.z zVar = lc3.x.f399469c;
        java.lang.String str2 = null;
        if (str != null) {
            hd3.i iVar = this.f362088e;
            java.lang.String str3 = this.f362089f;
            java.lang.String str4 = "CPU_" + iVar.e().f425864a + '_' + java.lang.System.currentTimeMillis() + ".cpuprofile";
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bf3.r0.a(str4, str));
            if (!valueOf.booleanValue()) {
                valueOf = null;
            }
            ?? r86 = jz5.f0.f384359a;
            if (valueOf != null) {
                valueOf.booleanValue();
                int length = str.length();
                java.lang.String str5 = lp0.b.D() + "appbrand/trace/";
                java.lang.String str6 = str5 + str4;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStopCpuProfile", "hy: dump successful with " + length + " bytes!");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                if ((str3.length() > 0 ? str3 : null) != null) {
                    java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(str5, false);
                    if (s17 != null) {
                        java.util.Iterator it = s17.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            java.lang.String name = ((com.p314xaae8f345.mm.vfs.x1) obj).f294765b;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                            if (r26.i0.y(name, "gpu-".concat(str3), false)) {
                                break;
                            }
                        }
                        x1Var = (com.p314xaae8f345.mm.vfs.x1) obj;
                    } else {
                        x1Var = null;
                    }
                    if (x1Var != null) {
                        str2 = x1Var.f294764a;
                    }
                }
                ((ku5.t0) ku5.t0.f394148d).B(new hd3.f(length, str6, str2));
                iVar.s().mo146xb9724478(iVar.k());
                str2 = r86;
            }
            if (str2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStopCpuProfile", "hy: cpu profile " + str4 + " generate failed");
                iVar.s().mo146xb9724478(iVar.i(zVar));
            }
            str2 = r86;
        }
        if (str2 == null) {
            hd3.i iVar2 = this.f362088e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStopCpuProfile", "hy: cpu profile content is null!");
            iVar2.s().mo146xb9724478(iVar2.i(zVar));
        }
    }
}
