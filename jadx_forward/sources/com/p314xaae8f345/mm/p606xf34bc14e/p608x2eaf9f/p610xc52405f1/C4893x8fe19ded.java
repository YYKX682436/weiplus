package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.provider.AccProviderFactory$dispatchOnTouchEvent$1 */
/* loaded from: classes14.dex */
public final class C4893x8fe19ded extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: $event */
    final /* synthetic */ android.view.MotionEvent f21135x4334e8f6;

    /* renamed from: $view */
    final /* synthetic */ android.view.View f21136x23288c9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4893x8fe19ded(android.view.View view, android.view.MotionEvent motionEvent) {
        super(0);
        this.f21136x23288c9 = view;
        this.f21135x4334e8f6 = motionEvent;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo152xb9724478() {
        m42587xb9724478();
        return jz5.f0.f384359a;
    }

    /* renamed from: invoke */
    public final void m42587xb9724478() {
        java.util.List<com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11> list;
        list = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4888x58122b38.providers;
        android.view.View view = this.f21136x23288c9;
        android.view.MotionEvent motionEvent = this.f21135x4334e8f6;
        for (com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11 abstractC4922xc8fe6a11 : list) {
            if ((abstractC4922xc8fe6a11.mo9976x5761788d() & 16) == 16) {
                abstractC4922xc8fe6a11.mo9975x3525c066(view, motionEvent);
            }
        }
    }
}
