package p10;

/* loaded from: classes8.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 f432502d;

    public m(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3) {
        this.f432502d = c10541x905158a3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/nirvana/ui/MagicDebugPanelView$createToggleButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3 = this.f432502d;
        boolean z17 = !c10541x905158a3.f147363w;
        c10541x905158a3.f147363w = z17;
        if (z17) {
            android.widget.LinearLayout linearLayout = c10541x905158a3.f147366z;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("expandedContentLayout");
                throw null;
            }
            linearLayout.setVisibility(0);
            android.widget.TextView textView = c10541x905158a3.f147364x;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("toggleButton");
                throw null;
            }
            textView.setText("▼");
        } else {
            android.widget.LinearLayout linearLayout2 = c10541x905158a3.f147366z;
            if (linearLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("expandedContentLayout");
                throw null;
            }
            linearLayout2.setVisibility(8);
            android.widget.TextView textView2 = c10541x905158a3.f147364x;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("toggleButton");
                throw null;
            }
            textView2.setText("▶");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicDebugPanelView", "toggleExpanded: isExpanded=" + c10541x905158a3.f147363w);
        c10541x905158a3.post(new p10.w(c10541x905158a3));
        yj0.a.h(this, "com/tencent/mm/feature/ecs/nirvana/ui/MagicDebugPanelView$createToggleButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
