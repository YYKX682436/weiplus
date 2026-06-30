package zi4;

/* loaded from: classes11.dex */
public final class u0 extends zi4.a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f554799g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
    }

    @Override // zi4.a
    public void a(byte[] bArr, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        bw5.ob obVar = new bw5.ob();
        obVar.mo11468x92b714fd(bArr);
        pm0.v.X(new zi4.s0(this, obVar));
    }

    public final void b(java.lang.String str, mj4.h hVar, java.lang.String str2) {
        android.content.Context context;
        jz5.f0 f0Var;
        android.content.Context context2;
        java.lang.ref.WeakReference weakReference = this.f554714e;
        if (str2 != null) {
            if (weakReference == null || (context2 = (android.content.Context) weakReference.get()) == null) {
                f0Var = null;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255226f.a(context2, str, hVar, str2);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var != null) {
                return;
            }
        }
        if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255226f.b(context, str, hVar);
    }

    public final void c() {
        java.lang.ref.WeakReference weakReference = this.f554714e;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        if (context != null) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18671x7236daa1.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/flutter/action/FLTStatusMessagePageOpenCardListPageHandler", "goToStatusExpiredTipsPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/textstatus/flutter/action/FLTStatusMessagePageOpenCardListPageHandler", "goToStatusExpiredTipsPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        pj4.g1 g1Var;
        gm0.j1.d().q(4245, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusMessagePageOpenCardListPageHandler", "onSceneEnd() called with: errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str + ", scene = " + m1Var);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f554799g;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.f554799g = null;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jwt));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f554799g;
        if (u3Var2 != null) {
            u3Var2.dismiss();
        }
        this.f554799g = null;
        ej4.f fVar = m1Var instanceof ej4.f ? (ej4.f) m1Var : null;
        if (fVar == null || (g1Var = fVar.f334886f) == null) {
            return;
        }
        java.util.LinkedList linkedList = g1Var.f436592d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.m(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jwt));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FLTStatusMessagePageOpenCardListPageHandler", "onSceneEnd: histories isNullOrNil");
            return;
        }
        pj4.n1 n1Var = (pj4.n1) linkedList.get(0);
        mj4.h a17 = n1Var != null ? fj4.b.a(n1Var) : null;
        if (a17 == null) {
            c();
            return;
        }
        java.lang.String a18 = en1.a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "username(...)");
        b(a18, a17, fVar.f334889i);
    }
}
