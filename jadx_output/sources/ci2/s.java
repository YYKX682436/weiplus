package ci2;

/* loaded from: classes10.dex */
public final class s extends gi2.c {

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f41700b = jz5.h.b(ci2.p.f41695d);

    @Override // gi2.c
    public void b(java.util.ArrayList viewList, gi2.d adapter, com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView liveCustomRoomLayoutView) {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView parent = (com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView) liveCustomRoomLayoutView;
        kotlin.jvm.internal.o.g(viewList, "viewList");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(parent, "parent");
    }

    @Override // gi2.c
    public java.lang.String d() {
        return "ChatVoiceRoomPreviewLayout";
    }

    @Override // gi2.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView parent) {
        kotlin.jvm.internal.o.g(parent, "parent");
        ci2.r rVar = new ci2.r(this, parent);
        if (parent.getWidth() != 0 && parent.getHeight() != 0) {
            rVar.invoke();
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = parent.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnPreDrawListener(new ci2.q(parent, rVar));
        }
    }
}
