package com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa;

/* renamed from: com.tencent.thumbplayer.composition.TPMediaCompositionXmlGenerator */
/* loaded from: classes16.dex */
public class C26274xbc47d75e {
    private static final java.lang.String TAG = "TPMediaCompositionXmlGenerator";

    /* renamed from: appendWithPreferredProperty */
    private static void m101612x8ee78656(org.xmlpull.v1.XmlSerializer xmlSerializer, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1) {
        com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26215xf21a590e mo101275x19f85653 = interfaceC26214xf9e9afd1.mo101275x19f85653();
        if (mo101275x19f85653 == null) {
            return;
        }
        m101613x78b2a03b(xmlSerializer, mo101275x19f85653, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26215xf21a590e.f51188xdd3d27bc);
        m101613x78b2a03b(xmlSerializer, mo101275x19f85653, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26215xf21a590e.f51189x1ab7f252);
        m101613x78b2a03b(xmlSerializer, mo101275x19f85653, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26215xf21a590e.f51190xde5fa061);
    }

    /* renamed from: appendWithPreferredType */
    private static void m101613x78b2a03b(org.xmlpull.v1.XmlSerializer xmlSerializer, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26215xf21a590e interfaceC26215xf21a590e, java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26268xcba0c8d7 c26268xcba0c8d7 = (com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26268xcba0c8d7) interfaceC26215xf21a590e.mo101282x23681e39(str);
        if (c26268xcba0c8d7 == null) {
            return;
        }
        xmlSerializer.startTag("", str);
        xmlSerializer.text(m101628x99ce0be8(c26268xcba0c8d7.mo101288x3a8bed49()));
        xmlSerializer.endTag("", str);
    }

    /* renamed from: buildAssetXmlFromComposition */
    public static java.lang.String m101614xf841634b(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26218xd112e1cb interfaceC26218xd112e1cb) {
        if (interfaceC26218xd112e1cb == null) {
            return "";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> mo101292x9ba80088 = interfaceC26218xd112e1cb.mo101292x9ba80088();
        if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(mo101292x9ba80088)) {
            java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> mo101294x4fe0d78 = interfaceC26218xd112e1cb.mo101294x4fe0d78();
            java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> mo101293xe1316493 = interfaceC26218xd112e1cb.mo101293xe1316493();
            if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(mo101294x4fe0d78) && com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(mo101293xe1316493)) {
                return "";
            }
            com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26270x2b7d01c2 c26270x2b7d01c2 = (com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26270x2b7d01c2) interfaceC26218xd112e1cb;
            long m101602x36bbd779 = c26270x2b7d01c2.m101602x36bbd779();
            m101627x6563dd67(newSerializer, mo101294x4fe0d78, 2, c26270x2b7d01c2.m101600xd375d3d4());
            m101627x6563dd67(newSerializer, mo101293xe1316493, 3, m101602x36bbd779);
        } else {
            m101627x6563dd67(newSerializer, mo101292x9ba80088, 1, 0L);
        }
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    /* renamed from: buildWithTrackClipWithTags */
    private static void m101615x5b15d866(org.xmlpull.v1.XmlSerializer xmlSerializer, java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> list, java.lang.String str, java.lang.String str2) {
        xmlSerializer.startTag("", str);
        xmlSerializer.startTag("", str2);
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> it = list.iterator();
        while (it.hasNext()) {
            m101626x9ba65190(xmlSerializer, it.next());
        }
        xmlSerializer.endTag("", str2);
        xmlSerializer.endTag("", str);
    }

    /* renamed from: buildXmlPathFromAudioClip */
    public static java.lang.String m101616xe14f87ce(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c) {
        if (interfaceC26222x6835d79c == null || interfaceC26222x6835d79c.mo101277x7f025288() != 3) {
            return "";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        newSerializer.startTag("", "audio_tracks");
        newSerializer.startTag("", "audio_track");
        m101626x9ba65190(newSerializer, interfaceC26222x6835d79c);
        newSerializer.endTag("", "audio_track");
        newSerializer.endTag("", "audio_tracks");
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x014d  */
    /* renamed from: buildXmlPathFromDrmAsset */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m101617xe72e6009(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810 r13) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26274xbc47d75e.m101617xe72e6009(com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset):java.lang.String");
    }

    /* renamed from: buildXmlPathFromMediaTrackClip */
    public static java.lang.String m101618x3879812f(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c2) {
        if (interfaceC26222x6835d79c == null && interfaceC26222x6835d79c2 == null) {
            return "";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        if (interfaceC26222x6835d79c != null && interfaceC26222x6835d79c.mo101277x7f025288() == 2) {
            newSerializer.startTag("", "video_tracks");
            newSerializer.startTag("", "video_track");
            m101626x9ba65190(newSerializer, interfaceC26222x6835d79c);
            newSerializer.endTag("", "video_track");
            newSerializer.endTag("", "video_tracks");
        }
        if (interfaceC26222x6835d79c2 != null && interfaceC26222x6835d79c2.mo101277x7f025288() == 3) {
            newSerializer.startTag("", "audio_tracks");
            newSerializer.startTag("", "audio_track");
            m101626x9ba65190(newSerializer, interfaceC26222x6835d79c2);
            newSerializer.endTag("", "audio_track");
            newSerializer.endTag("", "audio_tracks");
        }
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    /* renamed from: buildXmlPathFromRtcAsset */
    public static java.lang.String m101619xee3ad487(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26220xcb931c8e interfaceC26220xcb931c8e) {
        if (interfaceC26220xcb931c8e == null) {
            return "";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        newSerializer.startTag("", "av_tracks");
        newSerializer.startTag("", "av_track");
        newSerializer.startTag("", "track_clip");
        newSerializer.startTag("", "clip_id");
        newSerializer.text(java.lang.Integer.toString(0));
        newSerializer.endTag("", "clip_id");
        newSerializer.startTag("", "clip_placeHolder");
        newSerializer.text("0");
        newSerializer.endTag("", "clip_placeHolder");
        newSerializer.startTag("", "clip_path");
        newSerializer.text(m101628x99ce0be8(interfaceC26220xcb931c8e.mo101311x22b7e2e4()));
        newSerializer.endTag("", "clip_path");
        newSerializer.startTag("", "clip_rtcServerUrl");
        newSerializer.text(m101628x99ce0be8(interfaceC26220xcb931c8e.mo101310x29c34841()));
        newSerializer.endTag("", "clip_rtcServerUrl");
        newSerializer.startTag("", "clip_rtcSdpExchangeType");
        newSerializer.text(java.lang.Integer.toString(interfaceC26220xcb931c8e.mo101309x79d0a331()));
        newSerializer.endTag("", "clip_rtcSdpExchangeType");
        newSerializer.startTag("", "clip_preferredProperty");
        m101612x8ee78656(newSerializer, interfaceC26220xcb931c8e);
        newSerializer.endTag("", "clip_preferredProperty");
        newSerializer.endTag("", "track_clip");
        newSerializer.endTag("", "av_track");
        newSerializer.endTag("", "av_tracks");
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    /* renamed from: buildXmlPathFromTrackInfo */
    public static java.lang.String m101620x19adc21(java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> list, int i17) {
        java.lang.String str;
        java.lang.String str2;
        if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(list)) {
            return "";
        }
        if (i17 == 1) {
            str = "av_tracks";
            str2 = "av_track";
        } else if (i17 == 2) {
            str = "video_tracks";
            str2 = "video_track";
        } else {
            if (i17 != 3) {
                return "";
            }
            str = "audio_tracks";
            str2 = "audio_track";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        m101615x5b15d866(newSerializer, list, str, str2);
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    /* renamed from: buildXmlPathFromUrlAsset */
    public static java.lang.String m101621xcb6d8239(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26223x7c284640 interfaceC26223x7c284640) {
        if (interfaceC26223x7c284640 == null) {
            return "";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        newSerializer.startTag("", "av_tracks");
        newSerializer.startTag("", "av_track");
        newSerializer.startTag("", "track_clip");
        newSerializer.startTag("", "clip_id");
        newSerializer.text(java.lang.Integer.toString(0));
        newSerializer.endTag("", "clip_id");
        newSerializer.startTag("", "clip_placeHolder");
        newSerializer.text("0");
        newSerializer.endTag("", "clip_placeHolder");
        newSerializer.startTag("", "clip_path");
        newSerializer.text(m101628x99ce0be8(interfaceC26223x7c284640.mo101331xec9d3f19()));
        newSerializer.endTag("", "clip_path");
        newSerializer.startTag("", "clip_preferredProperty");
        m101612x8ee78656(newSerializer, interfaceC26223x7c284640);
        newSerializer.endTag("", "clip_preferredProperty");
        newSerializer.endTag("", "track_clip");
        newSerializer.endTag("", "av_track");
        newSerializer.endTag("", "av_tracks");
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    /* renamed from: buildXmlPathFromVideoClip */
    public static java.lang.String m101622x258b25f3(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c) {
        if (interfaceC26222x6835d79c == null || interfaceC26222x6835d79c.mo101277x7f025288() != 2) {
            return "";
        }
        org.xmlpull.v1.XmlSerializer newSerializer = android.util.Xml.newSerializer();
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, java.lang.Boolean.TRUE);
        newSerializer.startTag("", "assets");
        newSerializer.startTag("", "video_tracks");
        newSerializer.startTag("", "video_track");
        m101626x9ba65190(newSerializer, interfaceC26222x6835d79c);
        newSerializer.endTag("", "video_track");
        newSerializer.endTag("", "video_tracks");
        newSerializer.endTag("", "assets");
        newSerializer.endDocument();
        return stringWriter.toString();
    }

    /* renamed from: dealClipWithInterval */
    private static void m101623xd3843ba7(org.xmlpull.v1.XmlSerializer xmlSerializer, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c, long j17) {
        if (interfaceC26222x6835d79c instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26266x75f97a0a) {
            m101624x5a6247fa(xmlSerializer, interfaceC26222x6835d79c, j17);
        } else if (interfaceC26222x6835d79c instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26273x7d266399) {
            m101625x87923808(xmlSerializer, interfaceC26222x6835d79c, j17);
        }
    }

    /* renamed from: dealEmptyTrackClip */
    private static void m101624x5a6247fa(org.xmlpull.v1.XmlSerializer xmlSerializer, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c, long j17) {
        xmlSerializer.startTag("", "track_clip");
        xmlSerializer.startTag("", "clip_id");
        xmlSerializer.text(java.lang.Integer.toString(interfaceC26222x6835d79c.mo101322x142a3b81()));
        xmlSerializer.endTag("", "clip_id");
        xmlSerializer.startTag("", "clip_placeHolder");
        xmlSerializer.text("1");
        xmlSerializer.endTag("", "clip_placeHolder");
        xmlSerializer.startTag("", "clip_playTimeMs");
        if (j17 > 0) {
            xmlSerializer.text(java.lang.Long.toString(interfaceC26222x6835d79c.mo101325x81a6b901() - j17));
        } else {
            xmlSerializer.text(java.lang.Long.toString(interfaceC26222x6835d79c.mo101325x81a6b901()));
        }
        xmlSerializer.endTag("", "clip_playTimeMs");
        xmlSerializer.endTag("", "track_clip");
    }

    /* renamed from: dealNormalTrackClip */
    private static void m101625x87923808(org.xmlpull.v1.XmlSerializer xmlSerializer, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c, long j17) {
        xmlSerializer.startTag("", "track_clip");
        xmlSerializer.startTag("", "clip_id");
        xmlSerializer.text(java.lang.Integer.toString(interfaceC26222x6835d79c.mo101322x142a3b81()));
        xmlSerializer.endTag("", "clip_id");
        xmlSerializer.startTag("", "clip_placeHolder");
        xmlSerializer.text("0");
        xmlSerializer.endTag("", "clip_placeHolder");
        xmlSerializer.startTag("", "clip_path");
        xmlSerializer.text(m101628x99ce0be8(interfaceC26222x6835d79c.mo101324x5000ed37()));
        xmlSerializer.endTag("", "clip_path");
        xmlSerializer.startTag("", "clip_startTimeMs");
        xmlSerializer.text(java.lang.Long.toString(interfaceC26222x6835d79c.mo101327x6bb2831f()));
        xmlSerializer.endTag("", "clip_startTimeMs");
        xmlSerializer.startTag("", "clip_durationMs");
        xmlSerializer.text(java.lang.Long.toString(interfaceC26222x6835d79c.mo101325x81a6b901()));
        xmlSerializer.endTag("", "clip_durationMs");
        if (j17 > 0) {
            long mo101323x606f7358 = interfaceC26222x6835d79c.mo101323x606f7358() - j17;
            long mo101325x81a6b901 = interfaceC26222x6835d79c.mo101325x81a6b901() - j17;
            xmlSerializer.startTag("", "clip_endTimeMs");
            xmlSerializer.text(java.lang.Long.toString(mo101323x606f7358));
            xmlSerializer.endTag("", "clip_endTimeMs");
            xmlSerializer.startTag("", "clip_playTimeMs");
            xmlSerializer.text(java.lang.Long.toString(mo101325x81a6b901));
            xmlSerializer.endTag("", "clip_playTimeMs");
        } else {
            xmlSerializer.startTag("", "clip_endTimeMs");
            xmlSerializer.text(java.lang.Long.toString(interfaceC26222x6835d79c.mo101323x606f7358()));
            xmlSerializer.endTag("", "clip_endTimeMs");
            xmlSerializer.startTag("", "clip_playTimeMs");
            xmlSerializer.text(java.lang.Long.toString(interfaceC26222x6835d79c.mo101325x81a6b901()));
            xmlSerializer.endTag("", "clip_playTimeMs");
        }
        xmlSerializer.endTag("", "track_clip");
    }

    /* renamed from: dealWithClipInfo */
    private static void m101626x9ba65190(org.xmlpull.v1.XmlSerializer xmlSerializer, com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c) {
        m101623xd3843ba7(xmlSerializer, interfaceC26222x6835d79c, 0L);
    }

    /* renamed from: dealWithTrackInfo */
    private static void m101627x6563dd67(org.xmlpull.v1.XmlSerializer xmlSerializer, java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> list, int i17, long j17) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    java.lang.String m101629x6323fb53 = m101629x6323fb53(i17, true);
                    java.lang.String m101629x6323fb532 = m101629x6323fb53(i17, false);
                    xmlSerializer.startTag("", m101629x6323fb53);
                    for (com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c interfaceC26221xfaf4b62c : list) {
                        if (interfaceC26221xfaf4b62c.mo101277x7f025288() == i17) {
                            xmlSerializer.startTag("", m101629x6323fb532);
                            xmlSerializer.startTag("", "track_id");
                            xmlSerializer.text(java.lang.Integer.toString(interfaceC26221xfaf4b62c.mo101316xfe2e0f90()));
                            xmlSerializer.endTag("", "track_id");
                            if (i17 != 1 && com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26271x57102410.f51499xd3a32a69.equals("base_audio") && interfaceC26221xfaf4b62c.mo101314xa3e6b771() > j17) {
                                java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> it = interfaceC26221xfaf4b62c.mo101313xe6d93963().iterator();
                                long j18 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c next = it.next();
                                    j18 += next.mo101325x81a6b901();
                                    if (j18 > j17) {
                                        m101623xd3843ba7(xmlSerializer, next, j18 - j17);
                                        break;
                                    }
                                    m101626x9ba65190(xmlSerializer, next);
                                }
                            } else {
                                java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> it6 = interfaceC26221xfaf4b62c.mo101313xe6d93963().iterator();
                                while (it6.hasNext()) {
                                    m101626x9ba65190(xmlSerializer, it6.next());
                                }
                            }
                            xmlSerializer.endTag("", m101629x6323fb532);
                        }
                    }
                    xmlSerializer.endTag("", m101629x6323fb53);
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
    }

    /* renamed from: filterXmlIllegalString */
    private static java.lang.String m101628x99ce0be8(java.lang.String str) {
        return str.replaceAll("[^\t\r\n -\ud7ff\ue000-�𐀀-\u10ffff]+", "");
    }

    /* renamed from: getTrackTagWithMediaType */
    private static java.lang.String m101629x6323fb53(int i17, boolean z17) {
        return i17 == 1 ? z17 ? "av_tracks" : "av_track" : i17 == 2 ? z17 ? "video_tracks" : "video_track" : i17 == 3 ? z17 ? "audio_tracks" : "audio_track" : "";
    }
}
