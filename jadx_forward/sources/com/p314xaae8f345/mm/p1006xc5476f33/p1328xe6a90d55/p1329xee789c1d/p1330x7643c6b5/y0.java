package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.p70 f177665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f177666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.z0 f177667f;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.z0 z0Var, r45.p70 p70Var, int i17) {
        this.f177667f = z0Var;
        this.f177665d = p70Var;
        this.f177666e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.z0 z0Var = this.f177667f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.a0 a0Var = z0Var.f177680a.f177550f;
        java.util.ArrayList arrayList = a0Var.f177351b;
        arrayList.clear();
        r45.p70 p70Var = this.f177665d;
        if (p70Var != null && (linkedList = p70Var.f464345f) != null && linkedList.size() != 0) {
            linkedList.size();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.o70 o70Var = (r45.o70) it.next();
                java.lang.String b17 = a0Var.b(o70Var.f463533d);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                    fw1.d dVar = new fw1.d();
                    dVar.f348603b = b17;
                    dVar.f348602a = o70Var.f463533d;
                    dVar.f348604c = o70Var.f463534e;
                    arrayList.add(dVar);
                    dVar.m130512x9616526c();
                }
            }
        }
        int i17 = this.f177666e;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "avmembers changed error: " + i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = z0Var.f177680a;
        if (p0Var.f177557o != com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r2.InRoom) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room. do not notify");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b bVar = p0Var.E;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: mCurrentVideoMemberChangeCallback is null");
        } else {
            bVar.a(0, 0, "ok", p0Var.f177550f.a());
        }
    }
}
