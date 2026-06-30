package qe5;

/* loaded from: classes8.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.z f443724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443725e;

    public t(qe5.z zVar, java.lang.String str) {
        this.f443724d = zVar;
        this.f443725e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$setupDefaultOpenButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        qe5.z zVar = this.f443724d;
        if (!zVar.b7()) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$setupDefaultOpenButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.l(this.f443725e)) {
            zVar.d7(true);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/file/FileDownLoadBasicUIC$setupDefaultOpenButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
