package uc5;

/* loaded from: classes4.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq.a f508005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f508006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uc5.d0 f508007f;

    public c0(aq.a aVar, java.lang.String str, uc5.d0 d0Var) {
        this.f508005d = aVar;
        this.f508006e = str;
        this.f508007f = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryPersonRecommendRowConvert$PersonAdapter$PersonViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("person item clicked: labelId=");
        aq.a aVar = this.f508005d;
        sb6.append(aVar.f94359a);
        sb6.append(", talker=");
        java.lang.String talker = this.f508006e;
        sb6.append(talker);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PersonRecommendRowConvert", sb6.toString());
        android.content.Context context = this.f508007f.f3639x46306858.getContext();
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.ActivityC21828xc79db19c.F;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        java.lang.String labelId = aVar.f94359a;
        java.lang.String cropImagePath = aVar.f94360b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelId, "labelId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cropImagePath, "cropImagePath");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.ActivityC21828xc79db19c.class);
        intent.putExtra("kTalker", talker);
        intent.putExtra("kLabelId", labelId);
        intent.putExtra("kCropImagePath", cropImagePath);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryPersonRecommendRowConvert$PersonAdapter$PersonViewHolder$bind$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryPersonRecommendRowConvert$PersonAdapter$PersonViewHolder$bind$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryPersonRecommendRowConvert$PersonAdapter$PersonViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
