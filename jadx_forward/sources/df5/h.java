package df5;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.g f313648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df5.l f313649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v11.e f313650f;

    public h(df5.g gVar, df5.l lVar, v11.e eVar) {
        this.f313648d = gVar;
        this.f313649e = lVar;
        this.f313650f = eVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/InteractOptionsView$createButtonView$1$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        df5.g gVar = this.f313648d;
        boolean z17 = true;
        if (action == 0) {
            gVar.m124324x76ebfb11(true);
        } else if (action == 1) {
            gVar.m124324x76ebfb11(false);
            df5.l lVar = this.f313649e;
            yz5.a m124341x984bae05 = lVar.m124341x984bae05();
            if (m124341x984bae05 != null) {
                m124341x984bae05.mo152xb9724478();
            }
            yz5.l m124340x2ec4da35 = lVar.m124340x2ec4da35();
            if (m124340x2ec4da35 != null) {
                m124340x2ec4da35.mo146xb9724478(this.f313650f);
            }
        } else if (action != 3) {
            z17 = false;
        } else {
            gVar.m124324x76ebfb11(false);
        }
        yj0.a.i(z17, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/InteractOptionsView$createButtonView$1$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
