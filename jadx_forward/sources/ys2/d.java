package ys2;

/* loaded from: classes3.dex */
public final class d extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public if2.d0 f546680m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f546681n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f546682o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.fk7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        this.f546680m = new if2.d0(viewGroup, this);
        this.f546681n = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f567862kx1);
        this.f546682o = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pnt);
        this.f372636i = new ys2.a(this);
        boolean z17 = ((ct2.j) m56788xbba4bfc0(ct2.j.class)).f303798f;
        ml2.z0 z0Var = ml2.z0.f409863a;
        if (z17) {
            android.view.View view = this.f546681n;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view2 = this.f546681n;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.f546681n;
            if (view3 != null) {
                view3.setOnClickListener(new ys2.b(this));
            }
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f409306d;
            java.lang.String jSONObject = ml2.z0.b(z0Var, null, 1, null).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            ((ml2.j0) zbVar).Wj("watch_live_speed_exp", jSONObject);
        }
        r45.i72 i72Var = (r45.i72) ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75936x14adae67(44);
        java.util.LinkedList m75941xfb821914 = i72Var != null ? i72Var.m75941xfb821914(7) : null;
        if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
            android.view.View view4 = this.f546682o;
            if (view4 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view5 = this.f546682o;
        if (view5 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/replay/controller/ReplayBottomAreaController", "onViewMount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view6 = this.f546682o;
        if (view6 != null) {
            view6.setOnClickListener(new ys2.c(this));
        }
        zy2.zb zbVar2 = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr2 = ml2.o3.f409306d;
        java.lang.String jSONObject2 = ml2.z0.b(z0Var, null, 1, null).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ((ml2.j0) zbVar2).Wj("watch_live_wonderful_button_exp", jSONObject2);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f546680m = null;
        this.f546681n = null;
        this.f546682o = null;
    }
}
