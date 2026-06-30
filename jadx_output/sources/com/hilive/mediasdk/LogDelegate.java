package com.hilive.mediasdk;

/* loaded from: classes7.dex */
public class LogDelegate {
    private static com.hilive.mediasdk.LogDelegate.ILog sImp = new com.hilive.mediasdk.LogDelegate.DefaultLog();

    /* loaded from: classes7.dex */
    public static class DefaultLog implements com.hilive.mediasdk.LogDelegate.ILog {
        private DefaultLog() {
        }

        @Override // com.hilive.mediasdk.LogDelegate.ILog
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

        @Override // com.hilive.mediasdk.LogDelegate.ILog
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

        @Override // com.hilive.mediasdk.LogDelegate.ILog
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

        @Override // com.hilive.mediasdk.LogDelegate.ILog
        public void printStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
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

        @Override // com.hilive.mediasdk.LogDelegate.ILog
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

        @Override // com.hilive.mediasdk.LogDelegate.ILog
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

    /* loaded from: classes7.dex */
    public interface ILog {
        void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void printStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr);

        void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        sImp.d(str, str2, objArr);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        sImp.e(str, str2, objArr);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        sImp.i(str, str2, objArr);
    }

    public static void printStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        sImp.printStackTrace(str, th6, str2, objArr);
    }

    public static void setImp(com.hilive.mediasdk.LogDelegate.ILog iLog) {
        if (iLog != null) {
            sImp = iLog;
        }
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        sImp.v(str, str2, objArr);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        sImp.w(str, str2, objArr);
    }
}
