package m84;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f406355a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f406356b;

    /* renamed from: c, reason: collision with root package name */
    public final long f406357c;

    public z(java.lang.String avatarUrl, java.lang.String str, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarUrl, "avatarUrl");
        this.f406355a = avatarUrl;
        this.f406356b = str;
        this.f406357c = j17;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvatarUrl", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatarUrl", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        return this.f406355a;
    }

    /* renamed from: equals */
    public boolean m146954xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
            return true;
        }
        if (!(obj instanceof m84.z)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
            return false;
        }
        m84.z zVar = (m84.z) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f406355a, zVar.f406355a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f406356b, zVar.f406356b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
            return false;
        }
        long j17 = this.f406357c;
        long j18 = zVar.f406357c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        return j17 == j18;
    }

    /* renamed from: hashCode */
    public int m146955x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        int hashCode = this.f406355a.hashCode() * 31;
        java.lang.String str = this.f406356b;
        int hashCode2 = ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f406357c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        return hashCode2;
    }

    /* renamed from: toString */
    public java.lang.String m146956x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        java.lang.String str = "AvatarRecord(avatarUrl=" + this.f406355a + ", avatarMd5=" + this.f406356b + ", updateTs=" + this.f406357c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        return str;
    }
}
