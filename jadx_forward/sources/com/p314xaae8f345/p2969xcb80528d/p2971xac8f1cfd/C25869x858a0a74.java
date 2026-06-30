package com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd;

/* renamed from: com.tencent.tavkit.component.TAVTimeEffectBuilder */
/* loaded from: classes16.dex */
public class C25869x858a0a74 {

    /* renamed from: clip */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 f48916x2ea350;

    /* renamed from: timeEffects */
    private com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327[] f48917xbca36d75;

    /* renamed from: com.tencent.tavkit.component.TAVTimeEffectBuilder$TAVClipSegment */
    /* loaded from: classes16.dex */
    public static class TAVClipSegment {

        /* renamed from: timeEffect */
        private com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327 f48919x1699eabe;

        /* renamed from: timeRange */
        private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f48920x16fae70;

        private TAVClipSegment() {
        }
    }

    public C25869x858a0a74() {
    }

    /* renamed from: addSegmentToChannel */
    private void m98491x31c51ad6(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e79, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25869x858a0a74.TAVClipSegment tAVClipSegment, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79> list) {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 m98541x5a5dd5d = c25874xcf526e79.m98541x5a5dd5d();
        m98541x5a5dd5d.m98547x67860184().m98729x453dbfd3(tAVClipSegment.f48920x16fae70);
        m98541x5a5dd5d.m98547x67860184().m98728xfd7a0d10(tAVClipSegment.f48920x16fae70.m97256x51e8b0a());
        list.add(m98541x5a5dd5d);
    }

    /* renamed from: addSegmentToChannelWithTimeEffect */
    private void m98492xb82af09a(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e79, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25869x858a0a74.TAVClipSegment tAVClipSegment, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79> list) {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 mo98716x5a5dd5d;
        for (int i17 = 0; i17 < tAVClipSegment.f48919x1699eabe.m98481x49c59215(); i17++) {
            if (c25874xcf526e79.m98547x67860184() instanceof com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25903xcabdb8d2) {
                com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 m98717x742a913a = ((com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25903xcabdb8d2) c25874xcf526e79.m98547x67860184()).m98717x742a913a();
                if (tAVClipSegment.f48919x1699eabe.m98484xdcb12c61()) {
                    mo98716x5a5dd5d = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25903xcabdb8d2(m98717x742a913a);
                    com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1L, 30);
                    if (tAVClipSegment.f48919x1699eabe.m98485x1eff9a58()) {
                        mo98716x5a5dd5d.m98729x453dbfd3(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(tAVClipSegment.f48920x16fae70.m97258xb58839a5().sub(c25736x76b98a57), c25736x76b98a57));
                    } else {
                        mo98716x5a5dd5d.m98729x453dbfd3(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(tAVClipSegment.f48920x16fae70.m97260x75286aac(), c25736x76b98a57));
                    }
                } else {
                    mo98716x5a5dd5d = tAVClipSegment.f48919x1699eabe.m98485x1eff9a58() ? new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25903xcabdb8d2(m98717x742a913a) : new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25903xcabdb8d2(m98717x742a913a);
                    mo98716x5a5dd5d.m98729x453dbfd3(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(tAVClipSegment.f48920x16fae70.m97260x75286aac(), tAVClipSegment.f48919x1699eabe.m98483xdd1fba().m97256x51e8b0a().m97226xb0a37c79(tAVClipSegment.f48919x1699eabe.m98481x49c59215())));
                }
            } else {
                mo98716x5a5dd5d = c25874xcf526e79.m98547x67860184().mo98716x5a5dd5d();
            }
            if (tAVClipSegment.f48919x1699eabe.m98481x49c59215() == 0) {
                mo98716x5a5dd5d.m98728xfd7a0d10(tAVClipSegment.f48920x16fae70.m97256x51e8b0a());
            } else {
                mo98716x5a5dd5d.m98728xfd7a0d10(tAVClipSegment.f48920x16fae70.m97256x51e8b0a().m97226xb0a37c79(tAVClipSegment.f48919x1699eabe.m98481x49c59215()));
            }
            if (tAVClipSegment.f48919x1699eabe.m98482x3583a504().f47870x6ac9171 > 0) {
                if (tAVClipSegment.f48919x1699eabe.m98481x49c59215() == 0) {
                    mo98716x5a5dd5d.m98728xfd7a0d10(tAVClipSegment.f48919x1699eabe.m98482x3583a504());
                } else {
                    mo98716x5a5dd5d.m98728xfd7a0d10(tAVClipSegment.f48919x1699eabe.m98482x3583a504().m97226xb0a37c79(tAVClipSegment.f48919x1699eabe.m98481x49c59215()));
                }
            }
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 m98541x5a5dd5d = c25874xcf526e79.m98541x5a5dd5d();
            m98541x5a5dd5d.m98559x623e6290(mo98716x5a5dd5d);
            list.add(m98541x5a5dd5d);
        }
    }

    /* renamed from: availableTimeEffectsFromClip */
    private java.util.List<com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327> m98493x8a432526(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e79) {
        boolean z17;
        if (this.f48917xbca36d75 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 m98547x67860184 = c25874xcf526e79.m98547x67860184();
        for (com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327 c25868xc958f327 : this.f48917xbca36d75) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m98859x6b10bcff = com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25930x38b69718.m98859x6b10bcff(m98547x67860184.m98725xe67265f(), c25868xc958f327.m98483xdd1fba());
            if (m98859x6b10bcff != null && m98859x6b10bcff.m97256x51e8b0a().f47870x6ac9171 > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m98859x6b10bcff2 = com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1.C25930x38b69718.m98859x6b10bcff(((com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327) it.next()).m98483xdd1fba(), m98859x6b10bcff);
                    if (m98859x6b10bcff2 != null && m98859x6b10bcff2.m97256x51e8b0a().f47870x6ac9171 > 0) {
                        z17 = true;
                        break;
                    }
                }
                if (!z17) {
                    arrayList.add(c25868xc958f327);
                }
            }
        }
        java.util.Collections.sort(arrayList, new java.util.Comparator<com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327>() { // from class: com.tencent.tavkit.component.TAVTimeEffectBuilder.1
            @Override // java.util.Comparator
            public int compare(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327 c25868xc958f3272, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327 c25868xc958f3273) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25868xc958f3272.m98483xdd1fba().m97260x75286aac();
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac2 = c25868xc958f3273.m98483xdd1fba().m97260x75286aac();
                if (m97260x75286aac.m97229x22a7969a(m97260x75286aac2)) {
                    return 0;
                }
                return m97260x75286aac.m97222xf922bec1(m97260x75286aac2) ? 1 : -1;
            }
        });
        return arrayList;
    }

    /* renamed from: initChannelWithClip */
    private void m98494xc5b4b429(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e79, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79> list) {
        for (com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25869x858a0a74.TAVClipSegment tAVClipSegment : m98495x513e00f6(c25874xcf526e79)) {
            if (tAVClipSegment.f48919x1699eabe == null) {
                m98491x31c51ad6(c25874xcf526e79, tAVClipSegment, list);
            } else {
                m98492xb82af09a(c25874xcf526e79, tAVClipSegment, list);
            }
        }
    }

    /* renamed from: segmentsWithClip */
    private java.util.List<com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25869x858a0a74.TAVClipSegment> m98495x513e00f6(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e79) {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 m98547x67860184 = c25874xcf526e79.m98547x67860184();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = m98547x67860184.m98725xe67265f().m97260x75286aac();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98496xf47465d0 = m98496xf47465d0(c25874xcf526e79, m98547x67860184, arrayList, m97260x75286aac);
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub = m98547x67860184.m98725xe67265f().m97258xb58839a5().sub(m98496xf47465d0);
        if (sub.f47870x6ac9171 > 0) {
            com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25869x858a0a74.TAVClipSegment tAVClipSegment = new com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25869x858a0a74.TAVClipSegment();
            tAVClipSegment.f48920x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m98496xf47465d0, sub);
            arrayList.add(tAVClipSegment);
        }
        return arrayList;
    }

    /* renamed from: traverseTimeEffect */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98496xf47465d0(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e79, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.AbstractC25907xa033d2b7 abstractC25907xa033d2b7, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25869x858a0a74.TAVClipSegment> list, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        java.util.List<com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327> m98493x8a432526 = m98493x8a432526(c25874xcf526e79);
        if (m98493x8a432526 == null) {
            return c25736x76b98a57;
        }
        for (com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327 c25868xc958f327 : m98493x8a432526) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub = c25868xc958f327.m98483xdd1fba().m97260x75286aac().sub(c25736x76b98a57);
            if (sub.f47870x6ac9171 > 0) {
                com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25869x858a0a74.TAVClipSegment tAVClipSegment = new com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25869x858a0a74.TAVClipSegment();
                tAVClipSegment.f48920x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a57, sub);
                list.add(tAVClipSegment);
            }
            com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25869x858a0a74.TAVClipSegment tAVClipSegment2 = new com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25869x858a0a74.TAVClipSegment();
            tAVClipSegment2.f48920x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25868xc958f327.m98483xdd1fba().m97260x75286aac().add(abstractC25907xa033d2b7.m98725xe67265f().m97260x75286aac()), c25868xc958f327.m98483xdd1fba().m97256x51e8b0a());
            tAVClipSegment2.f48919x1699eabe = c25868xc958f327;
            list.add(tAVClipSegment2);
            c25736x76b98a57 = tAVClipSegment2.f48920x16fae70.m97258xb58839a5();
        }
        return c25736x76b98a57;
    }

    /* renamed from: build */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79> m98497x59bc66e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m98725xe67265f = this.f48916x2ea350.m98547x67860184().m98725xe67265f();
        if (m98725xe67265f == null || m98725xe67265f.m97256x51e8b0a().f47870x6ac9171 == 0) {
            return null;
        }
        m98494xc5b4b429(this.f48916x2ea350, arrayList);
        return arrayList;
    }

    /* renamed from: setClip */
    public void m98498x7648d2d2(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e79) {
        this.f48916x2ea350 = c25874xcf526e79;
    }

    /* renamed from: setTimeEffects */
    public void m98499x2cdf27b3(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327[] c25868xc958f327Arr) {
        this.f48917xbca36d75 = c25868xc958f327Arr;
    }

    public C25869x858a0a74(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e79, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327> list) {
        this.f48916x2ea350 = c25874xcf526e79;
        this.f48917xbca36d75 = (com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327[]) list.toArray();
    }

    public C25869x858a0a74(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e79, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25868xc958f327... c25868xc958f327Arr) {
        this.f48916x2ea350 = c25874xcf526e79;
        this.f48917xbca36d75 = c25868xc958f327Arr;
    }
}
