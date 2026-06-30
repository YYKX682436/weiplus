package d85;

/* loaded from: classes12.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f308786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.d1 f308787e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(d85.d1 d1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f308787e = d1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        d85.y0 y0Var = new d85.y0(this.f308787e, interfaceC29045xdcb5ca57);
        y0Var.f308786d = obj;
        return y0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        d85.y0 y0Var = (d85.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean z17 = true;
        boolean z18 = android.os.Build.VERSION.SDK_INT > 29 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (z18) {
            i17 = 0;
        } else {
            i17 = 0;
            for (java.util.Map.Entry entry : d85.j1.f308741a.entrySet()) {
                java.lang.Object value = entry.getValue();
                java.lang.String c17 = ((i85.p) value).c();
                if (!(((c17 == null || c17.length() == 0) ? z17 : false) ^ z17)) {
                    value = null;
                }
                i85.p pVar = (i85.p) value;
                if (pVar != null) {
                    d85.o1 o1Var = new d85.o1((java.lang.String) entry.getKey(), pVar.c(), pVar.b());
                    jz5.l a17 = o1Var.a();
                    java.lang.Boolean bool = (java.lang.Boolean) a17.f384366d;
                    if (bool.booleanValue()) {
                        i17++;
                        d85.l1 l1Var = o1Var.f308768f;
                        java.lang.Object obj2 = l1Var != null ? l1Var.f308749b : null;
                        if (obj2 != null) {
                            pVar.d(obj2);
                        }
                    } else {
                        j85.g gVar = j85.g.f379784a;
                        pm0.v.M(j85.g.f379785b, false, new j85.c(null, (java.lang.String) entry.getKey()), 2, null);
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("service ");
                    sb6.append((java.lang.String) entry.getKey());
                    sb6.append(" hook ");
                    sb6.append(bool.booleanValue() ? ya.b.f77504xbb80cbe3 : com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                    sb6.append(" , processName:");
                    sb6.append(bm5.f1.a());
                    sb6.append(", errMsg:");
                    sb6.append((java.lang.String) a17.f384367e);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kenneth-methodCall", sb6.toString());
                    f0Var = f0Var2;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kenneth-methodCall", "service " + ((java.lang.String) entry.getKey()) + " hook failed, processName:" + bm5.f1.a());
                }
                z17 = true;
            }
            j85.g gVar2 = j85.g.f379784a;
            pm0.v.M(j85.g.f379785b, false, new j85.f(android.os.SystemClock.uptimeMillis() - uptimeMillis, i17), 2, null);
        }
        try {
            if (!(android.os.Build.VERSION.SDK_INT > 29 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n())) {
                d85.h.f308728a.c();
            }
        } catch (java.lang.Throwable th6) {
            j85.g gVar3 = j85.g.f379784a;
            pm0.v.M(j85.g.f379785b, false, new j85.c("HookContentProvider:", "HookContentProvider"), 2, null);
            java.util.Map map = d85.d1.f308678f;
            this.f308787e.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kenneth-methodCall", "hook provider failed:" + th6.getMessage() + ",size = 0");
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.f1.a(), "com.tencent.mm")) {
            if (fp.h.a(33)) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66 b17 = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.b();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER");
                intentFilter.addAction("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT");
                context.registerReceiver(b17, intentFilter);
            } else {
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66 b18 = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.b();
                android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
                intentFilter2.addAction("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER");
                intentFilter2.addAction("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT");
                context2.registerReceiver(b18, intentFilter2, 4);
            }
        }
        e85.b bVar = com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f;
        bVar.b().getClass();
        android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context3).registerActivityLifecycleCallbacks(bVar.b());
        rk5.b.f478674d.c(bVar.b());
        d85.f fVar = d85.f.f308685a;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40963x40b15f2e(new d85.a());
        java.util.HashMap hashMap = d85.f.f308687c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("startActivityForResult", "(Landroid/content/Intent;I)V"));
        hashMap.put("android/app/Activity", arrayList);
        xj0.a.h().k(hashMap, d85.b.f308668a);
        java.util.HashMap hashMap2 = d85.f.f308686b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(android.util.Pair.create("open", "()Landroid/hardware/Camera;"));
        arrayList2.add(android.util.Pair.create("open", "(I)Landroid/hardware/Camera;"));
        arrayList2.add(android.util.Pair.create("startPreview", "()V"));
        arrayList2.add(android.util.Pair.create("release", "()V"));
        hashMap2.put("android/hardware/Camera", arrayList2);
        xj0.a.h().k(hashMap2, new d85.c());
        java.util.HashMap hashMap3 = d85.f.f308688d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(android.util.Pair.create("openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V"));
        arrayList3.add(android.util.Pair.create("openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V"));
        hashMap3.put("android/hardware/camera2/CameraManager", arrayList3);
        xj0.a.h().k(hashMap3, new d85.d());
        java.util.HashMap hashMap4 = d85.r0.f308772a;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(android.util.Pair.create("startRecording", "()V"));
        hashMap4.put("android/media/AudioRecord", arrayList4);
        java.util.HashMap hashMap5 = d85.r0.f308773b;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(android.util.Pair.create("startLocalAudio", "()V"));
        hashMap5.put("com/tencent/trtc/TRTCCloud", arrayList5);
        xj0.a.h().k(hashMap4, d85.p0.f308769a);
        xj0.a.h().k(hashMap5, d85.q0.f308771a);
        java.util.HashMap hashMap6 = d85.o.f308760b;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(android.util.Pair.create("exportToPublicDownloadDirImpl", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;"));
        arrayList6.add(android.util.Pair.create("exportImageImpl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"));
        arrayList6.add(android.util.Pair.create("exportVideoImpl", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"));
        hashMap6.put("com/tencent/mm/platformtools/ExportFileUtil", arrayList6);
        xj0.a.h().k(hashMap6, d85.l.f308746a);
        java.util.HashMap hashMap7 = d85.o.f308761c;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(android.util.Pair.create("saveBitmapToImage", "(Landroid/graphics/Bitmap;II;Ljava/lang/String;Z)Ljava/lang/String;"));
        hashMap7.put("com/tencent/mm/sdk/platformtools/BitmapUtil", arrayList7);
        xj0.a.h().k(hashMap7, d85.n.f308754a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kenneth-methodCall", "hook duration=" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + ",successCount = " + i17 + ",count = " + d85.j1.f308741a.size() + ",processName:" + bm5.f1.a());
        return f0Var2;
    }
}
