package tl;

/* loaded from: classes14.dex */
public final class b0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public volatile tl.c0 f501560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl.d0 f501561e;

    public b0(tl.d0 d0Var) {
        this.f501561e = d0Var;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "RecordModeAsyncRead_record";
    }

    @Override // java.lang.Runnable
    public void run() {
        tl.d0 d0Var;
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", "RecordThread started. frameSize:%d", java.lang.Integer.valueOf(this.f501561e.f501563e));
        if (-123456789 != this.f501561e.f501579b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", "set priority to " + this.f501561e.f501579b);
            android.os.Process.setThreadPriority(this.f501561e.f501579b);
        }
        synchronized (this.f501561e.f501575q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", "RecordRunnable#run lock[%s] mStatusLock[%s]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), this.f501561e.f501575q);
            tl.d0 d0Var2 = this.f501561e;
            if (1 != d0Var2.f501564f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordModeAsyncRead", "status is not inited, now status: " + this.f501561e.f501564f);
                return;
            }
            d0Var2.f501564f = 2;
            byte[] bArr = new byte[d0Var2.f501563e];
            while (true) {
                tl.d0 d0Var3 = this.f501561e;
                if (2 != d0Var3.f501564f) {
                    break;
                }
                synchronized (d0Var3.f501574p) {
                    this.f501561e.getClass();
                }
                tl.d0 d0Var4 = this.f501561e;
                if (d0Var4.f501569k == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", "mAudioRecord is null, so stop record.");
                    synchronized (this.f501561e.f501575q) {
                        this.f501561e.f501564f = 3;
                    }
                    break;
                }
                if (d0Var4.f501562d) {
                    bArr = new byte[d0Var4.f501563e];
                }
                d0Var4.f501580c++;
                new fp.j();
                tl.d0 d0Var5 = this.f501561e;
                int read = d0Var5.f501569k.read(bArr, 0, d0Var5.f501563e);
                tl.d0 d0Var6 = this.f501561e;
                if (2 != d0Var6.f501564f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", "record mode has not been running and break");
                    break;
                }
                tl.e0 e0Var = d0Var6.f501578a;
                if (e0Var != null) {
                    ((tl.u) e0Var).a(read, bArr);
                }
                if (this.f501561e.f501563e != read) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", "read len " + read);
                }
                if (read < this.f501561e.f501563e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", "read too fast? sleep 10 ms");
                    try {
                        java.lang.Thread.sleep(10L);
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
                tl.d0 d0Var7 = this.f501561e;
                tl.c cVar = d0Var7.f501572n;
                if (cVar != null && read > 0) {
                    if (read > bArr.length) {
                        read = bArr.length;
                    }
                    if (d0Var7.f501571m != null) {
                        if (d0Var7.f501566h) {
                            java.util.Arrays.fill(bArr, 0, read, (byte) 0);
                        }
                        to.b bVar = this.f501561e.f501571m;
                        int i18 = -1;
                        if (read > 0) {
                            int i19 = bVar.f502416d;
                            int i27 = bVar.f502417e;
                            if (i19 == i27) {
                                i17 = bVar.f502413a;
                            } else {
                                int i28 = bVar.f502413a;
                                if ((i27 + 1) % i28 == i19) {
                                    i17 = 0;
                                } else {
                                    if (i19 < i27) {
                                        bVar.f502414b = i27 - i19;
                                    } else if (i19 > i27) {
                                        bVar.f502414b = (i27 + i28) - i19;
                                    }
                                    i17 = i28 - bVar.f502414b;
                                }
                            }
                            if (read <= i17) {
                                int i29 = bVar.f502413a;
                                if ((i27 + read) % i29 != i19) {
                                    if (i19 < i27) {
                                        int i37 = i29 - i27;
                                        if (read <= i37) {
                                            java.lang.System.arraycopy(bArr, 0, bVar.f502415c, i27, read);
                                            bVar.f502417e = (bVar.f502417e + read) % bVar.f502413a;
                                        } else {
                                            java.lang.System.arraycopy(bArr, 0, bVar.f502415c, i27, i37);
                                            int i38 = bVar.f502413a - bVar.f502417e;
                                            java.lang.System.arraycopy(bArr, i38, bVar.f502415c, 0, read - i38);
                                            int i39 = bVar.f502413a;
                                            int i47 = read - (i39 - bVar.f502417e);
                                            bVar.f502417e = i47;
                                            bVar.f502417e = i47 % i39;
                                        }
                                    } else {
                                        java.lang.System.arraycopy(bArr, 0, bVar.f502415c, i27, read);
                                        bVar.f502417e = (bVar.f502417e + read) % bVar.f502413a;
                                    }
                                    i18 = 0;
                                }
                            }
                        } else {
                            bVar.getClass();
                        }
                        if (i18 != 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordModeAsyncRead", "WriteToBuffer Failed, ret:%d AudioBuffer length: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f501561e.f501571m.a()));
                        }
                    } else if (cVar == null) {
                        continue;
                    } else {
                        if (d0Var7.f501566h) {
                            java.util.Arrays.fill(bArr, 0, read, (byte) 0);
                        }
                        tl.d0 d0Var8 = this.f501561e;
                        if (2 != d0Var8.f501564f) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", "record mode has not been running and break, do not callback ");
                            break;
                        }
                        d0Var8.f501572n.b(bArr, read);
                    }
                }
            }
            if (this.f501560d != null) {
                tl.z zVar = (tl.z) this.f501560d;
                zVar.f501726a.f501570l.f501560d = null;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = zVar.f501726a.f501568j;
                if (n3Var != null) {
                    n3Var.mo50302x6b17ad39(null);
                    zVar.f501726a.f501568j.m77787xbe88f509();
                    zVar.f501726a.f501568j = null;
                }
                android.os.HandlerThread handlerThread = zVar.f501726a.f501567i;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    zVar.f501726a.f501567i = null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", "finish stopRecord");
                tl.d0 d0Var9 = zVar.f501726a;
                if (d0Var9.f501571m != null) {
                    java.util.concurrent.Future future = d0Var9.f501576r;
                    if (future != null) {
                        future.cancel(false);
                        zVar.f501726a.f501576r = null;
                    }
                    tl.d0 d0Var10 = zVar.f501726a;
                    to.b bVar2 = d0Var10.f501571m;
                    bVar2.f502413a = 0;
                    bVar2.f502414b = 0;
                    bVar2.f502416d = 0;
                    bVar2.f502417e = 0;
                    bVar2.f502415c = null;
                    synchronized (d0Var10.f501573o) {
                        d0Var = zVar.f501726a;
                        d0Var.f501571m = null;
                        d0Var.f501572n = null;
                    }
                    d0Var.f501571m = null;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordModeAsyncRead", "RecordThread exited.");
        }
    }
}
