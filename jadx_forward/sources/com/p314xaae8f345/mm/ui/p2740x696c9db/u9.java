package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public class u9 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 f292351b;

    public u9(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18, java.lang.String str) {
        this.f292351b = activityC22523xb066d18;
        this.f292350a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            final com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1(this.f292350a));
            r45.kf4 kf4Var = (r45.kf4) fVar.f152151d;
            c11286x34a5504.f33130x6942258 = kf4Var.f460186d;
            c11286x34a5504.f33121x993583fc = kf4Var.f460188f;
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(((r45.kf4) fVar.f152151d).f460187e, new k70.f0() { // from class: com.tencent.mm.ui.tools.u9$$a
                @Override // k70.f0
                public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
                    com.p314xaae8f345.mm.ui.p2740x696c9db.u9 u9Var = com.p314xaae8f345.mm.ui.p2740x696c9db.u9.this;
                    u9Var.getClass();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2740x696c9db.v9(u9Var, c11286x34a5504, bitmap));
                }
            });
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "Parse Url success title: " + c11286x34a5504.f33130x6942258 + " description: " + c11286x34a5504.f33121x993583fc + " imageUrl: " + ((r45.kf4) fVar.f152151d).f460187e);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "Parse Url fail errType: " + fVar.f152148a + " errCode: " + fVar.f152149b + " errMsg: " + fVar.f152150c);
            com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18 = this.f292351b;
            android.content.Intent intent = activityC22523xb066d18.getIntent();
            int i17 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.f291684w;
            activityC22523xb066d18.f7(intent);
        }
        return fVar;
    }
}
