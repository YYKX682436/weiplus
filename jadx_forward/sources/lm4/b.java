package lm4;

/* loaded from: classes14.dex */
public final class b extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lm4.d f401062a;

    public b(lm4.d dVar) {
        this.f401062a = dVar;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int a(android.view.View child, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        return 0;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int b(android.view.View child, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(child, this.f401062a.f401083g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragDownCloseLayout", "clampViewPositionVertical top:" + i17 + ", dy:" + i18);
        }
        if (i17 >= 0) {
            return i17;
        }
        return 0;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int d(android.view.View child) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        return this.f401062a.f401086m;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void i(android.view.View changedView, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changedView, "changedView");
        lm4.d dVar = this.f401062a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(changedView, dVar.f401083g)) {
            float f17 = i18 / dVar.f401086m;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            yz5.p pVar = dVar.f401082f;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(f17));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragDownCloseLayout", "onViewPositionChanged: top:" + i18 + ", mScreenHeight:" + dVar.f401086m);
        }
        if (changedView != dVar.f401083g || i18 < dVar.f401086m || dVar.f401087n) {
            return;
        }
        dVar.f401087n = true;
        yz5.a m146058xe257e154 = dVar.m146058xe257e154();
        if (m146058xe257e154 != null) {
            m146058xe257e154.mo152xb9724478();
        }
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(releasedChild, "releasedChild");
        float top = releasedChild.getTop();
        lm4.d dVar = this.f401062a;
        if (top <= dVar.f401085i) {
            p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = dVar.f401084h;
            if (lVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
                throw null;
            }
            lVar.s(0, 0);
        } else {
            p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar2 = dVar.f401084h;
            if (lVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
                throw null;
            }
            lVar2.s(0, dVar.f401086m);
        }
        dVar.invalidate();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public boolean k(android.view.View child, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        return true;
    }
}
