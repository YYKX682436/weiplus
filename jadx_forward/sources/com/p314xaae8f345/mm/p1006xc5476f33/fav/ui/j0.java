package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class j0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f182721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f182722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f182723f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 f182724g;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        this.f182724g = abstractActivityC13548xbf543800;
        this.f182721d = textView;
        this.f182722e = textView2;
        this.f182723f = textView3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800 = this.f182724g;
        abstractActivityC13548xbf543800.f181813u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int width = abstractActivityC13548xbf543800.f181813u.findViewById(com.p314xaae8f345.mm.R.id.f565868dx5).getWidth() / 3;
        if (width > 0) {
            android.widget.TextView textView = this.f182721d;
            if (textView.getWidth() < width) {
                this.f182722e.setWidth(width);
                textView.setWidth(width);
                this.f182723f.setWidth(width);
            }
        }
    }
}
