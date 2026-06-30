package com.tencent.mm.mvvm;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR.\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/mvvm/MvvmView;", "Lq31/p;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Landroid/widget/FrameLayout;", "value", "d", "Lq31/p;", "getViewModel", "()Lq31/p;", "setViewModel", "(Lq31/p;)V", "viewModel", "Landroid/view/View;", "e", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "contentView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class MvvmView<T extends q31.p> extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public q31.p viewModel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.view.View contentView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public boolean b() {
        return this instanceof com.tencent.mm.chatting.widget.MaskContentMvvmView;
    }

    public abstract android.view.View c(android.content.Context context);

    public void d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View c17 = c(context);
        if (c17 != null) {
            if (!b()) {
                addView(c17);
            }
            this.contentView = c17;
        }
    }

    public abstract void e(q31.p pVar, q31.p pVar2);

    public void f() {
    }

    public final android.view.View getContentView() {
        return this.contentView;
    }

    public final T getViewModel() {
        return (T) this.viewModel;
    }

    public final void setContentView(android.view.View view) {
        this.contentView = view;
    }

    public final void setViewModel(T t17) {
        q31.p pVar = this.viewModel;
        this.viewModel = t17;
        f();
        e(pVar, this.viewModel);
    }

    public /* synthetic */ MvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        d(context);
        if (q31.s.f359920a) {
            android.view.View view = new android.view.View(context);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(30, 30);
            layoutParams.gravity = 83;
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(android.graphics.Color.parseColor("#E6FF0000"));
            addView(view);
        }
    }
}
