package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.DecoderAssetTrack */
/* loaded from: classes16.dex */
public class C25760x91f3af7f {

    /* renamed from: assetPath */
    public java.lang.String f48008x4e63cb35;

    /* renamed from: frameRate */
    public int f48009x207cebed;

    /* renamed from: mediaType */
    public int f48010x7f94e13e;

    /* renamed from: preferRotation */
    public int f48011xcc7d15ae;

    /* renamed from: preferredTransform */
    public android.graphics.Matrix f48012x5880ffeb;

    /* renamed from: preferredVolume */
    public float f48013xdb79bafb;

    /* renamed from: size */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f48014x35e001;

    /* renamed from: sourceType */
    public int f48015xbdc0e5f5;

    /* renamed from: trackId */
    public int f48016xc060d3c6;

    /* renamed from: create */
    public static com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f m97450xaf65a0fc(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b, com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258 c25635x5b7fe258) {
        return c25635x5b7fe258 instanceof com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 ? m97451x2656c48c(c25634xf527485b, (com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212) c25635x5b7fe258) : m97452x44ff54e(c25634xf527485b, c25635x5b7fe258);
    }

    /* renamed from: createFromCompositionTrackSegment */
    private static com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f m97451x2656c48c(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b, com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212) {
        if (c25640x7df05212.m96174x7aab3243()) {
            return null;
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f = new com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f();
        c25760x91f3af7f.f48008x4e63cb35 = c25640x7df05212.m96184xabff72d6();
        c25760x91f3af7f.f48016xc060d3c6 = c25640x7df05212.m96185x83637b55();
        c25760x91f3af7f.f48010x7f94e13e = c25634xf527485b.m96152x7f025288();
        if (!android.text.TextUtils.isEmpty(c25640x7df05212.m96184xabff72d6())) {
            com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34 c25820xcadb1d34 = new com.p314xaae8f345.tav.p2965xf0edce24.C25820xcadb1d34();
            c25820xcadb1d34.m97977x683d6267(c25640x7df05212.m96184xabff72d6());
            c25760x91f3af7f.f48014x35e001 = com.p314xaae8f345.tav.p2965xf0edce24.C25823x281c550d.m97989x4ee02466(c25820xcadb1d34);
            c25760x91f3af7f.f48011xcc7d15ae = c25820xcadb1d34.m97962xbb14e2a4();
            c25760x91f3af7f.f48012x5880ffeb = c25634xf527485b.m96157x6bdd61e1();
            c25760x91f3af7f.f48015xbdc0e5f5 = c25640x7df05212.m96186xac019deb();
            c25820xcadb1d34.m97958x63a5261f();
        }
        c25760x91f3af7f.f48013xdb79bafb = 1.0f;
        c25760x91f3af7f.f48009x207cebed = 30;
        return c25760x91f3af7f;
    }

    /* renamed from: createFromTrackSegment */
    private static com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f m97452x44ff54e(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b, com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258 c25635x5b7fe258) {
        if (c25635x5b7fe258.m96174x7aab3243()) {
            return null;
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f c25760x91f3af7f = new com.p314xaae8f345.tav.p2959x5befac44.C25760x91f3af7f();
        c25760x91f3af7f.f48008x4e63cb35 = c25634xf527485b.m96160xabff72d6();
        c25760x91f3af7f.f48016xc060d3c6 = c25634xf527485b.m96163xfe2e0f70();
        c25760x91f3af7f.f48010x7f94e13e = c25634xf527485b.m96152x7f025288();
        if (c25635x5b7fe258 instanceof com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212) {
            c25760x91f3af7f.f48015xbdc0e5f5 = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212) c25635x5b7fe258).m96186xac019deb();
        }
        c25760x91f3af7f.f48014x35e001 = c25634xf527485b.m96153x47007694();
        c25760x91f3af7f.f48012x5880ffeb = c25634xf527485b.m96157x6bdd61e1();
        c25760x91f3af7f.f48013xdb79bafb = c25634xf527485b.m96158xbfdb8cc5();
        c25760x91f3af7f.f48011xcc7d15ae = c25634xf527485b.m96156xa436f669();
        c25760x91f3af7f.f48009x207cebed = (int) c25634xf527485b.m96155xe9bce1e7();
        return c25760x91f3af7f;
    }
}
