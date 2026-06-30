package com.tencent.mm.plugin.emojicapture.ui.capture;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-B\u001b\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b,\u0010.R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR2\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 ¨\u0006/"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/capture/MoreStickerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "D", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "getReporter", "()Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "setReporter", "(Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;)V", "reporter", "Lu22/c;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lu22/c;", "getDataCallback", "()Lu22/c;", "dataCallback", "Lkotlin/Function1;", "Lt85/d;", "Ljz5/f0;", "F", "Lyz5/l;", "getSelectionCallback", "()Lyz5/l;", "setSelectionCallback", "(Lyz5/l;)V", "selectionCallback", "Lkotlin/Function0;", "G", "Lyz5/a;", "getCloseCallback", "()Lyz5/a;", "setCloseCallback", "(Lyz5/a;)V", "closeCallback", "H", "getLoadMoreCallback", "setLoadMoreCallback", "loadMoreCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MoreStickerView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final /* synthetic */ int I = 0;
    public int A;
    public java.lang.String B;
    public boolean C;

    /* renamed from: D, reason: from kotlin metadata */
    public com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter reporter;

    /* renamed from: E, reason: from kotlin metadata */
    public final u22.c dataCallback;

    /* renamed from: F, reason: from kotlin metadata */
    public yz5.l selectionCallback;

    /* renamed from: G, reason: from kotlin metadata */
    public yz5.a closeCallback;

    /* renamed from: H, reason: from kotlin metadata */
    public yz5.a loadMoreCallback;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f98682v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f98683w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.recyclerview.widget.GridLayoutManager f98684x;

    /* renamed from: y, reason: collision with root package name */
    public final z22.f f98685y;

    /* renamed from: z, reason: collision with root package name */
    public final int f98686z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreStickerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.A = 5;
        this.C = true;
        android.view.View.inflate(context, com.tencent.mm.R.layout.a68, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dac);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f98682v = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.daa);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        this.f98683w = recyclerView;
        this.f98686z = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479734dr);
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(context, this.A);
        this.f98684x = gridLayoutManager;
        z22.f fVar = new z22.f();
        this.f98685y = fVar;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(fVar);
        recyclerView.setItemAnimator(null);
        gridLayoutManager.B = new a32.k0(this);
        fVar.f469719f = new a32.l0(this);
        fVar.f469720g = new a32.m0(this);
        this.dataCallback = new a32.o0(this);
        recyclerView.i(new a32.p0(this));
        findViewById.setOnClickListener(new a32.q0(this));
    }

    public final void A() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f98683w;
        if (recyclerView.getChildCount() <= 0) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        boolean z17 = true;
        for (int i17 = 0; i17 < childCount; i17++) {
            t85.d dVar = (t85.d) kz5.n0.a0(this.f98685y.f469717d, recyclerView.u0(recyclerView.getChildAt(i17)));
            if (dVar != null) {
                r45.p64 p64Var = dVar.f416456a;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(p64Var.f382792d)) {
                    if (!z17) {
                        sb6.append("#");
                        sb7.append("#");
                    }
                    sb6.append(p64Var.f382792d);
                    sb7.append(p64Var.f382794f);
                    z17 = false;
                }
            }
        }
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = this.reporter;
        if (emojiCaptureReporter != null) {
            emojiCaptureReporter.a(sb6.toString(), sb7.toString());
        }
    }

    public final yz5.a getCloseCallback() {
        return this.closeCallback;
    }

    public final u22.c getDataCallback() {
        return this.dataCallback;
    }

    public final yz5.a getLoadMoreCallback() {
        return this.loadMoreCallback;
    }

    public final com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter getReporter() {
        return this.reporter;
    }

    public final yz5.l getSelectionCallback() {
        return this.selectionCallback;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int measuredWidth = getMeasuredWidth();
        int i19 = this.f98686z;
        if (measuredWidth > i19) {
            int measuredWidth2 = getMeasuredWidth() / i19;
            this.A = measuredWidth2;
            this.f98684x.c0(measuredWidth2);
        }
    }

    public final void setCloseCallback(yz5.a aVar) {
        this.closeCallback = aVar;
    }

    public final void setLoadMoreCallback(yz5.a aVar) {
        this.loadMoreCallback = aVar;
    }

    public final void setReporter(com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter) {
        this.reporter = emojiCaptureReporter;
    }

    public final void setSelectionCallback(yz5.l lVar) {
        this.selectionCallback = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MoreStickerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
