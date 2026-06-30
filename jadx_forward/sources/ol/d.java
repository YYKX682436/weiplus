package ol;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol.h f427619d;

    public d(ol.h hVar) {
        this.f427619d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hl.b bVar;
        int i17;
        android.os.Process.setThreadPriority(-19);
        if (this.f427619d.f427628d.get()) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "stop and exit", null);
            return;
        }
        ol.h hVar = this.f427619d;
        if (hVar.f427625a == null) {
            ol.h.a(hVar);
        }
        int i19 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "playback start", null);
        while (true) {
            if (this.f427619d.f427628d.get()) {
                break;
            }
            ol.h hVar2 = this.f427619d;
            synchronized (hVar2.f427630f) {
                while (hVar2.f427627c.get() && !hVar2.f427628d.get()) {
                    int i27 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "waitPlay", null);
                    try {
                        hVar2.f427630f.wait();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioMixPlayerImpl", e17, "waitPlay", new java.lang.Object[0]);
                    }
                }
            }
            if (this.f427619d.f427628d.get()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "playback break", null);
                break;
            }
            ol.h hVar3 = this.f427619d;
            synchronized (hVar3.f427630f) {
                while (true) {
                    if ((((java.util.ArrayDeque) hVar3.f427629e).size() == 0 || hVar3.f427627c.get()) && !hVar3.f427628d.get()) {
                        try {
                            int i28 = rl.b.f478676a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "wait play", null);
                            hVar3.o(0.0f, 0.0f);
                            android.media.AudioTrack audioTrack = hVar3.f427625a;
                            if (audioTrack != null && audioTrack.getPlayState() == 3) {
                                hVar3.f427625a.stop();
                            }
                            hVar3.f427630f.wait();
                            hVar3.f427648x = 0;
                        } catch (java.lang.InterruptedException e18) {
                            int i29 = rl.b.f478676a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioMixPlayerImpl", e18, "waitPlay", new java.lang.Object[0]);
                        }
                    }
                }
                bVar = (hl.b) ((java.util.ArrayDeque) hVar3.f427629e).poll();
                hVar3.f427630f.notifyAll();
            }
            if (bVar != null) {
                byte[] bArr = bVar.f363549c;
                ol.h hVar4 = this.f427619d;
                if (hVar4.f427625a == null) {
                    ol.h.a(hVar4);
                }
                if (bArr != null && bArr.length > 0) {
                    android.media.AudioTrack audioTrack2 = this.f427619d.f427625a;
                    if (audioTrack2 != null && (audioTrack2.getPlayState() == 1 || this.f427619d.f427625a.getPlayState() == 2)) {
                        this.f427619d.f427625a.play();
                    }
                    ol.h.b(this.f427619d, bVar);
                    ol.h hVar5 = this.f427619d;
                    hVar5.f427648x++;
                    hVar5.k(bVar);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    ol.h hVar6 = this.f427619d;
                    if (hVar6.f427625a != null) {
                        if (hVar6.f427633i.f419649e.get()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "isMute", null);
                            this.f427619d.f427625a.setStereoVolume(0.0f, 0.0f);
                        } else {
                            this.f427619d.f427625a.setStereoVolume(1.0f, 1.0f);
                        }
                        i17 = this.f427619d.f427625a.write(bArr, 0, bArr.length);
                    } else {
                        i17 = 0;
                    }
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    if (currentTimeMillis2 > 100) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "write audio track after writeSize:%d, time:%d, writeCount:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Integer.valueOf(this.f427619d.f427648x));
                    }
                    if (i17 < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "write audio track buffer failed, Size:%d", java.lang.Integer.valueOf(i17));
                    }
                    if (((java.util.ArrayDeque) this.f427619d.f427629e).size() == 0) {
                        byte[] bArr2 = this.f427619d.f427645u;
                        bArr2[0] = bArr[bArr.length - 2];
                        bArr2[1] = bArr[bArr.length - 1];
                    }
                }
                if (il.f.f373519b == null) {
                    synchronized (il.f.class) {
                        if (il.f.f373519b == null) {
                            il.f.f373519b = new il.f();
                        }
                    }
                }
                il.f fVar = il.f.f373519b;
                synchronized (fVar) {
                    if (bVar.f363549c != null) {
                        bVar.f363548b = 0;
                        bVar.f363547a = 0;
                        bVar.f363550d.clear();
                        byte[] bArr3 = bVar.f363549c;
                        java.util.Arrays.fill(bArr3, 0, bArr3.length, (byte) 0);
                        fVar.f373520a.add(0, bVar);
                    }
                }
            }
        }
        ol.h hVar7 = this.f427619d;
        synchronized (hVar7) {
            try {
                android.media.AudioTrack audioTrack3 = hVar7.f427625a;
                if (audioTrack3 != null) {
                    audioTrack3.flush();
                    hVar7.f427625a.stop();
                    hVar7.f427625a.release();
                    hVar7.f427625a = null;
                }
            } catch (java.lang.Exception e19) {
                int i37 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioMixPlayerImpl", e19, "releaseAudioTrack", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "release AudioTrack and exit playback thread id:%d", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }
}
