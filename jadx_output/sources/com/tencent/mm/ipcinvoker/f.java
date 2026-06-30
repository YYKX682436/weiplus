package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public abstract class f {
    public static final void a(java.lang.String targetProcessName, android.os.Parcelable parcelable, com.tencent.mm.ipcinvoker.j process, yz5.l lVar) {
        kotlin.jvm.internal.o.g(targetProcessName, "targetProcessName");
        kotlin.jvm.internal.o.g(process, "process");
        com.tencent.mm.ipcinvoker.d0.d(targetProcessName, parcelable, process.getClass(), lVar != null ? new com.tencent.mm.ipcinvoker.e(lVar) : null);
    }

    public static final android.os.Parcelable b(java.lang.String targetProcessName, android.os.Parcelable parcelable, com.tencent.mm.ipcinvoker.k0 process) {
        kotlin.jvm.internal.o.g(targetProcessName, "targetProcessName");
        kotlin.jvm.internal.o.g(process, "process");
        return com.tencent.mm.ipcinvoker.d0.f(targetProcessName, parcelable, process.getClass());
    }
}
