package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.e2 f81706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81709g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81710h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81711i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81712m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81713n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81714o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81715p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81716q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81717r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81718s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81719t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81720u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81721v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.appbrand.jsapi.media.e2 e2Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4, java.util.ArrayList arrayList5, java.util.ArrayList arrayList6, java.util.ArrayList arrayList7, java.util.ArrayList arrayList8, java.util.ArrayList arrayList9, java.util.ArrayList arrayList10, java.util.ArrayList arrayList11, java.util.ArrayList arrayList12, java.util.ArrayList arrayList13, java.util.ArrayList arrayList14, java.util.ArrayList arrayList15) {
        super(0);
        this.f81706d = e2Var;
        this.f81707e = arrayList;
        this.f81708f = arrayList2;
        this.f81709g = arrayList3;
        this.f81710h = arrayList4;
        this.f81711i = arrayList5;
        this.f81712m = arrayList6;
        this.f81713n = arrayList7;
        this.f81714o = arrayList8;
        this.f81715p = arrayList9;
        this.f81716q = arrayList10;
        this.f81717r = arrayList11;
        this.f81718s = arrayList12;
        this.f81719t = arrayList13;
        this.f81720u = arrayList14;
        this.f81721v = arrayList15;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.jsapi.media.JSApiBizChooseImage$ChooseResult jSApiBizChooseImage$ChooseResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.JSApiBizChooseImage$ChooseResult jSApiBizChooseImage$ChooseResult2;
        com.tencent.mm.plugin.appbrand.jsapi.media.JSApiBizChooseImage$ChooseTaskRequest jSApiBizChooseImage$ChooseTaskRequest;
        com.tencent.mm.plugin.appbrand.jsapi.media.e2 e2Var;
        com.tencent.mm.plugin.appbrand.jsapi.media.JSApiBizChooseImage$ChooseResult jSApiBizChooseImage$ChooseResult3;
        java.lang.String o17;
        com.tencent.mm.plugin.appbrand.jsapi.media.JSApiBizChooseImage$ChooseResult jSApiBizChooseImage$ChooseResult4;
        com.tencent.mm.plugin.appbrand.jsapi.media.JSApiBizChooseImage$ChooseResult jSApiBizChooseImage$ChooseResult5;
        java.lang.String n17;
        com.tencent.mm.plugin.appbrand.jsapi.media.e2 e2Var2 = this.f81706d;
        jSApiBizChooseImage$ChooseResult = e2Var2.mResult;
        jSApiBizChooseImage$ChooseResult.f81618d = -1;
        jSApiBizChooseImage$ChooseResult2 = e2Var2.mResult;
        jSApiBizChooseImage$ChooseResult2.f81619e = "image";
        jSApiBizChooseImage$ChooseTaskRequest = e2Var2.mRequest;
        if (jSApiBizChooseImage$ChooseTaskRequest == null) {
            kotlin.jvm.internal.o.o("mRequest");
            throw null;
        }
        if (jSApiBizChooseImage$ChooseTaskRequest.getSupportLivePhoto()) {
            jSApiBizChooseImage$ChooseResult5 = e2Var2.mResult;
            e2Var = e2Var2;
            n17 = this.f81706d.n(this.f81707e, this.f81708f, this.f81709g, this.f81710h, this.f81711i, this.f81712m, this.f81713n, this.f81714o, this.f81715p, this.f81716q, this.f81717r, this.f81718s, this.f81719t, this.f81720u, this.f81721v);
            jSApiBizChooseImage$ChooseResult5.f81620f = n17;
        } else {
            e2Var = e2Var2;
            jSApiBizChooseImage$ChooseResult3 = e2Var.mResult;
            o17 = this.f81706d.o(this.f81707e, this.f81708f, this.f81709g, this.f81714o, this.f81715p, this.f81716q, this.f81717r, this.f81718s, this.f81719t, this.f81720u, this.f81721v);
            jSApiBizChooseImage$ChooseResult3.f81620f = o17;
        }
        jSApiBizChooseImage$ChooseResult4 = e2Var.mResult;
        e2Var.finishProcess(jSApiBizChooseImage$ChooseResult4);
        return jz5.f0.f302826a;
    }
}
