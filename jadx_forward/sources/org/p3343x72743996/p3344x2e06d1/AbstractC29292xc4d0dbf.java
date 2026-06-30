package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3353x59bc66e.p3354xc6ad7b24.InterfaceC29461x94c0977e
/* renamed from: org.chromium.base.CommandLine */
/* loaded from: classes13.dex */
public abstract class AbstractC29292xc4d0dbf {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73230x7118e671 = false;

    /* renamed from: SWITCH_PREFIX */
    private static final java.lang.String f73231xc2ffb5fd = "--";

    /* renamed from: SWITCH_TERMINATOR */
    private static final java.lang.String f73232x32035d52 = "--";

    /* renamed from: SWITCH_VALUE_SEPARATOR */
    private static final java.lang.String f73233x1a8ee4c = "=";
    private static final java.lang.String TAG = "CommandLine";

    /* renamed from: sCommandLine */
    private static final java.util.concurrent.atomic.AtomicReference<org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf> f73234x811a576c = new java.util.concurrent.atomic.AtomicReference<>();

    /* renamed from: org.chromium.base.CommandLine$JavaCommandLine */
    /* loaded from: classes13.dex */
    public static class JavaCommandLine extends org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f73235x7118e671 = false;

        /* renamed from: mArgs */
        private java.util.ArrayList<java.lang.String> f73236x61f46ea;

        /* renamed from: mArgsBegin */
        private int f73237xfb9c03df;

        /* renamed from: mSwitches */
        private java.util.HashMap<java.lang.String, java.lang.String> f73238x1fe86e6f;

        public JavaCommandLine(java.lang.String[] strArr) {
            super();
            java.lang.String str;
            this.f73238x1fe86e6f = new java.util.HashMap<>();
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            this.f73236x61f46ea = arrayList;
            this.f73237xfb9c03df = 1;
            if (strArr == null || strArr.length == 0 || (str = strArr[0]) == null) {
                arrayList.add("");
            } else {
                arrayList.add(str);
                m152312x26748ef9(strArr, 1);
            }
        }

        /* renamed from: appendSwitchesInternal */
        private void m152312x26748ef9(java.lang.String[] strArr, int i17) {
            boolean z17 = true;
            for (java.lang.String str : strArr) {
                if (i17 > 0) {
                    i17--;
                } else {
                    if (str.equals("--")) {
                        z17 = false;
                    }
                    if (z17 && str.startsWith("--")) {
                        java.lang.String[] split = str.split(org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.f73233x1a8ee4c, 2);
                        mo152302x5ae550fd(split[0].substring(2), split.length > 1 ? split[1] : null);
                    } else {
                        this.f73236x61f46ea.add(str);
                    }
                }
            }
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: appendSwitch */
        public void mo152301x4e9036ee(java.lang.String str) {
            mo152302x5ae550fd(str, null);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: appendSwitchWithValue */
        public void mo152302x5ae550fd(java.lang.String str, java.lang.String str2) {
            this.f73238x1fe86e6f.put(str, str2 == null ? "" : str2);
            java.lang.String str3 = "--" + str;
            if (str2 != null && !str2.isEmpty()) {
                str3 = str3 + org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.f73233x1a8ee4c + str2;
            }
            java.util.ArrayList<java.lang.String> arrayList = this.f73236x61f46ea;
            int i17 = this.f73237xfb9c03df;
            this.f73237xfb9c03df = i17 + 1;
            arrayList.add(i17, str3);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: appendSwitchesAndArguments */
        public void mo152303xff818b7b(java.lang.String[] strArr) {
            m152312x26748ef9(strArr, 0);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: getCommandLineArguments */
        public java.lang.String[] mo152305x18021aad() {
            java.util.ArrayList<java.lang.String> arrayList = this.f73236x61f46ea;
            return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: getSwitchValue */
        public java.lang.String mo152306x583a9167(java.lang.String str) {
            java.lang.String str2 = this.f73238x1fe86e6f.get(str);
            if (str2 == null || str2.isEmpty()) {
                return null;
            }
            return str2;
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: getSwitches */
        public java.util.Map<java.lang.String, java.lang.String> mo152308x76c50458() {
            return new java.util.HashMap(this.f73238x1fe86e6f);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: hasSwitch */
        public boolean mo152309xefec5a6e(java.lang.String str) {
            return this.f73238x1fe86e6f.containsKey(str);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: removeSwitch */
        public void mo152311xcd4828d8(java.lang.String str) {
            this.f73238x1fe86e6f.remove(str);
            java.lang.String str2 = "--" + str;
            for (int i17 = this.f73237xfb9c03df - 1; i17 > 0; i17--) {
                if (!this.f73236x61f46ea.get(i17).equals(str2)) {
                    if (!this.f73236x61f46ea.get(i17).startsWith(str2 + org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.f73233x1a8ee4c)) {
                    }
                }
                this.f73237xfb9c03df--;
                this.f73236x61f46ea.remove(i17);
            }
        }
    }

    /* renamed from: org.chromium.base.CommandLine$NativeCommandLine */
    /* loaded from: classes13.dex */
    public static class NativeCommandLine extends org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf {

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f73239x7118e671 = false;

        public NativeCommandLine(java.lang.String[] strArr) {
            super();
            org.p3343x72743996.p3344x2e06d1.C29294x7ad3c966.get().mo152319x316510(strArr);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: appendSwitch */
        public void mo152301x4e9036ee(java.lang.String str) {
            org.p3343x72743996.p3344x2e06d1.C29294x7ad3c966.get().mo152313x4e9036ee(str);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: appendSwitchWithValue */
        public void mo152302x5ae550fd(java.lang.String str, java.lang.String str2) {
            org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.Natives natives = org.p3343x72743996.p3344x2e06d1.C29294x7ad3c966.get();
            if (str2 == null) {
                str2 = "";
            }
            natives.mo152314x5ae550fd(str, str2);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: appendSwitchesAndArguments */
        public void mo152303xff818b7b(java.lang.String[] strArr) {
            org.p3343x72743996.p3344x2e06d1.C29294x7ad3c966.get().mo152315xff818b7b(strArr);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: destroy */
        public void mo152304x5cd39ffa() {
            throw new java.lang.IllegalStateException("Can't destroy native command line after startup");
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: getCommandLineArguments */
        public java.lang.String[] mo152305x18021aad() {
            return null;
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: getSwitchValue */
        public java.lang.String mo152306x583a9167(java.lang.String str) {
            return org.p3343x72743996.p3344x2e06d1.C29294x7ad3c966.get().mo152316x583a9167(str);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: getSwitches */
        public java.util.Map<java.lang.String, java.lang.String> mo152308x76c50458() {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String[] mo152317xab547c2b = org.p3343x72743996.p3344x2e06d1.C29294x7ad3c966.get().mo152317xab547c2b();
            for (int i17 = 0; i17 < mo152317xab547c2b.length; i17 += 2) {
                hashMap.put(mo152317xab547c2b[i17], mo152317xab547c2b[i17 + 1]);
            }
            return hashMap;
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: hasSwitch */
        public boolean mo152309xefec5a6e(java.lang.String str) {
            return org.p3343x72743996.p3344x2e06d1.C29294x7ad3c966.get().mo152318xefec5a6e(str);
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: isNativeImplementation */
        public boolean mo152310x139e5bf3() {
            return true;
        }

        @Override // org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf
        /* renamed from: removeSwitch */
        public void mo152311xcd4828d8(java.lang.String str) {
            org.p3343x72743996.p3344x2e06d1.C29294x7ad3c966.get().mo152320xcd4828d8(str);
        }
    }

    /* renamed from: org.chromium.base.CommandLine$Natives */
    /* loaded from: classes13.dex */
    public interface Natives {
        /* renamed from: appendSwitch */
        void mo152313x4e9036ee(java.lang.String str);

        /* renamed from: appendSwitchWithValue */
        void mo152314x5ae550fd(java.lang.String str, java.lang.String str2);

        /* renamed from: appendSwitchesAndArguments */
        void mo152315xff818b7b(java.lang.String[] strArr);

        /* renamed from: getSwitchValue */
        java.lang.String mo152316x583a9167(java.lang.String str);

        /* renamed from: getSwitchesFlattened */
        java.lang.String[] mo152317xab547c2b();

        /* renamed from: hasSwitch */
        boolean mo152318xefec5a6e(java.lang.String str);

        /* renamed from: init */
        void mo152319x316510(java.lang.String[] strArr);

        /* renamed from: removeSwitch */
        void mo152320xcd4828d8(java.lang.String str);
    }

    private AbstractC29292xc4d0dbf() {
    }

    /* renamed from: enableNativeProxy */
    public static void m152291xb60f0314() {
        f73234x811a576c.set(new org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.NativeCommandLine(m152293xc7809444()));
    }

    /* renamed from: getInstance */
    public static org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf m152292x9cf0d20b() {
        return f73234x811a576c.get();
    }

    /* renamed from: getJavaSwitchesOrNull */
    public static java.lang.String[] m152293xc7809444() {
        org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf abstractC29292xc4d0dbf = f73234x811a576c.get();
        if (abstractC29292xc4d0dbf != null) {
            return abstractC29292xc4d0dbf.mo152305x18021aad();
        }
        return null;
    }

    /* renamed from: init */
    public static void m152294x316510(java.lang.String[] strArr) {
        m152299x97a93317(new org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf.JavaCommandLine(strArr));
    }

    /* renamed from: initFromFile */
    public static void m152295x3ce75576(java.lang.String str) {
        char[] m152297x857d8d95 = m152297x857d8d95(str);
        java.lang.String[] m152300xc0eb7693 = m152297x857d8d95 == null ? null : m152300xc0eb7693(m152297x857d8d95);
        m152294x316510(m152300xc0eb7693);
        if (m152300xc0eb7693 != null) {
            org.p3343x72743996.p3344x2e06d1.Log.i(TAG, "COMMAND-LINE FLAGS: %s (from %s)", java.util.Arrays.toString(m152300xc0eb7693), str);
        }
    }

    /* renamed from: isInitialized */
    public static boolean m152296xf582434a() {
        return f73234x811a576c.get() != null;
    }

    /* renamed from: readFileAsUtf8 */
    private static char[] m152297x857d8d95(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        try {
            java.io.FileReader fileReader = new java.io.FileReader(file);
            try {
                char[] cArr = new char[(int) file.length()];
                char[] copyOfRange = java.util.Arrays.copyOfRange(cArr, 0, fileReader.read(cArr));
                fileReader.close();
                return copyOfRange;
            } finally {
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* renamed from: resetForTesting */
    public static void m152298x2c3fdbb6() {
        m152299x97a93317(null);
    }

    /* renamed from: setInstance */
    private static void m152299x97a93317(org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf abstractC29292xc4d0dbf) {
        org.p3343x72743996.p3344x2e06d1.AbstractC29292xc4d0dbf andSet = f73234x811a576c.getAndSet(abstractC29292xc4d0dbf);
        if (andSet != null) {
            andSet.mo152304x5cd39ffa();
        }
    }

    /* renamed from: tokenizeQuotedArguments */
    public static java.lang.String[] m152300xc0eb7693(char[] cArr) {
        if (cArr.length > 98304) {
            throw new java.lang.RuntimeException("Flags file too big: " + cArr.length);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = null;
        char c17 = 0;
        for (char c18 : cArr) {
            if ((c17 == 0 && (c18 == '\'' || c18 == '\"')) || c18 == c17) {
                if (sb6 == null || sb6.length() <= 0 || sb6.charAt(sb6.length() - 1) != '\\') {
                    c17 = c17 == 0 ? c18 : (char) 0;
                } else {
                    sb6.setCharAt(sb6.length() - 1, c18);
                }
            } else if (c17 != 0 || !java.lang.Character.isWhitespace(c18)) {
                if (sb6 == null) {
                    sb6 = new java.lang.StringBuilder();
                }
                sb6.append(c18);
            } else if (sb6 != null) {
                arrayList.add(sb6.toString());
                sb6 = null;
            }
        }
        if (sb6 != null) {
            if (c17 != 0) {
                org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "Unterminated quoted string: %s", sb6);
            }
            arrayList.add(sb6.toString());
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    /* renamed from: appendSwitch */
    public abstract void mo152301x4e9036ee(java.lang.String str);

    /* renamed from: appendSwitchWithValue */
    public abstract void mo152302x5ae550fd(java.lang.String str, java.lang.String str2);

    /* renamed from: appendSwitchesAndArguments */
    public abstract void mo152303xff818b7b(java.lang.String[] strArr);

    /* renamed from: destroy */
    public void mo152304x5cd39ffa() {
    }

    /* renamed from: getCommandLineArguments */
    public abstract java.lang.String[] mo152305x18021aad();

    /* renamed from: getSwitchValue */
    public abstract java.lang.String mo152306x583a9167(java.lang.String str);

    /* renamed from: getSwitchValue */
    public java.lang.String m152307x583a9167(java.lang.String str, java.lang.String str2) {
        java.lang.String mo152306x583a9167 = mo152306x583a9167(str);
        return android.text.TextUtils.isEmpty(mo152306x583a9167) ? str2 : mo152306x583a9167;
    }

    /* renamed from: getSwitches */
    public abstract java.util.Map mo152308x76c50458();

    /* renamed from: hasSwitch */
    public abstract boolean mo152309xefec5a6e(java.lang.String str);

    /* renamed from: isNativeImplementation */
    public boolean mo152310x139e5bf3() {
        return false;
    }

    /* renamed from: removeSwitch */
    public abstract void mo152311xcd4828d8(java.lang.String str);
}
