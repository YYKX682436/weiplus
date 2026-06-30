package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes3.dex */
public final class mg implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final int f281039d;

    /* renamed from: e, reason: collision with root package name */
    public final int f281040e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f281041f;

    public mg(int i17, int i18, boolean z17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i19 & 4) != 0 ? false : z17;
        this.f281039d = i17;
        this.f281040e = i18;
        this.f281041f = z17;
    }

    /* renamed from: equals */
    public boolean m79498xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mg)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mg mgVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mg) obj;
        return this.f281039d == mgVar.f281039d && this.f281040e == mgVar.f281040e && this.f281041f == mgVar.f281041f;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f281039d;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    /* renamed from: hashCode */
    public int m79499x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f281039d) * 31) + java.lang.Integer.hashCode(this.f281040e)) * 31) + java.lang.Boolean.hashCode(this.f281041f);
    }

    /* renamed from: toString */
    public java.lang.String m79500x9616526c() {
        return "LangItemData(lanId=" + this.f281039d + ", lanStringRes=" + this.f281040e + ", isSelect=" + this.f281041f + ')';
    }
}
