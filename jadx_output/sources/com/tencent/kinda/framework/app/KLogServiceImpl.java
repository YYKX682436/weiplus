package com.tencent.kinda.framework.app;

/* loaded from: classes7.dex */
public class KLogServiceImpl implements com.tencent.kinda.gen.KLogService {
    @Override // com.tencent.kinda.gen.KLogService
    public void debug(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.kinda.gen.KLogService
    public void error(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e(str, str2);
    }

    @Override // com.tencent.kinda.gen.KLogService
    public void info(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i(str, str2);
    }

    @Override // com.tencent.kinda.gen.KLogService
    public void verbose(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.kinda.gen.KLogService
    public void warning(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.w(str, str2);
    }
}
