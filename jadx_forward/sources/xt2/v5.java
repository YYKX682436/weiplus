package xt2;

/* loaded from: classes3.dex */
public final class v5 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021 f538610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f538611b;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021 c14982x50d7e021, int i17) {
        this.f538610a = c14982x50d7e021;
        this.f538611b = i17;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.util.LinkedList m75941xfb821914;
        r45.s66 s66Var;
        r45.ce0 ce0Var;
        java.util.LinkedList m75941xfb8219142;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14982x50d7e021 c14982x50d7e021 = this.f538610a;
            cm2.m0 m0Var = c14982x50d7e021.f207872i;
            if (m0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("item");
                throw null;
            }
            r45.t66 t66Var = (r45.t66) m0Var.f124901v.m75936x14adae67(41);
            int size = (t66Var == null || (m75941xfb8219142 = t66Var.m75941xfb821914(0)) == null) ? 0 : m75941xfb8219142.size();
            int i17 = this.f538611b;
            if (i17 < size) {
                cm2.m0 m0Var2 = c14982x50d7e021.f207872i;
                if (m0Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("item");
                    throw null;
                }
                r45.t66 t66Var2 = (r45.t66) m0Var2.f124901v.m75936x14adae67(41);
                bw5.x7 x7Var = (t66Var2 == null || (m75941xfb821914 = t66Var2.m75941xfb821914(0)) == null || (s66Var = (r45.s66) m75941xfb821914.get(i17)) == null || (ce0Var = (r45.ce0) s66Var.m75936x14adae67(3)) == null) ? null : (bw5.x7) ce0Var.m75936x14adae67(10);
                if (x7Var != null) {
                    android.content.Context context = c14982x50d7e021.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    pq.a aVar = new pq.a(context);
                    i95.m c17 = i95.n0.c(pq.q.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    pq.q.h6((pq.q) c17, aVar, x7Var, null, null, 12, null);
                }
            }
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c18;
            ml2.f4 f4Var = ml2.f4.H;
            cm2.m0 m0Var3 = c14982x50d7e021.f207872i;
            if (m0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("item");
                throw null;
            }
            java.lang.String valueOf = java.lang.String.valueOf(m0Var3.f124902w);
            st2.g3 g3Var = st2.g3.f493859a;
            cm2.m0 m0Var4 = c14982x50d7e021.f207872i;
            if (m0Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("item");
                throw null;
            }
            org.json.JSONObject k17 = g3Var.k(m0Var4.f124901v);
            k17.put(ya.b.f77479x42930b2, i17);
            ml2.r0.Dj(r0Var, f4Var, null, valueOf, null, null, null, 0, 0L, k17, null, null, null, false, null, 16120, null);
        }
    }
}
