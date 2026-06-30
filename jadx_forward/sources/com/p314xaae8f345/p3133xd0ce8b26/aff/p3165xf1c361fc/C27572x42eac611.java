package com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc;

/* renamed from: com.tencent.wechat.aff.websearch.WebSearchManager */
/* loaded from: classes16.dex */
public class C27572x42eac611 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27572x42eac611 f60557x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27572x42eac611();

    /* renamed from: jniCaller */
    com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27576xe2cb5ab9 f60558x3163df90 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27576xe2cb5ab9();

    /* renamed from: com.tencent.wechat.aff.websearch.WebSearchManager$NetSceneMMSearchReportCallback */
    /* loaded from: classes16.dex */
    public interface NetSceneMMSearchReportCallback {
        /* renamed from: complete */
        void m117720xdc453139(bw5.ui0 ui0Var);
    }

    /* renamed from: com.tencent.wechat.aff.websearch.WebSearchManager$NetSceneMMWebQueryCallback */
    /* loaded from: classes16.dex */
    public interface NetSceneMMWebQueryCallback {
        /* renamed from: complete */
        void m117721xdc453139(bw5.fj0 fj0Var);
    }

    /* renamed from: com.tencent.wechat.aff.websearch.WebSearchManager$NetSceneMMWebSearchCallback */
    /* loaded from: classes10.dex */
    public interface NetSceneMMWebSearchCallback {
        /* renamed from: complete */
        void mo117722xdc453139(bw5.gs0 gs0Var);
    }

    /* renamed from: com.tencent.wechat.aff.websearch.WebSearchManager$NetSceneMMWebSuggestCallback */
    /* loaded from: classes10.dex */
    public interface NetSceneMMWebSuggestCallback {
        /* renamed from: complete */
        void m117723xdc453139(bw5.gs0 gs0Var);
    }

    private C27572x42eac611() {
        this.f60636x11bb50fe = "websearch.WebSearchManager@Get";
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("iam_feat_websearch", "aff_biz");
        this.f60558x3163df90.m117759xe2cb5ab1(this, this.f60636x11bb50fe, this.f60638xc2e4ffd6);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27572x42eac611 m117711xa74f78c3(java.lang.String str, java.lang.String str2, long j17) {
        return m117712x9cf0d20b();
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27572x42eac611 m117712x9cf0d20b() {
        return f60557x21169495;
    }

    /* renamed from: init */
    public boolean m117713x316510() {
        return this.f60558x3163df90.m117752x9db8edf9(this.f60634xf042a733);
    }

    /* renamed from: netSceneMMSearchReportAsync */
    public void m117714xf9095bd1(bw5.ti0 ti0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 c27571x8e5b7840, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27572x42eac611.NetSceneMMSearchReportCallback netSceneMMSearchReportCallback) {
        this.f60558x3163df90.m117756x1964d1f9(this.f60634xf042a733, netSceneMMSearchReportCallback, ti0Var.m75963xebb06ba0(), c27571x8e5b7840.m75963xebb06ba0());
    }

    /* renamed from: netSceneMMWebQueryAsync */
    public void m117715xf9d9ba79(bw5.ej0 ej0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 c27571x8e5b7840, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27572x42eac611.NetSceneMMWebQueryCallback netSceneMMWebQueryCallback) {
        this.f60558x3163df90.m117755x1964d1da(this.f60634xf042a733, netSceneMMWebQueryCallback, ej0Var.m75963xebb06ba0(), c27571x8e5b7840.m75963xebb06ba0());
    }

    /* renamed from: netSceneMMWebSearchAsync */
    public void m117716x897eee6f(bw5.fs0 fs0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 c27571x8e5b7840, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27572x42eac611.NetSceneMMWebSearchCallback netSceneMMWebSearchCallback) {
        this.f60558x3163df90.m117753x1964d19c(this.f60634xf042a733, netSceneMMWebSearchCallback, fs0Var.m75963xebb06ba0(), c27571x8e5b7840.m75963xebb06ba0());
    }

    /* renamed from: netSceneMMWebSuggestAsync */
    public void m117717xb95cd3fd(bw5.fs0 fs0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 c27571x8e5b7840, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27572x42eac611.NetSceneMMWebSuggestCallback netSceneMMWebSuggestCallback) {
        this.f60558x3163df90.m117754x1964d1bb(this.f60634xf042a733, netSceneMMWebSuggestCallback, fs0Var.m75963xebb06ba0(), c27571x8e5b7840.m75963xebb06ba0());
    }

    /* renamed from: netSceneSearchGuideAsync */
    public void m117718xeadc23b7(bw5.pc0 pc0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 c27571x8e5b7840, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.a aVar) {
        this.f60558x3163df90.m117757x1964d218(this.f60634xf042a733, aVar, pc0Var.m75963xebb06ba0(), c27571x8e5b7840.m75963xebb06ba0());
    }

    /* renamed from: netSceneWebSearchConfigAsync */
    public void m117719xeb26582d(bw5.cs0 cs0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27571x8e5b7840 c27571x8e5b7840, com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.b bVar) {
        this.f60558x3163df90.m117758x1964d237(this.f60634xf042a733, bVar, cs0Var.m75963xebb06ba0(), c27571x8e5b7840.m75963xebb06ba0());
    }
}
