package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ef extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f184785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f184786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f184787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f184788g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184789h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f184790i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184791m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar, long j17, in5.s0 s0Var, java.lang.Integer num, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f184786e = abstractC14490x69736cb5;
        this.f184787f = zfVar;
        this.f184788g = j17;
        this.f184789h = s0Var;
        this.f184790i = num;
        this.f184791m = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ef(this.f184786e, this.f184787f, this.f184788g, this.f184789h, this.f184790i, this.f184791m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ef) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f184785d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = this.f184787f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f184786e;
            so2.h1 h1Var = abstractC14490x69736cb5 instanceof so2.h1 ? (so2.h1) abstractC14490x69736cb5 : null;
            if (h1Var != null && h1Var.f491913g) {
                return f0Var;
            }
            this.f184785d = 1;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.O1(zfVar, this.f184788g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.D1;
        zfVar.getClass();
        in5.s0 s0Var = this.f184789h;
        if (s0Var != null) {
            java.lang.Integer num = this.f184790i;
            android.content.Context context = s0Var.f374654e;
            if (num != null && num.intValue() == 2) {
                str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcj);
            } else {
                str = this.f184791m;
                if (str == null || str.length() == 0) {
                    str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcj);
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "handleLiveStatusToast, wording: ".concat(str));
            db5.t7.m(context, str);
        }
        return f0Var;
    }
}
