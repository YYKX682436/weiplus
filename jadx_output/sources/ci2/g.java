package ci2;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f41680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ci2.h f41681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView, ci2.h hVar) {
        super(0);
        this.f41680d = liveVoiceRoomLayoutView;
        this.f41681e = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        int i17;
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f41680d;
        gi2.d f111700w = liveVoiceRoomLayoutView.getF111700w();
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        ci2.h hVar = this.f41681e;
        if (f111700w != null) {
            java.util.LinkedList linkedList = ((gi2.e) f111700w).f272273g;
            int size = linkedList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            hVar.getClass();
            java.lang.String str = "checkAddContentView diff tag, removeAll, tag: " + liveVoiceRoomLayoutView.getTag() + " childCount: " + liveVoiceRoomLayoutView.getChildCount();
            java.lang.String str2 = hVar.f272266a;
            com.tencent.mars.xlog.Log.i(str2, str);
            if (kotlin.jvm.internal.o.b(liveVoiceRoomLayoutView.getTag(), str2) && kotlin.jvm.internal.o.b(liveVoiceRoomLayoutView.getChatVoiceRoomContentLayout().getParent(), liveVoiceRoomLayoutView)) {
                com.tencent.mars.xlog.Log.i(str2, "checkAddContentView same tag");
                i17 = 0;
            } else {
                liveVoiceRoomLayoutView.removeAllViews();
                android.widget.FrameLayout chatVoiceRoomContentLayout = liveVoiceRoomLayoutView.getChatVoiceRoomContentLayout();
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -2);
                layoutParams.f10893h = 0;
                layoutParams.f10885d = 0;
                layoutParams.f10891g = 0;
                int b17 = i65.a.b(liveVoiceRoomLayoutView.getContext(), 176);
                gi2.d f111700w2 = liveVoiceRoomLayoutView.getF111700w();
                layoutParams.setMargins(0, b17 + (f111700w2 != null ? f111700w2.f272268b : 0), 0, 0);
                liveVoiceRoomLayoutView.addView(chatVoiceRoomContentLayout, layoutParams);
                androidx.constraintlayout.widget.ConstraintLayout chatContentScrollWrapperLayout = liveVoiceRoomLayoutView.getChatContentScrollWrapperLayout();
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -2);
                layoutParams2.f10895i = liveVoiceRoomLayoutView.getChatVoiceRoomContentLayout().getId();
                layoutParams2.f10885d = 0;
                layoutParams2.f10891g = 0;
                layoutParams2.setMargins(0, 0, 0, 0);
                liveVoiceRoomLayoutView.addView(chatContentScrollWrapperLayout, layoutParams2);
                int id6 = liveVoiceRoomLayoutView.getChatContentScrollWrapperLayout().getId();
                int b18 = i65.a.b(liveVoiceRoomLayoutView.getContext(), 1);
                android.view.View bottomLinkSpace = liveVoiceRoomLayoutView.getBottomLinkSpace();
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, i65.a.b(liveVoiceRoomLayoutView.getContext(), 1));
                layoutParams3.f10895i = id6;
                i17 = 0;
                layoutParams3.f10885d = 0;
                layoutParams3.setMargins(0, b18, 0, 0);
                liveVoiceRoomLayoutView.addView(bottomLinkSpace, layoutParams3);
            }
            for (int i18 = i17; i18 < size; i18++) {
                java.lang.Object obj = linkedList.get(i18);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                xh2.a aVar = (xh2.a) obj;
                arrayList.add(f111700w.a(i18));
                arrayList2.add(aVar.f454521b);
                com.tencent.mars.xlog.Log.i(str2, "addView index:" + i18 + " layoutInfo:" + aVar);
            }
            liveVoiceRoomLayoutView.getChatContentLayout().removeAllViews();
            if (arrayList.size() <= 0 || arrayList.size() != arrayList2.size()) {
                com.tencent.mars.xlog.Log.i(str2, "viewList size:" + arrayList.size() + ", layoutInfoList size:" + arrayList2.size());
            } else {
                hVar.c(arrayList);
                hVar.b(arrayList, f111700w, liveVoiceRoomLayoutView);
            }
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(hVar.f272266a, "notifyUpdate layoutAdapter = null");
        }
        return f0Var2;
    }
}
