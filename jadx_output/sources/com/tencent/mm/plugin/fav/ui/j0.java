package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class j0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f101188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f101189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f101190f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavBaseUI f101191g;

    public j0(com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        this.f101191g = favBaseUI;
        this.f101188d = textView;
        this.f101189e = textView2;
        this.f101190f = textView3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI = this.f101191g;
        favBaseUI.f100280u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int width = favBaseUI.f100280u.findViewById(com.tencent.mm.R.id.f484335dx5).getWidth() / 3;
        if (width > 0) {
            android.widget.TextView textView = this.f101188d;
            if (textView.getWidth() < width) {
                this.f101189e.setWidth(width);
                textView.setWidth(width);
                this.f101190f.setWidth(width);
            }
        }
    }
}
