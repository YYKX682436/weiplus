package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public class i3 implements ku5.i {
    public i3(com.p314xaae8f345.mm.p642xad8b531f.p3 p3Var) {
    }

    @Override // ku5.i
    public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, java.lang.String.format(str2, objArr));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ThreadBootDelegate", th6, "", new java.lang.Object[0]);
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ThreadBootDelegate", str2.replace("%", "o/o"));
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ThreadBootDelegate", th7, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // ku5.i
    public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, java.lang.String.format(str2, objArr));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ThreadBootDelegate", th6, "", new java.lang.Object[0]);
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadBootDelegate", str2.replace("%", "o/o"));
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ThreadBootDelegate", th7, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // ku5.i
    public void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, java.lang.String.format(str2, objArr));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ThreadBootDelegate", th6, "", new java.lang.Object[0]);
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ThreadBootDelegate", str2.replace("%", "o/o"));
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ThreadBootDelegate", th7, "", new java.lang.Object[0]);
            }
        }
    }
}
