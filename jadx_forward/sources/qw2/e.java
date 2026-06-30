package qw2;

/* loaded from: classes10.dex */
public final class e extends qw2.c {

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f448650e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f448651f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f448652g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qw2.f f448653h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qw2.f fVar, android.view.View itemView) {
        super(fVar, itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f448653h = fVar;
        this.f448650e = (android.widget.ImageView) itemView.findViewById(com.p314xaae8f345.mm.R.id.eca);
        this.f448651f = itemView.findViewById(com.p314xaae8f345.mm.R.id.ecb);
        this.f448652g = itemView.findViewById(com.p314xaae8f345.mm.R.id.ecc);
    }

    @Override // qw2.c
    public void i(int i17, r45.p64 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.i(i17, info);
        vo0.d dVar = u85.p.f507254a;
        wo0.c a17 = u85.p.f507254a.a(new u85.a(info));
        android.widget.ImageView imageView = this.f448650e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        a17.c(imageView);
        qw2.f fVar = this.f448653h;
        if (i17 == fVar.f448655e && fVar.f448657g) {
            android.view.View view = this.f448651f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f448652g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f448651f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f448652g;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
