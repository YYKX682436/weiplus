package com.p314xaae8f345.tav.p2945x58ceaf0;

/* renamed from: com.tencent.tav.asset.MutableCompositionTrack */
/* loaded from: classes16.dex */
public class C25645x2b23f8e7 extends com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1 {

    /* renamed from: extendedLanguageTag */
    private java.lang.String f47117xe373c229;

    /* renamed from: languageCode */
    private java.lang.String f47118x83494965;

    public C25645x2b23f8e7(int i17, int i18) {
        this.f47077x7f94e13e = i17;
        this.f47088xc060d3a6 = i18;
    }

    /* renamed from: findSegmentIndexAt */
    private int m96215x4019180b(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, boolean z17) {
        boolean z18;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        java.util.Iterator<com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212> it = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.iterator();
        boolean z19 = false;
        int i17 = 0;
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 next = it.next();
            if (next.f47092x16fae70.m97253x805f158c(c25736x76b98a57)) {
                z19 = true;
                break;
            }
            c25736x76b98a572 = next.f47092x16fae70.m97258xb58839a5();
            i17++;
        }
        if (z19 || !c25736x76b98a57.m97229x22a7969a(c25736x76b98a572) || i17 <= 0 || !z17) {
            z18 = z19;
        } else {
            i17--;
        }
        if (z18) {
            return i17;
        }
        return -1;
    }

    /* renamed from: getSegmentStartCMTime */
    private com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96216x23fff9fc(int i17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        for (int i18 = 0; i18 < i17 && i18 < ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size(); i18++) {
            c25736x76b98a57 = c25736x76b98a57.add(((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.get(i18).m96172x61b08d48());
        }
        return c25736x76b98a57;
    }

    /* renamed from: getSegmentStartTime */
    private long m96217x8b1fdbd2(int i17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        for (int i18 = 0; i18 < i17 && i18 < ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size(); i18++) {
            c25736x76b98a57 = c25736x76b98a57.add(((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.get(i18).m96172x61b08d48());
        }
        return c25736x76b98a57.m97232x31040141();
    }

    /* renamed from: insertSegment */
    private void m96218x5727a23a(com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212, int i17) {
        if (i17 >= 0) {
            ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(i17, c25640x7df05212);
        } else {
            ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(c25640x7df05212);
        }
        m96224x494a67a7();
    }

    /* renamed from: split */
    private com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212[] m96221x6891b1a(com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        if (c25640x7df05212 == null || c25640x7df05212.f47092x16fae70.m97256x51e8b0a().m97238x9f3f7b48(c25736x76b98a57)) {
            return null;
        }
        float m97232x31040141 = (((float) c25736x76b98a57.m97232x31040141()) * 1.0f) / ((float) c25640x7df05212.f47092x16fae70.m97257x37a7fb48());
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26[] m97265x6891b1a = c25640x7df05212.m96173x35b5540b().m97241x30959487().m97265x6891b1a(m97232x31040141);
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26[] m97265x6891b1a2 = c25640x7df05212.m96173x35b5540b().m97240x2fa78b11().m97265x6891b1a(m97232x31040141);
        if (m97265x6891b1a == null || m97265x6891b1a2 == null) {
            return null;
        }
        com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df052122 = new com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212(c25640x7df05212.m96184xabff72d6(), c25640x7df05212.m96185x83637b55(), m97265x6891b1a2[0], m97265x6891b1a[0], c25640x7df05212.m96186xac019deb());
        com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df052123 = new com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212(c25640x7df05212.m96184xabff72d6(), c25640x7df05212.m96185x83637b55(), m97265x6891b1a2[1], m97265x6891b1a[1], c25640x7df05212.m96186xac019deb());
        c25640x7df052122.f47090xa450d0fe = c25736x76b98a57;
        c25640x7df052123.f47090xa450d0fe = c25640x7df05212.f47090xa450d0fe.sub(c25736x76b98a57);
        return new com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212[]{c25640x7df052122, c25640x7df052123};
    }

    /* renamed from: updateSegmentStartTimeAfterInserted */
    private void m96222x4b907bcf(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        int m96215x4019180b = m96215x4019180b(c25736x76b98a57, false);
        if (m96215x4019180b < 0 || m96215x4019180b >= ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size()) {
            return;
        }
        while (true) {
            m96215x4019180b++;
            if (m96215x4019180b >= ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size()) {
                return;
            }
            com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212 = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.get(m96215x4019180b);
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97241x30959487 = c25640x7df05212.m96173x35b5540b().m97241x30959487();
            c25640x7df05212.m96189xbe4e43d6(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97241x30959487.m97260x75286aac().add(c25738xead39d26.m97256x51e8b0a()), m97241x30959487.m97256x51e8b0a().m97224x5a5dd5d()));
        }
    }

    /* renamed from: updateSegmentsStartTimeAfterRemoved */
    private void m96223x8c637eca(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        int m96215x4019180b = m96215x4019180b(c25738xead39d26.m97260x75286aac(), false);
        if (m96215x4019180b < 0 || m96215x4019180b >= ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size()) {
            return;
        }
        while (m96215x4019180b < ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size()) {
            com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212 = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.get(m96215x4019180b);
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97241x30959487 = c25640x7df05212.m96173x35b5540b().m97241x30959487();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = m97241x30959487.m97260x75286aac();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97256x51e8b0a = c25738xead39d26.m97256x51e8b0a();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47862x218af88f;
            c25640x7df05212.m96189xbe4e43d6(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97260x75286aac.sub(m97256x51e8b0a.add(c25736x76b98a57).add(c25736x76b98a57)), m97241x30959487.m97256x51e8b0a().m97224x5a5dd5d()));
            m96215x4019180b++;
        }
    }

    /* renamed from: updateTimeRange */
    private void m96224x494a67a7() {
        java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212> list = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0;
        if (list != null && list.size() > 0) {
            this.f47086x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.get(0).f47092x16fae70.m97260x75286aac(), mo96150x51e8b0a());
        } else {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
            this.f47086x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a57, c25736x76b98a57);
        }
    }

    /* renamed from: clipRangeAndRemoveOutRange */
    public void m96225xe873509d(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212> list;
        if (c25738xead39d26 == null || c25738xead39d26.m97256x51e8b0a().m97232x31040141() <= 0 || (list = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0) == null || list.size() == 0) {
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25738xead39d26.m97260x75286aac();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5 = c25738xead39d26.m97258xb58839a5();
        int m96215x4019180b = m96215x4019180b(m97260x75286aac, false);
        if (m96215x4019180b == -1) {
            return;
        }
        int m96215x4019180b2 = m96215x4019180b(m97258xb58839a5, false);
        if (m96215x4019180b2 == -1) {
            m96215x4019180b2 = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size() - 1;
        } else if (m96217x8b1fdbd2(m96215x4019180b2) == m97258xb58839a5.m97232x31040141()) {
            m96215x4019180b2--;
        }
        long m96217x8b1fdbd2 = m96217x8b1fdbd2(m96215x4019180b);
        long m96217x8b1fdbd22 = m96217x8b1fdbd2(m96215x4019180b2);
        com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212 = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.get(m96215x4019180b);
        com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df052122 = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.get(m96215x4019180b2);
        long m97232x31040141 = c25738xead39d26.m97258xb58839a5().m97232x31040141() - m96217x8b1fdbd22;
        c25640x7df052122.f47092x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25640x7df052122.f47092x16fae70.m97260x75286aac(), com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.m97303x391f00ab(((float) m97232x31040141) * ((float) (c25640x7df052122.f47090xa450d0fe.m97232x31040141() / c25640x7df052122.f47092x16fae70.m97256x51e8b0a().m97232x31040141()))));
        c25640x7df052122.f47090xa450d0fe = com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.m97303x391f00ab(m97232x31040141);
        float m97232x310401412 = (float) (c25640x7df05212.f47090xa450d0fe.m97232x31040141() / c25640x7df05212.f47092x16fae70.m97256x51e8b0a().m97232x31040141());
        long m97232x310401413 = c25738xead39d26.m97260x75286aac().m97232x31040141() - m96217x8b1fdbd2;
        long j17 = ((float) m97232x310401413) * m97232x310401412;
        c25640x7df05212.f47092x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.m97303x391f00ab(c25640x7df05212.f47092x16fae70.m97260x75286aac().m97232x31040141() + j17), com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.m97303x391f00ab(c25640x7df05212.f47092x16fae70.m97256x51e8b0a().m97232x31040141() - j17));
        c25640x7df05212.f47090xa450d0fe = com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.m97303x391f00ab(c25640x7df05212.f47090xa450d0fe.m97232x31040141() - m97232x310401413);
        for (int size = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size() - 1; size >= 0; size--) {
            if (size > m96215x4019180b2 || size < m96215x4019180b) {
                ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.remove(size);
            }
        }
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b
    /* renamed from: getDuration */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 mo96150x51e8b0a() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        for (int i17 = 0; i17 < ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size(); i17++) {
            c25736x76b98a57 = c25736x76b98a57.add(((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.get(i17).m96172x61b08d48());
        }
        return c25736x76b98a57;
    }

    /* renamed from: getExtendedLanguageTag */
    public java.lang.String m96226x3ba39ef3() {
        return this.f47117xe373c229;
    }

    /* renamed from: getLanguageCode */
    public java.lang.String m96227xe43bdbdb() {
        return this.f47118x83494965;
    }

    /* renamed from: insertCompositionTrackSegment */
    public void m96228x71e58f39(com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = this.f47078x6d2a2fca;
        if ((c25732x76648a85 == null || c25732x76648a85.m97178xb2c87fbf(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85.f47831x448c32cd)) && c25640x7df05212.m96186xac019deb() == 3 && !android.text.TextUtils.isEmpty(c25640x7df05212.m96184xabff72d6())) {
            this.f47078x6d2a2fca = com.p314xaae8f345.tav.p2959x5befac44.C25771x8963c289.m97572xa1ee5e70(c25640x7df05212.m96184xabff72d6());
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97241x30959487 = c25640x7df05212.f47091x5bdf0d41.m97241x30959487();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = m97241x30959487.m97260x75286aac();
        if (((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size() == 0) {
            if (m97241x30959487.m97260x75286aac().f47870x6ac9171 > 0) {
                ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(new com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, m97241x30959487.m97260x75286aac())));
            }
            m96218x5727a23a(c25640x7df05212, -1);
            return;
        }
        int m96215x4019180b = m96215x4019180b(m97260x75286aac, false);
        if (m96215x4019180b != -1) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96216x23fff9fc = m96216x23fff9fc(m96215x4019180b);
            if (m97260x75286aac.m97229x22a7969a(m96216x23fff9fc)) {
                m96218x5727a23a(c25640x7df05212, m96215x4019180b);
            } else {
                com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212[] m96221x6891b1a = m96221x6891b1a(((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.remove(m96215x4019180b), m97260x75286aac.sub(m96216x23fff9fc));
                if (m96221x6891b1a[1].f47090xa450d0fe.m97232x31040141() > 0) {
                    ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(m96215x4019180b, m96221x6891b1a[1]);
                }
                m96218x5727a23a(c25640x7df05212, m96215x4019180b);
                if (m96221x6891b1a[0].f47090xa450d0fe.m97232x31040141() > 0) {
                    ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(m96215x4019180b, m96221x6891b1a[0]);
                }
            }
        } else {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96216x23fff9fc2 = m96216x23fff9fc(((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size());
            if (m97260x75286aac.m97222xf922bec1(m96216x23fff9fc2)) {
                ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(new com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m96216x23fff9fc2, m97260x75286aac.sub(m96216x23fff9fc2))));
            }
            m96218x5727a23a(c25640x7df05212, -1);
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        for (com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df052122 : ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0) {
            c25640x7df052122.m96189xbe4e43d6(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a57, c25640x7df052122.f47090xa450d0fe));
            c25736x76b98a57 = c25736x76b98a57.add(c25640x7df052122.f47090xa450d0fe);
        }
        m96224x494a67a7();
    }

    /* renamed from: insertEmptyTimeRange */
    public void m96229xdf07c6bc(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        m96230x8e3e0bb7(c25738xead39d26, null, c25738xead39d26.m97260x75286aac());
    }

    /* renamed from: insertTimeRange */
    public boolean m96230x8e3e0bb7(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        if (this.f47086x16fae70 == null) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
            this.f47086x16fae70 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a572, c25736x76b98a572);
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = this.f47078x6d2a2fca;
        if ((c25732x76648a85 == null || c25732x76648a85.m97178xb2c87fbf(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85.f47831x448c32cd)) && c25634xf527485b != null) {
            this.f47078x6d2a2fca = c25634xf527485b.f47078x6d2a2fca;
        }
        if (this.f47081x51026f1f == 0 && c25634xf527485b != null) {
            this.f47081x51026f1f = c25634xf527485b.f47081x51026f1f;
        }
        if (c25736x76b98a57 == com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0 || c25736x76b98a57.m97233x754a37bb() < 0) {
            m96219x8e3e0bb7(c25738xead39d26, new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(this.f47086x16fae70.m97256x51e8b0a(), c25738xead39d26.m97256x51e8b0a()), c25634xf527485b, -1);
            return true;
        }
        if (c25738xead39d26.m97256x51e8b0a().f47870x6ac9171 <= 0) {
            return false;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a57, c25738xead39d26.m97256x51e8b0a());
        if (((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size() == 0) {
            if (c25736x76b98a57.f47870x6ac9171 > 0) {
                ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(new com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f, c25736x76b98a57)));
            }
            m96219x8e3e0bb7(c25738xead39d26, c25738xead39d262, c25634xf527485b, -1);
            return true;
        }
        int m96215x4019180b = m96215x4019180b(c25736x76b98a57, false);
        if (m96215x4019180b != -1) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96216x23fff9fc = m96216x23fff9fc(m96215x4019180b);
            if (c25736x76b98a57.m97229x22a7969a(m96216x23fff9fc)) {
                m96219x8e3e0bb7(c25738xead39d26, c25738xead39d262, c25634xf527485b, m96215x4019180b);
            } else {
                com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212[] m96221x6891b1a = m96221x6891b1a(((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.remove(m96215x4019180b), c25736x76b98a57.sub(m96216x23fff9fc));
                if (m96221x6891b1a[1].f47090xa450d0fe.m97232x31040141() > 0) {
                    ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(m96215x4019180b, m96221x6891b1a[1]);
                }
                m96219x8e3e0bb7(c25738xead39d26, c25738xead39d26, c25634xf527485b, m96215x4019180b);
                if (m96221x6891b1a[0].f47090xa450d0fe.m97232x31040141() > 0) {
                    ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(m96215x4019180b, m96221x6891b1a[0]);
                }
            }
        } else {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96216x23fff9fc2 = m96216x23fff9fc(((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size());
            if (c25736x76b98a57.m97222xf922bec1(m96216x23fff9fc2)) {
                ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(new com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m96216x23fff9fc2, c25736x76b98a57.sub(m96216x23fff9fc2))));
            }
            m96219x8e3e0bb7(c25738xead39d26, c25738xead39d262, c25634xf527485b, -1);
        }
        m96224x494a67a7();
        return true;
    }

    /* renamed from: removeTimeRange */
    public void m96231x7f4c2a4c(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        if (c25738xead39d26 == null || !c25738xead39d26.m97262x7b0a0faf()) {
            return;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25738xead39d26.m97260x75286aac();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47862x218af88f;
        m96229xdf07c6bc(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(m97260x75286aac, c25736x76b98a57));
        m96229xdf07c6bc(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25738xead39d26.m97258xb58839a5().add(c25736x76b98a57), c25736x76b98a57));
        int m96215x4019180b = m96215x4019180b(c25738xead39d26.m97260x75286aac(), false);
        int m96215x4019180b2 = m96215x4019180b(c25738xead39d26.m97258xb58839a5().add(c25736x76b98a57), false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size(); i17++) {
            if (i17 < m96215x4019180b || i17 > m96215x4019180b2) {
                arrayList.add(((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.get(i17));
            }
        }
        ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0 = arrayList;
        m96224x494a67a7();
        m96223x8c637eca(c25738xead39d26);
    }

    /* renamed from: scaleTimeRange */
    public void m96232x47f39846(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212> list;
        int m96215x4019180b;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25738xead39d26.m97260x75286aac();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5 = c25738xead39d26.m97258xb58839a5();
        if (c25738xead39d26.m97256x51e8b0a().m97232x31040141() <= 0 || (list = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0) == null || list.size() == 0 || (m96215x4019180b = m96215x4019180b(c25738xead39d26.m97260x75286aac(), false)) == -1) {
            return;
        }
        int m96215x4019180b2 = m96215x4019180b(c25738xead39d26.m97258xb58839a5(), false);
        if (m96215x4019180b2 == -1) {
            m96215x4019180b2 = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.size() - 1;
        } else if (m96216x23fff9fc(m96215x4019180b2).m97229x22a7969a(c25738xead39d26.m97258xb58839a5())) {
            m96215x4019180b2--;
        }
        if (m96215x4019180b == m96215x4019180b2) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96216x23fff9fc = m96216x23fff9fc(m96215x4019180b);
            com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 remove = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.remove(m96215x4019180b);
            if (m97258xb58839a5.m97238x9f3f7b48(m96216x23fff9fc.add(remove.f47090xa450d0fe))) {
                com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212[] m96221x6891b1a = m96221x6891b1a(remove, m97260x75286aac.sub(m96216x23fff9fc));
                remove = m96221x6891b1a[0];
                if (m96221x6891b1a[1].f47090xa450d0fe.m97232x31040141() > 0) {
                    ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(m96215x4019180b, m96221x6891b1a[1]);
                }
            }
            if (m97260x75286aac.m97222xf922bec1(m96216x23fff9fc)) {
                com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212[] m96221x6891b1a2 = m96221x6891b1a(remove, m97260x75286aac.sub(m96216x23fff9fc));
                m96221x6891b1a2[1].f47090xa450d0fe = c25736x76b98a57;
                if (c25736x76b98a57.m97232x31040141() > 0) {
                    ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(m96215x4019180b, m96221x6891b1a2[1]);
                }
                if (m96221x6891b1a2[0].f47090xa450d0fe.m97232x31040141() > 0) {
                    ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(m96215x4019180b, m96221x6891b1a2[0]);
                }
            } else {
                remove.f47090xa450d0fe = c25736x76b98a57;
                ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(m96215x4019180b, remove);
            }
        } else {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96216x23fff9fc2 = m96216x23fff9fc(m96215x4019180b);
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m96216x23fff9fc3 = m96216x23fff9fc(m96215x4019180b2);
            if (m97260x75286aac.m97222xf922bec1(m96216x23fff9fc2)) {
                com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212[] m96221x6891b1a3 = m96221x6891b1a(((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.remove(m96215x4019180b), m97260x75286aac.sub(m96216x23fff9fc2));
                com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212 = m96221x6891b1a3[1];
                c25640x7df05212.f47090xa450d0fe = c25736x76b98a57.m97237x636d539(c25640x7df05212.f47090xa450d0fe).m97227xb0a37c79(c25738xead39d26.m97256x51e8b0a());
                sub = c25736x76b98a57.sub(m96221x6891b1a3[1].f47090xa450d0fe);
                if (m96221x6891b1a3[1].f47090xa450d0fe.m97232x31040141() > 0) {
                    ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(m96215x4019180b, m96221x6891b1a3[1]);
                }
                if (m96221x6891b1a3[0].f47090xa450d0fe.m97232x31040141() > 0) {
                    ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(m96215x4019180b, m96221x6891b1a3[0]);
                }
            } else {
                com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df052122 = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.get(m96215x4019180b);
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97227xb0a37c79 = c25736x76b98a57.m97237x636d539(c25640x7df052122.f47090xa450d0fe).m97227xb0a37c79(c25738xead39d26.m97256x51e8b0a());
                c25640x7df052122.f47090xa450d0fe = m97227xb0a37c79;
                sub = c25736x76b98a57.sub(m97227xb0a37c79);
            }
            for (int i17 = m96215x4019180b + 1; i17 < m96215x4019180b2; i17++) {
                com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df052123 = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.get(i17);
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97227xb0a37c792 = sub.m97237x636d539(c25640x7df052123.f47090xa450d0fe).m97227xb0a37c79(c25738xead39d26.m97256x51e8b0a());
                c25640x7df052123.f47090xa450d0fe = m97227xb0a37c792;
                sub = sub.sub(m97227xb0a37c792);
            }
            com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df052124 = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.get(m96215x4019180b2);
            if (m97258xb58839a5.m97238x9f3f7b48(m96216x23fff9fc3.add(c25640x7df052124.f47090xa450d0fe))) {
                com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212[] m96221x6891b1a4 = m96221x6891b1a(((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.remove(m96215x4019180b2), m97258xb58839a5.sub(m96216x23fff9fc3));
                m96221x6891b1a4[0].f47090xa450d0fe = sub;
                if (m96221x6891b1a4[1].f47090xa450d0fe.m97232x31040141() > 0) {
                    ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(m96215x4019180b2, m96221x6891b1a4[1]);
                }
                if (m96221x6891b1a4[0].f47090xa450d0fe.m97232x31040141() > 0) {
                    ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(m96215x4019180b2, m96221x6891b1a4[0]);
                }
            } else {
                c25640x7df052124.f47090xa450d0fe = sub;
            }
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f;
        for (com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df052125 : ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0) {
            c25640x7df052125.m96189xbe4e43d6(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a572, c25640x7df052125.f47090xa450d0fe));
            c25736x76b98a572 = c25736x76b98a572.add(c25640x7df052125.f47090xa450d0fe);
        }
        m96224x494a67a7();
    }

    /* renamed from: setExtendedLanguageTag */
    public void m96233x89e85e67(java.lang.String str) {
        this.f47117xe373c229 = str;
    }

    /* renamed from: setLanguageCode */
    public void m96234x1a84d6e7(java.lang.String str) {
        this.f47118x83494965 = str;
    }

    /* renamed from: setNaturalSize */
    public void m96235xdd65ea08(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        this.f47078x6d2a2fca = c25732x76648a85;
    }

    /* renamed from: setNaturalTimeScale */
    public void m96236xfeb6a0d6(int i17) {
        this.f47079xb2e1a454 = i17;
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b
    /* renamed from: setPreferredTransform */
    public void mo96170x308e3ed(android.graphics.Matrix matrix) {
        this.f47082x5880ffeb = matrix;
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b
    /* renamed from: setPreferredVolume */
    public void mo96171xf6b22639(float f17) {
        this.f47083xdb79bafb = f17;
    }

    /* renamed from: setSegments */
    public void m96237xb581e622(java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212> list) {
        ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0 = list;
    }

    /* renamed from: validateTrackSegments */
    public boolean m96238x93a32c95(java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212> list) {
        return false;
    }

    /* renamed from: insertTimeRange */
    private void m96219x8e3e0bb7(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262, com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b, int i17) {
        com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212;
        if (c25634xf527485b instanceof com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) {
            m96220x8e3e0bb7(c25738xead39d26, c25738xead39d262, (com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) c25634xf527485b, i17);
            return;
        }
        if (c25634xf527485b != null) {
            c25640x7df05212 = new com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212(c25634xf527485b.m96160xabff72d6(), c25634xf527485b.m96163xfe2e0f70(), c25738xead39d26, c25738xead39d262, c25634xf527485b.m96152x7f025288());
        } else {
            c25640x7df05212 = new com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212(c25738xead39d262);
        }
        if (i17 >= 0) {
            ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(i17, c25640x7df05212);
        } else {
            ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(c25640x7df05212);
        }
        m96224x494a67a7();
    }

    /* renamed from: insertTimeRange */
    private void m96220x8e3e0bb7(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262, com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1 c25639x69afb5e1, int i17) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57;
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25738xead39d26.m97260x75286aac();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a5 = c25738xead39d26.m97258xb58839a5();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac2 = c25738xead39d262.m97260x75286aac();
        float m97257x37a7fb48 = (((float) c25738xead39d262.m97257x37a7fb48()) * 1.0f) / ((float) c25738xead39d26.m97257x37a7fb48());
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = m97260x75286aac2;
        int i18 = i17;
        for (com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212 : c25639x69afb5e1.mo96159xbac98516()) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97241x30959487 = c25640x7df05212.m96173x35b5540b().m97241x30959487();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac3 = m97241x30959487.m97260x75286aac();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97258xb58839a52 = m97241x30959487.m97258xb58839a5();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97224x5a5dd5d = m97260x75286aac3.m97224x5a5dd5d();
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97224x5a5dd5d2 = m97258xb58839a52.m97224x5a5dd5d();
            if (m97260x75286aac3.m97238x9f3f7b48(m97260x75286aac)) {
                m97224x5a5dd5d = c25738xead39d26.m97260x75286aac();
            } else if (m97260x75286aac3.m97222xf922bec1(m97258xb58839a5)) {
                m97224x5a5dd5d = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0;
            }
            if (m97258xb58839a52.m97238x9f3f7b48(m97260x75286aac)) {
                m97224x5a5dd5d2 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0;
            } else if (m97258xb58839a52.m97222xf922bec1(m97258xb58839a5)) {
                m97224x5a5dd5d2 = m97258xb58839a5;
            }
            if (!m97224x5a5dd5d.m97229x22a7969a(m97224x5a5dd5d2) && m97224x5a5dd5d != (c25736x76b98a57 = com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47861xbee5ffa0) && m97224x5a5dd5d2 != c25736x76b98a57) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub = m97224x5a5dd5d.sub(m97260x75286aac3);
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sub2 = m97224x5a5dd5d2.sub(m97224x5a5dd5d);
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97236x636d539 = sub2.m97236x636d539(m97257x37a7fb48);
                com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d263 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25640x7df05212.f47091x5bdf0d41.m97240x2fa78b11().m97260x75286aac().add(sub.m97226xb0a37c79((((float) c25640x7df05212.f47091x5bdf0d41.m97241x30959487().m97257x37a7fb48()) * 1.0f) / ((float) c25640x7df05212.f47091x5bdf0d41.m97240x2fa78b11().m97257x37a7fb48()))), sub2);
                com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d264 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a572, m97236x636d539);
                c25736x76b98a572 = c25736x76b98a572.add(m97236x636d539);
                com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df052122 = new com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212(c25640x7df05212.m96184xabff72d6(), this.f47088xc060d3a6, c25738xead39d263, c25738xead39d264, c25640x7df05212.m96186xac019deb());
                if (i18 >= 0) {
                    ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(i18, c25640x7df052122);
                    i18++;
                } else {
                    ((com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1) this).f47094x3eef47a0.add(c25640x7df052122);
                }
            }
        }
        m96224x494a67a7();
    }
}
