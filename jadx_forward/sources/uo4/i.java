package uo4;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 f511242a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7();

    /* renamed from: b, reason: collision with root package name */
    public uo4.h f511243b = new uo4.h();

    public final void a() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        android.os.Debug.MemoryInfo[] processMemoryInfo = ((android.app.ActivityManager) systemService).getProcessMemoryInfo(new int[]{android.os.Process.myPid()});
        if ((processMemoryInfo != null ? processMemoryInfo.length : 0) >= 1) {
            this.f511243b.f511240c.f511214a = processMemoryInfo[0].getTotalPss();
        }
        java.util.Map snapshot = rm5.h.f479023i.snapshot();
        this.f511243b.f511240c.f511215b = snapshot.size();
        uo4.d dVar = this.f511243b.f511240c;
        java.util.Iterator it = snapshot.values().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((android.graphics.Bitmap) it.next()).getAllocationByteCount();
        }
        dVar.f511216c = i17;
        java.lang.String jSONObject = this.f511243b.b().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject, ",", ";", false);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e7 = this.f511242a;
        c6759x7a5829e7.f140857e = c6759x7a5829e7.b("JsonInfo", t17, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiMediaEditReport", "report: " + this.f511242a.n());
        this.f511242a.k();
        this.f511242a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7();
        this.f511243b = new uo4.h();
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        this.f511243b.f511238a.clear();
        java.util.Iterator it = composition.f257130c.iterator();
        long j17 = 0;
        long j18 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            uo4.f a17 = xo4.d.f537303a.a((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next());
            uo4.g gVar = a17 instanceof uo4.g ? (uo4.g) a17 : null;
            if (gVar != null) {
                gVar.f511234r = composition.e().f479119n != null;
            }
            if (a17 != null) {
                if (a17 instanceof uo4.e) {
                    j18++;
                } else {
                    j17++;
                }
                this.f511243b.f511238a.add(a17);
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e7 = this.f511242a;
        c6759x7a5829e7.f140870r = 1;
        c6759x7a5829e7.f140858f = j17;
        c6759x7a5829e7.f140859g = j18;
        c6759x7a5829e7.f140865m = composition.f257136i ? 1L : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiMediaEditReport", "setComposition, isEnableVideoEnhancement:" + composition.f257136i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [uo4.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [uo4.c] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, uo4.b] */
    /* JADX WARN: Type inference failed for: r2v4, types: [uo4.c] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
    public final void c(java.util.List itemList) {
        ?? bVar;
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        this.f511243b.f511239b.clear();
        java.util.Iterator it = itemList.iterator();
        while (it.hasNext()) {
            zu3.a aVar = (zu3.a) it.next();
            zu3.e eVar = aVar.f557291a;
            java.lang.String str3 = "";
            if (eVar == zu3.e.f557329e) {
                bVar = new uo4.c();
                zu3.a0 a0Var = aVar instanceof zu3.a0 ? (zu3.a0) aVar : null;
                if (a0Var != null && (str2 = a0Var.f557301k) != null) {
                    str3 = str2;
                }
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str3);
                ?? r76 = a17.f294812f;
                if (r76 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(r76, false, false);
                    if (!r76.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                java.lang.String str4 = a17.f294812f;
                int lastIndexOf = str4.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    str4 = str4.substring(lastIndexOf + 1);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getName(...)");
                bVar.f511213c = str4;
            } else if (eVar == zu3.e.f557334m) {
                bVar = new uo4.c();
                zu3.d dVar = aVar instanceof zu3.d ? (zu3.d) aVar : null;
                if (dVar != null && (str = dVar.f557328j) != null) {
                    str3 = str;
                }
                com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str3);
                ?? r77 = a18.f294812f;
                if (r77 != null) {
                    java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(r77, false, false);
                    if (!r77.equals(l18)) {
                        a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                    }
                }
                java.lang.String str5 = a18.f294812f;
                int lastIndexOf2 = str5.lastIndexOf("/");
                if (lastIndexOf2 >= 0) {
                    str5 = str5.substring(lastIndexOf2 + 1);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "getName(...)");
                bVar.f511213c = str5;
            } else {
                bVar = new uo4.b();
            }
            bVar.f511211a = aVar.f557291a.f557338d;
            java.util.ArrayList arrayList = bVar.f511212b;
            bv3.d dVar2 = aVar.f557293c;
            arrayList.add(java.lang.Long.valueOf(dVar2.c()));
            arrayList.add(java.lang.Long.valueOf(dVar2.b()));
            this.f511243b.f511239b.add(bVar);
        }
        this.f511242a.f140860h = itemList.size();
    }
}
