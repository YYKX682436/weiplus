package com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf;

/* renamed from: com.tencent.thumbplayer.datatransport.TPProxyUtils */
/* loaded from: classes16.dex */
public class C26464x151ba67f {

    /* renamed from: PROXY_SO_NAME */
    public static final java.lang.String f53863xb6d8859d = "DownloadProxy";
    public static final java.lang.String TAG = "TPProxyUtils";

    /* renamed from: convertProxyDownloadParams */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 m103086x9365589(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arrayList;
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arrayList2 = null;
        if (c26231xafaedb13 == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(1);
            arrayList3.add(str);
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9(arrayList3, 0, null);
        }
        java.util.ArrayList<java.lang.String> arrayList4 = new java.util.ArrayList<>();
        if (c26231xafaedb13.m101413x1794b08d() == null || c26231xafaedb13.m101413x1794b08d().isEmpty()) {
            if (android.text.TextUtils.isEmpty(str)) {
                arrayList4.add(c26231xafaedb13.url);
            } else {
                arrayList4.add(str);
            }
            java.lang.String[] m101372x11dae8b9 = c26231xafaedb13.m101372x11dae8b9();
            if (m101372x11dae8b9 != null && m101372x11dae8b9.length > 0) {
                for (int i17 = 0; i17 < m101372x11dae8b9.length; i17++) {
                    if (!android.text.TextUtils.isEmpty(m101372x11dae8b9[i17])) {
                        arrayList4.add(m101372x11dae8b9[i17]);
                    }
                }
            }
            if (map != null) {
                arrayList2 = new java.util.ArrayList<>();
                arrayList2.add(map);
            }
            arrayList = arrayList2;
        } else {
            arrayList4 = c26231xafaedb13.m101413x1794b08d();
            arrayList = c26231xafaedb13.m101412x4464f4a2();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101389x194b99df())) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, c26231xafaedb13.m101389x194b99df());
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52787x1ec301da, c26231xafaedb13.m101389x194b99df());
        }
        if (c26231xafaedb13.m101415x41e9bba5() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52797x7bad2fa3, java.lang.Integer.valueOf(c26231xafaedb13.m101415x41e9bba5()));
        }
        if (c26231xafaedb13.m101388x50026913() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52766xf5d1be0a, java.lang.Long.valueOf(c26231xafaedb13.m101388x50026913()));
        }
        if (c26231xafaedb13.m101386x9ea1fda6() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52764x7230f71d, java.lang.Long.valueOf(c26231xafaedb13.m101386x9ea1fda6()));
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101382xfe398b35())) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52788xb6eede69, c26231xafaedb13.m101382xfe398b35());
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101417xb58878db())) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52800x2d2fad97, c26231xafaedb13.m101417xb58878db());
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101399xe3a9f89d())) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52785xa65cc3e4, c26231xafaedb13.m101399xe3a9f89d());
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101377x2ca09f1a())) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52754x658c5437, c26231xafaedb13.m101377x2ca09f1a());
        }
        if (c26231xafaedb13.m101378x86f549b5() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52755x33c82b92, java.lang.Integer.valueOf(c26231xafaedb13.m101378x86f549b5()));
        }
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104275x7aab3243(c26231xafaedb13.m101390x188b53b())) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52767xa9f679c, c26231xafaedb13.m101390x188b53b());
        }
        if (c26231xafaedb13.m101373xdd237e49() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52750xee4d989b, java.lang.Integer.valueOf(c26231xafaedb13.m101373xdd237e49()));
        }
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52796xc827745f, java.lang.Boolean.valueOf(c26231xafaedb13.m101419xd704147e()));
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52753x459e8ef3, java.lang.Boolean.valueOf(c26231xafaedb13.m101421xe5d4ad1d()));
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52771x7441748, java.lang.Boolean.valueOf(c26231xafaedb13.m101423x81235559()));
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52759x378eb97b, java.lang.Boolean.valueOf(c26231xafaedb13.m101420xad229b27()));
        if (arrayList != null && !arrayList.isEmpty()) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52798x8274db17, arrayList);
        }
        if (c26231xafaedb13.m101402xb399dc74() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52791xed4c79b1, java.lang.Long.valueOf(c26231xafaedb13.m101402xb399dc74()));
        }
        if (c26231xafaedb13.m101400xb89ed887() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52790x71078744, java.lang.Long.valueOf(c26231xafaedb13.m101400xb89ed887()));
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101404x4ed0b8())) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52794x4f3ececd, c26231xafaedb13.m101404x4ed0b8());
        }
        if (c26231xafaedb13.m101407x5a6b021b() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52789x86d2333b, java.lang.Integer.valueOf(c26231xafaedb13.m101407x5a6b021b()));
        }
        if (c26231xafaedb13.m101383x606f7338() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52786x69a5c6a2, java.lang.Integer.valueOf(c26231xafaedb13.m101383x606f7338()));
        }
        if (c26231xafaedb13.m101375x9e54c0e9() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52783x868d3dd1, java.lang.Integer.valueOf(c26231xafaedb13.m101375x9e54c0e9()));
        }
        if (c26231xafaedb13.m101376x142a3c27() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52784x1a93201f, java.lang.Integer.valueOf(c26231xafaedb13.m101376x142a3c27()));
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101374xfb7d6f47())) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52801xf2fdafc6, c26231xafaedb13.m101374xfb7d6f47());
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101393x485b2181())) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52803x876ac4a1, c26231xafaedb13.m101393x485b2181());
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101387xad6ae4c())) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52765x83ccde55, c26231xafaedb13.m101387xad6ae4c());
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101394xfb81c2bf())) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52804xf3027b7e, c26231xafaedb13.m101394xfb81c2bf());
        }
        if (c26231xafaedb13.m101410x5db1c6f() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52809x55074ae, java.lang.Long.valueOf(c26231xafaedb13.m101410x5db1c6f()));
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101395x74dfde39())) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "nonce:" + c26231xafaedb13.m101395x74dfde39());
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52775x9f8ccff5, c26231xafaedb13.m101395x74dfde39());
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101379x15792df3())) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "encrypt stream key:" + c26231xafaedb13.m101379x15792df3());
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52761xa73e9cd4, c26231xafaedb13.m101379x15792df3());
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101403x7816efda())) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "encrypt randoms:" + c26231xafaedb13.m101403x7816efda());
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52762xe5396805, c26231xafaedb13.m101403x7816efda());
        }
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52802xf2ffb59d, java.lang.Integer.valueOf(c26231xafaedb13.m101391xfb7f713e()));
        if (c26231xafaedb13.m101409x30ce9823() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52808x4940b0e2, java.lang.Integer.valueOf(c26231xafaedb13.m101409x30ce9823()));
        }
        if (c26231xafaedb13.m101384x5b6552b4() > 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52763x197422f5, java.lang.Integer.valueOf(c26231xafaedb13.m101384x5b6552b4()));
        }
        if (c26231xafaedb13.m101406x95f2db65() != null) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52807xd1104dd4, c26231xafaedb13.m101406x95f2db65());
        }
        if (c26231xafaedb13.m101401xf453845a() >= 0) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52792xa932140f, java.lang.Long.valueOf(c26231xafaedb13.m101401xf453845a()));
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101405xafec6a91())) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52795x81581be8, c26231xafaedb13.m101405xafec6a91());
        }
        if (!android.text.TextUtils.isEmpty(c26231xafaedb13.m101396xcea7a242())) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52779xcc4eb91e, c26231xafaedb13.m101396xcea7a242());
        }
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52752x3d29425d, java.lang.Boolean.valueOf(c26231xafaedb13.m101418x676dea3()));
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52774xa6d175b, java.lang.Boolean.valueOf(c26231xafaedb13.m101422xf770634f()));
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104275x7aab3243(c26231xafaedb13.m101385xb883b063())) {
            hashMap.putAll(c26231xafaedb13.m101385xb883b063());
        }
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52768x49946d63, c26231xafaedb13.m101380x85dbdc5b());
        if (map2 != null && !map2.isEmpty()) {
            hashMap.putAll(map2);
        }
        if (c26231xafaedb13.m101397x5cd810fa() != null && !c26231xafaedb13.m101397x5cd810fa().isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            java.util.Iterator<java.lang.String> it = c26231xafaedb13.m101397x5cd810fa().iterator();
            while (it.hasNext()) {
                sb6.append(it.next());
                sb6.append(";");
            }
            if (sb6.length() > 0) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "pcdn url list: " + sb6.toString());
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52780xb961d34c, sb6.toString());
        }
        if (c26231xafaedb13.m101398xd03b08f() != null && !c26231xafaedb13.m101398xd03b08f().isEmpty()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("");
            java.util.Iterator<java.lang.Integer> it6 = c26231xafaedb13.m101398xd03b08f().iterator();
            while (it6.hasNext()) {
                sb7.append(it6.next().intValue());
                sb7.append(";");
            }
            if (sb7.length() > 0) {
                sb7.deleteCharAt(sb7.length() - 1);
            }
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52781x480b6ded, sb7.toString());
        }
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> m101392x2172a80e = c26231xafaedb13.m101392x2172a80e();
        if (m101392x2172a80e != null && !m101392x2172a80e.isEmpty()) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52798x8274db17, m101392x2172a80e);
        }
        return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9(arrayList4, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26461x15782fe.m103069xb93547a6(c26231xafaedb13.m101381x15d5aed8()), hashMap);
    }
}
