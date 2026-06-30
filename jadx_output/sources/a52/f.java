package a52;

/* loaded from: classes15.dex */
public class f implements e42.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static e42.j0 f1587d;

    /* renamed from: e, reason: collision with root package name */
    public static final e42.g0 f1588e = new a52.e();

    public static void a(android.app.Application application) {
        if (application == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellhoundService", "IHellhoundService Start !!!");
        gm0.j1.q(e42.k0.class, new a52.f());
        e42.k0 k0Var = (e42.k0) gm0.j1.s(e42.k0.class);
        com.tencent.mm.plugin.expt.hellhound.ext.session.config.d.a().f99792a.alive();
        com.tencent.mm.plugin.expt.hellhound.ext.session.config.e.a().f99794a.alive();
        com.tencent.mm.plugin.expt.hellhound.ext.session.config.f.a().f99796a.alive();
        e42.g0 g0Var = f1588e;
        ((a52.f) k0Var).getClass();
        ((g52.b) b52.a.a().f18077a).f268892c.f268894a = g0Var;
        s52.b.d().f403161b = new a52.b();
        b52.a a17 = b52.a.a();
        a52.c cVar = new a52.c();
        a17.getClass();
        f52.c.b().f259630a.f259631a.f259632a = cVar;
        a52.d dVar = new a52.d();
        i52.k kVar = (i52.k) b52.a.a().f18078b;
        kVar.f288490b = dVar;
        p52.b bVar = p52.k.f352044b;
        bVar.getClass();
        o52.e eVar = bVar.f351998e;
        if (eVar != null) {
            eVar.f343100b = kVar;
        }
        b52.a a18 = b52.a.a();
        a18.getClass();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellhoundMonitor", "Hellhound.startMonitor()");
        g52.b bVar2 = (g52.b) a18.f18077a;
        bVar2.getClass();
        if (a52.a.b()) {
            g52.h hVar = bVar2.f268891b;
            hVar.getClass();
            com.tencent.mm.autogen.events.OnStartPageLifecycleMonitorEvent onStartPageLifecycleMonitorEvent = new com.tencent.mm.autogen.events.OnStartPageLifecycleMonitorEvent();
            java.lang.System.currentTimeMillis();
            onStartPageLifecycleMonitorEvent.f54586g.getClass();
            onStartPageLifecycleMonitorEvent.e();
            rk5.b.f397141d.c(hVar.f268901d);
            xj0.a.h().f454774b = hVar.f268899b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new android.util.Pair("startActivity", "(Landroid/content/Intent;)V"));
            arrayList.add(new android.util.Pair("startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V"));
            arrayList.add(new android.util.Pair("startActivities", "([Landroid/content/Intent;)V"));
            arrayList.add(new android.util.Pair("startActivities", "([Landroid/content/Intent;Landroid/os/Bundle;)V"));
            xj0.a.h().i(arrayList, hVar.f268900c);
        }
        s52.b.f(104, "", 0, 0L);
        c62.c cVar2 = v52.c.g().f433305a;
        cVar2.getClass();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FloatBallSessionHandler", "FloatBallSessionHandler, startMonitor");
        xj0.a.h().l(cVar2.f39456a, cVar2.f39457b);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(android.util.Pair.create("processOnItemClick", "(II)V"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("com/tencent/mm/ui/PlusSubMenuHelper", arrayList2);
        xj0.a.h().l(hashMap, f62.b.f259846b);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(android.util.Pair.create("onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z"));
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("com/tencent/mm/ui/AbstractTabChildPreference", arrayList3);
        xj0.a.h().l(hashMap2, d62.b.f226767c);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(new android.util.Pair("requestPermissions", "([Ljava/lang/String;I)V"));
        xj0.a.h().i(arrayList4, u52.b.f424798d);
        java.util.Map map = k52.l.f304310a;
        k52.o oVar = (k52.o) ((jz5.n) k52.l.f304311b).getValue();
        k52.j jVar = k52.l.f304314e;
        oVar.f304317a = jVar;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(new android.util.Pair("onClick", "(Landroid/view/View;)V"));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("android/view/View$OnClickListener", arrayList5);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(new android.util.Pair("onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z"));
        linkedHashMap.put("android/view/View$OnDragListener", arrayList6);
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(new android.util.Pair("onLongClick", "(Landroid/view/View;)Z"));
        linkedHashMap.put("android/view/View$OnLongClickListener", arrayList7);
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(new android.util.Pair("onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z"));
        linkedHashMap.put("android/view/View$OnKeyListener", arrayList8);
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(new android.util.Pair("onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z"));
        linkedHashMap.put("android/view/View$OnTouchListener", arrayList9);
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(new android.util.Pair("onHover", "(Landroid/view/View;Landroid/view/MotionEvent;)Z"));
        linkedHashMap.put("android/view/View$OnHoverListener", arrayList10);
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        arrayList11.add(new android.util.Pair("onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"));
        linkedHashMap.put("android/widget/AdapterView$OnItemClickListener", arrayList11);
        java.util.ArrayList arrayList12 = new java.util.ArrayList();
        arrayList12.add(new android.util.Pair("onItemLongClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"));
        linkedHashMap.put("android/widget/AdapterView$OnItemLongClickListener", arrayList12);
        java.util.ArrayList arrayList13 = new java.util.ArrayList();
        arrayList13.add(new android.util.Pair("onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"));
        linkedHashMap.put("android/widget/AdapterView$OnItemSelectedListener", arrayList13);
        java.util.ArrayList arrayList14 = new java.util.ArrayList();
        arrayList14.add(new android.util.Pair("onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V"));
        linkedHashMap.put("androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", arrayList14);
        java.util.ArrayList arrayList15 = new java.util.ArrayList();
        arrayList15.add(new android.util.Pair("onClick", "(Landroid/view/View;)V"));
        linkedHashMap.put("android/text/style/ClickableSpan", arrayList15);
        java.util.ArrayList arrayList16 = new java.util.ArrayList();
        arrayList16.add(new android.util.Pair("onClick", "(Landroid/view/View;)V"));
        linkedHashMap.put("com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", arrayList16);
        xj0.a.h().l(linkedHashMap, oVar.f304321e);
        java.util.ArrayList arrayList17 = new java.util.ArrayList();
        arrayList17.add(new android.util.Pair("onTouchEvent", "(Landroid/view/MotionEvent;)Z"));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put("com/davemorrissey/labs/subscaleview/view/SubsamplingScaleImageView", arrayList17);
        xj0.a.h().l(linkedHashMap2, oVar.f304323g);
        k52.c cVar3 = (k52.c) ((jz5.n) k52.l.f304312c).getValue();
        cVar3.f304285a = jVar;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList18 = new java.util.ArrayList();
        arrayList18.add(new android.util.Pair("onSingleTapUp", "(Landroid/view/MotionEvent;)Z"));
        arrayList18.add(new android.util.Pair(if1.m.NAME, "(Landroid/view/MotionEvent;)V"));
        linkedHashMap3.put("android/view/GestureDetector$OnGestureListener", arrayList18);
        java.util.ArrayList arrayList19 = new java.util.ArrayList();
        arrayList19.add(new android.util.Pair("onDoubleTap", "(Landroid/view/MotionEvent;)Z"));
        linkedHashMap3.put("android/view/GestureDetector$OnDoubleTapListener", arrayList19);
        java.util.ArrayList arrayList20 = new java.util.ArrayList();
        arrayList20.add(new android.util.Pair("onContextClick", "(Landroid/view/MotionEvent;)Z"));
        linkedHashMap3.put("android/view/GestureDetector$OnContextClickListener", arrayList20);
        java.util.ArrayList arrayList21 = new java.util.ArrayList();
        arrayList21.add(new android.util.Pair("onSingleTapUp", "(Landroid/view/MotionEvent;)Z"));
        arrayList21.add(new android.util.Pair(if1.m.NAME, "(Landroid/view/MotionEvent;)V"));
        arrayList21.add(new android.util.Pair("onDoubleTap", "(Landroid/view/MotionEvent;)Z"));
        arrayList21.add(new android.util.Pair("onContextClick", "(Landroid/view/MotionEvent;)Z"));
        linkedHashMap3.put("android/view/GestureDetector$SimpleOnGestureListener", arrayList21);
        xj0.a.h().l(linkedHashMap3, cVar3.f304288d);
        java.util.ArrayList arrayList22 = new java.util.ArrayList();
        arrayList22.add(new android.util.Pair("onTouchEvent", "(Landroid/view/MotionEvent;)Z"));
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
        linkedHashMap4.put("android/view/GestureDetector", arrayList22);
        xj0.a.h().j(linkedHashMap4, cVar3.f304287c);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.RecyclerCallback", "monitor...");
        xj0.a.h().l(p52.k.f352043a, null);
        r52.d dVar2 = r52.e.f392639a;
        synchronized (dVar2) {
            if (b52.b.m()) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.PageStatisticsDao", "reset");
                c52.c.d("hell_pge_sttics_d_1", new byte[0]);
            }
        }
        dVar2.i();
        i52.b.f288469b = false;
        i52.b.f288470c = false;
        i52.b.f288471d = false;
        java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList23 = new java.util.ArrayList();
        arrayList23.add(new android.util.Pair("doAttach", "(Landroid/content/Context;)V"));
        arrayList23.add(new android.util.Pair("onEnterBegin", "()V"));
        arrayList23.add(new android.util.Pair("onExitBegin", "()V"));
        arrayList23.add(new android.util.Pair("doResume", "()V"));
        arrayList23.add(new android.util.Pair("doPause", "()V"));
        arrayList23.add(new android.util.Pair("onExitEnd", "()V"));
        linkedHashMap5.put("com/tencent/mm/ui/chatting/ChattingUIFragment", arrayList23);
        xj0.a.h().l(linkedHashMap5, i52.b.f288474g);
        java.util.Map map2 = f42.c.f259521a;
        java.util.ArrayList arrayList24 = new java.util.ArrayList();
        arrayList24.add(android.util.Pair.create("killProcess", "(I)V"));
        java.util.Map map3 = f42.c.f259521a;
        java.util.HashMap hashMap3 = (java.util.HashMap) map3;
        hashMap3.put("android/os/Process", arrayList24);
        java.util.ArrayList arrayList25 = new java.util.ArrayList();
        arrayList25.add(android.util.Pair.create("exit", "(I)V"));
        hashMap3.put("java/lang/System", arrayList25);
        xj0.a.h().j(map3, f42.c.f259522b);
        java.lang.Runtime.getRuntime().addShutdownHook(new java.lang.Thread(new f42.c$$a(), "MicroMsg.KillselfMonitor"));
        java.util.HashMap hashMap4 = f42.b.f259519a;
        java.util.ArrayList arrayList26 = new java.util.ArrayList();
        arrayList26.add(new android.util.Pair("onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z"));
        java.util.HashMap hashMap5 = new java.util.HashMap();
        hashMap5.put("android/view/View$OnTouchListener", arrayList26);
        java.util.HashMap hashMap6 = f42.b.f259519a;
        hashMap6.put("com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListTouchListener", hashMap5);
        xj0.a.h().n(hashMap6, f42.b.f259520b);
        java.util.HashMap hashMap7 = f42.l.f259534a;
        java.util.ArrayList arrayList27 = new java.util.ArrayList();
        arrayList27.add(android.util.Pair.create("listen", "(Landroid/telephony/PhoneStateListener;I)V"));
        java.util.HashMap hashMap8 = f42.l.f259534a;
        hashMap8.put("android/telephony/TelephonyManager", arrayList27);
        xj0.a.h().j(hashMap8, f42.l.f259535b);
        java.util.HashMap hashMap9 = f42.j.f259530b;
        java.util.ArrayList arrayList28 = new java.util.ArrayList();
        arrayList28.add(android.util.Pair.create("getConnectionInfo", "()Landroid/net/wifi/WifiInfo;"));
        arrayList28.add(android.util.Pair.create("getScanResults", "()Ljava/util/List;"));
        arrayList28.add(android.util.Pair.create("startScan", "()Z"));
        hashMap9.put("android/net/wifi/WifiManager", arrayList28);
        xj0.a.h().k(hashMap9, new f42.f());
        java.util.HashMap hashMap10 = f42.j.f259531c;
        java.util.ArrayList arrayList29 = new java.util.ArrayList();
        arrayList29.add(android.util.Pair.create("getAllCellInfo", "()Ljava/util/List;"));
        arrayList29.add(android.util.Pair.create("getCellLocation", "()Landroid/telephony/CellLocation;"));
        arrayList29.add(android.util.Pair.create("getSubscriberId", "()Ljava/lang/String;"));
        arrayList29.add(android.util.Pair.create("getLine1Number", "()Ljava/lang/String;"));
        arrayList29.add(android.util.Pair.create("getDeviceId", "()Ljava/lang/String;"));
        arrayList29.add(android.util.Pair.create("getImei", "()Ljava/lang/String;"));
        arrayList29.add(android.util.Pair.create("getImei", "(I)Ljava/lang/String;"));
        arrayList29.add(android.util.Pair.create("getMeid", "()Ljava/lang/String;"));
        arrayList29.add(android.util.Pair.create("getMeid", "(I)Ljava/lang/String;"));
        arrayList29.add(android.util.Pair.create("getCallState", "()I"));
        arrayList29.add(android.util.Pair.create(be1.z.NAME, "()I"));
        arrayList29.add(android.util.Pair.create("listen", "(Landroid/telephony/PhoneStateListener;I)V"));
        hashMap10.put("android/telephony/TelephonyManager", arrayList29);
        xj0.a.h().k(hashMap10, new f42.g());
        java.util.HashMap hashMap11 = f42.j.f259532d;
        java.util.ArrayList arrayList30 = new java.util.ArrayList();
        arrayList30.add(android.util.Pair.create("startDiscovery", "()Z"));
        arrayList30.add(android.util.Pair.create("cancelDiscovery", "()Z"));
        arrayList30.add(android.util.Pair.create("isDiscovering", "()Z"));
        arrayList30.add(android.util.Pair.create("startLeScan", "([Ljava/util/UUID;Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z"));
        arrayList30.add(android.util.Pair.create("startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z"));
        arrayList30.add(android.util.Pair.create("stopLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V"));
        arrayList30.add(android.util.Pair.create("getBondedDevices", "()Ljava/util/Set;"));
        hashMap11.put("android/bluetooth/BluetoothAdapter", arrayList30);
        java.util.ArrayList arrayList31 = new java.util.ArrayList();
        arrayList31.add(android.util.Pair.create("startScan", "(Landroid/bluetooth/le/ScanCallback;)V"));
        arrayList31.add(android.util.Pair.create("startScan", "(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V"));
        arrayList31.add(android.util.Pair.create("startScan", "(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/app/PendingIntent;)I"));
        arrayList31.add(android.util.Pair.create("stopScan", "(Landroid/bluetooth/le/ScanCallback;)V"));
        arrayList31.add(android.util.Pair.create("stopScan", "(Landroid/app/PendingIntent;)V"));
        hashMap11.put("android/bluetooth/le/BluetoothLeScanner", arrayList31);
        java.util.ArrayList arrayList32 = new java.util.ArrayList();
        arrayList32.add(android.util.Pair.create("getName", "()Ljava/lang/String;"));
        arrayList32.add(android.util.Pair.create("getBondState", "()I"));
        arrayList32.add(android.util.Pair.create("connectGatt", "(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;)Landroid/bluetooth/BluetoothGatt;"));
        arrayList32.add(android.util.Pair.create("createRfcommSocketToServiceRecord", "(Ljava/util/UUID;)Landroid/bluetooth/BluetoothSocket;"));
        arrayList32.add(android.util.Pair.create("createInsecureRfcommSocketToServiceRecord", "(Ljava/util/UUID;)Landroid/bluetooth/BluetoothSocket;"));
        hashMap11.put("android/bluetooth/BluetoothDevice", arrayList32);
        xj0.a.h().k(hashMap11, new f42.h());
        java.util.HashMap hashMap12 = f42.j.f259533e;
        java.util.ArrayList arrayList33 = new java.util.ArrayList();
        arrayList33.add(android.util.Pair.create("getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;"));
        hashMap12.put("android/provider/Settings$Secure", arrayList33);
        xj0.a.h().k(hashMap12, new f42.e());
        i62.i iVar = i62.i.f288948a;
        com.tencent.mars.xlog.Log.i("AssetMonitor", "monitor() called");
        java.util.ArrayList arrayList34 = new java.util.ArrayList();
        arrayList34.add(android.util.Pair.create("open", "(Ljava/lang/String;)Ljava/io/InputStream;"));
        java.util.Map e17 = kz5.b1.e(new jz5.l("android/content/res/AssetManager", arrayList34));
        java.util.ArrayList arrayList35 = new java.util.ArrayList();
        arrayList35.add(android.util.Pair.create("getDrawableForDensity", "(IILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;"));
        arrayList35.add(android.util.Pair.create("getXml", "(I)Landroid/content/res/XmlResourceParser;"));
        arrayList35.add(android.util.Pair.create("openRawResource", "(I)Ljava/io/InputStream;"));
        jz5.l lVar = new jz5.l("com/tencent/mm/resources/MMResources", arrayList35);
        java.util.ArrayList arrayList36 = new java.util.ArrayList();
        arrayList36.add(android.util.Pair.create("inflate", "(ILandroid/view/ViewGroup;Z)Landroid/view/View;"));
        java.util.Map k17 = kz5.c1.k(lVar, new jz5.l("com/tencent/mm/ui/MMLayoutInflater$MMLayoutInflaterWrapper", arrayList36));
        java.util.ArrayList arrayList37 = new java.util.ArrayList();
        arrayList37.add(android.util.Pair.create("onCreate", "(Landroid/os/Bundle;)V"));
        arrayList37.add(android.util.Pair.create("onDestroy", "()V"));
        jz5.l lVar2 = new jz5.l("com/tencent/mm/ui/MMFragmentActivity", arrayList37);
        java.util.ArrayList arrayList38 = new java.util.ArrayList();
        arrayList38.add(android.util.Pair.create("onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V"));
        arrayList38.add(android.util.Pair.create("onActivityPostDestroyed", "(Landroid/app/Activity;)V"));
        java.util.Map k18 = kz5.c1.k(lVar2, new jz5.l("com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", arrayList38));
        xj0.a.h().j(e17, i62.i.f288949b);
        xj0.a.h().l(k17, i62.i.f288950c);
        xj0.a.h().l(k18, i62.i.f288951d);
    }

    public void b(e42.j0 j0Var) {
        if (j0Var == null) {
            return;
        }
        f1587d = j0Var;
        ((java.util.concurrent.CopyOnWriteArrayList) s52.b.d().f403162c).add(j0Var);
        b52.a a17 = b52.a.a();
        ((java.util.concurrent.CopyOnWriteArrayList) ((g52.b) a17.f18077a).f268890a).add(j0Var);
        i52.k kVar = (i52.k) a17.f18078b;
        ((java.util.concurrent.CopyOnWriteArrayList) kVar.f288491c).add(j0Var);
        i52.d dVar = kVar.f288489a.f288488a.f288482c;
        if (dVar != null) {
            ((java.util.concurrent.CopyOnWriteArrayList) dVar.f288477b).add(j0Var);
            java.util.ArrayList arrayList = (java.util.ArrayList) i52.b.f288473f;
            if (!arrayList.contains(j0Var)) {
                arrayList.add(j0Var);
            }
        }
        java.util.Map map = k52.l.f304310a;
        ((java.util.ArrayList) ((k52.o) ((jz5.n) k52.l.f304311b).getValue()).f304318b).add(j0Var);
    }
}
