package kn4;

/* loaded from: classes12.dex */
public class a0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {
    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p2313x6760d4bd.C18772x22e12a88.f256877a;
        kn4.b0 b0Var = (kn4.b0) ((java.util.concurrent.ConcurrentHashMap) map).get("Background");
        if (b0Var == null) {
            b0Var = new kn4.b0();
            ((java.util.concurrent.ConcurrentHashMap) map).put("Background", b0Var);
        }
        b0Var.f391205a = "Background";
        b0Var.f391206b = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrafficClickFlow", "Scene change, background[enter]");
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p2313x6760d4bd.C18772x22e12a88.f256877a;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey("Background")) {
            kn4.b0 b0Var = (kn4.b0) ((java.util.concurrent.ConcurrentHashMap) map).remove("Background");
            b0Var.f391207c = java.lang.System.currentTimeMillis();
            java.util.Deque deque = com.p314xaae8f345.mm.p1006xc5476f33.p2313x6760d4bd.C18772x22e12a88.f256878b;
            synchronized (deque) {
                ((java.util.ArrayDeque) deque).addLast(b0Var);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrafficClickFlow", "Scene change, background[exit]");
    }
}
