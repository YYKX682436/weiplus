package com.p314xaae8f345.tav.p2945x58ceaf0;

/* renamed from: com.tencent.tav.asset.MutableComposition */
/* loaded from: classes16.dex */
public class C25644x906c22c4 extends com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a<com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7> {
    public C25644x906c22c4() {
        m96212xdd65ea08(new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(0.0f, 0.0f));
    }

    /* renamed from: getCorrectTrackID */
    private int m96204x5a3224d2(int i17) {
        boolean z17;
        java.util.Iterator it = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7) it.next()).m96163xfe2e0f70() == i17) {
                z17 = true;
                break;
            }
        }
        if (!z17 && i17 > 0) {
            return i17;
        }
        if (i17 == -1) {
            int i18 = this.f47068x43ea5e47;
            this.f47068x43ea5e47 = i18 + 1;
            return i18;
        }
        int i19 = this.f47068x43ea5e47;
        if (i19 >= i17) {
            this.f47068x43ea5e47 = i19 + 1;
            return i19;
        }
        this.f47068x43ea5e47 = i17;
        return i17;
    }

    /* renamed from: addMutableTrackWithMediaType */
    public com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7 m96205x7f69e3b2(int i17, int i18) {
        com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7 c25645x2b23f8e7 = new com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7(i17, m96204x5a3224d2(i18));
        c25645x2b23f8e7.m96235xdd65ea08(mo96120x47007694());
        ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888.add(c25645x2b23f8e7);
        this.f47067x43968684++;
        return c25645x2b23f8e7;
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0
    /* renamed from: getNaturalSize */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 mo96120x47007694() {
        if (this.f47058x6d2a2fca.m97178xb2c87fbf(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85.f47831x448c32cd)) {
            for (CTrack ctrack : ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888) {
                if (ctrack.f47075xa00f8b41) {
                    return ctrack.m96153x47007694();
                }
            }
        }
        return this.f47058x6d2a2fca;
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0
    /* renamed from: getPreferRotation */
    public int mo96122xbb14e2a4() {
        if (this.f47061xcc7d15ae == 0) {
            for (CTrack ctrack : ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888) {
                if (ctrack.f47075xa00f8b41) {
                    return ctrack.m96156xa436f669();
                }
            }
        }
        return this.f47061xcc7d15ae;
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a, com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0
    /* renamed from: getTracks */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7> mo96129x317d5b7e() {
        java.util.Objects.toString(((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888);
        return ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888;
    }

    /* renamed from: insertEmptyTimeRange */
    public void m96206xdf07c6bc(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        java.util.Iterator it = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7) it.next()).m96229xdf07c6bc(c25738xead39d26);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r4 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        r4 = r3.m96152x7f025288();
        r5 = r9.f47068x43ea5e47;
        r9.f47068x43ea5e47 = r5 + 1;
        r4 = m96205x7f69e3b2(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r4.m96230x8e3e0bb7(r10, r3, r12) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        r0.add(java.lang.Integer.valueOf(r4.m96163xfe2e0f70()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        return false;
     */
    /* renamed from: insertTimeRange */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m96207x8e3e0bb7(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 r10, com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 r11, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 r12) {
        /*
            r9 = this;
            com.tencent.tav.coremedia.CMTime r0 = r10.m97256x51e8b0a()
            long r0 = r0.f47870x6ac9171
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto Laa
            if (r11 == 0) goto Laa
            int r0 = r11.m96127x31d73e7a()
            if (r0 != 0) goto L17
            goto Laa
        L17:
            java.util.List r11 = r11.mo96129x317d5b7e()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = r1
        L21:
            int r3 = r11.size()
            r4 = 1
            if (r2 >= r3) goto L85
            java.lang.Object r3 = r11.get(r2)
            com.tencent.tav.asset.AssetTrack r3 = (com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b) r3
            r5 = r2
        L2f:
            java.util.List<CTrack extends com.tencent.tav.asset.CompositionTrack> r6 = r9.f47093xcc663888
            int r6 = r6.size()
            if (r5 >= r6) goto L5f
            java.util.List<CTrack extends com.tencent.tav.asset.CompositionTrack> r6 = r9.f47093xcc663888
            java.lang.Object r6 = r6.get(r5)
            com.tencent.tav.asset.MutableCompositionTrack r6 = (com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7) r6
            int r7 = r6.m96152x7f025288()
            int r8 = r3.m96152x7f025288()
            if (r7 != r8) goto L5c
            boolean r5 = r6.m96230x8e3e0bb7(r10, r3, r12)
            if (r5 != 0) goto L50
            return r1
        L50:
            int r5 = r6.m96163xfe2e0f70()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
            goto L60
        L5c:
            int r5 = r5 + 1
            goto L2f
        L5f:
            r4 = r1
        L60:
            if (r4 != 0) goto L82
            int r4 = r3.m96152x7f025288()
            int r5 = r9.f47068x43ea5e47
            int r6 = r5 + 1
            r9.f47068x43ea5e47 = r6
            com.tencent.tav.asset.MutableCompositionTrack r4 = r9.m96205x7f69e3b2(r4, r5)
            boolean r3 = r4.m96230x8e3e0bb7(r10, r3, r12)
            if (r3 != 0) goto L77
            return r1
        L77:
            int r3 = r4.m96163xfe2e0f70()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
        L82:
            int r2 = r2 + 1
            goto L21
        L85:
            java.util.List<CTrack extends com.tencent.tav.asset.CompositionTrack> r11 = r9.f47093xcc663888
            java.util.Iterator r11 = r11.iterator()
        L8b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto La9
            java.lang.Object r12 = r11.next()
            com.tencent.tav.asset.MutableCompositionTrack r12 = (com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7) r12
            int r1 = r12.m96163xfe2e0f70()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L8b
            r12.m96229xdf07c6bc(r10)
            goto L8b
        La9:
            return r4
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.tav.p2945x58ceaf0.C25644x906c22c4.m96207x8e3e0bb7(com.tencent.tav.coremedia.CMTimeRange, com.tencent.tav.asset.Asset, com.tencent.tav.coremedia.CMTime):boolean");
    }

    /* renamed from: mutableTrackCompatibleWithTrack */
    public com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7 m96208x90561dac(com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b c25634xf527485b) {
        if (c25634xf527485b == null || c25634xf527485b.m96146x742a913a() == null) {
            return null;
        }
        com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7 c25645x2b23f8e7 = new com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7(c25634xf527485b.m96152x7f025288(), m96204x5a3224d2(-1));
        c25645x2b23f8e7.m96230x8e3e0bb7(c25634xf527485b.m96161xdd1fba(), c25634xf527485b, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
        c25645x2b23f8e7.mo96170x308e3ed(c25634xf527485b.m96157x6bdd61e1());
        c25645x2b23f8e7.m96169x7fcd02dd(c25634xf527485b.m96156xa436f669());
        c25645x2b23f8e7.mo96171xf6b22639(c25634xf527485b.m96158xbfdb8cc5());
        return c25645x2b23f8e7;
    }

    /* renamed from: removeTimeRange */
    public void m96209x7f4c2a4c(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        java.util.Iterator it = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7) it.next()).m96231x7f4c2a4c(c25738xead39d26);
        }
    }

    /* renamed from: removeTrack */
    public void m96210xede4bb27(com.p314xaae8f345.tav.p2945x58ceaf0.C25639x69afb5e1 c25639x69afb5e1) {
        int i17 = 0;
        while (i17 < ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888.size()) {
            if (((com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7) ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888.get(i17)) == c25639x69afb5e1) {
                ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888.remove(i17);
                i17--;
            }
            i17++;
        }
    }

    /* renamed from: scaleTimeRange */
    public void m96211x47f39846(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        java.util.Iterator it = ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7) it.next()).m96232x47f39846(c25738xead39d26, c25736x76b98a57);
        }
    }

    /* renamed from: setNaturalSize */
    public void m96212xdd65ea08(com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        this.f47058x6d2a2fca = c25732x76648a85;
        for (CTrack ctrack : ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888) {
            if (ctrack != null && ctrack.m96152x7f025288() == 1 && ctrack.m96153x47007694() == null) {
                ctrack.m96235xdd65ea08(c25732x76648a85);
            }
        }
    }

    /* renamed from: setPreferRotation */
    public void m96213x830b4ab0(int i17) {
        this.f47061xcc7d15ae = i17;
    }

    /* renamed from: setPreferredVolume */
    public void m96214xf6b22639(float f17) {
        this.f47064xdb79bafb = f17;
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0
    /* renamed from: tracksWithMediaType */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7> mo96143x6e29e370(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (CTrack ctrack : ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888) {
            if (ctrack != null && ctrack.m96152x7f025288() == i17) {
                arrayList.add(ctrack);
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0
    /* renamed from: trackWithTrackID */
    public com.p314xaae8f345.tav.p2945x58ceaf0.C25645x2b23f8e7 mo96141x94b0f9b5(int i17) {
        for (CTrack ctrack : ((com.p314xaae8f345.tav.p2945x58ceaf0.C25638x3168b18a) this).f47093xcc663888) {
            if (ctrack != null && ctrack.m96163xfe2e0f70() == i17) {
                return ctrack;
            }
        }
        return null;
    }
}
