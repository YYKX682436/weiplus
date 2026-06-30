package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1595xbeeb310a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 '2\u00020\u0001:\u0001(B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u000e¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/ui/special/factory/ThemeLivingItemConvertFactory;", "Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/BaseFactory;", "", "screenWidth", "Ljz5/f0;", "updateLivingWidth", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "commentScene", "I", "getCommentScene", "()I", "", "aspectRatio", "F", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "bottomExtraInfo", "getBottomExtraInfo", "setBottomExtraInfo", "(I)V", "Lsp2/c4;", "autoPlayChecker", "Lsp2/c4;", "getAutoPlayChecker", "()Lsp2/c4;", "Lsp2/k;", "outsideOperator", "Lsp2/k;", "getOutsideOperator", "()Lsp2/k;", "getScreenWidth", "<init>", "(Landroid/content/Context;IF)V", "Companion", "br2/b", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLivingItemConvertFactory */
/* loaded from: classes2.dex */
public abstract class AbstractC14565x91bfdb1c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.AbstractC14537xab824cd9 {

    /* renamed from: Companion */
    public static final br2.b f36049x233c02ec = new br2.b(null);
    private static final java.lang.String TAG = "ThemeLargeLivingItemCon";
    private float aspectRatio;
    private final sp2.c4 autoPlayChecker;
    private int bottomExtraInfo;
    private final int commentScene;
    private final android.content.Context context;
    private final sp2.k outsideOperator;

    public /* synthetic */ AbstractC14565x91bfdb1c(android.content.Context context, int i17, float f17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, i17, (i18 & 4) != 0 ? 1.7776f : f17);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final sp2.c4 getAutoPlayChecker() {
        return this.autoPlayChecker;
    }

    public final int getBottomExtraInfo() {
        return this.bottomExtraInfo;
    }

    public final int getCommentScene() {
        return this.commentScene;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.AbstractC14537xab824cd9, in5.s
    /* renamed from: getItemConvert */
    public abstract /* synthetic */ in5.r mo43555xf2bb75ea(int i17);

    public final sp2.k getOutsideOperator() {
        return this.outsideOperator;
    }

    /* renamed from: getScreenWidth */
    public final int m58447xd6cf2784() {
        return com.p314xaae8f345.mm.ui.bl.b(this.context).x;
    }

    /* renamed from: setAspectRatio */
    public final void m58448xb154fcd1(float f17) {
        this.aspectRatio = f17;
    }

    /* renamed from: setBottomExtraInfo */
    public final void m58449xfb021631(int i17) {
        this.bottomExtraInfo = i17;
    }

    /* renamed from: updateLivingWidth */
    public void mo58439x213e8414(int i17) {
    }

    public AbstractC14565x91bfdb1c(android.content.Context context, int i17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.context = context;
        this.commentScene = i17;
        this.aspectRatio = f17;
        this.autoPlayChecker = new br2.c();
        this.outsideOperator = new br2.d(this);
    }
}
