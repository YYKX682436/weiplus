package au0;

/* loaded from: classes5.dex */
public abstract class a implements bv0.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.PointF f14051a = new android.graphics.PointF();

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.base.Rect2 f14052b = new com.tencent.maas.base.Rect2(new com.tencent.maas.base.Vec2(0.0f, 0.0f), new com.tencent.maas.base.Vec2(0.0f, 0.0f));

    public abstract boolean d();

    public final android.graphics.PointF e(float f17, float f18) {
        dv0.a aVar = ((cv0.c) this).f222528c;
        du0.o oVar = (du0.o) aVar;
        android.view.View view = oVar.f243397s;
        android.graphics.Rect rect = oVar.f243399u;
        if (view != null) {
            view.getHitRect(rect);
        }
        com.tencent.maas.base.Vec2 b76 = ((du0.o) aVar).b7();
        float f19 = rect.left;
        float f27 = rect.right;
        float f28 = rect.top;
        float f29 = rect.bottom;
        if (f19 <= f17 && f17 <= f27) {
            if (f28 <= f18 && f18 <= f29) {
                float f37 = (f17 - f19) / b76.f47799x;
                float f38 = (f18 - f28) / b76.f47800y;
                rect.toString();
                android.graphics.PointF pointF = this.f14051a;
                pointF.set(f37, f38);
                return pointF;
            }
        }
        return null;
    }

    public final com.tencent.maas.base.Rect2 f() {
        du0.o oVar = (du0.o) ((cv0.c) this).f222528c;
        android.view.View view = oVar.f243396r;
        android.graphics.Rect rect = oVar.f243402x;
        if (view != null) {
            view.getHitRect(rect);
        }
        com.tencent.maas.base.Rect2 rect2 = this.f14052b;
        rect2.getSize().set(rect.width(), rect.height());
        return rect2;
    }

    public abstract void g(boolean z17, au0.b bVar);

    public final java.lang.String h(com.tencent.maas.base.Rect2 rect2) {
        kotlin.jvm.internal.o.g(rect2, "<this>");
        return "Rect2(" + rect2.getOrigin().f47799x + ", " + rect2.getOrigin().f47800y + " - " + rect2.getSize().f47799x + ", " + rect2.getSize().f47800y + ')';
    }

    public abstract boolean i(com.tencent.maas.base.MJID mjid);

    public abstract boolean j(com.tencent.maas.base.MJID mjid, android.graphics.PointF pointF, boolean z17, boolean z18);

    @Override // bv0.a
    public boolean onDoubleTap(float f17, float f18) {
        return false;
    }

    @Override // bv0.a
    public boolean onDown(float f17, float f18) {
        cv0.c cVar = (cv0.c) this;
        dv0.a aVar = cVar.f222528c;
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
        com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner m17 = cVar.m(e17);
        java.util.Objects.toString(m17);
        if (m17 != com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner.MJRectCornerInvalid) {
            return true;
        }
        com.tencent.maas.base.MJID W0 = aVar.W0(e17);
        if (W0 == null) {
            return false;
        }
        return i(W0);
    }

    @Override // bv0.a
    public boolean onSingleTap(float f17, float f18) {
        boolean z17;
        au0.b n17;
        au0.b n18;
        cv0.c cVar = (cv0.c) this;
        dv0.a aVar = cVar.f222528c;
        if (aVar.C5()) {
            return false;
        }
        android.graphics.PointF e17 = e(f17, f18);
        if (e17 == null) {
            g(false, null);
            return false;
        }
        com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner m17 = cVar.m(e17);
        java.util.Objects.toString(m17);
        if (m17 != com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner.MJRectCornerInvalid && cVar.k("toucheSingleTabCorner") && (n17 = cVar.n()) != null && n17.isEnable()) {
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
        com.tencent.maas.base.MJID W0 = aVar.W0(e17);
        if (W0 != null) {
            return j(W0, e17, true, true);
        }
        g(false, null);
        return false;
    }
}
