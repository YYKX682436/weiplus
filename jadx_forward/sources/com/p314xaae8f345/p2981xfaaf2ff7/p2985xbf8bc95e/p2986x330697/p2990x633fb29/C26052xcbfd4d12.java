package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig */
/* loaded from: classes13.dex */
public class C26052xcbfd4d12 {

    /* renamed from: mToFile */
    private boolean f49538x1b9be964 = false;

    /* renamed from: mToConsole */
    private boolean f49537x504b886f = false;

    /* renamed from: mLevel */
    private int f49534xbe5ee717 = 6;

    /* renamed from: mTags */
    private java.lang.String[] f49536x627aa26 = new java.lang.String[0];

    /* renamed from: mLogCallback */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.LogCallback f49535x77fb4fc = null;

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig$Builder */
    /* loaded from: classes13.dex */
    public static class Builder {

        /* renamed from: mLoggerConfig */
        private final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12 f49539x59c711ff;

        public Builder(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12 c26052xcbfd4d12) {
            if (c26052xcbfd4d12 != null) {
                this.f49539x59c711ff = c26052xcbfd4d12;
            } else {
                this.f49539x59c711ff = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12();
            }
        }

        /* renamed from: build */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12 m99607x59bc66e() {
            return this.f49539x59c711ff;
        }

        /* renamed from: level */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.Builder m99608x6219b84(int i17) {
            this.f49539x59c711ff.f49534xbe5ee717 = i17;
            return this;
        }

        /* renamed from: logCallback */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.Builder m99609x5d72a3a9(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.LogCallback logCallback) {
            this.f49539x59c711ff.f49535x77fb4fc = logCallback;
            return this;
        }

        /* renamed from: tags */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.Builder m99610x363419(java.lang.String... strArr) {
            this.f49539x59c711ff.f49536x627aa26 = strArr;
            return this;
        }

        /* renamed from: toConsole */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.Builder m99611xd5943e5c(boolean z17) {
            this.f49539x59c711ff.f49537x504b886f = z17;
            return this;
        }

        /* renamed from: toFile */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.Builder m99612xcc2fc297(boolean z17) {
            this.f49539x59c711ff.f49538x1b9be964 = z17;
            return this;
        }
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig$LogCallback */
    /* loaded from: classes13.dex */
    public interface LogCallback {
        /* renamed from: onLog */
        void mo99613x64f5ce5(java.lang.String str);
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.Builder m99600x3136c9db() {
        return m99601x3136c9db(null);
    }

    /* renamed from: getLevel */
    public int m99602x74bf41ce() {
        return this.f49534xbe5ee717;
    }

    /* renamed from: getLogCallback */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.LogCallback m99603x3748ea73() {
        return this.f49535x77fb4fc;
    }

    /* renamed from: getTags */
    public java.lang.String[] m99604xfb859c8f() {
        return this.f49536x627aa26;
    }

    /* renamed from: isToConsole */
    public boolean m99605x1bd18052() {
        return this.f49537x504b886f;
    }

    /* renamed from: isToFile */
    public boolean m99606xf45cb461() {
        return this.f49538x1b9be964;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.Builder m99601x3136c9db(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12 c26052xcbfd4d12) {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26052xcbfd4d12.Builder(c26052xcbfd4d12);
    }
}
