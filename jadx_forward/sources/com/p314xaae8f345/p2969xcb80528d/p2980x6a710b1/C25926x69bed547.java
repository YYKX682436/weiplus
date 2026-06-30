package com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1;

/* renamed from: com.tencent.tavkit.utils.CompositionUtils */
/* loaded from: classes16.dex */
public class C25926x69bed547 {
    private static final java.lang.String TAG = "CompositionUtils";

    /* renamed from: com.tencent.tavkit.utils.CompositionUtils$TransitionTimeCalculator */
    /* loaded from: classes16.dex */
    public interface TransitionTimeCalculator {
        /* renamed from: transition */
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo98845x993b6d55(int i17);
    }

    /* renamed from: checkScaleTimeRange */
    private static void m98838xd84db6e(com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7 c25645x2b23f8e7, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262) {
        if (com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0.m97229x22a7969a(c25738xead39d26.m97256x51e8b0a()) || c25738xead39d262.m97256x51e8b0a().m97229x22a7969a(c25738xead39d26.m97256x51e8b0a())) {
            return;
        }
        c25645x2b23f8e7.m96232x47f39846(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d26.m97260x75286aac(), c25738xead39d262.m97256x51e8b0a()), c25738xead39d26.m97256x51e8b0a());
    }

    /* renamed from: createEmptyResource */
    public static com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25904x1e3cc372 m98839x9a3918df(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25904x1e3cc372 c25904x1e3cc372 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25904x1e3cc372(c25736x76b98a57);
        c25904x1e3cc372.m98727xffd6ec16(c25736x76b98a57);
        c25904x1e3cc372.m98728xfd7a0d10(c25736x76b98a57);
        return c25904x1e3cc372;
    }

    /* renamed from: insertTimeRangeToTrack */
    public static void m98840x9cb107d9(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25908xa2ed4c79 c25908xa2ed4c79, com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7 c25645x2b23f8e7, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        try {
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m98734xf018215f = c25908xa2ed4c79.m98734xf018215f();
            if (c25908xa2ed4c79.m98735x75359795() != null) {
                c25645x2b23f8e7.m96230x8e3e0bb7(m98734xf018215f, c25908xa2ed4c79.m98735x75359795(), c25738xead39d26.m97260x75286aac());
                m98838xd84db6e(c25645x2b23f8e7, c25738xead39d26, m98734xf018215f);
            } else if (c25908xa2ed4c79.m98731x9423e1fc(c25738xead39d26) != null) {
                c25645x2b23f8e7.m96228x71e58f39(c25908xa2ed4c79.m98731x9423e1fc(c25738xead39d26));
            } else {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "insertTimeRangeToTrack: TrackInfo track and segment are null !!!");
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: mutableTrackCompatibleWithTimeRange */
    public static com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7 m98841xed8ec251(com.p314xaae8f345.tav.p2945x58ceaf0.C25644x906c22c4 c25644x906c22c4, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, int i17) {
        for (com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7 c25645x2b23f8e7 : c25644x906c22c4.mo96143x6e29e370(i17)) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m98859x6b10bcff = com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25930x38b69718.m98859x6b10bcff(c25645x2b23f8e7.m96161xdd1fba(), c25738xead39d26);
            if (m98859x6b10bcff == null || m98859x6b10bcff.m97256x51e8b0a().m97231x793685bc() <= 0.0f) {
                return c25645x2b23f8e7;
            }
        }
        return null;
    }

    /* renamed from: reloadAudioStartTimeWithTransitionableAudio */
    public static void m98842x4f513ccf(final java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e> list) {
        m98843xee6e19eb(list, new com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25926x69bed547.TransitionTimeCalculator() { // from class: com.tencent.tavkit.utils.CompositionUtils.2
            @Override // com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25926x69bed547.TransitionTimeCalculator
            /* renamed from: transition */
            public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo98845x993b6d55(int i17) {
                com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25881xbf556302 mo98544x1d246395 = ((com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e) list.get(i17)).mo98544x1d246395();
                return mo98544x1d246395 != null ? mo98544x1d246395.mo98609x51e8b0a() : com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
            }
        });
    }

    /* renamed from: reloadStartTimeWithTransitionable */
    private static void m98843xee6e19eb(java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25896x8ee45d0f> list, com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25926x69bed547.TransitionTimeCalculator transitionTimeCalculator) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        int i17 = 0;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = c25736x76b98a57;
        while (i17 < list.size()) {
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25896x8ee45d0f interfaceC25896x8ee45d0f = list.get(i17);
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a573 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo98845x993b6d55 = transitionTimeCalculator != null ? transitionTimeCalculator.mo98845x993b6d55(i17) : c25736x76b98a573;
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97256x51e8b0a = interfaceC25896x8ee45d0f.mo98550xdd1fba().m97256x51e8b0a();
            if (!m97256x51e8b0a.m97238x9f3f7b48(mo98845x993b6d55) && i17 < list.size() - 1 && !list.get(i17 + 1).mo98550xdd1fba().m97256x51e8b0a().m97238x9f3f7b48(mo98845x993b6d55)) {
                c25736x76b98a573 = mo98845x993b6d55;
            }
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub = c25736x76b98a57.sub(c25736x76b98a572);
            interfaceC25896x8ee45d0f.mo98560xdcd6bc0d(sub);
            c25736x76b98a57 = sub.add(m97256x51e8b0a);
            i17++;
            c25736x76b98a572 = c25736x76b98a573;
        }
    }

    /* renamed from: reloadVideoStartTimeWithTransitionableVideo */
    public static void m98844x85c25a19(final java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743> list) {
        m98843xee6e19eb(list, new com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25926x69bed547.TransitionTimeCalculator() { // from class: com.tencent.tavkit.utils.CompositionUtils.1
            @Override // com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25926x69bed547.TransitionTimeCalculator
            /* renamed from: transition */
            public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo98845x993b6d55(int i17) {
                com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.InterfaceC25920x69291167 mo98553xc6f811fa = ((com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25899x6103f743) list.get(i17)).mo98553xc6f811fa();
                return mo98553xc6f811fa != null ? mo98553xc6f811fa.mo98693x51e8b0a() : com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
            }
        });
    }
}
