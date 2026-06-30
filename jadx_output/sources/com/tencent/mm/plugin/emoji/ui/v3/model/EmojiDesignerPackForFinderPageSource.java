package com.tencent.mm.plugin.emoji.ui.v3.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012 \u0010\t\u001a\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiDesignerPackForFinderPageSource;", "Landroidx/lifecycle/f;", "Lcom/tencent/wechat/aff/emoticon/i;", "emoticonFinderDesignerData", "Lkotlin/Function2;", "", "Lbw5/ra;", "", "Ljz5/f0;", "dataCallback", "<init>", "(Lcom/tencent/wechat/aff/emoticon/i;Lyz5/p;)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class EmojiDesignerPackForFinderPageSource implements androidx.lifecycle.f {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wechat.aff.emoticon.i f98498d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f98499e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f98500f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f98501g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f98502h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f98503i;

    public EmojiDesignerPackForFinderPageSource(com.tencent.wechat.aff.emoticon.i emoticonFinderDesignerData, yz5.p dataCallback) {
        kotlin.jvm.internal.o.g(emoticonFinderDesignerData, "emoticonFinderDesignerData");
        kotlin.jvm.internal.o.g(dataCallback, "dataCallback");
        this.f98498d = emoticonFinderDesignerData;
        this.f98499e = dataCallback;
        this.f98500f = "MicroMsg.EmojiDesignerPackForFinderPageSource";
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i(this.f98500f, "load: " + this.f98502h + ", " + this.f98501g);
        if (this.f98502h) {
            return;
        }
        if (this.f98501g) {
            this.f98503i = true;
        } else {
            this.f98501g = true;
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new i22.c(this, null), 3, null);
        }
    }
}
