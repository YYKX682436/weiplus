package be5;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368 f101098d;

    public d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368 c21858x72911368) {
        this.f101098d = c21858x72911368;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment$onCreateView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = this.f101098d.mo7430x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x19263085);
        pf5.z zVar = pf5.z.f435481a;
        if (!(mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((ee5.e3) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(ee5.e3.class)).O6();
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/search/multi/fragment/FTSMultiNormalResultFragment$onCreateView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
