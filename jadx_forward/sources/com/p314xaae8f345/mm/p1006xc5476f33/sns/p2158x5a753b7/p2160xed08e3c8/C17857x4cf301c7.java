package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R#\u0010\u0019\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverDefaultView;", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "Lv94/g;", "info", "Ljz5/f0;", "loadCover", "onPreClose", "onPreOpen", "onPostOpen", "onPostClose", "", "getLayoutId", "onResume", "onPause", "onDestroy", "getType", "", "TAG", "Ljava/lang/String;", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "changeCoverTxt$delegate", "Ljz5/g;", "getChangeCoverTxt", "()Landroid/widget/TextView;", "changeCoverTxt", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView */
/* loaded from: classes4.dex */
public class C17857x4cf301c7 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b {
    private final java.lang.String TAG;

    /* renamed from: changeCoverTxt$delegate, reason: from kotlin metadata */
    private final jz5.g changeCoverTxt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17857x4cf301c7(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.TAG = "MicroMsg.SnsCoverDefaultView";
        this.changeCoverTxt = jz5.h.b(new aa4.d(this));
    }

    /* renamed from: access$getChangeCoverTxt */
    public static final /* synthetic */ android.widget.TextView m69725xa314cbf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17857x4cf301c7 c17857x4cf301c7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getChangeCoverTxt", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        android.widget.TextView m69726xc89adbff = c17857x4cf301c7.m69726xc89adbff();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getChangeCoverTxt", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        return m69726xc89adbff;
    }

    /* renamed from: getChangeCoverTxt */
    private final android.widget.TextView m69726xc89adbff() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChangeCoverTxt", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        android.widget.TextView textView = (android.widget.TextView) this.changeCoverTxt.mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChangeCoverTxt", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        return textView;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.InterfaceC17852x70c51412
    /* renamed from: getLayoutId */
    public int mo62924x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cr7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.InterfaceC17852x70c51412
    /* renamed from: getType */
    public int mo62925xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.InterfaceC17852x70c51412
    /* renamed from: loadCover */
    public void mo62927x5146be71(v94.g gVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gm0.j1.u().c().l(2, null), gVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1) gVar).m70536x6bf53a6c() : null)) {
            pm0.v.X(new aa4.e(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.InterfaceC17852x70c51412
    /* renamed from: onDestroy */
    public void mo62929xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.InterfaceC17852x70c51412
    /* renamed from: onPause */
    public void mo62931xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.sns.api.InterfaceC10690xfc973014
    /* renamed from: onPostClose */
    public void mo45309x73fef619() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "[onPreClose]");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.sns.api.InterfaceC10690xfc973014
    /* renamed from: onPostOpen */
    public void mo45310xd2370609() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.sns.api.InterfaceC10690xfc973014
    /* renamed from: onPreClose */
    public void mo45311x56608c14() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.sns.api.InterfaceC10690xfc973014
    /* renamed from: onPreOpen */
    public void mo45312x3c9d44ae() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "[onPreOpen]");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.InterfaceC17852x70c51412
    /* renamed from: onResume */
    public void mo62932x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }
}
