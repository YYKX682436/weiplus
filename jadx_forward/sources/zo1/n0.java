package zo1;

/* loaded from: classes5.dex */
public final /* synthetic */ class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.a {
    public n0(java.lang.Object obj) {
        super(0, obj, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f.class, "updateHintView", "updateHintView()V", 0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f) this.f72685xcfcbe9ef;
        zo1.w wVar = activityC12867x6b26c82f.f174340p;
        if (wVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("conversationAdapter");
            throw null;
        }
        if (wVar.f556339f == 0) {
            android.widget.TextView textView = activityC12867x6b26c82f.f174338n;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deleteHintTv");
                throw null;
            }
            textView.setVisibility(8);
            android.widget.Button button = activityC12867x6b26c82f.f174339o;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deleteBtn");
                throw null;
            }
            button.setEnabled(false);
        } else {
            android.widget.TextView textView2 = activityC12867x6b26c82f.f174338n;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deleteHintTv");
                throw null;
            }
            textView2.setVisibility(0);
            java.util.Iterator it = activityC12867x6b26c82f.f174345u.iterator();
            long j17 = 0;
            while (it.hasNext()) {
                zo1.s sVar = (zo1.s) it.next();
                j17 += sVar.f556295c ? sVar.f556294b : 0L;
            }
            java.lang.String f07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f07, "getSizeKB(...)");
            android.widget.TextView textView3 = activityC12867x6b26c82f.f174338n;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deleteHintTv");
                throw null;
            }
            textView3.setText(activityC12867x6b26c82f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvi, f07));
            android.widget.Button button2 = activityC12867x6b26c82f.f174339o;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deleteBtn");
                throw null;
            }
            button2.setEnabled(true);
        }
        zo1.w wVar2 = activityC12867x6b26c82f.f174340p;
        if (wVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("conversationAdapter");
            throw null;
        }
        if (wVar2.x()) {
            android.widget.TextView textView4 = activityC12867x6b26c82f.f174337m;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectAllTv");
                throw null;
            }
            textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a76);
        } else {
            android.widget.TextView textView5 = activityC12867x6b26c82f.f174337m;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectAllTv");
                throw null;
            }
            textView5.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572214a75);
        }
        return jz5.f0.f384359a;
    }
}
