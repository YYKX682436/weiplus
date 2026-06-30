package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes10.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f92351a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f92352b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f92353c;

    public y2(android.graphics.RectF rect, java.lang.String tagName, java.lang.String xPath) {
        kotlin.jvm.internal.o.g(rect, "rect");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(xPath, "xPath");
        this.f92351a = rect;
        this.f92352b = tagName;
        this.f92353c = xPath;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.wxassistant.y2)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.wxassistant.y2 y2Var = (com.tencent.mm.plugin.appbrand.wxassistant.y2) obj;
        return kotlin.jvm.internal.o.b(this.f92351a, y2Var.f92351a) && kotlin.jvm.internal.o.b(this.f92352b, y2Var.f92352b) && kotlin.jvm.internal.o.b(this.f92353c, y2Var.f92353c);
    }

    public int hashCode() {
        return (((this.f92351a.hashCode() * 31) + this.f92352b.hashCode()) * 31) + this.f92353c.hashCode();
    }

    public java.lang.String toString() {
        return "ViewRectInfo(rect=" + this.f92351a + ", tagName=" + this.f92352b + ", xPath=" + this.f92353c + ')';
    }
}
