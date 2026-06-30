package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes5.dex */
public class CaptionItem {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48522a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTimeRange f48523b;

    public CaptionItem(java.lang.String str, com.tencent.maas.model.time.MJTimeRange mJTimeRange) {
        this.f48522a = str;
        this.f48523b = mJTimeRange;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.tencent.maas.moviecomposing.segments.CaptionItem captionItem = (com.tencent.maas.moviecomposing.segments.CaptionItem) obj;
        return java.util.Objects.equals(this.f48522a, captionItem.f48522a) && java.util.Objects.equals(this.f48523b, captionItem.f48523b);
    }

    public java.lang.String getText() {
        return this.f48522a;
    }

    public com.tencent.maas.model.time.MJTimeRange getTimeRange() {
        return this.f48523b;
    }

    public java.lang.String toString() {
        return "CaptionItem{text='" + this.f48522a + "', timeRange=" + this.f48523b + '}';
    }
}
