package yr1;

/* loaded from: classes14.dex */
public final class l extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yr1.m f546182a;

    public l(yr1.m mVar) {
        this.f546182a = mVar;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int a(android.view.View child, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        return 0;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int b(android.view.View child, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(child, this.f546182a.f546186g)) {
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
        return this.f546182a.f546189m;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void i(android.view.View changedView, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changedView, "changedView");
        yr1.m mVar = this.f546182a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(changedView, mVar.f546186g)) {
            float f17 = i18 / mVar.f546189m;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            yz5.p pVar = mVar.f546185f;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(f17));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DragDownCloseLayout", "onViewPositionChanged: top:" + i18 + ", mScreenHeight:" + mVar.f546189m);
        }
        if (changedView != mVar.f546186g || i18 < mVar.f546189m || mVar.f546190n) {
            return;
        }
        mVar.f546190n = true;
        yz5.a m177546xe257e154 = mVar.m177546xe257e154();
        if (m177546xe257e154 != null) {
            m177546xe257e154.mo152xb9724478();
        }
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(releasedChild, "releasedChild");
        float top = releasedChild.getTop();
        yr1.m mVar = this.f546182a;
        if (top <= mVar.f546188i) {
            p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = mVar.f546187h;
            if (lVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
                throw null;
            }
            lVar.s(0, 0);
        } else {
            p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar2 = mVar.f546187h;
            if (lVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
                throw null;
            }
            lVar2.s(0, mVar.f546189m);
        }
        mVar.invalidate();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public boolean k(android.view.View child, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        return true;
    }
}
