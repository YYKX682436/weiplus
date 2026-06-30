package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07;

/* loaded from: classes10.dex */
public final class c implements com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f257348a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f257349b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 f257350c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f257351d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f257352e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f257353f;

    /* renamed from: g, reason: collision with root package name */
    public int f257354g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f257355h;

    /* renamed from: i, reason: collision with root package name */
    public int f257356i;

    /* renamed from: j, reason: collision with root package name */
    public int f257357j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f257358k;

    public c(java.lang.String path, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f257348a = path;
        this.f257349b = "MicroMsg.ParallelVideoJniMuxer[" + hashCode() + ']';
        this.f257353f = new java.util.ArrayList();
        this.f257354g = -1;
        this.f257358k = new java.util.ArrayList();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b a() {
        java.lang.Object obj;
        java.util.Iterator it = this.f257353f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b) obj).f257337a) {
                break;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b) obj;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: addTrack */
    public int mo72369xb5bac52a(android.media.MediaFormat format) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257349b, "[" + hashCode() + "]add track " + format.getString("mime"));
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b.f257336l.a(format, java.lang.String.valueOf(hashCode()));
        this.f257353f.add(a17);
        return a17.f257338b;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: audioTrackIndex */
    public int mo72370xe37182bd() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b a17 = a();
        if (a17 != null) {
            return a17.f257338b;
        }
        return -1;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b b() {
        java.lang.Object obj;
        java.util.Iterator it = this.f257353f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b) obj).f257337a) {
                break;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b) obj;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: clearResource */
    public void mo72372xbfab417b() {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b bVar : this.f257353f) {
            com.p314xaae8f345.mm.vfs.w6.h(bVar.f257342f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257349b, "clearResource:" + bVar.f257342f);
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: getExportConfig */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 mo72379x12477e8c() {
        return this.f257350c;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: ignoreHeader */
    public boolean mo72384xf2d0a6ff() {
        return false;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: isMuxerStarted */
    public boolean mo72385x5b9eb38e() {
        return this.f257351d;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: prepareParallelSegmentInfo */
    public void mo72387x60565d73(int i17, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262) {
        this.f257354g = i17;
        this.f257355h = c25738xead39d26;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257349b, "index:" + i17 + " segmentRange:" + c25738xead39d26 + " allRange:" + c25738xead39d262);
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: release */
    public void mo72388x41012807() {
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: setExportConfig */
    public void mo72392x48907998(com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 exportConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportConfig, "exportConfig");
        this.f257350c = exportConfig;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: start */
    public void mo72397x68ac462() {
        this.f257351d = true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: stop */
    public boolean mo72398x360802(boolean z17) {
        if (!this.f257352e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257349b, "muxer[" + hashCode() + "][" + this.f257354g + "] stop  timeCount:" + this.f257356i + "  dataCount:" + this.f257357j);
            java.util.Iterator it = this.f257353f.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b) it.next();
                bVar.getClass();
                try {
                    java.nio.channels.WritableByteChannel writableByteChannel = bVar.f257346j;
                    if (writableByteChannel != null) {
                        writableByteChannel.close();
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            this.f257352e = true;
            this.f257351d = false;
        }
        return true;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: videoTrackIndex */
    public int mo72399x8d453122() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b b17 = b();
        if (b17 != null) {
            return b17.f257338b;
        }
        return -1;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: writeSampleData */
    public void mo72400xe78c1db3(int i17, java.nio.ByteBuffer byteBuf, android.media.MediaCodec.BufferInfo bufferInfo) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteBuf, "byteBuf");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferInfo, "bufferInfo");
        if (this.f257352e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257349b, "writeSampleData error,has finished");
            return;
        }
        java.util.Iterator it = this.f257353f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b) obj).f257338b == i17) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b) obj;
        if (bVar != null) {
            if (bVar.f257337a && bufferInfo.presentationTimeUs == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f257349b, "[" + hashCode() + "]writeSampleData pts track id:" + i17 + "  timeUs:" + bufferInfo.presentationTimeUs);
            }
            bVar.a(byteBuf, bufferInfo);
            this.f257357j++;
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.p2963x637007d.InterfaceC25803x5eabc422
    /* renamed from: writeSampleDataTime */
    public void mo72401xe437d320(boolean z17, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 sampleTime) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sampleTime, "sampleTime");
        if (this.f257352e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257349b, "writeSampleDataTime error,has finished");
            return;
        }
        this.f257356i++;
        if (z17) {
            if (b() == null) {
                this.f257358k.add(java.lang.Long.valueOf(sampleTime.m97232x31040141()));
                return;
            }
            if (!this.f257358k.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257349b, "videoTrack cache dts size:" + this.f257358k.size());
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b b17 = b();
                if (b17 != null && (arrayList3 = b17.f257343g) != null) {
                    arrayList3.addAll(this.f257358k);
                }
                this.f257358k.clear();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b b18 = b();
            if (b18 == null || (arrayList = b18.f257343g) == null) {
                return;
            }
            if (arrayList.size() <= 2 || sampleTime.m97232x31040141() > ((java.lang.Number) kz5.n0.i0(arrayList)).longValue()) {
                arrayList.add(java.lang.Long.valueOf(sampleTime.m97232x31040141()));
            } else {
                long longValue = ((java.lang.Number) kz5.n0.i0(arrayList)).longValue();
                long longValue2 = ((java.lang.Number) arrayList.get(1)).longValue();
                java.lang.Object obj = arrayList.get(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                long longValue3 = longValue + (longValue2 - ((java.lang.Number) obj).longValue());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f257349b, "writeSampleDataTime error timeus:" + sampleTime.m97232x31040141());
                arrayList.add(java.lang.Long.valueOf(longValue3));
            }
            sampleTime.m97232x31040141();
            arrayList.size();
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2326x45d22e07.b b19 = b();
            if (b19 == null || (arrayList2 = b19.f257343g) == null) {
                return;
            }
            arrayList2.size();
        }
    }
}
