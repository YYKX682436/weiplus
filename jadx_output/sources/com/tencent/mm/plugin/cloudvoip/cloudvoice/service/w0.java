package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b80 f96121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f96122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.x0 f96123f;

    public w0(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.x0 x0Var, r45.b80 b80Var, int i17) {
        this.f96123f = x0Var;
        this.f96121d = b80Var;
        this.f96122e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 a0Var = this.f96123f.f96127a.f96017f;
        r45.b80 b80Var = this.f96121d;
        java.util.ArrayList arrayList = a0Var.f95817a;
        arrayList.clear();
        if (b80Var != null && (linkedList2 = b80Var.f370624f) != null && linkedList2.size() != 0) {
            linkedList2.size();
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                r45.a80 a80Var = (r45.a80) it.next();
                fw1.d dVar = new fw1.d();
                dVar.f267069a = a80Var.f369811d;
                dVar.f267070b = a80Var.f369812e;
                dVar.f267071c = a80Var.f369814g;
                arrayList.add(dVar);
                dVar.toString();
            }
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y2 y2Var = this.f96123f.f96127a.f96019h;
        r45.b80 b80Var2 = this.f96121d;
        y2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "updateMemberId");
        if (b80Var2 != null && (linkedList = b80Var2.f370624f) != null && linkedList.size() != 0) {
            java.util.LinkedList linkedList3 = b80Var2.f370624f;
            synchronized (y2Var.f96141b) {
                java.util.Iterator it6 = linkedList3.iterator();
                while (it6.hasNext()) {
                    r45.a80 a80Var2 = (r45.a80) it6.next();
                    java.util.Iterator it7 = ((java.util.HashMap) y2Var.f96141b).entrySet().iterator();
                    while (it7.hasNext()) {
                        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d dVar2 = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d) ((java.util.Map.Entry) it7.next()).getValue();
                        if (dVar2 != null && dVar2.getOpenId().equals(a80Var2.f369812e)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "updateMemberId viewId: " + dVar2.getViewId() + " openId: " + dVar2.getOpenId() + " mid: [" + dVar2.getMemberId() + "->" + a80Var2.f369811d);
                            dVar2.f(a80Var2.f369811d);
                        }
                    }
                }
            }
        }
        java.util.Iterator it8 = this.f96123f.f96127a.T1.entrySet().iterator();
        while (true) {
            boolean z17 = false;
            if (!it8.hasNext()) {
                break;
            }
            int intValue = ((java.lang.Integer) ((java.util.Map.Entry) it8.next()).getKey()).intValue();
            java.util.ArrayList arrayList2 = this.f96123f.f96127a.f96017f.f95817a;
            if (arrayList2 != null) {
                java.util.Iterator it9 = arrayList2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    fw1.d dVar3 = (fw1.d) it9.next();
                    if (dVar3 != null && intValue == dVar3.f267069a) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (!z17) {
                this.f96123f.f96127a.w(java.lang.Integer.valueOf(intValue), 1, "memberExit");
            }
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = this.f96123f.f96127a;
        if (p0Var.f96024o != com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r2.InRoom) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room. do not notify");
            return;
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar = p0Var.C;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: mCurrentMemeberChangeCallback is null");
        } else if (this.f96122e == 0) {
            bVar.a(0, 0, "ok", p0Var.f96017f.f95817a);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: invalid member list change. will ignore");
            this.f96123f.f96127a.C.a(-10087, this.f96122e, "error in member change", null);
        }
    }
}
