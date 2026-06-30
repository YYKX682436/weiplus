package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/SettingFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.SettingFragment */
/* loaded from: classes10.dex */
public abstract class AbstractC15091x20e3bca0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 {

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.reflect.Method f210353u;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f210354t;

    static {
        java.lang.reflect.Method declaredMethod = jz5.g.class.getDeclaredMethod("getValue", new java.lang.Class[0]);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredMethod, "getDeclaredMethod(...)");
        f210353u = declaredMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC15091x20e3bca0(java.lang.String name, int i17) {
        super(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f210797o = name;
        this.f210354t = new java.util.ArrayList();
    }

    public final void A0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d c15099x5c64104d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d) pf5.z.f435481a.b(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15099x5c64104d);
        pf5.e.m158343xd39de650(c15099x5c64104d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.vl(this, c15099x5c64104d, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return kz5.o1.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15099x5c64104d.class);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        A0();
    }

    public final java.util.List y0() {
        boolean z17;
        java.lang.reflect.Field[] fieldArr;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0 aj0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a;
        if (aj0Var.K()) {
            java.lang.reflect.Method[] declaredMethods = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.class.getDeclaredMethods();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredMethods, "getDeclaredMethods(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.reflect.Method method : declaredMethods) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(method.getName(), "getClass")) {
                    arrayList.add(method);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) next;
                java.lang.String name = method2.getName();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
                if (r26.i0.y(name, "get", false) && method2.getParameterTypes().length == 0) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                if (java.lang.reflect.Modifier.isPublic(((java.lang.reflect.Method) next2).getModifiers())) {
                    arrayList3.add(next2);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                java.lang.Object next3 = it7.next();
                java.lang.reflect.Method method3 = (java.lang.reflect.Method) next3;
                if (method3.getReturnType().isPrimitive() || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(method3.getReturnType(), java.lang.String.class) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(method3.getReturnType(), jz5.f0.class)) {
                    arrayList4.add(next3);
                }
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList3.iterator();
            while (it8.hasNext()) {
                java.lang.Object next4 = it8.next();
                if (!arrayList4.contains((java.lang.reflect.Method) next4)) {
                    arrayList5.add(next4);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", "before triggerNewConfigInvoke getAllNewConfigList config size=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.d90.f208168a.b().size() + "，declareMethods size=" + arrayList.size() + ",getMethods size=" + arrayList2.size() + ",publicGetMethods=" + arrayList3.size() + ",primitiveMethods=" + arrayList4.size() + ",filterOutMethods=" + arrayList5.size());
            java.util.Iterator it9 = arrayList4.iterator();
            while (it9.hasNext()) {
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) it9.next();
                java.lang.Object invoke = method4.invoke(aj0Var, new java.lang.Object[0]);
                method4.toString();
                java.util.Objects.toString(invoke);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", "after triggerNewConfigInvoke getAllNewConfigList config size=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.d90.f208168a.b().size());
            z17 = (arrayList4.isEmpty() ^ true) ^ true;
        } else {
            z17 = true;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.K() || z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            java.lang.reflect.Field[] declaredFields = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields, "getDeclaredFields(...)");
            java.lang.reflect.Field[] declaredFields2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields2, "getDeclaredFields(...)");
            java.lang.Object[] z18 = kz5.v.z(declaredFields, declaredFields2);
            ae2.in inVar = ae2.in.f85221a;
            java.lang.reflect.Field[] declaredFields3 = ae2.in.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields3, "getDeclaredFields(...)");
            java.lang.Object[] z19 = kz5.v.z(z18, declaredFields3);
            yo2.e eVar = yo2.e.f545670a;
            java.lang.reflect.Field[] declaredFields4 = yo2.e.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields4, "getDeclaredFields(...)");
            java.lang.Object[] z27 = kz5.v.z(z19, declaredFields4);
            lb2.j jVar = kb2.c.f387759a;
            java.lang.reflect.Field[] declaredFields5 = kb2.c.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields5, "getDeclaredFields(...)");
            java.lang.Object[] z28 = kz5.v.z(z27, declaredFields5);
            int i17 = kb2.a.f387757a;
            java.lang.reflect.Field[] declaredFields6 = kb2.a.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields6, "getDeclaredFields(...)");
            java.lang.Object[] z29 = kz5.v.z(z28, declaredFields6);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
            java.lang.reflect.Field[] declaredFields7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields7, "getDeclaredFields(...)");
            java.lang.Object[] z37 = kz5.v.z(z29, declaredFields7);
            ae2.b2 b2Var = ae2.b2.f84994a;
            java.lang.reflect.Field[] declaredFields8 = ae2.b2.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields8, "getDeclaredFields(...)");
            fieldArr = (java.lang.reflect.Field[]) kz5.v.z(z37, declaredFields8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            java.lang.reflect.Field[] declaredFields9 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields9, "getDeclaredFields(...)");
            ae2.in inVar2 = ae2.in.f85221a;
            java.lang.reflect.Field[] declaredFields10 = ae2.in.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields10, "getDeclaredFields(...)");
            java.lang.Object[] z38 = kz5.v.z(declaredFields9, declaredFields10);
            yo2.e eVar2 = yo2.e.f545670a;
            java.lang.reflect.Field[] declaredFields11 = yo2.e.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields11, "getDeclaredFields(...)");
            java.lang.Object[] z39 = kz5.v.z(z38, declaredFields11);
            lb2.j jVar2 = kb2.c.f387759a;
            java.lang.reflect.Field[] declaredFields12 = kb2.c.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields12, "getDeclaredFields(...)");
            java.lang.Object[] z47 = kz5.v.z(z39, declaredFields12);
            int i18 = kb2.a.f387757a;
            java.lang.reflect.Field[] declaredFields13 = kb2.a.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields13, "getDeclaredFields(...)");
            java.lang.Object[] z48 = kz5.v.z(z47, declaredFields13);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
            java.lang.reflect.Field[] declaredFields14 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields14, "getDeclaredFields(...)");
            java.lang.Object[] z49 = kz5.v.z(z48, declaredFields14);
            ae2.b2 b2Var2 = ae2.b2.f84994a;
            java.lang.reflect.Field[] declaredFields15 = ae2.b2.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields15, "getDeclaredFields(...)");
            fieldArr = (java.lang.reflect.Field[]) kz5.v.z(z49, declaredFields15);
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        for (java.lang.reflect.Field field : fieldArr) {
            if (jz5.g.class.isAssignableFrom(field.getType()) || lb2.j.class.isAssignableFrom(field.getType())) {
                arrayList6.add(field);
            }
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.Iterator it10 = arrayList6.iterator();
        while (it10.hasNext()) {
            java.lang.reflect.Field field2 = (java.lang.reflect.Field) it10.next();
            field2.setAccessible(true);
            java.lang.Object obj = field2.get(null);
            if (obj instanceof jz5.g) {
                obj = f210353u.invoke(obj, new java.lang.Object[0]);
            }
            lb2.j jVar3 = obj instanceof lb2.j ? (lb2.j) obj : null;
            if (jVar3 != null) {
                arrayList7.add(jVar3);
            }
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.util.Iterator it11 = arrayList7.iterator();
        while (it11.hasNext()) {
            java.lang.Object next5 = it11.next();
            if (!((lb2.j) next5).f399279q) {
                arrayList8.add(next5);
            }
        }
        java.util.ArrayList arrayList9 = new java.util.ArrayList(arrayList8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Zf).mo141623x754a37bb()).r()).booleanValue()) {
            arrayList9.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.d90.f208168a.b());
        }
        return arrayList9;
    }

    public abstract java.util.ArrayList z0();
}
