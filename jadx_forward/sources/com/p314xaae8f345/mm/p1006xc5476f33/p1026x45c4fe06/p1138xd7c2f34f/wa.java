package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class wa {

    /* renamed from: a, reason: collision with root package name */
    public final ne1.j f166869a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f166870b;

    /* renamed from: c, reason: collision with root package name */
    public final int f166871c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f166872d;

    public wa(ne1.j state, java.lang.String pluginAppId, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAppId, "pluginAppId");
        this.f166869a = state;
        this.f166870b = pluginAppId;
        this.f166871c = i17;
        this.f166872d = str;
    }

    /* renamed from: equals */
    public boolean m51853xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.wa)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.wa waVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.wa) obj;
        return this.f166869a == waVar.f166869a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166870b, waVar.f166870b) && this.f166871c == waVar.f166871c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166872d, waVar.f166872d);
    }

    /* renamed from: hashCode */
    public int m51854x8cdac1b() {
        int hashCode = ((((this.f166869a.hashCode() * 31) + this.f166870b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f166871c)) * 31;
        java.lang.String str = this.f166872d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m51855x9616526c() {
        return "PendingPluginUpdateStatusChangeEvent(state=" + this.f166869a + ", pluginAppId=" + this.f166870b + ", pluginIntVersion=" + this.f166871c + ", pluginStringVersion=" + this.f166872d + ')';
    }
}
