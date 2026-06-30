package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class a implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public int f230502d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f230503e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f230504f;

    /* renamed from: g, reason: collision with root package name */
    public int f230505g;

    /* renamed from: h, reason: collision with root package name */
    public float f230506h;

    /* renamed from: i, reason: collision with root package name */
    public float f230507i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450 f230508m;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450 c16531xba313450) {
        this.f230508m = c16531xba313450;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.lang.String str;
        int i17;
        int m66830x961e58d7;
        long m66829xcc839460;
        long m66830x961e58d72;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.a aVar = this;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450 c16531xba313450 = aVar.f230508m;
        int i18 = 0;
        if (!c16531xba313450.f230370e) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z18 = true;
        if (actionMasked != 0) {
            java.lang.String str2 = "recyclerView";
            if (actionMasked != 1) {
                int i19 = 2;
                if (actionMasked == 2) {
                    if (!c16531xba313450.e(true) && !c16531xba313450.e(false)) {
                        yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return false;
                    }
                    c16531xba313450.getClass();
                    aVar.f230505g = 0;
                    boolean z19 = false;
                    while (aVar.f230505g < motionEvent.getPointerCount()) {
                        int pointerId = motionEvent.getPointerId(aVar.f230505g);
                        aVar.f230504f = pointerId;
                        int i27 = aVar.f230502d;
                        if (pointerId == i27 || pointerId == aVar.f230503e) {
                            boolean f17 = c16531xba313450.f(pointerId == i27 ? z18 : i18, motionEvent.getX(aVar.f230505g));
                            if (c16531xba313450.f230374i && f17 && !c16531xba313450.f230373h) {
                                c16531xba313450.performHapticFeedback(i18, i19);
                            }
                            c16531xba313450.f230373h = f17;
                            if (c16531xba313450.f230369d != null) {
                                int[] iArr = new int[i19];
                                c16531xba313450.getLocationOnScreen(iArr);
                                boolean z27 = aVar.f230504f == aVar.f230502d ? z18 : i18;
                                if (z27) {
                                    i17 = iArr[i18];
                                    m66830x961e58d7 = c16531xba313450.m66829xcc839460();
                                } else {
                                    i17 = iArr[i18];
                                    m66830x961e58d7 = c16531xba313450.m66830x961e58d7();
                                }
                                float f18 = i17 + m66830x961e58d7;
                                float f19 = f18 + c16531xba313450.f230387y;
                                kp4.e eVar = (kp4.e) c16531xba313450.f230369d;
                                kp4.c1 c1Var = eVar.f392632a;
                                kp4.f fVar = eVar.f392633b;
                                if (z27) {
                                    m66829xcc839460 = (fVar.f392638g.m66829xcc839460() / fVar.f392637f.getFrameWidth()) * ((float) c1Var.f392608e);
                                    str = str2;
                                } else {
                                    str = str2;
                                    m66829xcc839460 = c1Var.f392607d + ((fVar.f392638g.m66829xcc839460() / fVar.f392637f.getFrameWidth()) * ((float) (c1Var.d() - c1Var.f392607d)));
                                }
                                if (z27) {
                                    m66830x961e58d72 = (fVar.f392638g.m66830x961e58d7() / fVar.f392637f.getFrameWidth()) * ((float) c1Var.f392608e);
                                } else {
                                    m66830x961e58d72 = c1Var.f392607d + ((fVar.f392638g.m66830x961e58d7() / fVar.f392637f.getFrameWidth()) * ((float) (c1Var.d() - c1Var.f392607d)));
                                    m66829xcc839460 = m66829xcc839460;
                                }
                                c1Var.f392607d = m66829xcc839460;
                                c1Var.f392608e = m66830x961e58d72;
                                kp4.h hVar = eVar.f392634c;
                                java.lang.String str3 = hVar.f392642d;
                                fVar.f392638g.m66829xcc839460();
                                fVar.f392638g.m66830x961e58d7();
                                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18806xf42dd2e6 c18806xf42dd2e6 = fVar.f392637f;
                                c18806xf42dd2e6.getFrameWidth();
                                android.view.View view2 = fVar.f3639x46306858;
                                android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                int m72626xeb160320 = layoutParams.width - c18806xf42dd2e6.m72626xeb160320();
                                layoutParams.width = c18806xf42dd2e6.m72626xeb160320();
                                view2.setLayoutParams(layoutParams);
                                kp4.g gVar = hVar.f392645g;
                                if (gVar != null) {
                                    int m8183xf806b362 = fVar.m8183xf806b362();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 c18809x90659727 = ((kp4.f0) gVar).f392640a;
                                    kp4.c1 c1Var2 = c18809x90659727.m72638x2ae9e9d3().get(m8183xf806b362);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1Var2, "get(...)");
                                    kp4.c1 c1Var3 = c1Var2;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = c1Var3.f392630n;
                                    if (z27) {
                                        float f27 = i1Var.f257160l.f479039h;
                                        kp4.c0 callback = c18809x90659727.getCallback();
                                        if (callback != null) {
                                            callback.mo10992xc9fc1b13(c1Var3.f392613j + (((float) c1Var3.f392607d) / i1Var.f257160l.f479039h));
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae1456 = c18809x90659727.f257556d;
                                        if (c18811xb3ae1456 == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                                            throw null;
                                        }
                                        c18811xb3ae1456.scrollBy(-m72626xeb160320, 0);
                                    } else {
                                        float f28 = i1Var.f257160l.f479039h;
                                        kp4.c0 callback2 = c18809x90659727.getCallback();
                                        if (callback2 != null) {
                                            callback2.mo10992xc9fc1b13(c1Var3.f392613j + (((float) (c1Var3.f392608e - c1Var3.f392607d)) / i1Var.f257160l.f479039h));
                                        }
                                    }
                                    kp4.c0 callback3 = c18809x90659727.getCallback();
                                    if (callback3 != null) {
                                        callback3.c(m8183xf806b362 - 1, z27, c18809x90659727.m72638x2ae9e9d3().get(m8183xf806b362).f392607d, c18809x90659727.m72638x2ae9e9d3().get(m8183xf806b362).f392608e);
                                    }
                                    int i28 = c18809x90659727.f257573x;
                                    int i29 = c18809x90659727.f257574y;
                                    float f29 = i28 - i29;
                                    if (f19 > f29) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14562 = c18809x90659727.f257556d;
                                        if (c18811xb3ae14562 == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                                            throw null;
                                        }
                                        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14563 = c18809x90659727.f257556d;
                                        if (c18811xb3ae14563 == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                                            throw null;
                                        }
                                        c18811xb3ae14562.measure(makeMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(c18811xb3ae14563.getHeight(), 1073741824));
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14564 = c18809x90659727.f257556d;
                                        if (c18811xb3ae14564 == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                                            throw null;
                                        }
                                        int width = c18811xb3ae14564.getWidth();
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14565 = c18809x90659727.f257556d;
                                        if (c18811xb3ae14565 == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                                            throw null;
                                        }
                                        c18811xb3ae14564.layout(0, 0, width, c18811xb3ae14565.getHeight());
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14566 = c18809x90659727.f257556d;
                                        if (c18811xb3ae14566 == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                                            throw null;
                                        }
                                        c18811xb3ae14566.scrollBy((int) (f19 - f29), 0);
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    int i37 = c18809x90659727.f257575z;
                                    if (f19 < i37 + i29) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14567 = c18809x90659727.f257556d;
                                        if (c18811xb3ae14567 == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                                            throw null;
                                        }
                                        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14568 = c18809x90659727.f257556d;
                                        if (c18811xb3ae14568 == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                                            throw null;
                                        }
                                        c18811xb3ae14567.measure(makeMeasureSpec2, android.view.View.MeasureSpec.makeMeasureSpec(c18811xb3ae14568.getHeight(), 1073741824));
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14569 = c18809x90659727.f257556d;
                                        if (c18811xb3ae14569 == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                                            throw null;
                                        }
                                        int width2 = c18811xb3ae14569.getWidth();
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae145610 = c18809x90659727.f257556d;
                                        if (c18811xb3ae145610 == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                                            throw null;
                                        }
                                        c18811xb3ae14569.layout(0, 0, width2, c18811xb3ae145610.getHeight());
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae145611 = c18809x90659727.f257556d;
                                        if (c18811xb3ae145611 == null) {
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str);
                                            throw null;
                                        }
                                        c18811xb3ae145611.scrollBy((int) ((f19 - i37) - i29), 0);
                                        z17 = true;
                                    }
                                    if (z17) {
                                        java.lang.Runnable runnable = c18809x90659727.G;
                                        c18809x90659727.removeCallbacks(runnable);
                                        c18809x90659727.postDelayed(runnable, c18809x90659727.F);
                                    }
                                }
                            } else {
                                str = str2;
                            }
                            z19 = true;
                            aVar = this;
                        } else {
                            str = str2;
                        }
                        aVar.f230505g++;
                        z18 = true;
                        str2 = str;
                        i19 = 2;
                        i18 = 0;
                    }
                    boolean z28 = z18;
                    if (z19) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450.b(c16531xba313450, z28);
                    }
                    yj0.a.i(z19, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return z19;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            return false;
                        }
                    }
                }
            }
            int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
            aVar.f230504f = pointerId2;
            int i38 = aVar.f230502d;
            if (pointerId2 != i38 && pointerId2 != aVar.f230503e) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.b bVar = c16531xba313450.f230369d;
            if (bVar != null) {
                boolean z29 = pointerId2 == i38;
                kp4.e eVar2 = (kp4.e) bVar;
                kp4.c1 c1Var4 = eVar2.f392632a;
                c1Var4.f392616m = false;
                c1Var4.f392615l = false;
                kp4.f fVar2 = eVar2.f392633b;
                long m66829xcc8394602 = z29 ? (fVar2.f392638g.m66829xcc839460() / fVar2.f392637f.getFrameWidth()) * ((float) c1Var4.f392608e) : c1Var4.f392607d + ((fVar2.f392638g.m66829xcc839460() / fVar2.f392637f.getFrameWidth()) * ((float) (c1Var4.d() - c1Var4.f392607d)));
                long m66830x961e58d73 = z29 ? (fVar2.f392638g.m66830x961e58d7() / fVar2.f392637f.getFrameWidth()) * ((float) c1Var4.f392608e) : c1Var4.f392607d + ((fVar2.f392638g.m66830x961e58d7() / fVar2.f392637f.getFrameWidth()) * ((float) (c1Var4.d() - c1Var4.f392607d)));
                c1Var4.f392607d = m66829xcc8394602;
                c1Var4.f392608e = m66830x961e58d73;
                kp4.h hVar2 = eVar2.f392634c;
                java.lang.String str4 = hVar2.f392642d;
                fVar2.f392637f.a(c1Var4, fVar2.f392635d, true, true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18806xf42dd2e6 c18806xf42dd2e62 = fVar2.f392637f;
                int showWidth = c18806xf42dd2e62.getShowWidth();
                int i39 = fVar2.f392636e;
                int minWidth = c18806xf42dd2e62.getMinWidth();
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450 c16531xba3134502 = fVar2.f392638g;
                c16531xba3134502.d(showWidth - (i39 * 2), minWidth, i39);
                android.view.ViewGroup.LayoutParams layoutParams2 = c16531xba3134502.getLayoutParams();
                layoutParams2.width = c18806xf42dd2e62.m72626xeb160320();
                c16531xba3134502.setLayoutParams(layoutParams2);
                android.view.View view3 = fVar2.f3639x46306858;
                android.view.ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                layoutParams3.width = c18806xf42dd2e62.m72626xeb160320();
                view3.setLayoutParams(layoutParams3);
                android.view.ViewGroup.LayoutParams layoutParams4 = c18806xf42dd2e62.getLayoutParams();
                layoutParams4.width = c18806xf42dd2e62.m72626xeb160320();
                c18806xf42dd2e62.setLayoutParams(layoutParams4);
                fVar2.f3639x46306858.setLayoutDirection(0);
                c1Var4.d();
                c18806xf42dd2e62.getTotalFrameWidth();
                kp4.g gVar2 = hVar2.f392645g;
                if (gVar2 != null) {
                    int m8183xf806b3622 = fVar2.m8183xf806b362();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 c18809x906597272 = ((kp4.f0) gVar2).f392640a;
                    c18809x906597272.f257572w = false;
                    c18809x906597272.c(false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727.a(c18809x906597272);
                    c18809x906597272.f257567r = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae145612 = c18809x906597272.f257556d;
                    if (c18811xb3ae145612 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                        throw null;
                    }
                    int makeMeasureSpec3 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae145613 = c18809x906597272.f257556d;
                    if (c18811xb3ae145613 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                        throw null;
                    }
                    c18811xb3ae145612.measure(makeMeasureSpec3, android.view.View.MeasureSpec.makeMeasureSpec(c18811xb3ae145613.getHeight(), 1073741824));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae145614 = c18809x906597272.f257556d;
                    if (c18811xb3ae145614 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                        throw null;
                    }
                    int width3 = c18811xb3ae145614.getWidth();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae145615 = c18809x906597272.f257556d;
                    if (c18811xb3ae145615 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                        throw null;
                    }
                    c18811xb3ae145614.layout(0, 0, width3, c18811xb3ae145615.getHeight());
                    int i47 = m8183xf806b3622 - 1;
                    long j17 = c18809x906597272.m72638x2ae9e9d3().get(m8183xf806b3622).f392607d;
                    long j18 = c18809x906597272.m72638x2ae9e9d3().get(m8183xf806b3622).f392608e;
                    kp4.c0 callback4 = c18809x906597272.getCallback();
                    if (callback4 != null) {
                        callback4.a(i47, z29, c18809x906597272.m72638x2ae9e9d3().get(m8183xf806b3622).f392607d, c18809x906597272.m72638x2ae9e9d3().get(m8183xf806b3622).f392608e);
                    }
                    c18809x906597272.removeCallbacks(c18809x906597272.G);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450.c(c16531xba313450, aVar.f230504f == aVar.f230502d, false);
            if (aVar.f230504f == aVar.f230502d) {
                aVar.f230502d = -1;
            } else {
                aVar.f230503e = -1;
            }
            c16531xba313450.f230373h = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450.b(c16531xba313450, false);
            yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        int actionIndex = motionEvent.getActionIndex();
        aVar.f230505g = actionIndex;
        aVar.f230504f = motionEvent.getPointerId(actionIndex);
        aVar.f230506h = motionEvent.getX(aVar.f230505g);
        float y17 = motionEvent.getY(aVar.f230505g);
        aVar.f230507i = y17;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450.a(c16531xba313450, c16531xba313450.f230375m, aVar.f230506h, y17)) {
            if (c16531xba313450.e(true)) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.b bVar2 = c16531xba313450.f230369d;
            if (bVar2 != null) {
                ((kp4.e) bVar2).a(true);
            }
            aVar.f230502d = aVar.f230504f;
            int i48 = c16531xba313450.f230375m.getBounds().left;
            c16531xba313450.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450.c(c16531xba313450, true, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450.b(c16531xba313450, true);
            yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450.a(c16531xba313450, c16531xba313450.f230376n, aVar.f230506h, aVar.f230507i)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (c16531xba313450.e(false)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.b bVar3 = c16531xba313450.f230369d;
        if (bVar3 != null) {
            ((kp4.e) bVar3).a(false);
        }
        aVar.f230503e = aVar.f230504f;
        int i49 = c16531xba313450.f230376n.getBounds().right;
        c16531xba313450.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450.c(c16531xba313450, false, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450.b(c16531xba313450, true);
        yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/EditSliderSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
