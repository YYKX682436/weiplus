package m31;

/* loaded from: classes9.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.a1 f404686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f404687e;

    public i1(m31.a1 a1Var, m31.p1 p1Var) {
        this.f404686d = a1Var;
        this.f404687e = p1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$addSingleVoiceTmpMode$acceptWithVoiceView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String url = this.f404686d.f404651e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        long nanoTime = java.lang.System.nanoTime();
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p965xc41bc71e.p969x6b2e132.C11171xe3ef7b08(nanoTime, url, 0), p31.e.class, p31.a.f432981d);
        this.f404687e.f404712J = new m31.h1(nanoTime);
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$addSingleVoiceTmpMode$acceptWithVoiceView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
