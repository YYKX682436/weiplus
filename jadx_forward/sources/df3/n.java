package df3;

@j95.b
/* loaded from: classes7.dex */
public final class n extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.t4 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f313560d;

    public final void Ai() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        bf3.x0 x0Var = bf3.x0.f101207a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        android.graphics.Point a17 = x0Var.a(context);
        float a18 = bf3.p0.f101178a.a();
        int b17 = a06.d.b(a17.x / a18);
        int b18 = a06.d.b(a17.y / a18);
        java.lang.String RELEASE = android.os.Build.VERSION.RELEASE;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(RELEASE, "RELEASE");
        java.lang.Object mo141623x754a37bb = ((jz5.n) bf3.p0.f101183f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        java.lang.String str = (java.lang.String) mo141623x754a37bb;
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) bf3.p0.f101182e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        java.lang.String str2 = (java.lang.String) mo141623x754a37bb2;
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        java.lang.String CLIENT_VERSION = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CLIENT_VERSION, "CLIENT_VERSION");
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation;
        java.lang.String str3 = i17 != 1 ? i17 != 2 ? "" : "landscape" : "portrait";
        float floatValue = ((java.lang.Number) ((jz5.n) bf3.p0.f101180c).mo141623x754a37bb()).floatValue();
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) bf3.p0.f101184g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.c cVar = com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.c.f301618b;
        com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.a aVar = new com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3185xe480f708.a();
        aVar.f301602d = RELEASE;
        boolean[] zArr = aVar.f301617v;
        zArr[1] = true;
        aVar.f301603e = str;
        zArr[2] = true;
        aVar.f301604f = str2;
        zArr[3] = true;
        aVar.f301605g = com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f;
        zArr[4] = true;
        aVar.f301606h = "";
        zArr[5] = true;
        aVar.f301607i = j17;
        zArr[6] = true;
        aVar.f301608m = CLIENT_VERSION;
        zArr[7] = true;
        aVar.f301609n = b17;
        zArr[8] = true;
        aVar.f301610o = b18;
        zArr[9] = true;
        aVar.f301612q = str3;
        zArr[11] = true;
        aVar.f301611p = a18;
        zArr[10] = true;
        aVar.f301613r = floatValue;
        zArr[12] = true;
        aVar.f301614s = (java.lang.String) mo141623x754a37bb3;
        zArr[13] = true;
        aVar.f301615t = C;
        zArr[14] = true;
        aVar.f301616u = mo168058x74219ae7;
        zArr[15] = true;
        cVar.e(aVar);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40973x40b15f2e(new df3.i());
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context2).registerComponentCallbacks(new df3.j());
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(df3.k.f313557d);
    }

    public final java.util.LinkedList wi() {
        java.util.Map k17 = kz5.c1.k(new jz5.l("MagicSclPublicService", ge3.q.f352505a), new jz5.l("MagicSclNativeDemo", ge3.o.f352503a));
        java.util.ArrayList arrayList = new java.util.ArrayList(k17.size());
        for (java.util.Map.Entry entry : k17.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.a aVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.a();
            java.lang.String str = (java.lang.String) entry.getKey();
            ge3.a aVar2 = (ge3.a) entry.getValue();
            lc3.a aVar3 = new lc3.a("mbpkgs/" + str + ".wspkg", 0L, aVar2.mo131355xb5885648(), 0L);
            aVar.f298895d = str;
            boolean[] zArr = aVar.f298902n;
            zArr[1] = true;
            aVar.f298896e = bf3.r0.d(aVar3, str);
            zArr[2] = true;
            bf3.r0.b(aVar3, str);
            aVar.f298897f = aVar2.mo131356xb5887639();
            zArr[3] = true;
            aVar.f298898g = aVar2.mo131355xb5885648();
            zArr[4] = true;
            aVar.f298899h = aVar2.a();
            zArr[5] = true;
            aVar.f298901m = aVar2.d();
            zArr[7] = true;
            aVar.f298900i = aVar2.b();
            zArr[6] = true;
            boolean z17 = zArr[1];
            arrayList.add(aVar);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        kz5.n0.O0(arrayList, linkedList);
        return linkedList;
    }
}
