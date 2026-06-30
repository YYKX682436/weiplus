package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.CameraEnumerationAndroid */
/* loaded from: classes14.dex */
public class C29746x65bafa4d {

    /* renamed from: COMMON_RESOLUTIONS */
    static final java.util.ArrayList<org.p3371xd0ce3e8d.C29857x275421> f75232x64a324d3 = new java.util.ArrayList<>(java.util.Arrays.asList(new org.p3371xd0ce3e8d.C29857x275421(160, 120), new org.p3371xd0ce3e8d.C29857x275421(240, 160), new org.p3371xd0ce3e8d.C29857x275421(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 240), new org.p3371xd0ce3e8d.C29857x275421(400, 240), new org.p3371xd0ce3e8d.C29857x275421(480, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e), new org.p3371xd0ce3e8d.C29857x275421(640, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3), new org.p3371xd0ce3e8d.C29857x275421(640, 480), new org.p3371xd0ce3e8d.C29857x275421(768, 480), new org.p3371xd0ce3e8d.C29857x275421(td1.q.f76808x366c91de, 480), new org.p3371xd0ce3e8d.C29857x275421(800, 600), new org.p3371xd0ce3e8d.C29857x275421(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c), new org.p3371xd0ce3e8d.C29857x275421(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, 640), new org.p3371xd0ce3e8d.C29857x275421(1024, 576), new org.p3371xd0ce3e8d.C29857x275421(1024, 600), new org.p3371xd0ce3e8d.C29857x275421(1280, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf), new org.p3371xd0ce3e8d.C29857x275421(1280, 1024), new org.p3371xd0ce3e8d.C29857x275421(1920, 1080), new org.p3371xd0ce3e8d.C29857x275421(1920, 1440), new org.p3371xd0ce3e8d.C29857x275421(2560, 1440), new org.p3371xd0ce3e8d.C29857x275421(3840, 2160)));
    private static final java.lang.String TAG = "CameraEnumerationAndroid";

    /* renamed from: org.webrtc.CameraEnumerationAndroid$CaptureFormat */
    /* loaded from: classes14.dex */
    public static class CaptureFormat {

        /* renamed from: framerate */
        public final org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange f75242x208b77cd;

        /* renamed from: height */
        public final int f75243xb7389127;

        /* renamed from: imageFormat */
        public final int f75244x6b33dd32 = 17;

        /* renamed from: width */
        public final int f75245x6be2dc6;

        /* renamed from: org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange */
        /* loaded from: classes14.dex */
        public static class FramerateRange {
            public int max;
            public int min;

            public FramerateRange(int i17, int i18) {
                this.min = i17;
                this.max = i18;
            }

            /* renamed from: equals */
            public boolean m155318xb2c87fbf(java.lang.Object obj) {
                if (!(obj instanceof org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange)) {
                    return false;
                }
                org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange framerateRange = (org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange) obj;
                return this.min == framerateRange.min && this.max == framerateRange.max;
            }

            /* renamed from: hashCode */
            public int m155319x8cdac1b() {
                return (this.min * 65537) + 1 + this.max;
            }

            /* renamed from: toString */
            public java.lang.String m155320x9616526c() {
                return "[" + (this.min / 1000.0f) + ":" + (this.max / 1000.0f) + "]";
            }
        }

        public CaptureFormat(int i17, int i18, int i19, int i27) {
            this.f75245x6be2dc6 = i17;
            this.f75243xb7389127 = i18;
            this.f75242x208b77cd = new org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange(i19, i27);
        }

        /* renamed from: equals */
        public boolean m155314xb2c87fbf(java.lang.Object obj) {
            if (!(obj instanceof org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat)) {
                return false;
            }
            org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat captureFormat = (org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat) obj;
            return this.f75245x6be2dc6 == captureFormat.f75245x6be2dc6 && this.f75243xb7389127 == captureFormat.f75243xb7389127 && this.f75242x208b77cd.m155318xb2c87fbf(captureFormat.f75242x208b77cd);
        }

        /* renamed from: frameSize */
        public int m155315x207d7f0e() {
            return m155313x207d7f0e(this.f75245x6be2dc6, this.f75243xb7389127, 17);
        }

        /* renamed from: hashCode */
        public int m155316x8cdac1b() {
            return (((this.f75245x6be2dc6 * 65497) + this.f75243xb7389127) * 251) + 1 + this.f75242x208b77cd.m155319x8cdac1b();
        }

        /* renamed from: toString */
        public java.lang.String m155317x9616526c() {
            return this.f75245x6be2dc6 + "x" + this.f75243xb7389127 + "@" + this.f75242x208b77cd;
        }

        /* renamed from: frameSize */
        public static int m155313x207d7f0e(int i17, int i18, int i19) {
            if (i19 == 17) {
                return ((i17 * i18) * android.graphics.ImageFormat.getBitsPerPixel(i19)) / 8;
            }
            throw new java.lang.UnsupportedOperationException("Don't know how to calculate the frame size of non-NV21 image formats.");
        }

        public CaptureFormat(int i17, int i18, org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange framerateRange) {
            this.f75245x6be2dc6 = i17;
            this.f75243xb7389127 = i18;
            this.f75242x208b77cd = framerateRange;
        }
    }

    /* renamed from: org.webrtc.CameraEnumerationAndroid$ClosestComparator */
    /* loaded from: classes14.dex */
    public static abstract class ClosestComparator<T> implements java.util.Comparator<T> {
        private ClosestComparator() {
        }

        @Override // java.util.Comparator
        public int compare(T t17, T t18) {
            return mo155312x2f0c05(t17) - mo155312x2f0c05(t18);
        }

        /* renamed from: diff */
        public abstract int mo155312x2f0c05(T t17);
    }

    /* renamed from: getClosestSupportedFramerateRange */
    public static org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange m155308x5c36181b(java.util.List<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange> list, final int i17) {
        return (org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange) java.util.Collections.min(list, new org.p3371xd0ce3e8d.C29746x65bafa4d.ClosestComparator<org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange>() { // from class: org.webrtc.CameraEnumerationAndroid.1

            /* renamed from: MAX_FPS_DIFF_THRESHOLD */
            private static final int f75233xcf3971a2 = 5000;

            /* renamed from: MAX_FPS_HIGH_DIFF_WEIGHT */
            private static final int f75234xda4e61a6 = 3;

            /* renamed from: MAX_FPS_LOW_DIFF_WEIGHT */
            private static final int f75235xf4ba0876 = 1;

            /* renamed from: MIN_FPS_HIGH_VALUE_WEIGHT */
            private static final int f75236xef808c60 = 4;

            /* renamed from: MIN_FPS_LOW_VALUE_WEIGHT */
            private static final int f75237x38c0c4f4 = 1;

            /* renamed from: MIN_FPS_THRESHOLD */
            private static final int f75238x9e909508 = 8000;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            /* renamed from: progressivePenalty */
            private int m155311xa706c27e(int i18, int i19, int i27, int i28) {
                if (i18 < i19) {
                    return i18 * i27;
                }
                return ((i18 - i19) * i28) + (i27 * i19);
            }

            @Override // org.p3371xd0ce3e8d.C29746x65bafa4d.ClosestComparator
            /* renamed from: diff, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public int mo155312x2f0c05(org.p3371xd0ce3e8d.C29746x65bafa4d.CaptureFormat.FramerateRange framerateRange) {
                return m155311xa706c27e(framerateRange.min, 8000, 1, 4) + m155311xa706c27e(java.lang.Math.abs((i17 * 1000) - framerateRange.max), 5000, 1, 3);
            }
        });
    }

    /* renamed from: getClosestSupportedSize */
    public static org.p3371xd0ce3e8d.C29857x275421 m155309x4491986c(java.util.List<org.p3371xd0ce3e8d.C29857x275421> list, final int i17, final int i18) {
        return (org.p3371xd0ce3e8d.C29857x275421) java.util.Collections.min(list, new org.p3371xd0ce3e8d.C29746x65bafa4d.ClosestComparator<org.p3371xd0ce3e8d.C29857x275421>() { // from class: org.webrtc.CameraEnumerationAndroid.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // org.p3371xd0ce3e8d.C29746x65bafa4d.ClosestComparator
            /* renamed from: diff, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public int mo155312x2f0c05(org.p3371xd0ce3e8d.C29857x275421 c29857x275421) {
                return java.lang.Math.abs(i17 - c29857x275421.f75950x6be2dc6) + java.lang.Math.abs(i18 - c29857x275421.f75949xb7389127);
            }
        });
    }

    /* renamed from: reportCameraResolution */
    public static void m155310xc32adf05(org.p3371xd0ce3e8d.C29790xde462144 c29790xde462144, org.p3371xd0ce3e8d.C29857x275421 c29857x275421) {
        c29790xde462144.m155618xfeff1dab(f75232x64a324d3.indexOf(c29857x275421) + 1);
    }
}
