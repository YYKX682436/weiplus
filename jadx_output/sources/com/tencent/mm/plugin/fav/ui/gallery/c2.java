package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class c2 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f100903d;

    public c2(com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var, android.content.Context context) {
        this.f100903d = context;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        int dimension = (int) this.f100903d.getResources().getDimension(com.tencent.mm.R.dimen.f479898ib);
        rect.bottom = dimension;
        rect.top = dimension;
        rect.left = dimension;
        rect.right = dimension;
    }
}
