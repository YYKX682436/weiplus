package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/AllFragment;", "Lcom/tencent/mm/plugin/finder/ui/SettingFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.AllFragment */
/* loaded from: classes.dex */
public final class C15005xb6936f1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0 {
    public C15005xb6936f1() {
        super("    所有    ", 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractC15091x20e3bca0
    public java.util.ArrayList z0() {
        java.util.ArrayList<lb2.j> arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List y07 = y0();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = y07.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            lb2.j jVar = (lb2.j) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(jVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.config.base.FinderFakeConfig<*>");
            if (jVar.f399278p.length() > 0) {
                if (!hashMap.containsKey(jVar.f399278p)) {
                    hashMap.put(jVar.f399278p, new java.util.LinkedList());
                }
                java.util.LinkedList linkedList2 = (java.util.LinkedList) hashMap.get(jVar.f399278p);
                if (linkedList2 != null) {
                    linkedList2.add(jVar);
                }
            } else {
                linkedList.add(jVar);
            }
        }
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.LinkedList linkedList4 = (java.util.LinkedList) entry.getValue();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "常用")) {
                linkedList3.add(new lb2.a(str));
                linkedList3.addAll(linkedList4);
            } else {
                arrayList.add(new lb2.a(str));
                arrayList.addAll(linkedList4);
            }
        }
        arrayList.addAll(0, linkedList3);
        java.util.List a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ci.f210527a.a();
        if (!a17.isEmpty()) {
            int d17 = kz5.b1.d(kz5.d0.q(y07, 10));
            if (d17 < 16) {
                d17 = 16;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
            for (java.lang.Object obj : y07) {
                lb2.j jVar2 = (lb2.j) obj;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(jVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.config.base.FinderFakeConfig<*>");
                linkedHashMap.put(jVar2.f399282d, obj);
            }
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            java.util.Iterator it6 = a17.iterator();
            while (it6.hasNext()) {
                java.lang.Object obj2 = linkedHashMap.get((java.lang.String) it6.next());
                lb2.j jVar3 = obj2 instanceof lb2.j ? (lb2.j) obj2 : null;
                if (jVar3 != null) {
                    linkedList5.add(jVar3);
                }
            }
            if (!linkedList5.isEmpty()) {
                arrayList.add(0, new lb2.a("最近使用"));
                arrayList.addAll(1, linkedList5);
            }
        }
        arrayList.add(new lb2.a("其它"));
        arrayList.addAll(linkedList);
        for (lb2.j jVar4 : arrayList) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f m7548xe6e42394 = m7548xe6e42394();
            jVar4.getClass();
            if (m7548xe6e42394 != null) {
                jVar4.f399284f = new java.lang.ref.WeakReference(m7548xe6e42394);
            }
        }
        arrayList.add(0, new lb2.a("共 " + arrayList.size() + " 个配置"));
        return arrayList;
    }
}
