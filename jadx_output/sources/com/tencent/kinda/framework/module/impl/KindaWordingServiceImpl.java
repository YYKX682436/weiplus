package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class KindaWordingServiceImpl implements com.tencent.kinda.gen.KWordingService {
    @Override // com.tencent.kinda.gen.KWordingService
    public com.tencent.kinda.gen.Wording getWording(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        java.lang.String str4 = "desc";
        com.tencent.kinda.gen.Wording wording = new com.tencent.kinda.gen.Wording(true, "entryTip", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "subTitle", "desc", "subDesc");
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (str.equals("valid_date")) {
            if (context != null) {
                str3 = context.getString(com.tencent.mm.R.string.khv);
                str4 = context.getString(com.tencent.mm.R.string.khw);
            }
            return new com.tencent.kinda.gen.Wording(true, "entryTip", str3, "subTitle", str4, "subDesc");
        }
        if (str.equals("cvv")) {
            if (context != null) {
                str3 = context.getString(com.tencent.mm.R.string.f491032bn0);
                str4 = context.getString(com.tencent.mm.R.string.bmy);
            }
            return new com.tencent.kinda.gen.Wording(true, "entryTip", str3, "subTitle", str4, "subDesc");
        }
        if (str.equals("phone_number") || str.equals("sms")) {
            return wording;
        }
        str.equals("person");
        return wording;
    }
}
