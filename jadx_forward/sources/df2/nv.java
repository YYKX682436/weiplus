package df2;

/* loaded from: classes3.dex */
public final class nv extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f312419m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Space f312420n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Space f312421o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Space f312422p;

    /* renamed from: q, reason: collision with root package name */
    public int f312423q;

    /* renamed from: r, reason: collision with root package name */
    public int f312424r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f312425s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public static void Z6(df2.nv nvVar, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z19 = false;
        }
        nvVar.getClass();
        pm0.v.X(new df2.mv(nvVar, z18, z17, z19));
    }

    public final boolean a7() {
        java.util.LinkedList linkedList;
        xh2.c cVar = (xh2.c) ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb();
        boolean z17 = !(cVar != null && cVar.f536066c == 1);
        xh2.c cVar2 = (xh2.c) ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb();
        java.lang.Integer valueOf = cVar2 != null ? java.lang.Integer.valueOf(cVar2.f536066c) : null;
        xh2.c cVar3 = (xh2.c) ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb();
        boolean z18 = ((cVar3 == null || (linkedList = cVar3.f536064a) == null) ? 1 : linkedList.size()) > 1;
        boolean O6 = ((mm2.h7) m56788xbba4bfc0(mm2.h7.class)).O6();
        if ((!zl2.r4.f555483a.x1() || !z18 || !z17) && !O6) {
            dk2.ef efVar = dk2.ef.f314905a;
            tn0.w0 w0Var = dk2.ef.f314911d;
            if (!(w0Var != null && w0Var.X()) || !z17) {
                tn0.w0 w0Var2 = dk2.ef.f314911d;
                if ((!((w0Var2 == null || w0Var2.X()) ? false : true) || !((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).R7()) && (valueOf == null || valueOf.intValue() != 7)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void b7(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        android.view.ViewGroup.LayoutParams layoutParams3;
        xh2.c cVar = (xh2.c) ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).A.mo3195x754a37bb();
        java.lang.Integer valueOf = cVar != null ? java.lang.Integer.valueOf(cVar.f536066c) : null;
        android.widget.Space space = this.f312420n;
        if (space != null && (layoutParams3 = space.getLayoutParams()) != null) {
            layoutParams3.height = (valueOf != null && valueOf.intValue() == 7) ? 0 : i17;
        }
        android.widget.Space space2 = this.f312422p;
        if (space2 != null && (layoutParams2 = space2.getLayoutParams()) != null) {
            layoutParams2.height = i17;
        }
        android.widget.Space space3 = this.f312421o;
        if (space3 == null || (layoutParams = space3.getLayoutParams()) == null) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == 7) {
            i17 = 0;
        }
        layoutParams.height = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        android.view.ViewGroup.LayoutParams layoutParams;
        super.mo14860x9606ce3f();
        android.widget.Space space = this.f312420n;
        if (((space == null || (layoutParams = space.getLayoutParams()) == null) ? 0 : layoutParams.height) > 0) {
            b7(0);
            android.view.View view = this.f312425s;
            if (view != null) {
                view.requestLayout();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStartFromWindow */
    public void mo14864x95cdef51() {
        b7(this.f312423q);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f312419m = pluginLayout;
        this.f312420n = (android.widget.Space) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.p0d);
        this.f312421o = (android.widget.Space) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.qxp);
        this.f312425s = pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.fh8);
        this.f312422p = (android.widget.Space) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.p0c);
        this.f312424r = 0;
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f312419m = null;
        this.f312420n = null;
        this.f312421o = null;
        this.f312425s = null;
        this.f312422p = null;
    }
}
