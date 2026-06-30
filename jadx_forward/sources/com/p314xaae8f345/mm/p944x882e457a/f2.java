package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes7.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Vector f152154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.r1 f152155e;

    public f2(com.p314xaae8f345.mm.p944x882e457a.r1 r1Var, java.util.Vector vector) {
        this.f152155e = r1Var;
        this.f152154d = vector;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f152154d.iterator();
        while (it.hasNext()) {
            sb6.append(((com.p314xaae8f345.mm.p944x882e457a.m1) it.next()).mo808xfb85f7b0());
            sb6.append(";");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneQueue", "doSceneImp runningQueue Type:" + sb6.toString());
        this.f152155e.f152314x = true;
    }
}
