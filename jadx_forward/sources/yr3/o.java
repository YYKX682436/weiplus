package yr3;

/* loaded from: classes11.dex */
public class o implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f546494d;

    /* renamed from: e, reason: collision with root package name */
    public rl5.r f546495e;

    /* renamed from: f, reason: collision with root package name */
    public final db5.n4 f546496f;

    /* renamed from: g, reason: collision with root package name */
    public final yr3.m f546497g;

    public o(android.content.Context context, int i17, sr3.g config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f546494d = context;
        this.f546496f = new yr3.g(this, config);
        this.f546497g = new yr3.m(this, i17, config);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$ProfileItemLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FeatureMsgUtil", "long click view null");
            yj0.a.i(true, this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$ProfileItemLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.tab.msg.holder.FeatureMsgUtil.BizProfileDataTag");
        yr3.f fVar = (yr3.f) tag;
        yr3.m mVar = this.f546497g;
        if (mVar != null) {
            mVar.f546462e = fVar;
        }
        rl5.r rVar = this.f546495e;
        if (rVar != null) {
            rVar.a();
            this.f546495e = null;
        }
        rl5.r rVar2 = new rl5.r(this.f546494d);
        this.f546495e = rVar2;
        rVar2.C = true;
        rVar2.L = null;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = iArr[0] + ((int) (view.getWidth() / 2.0f));
        int i17 = iArr[1];
        rl5.r rVar3 = this.f546495e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rVar3);
        rVar3.f(view, this.f546496f, this.f546497g, width, i17);
        yj0.a.i(true, this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$ProfileItemLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
