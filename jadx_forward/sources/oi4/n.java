package oi4;

/* loaded from: classes8.dex */
public abstract class n extends in5.r implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f427178e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f427179f;

    public abstract void n(java.lang.String str, mj4.h hVar, java.lang.String str2);

    public final void o(android.content.Context context) {
        if (context != null) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18671x7236daa1.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/convert/like/ShowStatusHistoryItemConvert", "goToStatusExpiredTipsPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/textstatus/convert/like/ShowStatusHistoryItemConvert", "goToStatusExpiredTipsPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        pj4.g1 g1Var;
        gm0.j1.d().q(4245, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.ShowStatusHistory", "onSceneEnd() called with: errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str + ", scene = " + m1Var);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f427178e;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.f427178e = null;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jwt));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f427178e;
        if (u3Var2 != null) {
            u3Var2.dismiss();
        }
        this.f427178e = null;
        ej4.f fVar = m1Var instanceof ej4.f ? (ej4.f) m1Var : null;
        if (fVar == null || (g1Var = fVar.f334886f) == null) {
            return;
        }
        java.util.LinkedList linkedList = g1Var.f436592d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.ShowStatusHistory", "onSceneEnd: histories isNullOrNil");
            o(this.f427179f);
            return;
        }
        pj4.n1 n1Var = (pj4.n1) linkedList.get(0);
        mj4.h a17 = n1Var != null ? fj4.b.a(n1Var) : null;
        if (a17 == null) {
            o(this.f427179f);
            return;
        }
        java.lang.String a18 = en1.a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "username(...)");
        n(a18, a17, fVar.f334889i);
    }

    public final void p(android.content.Context context, java.lang.String statusId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        ej4.f fVar = new ej4.f(null, 4L, 0L, 1L, null, 16, null);
        fVar.f334889i = str;
        pj4.f1 f1Var = fVar.f334888h;
        if (f1Var != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(statusId);
            f1Var.f436576h = linkedList;
        }
        java.util.Objects.toString(f1Var != null ? f1Var.f436576h : null);
        gm0.j1.d().a(4245, this);
        gm0.j1.d().g(fVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f427178e;
        if (u3Var != null) {
            if (!(!u3Var.isShowing())) {
                return;
            }
        }
        this.f427178e = db5.e1.P(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), 3, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), false, true, new oi4.m(fVar, this));
    }
}
