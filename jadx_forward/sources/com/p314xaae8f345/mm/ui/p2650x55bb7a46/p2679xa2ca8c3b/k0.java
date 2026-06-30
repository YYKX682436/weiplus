package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class k0 implements r01.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f285823d;

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f285824e;

    public k0(yb5.d dVar, java.lang.String str) {
        this.f285823d = str;
        this.f285824e = dVar;
    }

    @Override // r01.d0
    public void a(java.util.LinkedList linkedList) {
        r01.e0 fj6 = r01.q3.fj();
        synchronized (fj6.f449583d) {
            if (fj6.f449587h.contains(this)) {
                fj6.f449587h.remove(this);
            }
        }
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(linkedList.size());
        java.lang.String str = this.f285823d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItem", "onKFSceneEnd, workers size : %d. callbackid=%s", valueOf, str);
        if (this.f285824e != null) {
            boolean z17 = false;
            if (linkedList.size() != 0) {
                int i17 = 0;
                while (true) {
                    if (i17 >= linkedList.size()) {
                        break;
                    }
                    r45.ob7 ob7Var = (r45.ob7) linkedList.get(i17);
                    if (ob7Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ob7Var.f463670d) && ob7Var.f463670d.equals(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItem", "needCallback find match kfopenid");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ob7Var.f463672f)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItem", "needCallback: true");
                            z17 = true;
                            break;
                        }
                    }
                    i17++;
                }
            }
            if (z17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j0(this));
            }
        }
    }

    @Override // r01.d0
    public java.lang.String b() {
        return this.f285823d;
    }
}
