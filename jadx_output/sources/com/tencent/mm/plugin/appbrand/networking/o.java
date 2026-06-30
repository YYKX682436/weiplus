package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
public enum o {
    /* JADX INFO: Fake field, exist only in values array */
    NONE,
    ENCODE,
    DECODE,
    SEND,
    /* JADX INFO: Fake field, exist only in values array */
    RECV,
    TRANSFER,
    NETWORK,
    /* JADX INFO: Fake field, exist only in values array */
    NOT_ACTIVATE_DEVICE,
    SERVER,
    UNKNOWN;


    /* renamed from: d, reason: collision with root package name */
    public final int f86117d = (-10000) - ordinal();

    o() {
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "%s(%d)", name(), java.lang.Integer.valueOf(this.f86117d));
    }
}
