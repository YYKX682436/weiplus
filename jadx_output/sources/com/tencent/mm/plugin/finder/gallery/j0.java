package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class j0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.gallery.i0 f111386d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f111387e;

    public j0(com.tencent.mm.plugin.finder.gallery.i0 galleryTabData) {
        kotlin.jvm.internal.o.g(galleryTabData, "galleryTabData");
        this.f111386d = galleryTabData;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof com.tencent.mm.plugin.finder.gallery.j0) && ((com.tencent.mm.plugin.finder.gallery.j0) obj).f111386d.f111383a == this.f111386d.f111383a) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f111386d.f111383a;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
