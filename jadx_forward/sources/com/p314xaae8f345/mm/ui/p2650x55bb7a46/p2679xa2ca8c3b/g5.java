package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes10.dex */
public final class g5 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f285548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vx3.i f285550f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(int i17, int i18, android.app.Activity activity, java.lang.String str, vx3.i iVar) {
        super(i17, i18);
        this.f285548d = activity;
        this.f285549e = str;
        this.f285550f = iVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgCalleeRingtoneHint$filling$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgRingtone", "[onClick] app msg enter to finder feed");
        mx3.s sVar = mx3.u.f414153f;
        android.app.Activity context = this.f285548d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        java.lang.String str = this.f285549e;
        mx3.s.a(sVar, context, 1, str == null ? "" : str, 6, false, this.f285550f, 16, null);
        if (str == null) {
            str = "";
        }
        java.lang.String r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(this.f285550f.f522831o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r07, "getUnsignedLongString(...)");
        wx3.a.f(3, 2, "", str, r07);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgCalleeRingtoneHint$filling$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
