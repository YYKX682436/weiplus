package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class q4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f149176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f149177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f149178f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(java.lang.String[] strArr, java.lang.Throwable th6, java.util.Map map) {
        super(1);
        this.f149176d = strArr;
        this.f149177e = th6;
        this.f149178f = map;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        dr0.u0 reportStage = (dr0.u0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportStage, "$this$reportStage");
        java.lang.String[] strArr = this.f149176d;
        reportStage.f324091a = kz5.z.n0(strArr, e06.p.m(1, strArr.length));
        reportStage.f324092b = this.f149177e;
        java.util.Map map = this.f149178f;
        if (map != null) {
            reportStage.f324093c = map;
        }
        return jz5.f0.f384359a;
    }
}
