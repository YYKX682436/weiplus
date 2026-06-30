package yw3;

/* loaded from: classes10.dex */
public final class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI f548463d;

    public x5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI) {
        this.f548463d = repairerPullDownWidgetDemoUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pj4.t tVar = new pj4.t();
        tVar.f436821d = 0;
        tVar.f436822e = 1;
        com.tencent.mm.plugin.repairer.ui.demo.RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI = this.f548463d;
        android.view.View view = repairerPullDownWidgetDemoUI.e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnSetDemo");
            throw null;
        }
        if (repairerPullDownWidgetDemoUI.d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutContainer");
            throw null;
        }
        new pj4.j0();
        view.setOnClickListener(new yw3.u5(repairerPullDownWidgetDemoUI));
        android.view.View view2 = repairerPullDownWidgetDemoUI.f;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnSetMusic");
            throw null;
        }
        if (repairerPullDownWidgetDemoUI.d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutContainer");
            throw null;
        }
        repairerPullDownWidgetDemoUI.getClass();
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f436672d = "1";
        j0Var.f436674f = "<MusicVideoStatusOpenParams>\n<FinderMVSongInfo>\n    <songName>永不失联的爱（《小妖的金色城堡》戏剧主题曲）</songName>\n    <singer>周兴哲</singer>\n    <musicDataUrl>http://c6.y.qq.com/rsc/fcgi-bin/fcg_pyq_play.fcg?songid=&amp;songmid=004c4CEB3jfz7a&amp;songtype=1&amp;fromtag=46&amp;uin=414367047&amp;code=85A88</musicDataUrl>\n    <musicAppId>wx5aa333606550dfd5</musicAppId>\n    <musicWebUrl>https://i.y.qq.com/v8/playsong.html?platform=11&amp;appshare=android_qq&amp;appversion=10090506&amp;hosteuin=7e6PoiCloevl&amp;songmid=004c4CEB3jfz7a&amp;type=0&amp;appsongtype=1&amp;_wv=1&amp;source=weixin&amp;ADTAG=wxfshare</musicWebUrl>\n    <songId>qqmusic_202550561</songId>\n    <lyric>[ti:永不失联的爱&#x20;(原创概念版)&#x20;(《小妖的金色城堡》戏剧主题曲)]&#x0A;[ar:周兴哲]&#x0A;[al:永不失联的爱]&#x0A;[by:]&#x0A;[offset:0]&#x0A;[00:00.00]永不失联的爱&#x20;(Unbreakable&#x20;Love)&#x20;-&#x20;周兴哲&#x20;(Eric&#x20;Chou)&#x0A;[00:04.61]词：饶雪漫&#x0A;[00:09.22]曲：周兴哲&#x0A;[00:13.83]编曲：吕圣斐&#x0A;[00:18.44]制作人：袁伟翔/吕圣斐&#x0A;[00:23.05]亲爱的你躲在哪里发呆&#x0A;[00:27.31]&#x0A;[00:28.79]有什么心事还无法释怀&#x0A;[00:32.75]&#x0A;[00:34.37]我们总把人生想得太坏&#x0A;[00:38.23]&#x0A;[00:39.99]像旁人不允许我们的怪&#x0A;[00:44.09]&#x0A;[00:45.69]每一片与众不同的云彩&#x0A;[00:49.79]&#x0A;[00:51.38]都需要找到天空去存在&#x0A;[00:55.15]&#x0A;[00:56.96]我们都习惯了原地徘徊&#x0A;[01:01.18]&#x0A;[01:02.61]却无法习惯被依赖&#x0A;[01:07.05]&#x0A;[01:08.97]你给我&#x20;这一辈子都不想失联的爱&#x0A;[01:15.07]&#x0A;[01:15.60]相信爱的征途就是星辰大海&#x0A;[01:20.62]美好剧情&#x20;不会更改&#x0A;[01:25.82]是命运最好的安排&#x0A;[01:30.95]&#x0A;[01:31.50]你是我&#x0A;[01:33.30]这一辈子都不想失联的爱&#x0A;[01:37.55]&#x0A;[01:38.27]何苦残忍逼我把手轻轻放开&#x0A;[01:43.18]请快回来&#x20;想听你说&#x0A;[01:48.43]说你还在&#x0A;[01:51.75]&#x0A;[02:16.17]走过陪你看流星的天台&#x0A;[02:20.17]&#x0A;[02:21.71]熬过失去你漫长的等待&#x0A;[02:25.87]&#x0A;[02:27.36]好担心没人懂你的无奈&#x0A;[02:31.57]&#x0A;[02:32.97]离开我谁还把你当小孩&#x0A;[02:36.97]&#x0A;[02:38.79]我猜你一定也会想念我&#x0A;[02:42.81]&#x0A;[02:44.23]也怕我失落在茫茫人海&#x0A;[02:48.15]&#x0A;[02:49.90]没关系只要你肯回头望&#x0A;[02:54.05]&#x0A;[02:55.52]会发现我一直都在&#x0A;[03:00.34]&#x0A;[03:01.93]你给我&#x20;这一辈子都不想失联的爱&#x0A;[03:07.86]&#x0A;[03:08.77]你的每条讯息都是心跳节拍&#x0A;[03:13.55]每秒都想&#x20;拥你入怀&#x0A;[03:18.78]全世界你最可爱&#x0A;[03:23.87]&#x0A;[03:24.59]你是我&#x20;这一辈子都不想失联的爱&#x0A;[03:30.46]&#x0A;[03:31.08]就算你的呼吸远在千山之外&#x0A;[03:36.09]请你相信&#x20;我给的爱&#x0A;[03:41.35]值得你爱</lyric>\n    <albumName>如果雨之后</albumName>\n    <albumUrl>http://y.gtimg.cn/music/photo_new/T002R500x500M000003xoLyf0Xj3Oe_1.jpg</albumUrl>\n    <genre>Rock&#x20;摇滚</genre>\n    <publicTime></publicTime>\n    <publicTimeS>1513267200</publicTimeS>\n    <extraInfo></extraInfo>\n    <identification></identification>\n    <duration>259668</duration>\n</FinderMVSongInfo>\n<musicShareItem><mvObjectId>13537773606918162528</mvObjectId><mvNonceId>15477112920566613854</mvNonceId><mvCoverUrl>http://wxapp.tc.qq.com/251/20350/stodownload?encfilekey=XGocBFxVWK5dcyOOqpEU47RpBHQIvlhnZAn5bY8k59AkoMZb59VXcoicCFuH0s5rRCp5Z1h5hKiankTWKpgUx9ZibFQzPzclxLw4TX0HWicNo05LGEDUA4zrPSKKbUrH7Ldx8AuVNRpLeAo0RqQ97zykBSLemflAfuicgVZbiabVMjqlxlg4p3W4kLSQ&amp;adaptivelytrans=0&amp;bizid=1023&amp;dotrans=0&amp;hy=SH&amp;idx=1&amp;m=7764a411e365bbfe048f079b2d6ec8fe&amp;token=x5Y29zUxcibDL4kjgECWmgYIjC6afK7YsLITpOickQAibbibrd2icfwEBtuIlrLkGpqoN</mvCoverUrl><mvMakerFinderNickname>大型精分现场-</mvMakerFinderNickname><mvSingerName></mvSingerName><mvAlbumName></mvAlbumName><mvMusicGenre></mvMusicGenre><mvIssueDate>0</mvIssueDate><mvIdentification></mvIdentification><musicDuration>0</musicDuration><mvExtInfo>null</mvExtInfo></musicShareItem>\n</MusicVideoStatusOpenParams>";
        view2.setOnClickListener(new yw3.u5(repairerPullDownWidgetDemoUI));
        java.lang.Object mo141623x754a37bb = ((jz5.n) repairerPullDownWidgetDemoUI.g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view3 = (android.view.View) mo141623x754a37bb;
        if (repairerPullDownWidgetDemoUI.d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutContainer");
            throw null;
        }
        pj4.j0 j0Var2 = new pj4.j0();
        j0Var2.f436672d = "1";
        byte[] bytes = "{\"feedId\":\"13548507870956427363\",\"nickname\":\"搞笑的马姐姐\",\"mediaType\":4,\"mediaList\":[{\"mediaType\":4,\"url\":\"http:\\/\\/wxapp.tc.qq.com\\/251\\/20302\\/stodownload?encfilekey=RBfjicXSHKCOONJnTbRmmlD8cOQPXE48ibk28aQkWiaibPAGmnFwfiaicdHzFmC8Xib3lp8wQDcurfFsIeXsIrJOxZM3cgnjEIcGTrGJGFaibCribvBkJJR44jzK9rrQzfic57CbT848ojDEhMRdzxSqFkTmUP16TdvK0l6In2kibMNTKL2GkU&adaptivelytrans=0&bizid=1023&dotrans=770&hy=SH&idx=1&m=78f2191d4f3bc58cc1c3cada01d963a5&scene=0\",\"url_token\":\"&token=x5Y29zUxcibBS38aOqRFIQ87WbwiblzFWMZdS4fA6BXnzibn4thdqic58QmQ8OLUibHhwibMV4vg3Vuck\",\"thumbUrl\":\"http:\\/\\/wxapp.tc.qq.com\\/251\\/20304\\/stodownload?encfilekey=jEXicia3muM3GjTlk1Z3kYCefzc4VU4EASuOwDeckXh5Rug76ZL97cxCCpvaFtHBsGREKibHnyTyzttmgvYvrgVzfuXsoUl1hqyK7Vkna0qvyzo7icfnWniaahDQTGHlxQ4ACJsIFics7seddFBsjibc0N2iaiaibY1T3AA2AqR5dWUvforxA&adaptivelytrans=0&bizid=1023&dotrans=0&hy=SH&idx=1&m=38713687ec5f097bd8969a30b083fc46\",\"thumb_url_token\":\"&token=cztXnd9GyrHT1jF33iahtW5WKoMicnJlTUZCMdAJYQKoJ5W9KsBSCfBWd5dic7zQcCL\",\"decodeKey\":\"840422575\",\"width\":576,\"height\":1024,\"videoDuration\":20,\"mediaId\":\"finder_video_xV0_8d2f73ca02ea8d0128babfa43c63d7bc\",\"mediaPath\":\"\\/storage\\/emulated\\/0\\/Android\\/data\\/com.tencent.mm\\/MicroMsg\\/7ea3dbb6194e65c68e99b7065d4a74e8\\/finder\\/video\\/finder_video_xV0_8d2f73ca02ea8d0128babfa43c63d7bc\",\"fileFormat\":\"xV0\",\"thumbUrlToken\":\"&token=cztXnd9GyrHT1jF33iahtW5WKoMicnJlTUZCMdAJYQKoJ5W9KsBSCfBWd5dic7zQcCL\",\"thumbPath\":\"\\/storage\\/emulated\\/0\\/Android\\/data\\/com.tencent.mm\\/MicroMsg\\/7ea3dbb6194e65c68e99b7065d4a74e8\\/finder\\/image\\/finder_image_thumb_image_8d2f73ca02ea8d0128babfa43c63d7bc\"}]}".getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        j0Var2.f436674f = android.util.Base64.encodeToString(bytes, 0, bytes.length, 0);
        view3.setOnClickListener(new yw3.u5(repairerPullDownWidgetDemoUI));
    }
}
