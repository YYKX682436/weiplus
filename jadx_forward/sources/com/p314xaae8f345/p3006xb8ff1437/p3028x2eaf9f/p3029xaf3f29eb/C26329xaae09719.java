package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPSystemInfo */
/* loaded from: classes13.dex */
public class C26329xaae09719 {

    /* renamed from: CHIP_ARM_AARCH64 */
    public static final int f52360x2fbf9e9f = 7;

    /* renamed from: CHIP_ARM_LATER */
    public static final int f52361xd712676 = 50;

    /* renamed from: CHIP_ARM_V5 */
    public static final int f52362x7f673ad5 = 3;

    /* renamed from: CHIP_ARM_V6 */
    public static final int f52363x7f673ad6 = 4;

    /* renamed from: CHIP_ARM_V7_NENO */
    public static final int f52364x764e2e20 = 6;

    /* renamed from: CHIP_ARM_V7_NO_NENO */
    public static final int f52365x65ea3c0e = 5;

    /* renamed from: CHIP_MIPS */
    public static final int f52366xa8c718b2 = 2;

    /* renamed from: CHIP_UNKNOW */
    public static final int f52367xa14e9ff7 = 0;

    /* renamed from: CHIP_X86 */
    public static final int f52368x91d506e3 = 1;

    /* renamed from: CPU_HW_HISI */
    public static final int f52369x90a97c90 = 2;

    /* renamed from: CPU_HW_MTK */
    public static final int f52370xe3a272eb = 1;

    /* renamed from: CPU_HW_OTHER */
    public static final int f52371x84ed9097 = -1;

    /* renamed from: CPU_HW_QUALCOMM */
    public static final int f52372xf2c0c1d4 = 0;

    /* renamed from: CPU_HW_SAMSUNG */
    public static final int f52373xb34587c1 = 3;

    /* renamed from: SDK_INT */
    public static final int f52378x9efbee2a;

    /* renamed from: sAppInstallTime */
    private static long f52379x51196d7a;

    /* renamed from: sScreenHeight */
    public static int f52395xb6fb7cc6;

    /* renamed from: sScreenWidth */
    public static int f52396xd52fd247;

    /* renamed from: DEVICE_MANUFACTURER */
    private static final java.lang.String f52374x4cd5f1a = android.os.Build.MANUFACTURER;

    /* renamed from: DEVICE_OS_VERSION */
    private static final java.lang.String f52375xd298c6e6 = android.os.Build.VERSION.RELEASE;

    /* renamed from: PRODUCT_DEVICE */
    private static final java.lang.String f52377x174ffc6 = android.os.Build.DEVICE;

    /* renamed from: PRODUCT_BOARD */
    private static final java.lang.String f52376x42049b56 = android.os.Build.BOARD;

    /* renamed from: sProcessorName */
    private static java.lang.String f52394x24a8648a = "N/A";

    /* renamed from: sFeature */
    private static java.lang.String f52390xd3023b03 = "";

    /* renamed from: sCpuHardware */
    private static java.lang.String f52386x1ae2953d = "";

    /* renamed from: sDeviceName */
    private static java.lang.String f52389x881b1ad4 = "";

    /* renamed from: sCpuArchitecture */
    private static int f52383xe7b56628 = 0;

    /* renamed from: sCpuHWProducter */
    private static int f52385x76281e38 = -1;

    /* renamed from: sCpuHWProductIdx */
    private static int f52384x4edb3e72 = -1;

    /* renamed from: sAudioBestSampleRate */
    private static int f52381xda9b44b1 = 0;

    /* renamed from: sAudioBestFramesPerBust */
    private static int f52380x469ca8c4 = 0;

    /* renamed from: sCpuPerfList */
    private static final java.lang.String[][] f52387x2d8daa7c = {new java.lang.String[]{"MSM7227", "MSM7627", "MSM7227T", "MSM7627T", "MSM7227A", "MSM7627A", "QSD8250", "QSD8650", "MSM7230", "MSM7630", "APQ8055", "MSM8255", "MSM8655", "MSM8255T", "MSM8655T", "MSM8225", "MSM8625", "MSM8260", "MSM8660", "MSM8x25Q", "MSM8x26", "MSM8x10", "MSM8x12", "MSM8x30", "MSM8260A", "MSM8660A", "MSM8960", "MSM8208", "MSM8916", "MSM8960T", "MSM8909", "MSM8916v2", "MSM8936", "MSM8909v2", "MSM8917", "APQ8064", "APQ8064T", "MSM8920", "MSM8939", "MSM8937", "MSM8939v2", "MSM8940", "MSM8952", "MSM8974", "MSM8x74AA", "MSM8x74AB", "MSM8x74AC", "MSM8953", "APQ8084", "MSM8953Pro", "MSM8992", "MSM8956", "MSM8976", "MSM8976Pro", "MSM8994", "MSM8996", "MSM8996Pro", "MSM8998", "SDM845", "SM8150", "SM8250", "SM8250-AB", "SM8250-AC", "SM8350", "SM8350-AC", "SM8450"}, new java.lang.String[]{"MT6516", "MT6513", "MT6573", "MT6515M", "MT6515", "MT6575", "MT6572", "MT6577", "MT6589", "MT6582", "MT6592", "MT6595", "MT6735", "MT6750", "MT6753", "MT6752", "MT6755", "MT6755", "MT6755T", "MT6795", "MT6757", "MT675x", "MT6797", "MT6797T", "MT6797X", "MT6771V", "MT6799", "MT6769Z", "MT6785T", "MT6853V", "MT6853V", "MT6873", "MT6874", "MT6875", "MT6877", "MT6885", "MT6889V", "MT6889Z", "MT6891Z", "MT6893", "MT6983"}, new java.lang.String[]{"K3V2", "K3V2E", "K3V2+", "Kirin910", "Kirin920", "Kirin925", "Kirin928", "Kirin620", "Kirin650", "Kirin655", "Kirin930", "Kirin935", "Kirin950", "Kirin955", "Kirin960", "Kirin970", "Kirin810", "Kirin980", "Kirin820", "Kirin985", "Kirin990", "Kirin9000E", "Kirin9000"}, new java.lang.String[]{"S5L8900", "S5PC100", "Exynos3110", "Exynos3475", "Exynos4210", "Exynos4212", "SMDK4x12", "Exynos4412", "Exynos5250", "Exynos5260", "Exynos5410", "Exynos5420", "Exynos5422", "Exynos5430", "Exynos5800", "Exynos5433", "Exynos7580", "Exynos7870", "Exynos7870", "Exynos7420", "Exynos8890", "Exynos890", "Exynos8895", "Exynos9810", "Exynos9820", "Exynos9825", "Exynos990", "Exynos1080", "Exynos2100", "Exynos2200"}};

    /* renamed from: sMaxCpuFreq */
    private static long f52391xda40fb0f = -1;

    /* renamed from: sCurrentCpuFreq */
    private static long f52388xfdcdefda = -1;

    /* renamed from: sNumOfCores */
    private static int f52392x5442878a = -1;

    /* renamed from: sCpuArch */
    private static int f52382x4817722b = -1;

    /* renamed from: sOpenGLVersion */
    private static int f52393x9293df76 = 0;

    static {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 == 25) {
            java.lang.String str = android.os.Build.VERSION.CODENAME;
            if (!android.text.TextUtils.isEmpty(str) && str.charAt(0) == 'O') {
                i17 = 26;
            }
        }
        f52378x9efbee2a = i17;
    }

    /* renamed from: checkPermission */
    private static boolean m101933x28e6dcf7(android.content.Context context, java.lang.String str) {
        if (!m101959xdcdcd1f5()) {
            return true;
        }
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if ("android.permission.WRITE_SETTINGS".equals(str)) {
            return android.provider.Settings.System.canWrite(context);
        }
        try {
            return b3.l.m9698x3fed0563(context, str) == 0;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: getApiLevel */
    public static int m101934xb471af00() {
        return android.os.Build.VERSION.SDK_INT;
    }

    /* renamed from: getBestAudioFramesPerBust */
    public static int m101935x44c664ef() {
        return f52380x469ca8c4;
    }

    /* renamed from: getBestAudioSampleRate */
    public static int m101936x7ffff066() {
        return f52381xda9b44b1;
    }

    /* renamed from: getCpuArchFromId */
    public static int m101937x98f2aa6d(int i17) {
        if (i17 != 64) {
            switch (i17) {
                case 5:
                    return 3;
                case 6:
                    return 4;
                case 7:
                    return 6;
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return 0;
            }
        }
        return 7;
    }

    /* renamed from: getCpuArchitecture */
    public static int m101938xb2fdd4e5() {
        int i17 = f52382x4817722b;
        if (-1 != i17) {
            return i17;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCpuArchitecture Build.CPU_ABI: ");
        java.lang.String str = android.os.Build.CPU_ABI;
        sb6.append(str);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, sb6.toString());
        if (str.contains("arm64-v8a")) {
            f52382x4817722b = 7;
            return 7;
        }
        if (str != null && (str.contains("x86") || str.contains("X86"))) {
            f52382x4817722b = 1;
        } else if (str == null || !(str.contains("mips") || str.contains("Mips"))) {
            if (f52383xe7b56628 == 0) {
                m101944x78888240();
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "getCpuArchitecture mCpuArchitecture:" + f52383xe7b56628);
            if (!android.text.TextUtils.isEmpty(f52386x1ae2953d) && f52386x1ae2953d.contains("MSM8994")) {
                f52382x4817722b = 7;
                return 7;
            }
            if (m101961x9f029856()) {
                f52382x4817722b = 3;
                return 3;
            }
            if (!android.text.TextUtils.isEmpty(f52394x24a8648a) && f52394x24a8648a.contains("ARMv6")) {
                f52382x4817722b = 4;
                return 4;
            }
            if (!android.text.TextUtils.isEmpty(f52394x24a8648a) && f52394x24a8648a.contains("AArch64")) {
                f52382x4817722b = 7;
                return 7;
            }
            if (f52383xe7b56628 == 7 && !android.text.TextUtils.isEmpty(f52390xd3023b03) && !f52390xd3023b03.contains("neon") && !f52390xd3023b03.contains("asimd")) {
                f52382x4817722b = 4;
                return 4;
            }
            f52382x4817722b = m101937x98f2aa6d(f52383xe7b56628);
        } else {
            f52382x4817722b = 2;
        }
        return f52382x4817722b;
    }

    /* renamed from: getCpuHWProducer */
    private static int m101939x443909b3(java.lang.String str) {
        if (str.isEmpty()) {
            return -1;
        }
        if (str.contains("Exynos") || str.contains("SMDK") || str.contains("S5L8900") || str.contains("S5PC100")) {
            return 3;
        }
        if (str.contains("Kirin") || str.contains("K3V")) {
            return 2;
        }
        if (str.contains("MSM") || str.contains("APQ") || str.contains("QSD") || str.contains("SDM") || str.contains("SM")) {
            return 0;
        }
        return str.contains("MT6") ? 1 : -1;
    }

    /* renamed from: getCpuHWProductIndex */
    public static int m101941x1ff16ac4(java.lang.String str) {
        if (f52385x76281e38 < 0) {
            f52385x76281e38 = m101939x443909b3(str);
        }
        int i17 = f52385x76281e38;
        if (i17 >= 0 && f52384x4edb3e72 < 0) {
            java.lang.String[] strArr = f52387x2d8daa7c[i17];
            int i18 = -1;
            for (int i19 = 0; i19 < strArr.length; i19++) {
                if (str.contains(strArr[i19]) && (-1 == i18 || strArr[i19].length() > strArr[i18].length())) {
                    i18 = i19;
                }
            }
            f52384x4edb3e72 = i18;
        }
        return f52384x4edb3e72;
    }

    /* renamed from: getCpuHWProducter */
    public static int m101942x42e863db(java.lang.String str) {
        if (f52385x76281e38 < 0) {
            f52385x76281e38 = m101939x443909b3(str);
        }
        return f52385x76281e38;
    }

    /* renamed from: getCpuHarewareName */
    public static java.lang.String m101943x709d7b26() {
        if (android.text.TextUtils.isEmpty(f52386x1ae2953d)) {
            m101944x78888240();
        }
        return f52386x1ae2953d;
    }

    /* renamed from: getCpuInfo */
    public static void m101944x78888240() {
        java.io.BufferedReader bufferedReader;
        java.io.InputStreamReader inputStreamReader = null;
        try {
            try {
                java.io.InputStreamReader inputStreamReader2 = new java.io.InputStreamReader(new java.io.FileInputStream("/proc/cpuinfo"), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                try {
                    bufferedReader = new java.io.BufferedReader(inputStreamReader2);
                    while (true) {
                        try {
                            java.lang.String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                inputStreamReader2.close();
                                bufferedReader.close();
                                return;
                            }
                            m101962x285f2ed7(readLine);
                        } catch (java.lang.Throwable unused) {
                            inputStreamReader = inputStreamReader2;
                            try {
                                f52386x1ae2953d = "Unknown";
                                f52383xe7b56628 = 0;
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                    return;
                                }
                                return;
                            } catch (java.lang.Throwable th6) {
                                if (inputStreamReader != null) {
                                    try {
                                        inputStreamReader.close();
                                    } catch (java.io.IOException e17) {
                                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e17.getMessage());
                                        throw th6;
                                    }
                                }
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                throw th6;
                            }
                        }
                    }
                } catch (java.lang.Throwable unused2) {
                    bufferedReader = null;
                }
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e18.getMessage());
            }
        } catch (java.lang.Throwable unused3) {
            bufferedReader = null;
        }
    }

    /* renamed from: getCurrentCpuFreq */
    public static long m101945xca8e357d() {
        java.io.InputStreamReader inputStreamReader;
        java.lang.Throwable th6;
        java.io.BufferedReader bufferedReader;
        java.lang.Exception e17;
        java.io.IOException e18;
        java.io.FileNotFoundException e19;
        java.lang.String readLine;
        long j17 = f52388xfdcdefda;
        if (j17 > 0) {
            return j17;
        }
        try {
            try {
                try {
                    inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    try {
                        bufferedReader = new java.io.BufferedReader(inputStreamReader);
                        try {
                            readLine = bufferedReader.readLine();
                        } catch (java.io.FileNotFoundException e27) {
                            e19 = e27;
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e19.getMessage());
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return r4;
                        } catch (java.io.IOException e28) {
                            e18 = e28;
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e18.getMessage());
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return r4;
                        } catch (java.lang.Exception e29) {
                            e17 = e29;
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e17.getMessage());
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return r4;
                        } catch (java.lang.Throwable th7) {
                            th6 = th7;
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
                            return r4;
                        }
                    } catch (java.io.FileNotFoundException e37) {
                        bufferedReader = null;
                        e19 = e37;
                    } catch (java.io.IOException e38) {
                        bufferedReader = null;
                        e18 = e38;
                    } catch (java.lang.Exception e39) {
                        bufferedReader = null;
                        e17 = e39;
                    } catch (java.lang.Throwable th8) {
                        bufferedReader = null;
                        th6 = th8;
                    }
                } finally {
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                }
            } catch (java.io.FileNotFoundException e47) {
                inputStreamReader = null;
                e19 = e47;
                bufferedReader = null;
            } catch (java.io.IOException e48) {
                inputStreamReader = null;
                e18 = e48;
                bufferedReader = null;
            } catch (java.lang.Exception e49) {
                inputStreamReader = null;
                e17 = e49;
                bufferedReader = null;
            } catch (java.lang.Throwable th9) {
                inputStreamReader = null;
                th6 = th9;
                bufferedReader = null;
            }
            if (readLine == null) {
                inputStreamReader.close();
                bufferedReader.close();
                inputStreamReader.close();
                bufferedReader.close();
                return 0L;
            }
            java.lang.String trim = readLine.trim();
            r4 = trim.length() > 0 ? java.lang.Long.parseLong(trim) : 1024000L;
            f52388xfdcdefda = r4;
            inputStreamReader.close();
            bufferedReader.close();
            return r4;
        } catch (java.lang.Throwable th10) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th10.getMessage());
            return 0L;
        }
    }

    /* renamed from: getDeviceManufacturer */
    public static java.lang.String m101946x8a78273d() {
        return f52374x4cd5f1a;
    }

    /* renamed from: getDeviceName */
    public static synchronized java.lang.String m101947x1ccda9f7() {
        java.lang.String str;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.class) {
            if (android.text.TextUtils.isEmpty(f52389x881b1ad4)) {
                f52389x881b1ad4 = android.os.Build.MODEL;
            }
            str = f52389x881b1ad4;
        }
        return str;
    }

    /* renamed from: getMaxCpuFreq */
    public static long m101948x6ef38a32() {
        java.io.BufferedReader bufferedReader;
        java.io.InputStreamReader inputStreamReader;
        java.lang.String readLine;
        long j17 = f52391xda40fb0f;
        if (-1 != j17) {
            return j17;
        }
        java.io.InputStreamReader inputStreamReader2 = null;
        try {
            try {
                inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                try {
                    bufferedReader = new java.io.BufferedReader(inputStreamReader);
                } catch (java.io.IOException unused) {
                    bufferedReader = null;
                } catch (java.lang.Throwable unused2) {
                    bufferedReader = null;
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e17.getMessage());
            }
        } catch (java.io.IOException unused3) {
            bufferedReader = null;
        } catch (java.lang.Throwable unused4) {
            bufferedReader = null;
        }
        try {
            readLine = bufferedReader.readLine();
        } catch (java.io.IOException unused5) {
            inputStreamReader2 = inputStreamReader;
            if (inputStreamReader2 != null) {
                inputStreamReader2.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            f52391xda40fb0f = r2;
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "MaxCpuFreq " + f52391xda40fb0f);
            return r2;
        } catch (java.lang.Throwable unused6) {
            inputStreamReader2 = inputStreamReader;
            if (inputStreamReader2 != null) {
                inputStreamReader2.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            f52391xda40fb0f = r2;
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "MaxCpuFreq " + f52391xda40fb0f);
            return r2;
        }
        if (readLine == null) {
            inputStreamReader.close();
            bufferedReader.close();
            try {
                inputStreamReader.close();
                bufferedReader.close();
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e18.getMessage());
            }
            return 0L;
        }
        java.lang.String trim = readLine.trim();
        r2 = trim.length() > 0 ? java.lang.Long.parseLong(trim) : 0L;
        inputStreamReader.close();
        bufferedReader.close();
        f52391xda40fb0f = r2;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "MaxCpuFreq " + f52391xda40fb0f);
        return r2;
    }

    /* renamed from: getNumCores */
    public static int m101949x9b92a44() {
        int i17 = f52392x5442878a;
        if (-1 != i17) {
            return i17;
        }
        try {
            java.io.File[] listFiles = new java.io.File("/sys/devices/system/cpu/").listFiles(new java.io.FileFilter() { // from class: com.tencent.thumbplayer.core.common.TPSystemInfo.1CpuFilter
                @Override // java.io.FileFilter
                public boolean accept(java.io.File file) {
                    return java.util.regex.Pattern.matches("cpu[0-9]", file.getName());
                }
            });
            if (listFiles == null) {
                f52392x5442878a = 1;
                return 1;
            }
            f52392x5442878a = listFiles.length;
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "core num " + f52392x5442878a);
            return f52392x5442878a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e17.getMessage());
            f52392x5442878a = 1;
            return 1;
        }
    }

    /* renamed from: getOpenGLSupportVersion */
    public static int m101950xc5be8d0e(android.content.Context context) {
        if (f52393x9293df76 == 0) {
            try {
                android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getApplicationContext().getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                if (activityManager == null) {
                    return f52393x9293df76;
                }
                f52393x9293df76 = activityManager.getDeviceConfigurationInfo().reqGlEsVersion;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            }
        }
        return f52393x9293df76;
    }

    /* renamed from: getOsVersion */
    public static java.lang.String m101951x6b6e6f9e() {
        return f52375xd298c6e6;
    }

    /* renamed from: getProductBoard */
    public static java.lang.String m101952x9bd081ad() {
        return f52376x42049b56;
    }

    /* renamed from: getProductDevice */
    public static java.lang.String m101953xe125e46f() {
        return f52377x174ffc6;
    }

    /* renamed from: getScreenHeight */
    public static int m101954xe946cf29(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        int i17 = f52395xb6fb7cc6;
        if (i17 != 0) {
            return i17;
        }
        try {
            f52395xb6fb7cc6 = context.getResources().getDisplayMetrics().heightPixels;
        } catch (java.lang.Throwable unused) {
            f52395xb6fb7cc6 = 0;
        }
        return f52395xb6fb7cc6;
    }

    /* renamed from: getScreenWidth */
    public static int m101955xd6cf2784(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        int i17 = f52396xd52fd247;
        if (i17 != 0) {
            return i17;
        }
        try {
            f52396xd52fd247 = context.getResources().getDisplayMetrics().widthPixels;
        } catch (java.lang.Throwable unused) {
            f52396xd52fd247 = 0;
        }
        return f52396xd52fd247;
    }

    /* renamed from: getSystemCpuUsage */
    public static int m101956xb0e5d91e(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return -1;
        }
        float f17 = -1.0f;
        try {
            java.lang.String[] split = str.trim().split("\\s+");
            long m101957x96da0106 = m101957x96da0106(split);
            long m101958x3b22ed6d = m101958x3b22ed6d(split);
            java.lang.String[] split2 = str2.trim().split("\\s+");
            long m101957x96da01062 = m101957x96da0106(split2);
            long m101958x3b22ed6d2 = m101958x3b22ed6d(split2);
            if (m101957x96da0106 >= 0 && m101958x3b22ed6d >= 0 && m101957x96da01062 >= 0 && m101958x3b22ed6d2 >= 0) {
                long j17 = m101957x96da01062 + m101958x3b22ed6d2;
                long j18 = m101957x96da0106 + m101958x3b22ed6d;
                if (j17 > j18 && m101958x3b22ed6d2 >= m101958x3b22ed6d) {
                    f17 = (((float) (m101958x3b22ed6d2 - m101958x3b22ed6d)) / ((float) (j17 - j18))) * 100.0f;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
        }
        return (int) f17;
    }

    /* renamed from: getSystemIdleTime */
    public static long m101957x96da0106(java.lang.String[] strArr) {
        try {
            return java.lang.Long.parseLong(strArr[4]);
        } catch (java.lang.Throwable unused) {
            return -1L;
        }
    }

    /* renamed from: getSystemUptime */
    public static long m101958x3b22ed6d(java.lang.String[] strArr) {
        long j17 = 0;
        for (int i17 = 1; i17 < strArr.length; i17++) {
            if (4 != i17) {
                try {
                    j17 += java.lang.Long.parseLong(strArr[i17]);
                } catch (java.lang.Throwable unused) {
                    return -1L;
                }
            }
        }
        return j17;
    }

    /* renamed from: hasMarshmallow */
    private static boolean m101959xdcdcd1f5() {
        return true;
    }

    /* renamed from: initAudioBestSettings */
    public static synchronized void m101960xd9f08ded(android.content.Context context) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.class) {
            if (context != null) {
                if (f52381xda9b44b1 <= 0) {
                    android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
                    java.lang.String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
                    java.lang.String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
                    try {
                        f52381xda9b44b1 = java.lang.Integer.parseInt(property);
                        f52380x469ca8c4 = java.lang.Integer.parseInt(property2);
                    } catch (java.lang.NumberFormatException e17) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e17.getMessage());
                    }
                }
            }
        }
    }

    /* renamed from: isARMV5Whitelist */
    public static boolean m101961x9f029856() {
        return m101947x1ccda9f7().equals("XT882") || m101947x1ccda9f7().equals("ME860") || m101947x1ccda9f7().equals("MB860") || m101947x1ccda9f7().equals("Lenovo P70") || m101947x1ccda9f7().equals("Lenovo A60") || m101947x1ccda9f7().equals("Lenovo A366t");
    }

    /* renamed from: parseCpuInfoLine */
    private static void m101962x285f2ed7(java.lang.String str) {
        int indexOf;
        int indexOf2;
        if (str.contains("aarch64") || str.contains("AArch64")) {
            f52383xe7b56628 = 64;
        }
        if (str.startsWith("Processor")) {
            int indexOf3 = str.indexOf(58);
            if (indexOf3 > 1) {
                java.lang.String substring = str.substring(indexOf3 + 1, str.length());
                f52394x24a8648a = substring;
                f52394x24a8648a = substring.trim();
                return;
            }
            return;
        }
        if (str.startsWith("CPU architecture")) {
            if (f52383xe7b56628 != 0 || (indexOf2 = str.indexOf(58)) <= 1) {
                return;
            }
            java.lang.String trim = str.substring(indexOf2 + 1, str.length()).trim();
            if (trim.length() > 0 && trim.length() < 2) {
                f52383xe7b56628 = (int) java.lang.Long.parseLong(trim);
                return;
            } else {
                if (trim.length() > 1) {
                    f52383xe7b56628 = (int) java.lang.Long.parseLong(trim.substring(0, 1));
                    return;
                }
                return;
            }
        }
        if (str.startsWith("Features")) {
            int indexOf4 = str.indexOf(58);
            if (indexOf4 > 1) {
                f52390xd3023b03 = str.substring(indexOf4 + 1, str.length()).trim();
                return;
            }
            return;
        }
        if (!str.startsWith("Hardware") || (indexOf = str.indexOf(58)) <= 1) {
            return;
        }
        f52386x1ae2953d = str.substring(indexOf + 1, str.length()).trim().replace(" ", "");
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "hardware " + f52386x1ae2953d);
        m101941x1ff16ac4(f52386x1ae2953d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0038, code lost:
    
        if (r1 == null) goto L18;
     */
    /* renamed from: readStringFromFile */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m101963x13e166ad(java.io.File r6) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L37 java.io.FileNotFoundException -> L3c
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L37 java.io.FileNotFoundException -> L3c
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L37 java.io.FileNotFoundException -> L3c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37 java.io.FileNotFoundException -> L3c
            long r2 = r6.length()     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L17
            goto L30
        L17:
            long r2 = r6.length()     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            int r2 = (int) r2     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            char[] r2 = new char[r2]     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            long r3 = r6.length()     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            int r6 = (int) r3     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            r3 = 0
            int r6 = r1.read(r2, r3, r6)     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            if (r6 <= 0) goto L30
            java.lang.String r6 = new java.lang.String     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            r6.<init>(r2)     // Catch: java.io.FileNotFoundException -> L34 java.lang.Throwable -> L38
            r0 = r6
        L30:
            r1.close()     // Catch: java.lang.Throwable -> L3b
            goto L3b
        L34:
            r6 = move-exception
            r0 = r1
            goto L3d
        L37:
            r1 = r0
        L38:
            if (r1 == 0) goto L3b
            goto L30
        L3b:
            return r0
        L3c:
            r6 = move-exception
        L3d:
            throw r6     // Catch: java.lang.Throwable -> L3e
        L3e:
            r6 = move-exception
            if (r0 == 0) goto L44
            r0.close()     // Catch: java.lang.Throwable -> L44
        L44:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101963x13e166ad(java.io.File):java.lang.String");
    }

    /* renamed from: readSystemStat */
    public static java.lang.String m101964x5f3def59() {
        java.io.RandomAccessFile randomAccessFile;
        java.lang.String str = null;
        try {
            try {
                randomAccessFile = new java.io.RandomAccessFile("/proc/stat", "r");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, th6.getMessage());
            }
        } catch (java.lang.Throwable unused) {
            randomAccessFile = null;
        }
        try {
            str = randomAccessFile.readLine();
            randomAccessFile.close();
        } catch (java.lang.Throwable unused2) {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            return str;
        }
        return str;
    }

    /* renamed from: setDeviceName */
    public static synchronized void m101965x4af1f803(java.lang.String str) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.class) {
            f52389x881b1ad4 = str;
        }
    }

    /* renamed from: supportInDeviceDolbyAudioEffect */
    public static boolean m101966x9de8a179() {
        boolean z17;
        java.lang.Exception e17;
        try {
            z17 = false;
            for (android.media.audiofx.AudioEffect.Descriptor descriptor : android.media.audiofx.AudioEffect.queryEffects()) {
                try {
                    if (descriptor.implementor.contains("Dolby Laboratories")) {
                        z17 = true;
                    }
                } catch (java.lang.Exception e18) {
                    e17 = e18;
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, e17.getMessage());
                    return z17;
                }
            }
        } catch (java.lang.Exception e19) {
            z17 = false;
            e17 = e19;
        }
        return z17;
    }

    /* renamed from: writeStringToFile */
    private static void m101967x4f11d387(java.lang.String str, java.lang.String str2) {
        java.io.FileWriter fileWriter = null;
        try {
            java.io.File file = new java.io.File(str);
            if (file.exists() || !file.createNewFile()) {
                java.io.FileWriter fileWriter2 = new java.io.FileWriter(file, false);
                try {
                    fileWriter2.write(str2);
                    fileWriter2.flush();
                    fileWriter2.close();
                } catch (java.lang.Throwable unused) {
                    fileWriter = fileWriter2;
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                }
            }
        } catch (java.lang.Throwable unused3) {
        }
    }

    /* renamed from: getCpuHWProductIndex */
    public static int m101940x1ff16ac4(int i17, java.lang.String str) {
        if (i17 >= 0) {
            java.lang.String[][] strArr = f52387x2d8daa7c;
            if (i17 >= strArr.length || android.text.TextUtils.isEmpty(str)) {
                return -1;
            }
            java.lang.String[] strArr2 = strArr[i17];
            for (int i18 = 0; i18 < strArr2.length; i18++) {
                if (android.text.TextUtils.equals(str, strArr2[i18])) {
                    return i18;
                }
            }
        }
        return -1;
    }
}
