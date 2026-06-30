package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.IceCandidate */
/* loaded from: classes11.dex */
public class C29792xbcd69f58 {

    /* renamed from: adapterType */
    public final org.p3371xd0ce3e8d.C29834x4e84c600.AdapterType f75491x22e46729;
    public final java.lang.String sdp;

    /* renamed from: sdpMLineIndex */
    public final int f75492xcf9140f0;

    /* renamed from: sdpMid */
    public final java.lang.String f75493xc9f29589;

    /* renamed from: serverUrl */
    public final java.lang.String f75494xf43b332c;

    public C29792xbcd69f58(java.lang.String str, int i17, java.lang.String str2) {
        this.f75493xc9f29589 = str;
        this.f75492xcf9140f0 = i17;
        this.sdp = str2;
        this.f75494xf43b332c = "";
        this.f75491x22e46729 = org.p3371xd0ce3e8d.C29834x4e84c600.AdapterType.UNKNOWN;
    }

    /* renamed from: objectEquals */
    private static boolean m155624x9b9063de(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: equals */
    public boolean m155625xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof org.p3371xd0ce3e8d.C29792xbcd69f58)) {
            return false;
        }
        org.p3371xd0ce3e8d.C29792xbcd69f58 c29792xbcd69f58 = (org.p3371xd0ce3e8d.C29792xbcd69f58) obj;
        return m155624x9b9063de(this.f75493xc9f29589, c29792xbcd69f58.f75493xc9f29589) && this.f75492xcf9140f0 == c29792xbcd69f58.f75492xcf9140f0 && m155624x9b9063de(this.sdp, c29792xbcd69f58.sdp);
    }

    /* renamed from: getSdp */
    public java.lang.String m155626xb5886d09() {
        return this.sdp;
    }

    /* renamed from: getSdpMid */
    public java.lang.String m155627x2f09b87f() {
        return this.f75493xc9f29589;
    }

    /* renamed from: hashCode */
    public int m155628x8cdac1b() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f75493xc9f29589, java.lang.Integer.valueOf(this.f75492xcf9140f0), this.sdp});
    }

    /* renamed from: toString */
    public java.lang.String m155629x9616526c() {
        return this.f75493xc9f29589 + ":" + this.f75492xcf9140f0 + ":" + this.sdp + ":" + this.f75494xf43b332c + ":" + this.f75491x22e46729.toString();
    }

    public C29792xbcd69f58(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, org.p3371xd0ce3e8d.C29834x4e84c600.AdapterType adapterType) {
        this.f75493xc9f29589 = str;
        this.f75492xcf9140f0 = i17;
        this.sdp = str2;
        this.f75494xf43b332c = str3;
        this.f75491x22e46729 = adapterType;
    }
}
