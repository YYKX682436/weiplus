package com.tencent.mm.modelsimple;

/* loaded from: classes12.dex */
public class f {
    public com.tencent.mm.modelsimple.BindWordingContent a(java.lang.String str) {
        java.lang.String text;
        java.lang.String str2 = "";
        com.tencent.mm.modelsimple.BindWordingContent bindWordingContent = new com.tencent.mm.modelsimple.BindWordingContent("", "");
        org.xmlpull.v1.XmlPullParserFactory newInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        org.xmlpull.v1.XmlPullParser newPullParser = newInstance.newPullParser();
        newPullParser.setInput(new java.io.StringReader(str));
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                str2 = newPullParser.getName();
            } else if (eventType == 4 && (text = newPullParser.getText()) != null && text.trim().length() > 0) {
                java.lang.String trim = text.trim();
                if (str2.equalsIgnoreCase(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                    bindWordingContent.f71276d = trim;
                } else if (str2.equalsIgnoreCase(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)) {
                    bindWordingContent.f71277e = trim;
                } else if (str2.equalsIgnoreCase("type")) {
                    try {
                        bindWordingContent.f71278f = java.lang.Integer.valueOf(trim);
                    } catch (java.lang.Exception unused) {
                        bindWordingContent.f71278f = 0;
                    }
                }
            }
        }
        return bindWordingContent;
    }
}
