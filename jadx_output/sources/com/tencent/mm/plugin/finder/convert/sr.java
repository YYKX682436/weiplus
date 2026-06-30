package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class sr extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f104571d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f104572e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(com.tencent.mm.plugin.finder.convert.wr wrVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) itemView;
        roundCornerRelativeLayout.setRadius(roundCornerRelativeLayout.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv));
        this.f104571d = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.kiu);
        this.f104572e = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.kiw);
    }
}
