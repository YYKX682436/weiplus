package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes11.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.TaskResult f134496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.TaskResult taskResult) {
        super(0);
        this.f134496d = taskResult;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean m41229xce827bcd;
        int i17;
        java.lang.Object waitException;
        int i18;
        int i19;
        java.lang.String m41228x75286adb;
        int i27;
        java.lang.String m41228x75286adb2;
        int i28;
        int i29;
        java.lang.String m41228x75286adb3;
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.TaskResult taskResult = this.f134496d;
        m41229xce827bcd = taskResult.m41229xce827bcd();
        if (m41229xce827bcd) {
            return null;
        }
        i17 = taskResult.type;
        if (i17 == -1) {
            i18 = taskResult.code;
            waitException = new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.WaitException(i18);
        } else if (i17 == 0) {
            i19 = taskResult.code;
            m41228x75286adb = taskResult.m41228x75286adb();
            waitException = new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.UnexpectedExitException(i19, m41228x75286adb, taskResult.getError());
        } else if (i17 != 1) {
            i28 = taskResult.type;
            i29 = taskResult.code;
            m41228x75286adb3 = taskResult.m41228x75286adb();
            waitException = new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.UnknownAnalyzeException(i28, i29, m41228x75286adb3, taskResult.getError());
        } else {
            i27 = taskResult.code;
            m41228x75286adb2 = taskResult.m41228x75286adb();
            waitException = new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.C4705xed2494c3.TerminateException(i27, m41228x75286adb2, taskResult.getError());
        }
        return waitException;
    }
}
