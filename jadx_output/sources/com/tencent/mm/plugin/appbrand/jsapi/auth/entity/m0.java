package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class m0 implements com.tencent.mm.plugin.appbrand.jsapi.auth.entity.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f79519a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo f79520b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f79521c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n f79522d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f79523e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f79524f;

    /* renamed from: g, reason: collision with root package name */
    public final int f79525g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l f79526h;

    /* renamed from: i, reason: collision with root package name */
    public rl5.r f79527i;

    public m0(android.content.Context context, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo mUserAvatarInfo, java.lang.String scope, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n mListener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(mUserAvatarInfo, "mUserAvatarInfo");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(mListener, "mListener");
        this.f79519a = context;
        this.f79520b = mUserAvatarInfo;
        this.f79521c = scope;
        this.f79522d = mListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f79523e = arrayList;
        this.f79524f = new java.util.concurrent.atomic.AtomicInteger(mUserAvatarInfo.f79467g);
        this.f79525g = cf.b.a(this);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = mUserAvatarInfo.f79464d;
        int size = arrayList3.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = arrayList3.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo.MMUserAvatarItem mMUserAvatarItem = (com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo.MMUserAvatarItem) obj;
            java.lang.String str = mMUserAvatarItem.f79476e;
            java.lang.String str2 = mMUserAvatarItem.f79478g;
            int i18 = mMUserAvatarItem.f79475d;
            arrayList2.add(new fl1.h1(0, str, str2, scope, mUserAvatarInfo.f79467g == i18, mMUserAvatarItem.f79477f, i18));
        }
        arrayList.addAll(arrayList2);
        e(this.f79523e);
        this.f79522d.a(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m.f79514e);
    }

    public static final void c(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var, android.content.Intent intent) {
        m0Var.getClass();
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra(dm.i4.COL_ID, -1);
        java.lang.String stringExtra = intent.getStringExtra("nickname");
        java.lang.String stringExtra2 = intent.getStringExtra("avatarurl");
        java.util.ArrayList arrayList = m0Var.f79523e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fl1.h1) it.next()).f263784f = false;
        }
        java.lang.String str = m0Var.f79521c;
        kotlin.jvm.internal.o.d(stringExtra2);
        arrayList.add(new fl1.h1(0, stringExtra, "", str, null, true, stringExtra2, intExtra));
        m0Var.f79522d.a(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m.f79516g);
        m0Var.e(arrayList);
        com.tencent.mars.xlog.Log.i("WxaUserInfoListOperationController", "mmOnActivityResult nickname=" + stringExtra + " avatarurl=" + stringExtra2);
    }

    public static final void d(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var, int i17, android.content.Intent intent) {
        m0Var.getClass();
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra(dm.i4.COL_ID, -1);
        java.lang.String stringExtra = intent.getStringExtra("nickname");
        java.lang.String stringExtra2 = intent.getStringExtra("avatarurl");
        kotlin.jvm.internal.o.d(stringExtra2);
        java.lang.String stringExtra3 = intent.getStringExtra("desc");
        if (intExtra == -1) {
            return;
        }
        java.util.ArrayList arrayList = m0Var.f79523e;
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        fl1.h1 h1Var = (fl1.h1) obj;
        h1Var.f263780b = stringExtra;
        h1Var.f263785g = stringExtra2;
        h1Var.f263781c = stringExtra3;
        m0Var.e(arrayList);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.p
    public void a(fl1.h1 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f79524f.set(item.f263786h);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.p
    public void b(android.view.View view, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(view, "view");
        rl5.r rVar = new rl5.r(view.getContext());
        this.f79527i = rVar;
        if (i17 == 0) {
            return;
        }
        rVar.g(view, i17, 0L, new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.k0(view), new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l0(this, i17), i18, i19);
    }

    public final void e(java.util.ArrayList arrayList) {
        this.f79522d.b(arrayList);
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n nVar = this.f79522d;
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo mMUserAvatarInfo = this.f79520b;
        boolean z17 = mMUserAvatarInfo.f79465e;
        boolean z18 = mMUserAvatarInfo.f79466f <= arrayList.size();
        java.lang.String str = mMUserAvatarInfo.f79471n;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = mMUserAvatarInfo.f79470m;
        nVar.c(z17, z18, str, str2 == null ? "" : str2, new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.j0(this));
    }
}
