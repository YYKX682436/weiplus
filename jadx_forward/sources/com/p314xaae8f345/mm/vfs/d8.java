package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class d8 extends java.lang.RuntimeException {
    public d8(java.lang.Class cls, int i17, int i18) {
        super("Version mismatch when unmarhelling " + cls.getName() + " (" + i18 + " expected, " + i17 + " got");
    }
}
