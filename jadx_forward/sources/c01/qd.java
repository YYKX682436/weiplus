package c01;

/* loaded from: classes12.dex */
public class qd {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f118936c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.Future[] f118937d = {null};

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f118938a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f118939b;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x011d, code lost:
    
        if (r0.equals(r6.get(r6.size() - 1)) == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qd(java.lang.String r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.qd.<init>(java.lang.String, boolean, boolean):void");
    }

    public static java.lang.String a(int i17) {
        java.util.concurrent.Future future;
        try {
            java.util.concurrent.Future[] futureArr = f118937d;
            synchronized (futureArr) {
                future = futureArr[0];
            }
            return future != null ? ((c01.qd) future.get()).b(i17) : "";
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VersionHistory", th6, "[-] Failure in getGlobalLastHistoryVer()", new java.lang.Object[0]);
            return "";
        }
    }

    public static void c(java.lang.String str) {
        java.util.concurrent.Future[] futureArr = f118937d;
        synchronized (futureArr) {
            futureArr[0] = ((ku5.t0) ku5.t0.f394148d).s(new c01.pd(str));
        }
    }

    public java.lang.String b(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder((i17 << 3) + (i17 << 1) + 4);
        java.util.ArrayList arrayList = this.f118938a;
        for (int size = i17 >= arrayList.size() ? 0 : arrayList.size() - i17; size < arrayList.size(); size++) {
            sb6.append((java.lang.String) arrayList.get(size));
            sb6.append(';');
        }
        return sb6.toString();
    }

    public qd(java.lang.String str, boolean z17) {
        this(str, z17, false);
        java.util.concurrent.Future future;
        try {
            java.util.concurrent.Future[] futureArr = f118937d;
            synchronized (futureArr) {
                future = futureArr[0];
            }
            if (future == null) {
                return;
            }
            c01.qd qdVar = (c01.qd) future.get();
            if (qdVar.f118938a.size() >= this.f118938a.size()) {
                return;
            }
            qdVar.f118938a = this.f118938a;
            com.p314xaae8f345.mm.vfs.w6.c(this.f118939b, qdVar.f118939b);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VersionHistory", th6, "[-] Failure in <init>()", new java.lang.Object[0]);
        }
    }
}
