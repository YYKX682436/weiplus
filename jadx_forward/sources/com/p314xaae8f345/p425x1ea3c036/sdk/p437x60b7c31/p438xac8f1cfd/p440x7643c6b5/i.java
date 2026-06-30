package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public class i implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f128974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f128975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f128976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f128977g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f128978h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128979i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f f128980m;

    public i(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f fVar, int i17, java.lang.String str, java.lang.String str2, boolean z17, long j17, int i18) {
        this.f128980m = fVar;
        this.f128974d = i17;
        this.f128975e = str;
        this.f128976f = str2;
        this.f128977g = z17;
        this.f128978h = j17;
        this.f128979i = i18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.v0
    public void l(java.lang.String str, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n[] nVarArr, boolean[] zArr, java.lang.Object[] objArr, long j17, long j18) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f fVar = this.f128980m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadJsFileWithOptions appId[%s] contextId[%d] paths[%s] options[%s] results[%s]", fVar.f128939d.mo48798x74292566(), java.lang.Integer.valueOf(this.f128974d), this.f128975e, this.f128976f, java.util.Arrays.toString(zArr));
        if (this.f128977g) {
            long j19 = this.f128978h;
            if (j19 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadJsFileWithOptions, appId[%s] initialScript[%s] inject done, cost[%d]ms", fVar.f128939d.mo48798x74292566(), str, java.lang.Long.valueOf(j18 - j19));
                this.f128980m.c(str, this.f128977g, nVarArr, zArr, objArr, j17, j18);
                sj1.l.h(fVar.f128939d.mo50260x9f1221c2() + "", this.f128979i);
            }
        }
        this.f128980m.c(str, this.f128977g, nVarArr, zArr, objArr, j17, j18);
        sj1.l.h(fVar.f128939d.mo50260x9f1221c2() + "", this.f128979i);
    }
}
