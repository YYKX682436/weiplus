package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes10.dex */
public final class dd extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285321f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        super(i17, i18);
        this.f285319d = str;
        this.f285320e = f9Var;
        this.f285321f = dVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View v17) {
        java.lang.String a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgRingtone$filling$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgRingtone", "[onClick] app msg enter to ringtone setting ui");
        java.lang.String str = this.f285319d;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f285320e;
        int i17 = 0;
        int i18 = 1;
        boolean z17 = f9Var.mo78013xfb85f7b0() == 85;
        mx3.b0 b0Var = mx3.b0.f414061a;
        if (!z17) {
            str = c01.z1.r();
        }
        mx3.b0 b0Var2 = mx3.b0.f414061a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        java.util.Set<java.lang.String> b17 = mx3.b0.b(b0Var2, str, z17, null, 4, null);
        if (b17 != null && (a17 = b0Var2.a(b17)) != null) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (java.lang.String str2 : b17) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, str2)) {
                    linkedHashSet.add(str2);
                }
            }
            mx3.x f17 = b0Var2.f(a17);
            f17.f414162c = true;
            cl0.g gVar = new cl0.g();
            gVar.h("ringtoneId", f17.f414160a);
            gVar.p("tick", f17.f414161b);
            gVar.r("linkToSetting", f17.f414162c);
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            linkedHashSet.add(gVar2);
            b0Var2.h(str, z17, linkedHashSet);
        }
        int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
        if (mo78013xfb85f7b0 == 85) {
            i17 = 2;
        } else if (mo78013xfb85f7b0 == 86) {
            i17 = 3;
            i18 = 2;
        }
        java.lang.String j17 = f9Var.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
        wx3.a.f(i18, 2, j17, "", "");
        mx3.s sVar = mx3.u.f414153f;
        android.app.Activity g17 = this.f285321f.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        sVar.b(g17, i17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgRingtone$filling$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
