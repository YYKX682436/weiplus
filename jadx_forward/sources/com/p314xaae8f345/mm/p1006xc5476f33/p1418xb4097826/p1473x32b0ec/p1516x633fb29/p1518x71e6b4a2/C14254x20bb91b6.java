package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.p1518x71e6b4a2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/model/danmakuitem/LiveFreeFloatMsgConvert;", "Lin5/r;", "Lhk2/m;", "Landroidx/lifecycle/v;", "Lgk2/e;", "buContext", "<init>", "(Lgk2/e;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.model.danmakuitem.LiveFreeFloatMsgConvert */
/* loaded from: classes3.dex */
public final class C14254x20bb91b6 extends in5.r implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: e, reason: collision with root package name */
    public r45.be6 f193270e;

    /* renamed from: f, reason: collision with root package name */
    public in5.s0 f193271f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f193272g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f193273h;

    public C14254x20bb91b6(gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f193273h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("LiveFreeFloatMsg::Timer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new hk2.q(this), true);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dnz;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        java.lang.String obj;
        java.lang.Object obj2;
        hk2.m item = (hk2.m) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, 1)) {
                        break;
                    }
                }
            }
            if (obj2 != null) {
                p(holder, item);
                return;
            }
        }
        this.f193271f = holder;
        r45.be6 be6Var = (r45.be6) item.f363441d.m75936x14adae67(5);
        this.f193270e = be6Var;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.pxj);
        android.content.Context context = holder.f374654e;
        if (be6Var == null || (string = be6Var.m75945x2fec8307(2)) == null) {
            string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dki);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        if (textView != null && (obj = android.text.TextUtils.ellipsize(string, textView.getPaint(), i65.a.a(context, 51.5f), android.text.TextUtils.TruncateAt.END).toString()) != null) {
            string = obj;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindDscTip wording=");
        sb6.append(be6Var != null ? be6Var.m75945x2fec8307(2) : null);
        sb6.append(" finalText=");
        sb6.append(string);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFreeFloatMsgConvert", sb6.toString());
        if (textView != null) {
            textView.setText(string);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.pxh);
        if (android.text.TextUtils.isEmpty(be6Var != null ? be6Var.m75945x2fec8307(1) : null)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c22699x3dcdb352, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/danmakuitem/LiveFreeFloatMsgConvert", "bindDscTip", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/StayLiveFreeFloatMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c22699x3dcdb352, "com/tencent/mm/plugin/finder/live/model/danmakuitem/LiveFreeFloatMsgConvert", "bindDscTip", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/StayLiveFreeFloatMsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            mn2.g1 g1Var = mn2.g1.f411508a;
            yo0.i h17 = g1Var.h(mn2.f1.f411497r);
            mn2.q3 q3Var = new mn2.q3(be6Var != null ? be6Var.m75945x2fec8307(1) : null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
            vo0.d e17 = g1Var.e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
            e17.c(q3Var, c22699x3dcdb352, h17);
        }
        n(holder, this.f193270e);
        p(holder, item);
        o();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf == null || (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFreeFloatMsgConvert", "registerLifecycleListener");
        mo273xed6858b4.c(this);
        mo273xed6858b4.a(this);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.pxj);
        d92.f fVar = d92.f.f309003a;
        if (textView != null) {
            fVar.l(textView, 17.0f, false);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.pxi);
        if (textView2 != null) {
            fVar.l(textView2, 17.0f, false);
        }
    }

    public final void n(in5.s0 s0Var, r45.be6 be6Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = s0Var != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.pud) : null;
        android.widget.TextView textView = s0Var != null ? (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.pxi) : null;
        int a17 = be6Var != null ? zl2.s4.a(be6Var) : 0;
        if (a17 > 0) {
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
            }
            java.lang.String a18 = no0.l.a(no0.m.f420263a, a17, ":", false, false, false, 24, null);
            if (textView == null) {
                return;
            }
            textView.setText(a18);
            return;
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(8);
        }
        if (textView != null) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573098m36);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFreeFloatMsgConvert", "bindCountDownTip stopTimer");
        this.f193272g = false;
        this.f193273h.d();
    }

    public final void o() {
        r45.be6 be6Var = this.f193270e;
        int a17 = be6Var != null ? zl2.s4.a(be6Var) : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFreeFloatMsgConvert", "startCountdownTimer startedTimer=" + this.f193272g + " countDown=" + a17);
        if (this.f193272g || a17 <= 0) {
            return;
        }
        this.f193272g = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f193273h;
        b4Var.d();
        b4Var.c(1000L, 1000L);
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int i17 = hk2.o.f363444a[event.ordinal()];
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFreeFloatMsgConvert", "ON_RESUME");
            o();
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFreeFloatMsgConvert", "ON_PAUSE");
            this.f193272g = false;
            this.f193273h.d();
        } else {
            if (i17 != 3) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFreeFloatMsgConvert", "ON_DESTROY");
            in5.s0 s0Var = this.f193271f;
            java.lang.Object obj = s0Var != null ? s0Var.f374654e : null;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = obj instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) obj : null;
            if (abstractActivityC21394xb3d2c0cf == null || (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFreeFloatMsgConvert", "unRegisterLifecycleListener");
            mo273xed6858b4.c(this);
        }
    }

    public final void p(in5.s0 s0Var, hk2.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFreeFloatMsgConvert", "updateSelectStatus isSelected=" + mVar.f363442e);
        s0Var.p(com.p314xaae8f345.mm.R.id.f566336q42).setBackgroundResource(mVar.f363442e ? com.p314xaae8f345.mm.R.C30861xcebc809e.cgf : com.p314xaae8f345.mm.R.C30861xcebc809e.c49);
    }
}
