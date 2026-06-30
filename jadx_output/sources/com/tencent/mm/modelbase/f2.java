package com.tencent.mm.modelbase;

/* loaded from: classes7.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Vector f70621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.r1 f70622e;

    public f2(com.tencent.mm.modelbase.r1 r1Var, java.util.Vector vector) {
        this.f70622e = r1Var;
        this.f70621d = vector;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f70621d.iterator();
        while (it.hasNext()) {
            sb6.append(((com.tencent.mm.modelbase.m1) it.next()).getType());
            sb6.append(";");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQueue", "doSceneImp runningQueue Type:" + sb6.toString());
        this.f70622e.f70781x = true;
    }
}
