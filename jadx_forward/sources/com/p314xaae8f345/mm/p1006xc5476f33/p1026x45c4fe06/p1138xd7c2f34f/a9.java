package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class a9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.c9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166035a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(java.lang.String value) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f166035a = value;
    }

    /* renamed from: equals */
    public boolean m51684xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a9.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.launching.LaunchTimeoutFallbackBackupWxaAttrUtils.KEY.APPID");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166035a, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a9) obj).f166035a);
    }

    /* renamed from: hashCode */
    public int m51685x8cdac1b() {
        return this.f166035a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51686x9616526c() {
        return "APPID(value=" + this.f166035a + ')';
    }
}
