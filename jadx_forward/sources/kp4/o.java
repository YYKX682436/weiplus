package kp4;

/* loaded from: classes10.dex */
public final class o extends kp4.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kp4.r rVar, android.view.View itemView) {
        super(rVar, itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        itemView.setOnClickListener(null);
    }

    @Override // kp4.n
    public void i(kp4.a trackInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackInfo, "trackInfo");
        android.view.ViewGroup.LayoutParams layoutParams = this.f3639x46306858.getLayoutParams();
        if (layoutParams == null) {
            this.f3639x46306858.setLayoutParams(new android.view.ViewGroup.LayoutParams(trackInfo.f392606c, -1));
            return;
        }
        int i17 = layoutParams.width;
        int i18 = trackInfo.f392606c;
        if (i17 != i18) {
            layoutParams.width = i18;
            this.f3639x46306858.setLayoutParams(layoutParams);
        }
    }
}
