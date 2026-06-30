package qe5;

/* loaded from: classes9.dex */
public final class o extends wm3.a implements qi3.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f443692d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f443693e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f443694f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f443695g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f443692d = jz5.h.b(new qe5.k(this));
        this.f443693e = jz5.h.b(new qe5.m(this));
        this.f443694f = jz5.h.b(new qe5.n(this));
    }

    @Override // qi3.a0
    public void L8(qi3.e0 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = event.f445230g;
        if (c16564xb55e1d5 != null) {
            if (!(c16564xb55e1d5.f231013d == U6() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c16564xb55e1d5.a(), (java.lang.String) ((jz5.n) this.f443693e).mo141623x754a37bb()))) {
                c16564xb55e1d5 = null;
            }
            if (c16564xb55e1d5 != null) {
                pm0.v.X(new qe5.l(this, event));
            }
        }
    }

    public final boolean T6(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String U1;
        if (f9Var == null || f9Var.A0() != 1 || (U1 = f9Var.U1()) == null) {
            return false;
        }
        if (!(f9Var.I0() == 0 || r26.n0.B(U1, java.lang.String.valueOf(f9Var.I0()), false))) {
            U1 = null;
        }
        if (U1 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().J0(U6(), (java.lang.String) ((jz5.n) this.f443693e).mo141623x754a37bb());
        return J0 == null || !com.p314xaae8f345.mm.vfs.w6.j(J0.f68099xfeae815) || com.p314xaae8f345.mm.vfs.w6.k(J0.f68099xfeae815) < J0.f68113xeb1a61d6;
    }

    public final long U6() {
        return ((java.lang.Number) ((jz5.n) this.f443692d).mo141623x754a37bb()).longValue();
    }

    public final em.d0 V6() {
        return (em.d0) ((jz5.n) this.f443694f).mo141623x754a37bb();
    }

    public final void W6() {
        jz5.f0 f0Var;
        if (this.f443695g) {
            Y6();
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k((java.lang.String) ((jz5.n) this.f443693e).mo141623x754a37bb(), U6());
        if (k17 != null) {
            if (k17.P0() < 2) {
                Y6();
            } else {
                X6();
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            X6();
        }
    }

    public final void X6() {
        V6().z().setVisibility(8);
        V6().y().setVisibility(8);
        android.widget.Button w17 = V6().w();
        if (w17 == null) {
            return;
        }
        w17.setVisibility(0);
    }

    public final void Y6() {
        V6().z().setVisibility(0);
        V6().y().setVisibility(0);
        android.widget.Button w17 = V6().w();
        if (w17 == null) {
            return;
        }
        w17.setVisibility(8);
    }

    public final void Z6(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String str;
        java.lang.String str2;
        v05.a aVar;
        v05.a aVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(U6(), (java.lang.String) ((jz5.n) this.f443693e).mo141623x754a37bb());
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.vkl);
        if (mo144222x4ff8c0f0 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/ui/chatting/uic/file/AppAttachUploadUIC", "initUploadingUI", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/ui/chatting/uic/file/AppAttachUploadUIC", "initUploadingUI", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.t4v);
        if (mo144222x4ff8c0f02 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mo144222x4ff8c0f02, arrayList2.toArray(), "com/tencent/mm/ui/chatting/uic/file/AppAttachUploadUIC", "initUploadingUI", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f02, "com/tencent/mm/ui/chatting/uic/file/AppAttachUploadUIC", "initUploadingUI", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = (android.widget.ImageView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.vks);
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.vkn);
        android.widget.TextView textView2 = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.vko);
        android.widget.TextView textView3 = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.vkp);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1 c22713x95c5cea1 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.vkr);
        l15.c cVar = new l15.c();
        if (f9Var == null || (str = f9Var.U1()) == null) {
            str = "";
        }
        cVar.m126728xdc93280d(str);
        v05.b k17 = cVar.k();
        if (k17 == null || (aVar2 = (v05.a) k17.m75936x14adae67(k17.f513848e + 8)) == null || (str2 = aVar2.r()) == null) {
            str2 = "";
        }
        if (((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ai(str2)) {
            if (imageView != null) {
                ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).getClass();
                imageView.setImageResource(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f81320x51ea1ca1 : com.p314xaae8f345.mm.R.raw.f81321xebcdad4b);
            }
        } else if (imageView != null) {
            i95.m c17 = i95.n0.c(pt.m0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            imageView.setImageResource(pt.m0.oa((pt.m0) c17, false, str2, false, false, 12, null));
        }
        if (textView != null) {
            java.lang.String g17 = ez.v0.f339310a.g(cVar.k());
            if (g17 == null) {
                g17 = m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f574207hf5);
            }
            textView.setText(g17);
        }
        if (textView2 != null) {
            android.content.res.Resources m158361x893a2f6f = m158361x893a2f6f();
            java.lang.Object[] objArr = new java.lang.Object[1];
            v05.b k18 = cVar.k();
            objArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0((k18 == null || (aVar = (v05.a) k18.m75936x14adae67(k18.f513848e + 8)) == null) ? 0L : aVar.m75942xfb822ef2(aVar.f449897d + 0));
            textView2.setText(m158361x893a2f6f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfc, objArr));
        }
        java.lang.Float f17 = (java.lang.Float) ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).aj().get(c16564xb55e1d5.m66995x9616526c());
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        if (c22713x95c5cea1 != null) {
            c22713x95c5cea1.m82112x7e1bd1fe(false);
        }
        if (c22713x95c5cea1 != null) {
            c22713x95c5cea1.m82113x3ae760af((int) floatValue);
        }
        if (textView3 != null) {
            textView3.setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571966mv3));
        }
        if (f9Var != null) {
            this.f443695g = te5.h.f500182a.d(f9Var) == 1;
        }
        V6().z().m82112x7e1bd1fe(true);
        V6().z().setOnClickListener(new qe5.i(f9Var));
        V6().w().setOnClickListener(new qe5.j(f9Var));
        W6();
        if (f9Var != null) {
            v05.b bVar = new v05.b();
            java.lang.String j17 = f9Var.j();
            bVar.m126728xdc93280d(j17 != null ? j17 : "");
            em.d0 V6 = V6();
            if (V6.f335733i == null) {
                V6.f335733i = (android.widget.TextView) V6.f335725a.findViewById(com.p314xaae8f345.mm.R.id.vko);
            }
            V6.f335733i.setVisibility(0);
            em.d0 V62 = V6();
            if (V62.f335733i == null) {
                V62.f335733i = (android.widget.TextView) V62.f335725a.findViewById(com.p314xaae8f345.mm.R.id.vko);
            }
            android.widget.TextView textView4 = V62.f335733i;
            android.content.res.Resources resources = m80379x76847179().getResources();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            v05.a aVar3 = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8);
            objArr2[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(aVar3 != null ? aVar3.m75942xfb822ef2(aVar3.f449897d + 0) : 0L);
            textView4.setText(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfc, objArr2));
        }
        com.p314xaae8f345.mm.ui.bk.s0(V6().w().getPaint());
        em.d0 V63 = V6();
        if (V63.f335745u == null) {
            V63.f335745u = (android.widget.TextView) V63.f335725a.findViewById(com.p314xaae8f345.mm.R.id.vkn);
        }
        android.text.TextPaint paint = V63.f335745u.getPaint();
        if (paint == null) {
            return;
        }
        paint.setFakeBoldText(true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).Zi(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).fj(this);
    }
}
