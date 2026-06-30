package com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a;

/* loaded from: classes11.dex */
public class b implements java.io.FilenameFilter {
    @Override // java.io.FilenameFilter
    public boolean accept(java.io.File file, java.lang.String str) {
        return str.endsWith(".crashlog") || str.endsWith(".preventcrashlog");
    }
}
