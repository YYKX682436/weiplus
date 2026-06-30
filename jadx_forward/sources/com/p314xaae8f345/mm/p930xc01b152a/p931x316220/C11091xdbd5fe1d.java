package com.p314xaae8f345.mm.p930xc01b152a.p931x316220;

/* renamed from: com.tencent.mm.mm7zip.impl.VolumedArchiveInStream */
/* loaded from: classes12.dex */
public class C11091xdbd5fe1d implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11038x35e1246e {

    /* renamed from: SEVEN_ZIP_FIRST_VOLUME_POSTFIX */
    private static final java.lang.String f32505x83159f4f = ".7z.001";

    /* renamed from: absoluteLength */
    private long f32506x31bbff3d;

    /* renamed from: absoluteOffset */
    private long f32507x36e528ea;

    /* renamed from: archiveOpenVolumeCallback */
    private final com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11035x5bcc9e82 f32508x5add8acb;

    /* renamed from: currentInStream */
    private com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11038x35e1246e f32509x70d4b19e;

    /* renamed from: currentIndex */
    private int f32510x5654fed9;

    /* renamed from: currentVolumeLength */
    private long f32511xeaa876b9;

    /* renamed from: currentVolumeOffset */
    private long f32512xefd1a066;

    /* renamed from: cuttedVolumeFilename */
    private java.lang.String f32513x3ae65c32;

    /* renamed from: volumePositions */
    private java.util.List<java.lang.Long> f32514x21512270;

    public C11091xdbd5fe1d(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11035x5bcc9e82 interfaceC11035x5bcc9e82) {
        this((java.lang.String) interfaceC11035x5bcc9e82.m47566x40a81b4b(com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.NAME), interfaceC11035x5bcc9e82);
    }

    /* renamed from: openVolume */
    private void m47767x199c9a04(int i17, boolean z17) {
        if (this.f32510x5654fed9 == i17) {
            return;
        }
        for (int size = this.f32514x21512270.size(); size < i17 && this.f32506x31bbff3d == -1; size++) {
            m47767x199c9a04(size, false);
        }
        if (this.f32506x31bbff3d == -1 || this.f32514x21512270.size() > i17) {
            com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11038x35e1246e m47567x2fec7276 = this.f32508x5add8acb.m47567x2fec7276(this.f32513x3ae65c32 + java.text.MessageFormat.format("{0,number,000}", java.lang.Integer.valueOf(i17)));
            if (m47567x2fec7276 == null) {
                this.f32506x31bbff3d = this.f32514x21512270.get(r9.size() - 1).longValue();
                return;
            }
            this.f32509x70d4b19e = m47567x2fec7276;
            if (this.f32514x21512270.size() == i17) {
                long mo47633x35ce78 = this.f32509x70d4b19e.mo47633x35ce78(0L, 2);
                this.f32511xeaa876b9 = mo47633x35ce78;
                if (mo47633x35ce78 == 0) {
                    throw new java.lang.RuntimeException("Volume " + i17 + " is empty");
                }
                java.util.List<java.lang.Long> list = this.f32514x21512270;
                list.add(java.lang.Long.valueOf(list.get(i17 - 1).longValue() + this.f32511xeaa876b9));
                if (z17) {
                    this.f32509x70d4b19e.mo47633x35ce78(0L, 0);
                }
            } else {
                this.f32511xeaa876b9 = this.f32514x21512270.get(i17).longValue() - this.f32514x21512270.get(i17 - 1).longValue();
            }
            if (z17) {
                this.f32512xefd1a066 = 0L;
                this.f32507x36e528ea = this.f32514x21512270.get(i17 - 1).longValue();
            }
            this.f32510x5654fed9 = i17;
        }
    }

    /* renamed from: openVolumeToAbsoluteOffset */
    private void m47768xc8fbe669() {
        int size = this.f32514x21512270.size() - 1;
        long j17 = this.f32506x31bbff3d;
        if (j17 == -1 || this.f32507x36e528ea < j17) {
            while (this.f32514x21512270.get(size).longValue() > this.f32507x36e528ea) {
                size--;
            }
            if (size < this.f32514x21512270.size() - 1) {
                m47767x199c9a04(size + 1, false);
                return;
            }
            do {
                size++;
                m47767x199c9a04(size, false);
                long j18 = this.f32506x31bbff3d;
                if (j18 != -1 && this.f32507x36e528ea >= j18) {
                    return;
                }
            } while (this.f32514x21512270.get(size).longValue() <= this.f32507x36e528ea);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new java.lang.RuntimeException("close() method not supported. The user should implement its own caching and closing stratagies within the IArchiveOpenVolumeCallback.getStream() implementation.");
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11059x8bb0b4d
    /* renamed from: read */
    public synchronized int mo47634x355996(byte[] bArr) {
        long j17 = this.f32506x31bbff3d;
        if (j17 != -1 && this.f32507x36e528ea >= j17) {
            return 0;
        }
        int mo47634x355996 = this.f32509x70d4b19e.mo47634x355996(bArr);
        long j18 = mo47634x355996;
        this.f32507x36e528ea += j18;
        long j19 = this.f32512xefd1a066 + j18;
        this.f32512xefd1a066 = j19;
        if (j19 >= this.f32511xeaa876b9) {
            m47767x199c9a04(this.f32510x5654fed9 + 1, true);
        }
        return mo47634x355996;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11058xd0ed169b
    /* renamed from: seek */
    public synchronized long mo47633x35ce78(long j17, int i17) {
        boolean z17;
        long j18;
        try {
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.RuntimeException("Seek: unknown origin: " + i17);
                    }
                    if (this.f32506x31bbff3d == -1) {
                        m47767x199c9a04(Integer.MAX_VALUE, false);
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    j17 += this.f32506x31bbff3d;
                    if (j17 != this.f32507x36e528ea && !z17) {
                        return j17;
                    }
                    this.f32507x36e528ea = j17;
                    m47768xc8fbe669();
                    j18 = this.f32506x31bbff3d;
                    if (j18 == -1 && j18 <= this.f32507x36e528ea) {
                        this.f32507x36e528ea = j18;
                        return j18;
                    }
                    long longValue = this.f32507x36e528ea - this.f32514x21512270.get(this.f32510x5654fed9 - 1).longValue();
                    this.f32512xefd1a066 = longValue;
                    this.f32509x70d4b19e.mo47633x35ce78(longValue, 0);
                    return j17;
                }
                j17 += this.f32507x36e528ea;
            }
            z17 = false;
            if (j17 != this.f32507x36e528ea) {
            }
            this.f32507x36e528ea = j17;
            m47768xc8fbe669();
            j18 = this.f32506x31bbff3d;
            if (j18 == -1) {
            }
            long longValue2 = this.f32507x36e528ea - this.f32514x21512270.get(this.f32510x5654fed9 - 1).longValue();
            this.f32512xefd1a066 = longValue2;
            this.f32509x70d4b19e.mo47633x35ce78(longValue2, 0);
            return j17;
        } catch (java.lang.Throwable th6) {
            throw th6;
        }
    }

    public C11091xdbd5fe1d(java.lang.String str, com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11035x5bcc9e82 interfaceC11035x5bcc9e82) {
        this.f32506x31bbff3d = -1L;
        this.f32510x5654fed9 = -1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f32514x21512270 = arrayList;
        this.f32508x5add8acb = interfaceC11035x5bcc9e82;
        arrayList.add(0L);
        if (str.endsWith(f32505x83159f4f)) {
            this.f32513x3ae65c32 = str.substring(0, str.length() - 3);
            m47767x199c9a04(1, true);
        } else {
            throw new com.p314xaae8f345.mm.p930xc01b152a.C11078x9fb4b6bb("The first 7z volume filename '" + str + "' don't ends with the postfix: '.7z.001'. Can't proceed");
        }
    }
}
