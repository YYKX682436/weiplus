package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f97955a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f97956b;

    /* renamed from: c, reason: collision with root package name */
    public final int f97957c;

    /* renamed from: d, reason: collision with root package name */
    public final int f97958d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Bitmap f97959e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f97960f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f97961g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Bitmap f97962h;

    /* renamed from: i, reason: collision with root package name */
    public final android.util.Range f97963i;

    public e5(java.lang.String filePath, android.graphics.Rect clipBounds, int i17, int i18, android.graphics.Bitmap bitmap, boolean z17, boolean z18, android.graphics.Bitmap bitmap2, android.util.Range trimTimeRange) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(clipBounds, "clipBounds");
        kotlin.jvm.internal.o.g(trimTimeRange, "trimTimeRange");
        this.f97955a = filePath;
        this.f97956b = clipBounds;
        this.f97957c = i17;
        this.f97958d = i18;
        this.f97959e = bitmap;
        this.f97960f = z17;
        this.f97961g = z18;
        this.f97962h = bitmap2;
        this.f97963i = trimTimeRange;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.emoji.ui.e5)) {
            return false;
        }
        com.tencent.mm.plugin.emoji.ui.e5 e5Var = (com.tencent.mm.plugin.emoji.ui.e5) obj;
        return kotlin.jvm.internal.o.b(this.f97955a, e5Var.f97955a) && kotlin.jvm.internal.o.b(this.f97956b, e5Var.f97956b) && this.f97957c == e5Var.f97957c && this.f97958d == e5Var.f97958d && kotlin.jvm.internal.o.b(this.f97959e, e5Var.f97959e) && this.f97960f == e5Var.f97960f && this.f97961g == e5Var.f97961g && kotlin.jvm.internal.o.b(this.f97962h, e5Var.f97962h) && kotlin.jvm.internal.o.b(this.f97963i, e5Var.f97963i);
    }

    public int hashCode() {
        int hashCode = ((((((this.f97955a.hashCode() * 31) + this.f97956b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f97957c)) * 31) + java.lang.Integer.hashCode(this.f97958d)) * 31;
        android.graphics.Bitmap bitmap = this.f97959e;
        int hashCode2 = (((((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f97960f)) * 31) + java.lang.Boolean.hashCode(this.f97961g)) * 31;
        android.graphics.Bitmap bitmap2 = this.f97962h;
        return ((hashCode2 + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31) + this.f97963i.hashCode();
    }

    public java.lang.String toString() {
        return "GenerateParams(filePath=" + this.f97955a + ", clipBounds=" + this.f97956b + ", scaledWidth=" + this.f97957c + ", scaledHeight=" + this.f97958d + ", textBitmap=" + this.f97959e + ", isGif=" + this.f97960f + ", isVideo=" + this.f97961g + ", imgBitMap=" + this.f97962h + ", trimTimeRange=" + this.f97963i + ')';
    }
}
