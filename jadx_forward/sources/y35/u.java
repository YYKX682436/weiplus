package y35;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f540790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f540791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y35.z f540792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y35.r f540793g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.Object obj, android.view.View view, y35.z zVar, y35.r rVar) {
        super(2);
        this.f540790d = obj;
        this.f540791e = view;
        this.f540792f = zVar;
        this.f540793g = rVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540790d, this.f540791e.getTag());
        if (b17) {
            y35.z zVar = this.f540792f;
            android.view.View view = (android.view.View) ((jz5.n) zVar.f540801d).mo141623x754a37bb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder$bindData$1", "invoke", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder$bindData$1", "invoke", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (bitmap != null) {
                jz5.g gVar = zVar.f540799b;
                ((android.widget.ImageView) ((jz5.n) gVar).mo141623x754a37bb()).setImageBitmap(bitmap);
                if (!android.text.TextUtils.isEmpty(str)) {
                    ((android.widget.ImageView) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(new y35.t(zVar, this.f540793g, str));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageSayHiImgHolder", "getBitmap fail, bitmap is null:%s isTagValid:%s", java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(b17));
            }
        }
        return jz5.f0.f384359a;
    }
}
