package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class t8 implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f289614a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f289615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f289616c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 f289617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f289618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f289619f;

    public t8(yz5.l lVar, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8, boolean z17, boolean z18) {
        this.f289616c = lVar;
        this.f289617d = activityC22359x66709fa8;
        this.f289618e = z17;
        this.f289619f = z18;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        j41.u uVar = i0Var != null ? i0Var.f379176d : null;
        this.f289616c.mo146xb9724478(uVar);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = uVar != null ? java.lang.Boolean.valueOf(((k41.g0) uVar).f385529p1) : null;
        objArr[1] = java.lang.Boolean.valueOf(this.f289614a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "startKefuChatting getContact %s, isCancelled: %b", objArr);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f289615b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        boolean z17 = this.f289614a;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = this.f289617d;
        if (!z17) {
            if (uVar != null && ((k41.g0) uVar).f385529p1) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("finish_direct", true);
                activityC22359x66709fa8.mo80492x5d4f20c8(((k41.g0) uVar).f68613xdec927b, bundle, this.f289618e, this.f289619f);
                return;
            }
        }
        if (!(i0Var != null && i0Var.f379174b == -3601)) {
            db5.t7.m123883x26a183b(activityC22359x66709fa8, activityC22359x66709fa8.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hez), 0).show();
            return;
        }
        java.lang.String string = activityC22359x66709fa8.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hex);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = activityC22359x66709fa8.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        db5.e1.y(activityC22359x66709fa8, "", string, string2, null);
    }

    @Override // j41.w
    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "startKefuChatting try fetch contact, show loading");
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = this.f289617d;
        this.f289615b = db5.e1.Q(activityC22359x66709fa8, "", activityC22359x66709fa8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.s8(this));
    }
}
