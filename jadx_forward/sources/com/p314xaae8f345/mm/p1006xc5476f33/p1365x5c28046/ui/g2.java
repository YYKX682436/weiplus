package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f179562a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z4 f179563b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f179564c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f179565d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f179566e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f179567f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f179568g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.Range f179569h;

    /* renamed from: i, reason: collision with root package name */
    public android.util.Size f179570i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Bitmap f179571j;

    public g2(java.lang.String path, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z4 mediaType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaType, "mediaType");
        this.f179562a = path;
        this.f179563b = mediaType;
        this.f179565d = kz5.p0.f395529d;
        this.f179569h = new android.util.Range(0, 0);
        this.f179570i = new android.util.Size(0, 0);
    }

    public final boolean a() {
        return this.f179563b == com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z4.f180110g;
    }

    public final boolean b() {
        return this.f179563b == com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.z4.f180111h;
    }

    /* renamed from: equals */
    public boolean m54808xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f179562a, g2Var.f179562a) && this.f179563b == g2Var.f179563b;
    }

    /* renamed from: hashCode */
    public int m54809x8cdac1b() {
        return (this.f179562a.hashCode() * 31) + this.f179563b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m54810x9616526c() {
        return "EmojiEditorInfo(path=" + this.f179562a + ", mediaType=" + this.f179563b + ')';
    }
}
