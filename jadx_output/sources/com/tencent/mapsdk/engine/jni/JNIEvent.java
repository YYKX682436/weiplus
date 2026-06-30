package com.tencent.mapsdk.engine.jni;

/* loaded from: classes13.dex */
public class JNIEvent {
    public byte[] data;
    public java.lang.Object extra;

    /* renamed from: id, reason: collision with root package name */
    public int f48749id;
    public java.lang.String name;

    public java.lang.String toString() {
        return "JNIEvent{id=" + this.f48749id + ", name='" + this.name + "', data=" + java.util.Arrays.toString(this.data) + ", extra=" + this.extra + '}';
    }
}
