package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class z extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.a0 f254933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f254934e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.a0 a0Var, int i17) {
        this.f254933d = a0Var;
        this.f254934e = i17;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.y yVar;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.v vVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(e17);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        int x17 = (int) e17.getX();
        int y17 = (int) e17.getY();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.a0 a0Var = this.f254933d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = a0Var.f254787d;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        boolean z18 = false;
        if ((layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) && ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w() >= this.f254934e) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = a0Var.f254787d;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                throw null;
            }
            int m7950x883dc776 = c1163xf1deaba42.m7950x883dc776();
            int i17 = 0;
            while (true) {
                if (i17 >= m7950x883dc776) {
                    yVar = null;
                    break;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 B0 = c1163xf1deaba42.B0(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B0, "getItemDecorationAt(...)");
                if (B0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.y) {
                    yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.y) B0;
                    break;
                }
                i17++;
            }
            if (yVar != null) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = a0Var.f254787d;
                if (c1163xf1deaba43 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                    throw null;
                }
                a0Var.getClass();
                if (yVar.f254923f != null) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    android.view.View view = yVar.f254923f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                    view.getGlobalVisibleRect(rect);
                    android.view.View view2 = yVar.f254923f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
                    android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.r7d);
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    imageView.getGlobalVisibleRect(rect2);
                    int i18 = rect.left;
                    int i19 = rect.top;
                    int i27 = rect.right;
                    int i28 = rect.bottom;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SquareTitleItemDecoration", "[handleItemDecorationClick] left = " + i18 + ", top = " + i19 + ", right = " + i27 + ", bottom = " + i28 + ", ivLeft = " + rect2.left + ", ivTop = " + rect2.top + ", ivRight = " + rect2.right + ", ivBottom = " + rect2.bottom + " x = " + x17 + ", y = " + y17);
                    if (x17 >= i18 && y17 >= i19 && y17 <= i28 && x17 <= i27) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = c1163xf1deaba43.getLayoutManager();
                        if (layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                            int w17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2).w();
                            android.content.Context context = c1163xf1deaba43.getContext();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                            pf5.z zVar = pf5.z.f435481a;
                            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                            java.util.ArrayList arrayList3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac) a17).f255260e;
                            int i29 = w17 - yVar.f254921d;
                            if (arrayList3.size() != 0) {
                                java.lang.Object obj = arrayList3.get(i29);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                                if ((obj instanceof nj4.e) && (vVar = yVar.f254924g) != null) {
                                    nj4.e eVar = (nj4.e) obj;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ce ceVar = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6.f255189z;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18656x65fa26e6 activityC18656x65fa26e6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.de) vVar).f255345a;
                                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = activityC18656x65fa26e6.W6().mo7946xf939df19();
                                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
                                    in5.r w07 = c22848x6ddd90cf != null ? c22848x6ddd90cf.w0(0) : null;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.a aVar = w07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.a ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.a) w07 : null;
                                    if (aVar != null) {
                                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC18656x65fa26e6.mo55332x76847179();
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                                        aVar.n(mo55332x76847179, eVar);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = activityC18656x65fa26e6.f255203t;
                                    ai4.e eVar2 = eVar.f419469d;
                                    if (c16718x7059cefe != null && (arrayList = c16718x7059cefe.f233598o) != null) {
                                        java.util.Iterator it = arrayList.iterator();
                                        int i37 = 0;
                                        while (it.hasNext()) {
                                            java.lang.Object next = it.next();
                                            int i38 = i37 + 1;
                                            if (i37 < 0) {
                                                kz5.c0.p();
                                                throw null;
                                            }
                                            nj4.i iVar = (nj4.i) next;
                                            if ((iVar instanceof nj4.e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar2.f86667a, ((nj4.e) iVar).f419469d.f86667a)) {
                                                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager3 = activityC18656x65fa26e6.W6().getLayoutManager();
                                                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager3 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager3 : null;
                                                if (c1162x665295de != null) {
                                                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                                    arrayList4.add(0);
                                                    arrayList4.add(java.lang.Integer.valueOf(i37));
                                                    java.util.Collections.reverse(arrayList4);
                                                    yj0.a.d(c1162x665295de, arrayList4.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$addStatusTitle$1", "onClick", "(Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendsItem;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                                                    c1162x665295de.P(((java.lang.Integer) arrayList4.get(0)).intValue(), ((java.lang.Integer) arrayList4.get(1)).intValue());
                                                    yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$addStatusTitle$1", "onClick", "(Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendsItem;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                                                }
                                            }
                                            i37 = i38;
                                        }
                                    }
                                    mj4.h hVar = (mj4.h) eVar2.f86668b.get(0);
                                    qj4.s sVar = qj4.s.f445491a;
                                    mj4.k kVar = (mj4.k) hVar;
                                    java.lang.String h17 = kVar.h();
                                    java.lang.String o17 = kVar.o();
                                    int size = eVar2.f86668b.size();
                                    z17 = true;
                                    qj4.s.n(sVar, 6L, h17, size, o17, null, null, 0, 0L, 0L, xe0.j0.a(kVar, false, 1, null).f436751i, java.lang.Integer.valueOf(xe0.j0.a(kVar, false, 1, null).f436758s), null, null, null, 14832, null);
                                    z18 = z17;
                                }
                            }
                        }
                        z17 = true;
                        z18 = z17;
                    }
                }
                yj0.a.i(z18, this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return z18;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/textstatus/convert/topic/SquareTitleItemTouchListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
