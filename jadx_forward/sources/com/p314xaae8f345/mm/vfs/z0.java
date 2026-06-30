package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class z0 extends com.p314xaae8f345.mm.vfs.b1 {
    @Override // com.p314xaae8f345.mm.vfs.b1
    public boolean a(com.p314xaae8f345.mm.vfs.a1 a1Var) {
        if (a1Var.f294299b == 7) {
            java.lang.String str = a1Var.f294301d;
            if (str.startsWith("${data}/") && java.util.Arrays.binarySearch(com.p314xaae8f345.mm.vfs.c1.f294394t, str.substring(8)) >= 0 && a1Var.f294298a.equals("@DiskSpace-NonAccountData-${data}")) {
                return true;
            }
        }
        return false;
    }
}
