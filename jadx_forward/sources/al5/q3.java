package al5;

/* loaded from: classes7.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 f87535d;

    public q3(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 c22651x9410f9f9) {
        this.f87535d = c22651x9410f9f9;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9.f292979o;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 c22651x9410f9f9 = this.f87535d;
        c22651x9410f9f9.getClass();
        c22651x9410f9f9.f292984h.setImageDrawable(c22651x9410f9f9.b(c22651x9410f9f9.f292980d, new float[]{0.4f, 0.3f, 0.5f}));
        c22651x9410f9f9.f292985i.setImageDrawable(c22651x9410f9f9.b(c22651x9410f9f9.f292980d, new float[]{0.5f, 0.4f, 0.3f}));
        c22651x9410f9f9.f292986m.setImageDrawable(c22651x9410f9f9.b(c22651x9410f9f9.f292980d, new float[]{0.3f, 0.5f, 0.4f}));
        ((android.graphics.drawable.AnimationDrawable) c22651x9410f9f9.f292984h.getDrawable()).start();
        ((android.graphics.drawable.AnimationDrawable) c22651x9410f9f9.f292985i.getDrawable()).start();
        ((android.graphics.drawable.AnimationDrawable) c22651x9410f9f9.f292986m.getDrawable()).start();
    }
}
