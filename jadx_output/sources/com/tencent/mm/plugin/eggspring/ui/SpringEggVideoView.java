package com.tencent.mm.plugin.eggspring.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/eggspring/ui/SpringEggVideoView;", "Lcom/tencent/mm/modelvideo/MMVideoView;", "", "filepath", "Ljz5/f0;", "setFilepath", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-eggspring_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SpringEggVideoView extends com.tencent.mm.modelvideo.MMVideoView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpringEggVideoView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        setScaleType(com.tencent.mm.pluginsdk.ui.e1.CROP);
        setIsShowBasicControls(false);
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public void setFilepath(java.lang.String str) {
        super.setFilepath(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpringEggVideoView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        setScaleType(com.tencent.mm.pluginsdk.ui.e1.CROP);
        setIsShowBasicControls(false);
    }
}
