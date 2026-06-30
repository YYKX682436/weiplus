package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3;

/* loaded from: classes7.dex */
public final class m0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f161052a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12007xb9118992 f161053b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f161054c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n f161055d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f161056e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f161057f;

    /* renamed from: g, reason: collision with root package name */
    public final int f161058g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.l f161059h;

    /* renamed from: i, reason: collision with root package name */
    public rl5.r f161060i;

    public m0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12007xb9118992 mUserAvatarInfo, java.lang.String scope, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n mListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mUserAvatarInfo, "mUserAvatarInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mListener, "mListener");
        this.f161052a = context;
        this.f161053b = mUserAvatarInfo;
        this.f161054c = scope;
        this.f161055d = mListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f161056e = arrayList;
        this.f161057f = new java.util.concurrent.atomic.AtomicInteger(mUserAvatarInfo.f161000g);
        this.f161058g = cf.b.a(this);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = mUserAvatarInfo.f160997d;
        int size = arrayList3.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = arrayList3.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12007xb9118992.MMUserAvatarItem mMUserAvatarItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12007xb9118992.MMUserAvatarItem) obj;
            java.lang.String str = mMUserAvatarItem.f161009e;
            java.lang.String str2 = mMUserAvatarItem.f161011g;
            int i18 = mMUserAvatarItem.f161008d;
            arrayList2.add(new fl1.h1(0, str, str2, scope, mUserAvatarInfo.f161000g == i18, mMUserAvatarItem.f161010f, i18));
        }
        arrayList.addAll(arrayList2);
        e(this.f161056e);
        this.f161055d.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m.f161047e);
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 m0Var, android.content.Intent intent) {
        m0Var.getClass();
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra(dm.i4.f66865x76d1ec5a, -1);
        java.lang.String stringExtra = intent.getStringExtra("nickname");
        java.lang.String stringExtra2 = intent.getStringExtra("avatarurl");
        java.util.ArrayList arrayList = m0Var.f161056e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fl1.h1) it.next()).f345317f = false;
        }
        java.lang.String str = m0Var.f161054c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
        arrayList.add(new fl1.h1(0, stringExtra, "", str, null, true, stringExtra2, intExtra));
        m0Var.f161055d.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m.f161049g);
        m0Var.e(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaUserInfoListOperationController", "mmOnActivityResult nickname=" + stringExtra + " avatarurl=" + stringExtra2);
    }

    public static final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 m0Var, int i17, android.content.Intent intent) {
        m0Var.getClass();
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra(dm.i4.f66865x76d1ec5a, -1);
        java.lang.String stringExtra = intent.getStringExtra("nickname");
        java.lang.String stringExtra2 = intent.getStringExtra("avatarurl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
        java.lang.String stringExtra3 = intent.getStringExtra("desc");
        if (intExtra == -1) {
            return;
        }
        java.util.ArrayList arrayList = m0Var.f161056e;
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        fl1.h1 h1Var = (fl1.h1) obj;
        h1Var.f345313b = stringExtra;
        h1Var.f345318g = stringExtra2;
        h1Var.f345314c = stringExtra3;
        m0Var.e(arrayList);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.p
    public void a(fl1.h1 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f161057f.set(item.f345319h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.p
    public void b(android.view.View view, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        rl5.r rVar = new rl5.r(view.getContext());
        this.f161060i = rVar;
        if (i17 == 0) {
            return;
        }
        rVar.g(view, i17, 0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.k0(view), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.l0(this, i17), i18, i19);
    }

    public final void e(java.util.ArrayList arrayList) {
        this.f161055d.b(arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.n nVar = this.f161055d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12007xb9118992 c12007xb9118992 = this.f161053b;
        boolean z17 = c12007xb9118992.f160998e;
        boolean z18 = c12007xb9118992.f160999f <= arrayList.size();
        java.lang.String str = c12007xb9118992.f161004n;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = c12007xb9118992.f161003m;
        nVar.c(z17, z18, str, str2 == null ? "" : str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.j0(this));
    }
}
