package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f219386a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f219387b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219389d;

    /* renamed from: f, reason: collision with root package name */
    public double f219391f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219392g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219393h;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.Unknown;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.m f219390e = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.m.Equal;

    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.Unknown;
        if (str == null) {
            this.f219388c = lVar;
            return;
        }
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1910045728:
                if (str.equals("groupmyselflastactivetime")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1754010471:
                if (str.equals("groupfriendscount")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1185162712:
                if (str.equals("grouplastactivetime")) {
                    c17 = 2;
                    break;
                }
                break;
            case -1172655332:
                if (str.equals("groupunreadmsgcount")) {
                    c17 = 3;
                    break;
                }
                break;
            case -998531531:
                if (str.equals("myrecentmsgcount")) {
                    c17 = 4;
                    break;
                }
                break;
            case -955791290:
                if (str.equals("myrecentsearchdays")) {
                    c17 = 5;
                    break;
                }
                break;
            case -282385353:
                if (str.equals("mylastsearchtime")) {
                    c17 = 6;
                    break;
                }
                break;
            case 3363353:
                if (str.equals("mute")) {
                    c17 = 7;
                    break;
                }
                break;
            case 434730752:
                if (str.equals("myrecentsearchcount")) {
                    c17 = '\b';
                    break;
                }
                break;
            case 614989439:
                if (str.equals("matchtype")) {
                    c17 = '\t';
                    break;
                }
                break;
            case 1725934294:
                if (str.equals("groupmembercount")) {
                    c17 = '\n';
                    break;
                }
                break;
            case 1729009280:
                if (str.equals("languageversion")) {
                    c17 = 11;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.GroupMySelfLastActiveTime;
                return;
            case 1:
                this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.GroupFriendsCount;
                return;
            case 2:
                this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.GroupLastActiveTime;
                return;
            case 3:
                this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.GroupUnReadMsgCount;
                return;
            case 4:
                this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.MyRecentMsgCount;
                return;
            case 5:
                if ("7".equals(str2)) {
                    this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.MyRecentSearchDays7;
                    return;
                } else if ("14".equals(str2)) {
                    this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.MyRecentSearchDays14;
                    return;
                } else {
                    this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.MyRecentSearchDays30;
                    return;
                }
            case 6:
                this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.MyLastSearchTime;
                return;
            case 7:
                this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.IsMute;
                return;
            case '\b':
                if ("7".equals(str2)) {
                    this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.MyRecentSearchCnt7;
                    return;
                } else if ("14".equals(str2)) {
                    this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.MyRecentSearchCnt14;
                    return;
                } else {
                    this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.MyRecentSearchCnt30;
                    return;
                }
            case '\t':
                this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.ExtMatchType;
                this.f219389d = str2;
                return;
            case '\n':
                this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.GroupMemberCount;
                return;
            case 11:
                if ("en".equals(str2)) {
                    this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.LangEn;
                    return;
                } else if ("zh".equals(str2)) {
                    this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.LangCh;
                    return;
                } else {
                    this.f219388c = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.l.LangOther;
                    return;
                }
            default:
                this.f219388c = lVar;
                return;
        }
    }
}
