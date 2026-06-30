package wo1;

/* loaded from: classes3.dex */
public final class z0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public long f529593d;

    /* renamed from: e, reason: collision with root package name */
    public final int f529594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f529595f;

    public z0(wo1.a1 a1Var, yz5.a aVar) {
        this.f529595f = aVar;
        this.f529594e = a1Var.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$setHintAndClickableStr$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f529593d < 500) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$setHintAndClickableStr$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f529593d = currentTimeMillis;
        this.f529595f.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$setHintAndClickableStr$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f529594e);
    }
}
