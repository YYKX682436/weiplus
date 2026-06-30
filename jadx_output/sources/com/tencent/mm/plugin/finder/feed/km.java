package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class km implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.yw2 f107221d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f107222e;

    /* renamed from: f, reason: collision with root package name */
    public final android.text.SpannableString f107223f;

    public km(r45.yw2 divider) {
        kotlin.jvm.internal.o.g(divider, "divider");
        this.f107221d = divider;
        this.f107222e = jz5.h.b(new com.tencent.mm.plugin.finder.feed.jm(this));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String string = divider.getString(1);
        ((ke0.e) xVar).getClass();
        this.f107223f = com.tencent.mm.pluginsdk.ui.span.c0.i(context, string);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof com.tencent.mm.plugin.finder.feed.km)) {
            return -1;
        }
        r45.yw2 yw2Var = ((com.tencent.mm.plugin.finder.feed.km) obj).f107221d;
        long j17 = yw2Var.getLong(3);
        r45.yw2 yw2Var2 = this.f107221d;
        return (j17 == yw2Var2.getLong(3) && yw2Var.getInteger(2) == yw2Var2.getInteger(2) && kotlin.jvm.internal.o.b(yw2Var.getString(1), yw2Var2.getString(1))) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return ((java.lang.Number) ((jz5.n) this.f107222e).getValue()).longValue();
    }

    @Override // in5.c
    public int h() {
        return 2002;
    }

    public java.lang.String toString() {
        return "ItemId=" + getItemId() + ",ItemType=2002 wordingSpan=" + ((java.lang.Object) this.f107223f);
    }
}
