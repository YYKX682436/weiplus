package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public class r extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f95554d;

    public r(com.tencent.mm.plugin.choosemsgfile.logic.ui.u uVar, android.content.Context context) {
        this.f95554d = context;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        int dimension = (int) this.f95554d.getResources().getDimension(com.tencent.mm.R.dimen.f479898ib);
        rect.bottom = dimension;
        rect.top = dimension;
        rect.left = dimension;
        rect.right = dimension;
    }
}
