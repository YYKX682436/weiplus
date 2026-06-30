package eg5;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f334374a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f334375b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f334376c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f334377d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f334378e;

    public d(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f334374a = str;
        this.f334375b = f9Var;
        this.f334376c = g95.u.f(str);
        if (f9Var != null && f9Var.m124847x74d37ac6() > 0 && !b(f9Var.m124847x74d37ac6())) {
            java.util.Iterator it = this.f334376c.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else {
                    if (((g15.a) it.next()).l() < f9Var.m124847x74d37ac6()) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (i17 >= this.f334376c.size() || i17 < 0) {
                java.util.ArrayList arrayList = this.f334376c;
                g15.a aVar = new g15.a();
                aVar.q(f9Var.m124847x74d37ac6());
                aVar.p(0);
                arrayList.add(aVar);
            } else {
                java.util.ArrayList arrayList2 = this.f334376c;
                g15.a aVar2 = new g15.a();
                aVar2.q(f9Var.m124847x74d37ac6());
                aVar2.p(0);
                arrayList2.add(i17, aVar2);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryMsgTongueComponent.ConvRedHintController", "init: ".concat(kz5.n0.g0(this.f334376c, ", ", null, null, 0, null, eg5.a.f334370d, 30, null)));
        this.f334378e = new java.util.LinkedHashMap();
    }

    public final boolean a(long j17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f334377d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((g15.a) obj).l() == j17) {
                break;
            }
        }
        return obj != null;
    }

    public final boolean b(long j17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f334376c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((g15.a) obj).l() == j17) {
                break;
            }
        }
        return obj != null;
    }

    public final java.util.Map c(g15.a redHint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redHint, "redHint");
        if (!this.f334376c.contains(redHint)) {
            return new java.util.LinkedHashMap();
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f334378e;
        java.lang.Object obj = linkedHashMap.get(redHint);
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            linkedHashMap.put(redHint, obj);
        }
        return (java.util.Map) obj;
    }

    public final boolean d(g15.a hint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hint, "hint");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryMsgTongueComponent.ConvRedHintController", "insertHint: " + hint.m126747x696739c());
        if (b(hint.l())) {
            return false;
        }
        this.f334376c.add(hint);
        this.f334376c = g95.u.o(this.f334376c);
        return true;
    }

    public final boolean e(long j17) {
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryMsgTongueComponent.ConvRedHintController", "removeMsgId: " + j17);
        boolean removeIf = this.f334376c.removeIf(new eg5.c(j17, this));
        if (!removeIf) {
            removeIf = ((java.util.ArrayList) this.f334377d).removeIf(new eg5.b(j17));
        }
        if (removeIf) {
            java.lang.String str = this.f334374a;
            if (str != null) {
                g95.u uVar = g95.u.f351354a;
                g15.b wi6 = ((ez.j) uVar.e()).wi(str);
                if (wi6 == null) {
                    wi6 = new g15.b();
                }
                boolean removeIf2 = wi6.j().removeIf(new g95.h(j17));
                if (removeIf2) {
                    uVar.n(str, wi6);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvRedHintStorage", "expose, [" + str + ", " + j17 + "], result: " + removeIf2);
                f0Var = jz5.f0.f384359a;
            } else {
                g95.u uVar2 = g95.u.f351354a;
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConvRedHintStorage", "talker is null");
            }
        }
        return removeIf;
    }
}
