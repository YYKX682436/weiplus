package com.p290xb772556d.p291xca4f91d6;

/* renamed from: com.hilive.mediasdk.LogDelegate */
/* loaded from: classes7.dex */
public class C2826xfbf608c9 {

    /* renamed from: sImp */
    private static com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.ILog f9491x356659 = new com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.DefaultLog();

    /* renamed from: com.hilive.mediasdk.LogDelegate$DefaultLog */
    /* loaded from: classes7.dex */
    public static class DefaultLog implements com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.ILog {
        private DefaultLog() {
        }

        @Override // com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.ILog
        public void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        java.lang.String.format(str2, objArr);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        }

        @Override // com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.ILog
        public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        java.lang.String.format(str2, objArr);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        }

        @Override // com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.ILog
        public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        java.lang.String.format(str2, objArr);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        }

        @Override // com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.ILog
        /* renamed from: printStackTrace */
        public void mo21007x6e0e6e2a(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
            if (th6 == null || objArr == null) {
                return;
            }
            try {
                if (objArr.length > 0) {
                    java.lang.String.format(str2, objArr);
                }
            } catch (java.lang.Exception unused) {
            }
        }

        @Override // com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.ILog
        public void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        java.lang.String.format(str2, objArr);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        }

        @Override // com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.ILog
        public void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        java.lang.String.format(str2, objArr);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.hilive.mediasdk.LogDelegate$ILog */
    /* loaded from: classes7.dex */
    public interface ILog {
        void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        /* renamed from: printStackTrace */
        void mo21007x6e0e6e2a(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr);

        void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        f9491x356659.d(str, str2, objArr);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        f9491x356659.e(str, str2, objArr);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        f9491x356659.i(str, str2, objArr);
    }

    /* renamed from: printStackTrace */
    public static void m21005x6e0e6e2a(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        f9491x356659.mo21007x6e0e6e2a(str, th6, str2, objArr);
    }

    /* renamed from: setImp */
    public static void m21006xca02700a(com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.ILog iLog) {
        if (iLog != null) {
            f9491x356659 = iLog;
        }
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        f9491x356659.v(str, str2, objArr);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        f9491x356659.w(str, str2, objArr);
    }
}
