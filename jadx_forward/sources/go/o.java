package go;

/* loaded from: classes.dex */
public final class o extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f355249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355250f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.ref.WeakReference weakReference, java.lang.String str) {
        super(1, null);
        this.f355249e = weakReference;
        this.f355250f = str;
    }

    @Override // tg3.a
    public void a(android.view.View widget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.content.Context context = (android.content.Context) this.f355249e.get();
        if (context != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("highlight_auto_translation", true);
            intent.putExtra("from_talker", this.f355250f);
            intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/chatting/translation/HandleAutoTranslationTipClickListener$handleTemplate$span$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/chatting/translation/HandleAutoTranslationTipClickListener$handleTemplate$span$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
