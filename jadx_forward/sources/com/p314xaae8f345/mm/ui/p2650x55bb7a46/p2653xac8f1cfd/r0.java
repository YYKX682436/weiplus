package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public final class r0 implements a75.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s0 f281341a;

    public r0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s0 s0Var) {
        this.f281341a = s0Var;
    }

    @Override // a75.b
    /* renamed from: handleEvent */
    public void mo788x5797ad52(java.util.List eventList) {
        java.lang.Integer num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventList, "eventList");
        java.util.Iterator it = eventList.iterator();
        while (it.hasNext()) {
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q0) it.next()).f281265a).entrySet()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) entry.getKey();
                android.view.View view = (android.view.View) entry.getValue();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s0 s0Var = this.f281341a;
                s0Var.getClass();
                int height = view.getHeight();
                if (height != 0) {
                    if (f9Var.mo78013xfb85f7b0() == 1) {
                        s0Var.f281428h.put(java.lang.Integer.valueOf((f9Var.j().length() / 10) * 10), java.lang.Integer.valueOf(height));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatItemHeightRecordComponent", "realRecordMsgHeight[" + f9Var.m124847x74d37ac6() + "][" + f9Var.j().length() + "]:" + height);
                    } else {
                        java.util.Map map = s0Var.f281427g;
                        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
                        if (!linkedHashMap.keySet().contains(java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0())) || ((num = (java.lang.Integer) linkedHashMap.get(java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()))) != null && num.intValue() == 0)) {
                            map.put(java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()), java.lang.Integer.valueOf(height));
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_ItemHeightRecord").putInt(java.lang.String.valueOf(f9Var.mo78013xfb85f7b0()), height);
                        }
                    }
                }
            }
        }
    }
}
