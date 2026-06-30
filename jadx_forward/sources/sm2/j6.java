package sm2;

/* loaded from: classes3.dex */
public final class j6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f491056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491057e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(fm2.a aVar, sm2.o4 o4Var) {
        super(0);
        this.f491056d = aVar;
        this.f491057e = o4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup viewGroup;
        fm2.a aVar = this.f491056d;
        android.view.View findViewById = aVar.findViewById(com.p314xaae8f345.mm.R.id.tjw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById;
        int childCount = viewGroup2.getChildCount();
        sm2.o4 o4Var = this.f491057e;
        if (childCount == 0) {
            if (android.os.Build.VERSION.SDK_INT > 25) {
                zl2.w4 w4Var = zl2.w4.f555550a;
                zl2.u4 u4Var = zl2.u4.f555522e;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = o4Var.f101127b;
                android.view.LayoutInflater layoutInflater = activityC0065xcd7aa112.getLayoutInflater();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(layoutInflater, "getLayoutInflater(...)");
                viewGroup = (android.view.ViewGroup) w4Var.b(com.p314xaae8f345.mm.R.C30864xbddafb2a.dxu, viewGroup2, false, u4Var, activityC0065xcd7aa112, layoutInflater);
            } else {
                android.view.View inflate = android.view.LayoutInflater.from(o4Var.f101127b).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dxu, viewGroup2, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                viewGroup = (android.view.ViewGroup) inflate;
            }
            viewGroup2.addView(viewGroup);
            o4Var.f491166s = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv) o4Var.N(new sm2.h6(viewGroup, aVar));
        } else {
            android.view.View childAt = viewGroup2.getChildAt(0);
            android.view.ViewGroup viewGroup3 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            if (viewGroup3 != null) {
                o4Var.f491166s = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv) o4Var.N(new sm2.i6(viewGroup3, aVar));
            }
        }
        return o4Var.f491166s;
    }
}
