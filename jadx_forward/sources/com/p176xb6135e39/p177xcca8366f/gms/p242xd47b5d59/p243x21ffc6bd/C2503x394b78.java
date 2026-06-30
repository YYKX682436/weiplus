package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzay */
/* loaded from: classes13.dex */
public final class C2503x394b78 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2503x394b78> f7576x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2513x394b87();

    /* renamed from: zzce */
    private final java.lang.String f7577x394ba2;

    /* renamed from: zzcl */
    private final java.lang.String f7578x394ba9;
    private final java.lang.String zzo;

    public C2503x394b78(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f7577x394ba2 = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
        this.zzo = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str2);
        this.f7578x394ba9 = (java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str3);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3
    /* renamed from: addListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19659x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener channelListener) {
        return com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzb.zza(abstractC1748xd28d482c, new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2510x394b84(this.f7577x394ba2, new android.content.IntentFilter[]{com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zzc("com.google.android.gms.wearable.CHANNEL_EVENT")}), channelListener);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3
    /* renamed from: close */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19660x5a5ddf8(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c) {
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2504x394b79(this, abstractC1748xd28d482c));
    }

    /* renamed from: equals */
    public final boolean m19899xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2503x394b78)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2503x394b78 c2503x394b78 = (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2503x394b78) obj;
        return this.f7577x394ba2.equals(c2503x394b78.f7577x394ba2) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(c2503x394b78.zzo, this.zzo) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(c2503x394b78.f7578x394ba9, this.f7578x394ba9);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3
    /* renamed from: getInputStream */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3.GetInputStreamResult> mo19662xc7995ab4(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c) {
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2506x394b80(this, abstractC1748xd28d482c));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel
    /* renamed from: getNodeId */
    public final java.lang.String mo19663x271761b3() {
        return this.zzo;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3
    /* renamed from: getOutputStream */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3.GetOutputStreamResult> mo19664x592d6257(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c) {
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2507x394b81(this, abstractC1748xd28d482c));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel
    /* renamed from: getPath */
    public final java.lang.String mo19665xfb83cc9b() {
        return this.f7578x394ba9;
    }

    /* renamed from: hashCode */
    public final int m19900x8cdac1b() {
        return this.f7577x394ba2.hashCode();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3
    /* renamed from: receiveFile */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19666x8299b2ff(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.net.Uri uri, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1748xd28d482c, "client is null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(uri, "uri is null");
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2508x394b82(this, abstractC1748xd28d482c, uri, z17));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3
    /* renamed from: removeListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19667xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener channelListener) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1748xd28d482c, "client is null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(channelListener, "listener is null");
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2492x394b6d(abstractC1748xd28d482c, channelListener, this.f7577x394ba2));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3
    /* renamed from: sendFile */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19668x4a543524(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.net.Uri uri) {
        return mo19669x4a543524(abstractC1748xd28d482c, uri, 0L, -1L);
    }

    /* renamed from: toString */
    public final java.lang.String m19901x9616526c() {
        int i17 = 0;
        for (char c17 : this.f7577x394ba2.toCharArray()) {
            i17 += c17;
        }
        java.lang.String trim = this.f7577x394ba2.trim();
        int length = trim.length();
        if (length > 25) {
            java.lang.String substring = trim.substring(0, 10);
            java.lang.String substring2 = trim.substring(length - 10, length);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(substring).length() + 16 + java.lang.String.valueOf(substring2).length());
            sb6.append(substring);
            sb6.append("...");
            sb6.append(substring2);
            sb6.append("::");
            sb6.append(i17);
            trim = sb6.toString();
        }
        java.lang.String str = this.zzo;
        java.lang.String str2 = this.f7578x394ba9;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(trim).length() + 31 + java.lang.String.valueOf(str).length() + java.lang.String.valueOf(str2).length());
        sb7.append("Channel{token=");
        sb7.append(trim);
        sb7.append(", nodeId=");
        sb7.append(str);
        sb7.append(", path=");
        sb7.append(str2);
        sb7.append("}");
        return sb7.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, this.f7577x394ba2, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 3, mo19663x271761b3(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 4, mo19665xfb83cc9b(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public final java.lang.String zzc() {
        return this.f7577x394ba2;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3
    /* renamed from: close */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19661x5a5ddf8(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, int i17) {
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2505x394b7f(this, abstractC1748xd28d482c, i17));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3
    /* renamed from: sendFile */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19669x4a543524(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, android.net.Uri uri, long j17, long j18) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1748xd28d482c, "client is null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(this.f7577x394ba2, "token is null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(uri, "uri is null");
        boolean z17 = true;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18199x312c1fe5(j17 >= 0, "startOffset is negative: %s", java.lang.Long.valueOf(j17));
        if (j18 < 0 && j18 != -1) {
            z17 = false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18199x312c1fe5(z17, "invalid length: %s", java.lang.Long.valueOf(j18));
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2509x394b83(this, abstractC1748xd28d482c, uri, j17, j18));
    }
}
