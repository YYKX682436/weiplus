package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class sa {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.sa f105863a = new com.tencent.mm.plugin.finder.extension.reddot.sa();

    /* renamed from: b, reason: collision with root package name */
    public static java.util.HashSet f105864b;

    public final boolean a(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        r45.vs2 vs2Var;
        java.util.HashSet hashSet = f105864b;
        if (hashSet == null || hashSet.isEmpty()) {
            return false;
        }
        long j17 = (jbVar == null || (vs2Var = jbVar.field_ctrInfo) == null) ? 0L : vs2Var.C;
        java.util.HashSet hashSet2 = f105864b;
        return hashSet2 != null && hashSet2.contains(java.lang.Long.valueOf(j17));
    }
}
