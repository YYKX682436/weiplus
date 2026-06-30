package oy4;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f431588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f431589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oy4.c f431590f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.util.ArrayList arrayList, oy4.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f431589e = arrayList;
        this.f431590f = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oy4.b bVar = new oy4.b(this.f431589e, this.f431590f, interfaceC29045xdcb5ca57);
        bVar.f431588d = obj;
        return bVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((oy4.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        java.util.ArrayList<java.lang.String> arrayList;
        java.lang.String str;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getImageClsResult >> ");
        java.util.ArrayList<java.lang.String> arrayList3 = this.f431589e;
        sb6.append(arrayList3.size());
        sb6.append(' ');
        sb6.append(java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsApiImpl", sb6.toString());
        oy4.c cVar = this.f431590f;
        cVar.getClass();
        int i17 = 0;
        if (oy4.c.f431593d != null) {
            z17 = true;
        } else {
            ny4.e eVar = new ny4.e();
            oy4.c.f431593d = eVar;
            ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
            p05.a3 a3Var = p05.a3.f431972a;
            java.lang.String g17 = a3Var.g("MODEL_CHAT_CLS_MODEL");
            java.lang.String g18 = a3Var.g("MODEL_CHAT_CLS_MAP");
            if (!(g17 == null || g17.length() == 0)) {
                if (!(g18 == null || g18.length() == 0)) {
                    long m83706x630f29e = com.p314xaae8f345.mm.p2825x7e128009.C22967xee5e9be4.m83706x630f29e(g17, g18, 2);
                    eVar.f422990a = m83706x630f29e;
                    if (m83706x630f29e == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeChatClsManager", "init weChatCls error");
                        z17 = false;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsApiImpl", "initEnv >> " + z17);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatClsManager", "init weChatCls success " + eVar.f422990a);
                        z17 = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsApiImpl", "initEnv >> " + z17);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeChatClsManager", "initClsEnv >> model is null");
            z17 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsApiImpl", "initEnv >> " + z17);
        }
        if (!z17) {
            return arrayList2;
        }
        for (java.lang.String str3 : arrayList3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsApiImpl", "getImageClsResult >> " + str3);
            oy4.a a17 = ny4.h.f423000a.a(str3);
            java.nio.Buffer buffer = a17 != null ? a17.f431585b : null;
            android.graphics.Bitmap bitmap = a17 != null ? a17.f431584a : null;
            if (buffer == null || bitmap == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ClsApiImpl", "getImageOcrResult >> buffer get error");
                arrayList2.add(new java.util.ArrayList());
            } else {
                ny4.e eVar2 = oy4.c.f431593d;
                if (eVar2 != null) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    long j17 = eVar2.f422990a;
                    if (j17 == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeChatClsManager", "applyReq >> weChatClsHandle no init");
                        arrayList = new java.util.ArrayList<>();
                    } else {
                        arrayList = com.p314xaae8f345.mm.p2825x7e128009.C22967xee5e9be4.m83702xf5e3f8e9(j17, buffer, width, height);
                    }
                } else {
                    arrayList = null;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getImageClsResult >> result: ");
                sb7.append(arrayList != null ? new java.lang.Integer(arrayList.size()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsApiImpl", sb7.toString());
                if (arrayList == null) {
                    arrayList2.add(new java.util.ArrayList());
                } else if (!arrayList.isEmpty()) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.util.List f07 = r26.n0.f0((java.lang.String) it.next(), new java.lang.String[]{"&&"}, false, 0, 6, null);
                        java.lang.String str4 = (java.lang.String) kz5.n0.a0(f07, i17);
                        if (str4 != null && (str = (java.lang.String) kz5.n0.a0(f07, 1)) != null && (str2 = (java.lang.String) kz5.n0.k0(r26.n0.f0(str4, new java.lang.String[]{"#"}, false, 0, 6, null))) != null) {
                            try {
                                ny4.e eVar3 = oy4.c.f431593d;
                                if (eVar3 != null) {
                                    arrayList4.add(new ck0.a(eVar3.d(java.lang.Integer.parseInt(str2), "zh_CN"), java.lang.Float.parseFloat(str)));
                                }
                            } catch (java.lang.NumberFormatException unused) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ClsApiImpl", "getImageClsResult >> NumberFormatException");
                            }
                        }
                        i17 = 0;
                    }
                    arrayList2.add(arrayList4);
                } else {
                    arrayList2.add(new java.util.ArrayList());
                }
            }
            i17 = 0;
        }
        cVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ClsApiImpl", "destroyEnv");
        ny4.e eVar4 = oy4.c.f431593d;
        if (eVar4 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatClsManager", "destroyClsEnv " + eVar4.f422990a);
            long j18 = eVar4.f422990a;
            if (j18 != 0) {
                com.p314xaae8f345.mm.p2825x7e128009.C22967xee5e9be4.m83708x46fb07b9(j18);
                eVar4.f422990a = 0L;
            }
        }
        oy4.c.f431593d = null;
        return arrayList2;
    }
}
