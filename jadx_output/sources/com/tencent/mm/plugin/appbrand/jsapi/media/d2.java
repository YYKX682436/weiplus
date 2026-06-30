package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.e2 f81758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.plugin.appbrand.jsapi.media.e2 e2Var) {
        super(1);
        this.f81758d = e2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.media.JSApiBizChooseImage$ChooseResult jSApiBizChooseImage$ChooseResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.JSApiBizChooseImage$ChooseResult jSApiBizChooseImage$ChooseResult2;
        com.tencent.pigeon.biz.BizImageSelectInfo imageInfo = (com.tencent.pigeon.biz.BizImageSelectInfo) obj;
        kotlin.jvm.internal.o.g(imageInfo, "imageInfo");
        java.util.List<com.tencent.pigeon.biz.BizSelectPhotoInfo> imgList = imageInfo.getImgList();
        if (imgList == null) {
            imgList = kz5.p0.f313996d;
        }
        boolean isEmpty = imgList.isEmpty();
        com.tencent.mm.plugin.appbrand.jsapi.media.e2 e2Var = this.f81758d;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JSApiBizChooseImage", "imgInfoList is null");
            jSApiBizChooseImage$ChooseResult = e2Var.mResult;
            jSApiBizChooseImage$ChooseResult.f81618d = -3;
            jSApiBizChooseImage$ChooseResult2 = e2Var.mResult;
            e2Var.finishProcess(jSApiBizChooseImage$ChooseResult2);
        } else {
            pm0.v.K(null, new com.tencent.mm.plugin.appbrand.jsapi.media.c2(imgList.size(), imgList, e2Var));
        }
        return jz5.f0.f302826a;
    }
}
