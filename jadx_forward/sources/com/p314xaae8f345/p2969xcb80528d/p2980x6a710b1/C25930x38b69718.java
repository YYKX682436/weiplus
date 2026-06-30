package com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1;

/* renamed from: com.tencent.tavkit.utils.TAVTimeUtil */
/* loaded from: classes16.dex */
public class C25930x38b69718 {
    /* renamed from: factorForTime */
    public static float m98858xfefb1ee7(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        if (c25738xead39d26 == null) {
            return 0.0f;
        }
        return c25736x76b98a57.sub(c25738xead39d26.m97260x75286aac()).m97231x793685bc() / c25738xead39d26.m97256x51e8b0a().m97231x793685bc();
    }

    /* renamed from: getIntersection */
    public static com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m98859x6b10bcff(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262) {
        if (c25738xead39d26 == null || c25738xead39d262 == null) {
            return null;
        }
        if (c25738xead39d26.m97260x75286aac().m97222xf922bec1(c25738xead39d262.m97260x75286aac())) {
            c25738xead39d262 = c25738xead39d26;
            c25738xead39d26 = c25738xead39d262;
        }
        if (c25738xead39d26.m97258xb58839a5().m97238x9f3f7b48(c25738xead39d262.m97260x75286aac())) {
            return null;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25738xead39d26.m97260x75286aac().m97222xf922bec1(c25738xead39d262.m97260x75286aac()) ? c25738xead39d26.m97260x75286aac() : c25738xead39d262.m97260x75286aac();
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97260x75286aac, (c25738xead39d26.m97258xb58839a5().m97238x9f3f7b48(c25738xead39d262.m97258xb58839a5()) ? c25738xead39d26.m97258xb58839a5() : c25738xead39d262.m97258xb58839a5()).sub(m97260x75286aac));
    }

    /* renamed from: mixTimeRangesWithMinTimeRange */
    public static java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26> m98860x21d0f5c3(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d263) {
        if (c25738xead39d263.m97254xac5dcb11(c25738xead39d26)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub = c25738xead39d262.m97260x75286aac().sub(c25738xead39d263.m97260x75286aac());
            if (sub.m97231x793685bc() > 0.0f) {
                arrayList.add(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d263.m97260x75286aac(), sub));
            }
            arrayList.add(c25738xead39d262);
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub2 = c25738xead39d263.m97258xb58839a5().sub(c25738xead39d262.m97258xb58839a5());
            if (sub2.m97231x793685bc() > 0.0f) {
                arrayList.add(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d262.m97258xb58839a5(), sub2));
            }
            return arrayList;
        }
        if (c25738xead39d26.m97255xb2c87fbf(c25738xead39d263)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(c25738xead39d262);
            return arrayList2;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d264 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d26.m97260x75286aac(), c25738xead39d26.m97256x51e8b0a().sub(c25738xead39d262.m97256x51e8b0a()));
        if (c25738xead39d264.m97256x51e8b0a().m97231x793685bc() > 0.0f) {
            arrayList3.add(c25738xead39d264);
        }
        arrayList3.add(c25738xead39d262);
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d265 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d262.m97258xb58839a5(), c25738xead39d263.m97258xb58839a5().sub(c25738xead39d262.m97258xb58839a5()));
        if (c25738xead39d265.m97256x51e8b0a().m97231x793685bc() > 0.0f) {
            arrayList3.add(c25738xead39d265);
        }
        return arrayList3;
    }

    /* renamed from: sliceTimeRangesForTimeRange1 */
    public static java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26> m98861x1e65c435(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262) {
        java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26> list;
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m98859x6b10bcff = m98859x6b10bcff(c25738xead39d26, c25738xead39d262);
        if (m98859x6b10bcff.m97256x51e8b0a().m97231x793685bc() > 0.0f) {
            list = (c25738xead39d262.m97254xac5dcb11(c25738xead39d26) || (c25738xead39d26.m97260x75286aac().m97231x793685bc() < c25738xead39d262.m97260x75286aac().m97231x793685bc() && c25738xead39d26.m97258xb58839a5().m97231x793685bc() < c25738xead39d262.m97258xb58839a5().m97231x793685bc())) ? m98860x21d0f5c3(c25738xead39d26, m98859x6b10bcff, c25738xead39d262) : m98860x21d0f5c3(c25738xead39d262, m98859x6b10bcff, c25738xead39d26);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(c25738xead39d26);
            arrayList.add(c25738xead39d262);
            list = arrayList;
        }
        java.util.Collections.sort(list, new java.util.Comparator<com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26>() { // from class: com.tencent.tavkit.utils.TAVTimeUtil.1
            @Override // java.util.Comparator
            public int compare(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d263, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d264) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25738xead39d263.m97260x75286aac();
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac2 = c25738xead39d264.m97260x75286aac();
                if (m97260x75286aac.m97229x22a7969a(m97260x75286aac2)) {
                    return 0;
                }
                return m97260x75286aac.m97238x9f3f7b48(m97260x75286aac2) ? -1 : 1;
            }
        });
        return list;
    }

    /* renamed from: timeRange */
    public static java.util.List<com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26> m98862x16fae70(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m98859x6b10bcff = m98859x6b10bcff(c25738xead39d26, c25738xead39d262);
        if (m98859x6b10bcff == null || m98859x6b10bcff.m97256x51e8b0a().m97231x793685bc() <= 0.0f) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(c25738xead39d26);
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d263 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d26.m97260x75286aac(), m98859x6b10bcff.m97260x75286aac().sub(c25738xead39d26.m97260x75286aac()));
        if (c25738xead39d263.m97256x51e8b0a().m97231x793685bc() > 0.0f) {
            arrayList2.add(c25738xead39d263);
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d264 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m98859x6b10bcff.m97258xb58839a5(), c25738xead39d26.m97258xb58839a5().sub(m98859x6b10bcff.m97258xb58839a5()));
        if (c25738xead39d264.m97256x51e8b0a().m97231x793685bc() > 0.0f) {
            arrayList2.add(c25738xead39d264);
        }
        return arrayList2;
    }
}
