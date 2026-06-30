package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002;

/* renamed from: com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil */
/* loaded from: classes13.dex */
public class C25455xa9b92778 {

    /* renamed from: CUR_CPU_FREQ */
    private static final java.lang.String f46167x6a2060e = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq";
    private static final java.lang.String TAG = "CpuInfoUtil";

    /* renamed from: mCurrThread */
    private static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25455xa9b92778.OutputCpuThread f46168x7df1cb29;

    /* renamed from: com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil$OutputCpuThread */
    /* loaded from: classes13.dex */
    public static class OutputCpuThread extends java.lang.Thread {

        /* renamed from: isStop */
        public boolean f46169xb9a8e44c;

        public OutputCpuThread(java.lang.String str) {
            super(str);
            this.f46169xb9a8e44c = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            java.lang.Process process;
            super.run();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.io.BufferedReader bufferedReader = null;
            try {
                try {
                    process = java.lang.Runtime.getRuntime().exec("top -m 10 -s cpu -t");
                    try {
                        java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()));
                        bufferedReader = null;
                        loop0: while (true) {
                            int i17 = 0;
                            while (true) {
                                try {
                                    try {
                                        java.lang.String readLine = bufferedReader2.readLine();
                                        if (readLine == null || this.f46169xb9a8e44c) {
                                            try {
                                                bufferedReader2.close();
                                                break loop0;
                                            } catch (java.io.IOException e17) {
                                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25455xa9b92778.TAG, e17);
                                            }
                                        } else {
                                            i17++;
                                            sb6.append(readLine);
                                            sb6.append("\n");
                                            if (i17 > 15) {
                                                try {
                                                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25455xa9b92778.TAG, sb6.toString());
                                                    sb6.delete(0, sb6.length() - 1);
                                                    java.lang.Thread.sleep(5000L);
                                                    break;
                                                } catch (java.lang.Exception e18) {
                                                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25455xa9b92778.TAG, e18);
                                                }
                                            }
                                        }
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        bufferedReader = bufferedReader2;
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (java.io.IOException e19) {
                                                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25455xa9b92778.TAG, e19);
                                            }
                                        }
                                        if (process == null) {
                                            throw th;
                                        }
                                        process.destroy();
                                        throw th;
                                    }
                                } catch (java.lang.Exception e27) {
                                    e = e27;
                                    bufferedReader = bufferedReader2;
                                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25455xa9b92778.TAG, e);
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (java.io.IOException e28) {
                                            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25455xa9b92778.TAG, e28);
                                        }
                                    }
                                    if (process == null) {
                                        return;
                                    }
                                    process.destroy();
                                }
                            }
                        }
                    } catch (java.lang.Exception e29) {
                        e = e29;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                }
            } catch (java.lang.Exception e37) {
                e = e37;
                process = null;
            } catch (java.lang.Throwable th8) {
                th = th8;
                process = null;
            }
            process.destroy();
        }
    }

    /* renamed from: outputCpuHZToLog */
    public static void m94358x53656210() {
    }

    /* renamed from: outputThreadInfoToLog */
    public static void m94359xad294890() {
    }

    /* renamed from: startProcessInfoOutput */
    public static synchronized void m94360x373636dc() {
        synchronized (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25455xa9b92778.class) {
        }
    }

    /* renamed from: stopProcessInfoOutput */
    public static synchronized void m94361x7246a73c() {
        synchronized (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25455xa9b92778.class) {
            f46168x7df1cb29 = null;
        }
    }
}
