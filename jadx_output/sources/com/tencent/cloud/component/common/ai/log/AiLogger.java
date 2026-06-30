package com.tencent.cloud.component.common.ai.log;

/* loaded from: classes14.dex */
public class AiLogger {
    public com.tencent.cloud.component.common.ai.log.AiLogConfig config;
    public com.tencent.cloud.component.common.ai.log.b printer;

    public AiLogger(android.content.Context context, com.tencent.cloud.component.common.ai.log.AiLogConfig aiLogConfig) {
        this.config = aiLogConfig;
        this.printer = new com.tencent.cloud.component.common.ai.log.b(context, aiLogConfig);
    }

    private java.lang.String formatString(java.lang.String str, java.lang.Object... objArr) {
        if (str != null) {
            return java.lang.String.format(str, objArr);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = objArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 != 0) {
                sb6.append(", ");
            }
            sb6.append(objArr[i17]);
        }
        return sb6.toString();
    }

    public void asset(java.lang.String str, java.lang.String str2) {
        com.tencent.cloud.component.common.ai.log.b bVar = this.printer;
        if (bVar != null) {
            bVar.a(7, str, str2);
        }
    }

    public void debug(java.lang.String str, java.lang.String str2) {
        com.tencent.cloud.component.common.ai.log.b bVar = this.printer;
        if (bVar != null) {
            bVar.a(3, str, str2);
        }
    }

    public void error(java.lang.String str, java.lang.String str2) {
        com.tencent.cloud.component.common.ai.log.b bVar = this.printer;
        if (bVar != null) {
            bVar.a(6, str, str2);
        }
    }

    public void info(java.lang.String str, java.lang.String str2) {
        com.tencent.cloud.component.common.ai.log.b bVar = this.printer;
        if (bVar != null) {
            bVar.a(4, str, str2);
        }
    }

    public void release() {
        com.tencent.cloud.component.common.ai.log.c cVar;
        com.tencent.cloud.component.common.ai.log.b bVar = this.printer;
        if (bVar != null && (cVar = bVar.f45883e) != null) {
            cVar.removeMessages(1);
            com.tencent.cloud.component.common.ai.log.c cVar2 = bVar.f45883e;
            com.tencent.cloud.component.common.ai.log.f fVar = cVar2.f45888d;
            if (fVar != null) {
                fVar.a();
            }
            cVar2.f45888d = null;
            bVar.f45883e = null;
            android.os.HandlerThread handlerThread = bVar.f45884f;
            if (handlerThread != null && handlerThread.isAlive()) {
                bVar.f45884f.quitSafely();
            }
        }
        this.printer = null;
    }

    public void verbose(java.lang.String str, java.lang.String str2) {
        com.tencent.cloud.component.common.ai.log.b bVar = this.printer;
        if (bVar != null) {
            bVar.a(3, str, str2);
        }
    }

    public void warn(java.lang.String str, java.lang.String str2) {
        com.tencent.cloud.component.common.ai.log.b bVar = this.printer;
        if (bVar != null) {
            bVar.a(5, str, str2);
        }
    }

    public void asset(java.lang.String str) {
        asset(this.config.getDefaultTag(), str);
    }

    public void debug(java.lang.String str) {
        debug(this.config.getDefaultTag(), str);
    }

    public void error(java.lang.String str) {
        error(this.config.getDefaultTag(), str);
    }

    public void info(java.lang.String str) {
        info(this.config.getDefaultTag(), str);
    }

    public void verbose(java.lang.String str) {
        verbose(this.config.getDefaultTag(), str);
    }

    public void warn(java.lang.String str) {
        warn(this.config.getDefaultTag(), str);
    }

    public void asset(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        asset(str, formatString(str2, objArr));
    }

    public void debug(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        debug(str, formatString(str2, objArr));
    }

    public void error(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        error(str, formatString(str2, objArr));
    }

    public void info(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        info(str, formatString(str2, objArr));
    }

    public void verbose(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        verbose(str, formatString(str2, objArr));
    }

    public void warn(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        warn(str, formatString(str2, objArr));
    }
}
