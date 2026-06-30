package com.tencent.mm.emoji.view;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0006\u0012B'\b\u0007\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010-\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010(\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00060"}, d2 = {"Lcom/tencent/mm/emoji/view/AbsEmojiView;", "Lcom/tencent/mm/plugin/gif/MMAnimateView;", "", "status", "Ljz5/f0;", "setStatusNotify", "Lsr/a;", "n", "Lsr/a;", "getDelegate", "()Lsr/a;", "delegate", "o", "I", "getStatus", "()I", "setStatus", "(I)V", "Lsr/b;", "p", "Lsr/b;", "getStatusListener", "()Lsr/b;", "setStatusListener", "(Lsr/b;)V", "statusListener", "", "q", "Z", "getGameUseCover", "()Z", "setGameUseCover", "(Z)V", "gameUseCover", "Lcom/tencent/mm/api/IEmojiInfo;", "value", "getEmojiInfo", "()Lcom/tencent/mm/api/IEmojiInfo;", "setEmojiInfo", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "emojiInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "emojisdk-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class AbsEmojiView extends com.tencent.mm.plugin.gif.MMAnimateView {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final sr.a delegate;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int status;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public sr.b statusListener;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean gameUseCover;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbsEmojiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public sr.a getDelegate() {
        return this.delegate;
    }

    public final com.tencent.mm.api.IEmojiInfo getEmojiInfo() {
        return ((sr.l) getDelegate()).f411399c;
    }

    public final boolean getGameUseCover() {
        return this.gameUseCover;
    }

    public final int getStatus() {
        return this.status;
    }

    public final sr.b getStatusListener() {
        return this.statusListener;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        getDelegate().destroy();
        super.onDetachedFromWindow();
    }

    public final void setEmojiInfo(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        sr.l lVar = (sr.l) getDelegate();
        lVar.f411399c = iEmojiInfo;
        lVar.reload();
    }

    public final void setGameUseCover(boolean z17) {
        this.gameUseCover = z17;
    }

    public final void setStatus(int i17) {
        this.status = i17;
    }

    public final void setStatusListener(sr.b bVar) {
        this.statusListener = bVar;
    }

    public final void setStatusNotify(int i17) {
        this.status = i17;
        sr.b bVar = this.statusListener;
        if (bVar != null) {
            bVar.a(i17);
        }
    }

    public /* synthetic */ AbsEmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsEmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        i95.m c17 = i95.n0.c(com.tencent.mm.feature.emoji.api.k6.class);
        kotlin.jvm.internal.o.d(c17);
        this.delegate = new sr.l(this);
        this.gameUseCover = true;
    }
}
