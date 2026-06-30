package bw4;

/* loaded from: classes3.dex */
public class d implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb f106471d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb c19229x611ccebb) {
        this.f106471d = c19229x611ccebb;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int m74120xd56b4f39;
        int m74121xec4e9a18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/widget/WebSearchVideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb c19229x611ccebb = this.f106471d;
        if (action == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "ontouch down");
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb.D;
            c19229x611ccebb.f244016s = false;
            c19229x611ccebb.f263242y = motionEvent.getX();
            c19229x611ccebb.f244017t = ((android.widget.FrameLayout.LayoutParams) c19229x611ccebb.f244008h.getLayoutParams()).leftMargin;
            m34.e eVar = c19229x611ccebb.f244004d;
            if (eVar != null) {
                eVar.b();
            }
        } else if (motionEvent.getAction() == 2) {
            float x17 = motionEvent.getX();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "move dis %f ", java.lang.Float.valueOf(x17 - c19229x611ccebb.f263242y));
            m74120xd56b4f39 = c19229x611ccebb.m74120xd56b4f39();
            c19229x611ccebb.v((int) (m74120xd56b4f39 + (x17 - c19229x611ccebb.f263242y)));
            m74121xec4e9a18 = c19229x611ccebb.m74121xec4e9a18();
            c19229x611ccebb.f244010m.setText(c19229x611ccebb.k(m74121xec4e9a18 / 60) + ":" + c19229x611ccebb.k(m74121xec4e9a18 % 60));
            c19229x611ccebb.f244016s = true;
            c19229x611ccebb.getClass();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "ontouch up");
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb.D;
            int i19 = c19229x611ccebb.f244013p;
            if (c19229x611ccebb.f244016s) {
                i19 = c19229x611ccebb.m74121xec4e9a18();
                c19229x611ccebb.f244013p = i19;
            }
            if (c19229x611ccebb.f244004d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "current time : " + i19);
                c19229x611ccebb.f244004d.a(i19);
            }
            c19229x611ccebb.f244016s = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/websearch/widget/WebSearchVideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
