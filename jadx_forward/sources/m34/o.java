package m34;

/* loaded from: classes15.dex */
public class o implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17690x28cfde34 f404900d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17690x28cfde34 c17690x28cfde34) {
        this.f404900d = c17690x28cfde34;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int m69305xfcd54d84;
        int m69305xfcd54d842;
        int m69304x11ddf3f8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sight/decode/ui/SnsAdNativeLandingPagesVideoPlayerLoadingBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17690x28cfde34 c17690x28cfde34 = this.f404900d;
        if (action == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdNativeLandingPagesVideoPlayerLoadingBar", "ontouch down");
            c17690x28cfde34.f244033q = false;
            c17690x28cfde34.f244034r = motionEvent.getX();
            m34.e eVar = c17690x28cfde34.f244023d;
            if (eVar != null) {
                eVar.b();
            }
        } else if (motionEvent.getAction() == 2) {
            float x17 = motionEvent.getX();
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c17690x28cfde34.f244027h.getLayoutParams();
            layoutParams.leftMargin = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17690x28cfde34.b(c17690x28cfde34, layoutParams.leftMargin + ((int) (x17 - c17690x28cfde34.f244034r)));
            c17690x28cfde34.f244027h.setLayoutParams(layoutParams);
            m69305xfcd54d842 = c17690x28cfde34.m69305xfcd54d84();
            if (c17690x28cfde34.f244031o > 0) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) c17690x28cfde34.f244025f.getLayoutParams();
                m69304x11ddf3f8 = c17690x28cfde34.m69304x11ddf3f8();
                layoutParams2.width = (int) (((m69305xfcd54d842 * 1.0d) / c17690x28cfde34.f244031o) * m69304x11ddf3f8);
                c17690x28cfde34.f244025f.setLayoutParams(layoutParams2);
            }
            c17690x28cfde34.f244029m.setText(c17690x28cfde34.f(m69305xfcd54d842 / 60) + ":" + c17690x28cfde34.f(m69305xfcd54d842 % 60));
            c17690x28cfde34.f244033q = true;
        } else if (c17690x28cfde34.f244033q) {
            m69305xfcd54d84 = c17690x28cfde34.m69305xfcd54d84();
            if (c17690x28cfde34.f244023d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdNativeLandingPagesVideoPlayerLoadingBar", "current time : " + m69305xfcd54d84);
                c17690x28cfde34.f244023d.a(m69305xfcd54d84);
            }
            c17690x28cfde34.f244033q = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sight/decode/ui/SnsAdNativeLandingPagesVideoPlayerLoadingBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
