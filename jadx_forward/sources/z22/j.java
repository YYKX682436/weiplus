package z22;

/* loaded from: classes10.dex */
public final class j extends z22.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z22.l lVar, android.view.View itemView) {
        super(lVar, itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
    }

    @Override // z22.h
    public void i(int i17, r45.p64 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        u22.l lVar = u22.r.f505539p;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(info, u22.r.f505542s)) {
            android.view.View view = this.f3639x46306858;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$MoreStickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$MoreStickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f3639x46306858;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$MoreStickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$MoreStickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView = this.f551257d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-icon>(...)");
        y22.n.d(imageView, com.p314xaae8f345.mm.R.raw.f79813xc8512e6d, imageView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        this.f551258e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bv7);
    }
}
