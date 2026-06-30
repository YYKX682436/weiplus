package com.p159x477cd522.p160x333422.p161x5b09653;

/* renamed from: com.eclipsesource.mmv8.debug.DebugHandler */
/* loaded from: classes7.dex */
public class C1492x68eb7997 implements com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98 {

    /* renamed from: CHANGE_BREAK_POINT_CONDITION */
    private static final java.lang.String f4861xec83463d = "changeBreakPointCondition";

    /* renamed from: CLEAR_BREAK_POINT */
    private static final java.lang.String f4862x551fefe = "clearBreakPoint";

    /* renamed from: DEBUG_BREAK_HANDLER */
    private static final java.lang.String f4863x78a1b6be = "__j2v8_debug_handler";

    /* renamed from: DEBUG_OBJECT_NAME */
    public static java.lang.String f4864x99db8b7f = "__j2v8_Debug";

    /* renamed from: DISABLE_ALL_BREAK_POINTS */
    private static final java.lang.String f4865xe4af46d8 = "disableAllBreakPoints";

    /* renamed from: DISABLE_SCRIPT_BREAK_POINT */
    private static final java.lang.String f4866x71d15b73 = "disableScriptBreakPoint";

    /* renamed from: ENABLE_SCRIPT_BREAK_POINT */
    private static final java.lang.String f4867xf74e48d8 = "enableScriptBreakPoint";

    /* renamed from: FIND_SCRIPT_BREAK_POINT */
    private static final java.lang.String f4868xe0002ce2 = "findScriptBreakPoint";

    /* renamed from: NUMBER */
    private static final java.lang.String f4869x89ebcf49 = "number";

    /* renamed from: SCRIPT_BREAK_POINTS */
    private static final java.lang.String f4870xc5050b37 = "scriptBreakPoints";

    /* renamed from: SET_BREAK_POINT */
    private static final java.lang.String f4871x400c0993 = "setBreakPoint";

    /* renamed from: SET_LISTENER */
    private static final java.lang.String f4872x4c9dd011 = "setListener";

    /* renamed from: SET_SCRIPT_BREAK_POINT_BY_NAME */
    private static final java.lang.String f4873x3d00f2ed = "setScriptBreakPointByName";

    /* renamed from: V8_DEBUG_OBJECT */
    private static final java.lang.String f4874x78cc5d48 = "Debug";

    /* renamed from: breakHandlers */
    private java.util.List<com.p159x477cd522.p160x333422.p161x5b09653.InterfaceC1490xd02d9d6b> f4875x5e6e088 = new java.util.ArrayList();

    /* renamed from: debugObject */
    private com.p159x477cd522.p160x333422.C1477x4679881 f4876x9b72db72;

    /* renamed from: runtime */
    private com.p159x477cd522.p160x333422.V8 f4877x5c71cfd8;

    /* renamed from: com.eclipsesource.mmv8.debug.DebugHandler$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$eclipsesource$mmv8$debug$DebugHandler$DebugEvent */
        static final /* synthetic */ int[] f4878x946f2f66;

        static {
            int[] iArr = new int[com.p159x477cd522.p160x333422.p161x5b09653.C1492x68eb7997.DebugEvent.m16505xcee59d22().length];
            f4878x946f2f66 = iArr;
            try {
                iArr[com.p159x477cd522.p160x333422.p161x5b09653.C1492x68eb7997.DebugEvent.Break.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f4878x946f2f66[com.p159x477cd522.p160x333422.p161x5b09653.C1492x68eb7997.DebugEvent.BeforeCompile.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f4878x946f2f66[com.p159x477cd522.p160x333422.p161x5b09653.C1492x68eb7997.DebugEvent.AfterCompile.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f4878x946f2f66[com.p159x477cd522.p160x333422.p161x5b09653.C1492x68eb7997.DebugEvent.Exception.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.eclipsesource.mmv8.debug.DebugHandler$BreakpointHandler */
    /* loaded from: classes7.dex */
    public class BreakpointHandler implements com.p159x477cd522.p160x333422.InterfaceC1457xf776215b {
        private BreakpointHandler() {
        }

        /* renamed from: createDebugEvent */
        private com.p159x477cd522.p160x333422.p161x5b09653.C1493x794a1944 m16499xfdb25a23(com.p159x477cd522.p160x333422.p161x5b09653.C1492x68eb7997.DebugEvent debugEvent, com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
            int i17 = com.p159x477cd522.p160x333422.p161x5b09653.C1492x68eb7997.AnonymousClass1.f4878x946f2f66[debugEvent.ordinal()];
            if (i17 == 1) {
                return new com.p159x477cd522.p160x333422.p161x5b09653.C1489xc315ccfb(c1477x4679881);
            }
            if (i17 != 2 && i17 != 3) {
                return i17 != 4 ? new com.p159x477cd522.p160x333422.p161x5b09653.C1493x794a1944(c1477x4679881) : new com.p159x477cd522.p160x333422.p161x5b09653.C1494xc02b57ab(c1477x4679881);
            }
            return new com.p159x477cd522.p160x333422.p161x5b09653.C1491x10b6e447(c1477x4679881);
        }

        /* renamed from: invokeHandler */
        private void m16500x304a33b2(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, int i17, com.p159x477cd522.p160x333422.p161x5b09653.InterfaceC1490xd02d9d6b interfaceC1490xd02d9d6b) {
            com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881;
            com.p159x477cd522.p160x333422.p161x5b09653.C1495x6bf8c479 c1495x6bf8c479;
            com.p159x477cd522.p160x333422.C1477x4679881 c1477x46798812;
            com.p159x477cd522.p160x333422.p161x5b09653.C1495x6bf8c479 c1495x6bf8c4792;
            com.p159x477cd522.p160x333422.C1477x4679881 c1477x46798813 = null;
            com.p159x477cd522.p160x333422.p161x5b09653.C1493x794a1944 c1493x794a1944 = null;
            try {
                com.p159x477cd522.p160x333422.C1477x4679881 mo16297x2817c635 = c1469x28b0ccd7.mo16297x2817c635(1);
                try {
                    c1477x46798812 = c1469x28b0ccd7.mo16297x2817c635(2);
                    try {
                        c1477x4679881 = c1469x28b0ccd7.mo16297x2817c635(3);
                        try {
                            c1495x6bf8c4792 = new com.p159x477cd522.p160x333422.p161x5b09653.C1495x6bf8c479(mo16297x2817c635);
                            try {
                                com.p159x477cd522.p160x333422.p161x5b09653.C1492x68eb7997.DebugEvent debugEvent = com.p159x477cd522.p160x333422.p161x5b09653.C1492x68eb7997.DebugEvent.m16505xcee59d22()[i17];
                                c1493x794a1944 = m16499xfdb25a23(debugEvent, c1477x46798812);
                                interfaceC1490xd02d9d6b.m16482xaf602e60(debugEvent, c1495x6bf8c4792, c1493x794a1944, c1477x4679881);
                                m16501x25e4d7ba(mo16297x2817c635);
                                m16501x25e4d7ba(c1477x46798812);
                                m16501x25e4d7ba(c1477x4679881);
                                m16501x25e4d7ba(c1495x6bf8c4792);
                                m16501x25e4d7ba(c1493x794a1944);
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                c1495x6bf8c479 = c1493x794a1944;
                                c1477x46798813 = mo16297x2817c635;
                                m16501x25e4d7ba(c1477x46798813);
                                m16501x25e4d7ba(c1477x46798812);
                                m16501x25e4d7ba(c1477x4679881);
                                m16501x25e4d7ba(c1495x6bf8c4792);
                                m16501x25e4d7ba(c1495x6bf8c479);
                                throw th;
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            c1495x6bf8c479 = null;
                            c1495x6bf8c4792 = c1495x6bf8c479;
                            c1477x46798813 = mo16297x2817c635;
                            m16501x25e4d7ba(c1477x46798813);
                            m16501x25e4d7ba(c1477x46798812);
                            m16501x25e4d7ba(c1477x4679881);
                            m16501x25e4d7ba(c1495x6bf8c4792);
                            m16501x25e4d7ba(c1495x6bf8c479);
                            throw th;
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        c1477x4679881 = null;
                        c1495x6bf8c479 = null;
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    c1477x4679881 = null;
                    c1495x6bf8c479 = null;
                    c1477x46798812 = null;
                    c1495x6bf8c4792 = null;
                }
            } catch (java.lang.Throwable th10) {
                th = th10;
                c1477x4679881 = null;
                c1495x6bf8c479 = null;
                c1477x46798812 = null;
                c1495x6bf8c4792 = null;
            }
        }

        /* renamed from: safeRelease */
        private void m16501x25e4d7ba(com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98 interfaceC1464x1c628e98) {
            if (interfaceC1464x1c628e98 != null) {
                interfaceC1464x1c628e98.mo15825x41012807();
            }
        }

        @Override // com.p159x477cd522.p160x333422.InterfaceC1457xf776215b
        /* renamed from: invoke */
        public void mo15012xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
            if (c1469x28b0ccd7 == null || c1469x28b0ccd7.mo16336x85ca346()) {
                return;
            }
            int mo16294xb282bd08 = c1469x28b0ccd7.mo16294xb282bd08(0);
            java.util.Iterator it = com.p159x477cd522.p160x333422.p161x5b09653.C1492x68eb7997.this.f4875x5e6e088.iterator();
            while (it.hasNext()) {
                m16500x304a33b2(c1469x28b0ccd7, mo16294xb282bd08, (com.p159x477cd522.p160x333422.p161x5b09653.InterfaceC1490xd02d9d6b) it.next());
            }
        }

        public /* synthetic */ BreakpointHandler(com.p159x477cd522.p160x333422.p161x5b09653.C1492x68eb7997 c1492x68eb7997, com.p159x477cd522.p160x333422.p161x5b09653.C1492x68eb7997.AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* renamed from: com.eclipsesource.mmv8.debug.DebugHandler$DebugEvent */
    /* loaded from: classes7.dex */
    public enum DebugEvent {
        Undefined(0),
        Break(1),
        Exception(2),
        NewFunction(3),
        BeforeCompile(4),
        AfterCompile(5),
        CompileError(6),
        PromiseError(7),
        AsyncTaskEvent(8);


        /* renamed from: index */
        int f4890x5fb28d2;

        DebugEvent(int i17) {
            this.f4890x5fb28d2 = i17;
        }
    }

    public C1492x68eb7997(com.p159x477cd522.p160x333422.V8 v86) {
        this.f4877x5c71cfd8 = v86;
        m16485x7f0dc8b5(v86);
        m16484xc585b91c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.eclipsesource.mmv8.debug.DebugHandler$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.eclipsesource.mmv8.V8Value] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* renamed from: setupBreakpointHandler */
    private void m16484xc585b91c() {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7;
        com.p159x477cd522.p160x333422.C1474xd5ce209a c1474xd5ce209a;
        ?? r17 = 0;
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd72 = null;
        this.f4876x9b72db72.mo16338x1af320a6(new com.p159x477cd522.p160x333422.p161x5b09653.C1492x68eb7997.BreakpointHandler(this, r17), f4863x78a1b6be);
        try {
            c1474xd5ce209a = (com.p159x477cd522.p160x333422.C1474xd5ce209a) this.f4876x9b72db72.mo16330x2817c635(f4863x78a1b6be);
        } catch (java.lang.Throwable th6) {
            th = th6;
            c1469x28b0ccd7 = null;
        }
        try {
            c1469x28b0ccd72 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4877x5c71cfd8).mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) c1474xd5ce209a);
            this.f4876x9b72db72.mo16438xf9e28a6d(f4872x4c9dd011, c1469x28b0ccd72);
            if (c1474xd5ce209a != null && !c1474xd5ce209a.mo16335xafdb8087()) {
                c1474xd5ce209a.mo15825x41012807();
            }
            if (c1469x28b0ccd72 == null || c1469x28b0ccd72.mo16335xafdb8087()) {
                return;
            }
            c1469x28b0ccd72.mo15825x41012807();
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd73 = c1469x28b0ccd72;
            r17 = c1474xd5ce209a;
            c1469x28b0ccd7 = c1469x28b0ccd73;
            if (r17 != 0 && !r17.mo16335xafdb8087()) {
                r17.mo15825x41012807();
            }
            if (c1469x28b0ccd7 != null && !c1469x28b0ccd7.mo16335xafdb8087()) {
                c1469x28b0ccd7.mo15825x41012807();
            }
            throw th;
        }
    }

    /* renamed from: setupDebugObject */
    private void m16485x7f0dc8b5(com.p159x477cd522.p160x333422.V8 v86) {
        com.p159x477cd522.p160x333422.C1477x4679881 mo16330x2817c635 = v86.mo16330x2817c635(f4864x99db8b7f);
        try {
            this.f4876x9b72db72 = mo16330x2817c635.mo16330x2817c635(f4874x78cc5d48);
        } finally {
            mo16330x2817c635.mo15825x41012807();
        }
    }

    /* renamed from: addBreakHandler */
    public void m16486x42222c8c(com.p159x477cd522.p160x333422.p161x5b09653.InterfaceC1490xd02d9d6b interfaceC1490xd02d9d6b) {
        this.f4877x5c71cfd8.m16208x23ad560e().m16431x2edbf932();
        this.f4875x5e6e088.add(interfaceC1490xd02d9d6b);
    }

    /* renamed from: changeBreakPointCondition */
    public void m16487x5e7baa7a(int i17, java.lang.String str) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4877x5c71cfd8);
        c1469x28b0ccd7.mo16306x34af1a(i17);
        c1469x28b0ccd7.mo16309x34af1a(str);
        try {
            this.f4876x9b72db72.mo16324x725c19a1(f4861xec83463d, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }

    /* renamed from: clearBreakPoint */
    public void m16488x1ef1a9fe(int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4877x5c71cfd8);
        c1469x28b0ccd7.mo16306x34af1a(i17);
        try {
            this.f4876x9b72db72.mo16324x725c19a1(f4862x551fefe, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }

    /* renamed from: disableAllBreakPoints */
    public void m16489x33a3ef69() {
        this.f4876x9b72db72.mo16324x725c19a1(f4865xe4af46d8, null);
    }

    /* renamed from: disableScriptBreakPoint */
    public void m16490xf4b8d604(int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4877x5c71cfd8);
        c1469x28b0ccd7.mo16306x34af1a(i17);
        try {
            this.f4876x9b72db72.mo16324x725c19a1(f4866x71d15b73, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }

    /* renamed from: enableScriptBreakPoint */
    public void m16491xa045429f(int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4877x5c71cfd8);
        c1469x28b0ccd7.mo16306x34af1a(i17);
        try {
            this.f4876x9b72db72.mo16324x725c19a1(f4867xf74e48d8, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }

    /* renamed from: getScriptBreakPoint */
    public com.p159x477cd522.p160x333422.p161x5b09653.C1496xe3ad831c m16492xbdc1a672(int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4877x5c71cfd8);
        c1469x28b0ccd7.mo16306x34af1a(i17);
        c1469x28b0ccd7.mo16310x34af1a(false);
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881 = null;
        try {
            c1477x4679881 = this.f4876x9b72db72.mo16322x2919df0c(f4868xe0002ce2, c1469x28b0ccd7);
            return new com.p159x477cd522.p160x333422.p161x5b09653.C1496xe3ad831c(c1477x4679881);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
            if (c1477x4679881 != null) {
                c1477x4679881.mo15825x41012807();
            }
        }
    }

    /* renamed from: getScriptBreakPointCount */
    public int m16493xbdc2f1bd() {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 mo16318xba1b9fdc = this.f4876x9b72db72.mo16318xba1b9fdc(f4870xc5050b37, null);
        try {
            return mo16318xba1b9fdc.mo16304xbe0e3ae6();
        } finally {
            mo16318xba1b9fdc.mo15825x41012807();
        }
    }

    /* renamed from: getScriptBreakPointIDs */
    public int[] m16494x2a498706() {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 mo16318xba1b9fdc = this.f4876x9b72db72.mo16318xba1b9fdc(f4870xc5050b37, null);
        try {
            int[] iArr = new int[mo16318xba1b9fdc.mo16304xbe0e3ae6()];
            for (int i17 = 0; i17 < mo16318xba1b9fdc.mo16304xbe0e3ae6(); i17++) {
                com.p159x477cd522.p160x333422.C1477x4679881 mo16297x2817c635 = mo16318xba1b9fdc.mo16297x2817c635(i17);
                try {
                    iArr[i17] = mo16297x2817c635.mo16321xb7588301(f4869x89ebcf49, null);
                    mo16297x2817c635.mo15825x41012807();
                } finally {
                }
            }
            return iArr;
        } finally {
            mo16318xba1b9fdc.mo15825x41012807();
        }
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98
    /* renamed from: release */
    public void mo15825x41012807() {
        this.f4876x9b72db72.mo15825x41012807();
    }

    /* renamed from: removeBreakHandler */
    public void m16495x6353efef(com.p159x477cd522.p160x333422.p161x5b09653.InterfaceC1490xd02d9d6b interfaceC1490xd02d9d6b) {
        this.f4877x5c71cfd8.m16208x23ad560e().m16431x2edbf932();
        this.f4875x5e6e088.remove(interfaceC1490xd02d9d6b);
    }

    /* renamed from: setBreakpoint */
    public int m16496x6b03c9f3(com.p159x477cd522.p160x333422.C1474xd5ce209a c1474xd5ce209a) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4877x5c71cfd8);
        c1469x28b0ccd7.mo16307x34af1a((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) c1474xd5ce209a);
        try {
            return this.f4876x9b72db72.mo16321xb7588301(f4871x400c0993, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }

    /* renamed from: setScriptBreakpoint */
    public int m16497x63812b9e(java.lang.String str, int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4877x5c71cfd8);
        c1469x28b0ccd7.mo16309x34af1a(str);
        c1469x28b0ccd7.mo16306x34af1a(i17);
        try {
            return this.f4876x9b72db72.mo16321xb7588301(f4873x3d00f2ed, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }
}
