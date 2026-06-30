package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class m implements java.util.Comparator {
    public m(com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo) obj).f84138m;
        long j18 = ((com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo) obj2).f84138m;
        if (j17 > j18) {
            return -1;
        }
        return j17 < j18 ? 1 : 0;
    }
}
