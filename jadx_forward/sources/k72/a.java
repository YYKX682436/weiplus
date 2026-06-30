package k72;

/* loaded from: classes12.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f386234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f386234d = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new k72.a(this.f386234d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        k72.a aVar = (k72.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        aVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        java.lang.String readLine;
        java.lang.String string;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (!k72.b.f386238b) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("tpcs");
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/facedetectaction/model/DevSecurityScan", "loadLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj2, "com/tencent/mm/plugin/facedetectaction/model/DevSecurityScan", "loadLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            k72.b.f386238b = true;
        }
        int i18 = this.f386234d;
        if ((i18 & 1) == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            int i19 = -1;
            int i27 = L != null ? L.getInt("PAY_DEV_SE_01", -1) : -1;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            java.lang.String str = "";
            if (L2 != null && (string = L2.getString("PAY_DEV_SE_02", "")) != null) {
                str = string;
            }
            if (i27 != -1) {
                k72.c.f386239a = i27;
                k72.c.f386241c = str;
                i19 = 0;
            }
            k72.c.f386240b = i19;
            if (i19 != 0) {
                try {
                    k72.b bVar = k72.b.f386237a;
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(bVar.a("\fSQL@\fPFOE\fNBSP")));
                    if (!r6Var.m()) {
                        i17 = -2;
                    } else if (r6Var.h()) {
                        java.lang.String a17 = bVar.a("OJAKLVGJMJ");
                        java.lang.String a18 = bVar.a("\f[\u001b\u0015\f");
                        java.lang.String a19 = bVar.a("\f[\u001b\u0015|\u0015\u0017\f");
                        com.p314xaae8f345.mm.vfs.u6 u6Var = new com.p314xaae8f345.mm.vfs.u6(r6Var);
                        try {
                            java.io.Reader inputStreamReader = new java.io.InputStreamReader(u6Var, r26.c.f450398a);
                            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
                            do {
                                try {
                                    readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        vz5.b.a(bufferedReader, null);
                                        vz5.b.a(u6Var, null);
                                        break;
                                    }
                                    if (r26.n0.B(readLine, a17, true) || r26.n0.B(readLine, a18, true)) {
                                        break;
                                    }
                                } finally {
                                }
                            } while (!r26.n0.B(readLine, a19, true));
                            k72.c.f386239a = 1;
                            java.util.List g17 = new r26.t("\\s+").g(readLine, 0);
                            java.lang.String str2 = g17.size() >= 6 ? (java.lang.String) g17.get(5) : null;
                            if (str2 == null) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(14);
                                for (int i28 = 0; i28 < 14; i28++) {
                                    arrayList2.add(java.lang.Character.valueOf((char) ("OJAKLVGJMJ|[\u001b\u0015".charAt(i28) ^ '#')));
                                }
                                str2 = kz5.n0.g0(arrayList2, "", null, null, 0, null, null, 62, null);
                            }
                            k72.c.f386241c = str2;
                            vz5.b.a(bufferedReader, null);
                            vz5.b.a(u6Var, null);
                            i17 = 0;
                        } finally {
                        }
                    } else {
                        i17 = -3;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ScanEngine01", e17, "DoScan failed!", new java.lang.Object[0]);
                    i17 = -4;
                }
                k72.c.f386240b = i17;
                if (i17 == 0) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
                    if (L3 != null) {
                        L3.putInt("PAY_DEV_SE_01", k72.c.f386239a);
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
                    if (L4 != null) {
                        L4.putString("PAY_DEV_SE_02", k72.c.f386241c);
                    }
                }
            }
        }
        if ((i18 & 16) == 0 && k72.c.f386239a != 1) {
            int m55190xdf992c76 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.m55190xdf992c76();
            if (m55190xdf992c76 == 1) {
                java.lang.String m55195xee1ef45b = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.m55195xee1ef45b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m55195xee1ef45b, "getVAScanResult(...)");
                k72.e0.f386255c = m55195xee1ef45b;
                k72.e0.f386253a = 1;
                k72.e0.f386254b = 0;
            } else {
                k72.e0.f386253a = 0;
                k72.e0.f386254b = m55190xdf992c76;
            }
        }
        return jz5.f0.f384359a;
    }
}
