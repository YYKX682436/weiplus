package ci2;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci2.s f41698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f41699e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ci2.s sVar, com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView) {
        super(0);
        this.f41698d = sVar;
        this.f41699e = liveVoiceRoomLayoutView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ci2.s sVar = this.f41698d;
        sVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAddContentView diff tag, removeAll, tag: ");
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f41699e;
        sb6.append(liveVoiceRoomLayoutView.getTag());
        sb6.append(" childCount: ");
        sb6.append(liveVoiceRoomLayoutView.getChildCount());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = sVar.f272266a;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (kotlin.jvm.internal.o.b(liveVoiceRoomLayoutView.getTag(), str) && kotlin.jvm.internal.o.b(liveVoiceRoomLayoutView.getChatVoiceRoomContentLayout().getParent(), liveVoiceRoomLayoutView)) {
            com.tencent.mars.xlog.Log.i(str, "checkAddContentView same tag");
        } else {
            liveVoiceRoomLayoutView.removeAllViews();
            android.widget.FrameLayout chatVoiceRoomContentLayout = liveVoiceRoomLayoutView.getChatVoiceRoomContentLayout();
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1);
            layoutParams.f10893h = 0;
            layoutParams.f10885d = 0;
            layoutParams.f10891g = 0;
            layoutParams.f10899k = 0;
            liveVoiceRoomLayoutView.addView(chatVoiceRoomContentLayout, layoutParams);
        }
        return jz5.f0.f302826a;
    }
}
