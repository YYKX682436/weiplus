package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p030x66f27be;

/* renamed from: androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk */
/* loaded from: classes13.dex */
public class C0399xe28f2ca2 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e {

    /* renamed from: MODEL_TO_DISPLAY_SIZE_MAP */
    private static final java.util.Map<java.lang.String, android.util.Size> f725xfdc3da09;
    private static final java.lang.String TAG = "SmallDisplaySizeQuirk";

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f725xfdc3da09 = hashMap;
        hashMap.put("REDMI NOTE 8", new android.util.Size(1080, 2340));
        hashMap.put("REDMI NOTE 7", new android.util.Size(1080, 2340));
        hashMap.put("SM-A207M", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.q.f33913x366c91de));
        hashMap.put("REDMI NOTE 7S", new android.util.Size(1080, 2340));
        hashMap.put("SM-A127F", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1600));
        hashMap.put("SM-A536E", new android.util.Size(1080, 2400));
        hashMap.put("220233L2I", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1600));
        hashMap.put("V2149", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1600));
        hashMap.put("VIVO 1920", new android.util.Size(1080, 2340));
        hashMap.put("CPH2223", new android.util.Size(1080, 2400));
        hashMap.put("V2029", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1600));
        hashMap.put("CPH1901", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f29746x366c91de));
        hashMap.put("REDMI Y3", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f29746x366c91de));
        hashMap.put("SM-A045M", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1600));
        hashMap.put("SM-A146U", new android.util.Size(1080, 2408));
        hashMap.put("CPH1909", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f29746x366c91de));
        hashMap.put("NOKIA 4.2", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f29746x366c91de));
        hashMap.put("SM-G960U1", new android.util.Size(1440, 2960));
        hashMap.put("SM-A137F", new android.util.Size(1080, 2408));
        hashMap.put("VIVO 1816", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.g.f29746x366c91de));
        hashMap.put("INFINIX X6817", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1612));
        hashMap.put("SM-A037F", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1600));
        hashMap.put("NOKIA 2.4", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1600));
        hashMap.put("SM-A125M", new android.util.Size(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1600));
        hashMap.put("INFINIX X670", new android.util.Size(1080, 2400));
    }

    /* renamed from: load */
    public static boolean m4044x32c4e6() {
        return f725xfdc3da09.containsKey(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }

    /* renamed from: getDisplaySize */
    public android.util.Size m4045x400482ad() {
        return f725xfdc3da09.get(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }
}
