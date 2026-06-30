package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes.dex */
public final class vo extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az2.f f192209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14120xff3e46a f192210g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(java.lang.String str, java.lang.String str2, az2.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14120xff3e46a activityC14120xff3e46a) {
        super(1);
        this.f192207d = str;
        this.f192208e = str2;
        this.f192209f = fVar;
        this.f192210g = activityC14120xff3e46a;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appid: ");
        sb6.append(this.f192207d);
        sb6.append(", openId: ");
        sb6.append(this.f192208e);
        sb6.append(", errType: ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        sb6.append(", errCode: ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
        sb6.append(", errMsg: ");
        sb6.append(fVar != null ? fVar.f152150c : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGameBind", sb6.toString());
        this.f192209f.b();
        java.lang.String str = fVar != null ? fVar.f152150c : null;
        boolean z17 = str == null || str.length() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14120xff3e46a activityC14120xff3e46a = this.f192210g;
        if (!z17) {
            db5.t7.m(activityC14120xff3e46a.mo55332x76847179(), str);
        }
        activityC14120xff3e46a.finish();
        activityC14120xff3e46a.c7(-1, fVar != null ? fVar.f152150c : null);
        return jz5.f0.f384359a;
    }
}
