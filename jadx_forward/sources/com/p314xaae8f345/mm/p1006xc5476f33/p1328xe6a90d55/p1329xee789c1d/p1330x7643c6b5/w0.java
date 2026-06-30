package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b80 f177654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f177655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.x0 f177656f;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.x0 x0Var, r45.b80 b80Var, int i17) {
        this.f177656f = x0Var;
        this.f177654d = b80Var;
        this.f177655e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.a0 a0Var = this.f177656f.f177660a.f177550f;
        r45.b80 b80Var = this.f177654d;
        java.util.ArrayList arrayList = a0Var.f177350a;
        arrayList.clear();
        if (b80Var != null && (linkedList2 = b80Var.f452157f) != null && linkedList2.size() != 0) {
            linkedList2.size();
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                r45.a80 a80Var = (r45.a80) it.next();
                fw1.d dVar = new fw1.d();
                dVar.f348602a = a80Var.f451344d;
                dVar.f348603b = a80Var.f451345e;
                dVar.f348604c = a80Var.f451347g;
                arrayList.add(dVar);
                dVar.m130512x9616526c();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.y2 y2Var = this.f177656f.f177660a.f177552h;
        r45.b80 b80Var2 = this.f177654d;
        y2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "updateMemberId");
        if (b80Var2 != null && (linkedList = b80Var2.f452157f) != null && linkedList.size() != 0) {
            java.util.LinkedList linkedList3 = b80Var2.f452157f;
            synchronized (y2Var.f177674b) {
                java.util.Iterator it6 = linkedList3.iterator();
                while (it6.hasNext()) {
                    r45.a80 a80Var2 = (r45.a80) it6.next();
                    java.util.Iterator it7 = ((java.util.HashMap) y2Var.f177674b).entrySet().iterator();
                    while (it7.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d dVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d) ((java.util.Map.Entry) it7.next()).getValue();
                        if (dVar2 != null && dVar2.mo54519x28dae7fb().equals(a80Var2.f451345e)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "updateMemberId viewId: " + dVar2.mo54526x346a5196() + " openId: " + dVar2.mo54519x28dae7fb() + " mid: [" + dVar2.mo54518x552492cb() + "->" + a80Var2.f451344d);
                            dVar2.f(a80Var2.f451344d);
                        }
                    }
                }
            }
        }
        java.util.Iterator it8 = this.f177656f.f177660a.T1.entrySet().iterator();
        while (true) {
            boolean z17 = false;
            if (!it8.hasNext()) {
                break;
            }
            int intValue = ((java.lang.Integer) ((java.util.Map.Entry) it8.next()).getKey()).intValue();
            java.util.ArrayList arrayList2 = this.f177656f.f177660a.f177550f.f177350a;
            if (arrayList2 != null) {
                java.util.Iterator it9 = arrayList2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    fw1.d dVar3 = (fw1.d) it9.next();
                    if (dVar3 != null && intValue == dVar3.f348602a) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (!z17) {
                this.f177656f.f177660a.w(java.lang.Integer.valueOf(intValue), 1, "memberExit");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = this.f177656f.f177660a;
        if (p0Var.f177557o != com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r2.InRoom) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room. do not notify");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b bVar = p0Var.C;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: mCurrentMemeberChangeCallback is null");
        } else if (this.f177655e == 0) {
            bVar.a(0, 0, "ok", p0Var.f177550f.f177350a);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: invalid member list change. will ignore");
            this.f177656f.f177660a.C.a(-10087, this.f177655e, "error in member change", null);
        }
    }
}
