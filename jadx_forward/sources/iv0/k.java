package iv0;

/* loaded from: classes5.dex */
public final class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv0.w f376605d;

    public k(iv0.w wVar) {
        this.f376605d = wVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        ex0.v vVar;
        java.util.List list;
        ex0.a0 a0Var;
        ex0.v vVar2;
        java.util.List list2;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.d dVar = com.p314xaae8f345.p457x3304c6.p479x4179489f.d.AspectFit;
        iv0.w wVar = this.f376605d;
        if (itemId == 1) {
            ex0.a0 a0Var2 = wVar.p7().f358175r;
            if (a0Var2 == null || (vVar = a0Var2.f338630g) == null || (list = vVar.f338710e) == null) {
                return;
            }
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                if (rVar.o()) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = rVar.f338700a;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
                    if (c4181x2248e1a3 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
                        if (D != null) {
                            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.h1(c4181x2248e1a3, dVar, D);
                        }
                        android.graphics.PointF pointF = new android.graphics.PointF(0.0f, 0.0f);
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4181x2248e1a3.D();
                        if (D2 != null) {
                            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.Z(c4181x2248e1a3, pointF, D2);
                        }
                        c4181x2248e1a3.t0(new android.graphics.PointF(1.0f, 1.0f));
                        yw0.g gVar = wVar.f376635z;
                        if (gVar != null) {
                            android.graphics.PointF l07 = c4181x2248e1a3.l0();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l07, "getLayerNormalizedPosition(...)");
                            gVar.e(l07);
                        }
                        yw0.g gVar2 = wVar.f376635z;
                        if (gVar2 != null) {
                            android.graphics.PointF o07 = c4181x2248e1a3.o0();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o07, "getLayerScale(...)");
                            gVar2.f(o07);
                        }
                    }
                }
            }
            wVar.n7().c7();
            return;
        }
        if (itemId != 2 || (a0Var = wVar.p7().f358175r) == null || (vVar2 = a0Var.f338630g) == null || (list2 = vVar2.f338710e) == null) {
            return;
        }
        java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
        while (it6.hasNext()) {
            ex0.r rVar2 = (ex0.r) it6.next();
            if (rVar2.o()) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd37132 = rVar2.f338700a;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a32 = c4190xd8dd37132 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd37132 : null;
                if (c4181x2248e1a32 != null) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 o17 = c4181x2248e1a32.o1();
                    float f17 = o17 != null ? (float) o17.f129896b : 0.5625f;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = wVar.p7().o7();
                    float q17 = o76 != null ? (float) o76.q() : 0.5625f;
                    float max = java.lang.Math.max(f17, q17) / java.lang.Math.min(f17, q17);
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4181x2248e1a32.D();
                    if (D3 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.h1(c4181x2248e1a32, dVar, D3);
                    }
                    android.graphics.PointF pointF2 = new android.graphics.PointF(0.0f, 0.0f);
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D4 = c4181x2248e1a32.D();
                    if (D4 != null) {
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.Z(c4181x2248e1a32, pointF2, D4);
                    }
                    c4181x2248e1a32.t0(new android.graphics.PointF(max, max));
                    yw0.g gVar3 = wVar.f376635z;
                    if (gVar3 != null) {
                        android.graphics.PointF l08 = c4181x2248e1a32.l0();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l08, "getLayerNormalizedPosition(...)");
                        gVar3.e(l08);
                    }
                    yw0.g gVar4 = wVar.f376635z;
                    if (gVar4 != null) {
                        android.graphics.PointF o08 = c4181x2248e1a32.o0();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o08, "getLayerScale(...)");
                        gVar4.f(o08);
                    }
                }
            }
        }
        wVar.n7().c7();
    }
}
