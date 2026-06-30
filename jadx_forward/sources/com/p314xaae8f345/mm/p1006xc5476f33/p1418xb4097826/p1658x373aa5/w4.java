package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class w4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b f214816d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b) {
        super(3);
        this.f214816d = c15260x406bbe1b;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        jz5.l lVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17;
        android.view.View view = (android.view.View) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b = this.f214816d;
        java.lang.ref.WeakReference weakReference = c15260x406bbe1b.getColumnFeedSelectorAdapter().f325646x;
        java.lang.Integer num = null;
        in5.s0 s0Var = weakReference != null ? (in5.s0) weakReference.get() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = (s0Var == null || (o17 = s0Var.o()) == null) ? null : o17.getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
        if (c15415x74224fd8 != null) {
            c15415x74224fd8.C = !booleanValue;
        }
        float f17 = booleanValue ? 0.0f : 1.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15374xd3ebae5 c15374xd3ebae5 = c15260x406bbe1b.f212444o;
        if (c15374xd3ebae5 != null) {
            c15374xd3ebae5.setAlpha(f17);
        }
        android.widget.TextView textView = c15260x406bbe1b.f212443n;
        if (textView != null) {
            textView.setAlpha(f17);
        }
        java.lang.Iterable iterable = kz5.p0.f395529d;
        if (longValue != 0) {
            ey2.u uVar = c15260x406bbe1b.f212447r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = (uVar == null || (j0Var = uVar.f339075x) == null || (lVar = (jz5.l) j0Var.mo3195x754a37bb()) == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) lVar.f384366d;
            if (c13920xa5f564aa != null) {
                java.util.Iterator<T> it = c13920xa5f564aa.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (hc2.o0.s((so2.j5) it.next()) == longValue) {
                        break;
                    }
                    i17++;
                }
                num = java.lang.Integer.valueOf(i17);
            }
            if (num != null && num.intValue() != -1) {
                java.util.List b17 = kz5.b0.b();
                if (num.intValue() > 0) {
                    ((lz5.e) b17).add(java.lang.Integer.valueOf(num.intValue() - 1));
                }
                if (num.intValue() < c13920xa5f564aa.size() - 1) {
                    ((lz5.e) b17).add(java.lang.Integer.valueOf(num.intValue() + 1));
                }
                iterable = kz5.b0.a(b17);
            }
        }
        java.util.Iterator it6 = iterable.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c15260x406bbe1b.m61759x4905e9fa().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8148xed6e4d18(intValue, "speedChanged");
            }
        }
        if (booleanValue && (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) view.findViewById(com.p314xaae8f345.mm.R.id.e_k)) != null && !c15196x85976f5f.J()) {
            c15196x85976f5f.M();
        }
        return jz5.f0.f384359a;
    }
}
