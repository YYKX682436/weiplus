package qv5;

/* loaded from: classes13.dex */
public abstract class b extends qv5.c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f448575a = new java.util.ArrayList();

    public static boolean c(tv5.b bVar, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26641x1cdfa429 c26641x1cdfa429, android.content.Context context, java.lang.String str, java.io.File file) {
        java.util.zip.ZipFile zipFile;
        java.lang.String str2;
        java.lang.String str3 = c26641x1cdfa429.m104717xa17536fe().get(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55621x995b81ea);
        if (str3 == null) {
            return true;
        }
        java.lang.String str4 = str + "/arkHot/";
        java.util.ArrayList arrayList = f448575a;
        arrayList.clear();
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26629x8c0ce37f.m104620x116ae9e(str3, arrayList);
        tv5.b b17 = tv5.b.b(context);
        java.util.zip.ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new java.util.zip.ZipFile(file);
            } catch (java.io.IOException e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            zipFile = zipFile2;
        }
        try {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26629x8c0ce37f c26629x8c0ce37f = (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26629x8c0ce37f) it.next();
                java.lang.String str5 = c26629x8c0ce37f.f55613x346425;
                if (str5.equals("")) {
                    str2 = c26629x8c0ce37f.f55611x337a8b;
                } else {
                    str2 = str5 + "/" + c26629x8c0ce37f.f55611x337a8b;
                }
                java.lang.String str6 = c26629x8c0ce37f.f55612x4955c816;
                if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104663xd528d483(str6)) {
                    b17.f503905e.c(file, qv5.c.b(8));
                    break;
                }
                java.io.File file2 = new java.io.File(str4 + c26629x8c0ce37f.f55611x337a8b);
                if (!file2.exists()) {
                    file2.getParentFile().mkdirs();
                } else if (!str6.equals(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104676xb5885268(file2))) {
                    file2.delete();
                }
                if (!qv5.c.a(zipFile, zipFile.getEntry(str2), file2, str6, false)) {
                    b17.f503905e.a(file, file2, c26629x8c0ce37f.f55611x337a8b, 8);
                    break;
                }
            }
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104667x41231e09(zipFile);
            return true;
        } catch (java.io.IOException e18) {
            e = e18;
            zipFile2 = zipFile;
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("patch " + com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104736x9973bfe1(8) + " extract failed (" + e.getMessage() + ").", e);
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104667x41231e09(zipFile);
            throw th;
        }
    }
}
