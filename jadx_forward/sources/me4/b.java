package me4;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f407471a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.HandlerThread f407472b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Handler f407473c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f407474d;

    public b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f407471a = arrayList;
        me4.a aVar = new me4.a(this);
        this.f407474d = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initTask", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        arrayList.add(aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initTask", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initWorkThread", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
        try {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("waidproviderInitTask");
            this.f407472b = handlerThread;
            handlerThread.start();
            this.f407473c = new android.os.Handler(this.f407472b.getLooper());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("InitTaskMgr", "initWorkThread exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initWorkThread", "com.tencent.mm.plugin.sns.waid.InitTaskMgr");
    }
}
