package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.ResolutionInfo */
/* loaded from: classes14.dex */
public class C0558xd106e79a {

    /* renamed from: mResolutionInfoInternal */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal f1181x19531924;

    /* renamed from: androidx.camera.core.ResolutionInfo$ResolutionInfoInternal */
    /* loaded from: classes14.dex */
    public static abstract class ResolutionInfoInternal {

        /* renamed from: androidx.camera.core.ResolutionInfo$ResolutionInfoInternal$Builder */
        /* loaded from: classes14.dex */
        public static abstract class Builder {
            /* renamed from: build */
            public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal mo4221x59bc66e();

            /* renamed from: setCropRect */
            public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal.Builder mo4222xf4e85f16(android.graphics.Rect rect);

            /* renamed from: setResolution */
            public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal.Builder mo4223xbd067eae(android.util.Size size);

            /* renamed from: setRotationDegrees */
            public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a.ResolutionInfoInternal.Builder mo4224x61569507(int i17);
        }

        /* renamed from: getCropRect */
        public abstract android.graphics.Rect mo4216xfa2ffe0a();

        /* renamed from: getResolution */
        public abstract android.util.Size mo4217x8ee230a2();

        /* renamed from: getRotationDegrees */
        public abstract int mo4218x2a7ffb93();
    }

    public C0558xd106e79a(android.util.Size size, android.graphics.Rect rect, int i17) {
        this.f1181x19531924 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0460x152611f.Builder().mo4223xbd067eae(size).mo4222xf4e85f16(rect).mo4224x61569507(i17).mo4221x59bc66e();
    }

    /* renamed from: equals */
    public boolean m4733xb2c87fbf(java.lang.Object obj) {
        return this.f1181x19531924.equals(obj);
    }

    /* renamed from: getCropRect */
    public android.graphics.Rect m4734xfa2ffe0a() {
        return this.f1181x19531924.mo4216xfa2ffe0a();
    }

    /* renamed from: getResolution */
    public android.util.Size m4735x8ee230a2() {
        return this.f1181x19531924.mo4217x8ee230a2();
    }

    /* renamed from: getRotationDegrees */
    public int m4736x2a7ffb93() {
        return this.f1181x19531924.mo4218x2a7ffb93();
    }

    /* renamed from: hashCode */
    public int m4737x8cdac1b() {
        return this.f1181x19531924.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m4738x9616526c() {
        return this.f1181x19531924.toString();
    }
}
