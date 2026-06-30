package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes.dex */
public final class x8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 f281756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var) {
        super(0);
        this.f281756d = y8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View x07 = this.f281756d.x0();
        if (x07 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(x07, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$updateNewTextGuide$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            x07.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(x07, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$updateNewTextGuide$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
