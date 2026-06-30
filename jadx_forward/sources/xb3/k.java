package xb3;

/* loaded from: classes9.dex */
public class k extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo3.m f534439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.u43 f534440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xb3.m f534441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xb3.m mVar, fo3.m mVar2, r45.u43 u43Var) {
        super(false);
        this.f534441f = mVar;
        this.f534439d = mVar2;
        this.f534440e = u43Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "open btn click!");
        fo3.m mVar = this.f534439d;
        mVar.onClick(view);
        if (mVar.f346448i) {
            w04.l.INSTANCE.ac(540999719, mVar.f346446g, true);
        }
        xb3.m mVar2 = this.f534441f;
        mVar2.f534443a.f226674o.setClickable(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c activityC16335x1879211c = mVar2.f534443a;
        activityC16335x1879211c.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "do open hb");
        new wb3.b(activityC16335x1879211c.f226683x, activityC16335x1879211c.f226682w, activityC16335x1879211c.getIntent().getStringExtra("key_username"), 1, activityC16335x1879211c.f226684y, this.f534440e.f468551q).l().h(new xb3.h(activityC16335x1879211c)).f(activityC16335x1879211c);
        activityC16335x1879211c.f226674o.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.G(activityC16335x1879211c.f226675p, 0);
    }
}
