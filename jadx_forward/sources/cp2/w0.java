package cp2;

/* loaded from: classes2.dex */
public final class w0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {
    public w0(int i17) {
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        dp2.a aVar = dp2.a.f323716a;
        int dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9) / 2;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        if (!((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).f93474i) {
            android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams2).e() % 2 == 0) {
                outRect.left = r10;
                outRect.right = dimensionPixelSize;
                outRect.bottom = dimensionPixelSize;
                outRect.top = dimensionPixelSize;
                return;
            }
            outRect.left = dimensionPixelSize;
            outRect.right = r10;
            outRect.bottom = dimensionPixelSize;
            outRect.top = dimensionPixelSize;
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = parent.w0(view);
        in5.s0 s0Var = w07 instanceof in5.s0 ? (in5.s0) w07 : null;
        int m8183xf806b362 = s0Var != null ? s0Var.m8183xf806b362() : -1;
        in5.c cVar = s0Var != null ? (in5.c) s0Var.f374658i : null;
        in5.c cVar2 = cVar instanceof in5.c ? cVar : null;
        int dimensionPixelSize2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561964xq);
        if (!(cVar2 instanceof so2.h4)) {
            if ((cVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) || (cVar2 instanceof vp2.d)) {
                outRect.left = r10;
                outRect.right = r10;
                outRect.bottom = dimensionPixelSize;
                outRect.top = dimensionPixelSize;
                return;
            }
            return;
        }
        r45.yw2 yw2Var = ((so2.h4) cVar2).f491933d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveViewCallback", "getItemOffsets divider:" + yw2Var.m75939xb282bd08(2) + '-' + yw2Var.m75942xfb822ef2(3) + '-' + yw2Var.m75945x2fec8307(1));
        if (yw2Var.m75939xb282bd08(2) == 6) {
            if (m8183xf806b362 == 0) {
                outRect.left = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) + 1;
                outRect.right = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                outRect.bottom = dimensionPixelSize;
                outRect.top = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
                return;
            }
            outRect.left = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) + 1;
            outRect.right = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            outRect.bottom = dimensionPixelSize;
            outRect.top = dimensionPixelSize2;
        }
    }
}
