package com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/media/view/gesture/XGestureInterceptorView;", "Landroid/widget/FrameLayout;", "Lmg3/m;", "coordinator", "Ljz5/f0;", "setupCoordinator", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.media.view.gesture.XGestureInterceptorView */
/* loaded from: classes10.dex */
public final class C16502x5827459 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public mg3.b f230129d;

    /* renamed from: e, reason: collision with root package name */
    public mg3.e f230130e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f230131f;

    /* renamed from: g, reason: collision with root package name */
    public mg3.m f230132g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16502x5827459(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a() {
        mg3.m mVar = new mg3.m();
        this.f230132g = mVar;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        mVar.a(new ng3.n(context));
        mg3.m mVar2 = this.f230132g;
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        mVar2.a(new ng3.k(context2));
        mg3.m mVar3 = this.f230132g;
        android.content.Context context3 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        mVar3.a(new ng3.r(context3));
        this.f230132g.a(new ng3.b());
        mg3.m mVar4 = this.f230132g;
        mg3.b bVar = this.f230129d;
        mg3.e eVar = this.f230130e;
        mVar4.f407782c = bVar;
        mVar4.f407783d = eVar;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        mg3.e eVar;
        mg3.e eVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        mg3.p.a(event);
        event.getPointerCount();
        mg3.e eVar3 = this.f230130e;
        if ((eVar3 != null && eVar3.f(event)) && event.getAction() == 0) {
            mg3.p.a(event);
            this.f230131f = true;
        }
        if (this.f230131f && event.getAction() == 1) {
            mg3.p.a(event);
            mg3.e eVar4 = this.f230130e;
            if (eVar4 != null) {
                eVar4.g(event);
            }
            this.f230131f = false;
            return true;
        }
        if (this.f230131f) {
            mg3.p.a(event);
            mg3.e eVar5 = this.f230130e;
            if (eVar5 != null) {
                eVar5.g(event);
            }
            return true;
        }
        mg3.m mVar = this.f230132g;
        mVar.getClass();
        mg3.p.a(event);
        event.getPointerCount();
        mg3.b bVar = mVar.f407782c;
        if (bVar == null || (eVar = mVar.f407783d) == null) {
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = ((java.util.ArrayList) mVar.f407780a).iterator();
        while (it.hasNext()) {
            ng3.e eVar6 = (ng3.e) it.next();
            eVar6.b(event);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(eVar6.f418538b);
            mg3.p.b(arrayList);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ng3.h hVar = (ng3.h) it6.next();
                if (hashMap.containsKey(hVar.a())) {
                    java.util.Objects.toString(hVar.a());
                } else {
                    hashMap.put(hVar.a(), hVar);
                }
            }
        }
        java.util.Objects.toString(mVar.f407781b);
        mg3.p.b(kz5.n0.S0(hashMap.values()));
        mg3.a aVar = new mg3.a(hashMap, bVar, eVar);
        mg3.b bVar2 = mVar.f407782c;
        if (bVar2 != null && (eVar2 = mVar.f407783d) != null) {
            ng3.t tVar = ng3.t.f418581s;
            java.util.Map map = aVar.f407761a;
            if (map.containsKey(tVar)) {
                mg3.n.a(aVar, tVar);
                if (bVar2.mo66618xfd74f284() > 1.0f) {
                    mVar.f407781b = ng3.s.f418561d;
                } else {
                    mVar.f407781b = ng3.s.f418563f;
                }
            }
            ng3.t tVar2 = ng3.t.f418579q;
            if (map.containsKey(tVar2)) {
                mg3.n.a(aVar, tVar2);
            }
            int ordinal = mVar.f407781b.ordinal();
            int i17 = mVar.f407784e;
            switch (ordinal) {
                case 0:
                    if (!eVar2.i()) {
                        ng3.t tVar3 = ng3.t.f418569d;
                        if (!map.containsKey(tVar3)) {
                            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) bVar2).N()) {
                                ng3.t tVar4 = ng3.t.f418582t;
                                if (map.containsKey(tVar4)) {
                                    mg3.n.a(aVar, tVar4);
                                    mVar.f407781b = ng3.s.f418567m;
                                    break;
                                }
                            }
                            ng3.t tVar5 = ng3.t.f418575m;
                            if (!map.containsKey(tVar5)) {
                                eVar2.g(event);
                                break;
                            } else {
                                mg3.n.a(aVar, tVar5);
                                mVar.f407781b = ng3.s.f418562e;
                                break;
                            }
                        } else {
                            mg3.n.a(aVar, tVar3);
                            mVar.f407781b = ng3.s.f418564g;
                            break;
                        }
                    } else {
                        eVar2.g(event);
                        break;
                    }
                case 1:
                    if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) bVar2).N() || !map.containsKey(ng3.t.f418582t)) {
                        ng3.t tVar6 = ng3.t.f418578p;
                        if (!map.containsKey(tVar6)) {
                            ng3.t tVar7 = ng3.t.f418574i;
                            if (map.containsKey(tVar7) || map.containsKey(ng3.t.f418576n)) {
                                mg3.n.a(aVar, tVar7, ng3.t.f418576n);
                                mVar.f407781b = ng3.s.f418562e;
                                break;
                            }
                        } else {
                            mg3.n.a(aVar, tVar6, ng3.t.f418577o);
                            mVar.f407781b = ng3.s.f418561d;
                            break;
                        }
                    } else {
                        mg3.n.a(aVar, ng3.t.f418583u);
                        mVar.f407781b = ng3.s.f418567m;
                        break;
                    }
                    break;
                case 2:
                    boolean N = ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) bVar2).N();
                    ng3.t tVar8 = ng3.t.f418569d;
                    if (!map.containsKey(tVar8)) {
                        if (N) {
                            ng3.t tVar9 = ng3.t.f418582t;
                            if (map.containsKey(tVar9)) {
                                mg3.n.a(aVar, tVar9);
                                mVar.f407781b = ng3.s.f418567m;
                                break;
                            }
                        }
                        ng3.t tVar10 = ng3.t.f418574i;
                        if (map.containsKey(tVar10) || map.containsKey(ng3.t.f418576n)) {
                            mg3.n.a(aVar, tVar10, ng3.t.f418576n);
                            mVar.f407781b = ng3.s.f418566i;
                            break;
                        }
                    } else {
                        mg3.n.a(aVar, tVar8);
                        mVar.f407781b = ng3.s.f418564g;
                        break;
                    }
                    break;
                case 3:
                    mg3.n.a(aVar, ng3.t.f418570e);
                    if (!map.containsKey(ng3.t.f418572g)) {
                        ng3.t tVar11 = ng3.t.f418571f;
                        if (map.containsKey(tVar11)) {
                            mg3.n.a(aVar, tVar11);
                            mVar.f407781b = ng3.s.f418565h;
                            break;
                        }
                    } else {
                        float f17 = 100;
                        if (java.lang.Math.abs(((int) (bVar2.mo66618xfd74f284() * f17)) - ((int) (bVar2.mo66621x560f951d() * f17))) > i17) {
                            mVar.f407781b = ng3.s.f418563f;
                            break;
                        } else {
                            mVar.f407781b = ng3.s.f418561d;
                            break;
                        }
                    }
                    break;
                case 4:
                    float mo66618xfd74f284 = bVar2.mo66618xfd74f284();
                    float mo66621x560f951d = bVar2.mo66621x560f951d();
                    float f18 = 100;
                    int i18 = (int) (mo66618xfd74f284 * f18);
                    int i19 = (int) (f18 * mo66621x560f951d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.XGesture.Coordinator", "[into]SCALE_END curScale:" + mo66618xfd74f284 + '(' + i18 + "%) minScale:" + mo66621x560f951d + '(' + i19 + "%) threshold:" + i17);
                    if (!map.containsKey(ng3.t.f418572g)) {
                        mVar.f407781b = ng3.s.f418564g;
                        break;
                    } else if (java.lang.Math.abs(i18 - i19) > i17) {
                        mVar.f407781b = ng3.s.f418563f;
                        break;
                    } else {
                        mVar.f407781b = ng3.s.f418561d;
                        break;
                    }
                case 5:
                    boolean N2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100) bVar2).N();
                    if (!map.containsKey(ng3.t.f418569d)) {
                        if (!N2 || !map.containsKey(ng3.t.f418582t)) {
                            ng3.t tVar12 = ng3.t.f418578p;
                            if (!map.containsKey(tVar12)) {
                                ng3.t tVar13 = ng3.t.f418574i;
                                if (map.containsKey(tVar13) || map.containsKey(ng3.t.f418576n)) {
                                    mg3.n.a(aVar, tVar13, ng3.t.f418576n);
                                    mVar.f407781b = ng3.s.f418566i;
                                    break;
                                }
                            } else {
                                mg3.n.a(aVar, tVar12, ng3.t.f418577o);
                                mVar.f407781b = ng3.s.f418563f;
                                break;
                            }
                        } else {
                            mg3.n.a(aVar, ng3.t.f418583u);
                            mVar.f407781b = ng3.s.f418567m;
                            break;
                        }
                    } else {
                        mVar.f407781b = ng3.s.f418564g;
                        break;
                    }
                    break;
                case 6:
                    ng3.t tVar14 = ng3.t.f418583u;
                    if (!map.containsKey(tVar14)) {
                        ng3.t tVar15 = ng3.t.f418584v;
                        if (map.containsKey(tVar15)) {
                            mg3.n.a(aVar, tVar15);
                            float f19 = 100;
                            if (java.lang.Math.abs(((int) (bVar2.mo66618xfd74f284() * f19)) - ((int) (bVar2.mo66621x560f951d() * f19))) > i17) {
                                mVar.f407781b = ng3.s.f418563f;
                                break;
                            } else {
                                mVar.f407781b = ng3.s.f418561d;
                                break;
                            }
                        }
                    } else {
                        mg3.n.a(aVar, tVar14);
                        break;
                    }
                    break;
            }
        }
        return true;
    }

    /* renamed from: setupCoordinator */
    public final void m66629x532e2873(mg3.m coordinator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coordinator, "coordinator");
        this.f230132g = coordinator;
        mg3.b bVar = this.f230129d;
        mg3.e eVar = this.f230130e;
        coordinator.f407782c = bVar;
        coordinator.f407783d = eVar;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16502x5827459(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f230132g = new mg3.m();
    }
}
