package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class DecorationBoxConfig {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48369a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f48370b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f48371c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.model.MJEdgeInsets f48372d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle f48373e;

    public DecorationBoxConfig(java.lang.String str, java.util.List list, java.util.List list2, com.tencent.maas.model.MJEdgeInsets mJEdgeInsets, com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle mJHandleBoxBorderStyle) {
        this.f48369a = str;
        this.f48370b = list;
        this.f48371c = list2;
        this.f48372d = mJEdgeInsets;
        this.f48373e = mJHandleBoxBorderStyle;
    }

    public com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle getBorderStyle() {
        return this.f48373e;
    }

    public java.util.List<com.tencent.maas.handlebox.model.MJHandleBoxItem> getBoxItems() {
        return this.f48370b;
    }

    public com.tencent.maas.model.MJEdgeInsets getEdgeInsets() {
        return this.f48372d;
    }

    public java.lang.String getSegmentID() {
        return this.f48369a;
    }

    public java.util.List<com.tencent.maas.handlebox.model.MJHandleBoxTitle> getTitles() {
        return this.f48371c;
    }
}
