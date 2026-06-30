package ih2;

/* loaded from: classes10.dex */
public final class e implements hh2.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f373091a;

    /* renamed from: b, reason: collision with root package name */
    public final ny5.a f373092b = new ny5.e(ih2.d.f373090d);

    /* renamed from: c, reason: collision with root package name */
    public ny5.c f373093c = ny5.c.reverbRecordingStudio;

    /* renamed from: d, reason: collision with root package name */
    public final lh2.a f373094d = new lh2.a("tme_reverb_temp.pcm");

    /* renamed from: e, reason: collision with root package name */
    public hh2.b f373095e;

    @Override // hh2.a
    public void a(hh2.b callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f373095e = callback;
    }

    @Override // hh2.a
    public boolean b(om2.m type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f373093c = d(type);
        if (!this.f373091a) {
            return false;
        }
        boolean a17 = ((ny5.e) this.f373092b).a(d(type));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVReverbTMECore", "setReverbId type: " + type + " res: " + a17);
        return a17;
    }

    @Override // hh2.a
    public void c(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame audioFrame) {
        boolean z17;
        boolean z18;
        boolean z19;
        int m122175x316510;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioFrame, "audioFrame");
        boolean z27 = this.f373091a;
        ny5.a aVar = this.f373092b;
        if (!z27) {
            int i17 = audioFrame.f57043x88751aa;
            int i18 = audioFrame.f57040x2c0b7d03;
            ny5.e eVar = (ny5.e) aVar;
            eVar.getClass();
            com.tme.p3259xc83515e4.p3261x90efbf1b.C28055x95510192.f65740x233c02ec.getClass();
            z19 = com.tme.p3259xc83515e4.p3261x90efbf1b.C28055x95510192.f65741x141089db;
            if (z19) {
                m122175x316510 = eVar.f423014b.m122175x316510(i17, i18);
                yz5.l lVar = eVar.f423013a;
                if (lVar != null) {
                    lVar.mo146xb9724478(kz5.c1.k(new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.String.valueOf(m122175x316510)), new jz5.l("type", "reverb")));
                }
            } else {
                m122175x316510 = -1000;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVReverbTMECore", "init  res: " + m122175x316510 + " setRes: " + eVar.a(this.f373093c));
            this.f373091a = true;
            hh2.b bVar = this.f373095e;
            if (bVar != null) {
                ((dh2.v) bVar).f313998a.f314008o = m122175x316510;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "onReverbInitResult: " + m122175x316510);
            }
            if (m122175x316510 != 0) {
                pm0.z.b(xy2.b.f539688b, "tmeReverbInitError", false, null, null, false, false, new ih2.c(m122175x316510, audioFrame), 60, null);
            }
        }
        if (this.f373091a) {
            byte[] data = audioFrame.f57041x2eefaa;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data, "data");
            int length = audioFrame.f57041x2eefaa.length;
            ny5.e eVar2 = (ny5.e) aVar;
            eVar2.getClass();
            com.tme.p3259xc83515e4.p3261x90efbf1b.C28055x95510192.f65740x233c02ec.getClass();
            z17 = com.tme.p3259xc83515e4.p3261x90efbf1b.C28055x95510192.f65741x141089db;
            if (z17) {
                java.nio.ByteBuffer tempBuffer = eVar2.f423015c;
                if (tempBuffer == null) {
                    tempBuffer = java.nio.ByteBuffer.allocateDirect(length);
                }
                eVar2.f423015c = tempBuffer;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tempBuffer, "tempBuffer");
                int i19 = length;
                while (i19 > 0) {
                    tempBuffer.clear();
                    int min = java.lang.Math.min(java.lang.Math.min(length, tempBuffer.limit()), i19);
                    int i27 = length - i19;
                    tempBuffer.put(data, i27, min);
                    if (eVar2.f423014b.m122180x9001bd1e(tempBuffer, min) < 0) {
                        break;
                    }
                    tempBuffer.flip();
                    tempBuffer.get(data, i27, min);
                    i19 -= min;
                }
            }
            byte[] data2 = audioFrame.f57041x2eefaa;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data2, "data");
            int length2 = audioFrame.f57041x2eefaa.length;
            eVar2.getClass();
            com.tme.p3259xc83515e4.p3261x90efbf1b.C28055x95510192.f65740x233c02ec.getClass();
            z18 = com.tme.p3259xc83515e4.p3261x90efbf1b.C28055x95510192.f65741x141089db;
            if (z18) {
                java.nio.ByteBuffer tempBuffer2 = eVar2.f423016d;
                if (tempBuffer2 == null) {
                    tempBuffer2 = java.nio.ByteBuffer.allocateDirect(length2);
                }
                eVar2.f423016d = tempBuffer2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tempBuffer2, "tempBuffer");
                int i28 = length2;
                while (i28 > 0) {
                    tempBuffer2.clear();
                    int min2 = java.lang.Math.min(java.lang.Math.min(length2, tempBuffer2.limit()), i28);
                    int i29 = length2 - i28;
                    tempBuffer2.put(data2, i29, min2);
                    if (eVar2.f423014b.m122179x49f49d1d(tempBuffer2, min2) < 0) {
                        break;
                    }
                    tempBuffer2.flip();
                    tempBuffer2.get(data2, i29, min2);
                    i28 -= min2;
                }
            }
            byte[] data3 = audioFrame.f57041x2eefaa;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data3, "data");
            this.f373094d.b(data3, audioFrame.f57041x2eefaa.length);
        }
    }

    public final ny5.c d(om2.m mVar) {
        int i17 = mVar.f427889d;
        om2.m mVar2 = om2.m.f427880g;
        if (i17 == 15) {
            return ny5.c.reverbSinger;
        }
        om2.m mVar3 = om2.m.f427880g;
        if (i17 == 9) {
            return ny5.c.reverbTheater;
        }
        om2.m mVar4 = om2.m.f427880g;
        if (i17 == 10) {
            return ny5.c.reverChurch;
        }
        om2.m mVar5 = om2.m.f427880g;
        if (i17 == 11) {
            return ny5.c.reverbConcertHall;
        }
        om2.m mVar6 = om2.m.f427880g;
        if (i17 == 12) {
            return ny5.c.reverbPianoRoom;
        }
        om2.m mVar7 = om2.m.f427880g;
        if (i17 == 13) {
            return ny5.c.reverbOriginalSound;
        }
        om2.m mVar8 = om2.m.f427880g;
        return i17 == 14 ? ny5.c.reverbCD : ny5.c.reverbRecordingStudio;
    }
}
