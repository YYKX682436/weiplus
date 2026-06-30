package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class jq extends db5.h {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f200302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq f200303h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq nqVar) {
        super(nqVar.f199716e);
        this.f200303h = nqVar;
        this.f200302g = new java.util.LinkedHashMap();
    }

    @Override // db5.h
    public int a() {
        java.util.LinkedList m75941xfb821914;
        r45.hv1 hv1Var = this.f200303h.N;
        if (hv1Var == null || (m75941xfb821914 = hv1Var.m75941xfb821914(4)) == null) {
            return 0;
        }
        return m75941xfb821914.size();
    }

    @Override // db5.h
    public android.view.View b(android.view.View view, android.view.ViewGroup viewGroup, int i17) {
        java.util.LinkedList m75941xfb821914;
        java.util.Map map = this.f200302g;
        android.view.View view2 = (android.view.View) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        android.content.Context context = this.f309888d;
        if (view2 == null) {
            view2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dsd, viewGroup, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view2, "inflate(...)");
        }
        map.put(java.lang.Integer.valueOf(i17), view2);
        r45.hv1 hv1Var = this.f200303h.N;
        r45.a63 a63Var = (hv1Var == null || (m75941xfb821914 = hv1Var.m75941xfb821914(4)) == null) ? null : (r45.a63) kz5.n0.a0(m75941xfb821914, i17);
        if (a63Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq nqVar = this.f200303h;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view2.findViewById(com.p314xaae8f345.mm.R.id.lqa);
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) view2.findViewById(com.p314xaae8f345.mm.R.id.lr8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fq fqVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fq(this, a63Var);
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
            }
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.mo7960x6cab2c8d(fqVar);
            }
            if (c22851x22587864 != null) {
                c22851x22587864.D(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15314xbe4d10f8(context, null));
            }
            if (c22851x22587864 != null) {
                c22851x22587864.m82945xba09cf09(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hq(nqVar, a63Var, c22851x22587864, this, fqVar));
            }
            if (c1163xf1deaba4 != null) {
                ym5.a1.g(c1163xf1deaba4, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.iq());
            }
        }
        return view2;
    }

    @Override // db5.h
    public void c(android.view.View view, int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        java.util.LinkedList m75941xfb821914;
        r45.hv1 hv1Var = this.f200303h.N;
        if (hv1Var == null || (m75941xfb821914 = hv1Var.m75941xfb821914(4)) == null) {
            return 0;
        }
        return m75941xfb821914.size();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getPageTitle */
    public java.lang.CharSequence mo8340x337c8253(int i17) {
        java.lang.String str;
        java.util.LinkedList m75941xfb821914;
        r45.a63 a63Var;
        r45.hv1 hv1Var = this.f200303h.N;
        if (hv1Var == null || (m75941xfb821914 = hv1Var.m75941xfb821914(4)) == null || (a63Var = (r45.a63) kz5.n0.a0(m75941xfb821914, i17)) == null || (str = a63Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        return " " + str + ' ';
    }
}
