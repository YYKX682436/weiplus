package au0;

/* loaded from: classes5.dex */
public abstract class a implements bv0.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.PointF f95584a = new android.graphics.PointF();

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae f95585b = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae(new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.0f, 0.0f), new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.0f, 0.0f));

    public abstract boolean d();

    public final android.graphics.PointF e(float f17, float f18) {
        dv0.a aVar = ((cv0.c) this).f304061c;
        du0.o oVar = (du0.o) aVar;
        android.view.View view = oVar.f324930s;
        android.graphics.Rect rect = oVar.f324932u;
        if (view != null) {
            view.getHitRect(rect);
        }
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e b76 = ((du0.o) aVar).b7();
        float f19 = rect.left;
        float f27 = rect.right;
        float f28 = rect.top;
        float f29 = rect.bottom;
        if (f19 <= f17 && f17 <= f27) {
            if (f28 <= f18 && f18 <= f29) {
                float f37 = (f17 - f19) / b76.f129332x;
                float f38 = (f18 - f28) / b76.f129333y;
                rect.toString();
                android.graphics.PointF pointF = this.f95584a;
                pointF.set(f37, f38);
                return pointF;
            }
        }
        return null;
    }

    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae f() {
        du0.o oVar = (du0.o) ((cv0.c) this).f304061c;
        android.view.View view = oVar.f324929r;
        android.graphics.Rect rect = oVar.f324935x;
        if (view != null) {
            view.getHitRect(rect);
        }
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae = this.f95585b;
        c3972x4b2f2ae.m32427xfb854877().set(rect.width(), rect.height());
        return c3972x4b2f2ae;
    }

    public abstract void g(boolean z17, au0.b bVar);

    public final java.lang.String h(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c3972x4b2f2ae, "<this>");
        return "Rect2(" + c3972x4b2f2ae.m32426x28f8d21c().f129332x + ", " + c3972x4b2f2ae.m32426x28f8d21c().f129333y + " - " + c3972x4b2f2ae.m32427xfb854877().f129332x + ", " + c3972x4b2f2ae.m32427xfb854877().f129333y + ')';
    }

    public abstract boolean i(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78);

    public abstract boolean j(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, android.graphics.PointF pointF, boolean z17, boolean z18);

    @Override // bv0.a
    /* renamed from: onDoubleTap */
    public boolean mo9045xce1d2af3(float f17, float f18) {
        return false;
    }

    @Override // bv0.a
    /* renamed from: onDown */
    public boolean mo9046xc3989f21(float f17, float f18) {
        cv0.c cVar = (cv0.c) this;
        dv0.a aVar = cVar.f304061c;
        if (aVar.C5()) {
            return false;
        }
        if (d()) {
            return true;
        }
        android.graphics.PointF e17 = e(f17, f18);
        if (e17 == null) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner m17 = cVar.m(e17);
        java.util.Objects.toString(m17);
        if (m17 != com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerInvalid) {
            return true;
        }
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 W0 = aVar.W0(e17);
        if (W0 == null) {
            return false;
        }
        return i(W0);
    }

    @Override // bv0.a
    /* renamed from: onSingleTap */
    public boolean mo9047xa5153b1c(float f17, float f18) {
        boolean z17;
        au0.b n17;
        au0.b n18;
        cv0.c cVar = (cv0.c) this;
        dv0.a aVar = cVar.f304061c;
        if (aVar.C5()) {
            return false;
        }
        android.graphics.PointF e17 = e(f17, f18);
        if (e17 == null) {
            g(false, null);
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner m17 = cVar.m(e17);
        java.util.Objects.toString(m17);
        if (m17 != com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerInvalid && cVar.k("toucheSingleTabCorner") && (n17 = cVar.n()) != null && n17.mo9048xdac2174d()) {
            if (aVar.H4(n17, m17) && (n18 = cVar.n()) != null) {
                cVar.o(n18);
                du0.o oVar = (du0.o) aVar;
                oVar.getClass();
                oVar.m7(n18, false);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            return true;
        }
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 W0 = aVar.W0(e17);
        if (W0 != null) {
            return j(W0, e17, true, true);
        }
        g(false, null);
        return false;
    }
}
