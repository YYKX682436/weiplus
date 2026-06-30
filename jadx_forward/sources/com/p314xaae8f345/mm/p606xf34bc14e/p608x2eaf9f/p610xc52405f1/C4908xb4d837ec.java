package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.ContentDescProvider$getContentDesc$3 */
/* loaded from: classes.dex */
public final class C4908xb4d837ec extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $content */
    final /* synthetic */ java.lang.Object f21175xd46183d5;

    /* renamed from: $contentDesc */
    final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f21176xfdc20406;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4908xb4d837ec(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.Object obj) {
        super(1);
        this.f21176xfdc20406 = h0Var;
        this.f21175xd46183d5 = obj;
    }

    @Override // yz5.l
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo146xb9724478(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f21176xfdc20406;
        java.lang.String str = it.m42268xfa374f7a().get(this.f21175xd46183d5);
        if (str == null) {
            return java.lang.Boolean.FALSE;
        }
        h0Var.f391656d = str;
        return java.lang.Boolean.TRUE;
    }
}
