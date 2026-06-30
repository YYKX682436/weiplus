package lf2;

/* loaded from: classes10.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf2.s f399820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lf2.l f399822f;

    public i(lf2.s sVar, int i17, lf2.l lVar) {
        this.f399820d = sVar;
        this.f399821e = i17;
        this.f399822f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$mReverberationAdapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lf2.s sVar = this.f399820d;
        java.util.Iterator it = sVar.e0().iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            int i18 = this.f399821e;
            if (!hasNext) {
                java.lang.Object obj = sVar.e0().get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) sVar.H.a(om2.e.class)).f427830p).k(((lf2.b) obj).f399807a);
                this.f399822f.m8146xced61ae5();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel$mReverberationAdapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.Object next = it.next();
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((lf2.b) next).f399808b = i17 == i18;
            i17 = i19;
        }
    }
}
