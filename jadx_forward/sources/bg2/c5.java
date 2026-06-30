package bg2;

/* loaded from: classes2.dex */
public final class c5 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.q f101513e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f101514f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f101515g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f101516h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101513e = new bg2.b5(this);
    }

    @Override // tc2.c
    public void P6() {
        r45.kz3 kz3Var;
        r45.kz3 kz3Var2;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        r45.kr0 d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject3;
        r45.dm2 m76806xdef68064;
        r45.t94 t94Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        java.util.LinkedList m75941xfb8219142;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject4;
        tc2.g gVar = this.f498674d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = (abstractC14490x69736cb5 == null || (feedObject4 = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject4.m59240x7c94657b();
        r45.kr0 d18 = m59240x7c94657b != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.d(m59240x7c94657b) : null;
        if (d18 == null || (m75941xfb8219142 = d18.m75941xfb821914(12)) == null) {
            kz3Var = null;
        } else {
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                r45.kz3 kz3Var3 = (r45.kz3) obj2;
                if (kz3Var3.m75939xb282bd08(0) == 13 && ((r45.pg6) kz3Var3.m75936x14adae67(5)) != null) {
                    break;
                }
            }
            kz3Var = (r45.kz3) obj2;
        }
        this.f101514f = kz3Var != null;
        if (d18 == null || (m75941xfb821914 = d18.m75941xfb821914(12)) == null) {
            kz3Var2 = null;
        } else {
            java.util.Iterator it6 = m75941xfb821914.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it6.next();
                r45.kz3 kz3Var4 = (r45.kz3) obj;
                if (kz3Var4.m75939xb282bd08(0) == 15 && ((r45.cg6) kz3Var4.m75936x14adae67(7)) != null) {
                    break;
                }
            }
            kz3Var2 = (r45.kz3) obj;
        }
        this.f101515g = kz3Var2 != null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = gVar.f498681h;
        this.f101516h = (abstractC14490x69736cb52 == null || (feedObject2 = abstractC14490x69736cb52.getFeedObject()) == null || (feedObject3 = feedObject2.getFeedObject()) == null || (m76806xdef68064 = feedObject3.m76806xdef68064()) == null || (t94Var = (r45.t94) m76806xdef68064.m75936x14adae67(44)) == null || !t94Var.m75933x41a8a7f2(0)) ? false : true;
        in5.s0 s0Var = gVar.f498682i;
        android.content.Context context = s0Var != null ? s0Var.f374654e : null;
        if (context != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = gVar.f498681h;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b2 = (abstractC14490x69736cb53 == null || (feedObject = abstractC14490x69736cb53.getFeedObject()) == null) ? null : feedObject.m59240x7c94657b();
            boolean z17 = ((m59240x7c94657b2 == null || (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.d(m59240x7c94657b2)) == null) ? 0 : d17.m75939xb282bd08(0)) > 0;
            uc2.g gVar2 = (uc2.g) O6(uc2.g.class);
            android.view.View Y6 = gVar2 != null ? ((sb2.l) gVar2).Y6() : null;
            if (z17) {
                java.lang.Object layoutParams = Y6 != null ? Y6.getLayoutParams() : null;
                marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = i65.a.b(context, 96);
                }
            } else {
                java.lang.Object layoutParams2 = Y6 != null ? Y6.getLayoutParams() : null;
                marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = i65.a.b(context, 80);
                }
            }
        }
        Z6();
    }

    @Override // tc2.c
    public void Q6() {
        Y6();
    }

    @Override // tc2.c
    public void U6() {
        in5.s0 s0Var = this.f498674d.f498682i;
        android.view.View p17 = s0Var != null ? s0Var.p(com.p314xaae8f345.mm.R.id.f565793dk3) : null;
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        cw2.da Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = Z6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) Z6 : null;
        if (c15182x1607686b == null) {
            return;
        }
        c15182x1607686b.m61348x89cff419(null);
    }

    public final void Y6() {
        r45.kr0 d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        tc2.g gVar = this.f498674d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.m59240x7c94657b();
        if (((m59240x7c94657b == null || (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.d(m59240x7c94657b)) == null) ? 0 : d17.m75939xb282bd08(0)) > 0 || this.f101514f || this.f101515g || this.f101516h) {
            in5.s0 s0Var = gVar.f498682i;
            android.view.View p17 = s0Var != null ? s0Var.p(com.p314xaae8f345.mm.R.id.f565793dk3) : null;
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "checkAndShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "checkAndShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        uc2.g gVar2 = (uc2.g) O6(uc2.g.class);
        zy2.g5 Z6 = gVar2 != null ? ((sb2.l) gVar2).Z6() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = Z6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) Z6 : null;
        if (c15182x1607686b == null) {
            return;
        }
        c15182x1607686b.m61348x89cff419(this.f101513e);
    }

    public final void Z6() {
        in5.s0 s0Var;
        in5.s0 s0Var2;
        r45.kr0 d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f498674d.f498681h;
        android.view.View view = null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.m59240x7c94657b();
        if (((m59240x7c94657b == null || (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.d(m59240x7c94657b)) == null) ? 0 : d17.m75939xb282bd08(0)) > 0 || this.f101514f || this.f101515g || this.f101516h) {
            uc2.g gVar = (uc2.g) O6(uc2.g.class);
            if (gVar != null && (s0Var2 = ((sb2.l) gVar).f498674d.f498682i) != null) {
                view = s0Var2.p(com.p314xaae8f345.mm.R.id.f566017ee1);
            }
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = view;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "checkFooterVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "checkFooterVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        uc2.g gVar2 = (uc2.g) O6(uc2.g.class);
        if (gVar2 != null && (s0Var = ((sb2.l) gVar2).f498674d.f498682i) != null) {
            view = s0Var.p(com.p314xaae8f345.mm.R.id.f566017ee1);
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        android.view.View view3 = view;
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "checkFooterVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "checkFooterVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // tc2.h
    /* renamed from: onLiveEnd */
    public void mo10394x5aa1a970() {
        tc2.g gVar = this.f498674d;
        in5.s0 s0Var = gVar.f498682i;
        android.view.View p17 = s0Var != null ? s0Var.p(com.p314xaae8f345.mm.R.id.f565793dk3) : null;
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        in5.s0 s0Var2 = gVar.f498682i;
        android.view.View p18 = s0Var2 != null ? s0Var2.p(com.p314xaae8f345.mm.R.id.djz) : null;
        if (p18 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        in5.s0 s0Var3 = gVar.f498682i;
        android.view.View p19 = s0Var3 != null ? s0Var3.p(com.p314xaae8f345.mm.R.id.f565792dk2) : null;
        if (p19 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
