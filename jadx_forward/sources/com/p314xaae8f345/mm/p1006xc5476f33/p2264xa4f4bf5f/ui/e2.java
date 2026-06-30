package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f255356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 f255357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255358f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var, java.lang.String str) {
        super(0);
        this.f255356d = activity;
        this.f255357e = j2Var;
        this.f255358f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final android.app.Activity activity = this.f255356d;
        if (activity == null || activity.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "onClickSetStatusButton: host activity invalid, skip jump");
        } else {
            bi4.d1 d1Var = new bi4.d1();
            d1Var.f436474h = ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Bi();
            final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var = this.f255357e;
            d1Var.f436475i = j2Var.f255529f.f102584c;
            final android.os.Handler handler = j2Var.f255532i;
            bi4.o1.f102608a.a(activity, d1Var, new android.os.ResultReceiver(handler) { // from class: com.tencent.mm.plugin.textstatus.ui.MultipleTextStatusCardDialog$onClickSetStatusButton$1$resultReceiver$1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i17, android.os.Bundle bundle) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "onReceiveResult: code=" + i17);
                    if (i17 == -1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2.this;
                        j2Var2.f255532i.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i2(activity, j2Var2));
                    }
                }
            });
            bi4.h1 h1Var = j2Var.f255529f;
            java.lang.String str = h1Var.f102582a;
            long j17 = h1Var.f102584c;
            java.lang.String str2 = d1Var.f436474h;
            java.lang.String str3 = this.f255358f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            qj4.s.f445491a.u(new qj4.l(str, true, j17, str3, str2, null, null, 32, null));
        }
        return jz5.f0.f384359a;
    }
}
