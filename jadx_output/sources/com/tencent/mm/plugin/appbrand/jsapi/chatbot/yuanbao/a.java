package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f80286a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f80287b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f80288c;

    public a(int i17, java.lang.String fileId, java.lang.String aesKey) {
        kotlin.jvm.internal.o.g(fileId, "fileId");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        this.f80286a = i17;
        this.f80287b = fileId;
        this.f80288c = aesKey;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a aVar = (com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a) obj;
        return this.f80286a == aVar.f80286a && kotlin.jvm.internal.o.b(this.f80287b, aVar.f80287b) && kotlin.jvm.internal.o.b(this.f80288c, aVar.f80288c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f80286a) * 31) + this.f80287b.hashCode()) * 31) + this.f80288c.hashCode();
    }

    public java.lang.String toString() {
        return "CdnUploadResult(code=" + this.f80286a + ", fileId=" + this.f80287b + ", aesKey=" + this.f80288c + ')';
    }
}
