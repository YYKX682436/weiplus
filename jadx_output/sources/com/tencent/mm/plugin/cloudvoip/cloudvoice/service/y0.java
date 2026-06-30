package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.p70 f96132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f96133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.z0 f96134f;

    public y0(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.z0 z0Var, r45.p70 p70Var, int i17) {
        this.f96134f = z0Var;
        this.f96132d = p70Var;
        this.f96133e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.z0 z0Var = this.f96134f;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 a0Var = z0Var.f96147a.f96017f;
        java.util.ArrayList arrayList = a0Var.f95818b;
        arrayList.clear();
        r45.p70 p70Var = this.f96132d;
        if (p70Var != null && (linkedList = p70Var.f382812f) != null && linkedList.size() != 0) {
            linkedList.size();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.o70 o70Var = (r45.o70) it.next();
                java.lang.String b17 = a0Var.b(o70Var.f382000d);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                    fw1.d dVar = new fw1.d();
                    dVar.f267070b = b17;
                    dVar.f267069a = o70Var.f382000d;
                    dVar.f267071c = o70Var.f382001e;
                    arrayList.add(dVar);
                    dVar.toString();
                }
            }
        }
        int i17 = this.f96133e;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "avmembers changed error: " + i17);
            return;
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = z0Var.f96147a;
        if (p0Var.f96024o != com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.InRoom) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room. do not notify");
            return;
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar = p0Var.E;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: mCurrentVideoMemberChangeCallback is null");
        } else {
            bVar.a(0, 0, "ok", p0Var.f96017f.a());
        }
    }
}
