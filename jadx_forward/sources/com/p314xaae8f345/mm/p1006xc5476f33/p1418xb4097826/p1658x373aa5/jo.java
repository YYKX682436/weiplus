package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class jo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f213990f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f213991g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f213992h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213993i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f213994m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f213995n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f213996o;

    public jo(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, int i27, int i28, yz5.l lVar) {
        this.f213988d = str;
        this.f213989e = str2;
        this.f213990f = i17;
        this.f213991g = i18;
        this.f213992h = i19;
        this.f213993i = str3;
        this.f213994m = i27;
        this.f213995n = i28;
        this.f213996o = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderHeartLikePermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        h73.e.d(bundle, "Username", this.f213988d);
        java.lang.String str = this.f213989e;
        if (str == null) {
            str = "";
        }
        h73.e.d(bundle, "WxUserName", str);
        h73.e.c(bundle, "isShieldHisLike", this.f213990f);
        h73.e.c(bundle, "isShieldMyLike", this.f213991g);
        h73.e.c(bundle, "FromScene_WXPROFILE", this.f213992h);
        java.lang.String sessionId = this.f213993i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sessionId, "$sessionId");
        h73.e.d(bundle, "SessionId", sessionId);
        h73.e.c(bundle, "isNotRec", this.f213994m);
        h73.e.c(bundle, "isBlackList", this.f213995n);
        android.content.Intent intent = new android.content.Intent();
        intent.replaceExtras(bundle);
        yz5.l lVar = this.f213996o;
        if (lVar != null) {
            lVar.mo146xb9724478(intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderHeartLikePermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
