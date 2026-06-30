package com.google.gson;

/* loaded from: classes16.dex */
public abstract class l {
    public java.lang.String toString() {
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            jb.d dVar = new jb.d(stringWriter);
            dVar.f298674i = true;
            com.google.gson.internal.bind.e.C.c(dVar, this);
            return stringWriter.toString();
        } catch (java.io.IOException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }
}
