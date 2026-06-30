package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class jj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj f208548d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj();

    public jj() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n        开关或后台配置需求：\n        1、可配置（接x）：分享页详情页进入的圈外入口隐藏（默认显示）");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        sb6.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ultron_share_detail_entrance_switch_android, 1) == 1);
        sb6.append("\n        2、可配置（接x）：搜索仅支持搜索账号（默认仅支持搜索账号）");
        sb6.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ultron_finder_search_only_contact_android, 1) == 1);
        sb6.append(" 后台处理\n        4、可配置（接x）：好友点赞实名展示（默认展示点赞好友数量）\n        5、可配置（接x）：互动通知红点推送到发现页（默认为不推送到发现页）");
        sb6.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ultron_finder_show_reddot_number_attab_android, 1) == 1);
        sb6.append("\n        6、可配置（接x）：没内容情况下推账号/feed（默认为推10条feed）\n\n        开关或后台配置需求：\n        1、可配置（后台配置）：视频可发表最高时长（1min）、最短时长（3s）。可选择视频的最高时长（5min）、可短时长（3s）。 ");
        sb6.append(e42.d0.clicfg_ultron_record_video_max_duration_android);
        sb6.append("\n        2、可配置（后台配置）：发表配文字最长字数（1000字）。发表评论文字最长字数（800字）。FinderMediaPublishTextLimit\n        3、可配置（后台配置）：timeline每次拉取feed数量（10条）\n        4、可配置（后台配置）：视频图片等是否要预加载（默认为预加载）\n        5、可配追（后台配置）：视频发表最大码率（2000 kbps）、视频发表最大分辨率（1080P）、图片发表最大分辨率（1080P） FinderRecordVideoConfig FinderPublishVideoConfig\n        **字符字数定义：ASCII码字符为0.5个字，其他文字为1个字，emoji为两个字\n        ");
        return sb6.toString();
    }
}
