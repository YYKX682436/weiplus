package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.SurfaceConfig */
/* loaded from: classes13.dex */
public abstract class AbstractC0758x2d42962f {

    /* renamed from: DEFAULT_STREAM_USE_CASE_VALUE */
    public static final long f1798x6fd1e05b = 0;

    /* renamed from: androidx.camera.core.impl.SurfaceConfig$ConfigSize */
    /* loaded from: classes13.dex */
    public enum ConfigSize {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        final int mId;

        ConfigSize(int i17) {
            this.mId = i17;
        }

        /* renamed from: getId */
        public int m5689x5db1b11() {
            return this.mId;
        }
    }

    /* renamed from: androidx.camera.core.impl.SurfaceConfig$ConfigType */
    /* loaded from: classes13.dex */
    public enum ConfigType {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f m5680xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0657x9a2a4d92(configType, configSize, 0L);
    }

    /* renamed from: getConfigType */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType m5682x1fd0cd92(int i17) {
        if (i17 == 35) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.YUV;
        }
        if (i17 == 256) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG;
        }
        if (i17 == 4101) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.JPEG_R;
        }
        if (i17 == 32) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.RAW;
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType.PRIV;
    }

    /* renamed from: transformSurfaceConfig */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f m5683x501b1a43(int i17, int i18, android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0759xcbc97a21 abstractC0759xcbc97a21) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType m5682x1fd0cd92 = m5682x1fd0cd92(i18);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.NOT_SUPPORT;
        int m6239xfb7d3903 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(size);
        if (i17 == 1) {
            if (m6239xfb7d3903 <= p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(abstractC0759xcbc97a21.m5697x98bdbfb9(i18))) {
                configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.s720p;
            } else if (m6239xfb7d3903 <= p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(abstractC0759xcbc97a21.m5696x3d1328f5(i18))) {
                configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.s1440p;
            }
        } else if (m6239xfb7d3903 <= p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(abstractC0759xcbc97a21.mo5209xf8bd4b73())) {
            configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.VGA;
        } else if (m6239xfb7d3903 <= p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(abstractC0759xcbc97a21.mo5211x8cdf5ab3())) {
            configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.PREVIEW;
        } else if (m6239xfb7d3903 <= p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(abstractC0759xcbc97a21.mo5212x1a0de7e8())) {
            configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.RECORD;
        } else if (m6239xfb7d3903 <= p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(abstractC0759xcbc97a21.m5695x3e4f410b(i18))) {
            configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.MAXIMUM;
        } else {
            android.util.Size m5698xe91e2e6b = abstractC0759xcbc97a21.m5698xe91e2e6b(i18);
            if (m5698xe91e2e6b != null && m6239xfb7d3903 <= p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.m6239xfb7d3903(m5698xe91e2e6b)) {
                configSize = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize.ULTRA_MAXIMUM;
            }
        }
        return m5680xaf65a0fc(m5682x1fd0cd92, configSize);
    }

    /* renamed from: getConfigSize */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize mo5203x1fd01e59();

    /* renamed from: getConfigType */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType mo5204x1fd0cd92();

    /* renamed from: getStreamUseCase */
    public abstract long mo5205xd0b82e01();

    /* renamed from: isSupported */
    public final boolean m5684x450f16a4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f abstractC0758x2d42962f) {
        return abstractC0758x2d42962f.mo5203x1fd01e59().m5689x5db1b11() <= mo5203x1fd01e59().m5689x5db1b11() && abstractC0758x2d42962f.mo5204x1fd0cd92() == mo5204x1fd0cd92();
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f m5681xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigType configType, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f.ConfigSize configSize, long j17) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0657x9a2a4d92(configType, configSize, j17);
    }
}
