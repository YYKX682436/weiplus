package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.TelemetryLoggingOptions */
/* loaded from: classes13.dex */
public class C1934xfb2aea38 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44.Optional {
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1934xfb2aea38 zaa = m18238xdc3ef9b().m18241x59bc66e();
    private final java.lang.String zab;

    /* renamed from: com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder */
    /* loaded from: classes13.dex */
    public static class Builder {
        private java.lang.String zaa;

        private Builder() {
        }

        public /* synthetic */ Builder(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1945x38ed89 c1945x38ed89) {
        }

        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1934xfb2aea38 m18241x59bc66e() {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1934xfb2aea38(this.zaa, null);
        }

        /* renamed from: setApi */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1934xfb2aea38.Builder m18242xca025258(java.lang.String str) {
            this.zaa = str;
            return this;
        }
    }

    public /* synthetic */ C1934xfb2aea38(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1946x38ed8a c1946x38ed8a) {
        this.zab = str;
    }

    /* renamed from: builder */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1934xfb2aea38.Builder m18238xdc3ef9b() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1934xfb2aea38.Builder(null);
    }

    /* renamed from: equals */
    public final boolean m18239xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1934xfb2aea38) {
            return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zab, ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1934xfb2aea38) obj).zab);
        }
        return false;
    }

    /* renamed from: hashCode */
    public final int m18240x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(this.zab);
    }

    public final android.os.Bundle zaa() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = this.zab;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
