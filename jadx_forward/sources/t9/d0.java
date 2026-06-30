package t9;

/* loaded from: classes15.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f498031a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f498032b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f498033c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f498034d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.regex.Pattern f498035e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f498036f;

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f498037g;

    static {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 == 25 && android.os.Build.VERSION.CODENAME.charAt(0) == 'O') {
            i17 = 26;
        }
        f498031a = i17;
        f498032b = android.os.Build.DEVICE;
        f498033c = android.os.Build.MANUFACTURER;
        f498034d = android.os.Build.MODEL;
        f498035e = java.util.regex.Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        java.util.regex.Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f498036f = java.util.regex.Pattern.compile("%([A-Fa-f0-9]{2})");
        f498037g = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L8
            int r4 = ~r0
            goto L1a
        L8:
            int r0 = r0 + 1
            int r1 = r3.length
            if (r0 >= r1) goto L14
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L14
            goto L8
        L14:
            if (r6 == 0) goto L19
            int r4 = r0 + (-1)
            goto L1a
        L19:
            r4 = r0
        L1a:
            if (r7 == 0) goto L23
            int r3 = r3.length
            int r3 = r3 + (-1)
            int r4 = java.lang.Math.min(r3, r4)
        L23:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.d0.b(long[], long, boolean, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto La
            int r0 = r0 + 2
            int r3 = -r0
            goto L1b
        La:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L15
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L15
            goto La
        L15:
            if (r6 == 0) goto L1a
            int r3 = r0 + 1
            goto L1b
        L1a:
            r3 = r0
        L1b:
            if (r7 == 0) goto L22
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L22:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.d0.c(long[], long, boolean, boolean):int");
    }

    public static void d(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static void e(r9.k kVar) {
        if (kVar != null) {
            try {
                kVar.mo10286x5a5ddf8();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static int f(java.lang.String str) {
        int length = str.length();
        t9.a.a(length <= 4);
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            i17 = (i17 << 8) | str.charAt(i18);
        }
        return i17;
    }

    public static int g(int i17) {
        if (i17 == 8) {
            return 3;
        }
        if (i17 == 16) {
            return 2;
        }
        if (i17 != 24) {
            return i17 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static long h(long j17, long j18, long j19) {
        if (j19 >= j18 && j19 % j18 == 0) {
            return j17 / (j19 / j18);
        }
        if (j19 < j18 && j18 % j19 == 0) {
            return j17 * (j18 / j19);
        }
        return (long) (j17 * (j18 / j19));
    }

    public static void i(long[] jArr, long j17, long j18) {
        int i17 = 0;
        if (j18 >= j17 && j18 % j17 == 0) {
            long j19 = j18 / j17;
            while (i17 < jArr.length) {
                jArr[i17] = jArr[i17] / j19;
                i17++;
            }
            return;
        }
        if (j18 >= j17 || j17 % j18 != 0) {
            double d17 = j17 / j18;
            while (i17 < jArr.length) {
                jArr[i17] = (long) (jArr[i17] * d17);
                i17++;
            }
            return;
        }
        long j27 = j17 / j18;
        while (i17 < jArr.length) {
            jArr[i17] = jArr[i17] * j27;
            i17++;
        }
    }

    public static java.lang.String j(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(java.util.Locale.US);
    }
}
