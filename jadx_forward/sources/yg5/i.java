package yg5;

/* loaded from: classes10.dex */
public final class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg5.l f543886d;

    public i(yg5.l lVar) {
        this.f543886d = lVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        yg5.l lVar = this.f543886d;
        java.util.ArrayList arrayList = lVar.f543891l2.f233598o;
        int u07 = parent.u0(view);
        if (u07 >= 0 && u07 < arrayList.size()) {
            yg5.f fVar = (yg5.f) arrayList.get(u07);
            if (fVar instanceof yg5.e) {
                java.util.Iterator it = arrayList.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    yg5.f fVar2 = (yg5.f) it.next();
                    if ((fVar2 instanceof yg5.e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((yg5.e) fVar2).f543882e, ((yg5.e) fVar).f543882e)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i17 >= 0 && i17 < arrayList.size()) {
                    int i18 = (u07 - i17) % lVar.f543889j2;
                    outRect.top = yg5.l.g1(lVar, 4.0f);
                    outRect.bottom = yg5.l.g1(lVar, 4.0f);
                    outRect.left = yg5.l.g1(lVar, 4.0f);
                    outRect.right = yg5.l.g1(lVar, 4.0f);
                    if (i18 == 0) {
                        outRect.left = 0;
                    }
                    if (i18 == lVar.f543889j2 - 1) {
                        outRect.right = 0;
                    }
                }
            }
        }
    }
}
