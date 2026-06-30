package yk3;

/* loaded from: classes8.dex */
public abstract class b implements pk3.b {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f544335d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f544336e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f544337f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16603xcfb2c8bb f544338g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f544339h;

    /* renamed from: i, reason: collision with root package name */
    public pk3.h f544340i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f544341m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f544342n;

    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f544335d = activity;
        this.f544336e = bundle;
        this.f544337f = "MicroMsg.MultiTask.MultiTaskPanelItem";
        this.f544341m = new java.util.HashSet();
        this.f544342n = new java.util.HashMap();
    }

    public final pk3.h a(int i17, java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        for (pk3.h hVar : this.f544341m) {
            if (hVar.M9(i17)) {
                java.util.HashMap hashMap = this.f544342n;
                if (hashMap.containsKey(id6) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar, hashMap.get(id6))) {
                    return hVar;
                }
            }
        }
        return null;
    }

    public final pk3.h b(int i17, java.lang.String id6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16603xcfb2c8bb c16603xcfb2c8bb;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        for (pk3.h hVar : this.f544341m) {
            if (hVar.M9(i17)) {
                java.util.HashMap hashMap = this.f544342n;
                if (hashMap.containsKey(id6) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar, hashMap.get(id6))) {
                    return hVar;
                }
            }
        }
        java.util.HashMap hashMap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.f231975v;
        java.lang.Class cls = (java.lang.Class) com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.f231975v.get(java.lang.Integer.valueOf(i17));
        if (cls == null) {
            for (fs.q qVar : ((fs.c) fs.g.f(ga0.e.class)).all()) {
                if (qVar.mo210xb7045565(java.lang.Integer.valueOf(i17))) {
                    ga0.e eVar = (ga0.e) qVar.get();
                    cls = eVar != null ? eVar.get(i17) : null;
                }
            }
        }
        if (cls != null) {
            pk3.h d17 = d(id6, cls);
            if ((d17 != null ? d17.i0() : null) == pk3.a.f437969f && (c16603xcfb2c8bb = this.f544338g) != null) {
                android.view.View inflate = this.f544335d.getLayoutInflater().inflate(d17.mo569x2ee31f5b(), (android.view.ViewGroup) null);
                c16603xcfb2c8bb.addView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
                if (inflate != null) {
                    d17.m80384x6ca18d29(inflate);
                    android.view.View m80380x71e92c1d = d17.m80380x71e92c1d();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(m80380x71e92c1d, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel", "getSnapShotUIC", "(ILjava/lang/String;)Lcom/tencent/mm/plugin/multitask/ui/MultiTaskUIComponent;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m80380x71e92c1d.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(m80380x71e92c1d, "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel", "getSnapShotUIC", "(ILjava/lang/String;)Lcom/tencent/mm/plugin/multitask/ui/MultiTaskUIComponent;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                d17.O6(null);
                return d17;
            }
        }
        return null;
    }

    public final pk3.h c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        int i17 = multiTaskInfo.f66793x2262335f;
        this.f544340i = null;
        for (pk3.h hVar : this.f544341m) {
            if (hVar.M9(i17)) {
                java.util.HashMap hashMap = this.f544342n;
                if (hashMap.containsKey(multiTaskInfo.f66791xc8a07680) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar, hashMap.get(multiTaskInfo.f66791xc8a07680))) {
                    if (hVar.i0() == pk3.a.f437967d) {
                        android.view.View m80380x71e92c1d = hVar.m80380x71e92c1d();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(m80380x71e92c1d, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel", "getUIComponent", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)Lcom/tencent/mm/plugin/multitask/ui/MultiTaskUIComponent;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        m80380x71e92c1d.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(m80380x71e92c1d, "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel", "getUIComponent", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)Lcom/tencent/mm/plugin/multitask/ui/MultiTaskUIComponent;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    this.f544340i = hVar;
                    f();
                    return hVar;
                }
            }
        }
        java.util.HashMap hashMap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.f231975v;
        java.lang.Class cls = (java.lang.Class) com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.f231975v.get(java.lang.Integer.valueOf(i17));
        if (cls == null) {
            for (fs.q qVar : ((fs.c) fs.g.f(ga0.e.class)).all()) {
                if (qVar.mo210xb7045565(java.lang.Integer.valueOf(i17))) {
                    ga0.e eVar = (ga0.e) qVar.get();
                    cls = eVar != null ? eVar.get(i17) : null;
                }
            }
        }
        if (cls == null) {
            return null;
        }
        pk3.h d17 = d(multiTaskInfo.f66791xc8a07680, cls);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f544335d;
        if (d17 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).getClass();
        } else {
            d17 = null;
        }
        if ((d17 != null ? d17.i0() : null) == pk3.a.f437967d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16603xcfb2c8bb c16603xcfb2c8bb = this.f544338g;
            if (c16603xcfb2c8bb != null) {
                android.view.View inflate = activity.getLayoutInflater().inflate(d17.mo569x2ee31f5b(), (android.view.ViewGroup) null);
                c16603xcfb2c8bb.addView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
                if (inflate != null) {
                    d17.m80384x6ca18d29(inflate);
                }
                android.os.Bundle bundle = this.f544336e;
                d17.mo2277xb2f1ab1a(bundle);
                d17.O6(multiTaskInfo);
                d17.mo450x3e5a77bb(bundle);
                d17.mo739xfd763ae1(bundle);
                d17.mo2286xb05099c3();
                if ((activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) && !((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).mo78538xecd98af8()) {
                    d17.mo2284x57429eec();
                    d17.T6();
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16603xcfb2c8bb c16603xcfb2c8bb2 = this.f544338g;
            if (c16603xcfb2c8bb2 != null && d17 != null) {
                d17.m80384x6ca18d29(c16603xcfb2c8bb2);
            }
        }
        this.f544340i = d17;
        return d17;
    }

    public final pk3.h d(java.lang.String str, java.lang.Class cls) {
        pk3.h hVar;
        if (pf5.o.class.isAssignableFrom(cls)) {
            try {
                hVar = (pk3.h) cls.getConstructor(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.class).newInstance(this.f544335d);
            } catch (java.lang.IllegalAccessException e17) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e17);
            } catch (java.lang.InstantiationException e18) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e18);
            } catch (java.lang.NoSuchMethodException e19) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e19);
            } catch (java.lang.reflect.InvocationTargetException e27) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e27);
            }
        } else {
            hVar = null;
        }
        if (hVar != null) {
            this.f544341m.add(hVar);
            if (str != null) {
            }
        }
        return hVar;
    }

    public void e() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        pk3.h hVar = this.f544340i;
        objArr[0] = hVar != null ? hVar.m158365x9616526c() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544337f, "onMultiTaskPagePause, uic: %s", objArr);
        pk3.h hVar2 = this.f544340i;
        if (hVar2 != null) {
            hVar2.S6();
        }
    }

    public void f() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        pk3.h hVar = this.f544340i;
        objArr[0] = hVar != null ? hVar.m158365x9616526c() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544337f, "onMultiTaskPageResume, uic: %s", objArr);
        pk3.h hVar2 = this.f544340i;
        if (hVar2 != null) {
            hVar2.T6();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if ((r1 != null ? r1.i0() : null) == pk3.a.f437969f) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "id"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.util.HashMap r0 = r3.f544342n
            boolean r1 = r0.containsKey(r4)
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r0.get(r4)
            pk3.h r1 = (pk3.h) r1
            java.util.HashSet r2 = r3.f544341m
            java.util.Collection r2 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(r2)
            r2.remove(r1)
            r0.remove(r4)
            r4 = 0
            if (r1 == 0) goto L27
            pk3.a r0 = r1.i0()
            goto L28
        L27:
            r0 = r4
        L28:
            pk3.a r2 = pk3.a.f437967d
            if (r0 == r2) goto L36
            if (r1 == 0) goto L32
            pk3.a r4 = r1.i0()
        L32:
            pk3.a r0 = pk3.a.f437969f
            if (r4 != r0) goto L56
        L36:
            android.view.View r4 = r1.m80380x71e92c1d()
            android.view.ViewParent r4 = r4.getParent()
            if (r4 == 0) goto L56
            android.view.View r4 = r1.m80380x71e92c1d()
            android.view.ViewParent r4 = r4.getParent()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r4, r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r0 = r1.m80380x71e92c1d()
            r4.removeView(r0)
        L56:
            if (r1 == 0) goto L5b
            r1.R6()
        L5b:
            r4 = 1
            return r4
        L5d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yk3.b.g(java.lang.String):boolean");
    }

    @Override // pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
    }

    @Override // pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        return false;
    }

    @Override // pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
    }

    @Override // pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        pk3.h a17 = a(0, "MultiTaskForMinusScreen");
        if (a17 != null) {
            ((zk3.g0) a17).mo2276x50e1c15d(newConfig);
        }
    }

    @Override // pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    /* renamed from: onKeyDown */
    public boolean mo2278x1f03f0c2(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // pf5.g
    /* renamed from: onKeyUp */
    public boolean mo2279xafd962bb(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544337f, "onPause");
    }

    @Override // pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
    }

    @Override // pf5.g
    /* renamed from: onRestoreInstanceState */
    public void mo2283xb949e58d(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544337f, "onResume");
    }

    @Override // pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544337f, "onStart");
    }

    @Override // pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544337f, "onStop");
    }
}
