package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsUserBehaviourInfoStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f60772e;

    /* renamed from: f, reason: collision with root package name */
    public long f60773f;

    /* renamed from: g, reason: collision with root package name */
    public long f60774g;

    /* renamed from: h, reason: collision with root package name */
    public long f60775h;

    /* renamed from: i, reason: collision with root package name */
    public long f60776i;

    /* renamed from: j, reason: collision with root package name */
    public long f60777j;

    /* renamed from: k, reason: collision with root package name */
    public long f60778k;

    /* renamed from: l, reason: collision with root package name */
    public long f60779l;

    /* renamed from: m, reason: collision with root package name */
    public long f60780m;

    /* renamed from: n, reason: collision with root package name */
    public long f60781n;

    /* renamed from: o, reason: collision with root package name */
    public long f60782o;

    /* renamed from: p, reason: collision with root package name */
    public long f60783p;

    /* renamed from: q, reason: collision with root package name */
    public long f60784q;

    /* renamed from: r, reason: collision with root package name */
    public long f60785r;

    /* renamed from: t, reason: collision with root package name */
    public long f60787t;

    /* renamed from: u, reason: collision with root package name */
    public long f60788u;

    /* renamed from: v, reason: collision with root package name */
    public long f60789v;

    /* renamed from: w, reason: collision with root package name */
    public long f60790w;

    /* renamed from: x, reason: collision with root package name */
    public cm.e f60791x;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60771d = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f60786s = "";

    /* renamed from: y, reason: collision with root package name */
    public long f60792y = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f60793z = "";
    public long A = 0;

    @Override // jx3.a
    public int g() {
        return 18840;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60771d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60772e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60773f);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f60774g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60775h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60776i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f60777j);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f60778k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60779l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60780m);
        stringBuffer.append(",");
        stringBuffer.append(this.f60781n);
        stringBuffer.append(",");
        stringBuffer.append(this.f60782o);
        stringBuffer.append(",");
        stringBuffer.append(this.f60783p);
        stringBuffer.append(",");
        stringBuffer.append(this.f60784q);
        stringBuffer.append(",");
        stringBuffer.append(this.f60785r);
        stringBuffer.append(",");
        stringBuffer.append(this.f60786s);
        stringBuffer.append(",");
        stringBuffer.append(this.f60787t);
        stringBuffer.append(",");
        stringBuffer.append(this.f60788u);
        stringBuffer.append(",");
        stringBuffer.append(this.f60789v);
        stringBuffer.append(",");
        stringBuffer.append(this.f60790w);
        stringBuffer.append(",");
        cm.e eVar = this.f60791x;
        stringBuffer.append(eVar != null ? eVar.f43065d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f60792y);
        stringBuffer.append(",");
        stringBuffer.append(this.f60793z);
        stringBuffer.append(",");
        stringBuffer.append(this.A);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OwnerUsername:");
        stringBuffer.append(this.f60771d);
        stringBuffer.append("\r\nSource:");
        stringBuffer.append(this.f60772e);
        stringBuffer.append("\r\nIsFriend:");
        stringBuffer.append(this.f60773f);
        stringBuffer.append("\r\nOwnerSetting:0\r\nOwnerPrivacySetting:0\r\nSessionid:0\r\nAlbumEntrancePicCount:");
        stringBuffer.append(this.f60774g);
        stringBuffer.append("\r\nAlbumExplodeFeedCount:");
        stringBuffer.append(this.f60775h);
        stringBuffer.append("\r\nAlbumClickFeedCount:");
        stringBuffer.append(this.f60776i);
        stringBuffer.append("\r\nAlbumClickFeedList:0\r\nAlbumTimelineStayTime:");
        stringBuffer.append(this.f60777j);
        stringBuffer.append("\r\nAlbumTimeDragCount:0\r\nLikeBanner:");
        stringBuffer.append(this.f60778k);
        stringBuffer.append("\r\nGalleryBrowseFeedCount:");
        stringBuffer.append(this.f60779l);
        stringBuffer.append("\r\nGalleryBrowsePictureCount:");
        stringBuffer.append(this.f60780m);
        stringBuffer.append("\r\nGalleryStayTime:");
        stringBuffer.append(this.f60781n);
        stringBuffer.append("\r\nFeedDetailPageBrowseFeedCount:");
        stringBuffer.append(this.f60782o);
        stringBuffer.append("\r\nFeedDetailPageBrowsePictureCount:");
        stringBuffer.append(this.f60783p);
        stringBuffer.append("\r\nFeedDetailPageStayTime:");
        stringBuffer.append(this.f60784q);
        stringBuffer.append("\r\nTotalStayTime:");
        stringBuffer.append(this.f60785r);
        stringBuffer.append("\r\nAlbumClickFeedListStr:");
        stringBuffer.append(this.f60786s);
        stringBuffer.append("\r\nalbumBannerFlag:");
        stringBuffer.append(this.f60787t);
        stringBuffer.append("\r\nsignatureFlag:");
        stringBuffer.append(this.f60788u);
        stringBuffer.append("\r\nwithFriendsFeedCount:");
        stringBuffer.append(this.f60789v);
        stringBuffer.append("\r\nwithFriendsStayTime:");
        stringBuffer.append(this.f60790w);
        stringBuffer.append("\r\nhasWithFriends:");
        stringBuffer.append(this.f60791x);
        stringBuffer.append("\r\nsceneType:");
        stringBuffer.append(this.f60792y);
        stringBuffer.append("\r\nalbumSessionid:");
        stringBuffer.append(this.f60793z);
        stringBuffer.append("\r\nstarCollectExpoFlag:");
        stringBuffer.append(this.A);
        return stringBuffer.toString();
    }
}
