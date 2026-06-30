package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2907x38fb28bd;

/* renamed from: com.tencent.qqmusic.mediaplayer.formatdetector.FormatDetector */
/* loaded from: classes13.dex */
public class C25393x11c58fd {
    private static final java.lang.String TAG = "FormatDetector";

    /* renamed from: mInstance */
    private static final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2907x38fb28bd.C25393x11c58fd f45927x46143c22 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2907x38fb28bd.C25393x11c58fd();

    /* renamed from: sIsLoadSuccess */
    public static boolean f45928xc45a4300;

    static {
        f45928xc45a4300 = false;
        f45928xc45a4300 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.m93811x14104adb(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.audioCommon, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.EnumC25335x2fd46b65.formatDetector);
    }

    /* renamed from: getAudioFormat */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m94079xddbe0e37(java.lang.String str) {
        return m94080xddbe0e37(str, true);
    }

    /* renamed from: getAudioType */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m94082xaa5357a(java.lang.String str) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType = null;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (f45928xc45a4300) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m94079xddbe0e37 = m94079xddbe0e37(str);
            if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.m93527x51750626(m94079xddbe0e37)) {
                audioType = m94079xddbe0e37;
            }
        }
        return !com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.m93527x51750626(audioType) ? m94083x4238545b(str.substring(str.lastIndexOf(46) + 1).toLowerCase()) : audioType;
    }

    /* renamed from: getAudioTypeFromExtension */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m94083x4238545b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType : com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.m93531xcee59d22()) {
            if (audioType.m93532xdaea8d89().equalsIgnoreCase(str)) {
                return audioType;
            }
        }
        return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
    }

    /* renamed from: getFormat */
    private native int m94084x19771aed(java.lang.String str, boolean z17);

    /* renamed from: getFormatFromDataSource */
    private native int m94085xad3207fc(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e, boolean z17);

    /* renamed from: getAudioFormat */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m94080xddbe0e37(java.lang.String str, boolean z17) {
        if (str != null) {
            try {
                return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.m93526xaa5357a(f45927x46143c22.m94084x19771aed(str, z17));
            } catch (java.lang.UnsatisfiedLinkError e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
                return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25318x39612e21.m93570xf7ed14ae(str);
            }
        }
        throw new java.lang.IllegalArgumentException("filePath can't be null!");
    }

    /* renamed from: getAudioFormat */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m94078xddbe0e37(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e, boolean z17) {
        if (interfaceC25439x37e1318e != null) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
            try {
                return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.m93526xaa5357a(f45927x46143c22.m94085xad3207fc(interfaceC25439x37e1318e, z17));
            } catch (java.lang.UnsatisfiedLinkError e17) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
                return audioType;
            }
        }
        throw new java.lang.IllegalArgumentException("dataSource can't be null!");
    }

    /* renamed from: getAudioType */
    public static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m94081xaa5357a(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        if (interfaceC25439x37e1318e != null) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType audioType = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType.UNSUPPORT;
            if (!f45928xc45a4300) {
                return audioType;
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.AudioType m94078xddbe0e37 = m94078xddbe0e37(interfaceC25439x37e1318e, false);
            return com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25315x67516f4d.m93527x51750626(m94078xddbe0e37) ? m94078xddbe0e37 : audioType;
        }
        throw new java.lang.IllegalArgumentException("dataSource can't be null!");
    }
}
