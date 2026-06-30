package rv4;

/* loaded from: classes12.dex */
public final class i0 implements nv4.g {

    /* renamed from: m, reason: collision with root package name */
    public static final rv4.h0 f482022m = new rv4.h0(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f482023a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482024b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f482025c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f482026d;

    /* renamed from: e, reason: collision with root package name */
    public rv4.p f482027e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f482028f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f482029g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f482030h;

    /* renamed from: i, reason: collision with root package name */
    public final int f482031i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f482032j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f482033k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f482034l;

    public i0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, rv4.w wVar, java.lang.String str5, int i17, java.lang.String str6, int i18, int i19, rv4.p pVar, int i27, int i28, long j17, int i29, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int i37, java.util.List list, java.util.List list2, int i38, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String word = (i38 & 1) != 0 ? "" : str;
        java.lang.String query = (i38 & 2) != 0 ? "" : str2;
        java.lang.String tagTitle = (i38 & 4) != 0 ? "" : str3;
        java.lang.String tagColor = (i38 & 8) != 0 ? "" : str4;
        java.lang.String requestId = (i38 & 32) != 0 ? "" : str5;
        java.lang.String mixerCommonContext = (i38 & 128) != 0 ? "" : str6;
        rv4.p pVar2 = (i38 & 1024) != 0 ? null : pVar;
        java.lang.String title = (32768 & i38) != 0 ? "" : str7;
        java.lang.String docInfo = (65536 & i38) != 0 ? "" : str8;
        java.lang.String firstImgUrl = (131072 & i38) != 0 ? "" : str9;
        java.lang.String secondImgUrl = (262144 & i38) == 0 ? str10 : "";
        int i39 = (524288 & i38) != 0 ? 0 : i37;
        int i47 = 1048576 & i38;
        java.util.List friendHeadImgUrls = kz5.p0.f395529d;
        java.util.List friendNicknames = i47 != 0 ? friendHeadImgUrls : list;
        friendHeadImgUrls = (i38 & 2097152) == 0 ? list2 : friendHeadImgUrls;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(word, "word");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagTitle, "tagTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagColor, "tagColor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixerCommonContext, "mixerCommonContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(docInfo, "docInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(firstImgUrl, "firstImgUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(secondImgUrl, "secondImgUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(friendNicknames, "friendNicknames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(friendHeadImgUrls, "friendHeadImgUrls");
        this.f482023a = word;
        this.f482024b = query;
        this.f482025c = tagTitle;
        this.f482026d = mixerCommonContext;
        this.f482027e = pVar2;
        this.f482028f = docInfo;
        this.f482029g = firstImgUrl;
        this.f482030h = secondImgUrl;
        this.f482031i = i39;
        this.f482032j = friendNicknames;
        this.f482033k = friendHeadImgUrls;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return this.f482023a + '-' + this.f482025c + '-' + hashCode();
    }
}
