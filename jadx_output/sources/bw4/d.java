package bw4;

/* loaded from: classes3.dex */
public class d implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar f24938d;

    public d(com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar webSearchVideoPlayerSeekBar) {
        this.f24938d = webSearchVideoPlayerSeekBar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int curProgressBarLen;
        int curTimeByProgressBar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/widget/WebSearchVideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar webSearchVideoPlayerSeekBar = this.f24938d;
        if (action == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "ontouch down");
            int i17 = com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar.D;
            webSearchVideoPlayerSeekBar.f162483s = false;
            webSearchVideoPlayerSeekBar.f181709y = motionEvent.getX();
            webSearchVideoPlayerSeekBar.f162484t = ((android.widget.FrameLayout.LayoutParams) webSearchVideoPlayerSeekBar.f162475h.getLayoutParams()).leftMargin;
            m34.e eVar = webSearchVideoPlayerSeekBar.f162471d;
            if (eVar != null) {
                eVar.b();
            }
        } else if (motionEvent.getAction() == 2) {
            float x17 = motionEvent.getX();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "move dis %f ", java.lang.Float.valueOf(x17 - webSearchVideoPlayerSeekBar.f181709y));
            curProgressBarLen = webSearchVideoPlayerSeekBar.getCurProgressBarLen();
            webSearchVideoPlayerSeekBar.v((int) (curProgressBarLen + (x17 - webSearchVideoPlayerSeekBar.f181709y)));
            curTimeByProgressBar = webSearchVideoPlayerSeekBar.getCurTimeByProgressBar();
            webSearchVideoPlayerSeekBar.f162477m.setText(webSearchVideoPlayerSeekBar.k(curTimeByProgressBar / 60) + ":" + webSearchVideoPlayerSeekBar.k(curTimeByProgressBar % 60));
            webSearchVideoPlayerSeekBar.f162483s = true;
            webSearchVideoPlayerSeekBar.getClass();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "ontouch up");
            int i18 = com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar.D;
            int i19 = webSearchVideoPlayerSeekBar.f162480p;
            if (webSearchVideoPlayerSeekBar.f162483s) {
                i19 = webSearchVideoPlayerSeekBar.getCurTimeByProgressBar();
                webSearchVideoPlayerSeekBar.f162480p = i19;
            }
            if (webSearchVideoPlayerSeekBar.f162471d != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "current time : " + i19);
                webSearchVideoPlayerSeekBar.f162471d.a(i19);
            }
            webSearchVideoPlayerSeekBar.f162483s = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/websearch/widget/WebSearchVideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
