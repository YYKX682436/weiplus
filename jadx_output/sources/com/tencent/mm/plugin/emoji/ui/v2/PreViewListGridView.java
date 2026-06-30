package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes5.dex */
public class PreViewListGridView extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public android.view.WindowManager f98346d;

    /* renamed from: e, reason: collision with root package name */
    public int f98347e;

    public PreViewListGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        new com.tencent.mm.sdk.platformtools.n3();
        b(context);
    }

    public final void b(android.content.Context context) {
        new com.tencent.mm.pluginsdk.ui.emoji.PopEmojiView(getContext());
        this.f98347e = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480380wb);
        this.f98346d = (android.view.WindowManager) context.getSystemService("window");
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(-1, -1, 2, 8, 1);
        int i17 = this.f98347e;
        layoutParams.width = i17;
        layoutParams.height = i17;
        layoutParams.gravity = 17;
        if (getResources().getConfiguration().orientation == 2) {
            this.f98346d.getDefaultDisplay().getHeight();
            this.f98346d.getDefaultDisplay().getWidth();
        } else {
            this.f98346d.getDefaultDisplay().getWidth();
            this.f98346d.getDefaultDisplay().getHeight();
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setEnablePreView(boolean z17) {
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
    }

    public PreViewListGridView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        new com.tencent.mm.sdk.platformtools.n3();
        b(context);
    }
}
