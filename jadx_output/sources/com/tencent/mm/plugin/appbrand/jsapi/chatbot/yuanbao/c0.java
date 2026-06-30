package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f80292a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f80293b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f80294c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f80295d;

    /* renamed from: e, reason: collision with root package name */
    public final long f80296e;

    public c0(boolean z17, java.lang.String path, java.lang.String fileId, java.lang.String aesKey, long j17) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(fileId, "fileId");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        this.f80292a = z17;
        this.f80293b = path;
        this.f80294c = fileId;
        this.f80295d = aesKey;
        this.f80296e = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0 c0Var = (com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0) obj;
        return this.f80292a == c0Var.f80292a && kotlin.jvm.internal.o.b(this.f80293b, c0Var.f80293b) && kotlin.jvm.internal.o.b(this.f80294c, c0Var.f80294c) && kotlin.jvm.internal.o.b(this.f80295d, c0Var.f80295d) && this.f80296e == c0Var.f80296e;
    }

    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.f80292a) * 31) + this.f80293b.hashCode()) * 31) + this.f80294c.hashCode()) * 31) + this.f80295d.hashCode()) * 31) + java.lang.Long.hashCode(this.f80296e);
    }

    public java.lang.String toString() {
        return "UploadPageContentResult(isSuccess=" + this.f80292a + ", path=" + this.f80293b + ", fileId=" + this.f80294c + ", aesKey=" + this.f80295d + ", timestamp=" + this.f80296e + ')';
    }

    public /* synthetic */ c0(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, (i17 & 2) != 0 ? "" : str, (i17 & 4) != 0 ? "" : str2, (i17 & 8) == 0 ? str3 : "", (i17 & 16) != 0 ? 0L : j17);
    }
}
