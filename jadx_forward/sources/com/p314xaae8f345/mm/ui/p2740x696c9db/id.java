package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public class id implements com.p314xaae8f345.mm.p944x882e457a.j1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f292032d = new java.util.LinkedList();

    public static void b(final com.p314xaae8f345.mm.ui.p2740x696c9db.hd hdVar, p012xc85e97e9.p093xedfae76a.y yVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncOnSceneEnd", "addListener() called with: listener = [" + hdVar + "], owner = [" + yVar + "]");
        if (yVar == null) {
            return;
        }
        ((java.util.LinkedList) f292032d).add(hdVar);
        yVar.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.ui.tools.SyncOnSceneEnd$1
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y yVar2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncOnSceneEnd", "onDestroy() called with: owner = [" + yVar2 + "]");
                ((java.util.LinkedList) com.p314xaae8f345.mm.ui.p2740x696c9db.id.f292032d).remove(com.p314xaae8f345.mm.ui.p2740x696c9db.hd.this);
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("current is wechat = ");
        sb6.append(c01.e2.a0());
        sb6.append(", listeners = ");
        java.util.List list = f292032d;
        sb6.append(list);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncOnSceneEnd", sb6.toString());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2740x696c9db.hd) it.next()).a();
        }
    }
}
