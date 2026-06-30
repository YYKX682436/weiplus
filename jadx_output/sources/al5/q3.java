package al5;

/* loaded from: classes7.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.ThreeDotsLoadingView f6002d;

    public q3(com.tencent.mm.ui.widget.ThreeDotsLoadingView threeDotsLoadingView) {
        this.f6002d = threeDotsLoadingView;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.ui.widget.ThreeDotsLoadingView.f211446o;
        com.tencent.mm.ui.widget.ThreeDotsLoadingView threeDotsLoadingView = this.f6002d;
        threeDotsLoadingView.getClass();
        threeDotsLoadingView.f211451h.setImageDrawable(threeDotsLoadingView.b(threeDotsLoadingView.f211447d, new float[]{0.4f, 0.3f, 0.5f}));
        threeDotsLoadingView.f211452i.setImageDrawable(threeDotsLoadingView.b(threeDotsLoadingView.f211447d, new float[]{0.5f, 0.4f, 0.3f}));
        threeDotsLoadingView.f211453m.setImageDrawable(threeDotsLoadingView.b(threeDotsLoadingView.f211447d, new float[]{0.3f, 0.5f, 0.4f}));
        ((android.graphics.drawable.AnimationDrawable) threeDotsLoadingView.f211451h.getDrawable()).start();
        ((android.graphics.drawable.AnimationDrawable) threeDotsLoadingView.f211452i.getDrawable()).start();
        ((android.graphics.drawable.AnimationDrawable) threeDotsLoadingView.f211453m.getDrawable()).start();
    }
}
