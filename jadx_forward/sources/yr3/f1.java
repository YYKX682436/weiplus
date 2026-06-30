package yr3;

/* loaded from: classes11.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.h1 f546345d;

    public f1(yr3.h1 h1Var) {
        this.f546345d = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        wr3.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wr3.h hVar = this.f546345d.f546371d.f530352i;
        if (hVar != null && (aVar = ((wr3.b1) hVar).f530294a.f235952o) != null) {
            as3.m0 m0Var = as3.m0.f95067h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.k6) aVar).f235917a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16916xb2db4a89 c16916xb2db4a89 = c16892x4a36dc90.C;
            if (c16916xb2db4a89 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("menuTabLayout");
                throw null;
            }
            int A = c16916xb2db4a89.A(m0Var);
            if (A < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetTabBizInfo", "Tab " + m0Var + " is not visible");
            } else {
                p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = c16892x4a36dc90.A;
                if (c1190x18d3c3fe == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                    throw null;
                }
                c1190x18d3c3fe.m8317x940d026a(A, false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
