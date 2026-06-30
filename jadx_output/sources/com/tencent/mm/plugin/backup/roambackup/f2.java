package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.f2 f92595d = new com.tencent.mm.plugin.backup.roambackup.f2();

    public f2() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.ArrayList pkgs = (java.util.ArrayList) obj2;
        kotlin.jvm.internal.o.g(pkgs, "pkgs");
        if (intValue == 0) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.backup.roambackup.e2(pkgs));
        } else {
            com.tencent.mm.plugin.backup.roambackup.l2.f92647d.set(false);
        }
        return jz5.f0.f302826a;
    }
}
