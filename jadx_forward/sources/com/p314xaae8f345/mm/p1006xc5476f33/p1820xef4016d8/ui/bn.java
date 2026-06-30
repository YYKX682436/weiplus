package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class bn extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rm {

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f228297e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f228298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d f228299g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d, android.view.View view, int i17) {
        super(view);
        this.f228299g = activityC16390x60cac25d;
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.an(this, activityC16390x60cac25d, i17));
        if (i17 == 1) {
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.ikk);
            this.f228297e = findViewById;
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = activityC16390x60cac25d.Q;
            layoutParams.height = activityC16390x60cac25d.R;
            findViewById.setLayoutParams(layoutParams);
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.ij9);
            this.f228298f = findViewById2;
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
            layoutParams2.width = activityC16390x60cac25d.S;
            layoutParams2.height = activityC16390x60cac25d.T;
            findViewById2.setLayoutParams(layoutParams2);
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ikn)).setTextSize(1, 12.0f);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rm
    public void l(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm zmVar, int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rm
    public void n(boolean z17) {
    }
}
