package com.tencent.mm.hardcoder;

/* loaded from: classes15.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.hardcoder.m f68276a;

    public static void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.hardcoder.m mVar;
        if (!com.tencent.mm.hardcoder.HardCoderJNI.isHcDebug() || (mVar = f68276a) == null) {
            return;
        }
        mVar.d(str, str2);
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.hardcoder.m mVar = f68276a;
        if (mVar == null) {
            return;
        }
        mVar.e(str, str2);
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.hardcoder.m mVar = f68276a;
        if (mVar == null) {
            return;
        }
        mVar.i(str, str2);
    }
}
