package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "base::android")
@org.p3343x72743996.p3353x59bc66e.p3354xc6ad7b24.InterfaceC29461x94c0977e
/* renamed from: org.chromium.base.TraceEvent */
/* loaded from: classes13.dex */
public class C29371xb04a7075 implements java.lang.AutoCloseable {

    /* renamed from: sEnabled */
    private static volatile boolean f73445xad6f4b4e;

    /* renamed from: sEventNameFilteringEnabled */
    private static boolean f73446x5fdb73a9;

    /* renamed from: sUiThreadReady */
    private static volatile boolean f73447xa5c448d2;

    /* renamed from: mName */
    private final java.lang.String f73448x624f098;

    /* renamed from: org.chromium.base.TraceEvent$ActivityInfo */
    /* loaded from: classes13.dex */
    public static class ActivityInfo {

        /* renamed from: mActivityName */
        public java.lang.String f73449xf8a7db47;

        /* renamed from: mViews */
        public java.util.ArrayList<org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ViewInfo> f73450xbeed6601 = new java.util.ArrayList<>(125);

        public ActivityInfo(java.lang.String str) {
            this.f73449xf8a7db47 = str;
        }
    }

    /* renamed from: org.chromium.base.TraceEvent$BasicLooperMonitor */
    /* loaded from: classes13.dex */
    public static class BasicLooperMonitor implements android.util.Printer {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f73451x7118e671 = false;

        /* renamed from: FILTERED_EVENT_NAME */
        static final java.lang.String f73452xc05e5458 = "Looper.dispatch: EVENT_NAME_FILTERED";

        /* renamed from: LOOPER_TASK_PREFIX */
        static final java.lang.String f73453xa36b419e = "Looper.dispatch: ";

        /* renamed from: SHORTEST_LOG_PREFIX_LENGTH */
        private static final int f73454xbd30b5e3 = 18;

        /* renamed from: mCurrentTarget */
        private java.lang.String f73455xe16d64fd;

        /* renamed from: getTarget */
        private static java.lang.String m152713x30959487(java.lang.String str) {
            int indexOf = str.indexOf(40, f73454xbd30b5e3);
            int indexOf2 = indexOf == -1 ? -1 : str.indexOf(41, indexOf);
            return indexOf2 != -1 ? str.substring(indexOf + 1, indexOf2) : "";
        }

        /* renamed from: getTargetName */
        private static java.lang.String m152714xb3ee7b2(java.lang.String str) {
            int indexOf = str.indexOf(125, f73454xbd30b5e3);
            int indexOf2 = indexOf == -1 ? -1 : str.indexOf(58, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.length();
            }
            return indexOf != -1 ? str.substring(indexOf + 2, indexOf2) : "";
        }

        /* renamed from: getTraceEventName */
        public static java.lang.String m152715xd6791d76(java.lang.String str) {
            if (org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.f73446x5fdb73a9) {
                return f73452xc05e5458;
            }
            return f73453xa36b419e + m152713x30959487(str) + "(" + m152714xb3ee7b2(str) + ")";
        }

        /* renamed from: beginHandling */
        public void mo152716x2ac3c4ae(java.lang.String str) {
            boolean m152381xa00f8b41 = org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.m152381xa00f8b41();
            if (org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.f73445xad6f4b4e || m152381xa00f8b41) {
                this.f73455xe16d64fd = m152715xd6791d76(str);
                if (org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.f73445xad6f4b4e) {
                    org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152723xf1c08b18(this.f73455xe16d64fd);
                } else {
                    org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.m152375x59478a9(this.f73455xe16d64fd, true);
                }
            }
        }

        /* renamed from: endHandling */
        public void mo152717xa47e82e0(java.lang.String str) {
            boolean m152381xa00f8b41 = org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.m152381xa00f8b41();
            if ((org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.f73445xad6f4b4e || m152381xa00f8b41) && this.f73455xe16d64fd != null) {
                if (org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.f73445xad6f4b4e) {
                    org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152725x6b7b494a(this.f73455xe16d64fd);
                } else {
                    org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.end(this.f73455xe16d64fd, true);
                }
            }
            this.f73455xe16d64fd = null;
        }

        @Override // android.util.Printer
        public void println(java.lang.String str) {
            if (str.startsWith(">")) {
                mo152716x2ac3c4ae(str);
            } else {
                mo152717xa47e82e0(str);
            }
        }
    }

    /* renamed from: org.chromium.base.TraceEvent$IdleTracingLooperMonitor */
    /* loaded from: classes13.dex */
    public static final class IdleTracingLooperMonitor extends org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.BasicLooperMonitor implements android.os.MessageQueue.IdleHandler {

        /* renamed from: FRAME_DURATION_MILLIS */
        private static final long f73456xba6a6c5f = 16;

        /* renamed from: IDLE_EVENT_NAME */
        private static final java.lang.String f73457x1a76de7b = "Looper.queueIdle";

        /* renamed from: MIN_INTERESTING_BURST_DURATION_MILLIS */
        private static final long f73458xb3cf69e = 48;

        /* renamed from: MIN_INTERESTING_DURATION_MILLIS */
        private static final long f73459xaa5e08dd = 16;
        private static final java.lang.String TAG = "TraceEvt_LooperMonitor";

        /* renamed from: mIdleMonitorAttached */
        private boolean f73460x3ced08fd;

        /* renamed from: mLastIdleStartedAt */
        private long f73461x1a6233d;

        /* renamed from: mLastWorkStartedAt */
        private long f73462x988770a0;

        /* renamed from: mNumIdlesSeen */
        private int f73463xd5247a61;

        /* renamed from: mNumTasksSeen */
        private int f73464x78fa6b50;

        /* renamed from: mNumTasksSinceLastIdle */
        private int f73465x11028baf;

        /* renamed from: syncIdleMonitoring */
        private final void m152718x9029c2b7() {
            if (org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.f73445xad6f4b4e && !this.f73460x3ced08fd) {
                this.f73461x1a6233d = org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152675x44870c2d();
                android.os.Looper.myQueue().addIdleHandler(this);
                this.f73460x3ced08fd = true;
            } else {
                if (!this.f73460x3ced08fd || org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.f73445xad6f4b4e) {
                    return;
                }
                android.os.Looper.myQueue().removeIdleHandler(this);
                this.f73460x3ced08fd = false;
            }
        }

        /* renamed from: traceAndLog */
        private static void m152719xee54e392(int i17, java.lang.String str) {
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152695x74ae25e1("TraceEvent.LooperMonitor:IdleStats", str);
            android.util.Log.println(i17, TAG, str);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.BasicLooperMonitor
        /* renamed from: beginHandling */
        public final void mo152716x2ac3c4ae(java.lang.String str) {
            if (this.f73465x11028baf == 0) {
                org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.end(f73457x1a76de7b);
            }
            this.f73462x988770a0 = org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152675x44870c2d();
            m152718x9029c2b7();
            super.mo152716x2ac3c4ae(str);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.BasicLooperMonitor
        /* renamed from: endHandling */
        public final void mo152717xa47e82e0(java.lang.String str) {
            long m152675x44870c2d = org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152675x44870c2d() - this.f73462x988770a0;
            if (m152675x44870c2d > 16) {
                m152719xee54e392(5, "observed a task that took " + m152675x44870c2d + "ms: " + str);
            }
            super.mo152717xa47e82e0(str);
            m152718x9029c2b7();
            this.f73464x78fa6b50++;
            this.f73465x11028baf++;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            long m152675x44870c2d = org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152675x44870c2d();
            if (this.f73461x1a6233d == 0) {
                this.f73461x1a6233d = m152675x44870c2d;
            }
            long j17 = m152675x44870c2d - this.f73461x1a6233d;
            this.f73463xd5247a61++;
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152689x59478a9(f73457x1a76de7b, this.f73465x11028baf + " tasks since last idle.");
            if (j17 > f73458xb3cf69e) {
                m152719xee54e392(3, this.f73464x78fa6b50 + " tasks and " + this.f73463xd5247a61 + " idles processed so far, " + this.f73465x11028baf + " tasks bursted and " + j17 + "ms elapsed since last idle");
            }
            this.f73461x1a6233d = m152675x44870c2d;
            this.f73465x11028baf = 0;
            return true;
        }

        private IdleTracingLooperMonitor() {
        }
    }

    /* renamed from: org.chromium.base.TraceEvent$LooperMonitorHolder */
    /* loaded from: classes13.dex */
    public static final class LooperMonitorHolder {

        /* renamed from: sInstance */
        private static final org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.BasicLooperMonitor f73466xbfaed628;

        static {
            f73466xbfaed628 = org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.m152292x9cf0d20b().mo152309xefec5a6e(org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.f73159xb9094473) ? new org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.IdleTracingLooperMonitor() : new org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.BasicLooperMonitor();
        }

        private LooperMonitorHolder() {
        }
    }

    /* renamed from: org.chromium.base.TraceEvent$Natives */
    /* loaded from: classes13.dex */
    public interface Natives {
        /* renamed from: addViewDump */
        void mo152721xd2db9fa(int i17, int i18, boolean z17, boolean z18, java.lang.String str, java.lang.String str2, long j17);

        /* renamed from: begin */
        void mo152722x59478a9(java.lang.String str, java.lang.String str2);

        /* renamed from: beginToplevel */
        void mo152723xf1c08b18(java.lang.String str);

        /* renamed from: beginWithIntArg */
        void mo152724x82c575d6(java.lang.String str, int i17);

        void end(java.lang.String str, java.lang.String str2, long j17);

        /* renamed from: endToplevel */
        void mo152725x6b7b494a(java.lang.String str);

        /* renamed from: finishAsync */
        void mo152726x4eb069a9(java.lang.String str, long j17);

        /* renamed from: initViewHierarchyDump */
        void mo152727x8ff5e3f4(long j17, java.lang.Object obj);

        /* renamed from: instant */
        void mo152728x74ae25e1(java.lang.String str, java.lang.String str2);

        /* renamed from: instantAndroidIPC */
        void mo152729x7fee77ee(java.lang.String str, long j17);

        /* renamed from: instantAndroidToolbar */
        void mo152730xf05e364d(int i17, int i18, int i19);

        /* renamed from: registerEnabledObserver */
        void mo152731xb74b8014();

        /* renamed from: startActivityDump */
        long mo152732x91871725(java.lang.String str, long j17);

        /* renamed from: startAsync */
        void mo152733xa094bb3a(java.lang.String str, long j17);

        /* renamed from: viewHierarchyDumpEnabled */
        boolean mo152734xa4b64b7d();

        /* renamed from: webViewStartupStage1 */
        void mo152735x86086a37(long j17, long j18);

        /* renamed from: webViewStartupStage2 */
        void mo152736x86086a38(long j17, long j18, boolean z17);

        /* renamed from: webViewStartupTotalFactoryInit */
        void mo152737xb5f4579a(long j17, long j18);
    }

    /* renamed from: org.chromium.base.TraceEvent$ViewHierarchyDumper */
    /* loaded from: classes13.dex */
    public static final class ViewHierarchyDumper implements android.os.MessageQueue.IdleHandler {

        /* renamed from: EVENT_NAME */
        private static final java.lang.String f73467x59562d30 = "TraceEvent.ViewHierarchyDumper";

        /* renamed from: MIN_VIEW_DUMP_INTERVAL_MILLIS */
        private static final long f73468xf00b1842 = 1000;

        /* renamed from: sEnabled */
        private static boolean f73469xad6f4b4e;

        /* renamed from: sInstance */
        private static org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ViewHierarchyDumper f73470xbfaed628;

        /* renamed from: mLastDumpTs */
        private long f73471x36434616;

        private ViewHierarchyDumper() {
        }

        /* renamed from: disable */
        private static void m152738x639e22e8() {
            org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152651x286f5ca3();
            if (f73469xad6f4b4e) {
                android.os.Looper.myQueue().removeIdleHandler(f73470xbfaed628);
                f73469xad6f4b4e = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: dumpView */
        public static void m152739x8181ceb9(org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ActivityInfo activityInfo, int i17, android.view.View view) {
            org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152651x286f5ca3();
            int id6 = view.getId();
            activityInfo.f73450xbeed6601.add(new org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ViewInfo(id6, i17, view.isShown(), view.isDirty(), view.getClass().getSimpleName(), view.getResources()));
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                    m152739x8181ceb9(activityInfo, id6, viewGroup.getChildAt(i18));
                }
            }
        }

        /* renamed from: enable */
        private static void m152740xb2952583() {
            org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152651x286f5ca3();
            if (f73469xad6f4b4e) {
                return;
            }
            android.os.Looper.myQueue().addIdleHandler(f73470xbfaed628);
            f73469xad6f4b4e = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$updateEnabledState$0 */
        public static /* synthetic */ void m152741x91cd9042() {
            if (org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152734xa4b64b7d()) {
                if (f73470xbfaed628 == null) {
                    f73470xbfaed628 = new org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ViewHierarchyDumper();
                }
                m152740xb2952583();
            } else if (f73470xbfaed628 != null) {
                m152738x639e22e8();
            }
        }

        /* renamed from: updateEnabledState */
        public static void m152742x7cb9d139() {
            org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153014x4eeaf633(7, new org.p3343x72743996.p3344x2e06d1.RunnableC29373x8008489f());
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            long m152675x44870c2d = org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152675x44870c2d();
            long j17 = this.f73471x36434616;
            if (j17 != 0 && m152675x44870c2d - j17 <= 1000) {
                return true;
            }
            this.f73471x36434616 = m152675x44870c2d;
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152707xd59979ac();
            return true;
        }
    }

    /* renamed from: org.chromium.base.TraceEvent$ViewInfo */
    /* loaded from: classes13.dex */
    public static class ViewInfo {

        /* renamed from: mClassName */
        private java.lang.String f73472x7a206636;
        private int mId;

        /* renamed from: mIsDirty */
        private boolean f73473x18b4039b;

        /* renamed from: mIsShown */
        private boolean f73474x1986e4da;

        /* renamed from: mParentId */
        private int f73475x6b0936f2;

        /* renamed from: mRes */
        private android.content.res.Resources f73476x32ccf3;

        public ViewInfo(int i17, int i18, boolean z17, boolean z18, java.lang.String str, android.content.res.Resources resources) {
            this.mId = i17;
            this.f73475x6b0936f2 = i18;
            this.f73474x1986e4da = z17;
            this.f73473x18b4039b = z18;
            this.f73472x7a206636 = str;
            this.f73476x32ccf3 = resources;
        }
    }

    private C29371xb04a7075(java.lang.String str, java.lang.String str2) {
        this.f73448x624f098 = str;
        m152689x59478a9(str, str2);
    }

    /* renamed from: begin */
    public static void m152687x59478a9(java.lang.String str) {
        m152689x59478a9(str, (java.lang.String) null);
    }

    /* renamed from: dumpViewHierarchy */
    public static void m152690x373d637c(long j17, java.lang.Object obj) {
        java.lang.String str;
        if (org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152200xf582434a()) {
            java.util.Iterator it = ((java.util.ArrayList) obj).iterator();
            while (it.hasNext()) {
                org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ActivityInfo activityInfo = (org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ActivityInfo) it.next();
                long mo152732x91871725 = org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152732x91871725(activityInfo.f73449xf8a7db47, j17);
                java.util.Iterator<org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ViewInfo> it6 = activityInfo.f73450xbeed6601.iterator();
                while (it6.hasNext()) {
                    org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ViewInfo next = it6.next();
                    try {
                        if (next.f73476x32ccf3 != null) {
                            if (next.mId != 0 && next.mId != -1) {
                                str = next.f73476x32ccf3.getResourceName(next.mId);
                            }
                            str = "__no_id__";
                        } else {
                            str = "__no_resources__";
                        }
                    } catch (android.content.res.Resources.NotFoundException unused) {
                        str = "__name_not_found__";
                    }
                    org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152721xd2db9fa(next.mId, next.f73475x6b0936f2, next.f73474x1986e4da, next.f73473x18b4039b, next.f73472x7a206636, str, mo152732x91871725);
                }
            }
        }
    }

    /* renamed from: enabled */
    public static boolean m152691xa00f8b41() {
        return f73445xad6f4b4e;
    }

    public static void end(java.lang.String str) {
        end(str, null);
    }

    /* renamed from: eventNameFilteringEnabled */
    public static boolean m152692x1144bcdc() {
        return f73446x5fdb73a9;
    }

    /* renamed from: finishAsync */
    public static void m152693x4eb069a9(java.lang.String str, long j17) {
        org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.m152382x4eb069a9(str, j17);
        if (f73445xad6f4b4e) {
            org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152726x4eb069a9(str, j17);
        }
    }

    /* renamed from: instant */
    public static void m152694x74ae25e1(java.lang.String str) {
        if (f73445xad6f4b4e) {
            org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152728x74ae25e1(str, null);
        }
    }

    /* renamed from: instantAndroidIPC */
    public static void m152696x7fee77ee(java.lang.String str, long j17) {
        if (f73445xad6f4b4e) {
            org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152729x7fee77ee(str, j17);
        }
    }

    /* renamed from: instantAndroidToolbar */
    public static void m152697xf05e364d(int i17, int i18, int i19) {
        if (f73445xad6f4b4e) {
            org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152730xf05e364d(i17, i18, i19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$snapshotViewHierarchy$0 */
    public static /* synthetic */ void m152698x7eb2095b(long j17, java.util.ArrayList arrayList) {
        org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152727x8ff5e3f4(j17, arrayList);
    }

    /* renamed from: maybeEnableEarlyTracing */
    public static void m152699x4a3c778a(boolean z17) {
        if (z17) {
            org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.m152385xfb8180d7();
        }
        if (org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.m152381xa00f8b41()) {
            org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152655xd5db76a5().setMessageLogging(org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.LooperMonitorHolder.f73466xbfaed628);
        }
    }

    /* renamed from: onNativeTracingReady */
    public static void m152700x4f612bf7() {
        org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152731xb74b8014();
    }

    /* renamed from: onUiThreadReady */
    public static void m152701x32926ae6() {
        f73447xa5c448d2 = true;
        if (f73445xad6f4b4e) {
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ViewHierarchyDumper.m152742x7cb9d139();
        }
    }

    /* renamed from: scoped */
    public static org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152704xc9e48c90(java.lang.String str, java.lang.String str2) {
        if (org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.m152381xa00f8b41() || m152691xa00f8b41()) {
            return new org.p3343x72743996.p3344x2e06d1.C29371xb04a7075(str, str2);
        }
        return null;
    }

    /* renamed from: setEnabled */
    public static void m152705x514e147f(boolean z17) {
        if (z17) {
            org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.m152376x639e22e8();
        }
        if (f73445xad6f4b4e != z17) {
            f73445xad6f4b4e = z17;
            org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152655xd5db76a5().setMessageLogging(z17 ? org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.LooperMonitorHolder.f73466xbfaed628 : null);
        }
        if (f73447xa5c448d2) {
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ViewHierarchyDumper.m152742x7cb9d139();
        }
    }

    /* renamed from: setEventNameFilteringEnabled */
    public static void m152706x2c96b29a(boolean z17) {
        f73446x5fdb73a9 = z17;
    }

    /* renamed from: snapshotViewHierarchy */
    public static void m152707xd59979ac() {
        if (f73445xad6f4b4e && org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152734xa4b64b7d()) {
            m152687x59478a9("instantAndroidViewHierarchy");
            final java.util.ArrayList<org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ActivityInfo> m152708x66b38645 = m152708x66b38645();
            if (m152708x66b38645.isEmpty()) {
                end("instantAndroidViewHierarchy");
                return;
            }
            final long hashCode = m152708x66b38645.hashCode();
            org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153010x2d1ef245(0, new java.lang.Runnable() { // from class: org.chromium.base.TraceEvent$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152698x7eb2095b(hashCode, m152708x66b38645);
                }
            });
            end("instantAndroidViewHierarchy", null, hashCode);
        }
    }

    /* renamed from: snapshotViewHierarchyState */
    public static java.util.ArrayList<org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ActivityInfo> m152708x66b38645() {
        if (!org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152200xf582434a()) {
            return new java.util.ArrayList<>();
        }
        java.util.ArrayList<org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ActivityInfo> arrayList = new java.util.ArrayList<>(2);
        for (android.app.Activity activity : org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152192xfb1bd256()) {
            arrayList.add(new org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ActivityInfo(activity.getClass().getName()));
            org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.ViewHierarchyDumper.m152739x8181ceb9(arrayList.get(arrayList.size() - 1), 0, activity.getWindow().getDecorView().getRootView());
        }
        return arrayList;
    }

    /* renamed from: startAsync */
    public static void m152709xa094bb3a(java.lang.String str, long j17) {
        org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.m152389xa094bb3a(str, j17);
        if (f73445xad6f4b4e) {
            org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152733xa094bb3a(str, j17);
        }
    }

    /* renamed from: webViewStartupStage1 */
    public static void m152710x86086a37(long j17, long j18) {
        if (f73445xad6f4b4e) {
            org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152735x86086a37(j17, j18);
        }
    }

    /* renamed from: webViewStartupStage2 */
    public static void m152711x86086a38(long j17, long j18, boolean z17) {
        if (f73445xad6f4b4e) {
            org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152736x86086a38(j17, j18, z17);
        }
    }

    /* renamed from: webViewStartupTotalFactoryInit */
    public static void m152712xb5f4579a(long j17, long j18) {
        if (f73445xad6f4b4e) {
            org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152737xb5f4579a(j17, j18);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        end(this.f73448x624f098);
    }

    /* renamed from: begin */
    public static void m152689x59478a9(java.lang.String str, java.lang.String str2) {
        org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.m152375x59478a9(str, false);
        if (f73445xad6f4b4e) {
            org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152722x59478a9(str, str2);
        }
    }

    public static void end(java.lang.String str, java.lang.String str2) {
        end(str, str2, 0L);
    }

    /* renamed from: instant */
    public static void m152695x74ae25e1(java.lang.String str, java.lang.String str2) {
        if (f73445xad6f4b4e) {
            org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152728x74ae25e1(str, str2);
        }
    }

    public static void end(java.lang.String str, java.lang.String str2, long j17) {
        org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.end(str, false);
        if (f73445xad6f4b4e) {
            org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().end(str, str2, j17);
        }
    }

    /* renamed from: scoped */
    public static org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152703xc9e48c90(java.lang.String str, int i17) {
        if (org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.m152381xa00f8b41() || m152691xa00f8b41()) {
            return new org.p3343x72743996.p3344x2e06d1.C29371xb04a7075(str, i17);
        }
        return null;
    }

    private C29371xb04a7075(java.lang.String str, int i17) {
        this.f73448x624f098 = str;
        m152688x59478a9(str, i17);
    }

    /* renamed from: begin */
    public static void m152688x59478a9(java.lang.String str, int i17) {
        org.p3343x72743996.p3344x2e06d1.C29300x52da9ff8.m152375x59478a9(str, false);
        if (f73445xad6f4b4e) {
            org.p3343x72743996.p3344x2e06d1.C29374x2695e2f0.get().mo152724x82c575d6(str, i17);
        }
    }

    /* renamed from: scoped */
    public static org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90(java.lang.String str) {
        return m152704xc9e48c90(str, (java.lang.String) null);
    }
}
