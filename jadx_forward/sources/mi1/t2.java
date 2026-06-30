package mi1;

/* loaded from: classes7.dex */
public abstract class t2 extends mi1.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f408226d = new mi1.m2(this);

    public mi1.w0 n(mi1.e eVar, int i17) {
        mi1.n2 n2Var = new mi1.n2(this, eVar, i17);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        o(n2Var);
        mi1.e eVar2 = mi1.e.HIGH;
        java.util.LinkedList linkedList2 = this.f408226d;
        if (eVar == eVar2) {
            linkedList2.addFirst(n2Var);
        } else if (eVar == mi1.e.LOW) {
            o(n2Var);
            while (linkedList2.peekFirst() != null && ((mi1.n2) linkedList2.peekFirst()).f408169f == eVar2) {
                linkedList.addFirst((mi1.n2) linkedList2.pollFirst());
            }
            linkedList2.addFirst(n2Var);
            while (linkedList.peekFirst() != null) {
                linkedList2.addFirst((mi1.n2) linkedList.pollFirst());
            }
        } else {
            linkedList2.addLast(n2Var);
        }
        return n2Var;
    }

    public final void o(mi1.n2 n2Var) {
        java.util.Map map;
        long j17;
        mi1.e eVar = n2Var.f408169f;
        mi1.e eVar2 = mi1.e.TAIL;
        if (eVar == eVar2) {
            return;
        }
        java.util.LinkedList linkedList = this.f408226d;
        mi1.n2 n2Var2 = (mi1.n2) linkedList.peekFirst();
        if (n2Var2 == null || n2Var2.f408169f != eVar2 || n2Var.f408172i == n2Var2.f408172i) {
            return;
        }
        java.lang.Runnable runnable = n2Var2.f408174n;
        if (runnable != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
            n2Var2.f408174n = null;
        }
        linkedList.removeFirst();
        if (n2Var2.f408173m == 1 && (map = n2Var2.f408171h) != null && map.containsKey("key_show_duration_after_intercepted")) {
            try {
                j17 = ((java.lang.Long) n2Var2.f408171h.get("key_show_duration_after_intercepted")).longValue();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StackedBlinkingCapsuleBarPart", "checkInterceptTheTailPrior get duration exp:%s", e17);
                j17 = 0;
            }
            if (j17 > 0) {
                n2Var2.f408171h.put("key_show_duration", java.lang.Long.valueOf(j17));
                linkedList.addLast(n2Var2);
                linkedList.size();
            }
        }
    }
}
