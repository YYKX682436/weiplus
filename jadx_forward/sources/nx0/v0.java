package nx0;

/* loaded from: classes5.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10979xd03dfd61 f422777d;

    public v0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10979xd03dfd61 c10979xd03dfd61) {
        this.f422777d = c10979xd03dfd61;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m47340x4905e9fa;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10984x806b8ef5 m47342xb3543e45;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyView$initEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10979xd03dfd61 c10979xd03dfd61 = this.f422777d;
        m47340x4905e9fa = c10979xd03dfd61.m47340x4905e9fa();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m47340x4905e9fa.mo7946xf939df19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyAdapter");
        nx0.u uVar = (nx0.u) mo7946xf939df19;
        if (uVar.y()) {
            int i17 = 0;
            for (java.lang.Object obj : uVar.f422765d) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                nx0.x xVar = (nx0.x) obj;
                if (xVar instanceof nx0.v) {
                    nx0.v vVar = (nx0.v) xVar;
                    float f17 = vVar.f422776e;
                    float f18 = vVar.f422775d;
                    if (!(f17 == f18)) {
                        vVar.f422776e = f18;
                        uVar.m8147xed6e4d18(i17);
                    }
                }
                i17 = i18;
            }
            nx0.v vVar2 = c10979xd03dfd61.f151116o;
            if (vVar2 != null) {
                m47342xb3543e45 = c10979xd03dfd61.m47342xb3543e45();
                m47342xb3543e45.m47378x3ae760af(a06.d.b(vVar2.f422776e * 100));
            }
            c10979xd03dfd61.f(new nx0.u0(c10979xd03dfd61));
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyView$initEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
