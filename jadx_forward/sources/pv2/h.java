package pv2;

/* loaded from: classes10.dex */
public abstract class h implements pv2.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f440112a = new java.util.HashMap();

    @Override // pv2.j
    public void a(java.lang.String taskId, pv2.g from, pv2.g to6) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(to6, "to");
        long c17 = c01.id.c();
        java.util.HashMap hashMap = this.f440112a;
        java.lang.Object obj = hashMap.get(taskId);
        if (obj == null) {
            obj = new java.util.HashMap();
            hashMap.put(taskId, obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.lang.Object obj2 = map.get(from);
        if (obj2 == null) {
            obj2 = new pv2.k();
            map.put(from, obj2);
        }
        pv2.k kVar = (pv2.k) obj2;
        kVar.f440114b = c17;
        if (!(to6 instanceof pv2.m)) {
            boolean z17 = to6 instanceof pv2.l;
        }
        long j17 = c17 - kVar.f440113a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((vv2.a) this).f521960b, "stageFinish, stage:" + pv2.i.a(from) + ", enterTime:" + kVar.f440113a + ", exitTime:" + kVar.f440114b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = from instanceof tv2.p ? ((tv2.p) from).f503858h : from instanceof tv2.f ? ((tv2.f) from).f503833h : from instanceof tv2.v ? ((tv2.v) from).f503864h : null;
        if (c14994x9b99c079 != null && (c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8) != null) {
            int i17 = (int) j17;
            c19783xd9a946b7.m76426x5b7df934(c19783xd9a946b7.m76319x2534fe28() + i17);
            if (from instanceof tv2.f) {
                c19783xd9a946b7.m76404x32a590da(c19783xd9a946b7.m76297x8ea8fbce() + i17);
            }
            if (from instanceof tv2.v) {
                c19783xd9a946b7.m76446xde04f70(c19783xd9a946b7.m76339xdfbc0164() + i17);
            }
        }
        java.lang.Object obj3 = hashMap.get(taskId);
        if (obj3 == null) {
            obj3 = new java.util.HashMap();
            hashMap.put(taskId, obj3);
        }
        java.util.Map map2 = (java.util.Map) obj3;
        java.lang.Object obj4 = map2.get(to6);
        if (obj4 == null) {
            obj4 = new pv2.k();
            map2.put(to6, obj4);
        }
        ((pv2.k) obj4).f440113a = c17;
    }

    @Override // pv2.j
    public void b(java.lang.String taskId, pv2.g endStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(endStage, "endStage");
        java.util.HashMap hashMap = this.f440112a;
        java.lang.Object obj = hashMap.get(taskId);
        if (obj == null) {
            obj = new java.util.HashMap();
            hashMap.put(taskId, obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.lang.Object obj2 = map.get(endStage);
        if (obj2 == null) {
            obj2 = new pv2.k();
            map.put(endStage, obj2);
        }
        ((pv2.k) obj2).f440114b = c01.id.c();
    }

    @Override // pv2.j
    public void c(java.lang.String taskId, pv2.g beginStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beginStage, "beginStage");
        java.util.HashMap hashMap = this.f440112a;
        hashMap.remove(taskId);
        java.lang.Object obj = hashMap.get(taskId);
        if (obj == null) {
            obj = new java.util.HashMap();
            hashMap.put(taskId, obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.lang.Object obj2 = map.get(beginStage);
        if (obj2 == null) {
            obj2 = new pv2.k();
            map.put(beginStage, obj2);
        }
        ((pv2.k) obj2).f440113a = c01.id.c();
    }
}
