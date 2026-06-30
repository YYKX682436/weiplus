package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class i5 implements com.tencent.mm.mj_template.sns.compose.widget.z4 {
    @Override // com.tencent.mm.mj_template.sns.compose.widget.z4
    public com.tencent.mm.mj_template.sns.compose.widget.k5 a(com.tencent.maas.model.MJTemplateInfo mjTemplateInfo) {
        kotlin.jvm.internal.o.g(mjTemplateInfo, "mjTemplateInfo");
        java.nio.ByteBuffer sessionBuffer = mjTemplateInfo.getSessionBuffer();
        com.tencent.mm.protobuf.g b17 = sessionBuffer != null ? com.tencent.mm.protobuf.g.b(sessionBuffer.array()) : null;
        com.tencent.mm.mj_template.sns.compose.widget.j5 j5Var = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m;
        java.lang.String templateID = mjTemplateInfo.getTemplateID();
        kotlin.jvm.internal.o.f(templateID, "getTemplateID(...)");
        java.lang.String displayName = mjTemplateInfo.getDisplayName();
        kotlin.jvm.internal.o.f(displayName, "getDisplayName(...)");
        java.lang.String thumbnailURL = mjTemplateInfo.getThumbnailURL();
        kotlin.jvm.internal.o.f(thumbnailURL, "getThumbnailURL(...)");
        return new com.tencent.mm.mj_template.sns.compose.widget.k5(templateID, displayName, thumbnailURL, mjTemplateInfo.getMinimumiOSSDKVersion(), mjTemplateInfo.getMinimumAndroidSDKVersion(), b17, null, mjTemplateInfo.getAIModelType(), null, com.tencent.mapsdk.internal.km.f50100e, null);
    }
}
