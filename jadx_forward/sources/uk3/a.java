package uk3;

/* loaded from: classes8.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f510057d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfoObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfoObj, "multiTaskInfoObj");
        this.f510057d = multiTaskInfoObj;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f510057d;
        return c16601x7ed0e40c.f66791xc8a07680.hashCode() + java.lang.Integer.hashCode(c16601x7ed0e40c.f66793x2262335f);
    }

    @Override // in5.c
    public int h() {
        return this.f510057d.f66793x2262335f;
    }
}
