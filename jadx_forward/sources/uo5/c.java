package uo5;

/* loaded from: classes13.dex */
public final class c implements uo5.m {
    public uo5.r a(uo5.a codecConfig) {
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codecConfig, "codecConfig");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            boolean z17 = codecConfig.f511244a;
            java.lang.String str = codecConfig.f511245b;
            android.media.MediaCodec createEncoderByType = z17 ? android.media.MediaCodec.createEncoderByType(str) : android.media.MediaCodec.createDecoderByType(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(createEncoderByType);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new uo5.s(createEncoderByType));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CodecProviderImpl", "get codec error ", m143898xd4a2fc34);
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        return (uo5.r) m143895xf1229813;
    }
}
