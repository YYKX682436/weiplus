package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJModelInfo {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48271a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f48272b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f48273c;

    public MJModelInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f48271a = str;
        this.f48272b = str2;
        this.f48273c = str3;
    }

    public java.lang.String getModelFilePath() {
        return this.f48272b;
    }

    public java.lang.String getModelName() {
        return this.f48271a;
    }

    public java.lang.String getModelVersion() {
        return this.f48273c;
    }
}
