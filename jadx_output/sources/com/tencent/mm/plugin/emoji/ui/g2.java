package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f98029a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.emoji.ui.z4 f98030b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f98031c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f98032d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f98033e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f98034f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f98035g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.Range f98036h;

    /* renamed from: i, reason: collision with root package name */
    public android.util.Size f98037i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Bitmap f98038j;

    public g2(java.lang.String path, com.tencent.mm.plugin.emoji.ui.z4 mediaType) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        this.f98029a = path;
        this.f98030b = mediaType;
        this.f98032d = kz5.p0.f313996d;
        this.f98036h = new android.util.Range(0, 0);
        this.f98037i = new android.util.Size(0, 0);
    }

    public final boolean a() {
        return this.f98030b == com.tencent.mm.plugin.emoji.ui.z4.f98577g;
    }

    public final boolean b() {
        return this.f98030b == com.tencent.mm.plugin.emoji.ui.z4.f98578h;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.emoji.ui.g2)) {
            return false;
        }
        com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) obj;
        return kotlin.jvm.internal.o.b(this.f98029a, g2Var.f98029a) && this.f98030b == g2Var.f98030b;
    }

    public int hashCode() {
        return (this.f98029a.hashCode() * 31) + this.f98030b.hashCode();
    }

    public java.lang.String toString() {
        return "EmojiEditorInfo(path=" + this.f98029a + ", mediaType=" + this.f98030b + ')';
    }
}
