package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.b f167404d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.b();

    @Override // java.lang.Runnable
    public final void run() {
        of.h hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a5.a(bm5.f1.a(), android.os.Process.myPid(), true, true);
        int myPid = android.os.Process.myPid();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6("/proc/" + myPid + "/maps");
        if (r6Var.m() && r6Var.h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Luggage.ProcMapsInfo", "doParse for " + myPid);
            java.io.InputStream C = com.p314xaae8f345.mm.vfs.w6.C(r6Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "openRead(...)");
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(C, r26.c.f450398a);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashMap hashMap = new java.util.HashMap();
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                java.util.List g17 = new r26.t("\\s+").g(readLine, 6);
                if (g17.size() < 5) {
                    java.lang.String arrays = java.util.Arrays.toString(g17.toArray(new java.lang.String[0]));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Luggage.ProcMapsInfo", "doParse, invalid tokens: ".concat(arrays));
                } else {
                    java.util.List f07 = r26.n0.f0((java.lang.CharSequence) g17.get(0), new java.lang.String[]{"-"}, false, 0, 6, null);
                    if (f07.size() < 2) {
                        java.lang.String arrays2 = java.util.Arrays.toString(f07.toArray(new java.lang.String[0]));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays2, "toString(...)");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Luggage.ProcMapsInfo", "doParse, invalid addrTokens: ".concat(arrays2));
                    } else {
                        java.lang.CharSequence charSequence = (java.lang.CharSequence) (5 <= kz5.c0.h(g17) ? g17.get(5) : "[anon]");
                        java.lang.String str = (java.lang.String) (r26.n0.N(charSequence) ? "[anon]" : charSequence);
                        java.lang.Long k17 = r26.h0.k((java.lang.String) f07.get(0), 16);
                        java.lang.Long k18 = r26.h0.k((java.lang.String) f07.get(1), 16);
                        if (k17 == null || k18 == null) {
                            java.lang.String arrays3 = java.util.Arrays.toString(f07.toArray(new java.lang.String[0]));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays3, "toString(...)");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Luggage.ProcMapsInfo", "doParse, invalid addrTokens: ".concat(arrays3));
                        } else {
                            of.t tVar = new of.t(str, k17.longValue(), k18.longValue(), (java.lang.String) g17.get(1));
                            arrayList.add(tVar);
                            java.lang.Object obj = hashMap.get(str);
                            if (obj == null) {
                                obj = new java.util.ArrayList();
                                hashMap.put(str, obj);
                            }
                            ((java.util.ArrayList) obj).add(tVar);
                        }
                    }
                }
            }
            hVar = new of.h(arrayList, hashMap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Luggage.ProcMapsInfo", "doParse, maps can not read");
            hVar = null;
        }
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Luggage.ProcMapsInfo", "free: " + ((of.a) ((jz5.n) hVar.f426364d).mo141623x754a37bb()));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("allocated: ");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(10);
            java.util.Iterator it = ((java.util.Map) ((jz5.n) hVar.f426363c).mo141623x754a37bb()).entrySet().iterator();
            int i17 = 0;
            while (it.hasNext()) {
                arrayList2.add((of.b) ((java.util.Map.Entry) it.next()).getValue());
                i17++;
                if (i17 >= 10) {
                    break;
                }
            }
            java.lang.String arrays4 = java.util.Arrays.toString(arrayList2.toArray(new of.b[0]));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays4, "toString(...)");
            sb6.append(arrays4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Luggage.ProcMapsInfo", sb6.toString());
        }
    }
}
