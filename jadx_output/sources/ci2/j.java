package ci2;

/* loaded from: classes10.dex */
public final class j extends gi2.c {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f41684b = jz5.h.b(ci2.i.f41683d);

    @Override // gi2.c
    public void b(java.util.ArrayList viewList, gi2.d adapter, com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView liveCustomRoomLayoutView) {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView parent = (com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView) liveCustomRoomLayoutView;
        kotlin.jvm.internal.o.g(viewList, "viewList");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(parent, "parent");
        int b17 = i65.a.b(parent.getContext(), 191);
        gi2.d f111700w = parent.getF111700w();
        int i17 = b17 + (f111700w != null ? f111700w.f272268b : 0);
        int b18 = i65.a.b(parent.getContext(), 24);
        int i18 = 0;
        for (java.lang.Object obj : viewList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view = (android.view.View) obj;
            f(view, adapter, i18);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f10893h = 0;
            if (i18 == 0) {
                layoutParams.f10885d = 0;
                android.view.View view2 = (android.view.View) kz5.n0.a0(viewList, 1);
                if (view2 != null) {
                    layoutParams.f10889f = view2.getId();
                }
                layoutParams.F = 2;
                layoutParams.setMargins(0, i17, 0, 0);
            } else if (i18 == kz5.c0.h(viewList)) {
                android.view.View view3 = (android.view.View) kz5.n0.a0(viewList, i18 - 1);
                if (view3 != null) {
                    layoutParams.f10887e = view3.getId();
                }
                layoutParams.f10891g = 0;
                layoutParams.setMargins(b18, i17, 0, 0);
            } else {
                android.view.View view4 = (android.view.View) kz5.n0.a0(viewList, i18 - 1);
                if (view4 != null) {
                    layoutParams.f10887e = view4.getId();
                }
                android.view.View view5 = (android.view.View) kz5.n0.a0(viewList, i19);
                if (view5 != null) {
                    layoutParams.f10889f = view5.getId();
                }
                layoutParams.setMargins(b18, i17, 0, 0);
            }
            parent.addView(view, layoutParams);
            i18 = i19;
        }
    }

    @Override // gi2.c
    public java.lang.String d() {
        return "ChatVoiceRoomPrepareLayout";
    }
}
