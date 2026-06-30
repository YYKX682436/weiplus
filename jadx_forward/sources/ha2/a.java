package ha2;

/* loaded from: classes10.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.hd1 f361324d;

    /* renamed from: e, reason: collision with root package name */
    public final int f361325e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f361326f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f361327g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f361328h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f361329i;

    public a(r45.hd1 data, int i17, boolean z17, java.lang.String str, java.lang.String keyword, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, boolean z18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 2) != 0 ? 0 : i17;
        str = (i18 & 8) != 0 ? null : str;
        keyword = (i18 & 16) != 0 ? "" : keyword;
        abstractC15633xee433078 = (i18 & 32) != 0 ? null : abstractC15633xee433078;
        z18 = (i18 & 64) != 0 ? false : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        this.f361324d = data;
        this.f361325e = i17;
        this.f361326f = str;
        this.f361327g = keyword;
        this.f361328h = abstractC15633xee433078;
        this.f361329i = z18;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f361324d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return this.f361325e;
    }
}
