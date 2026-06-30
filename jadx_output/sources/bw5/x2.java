package bw5;

/* loaded from: classes.dex */
public enum x2 implements com.tencent.mm.protobuf.h {
    BizAudioEnterScene_Unknown(0),
    BizAudioEnterScene_ArticleMenuListen(1),
    BizAudioEnterScene_ArticleIconListen(2),
    BizAudioEnterScene_AudioCardListen(3),
    BizAudioEnterScene_ArticleAudioListen(4),
    BizAudioEnterScene_NewsListen(5),
    BizAudioEnterScene_ChatListen(6),
    BizAudioEnterScene_MomentsListen(7),
    BizAudioEnterScene_StarListen(8),
    BizAudioEnterScene_CollectionListen(9),
    BizAudioEnterScene_StatusListen(10),
    BizAudioEnterScene_AudioFromNowListen(11),
    BizAudioEnterScene_AiPodcastListen(12),
    BizAudioEnterScene_AddListenLater(13),
    BizAudioEnterScene_PlayWithAlbum(14),
    BizAudioEnterScene_Profile(15),
    BizAudioEnterScene_ArticleMenuListenFromStar(16),
    BizAudioEnterScene_ArticleIconListenFromStar(17),
    BizAudioEnterScene_AudioCardListenFromStar(18),
    BizAudioEnterScene_TimelineIconSwipeMode(19),
    BizAudioEnterScene_FollowedPodcast(20),
    BizAudioEnterScene_AudioCollection(21),
    BizAudioEnterScene_FeedAudioCard(22),
    BizAudioEnterScene_PersonListenLater(23);


    /* renamed from: d, reason: collision with root package name */
    public final int f34931d;

    x2(int i17) {
        this.f34931d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f34931d;
    }
}
