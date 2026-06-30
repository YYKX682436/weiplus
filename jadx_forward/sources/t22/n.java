package t22;

/* loaded from: classes10.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(rr.s.f480682a.c() + "/temp/");
        sb6.append("capture_emoji/");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.vfs.w6.u(sb7);
        return sb7;
    }

    public final java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(a());
        sb6.append("temp_thumb");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        return sb6.toString();
    }

    public final java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(a());
        sb6.append("video_");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        return sb6.toString();
    }
}
