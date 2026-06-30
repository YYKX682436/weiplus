package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.area.ExpandTouchDelegate$Companion$layoutChangeListener$1$onLayoutChange$1 */
/* loaded from: classes14.dex */
public final class C4885xba8ec8dd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {
    final /* synthetic */ android.view.View $v;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.ViewOnLayoutChangeListenerC4884xa787582d f21111xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4885xba8ec8dd(android.view.View view, com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.ViewOnLayoutChangeListenerC4884xa787582d viewOnLayoutChangeListenerC4884xa787582d) {
        super(0);
        this.$v = view;
        this.f21111xcbdd23aa = viewOnLayoutChangeListenerC4884xa787582d;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo152xb9724478() {
        m42560xb9724478();
        return jz5.f0.f384359a;
    }

    /* renamed from: invoke */
    public final void m42560xb9724478() {
        if (!com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42837xea442e8a()) {
            this.$v.removeOnLayoutChangeListener(this.f21111xcbdd23aa);
        }
        if (this.$v.getVisibility() != 8 && this.$v.getVisibility() != 4 && this.$v.isShown()) {
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.INSTANCE.m42554xa7687c07(this.$v);
            return;
        }
        com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 m42517xe172022e = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58.f21085x4fbc8495.m42517xe172022e(this.$v);
        if (m42517xe172022e != null) {
            m42517xe172022e.m42396xaf0594a2(null);
        }
    }
}
