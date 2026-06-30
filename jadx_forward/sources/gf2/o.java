package gf2;

/* loaded from: classes10.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 f352827d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49) {
        this.f352827d = c14195x2dafdb49;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gf2.z m56786x837fbb9b;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49 = this.f352827d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d703 = c14195x2dafdb49.f193105d;
        if (abstractC14196xf9d9d703 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("controller");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(abstractC14196xf9d9d703, null, null, new gf2.n(c14195x2dafdb49, null), 3, null);
        m56786x837fbb9b = c14195x2dafdb49.m56786x837fbb9b();
        if (m56786x837fbb9b == null || (str = m56786x837fbb9b.f352859a) == null) {
            str = "";
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.t1 t1Var = ml2.t1.f409515r2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d7032 = c14195x2dafdb49.f193105d;
        if (abstractC14196xf9d9d7032 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("controller");
            throw null;
        }
        java.lang.String str2 = ((mm2.c1) abstractC14196xf9d9d7032.m56788xbba4bfc0(mm2.c1.class)).f410385o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d7033 = c14195x2dafdb49.f193105d;
        if (abstractC14196xf9d9d7033 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("controller");
            throw null;
        }
        long m75942xfb822ef2 = ((mm2.e1) abstractC14196xf9d9d7033.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("milestone", str);
        r0Var.mk(t1Var, str2, m75942xfb822ef2, hashMap);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/anchormilestoneshare/view/AnchorMilestoneShareView$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
